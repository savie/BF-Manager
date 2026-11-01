package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10489 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0609 f35933;

    public /* synthetic */ C10489(C0609 c0609) {
        this.f35933 = c0609;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13311 m26610() {
        C0609 c0609 = this.f35933;
        int i = C17543.f55759;
        C6254 c6254 = c0609.f2623;
        int i2 = C4843.f17015;
        EnumC14392 enumC14392 = EnumC14392.SMB2_ONLY;
        EnumC15428 enumC15428 = EnumC15428.SMB2_ONLY;
        C13311 c13311M13437 = C4843.m13437(c6254, enumC14392, true, enumC15428);
        EnumC15428 enumC15428M32816 = c13311M13437.m32816();
        EnumC15428 enumC15429 = EnumC15428.UNKNOWN;
        if (enumC15428M32816 == enumC15429) {
            Throwable thM32817 = c13311M13437.m32817();
            if (C4137.m11766(thM32817)) {
                c13311M13437 = C4843.m13437(c6254, EnumC14392.SMB3_ONLY, false, EnumC15428.SMB3_ONLY);
                if (c13311M13437.m32816() == enumC15429) {
                    Throwable thM32818 = c13311M13437.m32817();
                    if (thM32817 != null && thM32818 != null) {
                        C4843.m13439(thM32817, thM32818);
                    }
                    if (thM32817 == null) {
                        thM32817 = thM32818;
                    }
                    c13311M13437 = new C13311(enumC15429, thM32817, false);
                }
            }
        } else if (c13311M13437.m32816() == enumC15428 && TextUtils.isEmpty(c6254.f21215) && TextUtils.isEmpty(c6254.f21210)) {
            EnumC14392 enumC14393 = EnumC14392.SMB3_ONLY;
            EnumC15428 enumC154210 = EnumC15428.SMB3_ONLY;
            C13311 c13311M13438 = C4843.m13437(c6254, enumC14393, false, enumC154210);
            if (c13311M13438.m32816() == enumC154210) {
                c13311M13437 = c13311M13438;
            }
        }
        c0609.f2621 = c13311M13437.m32818();
        return c13311M13437;
    }
}
