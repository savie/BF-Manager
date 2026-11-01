package l;

/* JADX INFO: renamed from: l.ܽۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4TR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16435 extends AbstractC23408 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12202 f52856;

    public C16435(C18551 c18551, int i, int i2, int i3) {
        super(c18551);
        this.f75807 = i;
        this.f75806 = i2;
        this.f75804 = i3;
    }

    public C16435(C18551 c18551, String str, C15606[] c15606Arr, int i) {
        super(c18551);
        this.f52856 = ((C22785) super.mo32493()).mo5139().m40058(str, c15606Arr);
        this.f75806 = 3;
        this.f75804 = i;
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    public final int getValue() {
        C12202 c12202;
        if (mo25192() == 3 && (c12202 = this.f52856) != null) {
            return c12202.m30302();
        }
        return super.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38686(int i) {
        this.f75807 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m38684(int i) {
        if (i != 3 && this.f52856 != null) {
            this.f52856 = null;
        }
        this.f75806 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38685(int i) {
        this.f75804 = i;
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    /* JADX INFO: renamed from: ۚܰ */
    public final C12202 mo25187() {
        C12202 c12202 = this.f52856;
        if (c12202 != null) {
            return c12202;
        }
        throw new RuntimeException("stringItem == null");
    }

    @Override // l.AbstractC23408
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo32493() {
        return (C22785) super.mo32493();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38687(String str, C15606[] c15606Arr) {
        this.f52856 = ((C22785) super.mo32493()).mo5139().m40058(str, c15606Arr);
        this.f75806 = 3;
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo25190() {
        return (C7262) super.mo25190();
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    public final InterfaceC3609 getEntry() {
        return (C18551) super.getEntry();
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    public final C18551 getEntry() {
        return (C18551) super.getEntry();
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۘۙ */
    public final int mo25186() {
        C18551 c18551 = (C18551) super.getEntry();
        int iMo7647 = c18551.mo7647();
        for (int i = 0; i < iMo7647; i++) {
            if (c18551.getValue(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
