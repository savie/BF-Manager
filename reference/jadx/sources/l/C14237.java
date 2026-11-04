package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14237 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f44988;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7305 f44989;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44990;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f44991;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f44992;

    public C14237(C7305 c7305, int i, int i2) {
        if (i < 0 || i2 < 0 || ((long) i) + ((long) i2) > c7305.length()) {
            throw new IllegalArgumentException("Legacy page range exceeds joined text");
        }
        this.f44988 = i;
        this.f44991 = i2;
        this.f44990 = c7305.m23620(i);
        this.f44992 = c7305.m23620(i + i2);
        this.f44989 = new C7305(c7305.m23622(), c7305.m19989());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34559(int i) throws IOException {
        this.f44989.length();
        if (i < -1 || i > this.f44991) {
            throw new IOException("Legacy coordinate exceeds active page");
        }
        if (i == -1) {
            return -1;
        }
        return this.f44988 + i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34560(InputStream inputStream, long j, InterfaceC3797 interfaceC3797) throws IOException {
        int iMin;
        C7305 c7305 = this.f44989;
        try {
            c7305.length();
            C16475 c16475 = new C16475(j, inputStream);
            if (j != 0) {
                if (c16475.readInt() != -1568513661) {
                    throw new IOException("Invalid legacy position stack magic");
                }
                int i = c16475.readByte() | (c16475.readByte() << 8);
                if (c16475.m39101() != ((long) i) * 8) {
                    throw new IOException("Invalid legacy position stack length");
                }
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = c16475.readInt();
                    int i4 = c16475.readInt();
                    int i5 = this.f44988;
                    int i6 = this.f44990;
                    c7305.length();
                    if (i3 < 0 || i4 < 0) {
                        iMin = -1;
                    } else {
                        int iMin2 = Math.min(i3, this.f44992 - i6) + i6;
                        iMin = (int) Math.min(((long) (iMin2 == i6 ? i5 : c7305.m23623(iMin2))) + ((long) i4), ((long) i5) + ((long) this.f44991));
                    }
                    interfaceC3797.mo12326(i3, i4, iMin);
                }
                c16475.m39099();
                inputStream.close();
                return;
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f44989.close();
    }
}
