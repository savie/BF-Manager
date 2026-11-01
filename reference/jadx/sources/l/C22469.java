package l;

/* JADX INFO: renamed from: l.᩹ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 69XG */
/* JADX INFO: loaded from: classes2.dex */
public final class C22469 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f73352 = C13488.m32997(C22469.class);

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f73353;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public byte[] f73354;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f73355;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        return 0;
    }

    public C22469(InterfaceC10601 interfaceC10601, String str, byte[] bArr, int i, int i2) {
        super(interfaceC10601, (byte) 37, (byte) 84);
        this.f10436 = str;
        this.f73354 = bArr;
        this.f73353 = i;
        this.f73355 = i2;
        this.f10428 = -1;
        this.f10440 = 0;
        this.f10424 = 65535;
        this.f10432 = 2;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        bArr[i] = m8267();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f73355;
        if (length < i2) {
            f73352.mo12135("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f73354, this.f73353, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransCallNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C22697.m50267(sb, this.f10436, "]"));
    }
}
