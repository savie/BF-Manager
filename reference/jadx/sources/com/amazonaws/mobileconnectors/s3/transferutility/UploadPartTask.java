package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartTask implements Callable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Log f372 = LogFactory.m296(UploadPartTask.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f373;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UploadPartRequest f374;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UploadPartTaskProgressListener f375;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f376;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final UploadTask.UploadPartTaskMetadata f377;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f377 = uploadPartTaskMetadata;
        this.f375 = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f374 = uploadPartRequest;
        this.f376 = amazonS3;
        this.f373 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        TransferDBUtil transferDBUtil = this.f373;
        Log log = f372;
        TransferState transferState = TransferState.IN_PROGRESS;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f377;
        uploadPartTaskMetadata.f391 = transferState;
        UploadPartRequest uploadPartRequest = this.f374;
        UploadPartTaskProgressListener uploadPartTaskProgressListener = this.f375;
        uploadPartRequest.mo153(uploadPartTaskProgressListener);
        int i = 1;
        while (true) {
            try {
                UploadPartResult uploadPartResultMo432 = this.f376.mo432(uploadPartRequest);
                TransferState transferState2 = TransferState.PART_COMPLETED;
                uploadPartTaskMetadata.f391 = transferState2;
                int iM680 = uploadPartRequest.m680();
                transferDBUtil.getClass();
                TransferDBUtil.m354(iM680, transferState2);
                int iM681 = uploadPartRequest.m680();
                String strM689 = uploadPartResultMo432.m689();
                transferDBUtil.getClass();
                TransferDBUtil.m365(iM681, strM689);
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                log.mo291("Upload part aborted.");
                ProgressEvent progressEvent = new ProgressEvent(0L);
                progressEvent.m221(32);
                uploadPartTaskProgressListener.mo223(progressEvent);
                return Boolean.FALSE;
            } catch (Exception e) {
                log.mo285("Unexpected error occurred: " + e);
                ProgressEvent progressEvent2 = new ProgressEvent(0L);
                progressEvent2.m221(32);
                uploadPartTaskProgressListener.mo223(progressEvent2);
                try {
                    TransferNetworkLossHandler.m375();
                    if (!TransferNetworkLossHandler.m375().m376()) {
                        log.mo288("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        TransferState transferState3 = TransferState.WAITING_FOR_NETWORK;
                        uploadPartTaskMetadata.f391 = transferState3;
                        int iM682 = uploadPartRequest.m680();
                        transferDBUtil.getClass();
                        TransferDBUtil.m354(iM682, transferState3);
                        log.mo288("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    log.mo285("TransferUtilityException: [" + e2 + "]");
                }
                if (i >= 3) {
                    TransferState transferState4 = TransferState.FAILED;
                    uploadPartTaskMetadata.f391 = transferState4;
                    int iM683 = uploadPartRequest.m680();
                    transferDBUtil.getClass();
                    TransferDBUtil.m354(iM683, transferState4);
                    log.mo292("Encountered error uploading part ", e);
                    throw e;
                }
                long jRandom = (((long) (1 << i)) * 1000) + ((long) (Math.random() * 1000.0d));
                log.mo288("Retrying in " + jRandom + " ms.");
                TimeUnit.MILLISECONDS.sleep(jRandom);
                log.mo286("Retry attempt: " + i, e);
                i++;
            }
        }
    }

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public long f378;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final UploadTask.UploadTaskProgressListener f379;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f379 = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ۙ */
        public final void mo223(ProgressEvent progressEvent) {
            if (32 == progressEvent.m222()) {
                UploadPartTask.f372.mo291("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f378 = 0L;
            } else {
                this.f378 = progressEvent.m220() + this.f378;
            }
            this.f379.m407(UploadPartTask.this.f374.m679(), this.f378);
        }
    }
}
