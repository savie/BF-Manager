package l;

/* JADX INFO: renamed from: l.ܰۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13574 extends AbstractC23015 {
    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 4;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_TYPE_ID_ITEM;
    }

    @Override // l.AbstractC23015, l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        c4669.m12886().m12268(m50908().m17129());
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        C17432 c17432M17129 = m50908().m17129();
        int iM12264 = c4669.m12886().m12264(c17432M17129);
        if (c2718.m8288()) {
            c2718.m8283(0, m36532() + ' ' + c17432M17129.mo2376());
            c2718.m8283(4, "  descriptor_idx: ".concat(C22475.m49978(iM12264)));
        }
        c2718.m8289(iM12264);
    }
}
