package l;

/* JADX INFO: renamed from: l.ۤᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L9VN */
/* JADX INFO: loaded from: classes4.dex */
public final class C10475 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f35863;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C10475(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601, (byte) 50, (byte) 3);
        this.f35863 = i;
        this.f10435 = 2;
        this.f10437 = 0;
        this.f10440 = 0;
        this.f10424 = 800;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        bArr[i] = m8267();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        int i;
        int i2 = this.f35863;
        if (i2 == -1) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unhandled information level");
            }
            i = 259;
        }
        C4850.m13546(i, 0, bArr);
        return 2;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C5993.m16280(this.f35863, 3) + "]");
    }
}
