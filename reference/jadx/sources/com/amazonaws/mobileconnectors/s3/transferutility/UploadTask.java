package com.amazonaws.mobileconnectors.s3.transferutility;

import com.alipay.sdk.m.w.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class UploadTask implements Callable {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Log f381 = LogFactory.m296(UploadTask.class);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final HashMap f382 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f383;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f385 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TransferRecord f386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TransferStatusUpdater f388;

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public long f389;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public Future f390;

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public TransferState f391;
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f382.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f386 = transferRecord;
        this.f384 = amazonS3;
        this.f383 = transferDBUtil;
        this.f388 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map;
        AmazonS3 amazonS3;
        TransferRecord transferRecord = this.f386;
        TransferStatusUpdater transferStatusUpdater = this.f388;
        Log log = f381;
        try {
            TransferNetworkLossHandler.m375();
            if (!TransferNetworkLossHandler.m375().m376()) {
                log.mo288("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                transferStatusUpdater.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo285("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m389(transferRecord.f322, TransferState.IN_PROGRESS);
        int i = transferRecord.f318;
        long j = 0;
        AmazonS3 amazonS4 = this.f384;
        if (i != 1 || transferRecord.f310 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestM404 = m404(transferRecord);
            ProgressListener progressListenerM393 = transferStatusUpdater.m393(transferRecord.f322);
            long length = putObjectRequestM404.m492().length();
            TransferUtility.m399(putObjectRequestM404);
            putObjectRequestM404.mo153(progressListenerM393);
            try {
                amazonS4.mo430(putObjectRequestM404);
                this.f388.m388(transferRecord.f322, length, length, true);
                transferStatusUpdater.m389(transferRecord.f322, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f296)) {
                    int i2 = transferRecord.f322;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.m389(i2, transferState);
                    log.mo288("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f296)) {
                    int i3 = transferRecord.f322;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater.m389(i3, transferState2);
                    log.mo288("Transfer is " + transferState2);
                    new ProgressEvent(0L).m221(32);
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerM393).mo223(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.m375();
                    if (!TransferNetworkLossHandler.m375().m376()) {
                        log.mo288("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        transferStatusUpdater.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                        log.mo291("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).m221(32);
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerM393).mo223(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    log.mo285("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.m427(e2)) {
                    log.mo288("Transfer is interrupted. " + e2);
                    transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                log.mo291("Failed to upload: " + transferRecord.f322 + " due to " + e2.getMessage());
                transferStatusUpdater.m390(transferRecord.f322, e2);
                transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f300;
        TransferDBUtil transferDBUtil = this.f383;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestM405 = m404(transferRecord);
            TransferUtility.m398(putObjectRequestM405);
            try {
                String strM405 = m405(putObjectRequestM405);
                transferRecord.f300 = strM405;
                int i4 = transferRecord.f322;
                transferDBUtil.getClass();
                TransferDBUtil.m361(i4, strM405);
            } catch (AmazonClientException e4) {
                log.mo292("Error initiating multipart upload: " + transferRecord.f322 + " due to " + e4.getMessage(), e4);
                transferStatusUpdater.m390(transferRecord.f322, e4);
                transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            int i5 = transferRecord.f322;
            transferDBUtil.getClass();
            long jM363 = TransferDBUtil.m363(i5);
            if (jM363 > 0) {
                log.mo288(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f322), Long.valueOf(jM363)));
            }
            j = jM363;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(j);
        this.f388.m388(transferRecord.f322, j, transferRecord.f306, false);
        int i6 = transferRecord.f322;
        String str2 = transferRecord.f300;
        transferDBUtil.getClass();
        this.f387 = TransferDBUtil.m357(i6, str2);
        log.mo288("Multipart upload " + transferRecord.f322 + " in " + this.f387.size() + " parts.");
        Iterator it = this.f387.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f385;
            if (!zHasNext) {
                break;
            }
            UploadPartRequest uploadPartRequest = (UploadPartRequest) it.next();
            TransferUtility.m398(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.f389 = 0L;
            uploadPartTaskMetadata.f391 = TransferState.WAITING;
            map.put(Integer.valueOf(uploadPartRequest.m679()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.f390 = TransferThreadPool.m395(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, amazonS4, this.f383));
            it = it;
        }
        try {
            Iterator it2 = map.values().iterator();
            boolean zBooleanValue = true;
            while (it2.hasNext()) {
                zBooleanValue &= ((Boolean) ((UploadPartTaskMetadata) it2.next()).f390.get()).booleanValue();
            }
            if (!zBooleanValue) {
                try {
                    TransferNetworkLossHandler.m375();
                    if (!TransferNetworkLossHandler.m375().m376()) {
                        log.mo288("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        transferStatusUpdater.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e5) {
                    log.mo285("TransferUtilityException: [" + e5 + "]");
                }
            }
            log.mo288("Completing the multi-part upload transfer for " + transferRecord.f322);
            try {
                CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(transferRecord.f301, transferRecord.f308, transferRecord.f300, TransferDBUtil.m362(transferRecord.f322));
                TransferUtility.m398(completeMultipartUploadRequest);
                amazonS3 = amazonS4;
                try {
                    amazonS3.mo428(completeMultipartUploadRequest);
                    TransferStatusUpdater transferStatusUpdater2 = this.f388;
                    int i7 = transferRecord.f322;
                    long j2 = transferRecord.f306;
                    transferStatusUpdater2.m388(i7, j2, j2, true);
                    transferStatusUpdater.m389(transferRecord.f322, TransferState.COMPLETED);
                    return Boolean.TRUE;
                } catch (AmazonClientException e6) {
                    e = e6;
                    AmazonClientException amazonClientException = e;
                    log.mo292("Failed to complete multipart: " + transferRecord.f322 + " due to " + amazonClientException.getMessage(), amazonClientException);
                    int i8 = transferRecord.f322;
                    String str3 = transferRecord.f301;
                    String str4 = transferRecord.f308;
                    String str5 = transferRecord.f300;
                    log.mo288("Aborting the multipart since complete multipart failed.");
                    try {
                        amazonS3.mo433(new AbortMultipartUploadRequest(str3, str4, str5));
                        log.mo291("Successfully aborted multipart upload: " + i8);
                    } catch (AmazonClientException e7) {
                        log.mo286("Failed to abort the multipart upload: " + i8, e7);
                    }
                    transferStatusUpdater.m390(transferRecord.f322, amazonClientException);
                    transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            } catch (AmazonClientException e8) {
                e = e8;
                amazonS3 = amazonS4;
            }
        } catch (Exception e9) {
            log.mo285("Upload resulted in an exception. " + e9);
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                ((UploadPartTaskMetadata) it3.next()).f390.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(transferRecord.f296)) {
                int i9 = transferRecord.f322;
                TransferState transferState3 = TransferState.CANCELED;
                transferStatusUpdater.m389(i9, transferState3);
                log.mo288("Transfer is " + transferState3);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(transferRecord.f296)) {
                int i10 = transferRecord.f322;
                TransferState transferState4 = TransferState.PAUSED;
                transferStatusUpdater.m389(i10, transferState4);
                log.mo288("Transfer is " + transferState4);
                return Boolean.FALSE;
            }
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : map.values()) {
                TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                if (transferState5.equals(uploadPartTaskMetadata2.f391)) {
                    log.mo288("Individual part is WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m389(transferRecord.f322, transferState5);
                    return Boolean.FALSE;
                }
            }
            try {
                TransferNetworkLossHandler.m375();
                if (!TransferNetworkLossHandler.m375().m376()) {
                    log.mo288("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e10) {
                log.mo285("TransferUtilityException: [" + e10 + "]");
            }
            if (RetryUtils.m427(e9)) {
                log.mo288("Transfer is interrupted. " + e9);
                transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.mo292("Error encountered during multi-part upload: " + transferRecord.f322 + " due to " + e9.getMessage(), e9);
            transferStatusUpdater.m390(transferRecord.f322, e9);
            transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m405(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.m501(), putObjectRequest.m499());
        initiateMultipartUploadRequest.m575(putObjectRequest.m506());
        initiateMultipartUploadRequest.f601 = putObjectRequest.m491();
        initiateMultipartUploadRequest.m577(putObjectRequest.m513());
        initiateMultipartUploadRequest.m576(putObjectRequest.m505());
        TransferUtility.m398(initiateMultipartUploadRequest);
        return this.f384.mo429(initiateMultipartUploadRequest).m583();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PutObjectRequest m404(TransferRecord transferRecord) {
        File file = new File(transferRecord.f311);
        PutObjectRequest putObjectRequest = new PutObjectRequest(file, transferRecord.f301, transferRecord.f308);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.m612(file.length());
        String str = transferRecord.f298;
        if (str != null) {
            objectMetadata.m614(str);
        }
        String str2 = transferRecord.f307;
        if (str2 != null) {
            objectMetadata.m625(str2);
        }
        String str3 = transferRecord.f324;
        if (str3 != null) {
            objectMetadata.m623(str3);
        }
        String str4 = transferRecord.f313;
        if (str4 != null) {
            objectMetadata.m609(str4);
        } else {
            objectMetadata.m609(Mimetypes.m723().m724(file));
        }
        String str5 = transferRecord.f314;
        if (str5 != null) {
            putObjectRequest.m511(str5);
        }
        if (transferRecord.f312 != null) {
            objectMetadata.m620(new Date(Long.valueOf(transferRecord.f312).longValue()));
        }
        String str6 = transferRecord.f319;
        if (str6 != null) {
            objectMetadata.mo479(str6);
        }
        Map map = transferRecord.f297;
        if (map != null) {
            objectMetadata.m616(map);
            String str7 = (String) transferRecord.f297.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split(a.p);
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.m496(new ObjectTagging(arrayList));
                } catch (Exception e) {
                    f381.mo292("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = (String) transferRecord.f297.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.m498(str9);
            }
            String str10 = (String) transferRecord.f297.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.m642("requester".equals(str10));
            }
        }
        String str11 = transferRecord.f323;
        if (str11 != null) {
            objectMetadata.m618(str11);
        }
        String str12 = transferRecord.f315;
        if (str12 != null) {
            putObjectRequest.m497(new SSEAwsKeyManagementParams(str12));
        }
        putObjectRequest.m495(objectMetadata);
        String str13 = transferRecord.f321;
        putObjectRequest.m494(str13 == null ? null : (CannedAccessControlList) f382.get(str13));
        return putObjectRequest;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final long f392;

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public long f394;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final synchronized void m407(int i, long j) {
            UploadPartTaskMetadata uploadPartTaskMetadata = (UploadPartTaskMetadata) UploadTask.this.f385.get(Integer.valueOf(i));
            if (uploadPartTaskMetadata == null) {
                UploadTask.f381.mo288("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.f389 = j;
            long j2 = this.f392;
            Iterator it = UploadTask.this.f385.entrySet().iterator();
            while (it.hasNext()) {
                j2 += ((UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f389;
            }
            if (j2 > this.f394 && j2 <= UploadTask.this.f386.f306) {
                UploadTask.this.f388.m388(UploadTask.this.f386.f322, j2, UploadTask.this.f386.f306, true);
                this.f394 = j2;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ۙ */
        public final void mo223(ProgressEvent progressEvent) {
        }

        public UploadTaskProgressListener(long j) {
            this.f394 = j;
            this.f392 = j;
        }
    }
}
