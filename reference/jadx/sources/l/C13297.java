package l;

/* JADX INFO: renamed from: l.۬ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13297 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f44157;

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

    public C13297(InterfaceC10601 interfaceC10601, String str, int i) {
        super(interfaceC10601, (byte) 37, (byte) 35);
        this.f10436 = str;
        this.f44157 = i;
        this.f10428 = -1;
        this.f10440 = 6;
        this.f10424 = 1;
        this.f10432 = 2;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        bArr[i] = m8267();
        bArr[i + 1] = 0;
        C4850.m13546(this.f44157, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransPeekNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C22697.m50267(sb, this.f10436, "]"));
    }
}
