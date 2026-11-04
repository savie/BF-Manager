package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X20E */
/* JADX INFO: loaded from: classes3.dex */
public final class C2100 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C2100 f6955 = new C2100(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C2100 m7268() {
        return f6955;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31981() == 1 && !c12915.m31989().isDirectory();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
        c12915.m31987().mo18797(interfaceC2386M31989);
        C25093.m55918(c12915.m31983(), interfaceC2386M31989, interfaceC2386M31989.mo8091().m23973() == null);
    }
}
