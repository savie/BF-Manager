package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22935 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InputStream f74507;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74506 = 16777215;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f74509 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f74508 = new int[256];

    public C22935(InputStream inputStream) {
        this.f74507 = inputStream;
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>= 1;
                if (i4 != 0) {
                    i2 ^= -306675152;
                }
            }
            this.f74508[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m51697() {
        return this.f74506;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51691() {
        return m51694() == this.f74506;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m51693() {
        this.f74506 = 16777215;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m51695() throws IOException {
        int i = this.f74507.read();
        if (this.f74509 && i != -1) {
            i = (~i) & 255;
        }
        int i2 = this.f74506;
        this.f74506 = (i2 >> 8) ^ this.f74508[(i2 ^ i) & 255];
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51692() {
        this.f74509 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51696() throws IOException {
        this.f74507.close();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m51694() {
        return (m51695() & 255) | ((m51695() & 255) << 8) | ((m51695() & 255) << 16) | ((m51695() & 255) << 24);
    }
}
