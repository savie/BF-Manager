package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19413 implements InterfaceC24044 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19413 f62748;

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo6271(C3906 c3906) {
        C10462 c10462 = (C10462) c3906;
        if (TextUtils.isEmpty(c10462.m26889())) {
            return c10462.m12560().getString(R.string.MT_Protector);
        }
        return c10462.m26889();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19413 m44914() {
        if (f62748 == null) {
            f62748 = new C19413();
        }
        return f62748;
    }
}
