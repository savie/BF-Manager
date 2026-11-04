package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19495 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        return c12915.m31986("local") && c8614M31974.m23228("local") && !c8614M31974.m23197() && !c12915.m31976().equals(c8614M31974.m23192());
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("local");
        c8614M31974.m23174("local");
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C22479.class);
        c8458.m22723(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22719("ARG_MSG_FROM", c12915.m31972());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("sourcePath", c12915.m31967());
        c8458.m22719("targetPath", c8614M31974.m23204());
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45016(AbstractC6662 abstractC6662) {
        if (abstractC6662.m18625()) {
            C20832 c20832Mo18607 = abstractC6662.mo18607();
            Iterator it = c20832Mo18607.m47638().iterator();
            while (it.hasNext()) {
                m45016((AbstractC6662) it.next());
            }
            AbstractC11601 abstractC11601Mo4298 = c20832Mo18607.m18615().mo4298();
            if (abstractC11601Mo4298.mo8788(EnumC5636.DELETE_EMPTY_DIRECTORY) == EnumC15330.UNSUPPORTED) {
                return;
            }
            try {
                abstractC11601Mo4298.mo8796();
            } catch (C22790 e) {
                if (e.m51409() != EnumC10855.DIRECTORY_NOT_EMPTY) {
                    EnumC10855 enumC10855 = EnumC10855.NOT_FOUND;
                }
            }
        }
    }
}
