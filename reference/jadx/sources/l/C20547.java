package l;

/* JADX INFO: renamed from: l.᩷֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20547 extends AbstractC15254 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1203 f66544;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19842 f66545 = null;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 4;
    }

    public C20547(C1203 c1203) {
        this.f66544 = c1203;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C22371 c22371M4399 = this.f66544.m4399();
        C15609 c15609M12882 = c4669.m12882();
        C19842 c19842M37276 = c15609M12882.m37276(c22371M4399);
        if (c19842M37276 == null) {
            C16665 c16665M12873 = c4669.m12873();
            c19842M37276 = new C19842(c22371M4399);
            c16665M12873.m39128((AbstractC12432) c19842M37276);
            c15609M12882.m37278(c22371M4399, c19842M37276);
        }
        this.f66545 = c19842M37276;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        int iM30904 = this.f66545.m30904();
        if (c2718.m8288()) {
            c2718.m8283(0, m36532() + ' ' + this.f66544.toString());
            c2718.m8283(4, "call_site_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM30904);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f66544.compareTo(((C20547) obj).f66544);
    }
}
