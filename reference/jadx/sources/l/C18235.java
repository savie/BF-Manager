package l;

/* JADX INFO: renamed from: l.ᩳᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B9XZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18235 extends AbstractC2712 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f58216;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f58217;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public String f58218;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f58219;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C18235(InterfaceC10601 interfaceC10601, String str, String str2, int i, int i2, int i3) {
        super(interfaceC10601, (byte) 50, (byte) 1);
        if (str.equals("\\") || C3184.m9601(1, str) == '\\') {
            this.f48357 = str;
        } else {
            this.f48357 = str.concat("\\");
        }
        this.f58218 = str2;
        this.f58216 = i & 55;
        this.f58217 = 260;
        this.f10437 = 0;
        this.f10440 = 10;
        this.f58219 = i2;
        this.f10424 = i3;
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
        C4850.m13546(this.f58216, 0, bArr);
        C4850.m13546(this.f58219, 2, bArr);
        long j = 0;
        C4850.m13546(j, 4, bArr);
        C4850.m13546(this.f58217, 6, bArr);
        C4850.m13550(j, 8, bArr);
        return m35440(this.f48357 + this.f58218, 12, bArr) + 12;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindFirst2[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C18855.m43491(this.f58216, 2, ",searchCount=", sb);
        sb.append(this.f58219);
        sb.append(",flags=0x");
        sb.append(C5993.m16280(0, 2));
        sb.append(",informationLevel=0x");
        C18855.m43491(this.f58217, 3, ",searchStorageType=0,filename=", sb);
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
