package l;

import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.֫۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1924 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        if (!c8614M31974.m23197() && c12915.m31986("local") && c8614M31974.m23228("local")) {
            return !c12915.m31976().equals(c8614M31974.m23192()) || c12915.m31981() == 1;
        }
        return false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("local");
        c8614M31974.m23174("local");
        if (!c12915.m31988() && c12915.m31976().equals(c8614M31974.m23192())) {
            c12915.m31970("local");
            final InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
            C17585.m41246(c12915.m31979(), interfaceC2386M31989, c12915.m31978(), new InterfaceC16839() { // from class: l.ۧ۫۫
                @Override // l.InterfaceC16839
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo29188(String str) {
                    int i = C13678.f43415;
                    C8458 c8458 = new C8458(C5653.class);
                    InterfaceC2386 interfaceC2386 = interfaceC2386M31989;
                    c8458.m22730(Collections.singletonList(interfaceC2386));
                    C12915 c12916 = c12915;
                    c8458.m22731(c12916);
                    c8458.m22719("ARG_MSG_FROM", interfaceC2386.getName());
                    if (interfaceC2386.isDirectory()) {
                        c8458.m22719("ARG_MSG_TO", str);
                    }
                    c8458.m22719("targetPath", c12916.m31978());
                    c8458.m22719("replacedName", str);
                    c8458.m22714();
                }
            });
            return;
        }
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C5653.class);
        c8458.m22730(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22719("ARG_MSG_FROM", c12915.m31972());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("targetPath", c8614M31974.m23166());
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6601(String... strArr) {
        for (String str : strArr) {
            if (C17743.m41554(str) != null) {
                return true;
            }
        }
        return false;
    }
}
