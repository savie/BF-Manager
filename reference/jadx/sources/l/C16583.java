package l;

/* JADX INFO: renamed from: l.ܺۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A01 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16583 extends AbstractC1513 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final int f53661;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC17395 f53662;

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        return 2;
    }

    public C16583(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878);
        this.f53661 = i;
        m5380((byte) 5);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17395 m39257() throws C20048 {
        if (!InterfaceC12920.class.isAssignableFrom(this.f53662.getClass())) {
            throw new C20048("Incompatible file information class");
        }
        return this.f53662;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        InterfaceC17395 c5463;
        int iMo6138;
        int i3 = this.f53661;
        if (i3 == 4) {
            c5463 = new C5463();
        } else if (i3 != 5) {
            c5463 = i3 != 6 ? null : new C15903();
        } else {
            c5463 = new C3225();
        }
        if (c5463 != null) {
            iMo6138 = c5463.mo6138(i, m5383(), bArr) + i;
            this.f53662 = c5463;
        } else {
            iMo6138 = i;
        }
        return iMo6138 - i;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("Trans2QueryPathInformationResponse["), super.toString(), "]"));
    }
}
