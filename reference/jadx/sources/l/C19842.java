package l;

/* JADX INFO: renamed from: l.᩶֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBE8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19842 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f63661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22371 f63662;

    public C19842(C22371 c22371) {
        super(1, -1);
        this.f63662 = c22371;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        C2718 c2718 = new C2718();
        new C0872(c16665.m52251(), c2718).m3492((C13905) this.f63662, true);
        byte[] bArrM8278 = c2718.m8278();
        this.f63661 = bArrM8278;
        m30903(bArrM8278.length);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f63662.mo2376();
    }

    public final String toString() {
        return this.f63662.toString();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        if (c2718.m8288()) {
            c2718.m8283(0, m30901() + " call site");
            new C0872(c4669, c2718).m3492((C13905) this.f63662, true);
            return;
        }
        c2718.m8287(this.f63661);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C0872.m3487(c4669, this.f63662);
    }
}
