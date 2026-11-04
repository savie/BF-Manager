package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4652 implements InterfaceC24044 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4652 f16452;

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo6271(C3906 c3906) {
        C21806 c21806 = (C21806) c3906;
        if (TextUtils.isEmpty(c21806.m49461())) {
            return c21806.m12560().getString(R.string.MT_Protector);
        }
        return c21806.m49461();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4652 m14507() {
        if (f16452 == null) {
            f16452 = new C4652();
        }
        return f16452;
    }
}
