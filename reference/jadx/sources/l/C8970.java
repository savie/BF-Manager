package l;

/* JADX INFO: renamed from: l.۠᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZD */
/* JADX INFO: loaded from: classes4.dex */
public final class C8970 extends AbstractC10461 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f29262;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        return 0;
    }

    public C8970(InterfaceC5878 interfaceC5878, String str, int i) {
        super(interfaceC5878, (byte) 37, (byte) 35);
        this.f33288 = str;
        this.f29262 = i;
        this.f33285 = -1;
        this.f33281 = 6;
        this.f33296 = 1;
        this.f33287 = 2;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        C0481.m2319(this.f29262, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransPeekNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C8947.m23910(sb, this.f33288, "]"));
    }
}
