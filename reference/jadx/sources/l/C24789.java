package l;

/* JADX INFO: renamed from: l.᩻ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1K */
/* JADX INFO: loaded from: classes2.dex */
public final class C24789 extends AbstractC10461 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final int f80233;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C24789(InterfaceC5878 interfaceC5878, String str, int i) {
        super(interfaceC5878, (byte) 50, (byte) 5);
        this.f13608 = str;
        this.f80233 = i;
        this.f33300 = 0;
        this.f33281 = 2;
        this.f33296 = 40;
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
        long j;
        int i = this.f80233;
        if (i == 4) {
            j = 257;
        } else if (i == 5) {
            j = 258;
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(C13645.m33382(i, "Unsupported information level "));
            }
            j = 260;
        }
        C0481.m2319(j, 0, bArr);
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        return m12758(this.f13608, 6, bArr) + 6;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2QueryPathInformation[");
        sb.append(super.toString());
        sb.append(",informationLevel=0x");
        C8008.m21876(this.f80233, 3, ",filename=", sb);
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
