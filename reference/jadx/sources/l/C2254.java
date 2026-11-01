package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۖۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2254 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6921(C13026 c13026) {
        Context context = c13026.getContext();
        if (!(context instanceof AbstractActivityC12483)) {
            return true;
        }
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) context;
        return (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) ? false : true;
    }
}
