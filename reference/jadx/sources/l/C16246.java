package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16246 implements InterfaceC9191 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52401 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f52400 = new byte[0];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m38373() {
        return this.f52400;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m38372() {
        return this.f52401;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m38374() {
        return Arrays.copyOf(this.f52400, this.f52401);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m38375() {
        Arrays.fill(this.f52400, (byte) 0);
        this.f52401 = 0;
    }

    @Override // l.InterfaceC9191
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo23644(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C7779(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38369(C16246 c16246, int i) {
        if (i > c16246.f52401) {
            byte[] bArr = c16246.f52400;
            if (i > bArr.length) {
                int iMax = Math.max((i >> 2) + i, bArr.length + 262144);
                if (iMax < i) {
                    throw new IndexOutOfBoundsException();
                }
                c16246.f52400 = Arrays.copyOf(c16246.f52400, iMax);
            }
            c16246.f52401 = i;
        }
    }

    @Override // l.InterfaceC9191
    /* JADX INFO: renamed from: ۡ */
    public final InputStream mo23643(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C21184(this, i);
    }
}
