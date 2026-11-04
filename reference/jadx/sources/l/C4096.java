package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۘۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4096 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13187(C12628 c12628) {
        Context context = c12628.getContext();
        if (!(context instanceof AbstractActivityC17204)) {
            return true;
        }
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) context;
        return (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) ? false : true;
    }
}
