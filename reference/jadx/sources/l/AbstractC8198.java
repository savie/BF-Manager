package l;

/* JADX INFO: renamed from: l.۠۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBCF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8198 extends AbstractC23015 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20960 f28560;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 8;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo4172(C4669 c4669);

    /* JADX INFO: renamed from: ᩺ */
    public abstract String mo4173();

    public AbstractC8198(AbstractC20960 abstractC20960) {
        super(abstractC20960.m47134());
        this.f28560 = abstractC20960;
    }

    @Override // l.AbstractC23015, l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public void mo4171(C4669 c4669) {
        super.mo4171(c4669);
        c4669.m12886().m12268(this.f28560.m47133().getName());
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        C11457 c11457M12877 = c4669.m12877();
        C4400 c4400M12886 = c4669.m12886();
        AbstractC20960 abstractC20960 = this.f28560;
        C0498 c0498M47133 = abstractC20960.m47133();
        int iM28601 = c11457M12877.m28601(m50908());
        int iM12264 = c4400M12886.m12264(c0498M47133.getName());
        int iMo4172 = mo4172(c4669);
        if (c2718.m8288()) {
            c2718.m8283(0, m36532() + ' ' + abstractC20960.mo2376());
            c2718.m8283(2, "  class_idx: ".concat(C22475.m49982(iM28601)));
            c2718.m8283(2, String.format("  %-10s %s", mo4173().concat(":"), C22475.m49982(iMo4172)));
            c2718.m8283(4, "  name_idx:  ".concat(C22475.m49978(iM12264)));
        }
        c2718.m8297(iM28601);
        c2718.m8297(iMo4172);
        c2718.m8289(iM12264);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20960 m21488() {
        return this.f28560;
    }
}
