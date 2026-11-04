package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B6P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0211 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream f1413;

    public final synchronized int readInt() {
        return m1656(0) | m1656(8) | m1656(16) | m1656(24);
    }

    public final synchronized short readShort() {
        return (short) (m1656(0) | m1656(8));
    }

    public final synchronized void skipBytes(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            int i2 = 0;
            while (i2 < i) {
                int iSkip = (int) this.f1413.skip(i - i2);
                if (iSkip <= 0) {
                    break;
                } else {
                    i2 += iSkip;
                }
            }
            if (i2 != i) {
                throw new EOFException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m1657() {
        return m1656(0) | m1656(8);
    }

    public C0211(InputStream inputStream) {
        this.f1413 = inputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m1656(int i) throws IOException {
        int i2 = this.f1413.read();
        if (i2 != -1) {
            return (i2 & 255) << i;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1413.close();
    }
}
