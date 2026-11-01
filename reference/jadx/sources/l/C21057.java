package l;

/* JADX INFO: renamed from: l.᩷ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1K */
/* JADX INFO: loaded from: classes5.dex */
public final class C21057 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final int f68581;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C21057(InterfaceC10601 interfaceC10601, String str, int i) {
        super(interfaceC10601, (byte) 50, (byte) 5);
        this.f48357 = str;
        this.f68581 = i;
        this.f10437 = 0;
        this.f10440 = 2;
        this.f10424 = 40;
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
        long j;
        int i = this.f68581;
        if (i == 4) {
            j = 257;
        } else if (i == 5) {
            j = 258;
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(C8479.m22141(i, "Unsupported information level "));
            }
            j = 260;
        }
        C4850.m13546(j, 0, bArr);
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        return m35440(this.f48357, 6, bArr) + 6;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2QueryPathInformation[");
        sb.append(super.toString());
        sb.append(",informationLevel=0x");
        C18855.m43491(this.f68581, 3, ",filename=", sb);
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
