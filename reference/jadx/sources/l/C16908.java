package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1X */
/* JADX INFO: loaded from: classes5.dex */
public final class C16908 implements InterfaceC20436 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f54076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f54077 = false;

    @Override // l.InterfaceC20436
    /* JADX INFO: renamed from: ܰ */
    public final byte mo3043() {
        return (byte) 10;
    }

    public C16908(String str) {
        this.f54076 = str;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f54077 = bArr[i] != 0;
        int iM13549 = C4850.m13549(i + 16, bArr);
        int i3 = i + 20;
        byte[] bArr2 = new byte[iM13549];
        System.arraycopy(bArr, i3, bArr2, 0, iM13549);
        int i4 = i3 + iM13549;
        this.f54076 = new String(bArr2, StandardCharsets.UTF_16LE);
        return i4 - i;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        bArr[i] = this.f54077 ? (byte) 1 : (byte) 0;
        byte[] bytes = this.f54076.getBytes(StandardCharsets.UTF_16LE);
        C4850.m13550(bytes.length, i + 16, bArr);
        int i2 = i + 20;
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return (this.f54076.length() * 2) + 20;
    }
}
