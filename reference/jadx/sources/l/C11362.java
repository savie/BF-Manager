package l;

/* JADX INFO: renamed from: l.ۧۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11362 extends AbstractC1513 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f35772;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC4145 f35773;

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        return 0;
    }

    public C11362(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878);
        this.f35772 = i;
        mo10331(50);
        m5380((byte) 3);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4145 m28671() throws C20048 {
        if (InterfaceC4145.class.isAssignableFrom(this.f35773.getClass())) {
            return this.f35773;
        }
        throw new C20048("Incompatible file information class");
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        InterfaceC4145 c12174;
        int iMo6138;
        int i3 = this.f35772;
        if (i3 == -1) {
            c12174 = new C12174();
        } else if (i3 == 3) {
            c12174 = new C16649();
        } else {
            c12174 = i3 != 7 ? null : new C24855();
        }
        if (c12174 != null) {
            iMo6138 = c12174.mo6138(i, m5383(), bArr) + i;
            this.f35773 = c12174;
        } else {
            iMo6138 = i;
        }
        return iMo6138 - i;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("Trans2QueryFSInformationResponse["), super.toString(), "]"));
    }
}
