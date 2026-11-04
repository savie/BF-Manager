package l;

import android.os.StatFs;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 41V3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StatFs[] f66759;

    public C20854(String... strArr) throws Exception {
        this.f66759 = new StatFs[strArr.length];
        Future<?> futureSubmit = C5261.f18540.submit(new RunnableC11435(3, this, strArr));
        try {
            futureSubmit.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47681(C20854 c20854, String[] strArr) {
        int i = 0;
        while (true) {
            StatFs[] statFsArr = c20854.f66759;
            if (i >= statFsArr.length) {
                return;
            }
            statFsArr[i] = new StatFs(strArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m47683() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f66759) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return blockSizeLong;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47682() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f66759) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return blockSizeLong;
    }
}
