package l;

/* JADX INFO: renamed from: l.۬᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69T4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14190 extends AbstractC10461 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f44862 = C16980.m40037(C14190.class);

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f44863;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f44864;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f44865;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f44866;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        return 0;
    }

    public C14190(InterfaceC5878 interfaceC5878, int i, byte[] bArr, int i2, int i3) {
        super(interfaceC5878, (byte) 37, (byte) 38);
        this.f44863 = i;
        this.f44866 = bArr;
        this.f44864 = i2;
        this.f44865 = i3;
        this.f33281 = 0;
        this.f33296 = 65535;
        this.f33287 = 2;
        this.f33288 = "\\PIPE\\";
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        C0481.m2319(this.f44863, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f44865;
        if (length < i2) {
            f44862.mo13721("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f44866, this.f44864, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransTransactNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeFid=");
        return new String(C12669.m31437(this.f44863, "]", sb));
    }
}
