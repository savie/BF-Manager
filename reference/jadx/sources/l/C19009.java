package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19009 implements InterfaceC3485 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C19009 f61519;

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4815(C4751 c4751) {
        C8426 c8426 = (C8426) c4751;
        if (TextUtils.isEmpty(c8426.m22071())) {
            return c8426.m13133().getString(R.string.MT_Protector);
        }
        return c8426.m22071();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19009 m43730() {
        if (f61519 == null) {
            f61519 = new C19009();
        }
        return f61519;
    }
}
