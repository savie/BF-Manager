package l;

/* JADX INFO: renamed from: l.ܺᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A01 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16119 extends AbstractC5535 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20436 f52110;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final int f52111;

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        return 2;
    }

    public C16119(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601);
        this.f52111 = i;
        m15236((byte) 5);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20436 m38158() throws C8484 {
        if (!InterfaceC19731.class.isAssignableFrom(this.f52110.getClass())) {
            throw new C8484("Incompatible file information class");
        }
        return this.f52110;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        InterfaceC20436 c9148;
        int iMo1805;
        int i3 = this.f52111;
        if (i3 == 4) {
            c9148 = new C9148();
        } else if (i3 != 5) {
            c9148 = i3 != 6 ? null : new C0679();
        } else {
            c9148 = new C12675();
        }
        if (c9148 != null) {
            iMo1805 = c9148.mo1805(i, m15242(), bArr) + i;
            this.f52110 = c9148;
        } else {
            iMo1805 = i;
        }
        return iMo1805 - i;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("Trans2QueryPathInformationResponse["), super.toString(), "]"));
    }
}
