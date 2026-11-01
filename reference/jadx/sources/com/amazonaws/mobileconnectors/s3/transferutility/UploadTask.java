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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TransferStatusUpdater f393;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f394;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TransferRecord f395;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f396;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f397;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f398 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Log f392 = LogFactory.m302(UploadTask.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final HashMap f391 = new HashMap();

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public long f399;

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public Future f400;

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public TransferState f401;
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f391.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f395 = transferRecord;
        this.f396 = amazonS3;
        this.f394 = transferDBUtil;
        this.f393 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map;
        AmazonS3 amazonS3;
        TransferRecord transferRecord = this.f395;
        TransferStatusUpdater transferStatusUpdater = this.f393;
        Log log = f392;
        try {
            TransferNetworkLossHandler.m381();
            if (!TransferNetworkLossHandler.m381().m382()) {
                log.mo296("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo292("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m395(transferRecord.f328, TransferState.IN_PROGRESS);
        int i = transferRecord.f329;
        long j = 0;
        AmazonS3 amazonS4 = this.f396;
        if (i != 1 || transferRecord.f324 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestM410 = m410(transferRecord);
            ProgressListener progressListenerM399 = transferStatusUpdater.m399(transferRecord.f328);
            long length = putObjectRequestM410.m516().length();
            TransferUtility.m405(putObjectRequestM410);
            putObjectRequestM410.mo159(progressListenerM399);
            try {
                amazonS4.mo436(putObjectRequestM410);
                this.f393.m394(transferRecord.f328, length, length, true);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f325)) {
                    int i2 = transferRecord.f328;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.m395(i2, transferState);
                    log.mo296("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f325)) {
                    int i3 = transferRecord.f328;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater.m395(i3, transferState2);
                    log.mo296("Transfer is " + transferState2);
                    new ProgressEvent(0L).m227(32);
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerM399).mo229(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo296("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                        log.mo298("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).m227(32);
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerM399).mo229(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    log.mo292("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.m433(e2)) {
                    log.mo296("Transfer is interrupted. " + e2);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                log.mo298("Failed to upload: " + transferRecord.f328 + " due to " + e2.getMessage());
                transferStatusUpdater.m396(transferRecord.f328, e2);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f331;
        TransferDBUtil transferDBUtil = this.f394;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestM411 = m410(transferRecord);
            TransferUtility.m404(putObjectRequestM411);
            try {
                String strM411 = m411(putObjectRequestM411);
                transferRecord.f331 = strM411;
                int i4 = transferRecord.f328;
                transferDBUtil.getClass();
                TransferDBUtil.m369(i4, strM411);
            } catch (AmazonClientException e4) {
                log.mo299("Error initiating multipart upload: " + transferRecord.f328 + " due to " + e4.getMessage(), e4);
                transferStatusUpdater.m396(transferRecord.f328, e4);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            int i5 = transferRecord.f328;
            transferDBUtil.getClass();
            long jM367 = TransferDBUtil.m367(i5);
            if (jM367 > 0) {
                log.mo296(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f328), Long.valueOf(jM367)));
            }
            j = jM367;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(j);
        this.f393.m394(transferRecord.f328, j, transferRecord.f319, false);
        int i6 = transferRecord.f328;
        String str2 = transferRecord.f331;
        transferDBUtil.getClass();
        this.f397 = TransferDBUtil.m364(i6, str2);
        log.mo296("Multipart upload " + transferRecord.f328 + " in " + this.f397.size() + " parts.");
        Iterator it = this.f397.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f398;
            if (!zHasNext) {
                break;
            }
            UploadPartRequest uploadPartRequest = (UploadPartRequest) it.next();
            TransferUtility.m404(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.f399 = 0L;
            uploadPartTaskMetadata.f401 = TransferState.WAITING;
            map.put(Integer.valueOf(uploadPartRequest.m682()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.f400 = TransferThreadPool.m401(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, amazonS4, this.f394));
            it = it;
        }
        try {
            Iterator it2 = map.values().iterator();
            boolean zBooleanValue = true;
            while (it2.hasNext()) {
                zBooleanValue &= ((Boolean) ((UploadPartTaskMetadata) it2.next()).f400.get()).booleanValue();
            }
            if (!zBooleanValue) {
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo296("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e5) {
                    log.mo292("TransferUtilityException: [" + e5 + "]");
                }
            }
            log.mo296("Completing the multi-part upload transfer for " + transferRecord.f328);
            try {
                CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(transferRecord.f310, transferRecord.f316, transferRecord.f331, TransferDBUtil.m372(transferRecord.f328));
                TransferUtility.m404(completeMultipartUploadRequest);
                amazonS3 = amazonS4;
                try {
                    amazonS3.mo434(completeMultipartUploadRequest);
                    TransferStatusUpdater transferStatusUpdater2 = this.f393;
                    int i7 = transferRecord.f328;
                    long j2 = transferRecord.f319;
                    transferStatusUpdater2.m394(i7, j2, j2, true);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.COMPLETED);
                    return Boolean.TRUE;
                } catch (AmazonClientException e6) {
                    e = e6;
                    AmazonClientException amazonClientException = e;
                    log.mo299("Failed to complete multipart: " + transferRecord.f328 + " due to " + amazonClientException.getMessage(), amazonClientException);
                    int i8 = transferRecord.f328;
                    String str3 = transferRecord.f310;
                    String str4 = transferRecord.f316;
                    String str5 = transferRecord.f331;
                    log.mo296("Aborting the multipart since complete multipart failed.");
                    try {
                        amazonS3.mo439(new AbortMultipartUploadRequest(str3, str4, str5));
                        log.mo298("Successfully aborted multipart upload: " + i8);
                    } catch (AmazonClientException e7) {
                        log.mo293("Failed to abort the multipart upload: " + i8, e7);
                    }
                    transferStatusUpdater.m396(transferRecord.f328, amazonClientException);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            } catch (AmazonClientException e8) {
                e = e8;
                amazonS3 = amazonS4;
            }
        } catch (Exception e9) {
            log.mo292("Upload resulted in an exception. " + e9);
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                ((UploadPartTaskMetadata) it3.next()).f400.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(transferRecord.f325)) {
                int i9 = transferRecord.f328;
                TransferState transferState3 = TransferState.CANCELED;
                transferStatusUpdater.m395(i9, transferState3);
                log.mo296("Transfer is " + transferState3);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(transferRecord.f325)) {
                int i10 = transferRecord.f328;
                TransferState transferState4 = TransferState.PAUSED;
                transferStatusUpdater.m395(i10, transferState4);
                log.mo296("Transfer is " + transferState4);
                return Boolean.FALSE;
            }
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : map.values()) {
                TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                if (transferState5.equals(uploadPartTaskMetadata2.f401)) {
                    log.mo296("Individual part is WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m395(transferRecord.f328, transferState5);
                    return Boolean.FALSE;
                }
            }
            try {
                TransferNetworkLossHandler.m381();
                if (!TransferNetworkLossHandler.m381().m382()) {
                    log.mo296("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e10) {
                log.mo292("TransferUtilityException: [" + e10 + "]");
            }
            if (RetryUtils.m433(e9)) {
                log.mo296("Transfer is interrupted. " + e9);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.mo299("Error encountered during multi-part upload: " + transferRecord.f328 + " due to " + e9.getMessage(), e9);
            transferStatusUpdater.m396(transferRecord.f328, e9);
            transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m411(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.m498(), putObjectRequest.m509());
        initiateMultipartUploadRequest.m582(putObjectRequest.m506());
        initiateMultipartUploadRequest.f611 = putObjectRequest.m499();
        initiateMultipartUploadRequest.m584(putObjectRequest.m519());
        initiateMultipartUploadRequest.m583(putObjectRequest.m517());
        TransferUtility.m404(initiateMultipartUploadRequest);
        return this.f396.mo435(initiateMultipartUploadRequest).m588();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PutObjectRequest m410(TransferRecord transferRecord) {
        File file = new File(transferRecord.f333);
        PutObjectRequest putObjectRequest = new PutObjectRequest(file, transferRecord.f310, transferRecord.f316);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.m619(file.length());
        String str = transferRecord.f309;
        if (str != null) {
            objectMetadata.m621(str);
        }
        String str2 = transferRecord.f313;
        if (str2 != null) {
            objectMetadata.m637(str2);
        }
        String str3 = transferRecord.f334;
        if (str3 != null) {
            objectMetadata.m614(str3);
        }
        String str4 = transferRecord.f323;
        if (str4 != null) {
            objectMetadata.m617(str4);
        } else {
            objectMetadata.m617(Mimetypes.m729().m730(file));
        }
        String str5 = transferRecord.f332;
        if (str5 != null) {
            putObjectRequest.m514(str5);
        }
        if (transferRecord.f327 != null) {
            objectMetadata.m629(new Date(Long.valueOf(transferRecord.f327).longValue()));
        }
        String str6 = transferRecord.f330;
        if (str6 != null) {
            objectMetadata.mo480(str6);
        }
        Map map = transferRecord.f318;
        if (map != null) {
            objectMetadata.m623(map);
            String str7 = (String) transferRecord.f318.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split(a.p);
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.m503(new ObjectTagging(arrayList));
                } catch (Exception e) {
                    f392.mo299("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = (String) transferRecord.f318.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.m505(str9);
            }
            String str10 = (String) transferRecord.f318.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.m648("requester".equals(str10));
            }
        }
        String str11 = transferRecord.f314;
        if (str11 != null) {
            objectMetadata.m631(str11);
        }
        String str12 = transferRecord.f306;
        if (str12 != null) {
            putObjectRequest.m504(new SSEAwsKeyManagementParams(str12));
        }
        putObjectRequest.m502(objectMetadata);
        String str13 = transferRecord.f308;
        putObjectRequest.m501(str13 == null ? null : (CannedAccessControlList) f391.get(str13));
        return putObjectRequest;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final long f402;

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public long f404;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final synchronized void m413(int i, long j) {
            UploadPartTaskMetadata uploadPartTaskMetadata = (UploadPartTaskMetadata) UploadTask.this.f398.get(Integer.valueOf(i));
            if (uploadPartTaskMetadata == null) {
                UploadTask.f392.mo296("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.f399 = j;
            long j2 = this.f402;
            Iterator it = UploadTask.this.f398.entrySet().iterator();
            while (it.hasNext()) {
                j2 += ((UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f399;
            }
            if (j2 > this.f404 && j2 <= UploadTask.this.f395.f319) {
                UploadTask.this.f393.m394(UploadTask.this.f395.f328, j2, UploadTask.this.f395.f319, true);
                this.f404 = j2;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ۙ */
        public final void mo229(ProgressEvent progressEvent) {
        }

        public UploadTaskProgressListener(long j) {
            this.f404 = j;
            this.f402 = j;
        }
    }
}
