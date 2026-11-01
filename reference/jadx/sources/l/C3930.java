package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۘ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 498X */
/* JADX INFO: loaded from: classes.dex */
public final class C3930 implements InterfaceC13104 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f14646;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14648 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC13104 f14647 = m11405();

    static {
        ApplicationC6132.m17119(65);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private native InterfaceC13104 m11405();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native InterfaceC21570 m11406(byte[] bArr);

    public C3930(byte[] bArr) {
        this.f14646 = bArr;
    }

    @Override // l.InterfaceC13104
    public final int read() {
        while (true) {
            InterfaceC13104 interfaceC13104 = this.f14647;
            if (interfaceC13104 == null) {
                return -1;
            }
            int i = interfaceC13104.read();
            if (i != -1) {
                return i;
            }
            this.f14647 = m11405();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m11407() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) (i & 255);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m11409() {
        return (m11407() & 255) | ((m11407() & 255) << 8) | ((m11407() & 255) << 16) | ((m11407() & 255) << 24);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m11408() {
        return ((m11407() & 255) << 24) | ((m11407() & 255) << 16) | ((m11407() & 255) << 8) | (m11407() & 255);
    }
}
