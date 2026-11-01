package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23262 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InputStream f75475;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75474 = 16777215;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f75473 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f75476 = new int[256];

    public C23262(InputStream inputStream) {
        this.f75475 = inputStream;
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>= 1;
                if (i4 != 0) {
                    i2 ^= -306675152;
                }
            }
            this.f75476[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m51340() {
        return this.f75474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51341() {
        return m51345() == this.f75474;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m51339() {
        this.f75474 = 16777215;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51342() throws IOException {
        int i = this.f75475.read();
        if (this.f75473 && i != -1) {
            i = (~i) & 255;
        }
        int i2 = this.f75474;
        this.f75474 = (i2 >> 8) ^ this.f75476[(i2 ^ i) & 255];
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51343() {
        this.f75473 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51344() throws IOException {
        this.f75475.close();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m51345() {
        return (m51342() & 255) | ((m51342() & 255) << 8) | ((m51342() & 255) << 16) | ((m51342() & 255) << 24);
    }
}
