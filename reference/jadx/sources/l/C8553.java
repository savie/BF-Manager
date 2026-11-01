package l;

/* JADX INFO: renamed from: l.ۡ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8553 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19136 f29584;

    public C8553(C19136 c19136) {
        super(4, 4);
        this.f29584 = c19136;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        this.f29584 = (C19136) c4669.m12878().m39130(this.f29584);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f29584.mo6991();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        int iM30904 = this.f29584.m30904();
        if (c2718.m8288()) {
            c2718.m8283(4, "  annotations_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM30904);
    }
}
