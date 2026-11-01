package l;

/* JADX INFO: renamed from: l.۟ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7652 extends AbstractC5535 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC1903 f25287;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f25288;

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        return 0;
    }

    public C7652(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601);
        this.f25288 = i;
        mo24570(50);
        m15236((byte) 3);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1903 m20205() throws C8484 {
        if (InterfaceC1903.class.isAssignableFrom(this.f25287.getClass())) {
            return this.f25287;
        }
        throw new C8484("Incompatible file information class");
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        InterfaceC1903 c6324;
        int iMo1805;
        int i3 = this.f25288;
        if (i3 == -1) {
            c6324 = new C6324();
        } else if (i3 == 3) {
            c6324 = new C16203();
        } else {
            c6324 = i3 != 7 ? null : new C21141();
        }
        if (c6324 != null) {
            iMo1805 = c6324.mo1805(i, m15242(), bArr) + i;
            this.f25287 = c6324;
        } else {
            iMo1805 = i;
        }
        return iMo1805 - i;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("Trans2QueryFSInformationResponse["), super.toString(), "]"));
    }
}
