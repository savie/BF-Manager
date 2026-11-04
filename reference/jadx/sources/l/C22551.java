package l;

/* JADX INFO: renamed from: l.᩸ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9XZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C22551 extends AbstractC10461 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public String f72897;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f72898;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f72899;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f72900;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C22551(InterfaceC5878 interfaceC5878, String str, String str2, int i, int i2, int i3) {
        super(interfaceC5878, (byte) 50, (byte) 1);
        if (str.equals("\\") || C22313.m50373(1, str) == '\\') {
            this.f13608 = str;
        } else {
            this.f13608 = str.concat("\\");
        }
        this.f72897 = str2;
        this.f72898 = i & 55;
        this.f72900 = 260;
        this.f33300 = 0;
        this.f33281 = 10;
        this.f72899 = i2;
        this.f33296 = i3;
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
        C0481.m2319(this.f72898, 0, bArr);
        C0481.m2319(this.f72899, 2, bArr);
        long j = 0;
        C0481.m2319(j, 4, bArr);
        C0481.m2319(this.f72900, 6, bArr);
        C0481.m2323(j, 8, bArr);
        return m12758(this.f13608 + this.f72897, 12, bArr) + 12;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindFirst2[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C8008.m21876(this.f72898, 2, ",searchCount=", sb);
        sb.append(this.f72899);
        sb.append(",flags=0x");
        sb.append(C6033.m17503(0, 2));
        sb.append(",informationLevel=0x");
        C8008.m21876(this.f72900, 3, ",searchStorageType=0,filename=", sb);
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
