package l;

/* JADX INFO: renamed from: l.ܶᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15414 extends AbstractC2712 {
    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C15414(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 37, (byte) 83);
        this.f10436 = str;
        this.f10428 = -1;
        this.f10440 = 0;
        this.f10424 = 0;
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

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransWaitNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C22697.m50267(sb, this.f10436, "]"));
    }
}
