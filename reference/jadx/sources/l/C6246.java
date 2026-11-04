package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۛ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18178 f21204;

    public /* synthetic */ C6246(C18178 c18178) {
        this.f21204 = c18178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5500 m17874() {
        C18178 c18178 = this.f21204;
        int i = C18924.f61387;
        C9973 c9973 = c18178.f59411;
        int i2 = C4754.f16702;
        EnumC2298 enumC2298 = EnumC2298.SMB2_ONLY;
        EnumC16686 enumC16686 = EnumC16686.SMB2_ONLY;
        C5500 c5500M14658 = C4754.m14658(c9973, enumC2298, true, enumC16686);
        EnumC16686 enumC16686M16328 = c5500M14658.m16328();
        EnumC16686 enumC16687 = EnumC16686.UNKNOWN;
        if (enumC16686M16328 == enumC16687) {
            Throwable thM16327 = c5500M14658.m16327();
            if (C1771.m6225(thM16327)) {
                c5500M14658 = C4754.m14658(c9973, EnumC2298.SMB3_ONLY, false, EnumC16686.SMB3_ONLY);
                if (c5500M14658.m16328() == enumC16687) {
                    Throwable thM16328 = c5500M14658.m16327();
                    if (thM16327 != null && thM16328 != null) {
                        C4754.m14661(thM16327, thM16328);
                    }
                    if (thM16327 == null) {
                        thM16327 = thM16328;
                    }
                    c5500M14658 = new C5500(enumC16687, thM16327, false);
                }
            }
        } else if (c5500M14658.m16328() == enumC16686 && TextUtils.isEmpty(c9973.f32071) && TextUtils.isEmpty(c9973.f32074)) {
            EnumC2298 enumC2299 = EnumC2298.SMB3_ONLY;
            EnumC16686 enumC16688 = EnumC16686.SMB3_ONLY;
            C5500 c5500M14659 = C4754.m14658(c9973, enumC2299, false, enumC16688);
            if (c5500M14659.m16328() == enumC16688) {
                c5500M14658 = c5500M14659;
            }
        }
        c18178.f59413 = c5500M14658.m16329();
        return c5500M14658;
    }
}
