package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class DownloadTask implements Callable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f267 = LogFactory.m296(DownloadTask.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransferRecord f268;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TransferStatusUpdater f269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f270;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f268 = transferRecord;
        this.f270 = amazonS3;
        this.f269 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Log log = f267;
        TransferStatusUpdater transferStatusUpdater = this.f269;
        TransferRecord transferRecord = this.f268;
        try {
            TransferNetworkLossHandler.m375();
            if (!TransferNetworkLossHandler.m375().m376()) {
                log.mo288("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                transferStatusUpdater.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo285("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m389(transferRecord.f322, TransferState.IN_PROGRESS);
        ProgressListener progressListenerM393 = transferStatusUpdater.m393(transferRecord.f322);
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f301, transferRecord.f308);
            TransferUtility.m399(getObjectRequest);
            File file = new File(transferRecord.f311);
            long length = file.length();
            if (length > 0) {
                try {
                    log.mo291(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f322), Long.valueOf(length)));
                    getObjectRequest.m563(length, -1L);
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    if (TransferState.PENDING_CANCEL.equals(transferRecord.f296)) {
                        int i = transferRecord.f322;
                        TransferState transferState = TransferState.CANCELED;
                        transferStatusUpdater.m389(i, transferState);
                        log.mo288("Transfer is " + transferState);
                        return Boolean.FALSE;
                    }
                    if (TransferState.PENDING_PAUSE.equals(transferRecord.f296)) {
                        int i2 = transferRecord.f322;
                        TransferState transferState2 = TransferState.PAUSED;
                        transferStatusUpdater.m389(i2, transferState2);
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
                    if (RetryUtils.m427(exc)) {
                        log.mo288("Transfer is interrupted. " + exc);
                        transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                    log.mo291("Failed to download: " + transferRecord.f322 + " due to " + exc.getMessage());
                    transferStatusUpdater.m390(transferRecord.f322, exc);
                    transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            }
            getObjectRequest.mo153(progressListenerM393);
            S3Object s3ObjectMo431 = this.f270.mo431(getObjectRequest);
            if (s3ObjectMo431 == null) {
                transferStatusUpdater.m390(transferRecord.f322, new IllegalStateException("AmazonS3.getObject returns null"));
                transferStatusUpdater.m389(transferRecord.f322, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long jM608 = s3ObjectMo431.m647().m608();
            this.f269.m388(transferRecord.f322, length, jM608, true);
            m346(s3ObjectMo431.m644(), file);
            this.f269.m388(transferRecord.f322, jM608, jM608, true);
            transferStatusUpdater.m389(transferRecord.f322, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m346(S3ObjectInputStream s3ObjectInputStream, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Log log = f267;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = s3ObjectInputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                log.mo289("got exception", e);
                            }
                        }
                    }
                    bufferedOutputStream.close();
                    try {
                        s3ObjectInputStream.close();
                    } catch (IOException e2) {
                        log.mo289("got exception", e2);
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
                    log.mo285(str);
                    throw new AmazonClientException(str, e);
                } catch (IOException e4) {
                    e = e4;
                    throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            log.mo289("got exception", e5);
                        }
                    }
                    if (s3ObjectInputStream != null) {
                        try {
                            s3ObjectInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            log.mo289("got exception", e6);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        }
    }
}
