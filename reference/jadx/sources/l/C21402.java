package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.᩶ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21402 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        return c12915.m31986(b.k) && c8614M31974.m23228("local") && !c8614M31974.m23197();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(b.k);
        c8614M31974.m23174("local");
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(b.k);
        c8614M31974.m23174("local");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C23640.class);
        c8458.m22730(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22724(c12915.m31987());
        c8458.m22719("ARG_MSG_FROM", c12915.m31972());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("targetPath", c8614M31974.m23166());
        c8458.m22720("moveMode", false);
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48669(AbstractC18881 abstractC18881, C20832 c20832) {
        for (AbstractC6662 abstractC6662 : c20832.m47638()) {
            if (abstractC6662.m18625() && !m48669(abstractC18881, abstractC6662.mo18607())) {
                return false;
            }
        }
        try {
            String strM18604 = c20832.m18604();
            abstractC18881.mo35576(strM18604);
            if (abstractC18881.mo20830(strM18604, true).isEmpty()) {
                return abstractC18881.m43791(strM18604, true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
