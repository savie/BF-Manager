package l;

/* JADX INFO: renamed from: l.᩷ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21805 extends AbstractC10461 {
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

    public C21805(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 37, (byte) 83);
        this.f33288 = str;
        this.f33285 = -1;
        this.f33281 = 0;
        this.f33296 = 0;
        this.f33287 = 2;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransWaitNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C8947.m23910(sb, this.f33288, "]"));
    }
}
