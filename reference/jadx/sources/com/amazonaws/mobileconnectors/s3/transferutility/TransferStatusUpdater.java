package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.C4681;
import l.ConcurrentMapC17249;

/* JADX INFO: loaded from: classes.dex */
public class TransferStatusUpdater {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static TransferStatusUpdater f347;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static TransferDBUtil f348;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f352;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f350 = LogFactory.m296(TransferStatusUpdater.class);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashSet f349 = new HashSet(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Map f346 = new ConcurrentMapC17249() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized TransferRecord m386(int i) {
        return (TransferRecord) this.f352.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Map m387() {
        return C4681.unmodifiableMap(this.f352);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m388(int i, long j, long j2, boolean z) {
        TransferRecord transferRecord = (TransferRecord) this.f352.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.f320 = j;
            transferRecord.f306 = j2;
        }
        f348.getClass();
        TransferDBUtil.m359(i, j);
        if (z) {
            Map map = f346;
            synchronized (map) {
                List list = (List) ((ConcurrentMapC17249) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f351.post(new Runnable(i, j, j2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f354.m367();
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m391(TransferRecord transferRecord) {
        this.f352.put(Integer.valueOf(transferRecord.f322), transferRecord);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m392(int i) {
        f348.getClass();
        TransferRecord transferRecordM366 = TransferDBUtil.m366(i);
        if (transferRecordM366 != null) {
            String str = transferRecordM366.f311;
            if (new File(str).getName().startsWith("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002")) {
                new File(str).delete();
            }
        }
        S3ClientReference.m348(Integer.valueOf(i));
        f348.getClass();
        TransferDBUtil.m358(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized TransferStatusUpdater m384(Context context) {
        if (f347 == null) {
            TransferDBUtil transferDBUtil = new TransferDBUtil(context);
            f348 = transferDBUtil;
            f347 = new TransferStatusUpdater(transferDBUtil);
        }
        return f347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m389(int i, TransferState transferState) {
        boolean zContains = f349.contains(transferState);
        TransferRecord transferRecord = (TransferRecord) this.f352.get(Integer.valueOf(i));
        if (transferRecord == null) {
            f348.getClass();
            if (TransferDBUtil.m354(i, transferState) == 0) {
                f350.mo294("Failed to update the status of transfer " + i);
            }
        } else {
            zContains |= transferState.equals(transferRecord.f296);
            transferRecord.f296 = transferState;
            f348.getClass();
            if (TransferDBUtil.m355(transferRecord) == 0) {
                f350.mo294("Failed to update the status of transfer " + i);
            }
        }
        if (zContains) {
            return;
        }
        if (TransferState.COMPLETED.equals(transferState)) {
            m392(i);
        }
        Map map = f346;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC17249) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f351.post(new Runnable(i, transferState) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f353.m368();
                        }
                    });
                }
                if (TransferState.m383(transferState)) {
                    list.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized ProgressListener m393(int i) {
        TransferRecord transferRecordM386;
        transferRecordM386 = m386(i);
        if (transferRecordM386 == null) {
            f350.mo288("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        f350.mo288("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(transferRecordM386);
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f348 = transferDBUtil;
        this.f351 = new Handler(Looper.getMainLooper());
        this.f352 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m390(int i, Exception exc) {
        Map map = f346;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC17249) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f351.post(new Runnable(i, exc) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f355.m369();
                        }
                    });
                }
            }
        }
    }

    public class TransferProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public long f356;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final TransferRecord f357;

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ۙ */
        public final synchronized void mo223(ProgressEvent progressEvent) {
            if (32 == progressEvent.m222()) {
                TransferStatusUpdater.f350.mo288("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f356 = 0L;
            } else {
                long jM220 = this.f356 + progressEvent.m220();
                this.f356 = jM220;
                TransferRecord transferRecord = this.f357;
                if (jM220 > transferRecord.f320) {
                    transferRecord.f320 = jM220;
                    TransferStatusUpdater.this.m388(transferRecord.f322, jM220, transferRecord.f306, true);
                }
            }
        }

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f357 = transferRecord;
        }
    }
}
