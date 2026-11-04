package l;

/* JADX INFO: renamed from: l.ۡ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9715 extends AbstractC10461 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f31348 = C16980.m40037(C9715.class);

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f31349;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f31350;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f31351;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        return 0;
    }

    public C9715(InterfaceC5878 interfaceC5878, String str, byte[] bArr, int i, int i2) {
        super(interfaceC5878, (byte) 37, (byte) 84);
        this.f33288 = str;
        this.f31351 = bArr;
        this.f31349 = i;
        this.f31350 = i2;
        this.f33285 = -1;
        this.f33281 = 0;
        this.f33296 = 65535;
        this.f33287 = 2;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f31350;
        if (length < i2) {
            f31348.mo13721("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f31351, this.f31349, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransCallNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C8947.m23910(sb, this.f33288, "]"));
    }
}
