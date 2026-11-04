package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩹ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1X */
/* JADX INFO: loaded from: classes.dex */
public final class C23363 implements InterfaceC17395 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f75648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75649 = false;

    @Override // l.InterfaceC17395
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10574() {
        return (byte) 10;
    }

    public C23363(String str) {
        this.f75648 = str;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f75649 = bArr[i] != 0;
        int iM2322 = C0481.m2322(i + 16, bArr);
        int i3 = i + 20;
        byte[] bArr2 = new byte[iM2322];
        System.arraycopy(bArr, i3, bArr2, 0, iM2322);
        int i4 = i3 + iM2322;
        this.f75648 = new String(bArr2, StandardCharsets.UTF_16LE);
        return i4 - i;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        bArr[i] = this.f75649 ? (byte) 1 : (byte) 0;
        byte[] bytes = this.f75648.getBytes(StandardCharsets.UTF_16LE);
        C0481.m2323(bytes.length, i + 16, bArr);
        int i2 = i + 20;
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return (this.f75648.length() * 2) + 20;
    }
}
