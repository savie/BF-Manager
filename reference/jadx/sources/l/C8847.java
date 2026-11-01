package l;

import android.os.StatFs;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 41V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StatFs[] f30382;

    public C8847(String... strArr) throws Exception {
        this.f30382 = new StatFs[strArr.length];
        Future<?> futureSubmit = C4716.f16636.submit(new RunnableC10945(5, this, strArr));
        try {
            futureSubmit.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22974(C8847 c8847, String[] strArr) {
        int i = 0;
        while (true) {
            StatFs[] statFsArr = c8847.f30382;
            if (i >= statFsArr.length) {
                return;
            }
            statFsArr[i] = new StatFs(strArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m22976() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f30382) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return blockSizeLong;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m22975() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f30382) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return blockSizeLong;
    }
}
