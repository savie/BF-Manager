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

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Log f382 = LogFactory.m302(UploadPartTask.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final UploadTask.UploadPartTaskMetadata f383;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f384;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final UploadPartTaskProgressListener f385;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UploadPartRequest f386;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f387;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f383 = uploadPartTaskMetadata;
        this.f385 = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f386 = uploadPartRequest;
        this.f387 = amazonS3;
        this.f384 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        TransferDBUtil transferDBUtil = this.f384;
        Log log = f382;
        TransferState transferState = TransferState.IN_PROGRESS;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f383;
        uploadPartTaskMetadata.f401 = transferState;
        UploadPartRequest uploadPartRequest = this.f386;
        UploadPartTaskProgressListener uploadPartTaskProgressListener = this.f385;
        uploadPartRequest.mo159(uploadPartTaskProgressListener);
        int i = 1;
        while (true) {
            try {
                UploadPartResult uploadPartResultMo438 = this.f387.mo438(uploadPartRequest);
                TransferState transferState2 = TransferState.PART_COMPLETED;
                uploadPartTaskMetadata.f401 = transferState2;
                int iM690 = uploadPartRequest.m690();
                transferDBUtil.getClass();
                TransferDBUtil.m361(iM690, transferState2);
                int iM691 = uploadPartRequest.m690();
                String strM692 = uploadPartResultMo438.m692();
                transferDBUtil.getClass();
                TransferDBUtil.m371(iM691, strM692);
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                log.mo298("Upload part aborted.");
                ProgressEvent progressEvent = new ProgressEvent(0L);
                progressEvent.m227(32);
                uploadPartTaskProgressListener.mo229(progressEvent);
                return Boolean.FALSE;
            } catch (Exception e) {
                log.mo292("Unexpected error occurred: " + e);
                ProgressEvent progressEvent2 = new ProgressEvent(0L);
                progressEvent2.m227(32);
                uploadPartTaskProgressListener.mo229(progressEvent2);
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo296("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        TransferState transferState3 = TransferState.WAITING_FOR_NETWORK;
                        uploadPartTaskMetadata.f401 = transferState3;
                        int iM692 = uploadPartRequest.m690();
                        transferDBUtil.getClass();
                        TransferDBUtil.m361(iM692, transferState3);
                        log.mo296("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    log.mo292("TransferUtilityException: [" + e2 + "]");
                }
                if (i >= 3) {
                    TransferState transferState4 = TransferState.FAILED;
                    uploadPartTaskMetadata.f401 = transferState4;
                    int iM693 = uploadPartRequest.m690();
                    transferDBUtil.getClass();
                    TransferDBUtil.m361(iM693, transferState4);
                    log.mo299("Encountered error uploading part ", e);
                    throw e;
                }
                long jRandom = (((long) (1 << i)) * 1000) + ((long) (Math.random() * 1000.0d));
                log.mo296("Retrying in " + jRandom + " ms.");
                TimeUnit.MILLISECONDS.sleep(jRandom);
                log.mo293("Retry attempt: " + i, e);
                i++;
            }
        }
    }

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public long f388;

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public final UploadTask.UploadTaskProgressListener f389;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f389 = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ۙ */
        public final void mo229(ProgressEvent progressEvent) {
            if (32 == progressEvent.m228()) {
                UploadPartTask.f382.mo298("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f388 = 0L;
            } else {
                this.f388 = progressEvent.m226() + this.f388;
            }
            this.f389.m413(UploadPartTask.this.f386.m682(), this.f388);
        }
    }
}
