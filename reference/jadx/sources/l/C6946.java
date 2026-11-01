package l;

/* JADX INFO: renamed from: l.ۜᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 69T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6946 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f23364 = C13488.m32997(C6946.class);

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f23365;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public byte[] f23366;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f23367;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f23368;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        return 0;
    }

    public C6946(InterfaceC10601 interfaceC10601, int i, byte[] bArr, int i2, int i3) {
        super(interfaceC10601, (byte) 37, (byte) 38);
        this.f23367 = i;
        this.f23366 = bArr;
        this.f23365 = i2;
        this.f23368 = i3;
        this.f10440 = 0;
        this.f10424 = 65535;
        this.f10432 = 2;
        this.f10436 = "\\PIPE\\";
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        bArr[i] = m8267();
        bArr[i + 1] = 0;
        C4850.m13546(this.f23367, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f23368;
        if (length < i2) {
            f23364.mo12135("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f23366, this.f23365, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransTransactNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeFid=");
        return new String(C12441.m30911(this.f23367, "]", sb));
    }
}
