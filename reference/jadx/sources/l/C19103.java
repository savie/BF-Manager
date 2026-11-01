package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SM */
/* JADX INFO: loaded from: classes4.dex */
public final class C19103 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f61692;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6276 f61693;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f61694;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f61695;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61696;

    public C19103(C6276 c6276, int i, int i2) {
        if (i < 0 || i2 < 0 || ((long) i) + ((long) i2) > c6276.length()) {
            throw new IllegalArgumentException("Legacy page range exceeds joined text");
        }
        this.f61695 = i;
        this.f61692 = i2;
        this.f61694 = c6276.m40839(i);
        this.f61696 = c6276.m40839(i + i2);
        this.f61693 = new C6276(c6276.m40840(), c6276.m17352());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43867(int i) throws IOException {
        this.f61693.length();
        if (i < -1 || i > this.f61692) {
            throw new IOException("Legacy coordinate exceeds active page");
        }
        if (i == -1) {
            return -1;
        }
        return this.f61695 + i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43868(InputStream inputStream, long j, InterfaceC7814 interfaceC7814) throws IOException {
        int iMin;
        C6276 c6276 = this.f61693;
        try {
            c6276.length();
            C0757 c0757 = new C0757(j, inputStream);
            if (j != 0) {
                if (c0757.readInt() != -1568513661) {
                    throw new IOException("Invalid legacy position stack magic");
                }
                int i = c0757.readByte() | (c0757.readByte() << 8);
                if (c0757.m3268() != ((long) i) * 8) {
                    throw new IOException("Invalid legacy position stack length");
                }
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = c0757.readInt();
                    int i4 = c0757.readInt();
                    int i5 = this.f61695;
                    int i6 = this.f61694;
                    c6276.length();
                    if (i3 < 0 || i4 < 0) {
                        iMin = -1;
                    } else {
                        int iMin2 = Math.min(i3, this.f61696 - i6) + i6;
                        iMin = (int) Math.min(((long) (iMin2 == i6 ? i5 : c6276.m40837(iMin2))) + ((long) i4), ((long) i5) + ((long) this.f61692));
                    }
                    interfaceC7814.mo20516(i3, i4, iMin);
                }
                c0757.m3263();
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
        this.f61693.close();
    }
}
