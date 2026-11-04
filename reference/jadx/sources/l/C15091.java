package l;

/* JADX INFO: renamed from: l.ܳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9UF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15091 extends AbstractC10461 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f49252;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f49253;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public long f49254;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f49255;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public String f49256;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C15091(int i, int i2, int i3, int i4, String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 50, (byte) 2);
        this.f49252 = i;
        this.f49253 = i2;
        this.f49256 = str;
        this.f49255 = 260;
        this.f33281 = 8;
        this.f49254 = i3;
        this.f33296 = i4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36352(int i, String str) {
        reset();
        this.f49253 = i;
        this.f49256 = str;
        this.f13591 = 0;
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
        C0481.m2319(this.f49252, 0, bArr);
        C0481.m2319(this.f49254, 2, bArr);
        C0481.m2319(this.f49255, 4, bArr);
        C0481.m2323(this.f49253, 6, bArr);
        C0481.m2319(0, 10, bArr);
        return m12758(this.f49256, 12, bArr) + 12;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindNext2[");
        sb.append(super.toString());
        sb.append(",sid=");
        sb.append(this.f49252);
        sb.append(",searchCount=");
        sb.append(((C14826) m12793()).m35728());
        sb.append(",informationLevel=0x");
        C8008.m21876(this.f49255, 3, ",resumeKey=0x", sb);
        C8008.m21876(this.f49253, 4, ",flags=0x", sb);
        C8008.m21876(0, 2, ",filename=", sb);
        return new String(C8947.m23910(sb, this.f49256, "]"));
    }
}
