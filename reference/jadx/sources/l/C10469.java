package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10469 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12175 m26449(Bundle bundle, C12175 c12175, int i) {
        if (!bundle.getBoolean("initialSmoothPending")) {
            return c12175;
        }
        int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
        C12175 c12175M30269 = c12175.m30269(i, C16737.f53615.getInt("smooth_mode_threshold", 200000));
        bundle.remove("initialSmoothPending");
        return c12175M30269;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01a3 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01b5 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14393 m26450(l.InterfaceC3800 r23, android.os.Bundle r24, l.C12175 r25, byte[] r26, byte[] r27, l.C13914 r28, l.C13312 r29, l.InterfaceC5614 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10469.m26450(l.ۘ۟ᩴ, android.os.Bundle, l.۫ۙۚ, byte[], byte[], l.ܰܺۖ, l.۬᩵ۖ, l.ۚ᩸ۘ):l.ܳ۠ۖ");
    }
}
