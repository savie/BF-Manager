package l;

/* JADX INFO: renamed from: l.ܰ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13843 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C13905 f45673;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f45674;

    public C13843(C13905 c13905) {
        super(1, -1);
        this.f45673 = c13905;
        this.f45674 = null;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ENCODED_ARRAY_ITEM;
    }

    public final int hashCode() {
        return this.f45673.hashCode();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ */
    public final int mo6990(AbstractC12432 abstractC12432) {
        return this.f45673.compareTo(((C13843) abstractC12432).f45673);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f45673.mo2376();
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C0872.m3487(c4669, this.f45673);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        C2718 c2718 = new C2718();
        new C0872(c16665.m52251(), c2718).m3492(this.f45673, false);
        byte[] bArrM8278 = c2718.m8278();
        this.f45674 = bArrM8278;
        m30903(bArrM8278.length);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        if (c2718.m8288()) {
            c2718.m8283(0, m30901() + " encoded array");
            new C0872(c4669, c2718).m3492(this.f45673, true);
            return;
        }
        c2718.m8287(this.f45674);
    }
}
