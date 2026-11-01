package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1369 implements InterfaceC3485 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C1369 f5738;

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo4815(C4751 c4751) {
        C13365 c13365 = (C13365) c4751;
        if (TextUtils.isEmpty(c13365.m32863())) {
            return c13365.m13133().getString(R.string.MT_Protector);
        }
        return c13365.m32863();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1369 m4814() {
        if (f5738 == null) {
            f5738 = new C1369();
        }
        return f5738;
    }
}
