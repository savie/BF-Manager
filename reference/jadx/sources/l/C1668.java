package l;

/* JADX INFO: renamed from: l.֫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L9VN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1668 extends AbstractC10461 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f5769;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C1668(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878, (byte) 50, (byte) 3);
        this.f5769 = i;
        this.f33292 = 2;
        this.f33300 = 0;
        this.f33281 = 0;
        this.f33296 = 800;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        int i;
        int i2 = this.f5769;
        if (i2 == -1) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unhandled information level");
            }
            i = 259;
        }
        C0481.m2319(i, 0, bArr);
        return 2;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C6033.m17503(this.f5769, 3) + "]");
    }
}
