package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes3.dex */
public final class C3855 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C22616 c22616M19055;
        C8614 c8614M31974 = c12915.m31974();
        if (c8614M31974.m23197()) {
            return false;
        }
        for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
            if ((interfaceC2386 instanceof C6838) && (c22616M19055 = ((C6838) interfaceC2386).m19055()) != null) {
                String lowerCase = c22616M19055.m50960().toLowerCase();
                if (lowerCase.startsWith("android/data/") || lowerCase.startsWith("android/obb/")) {
                    return false;
                }
            }
        }
        return c12915.m31986("trash") && c8614M31974.m23228("local");
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("trash");
        c8614M31974.m23174("local");
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C23993.class);
        c8458.m22727(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22719("ARG_MSG_FROM", c12915.m31980());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("sourcePath", c12915.m31967());
        c8458.m22719("targetPath", c8614M31974.m23204());
        c8458.m22714();
    }
}
