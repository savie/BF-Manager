package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۚ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5957 implements CharSequence, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20389;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f20390;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f20391 = new char[943718];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20393 = true;

    public C5957(InputStreamReader inputStreamReader) throws IOException {
        this.f20390 = inputStreamReader;
        m17333();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17336(C4245 c4245, InterfaceC7509 interfaceC7509, boolean z) throws IOException {
        c4245.m13568reset((CharSequence) this);
        m17335(interfaceC7509, z);
        if (length() < 524288) {
            boolean zFind = c4245.find();
            m17334(c4245, zFind, interfaceC7509, z);
            return zFind;
        }
        for (int i = 0; i < 5120; i++) {
            boolean zM13556 = c4245.m13556(i);
            m17334(c4245, zM13556, interfaceC7509, z);
            if (zM13556) {
                return true;
            }
        }
        while (true) {
            boolean zM13557 = c4245.m13556(5120);
            m17334(c4245, zM13557, interfaceC7509, z);
            if (zM13557) {
                return true;
            }
            int i2 = this.f20392;
            int i3 = this.f20389;
            if (i2 - i3 > 524288) {
                this.f20389 = i3 + 1;
            } else {
                if (!this.f20393 || interfaceC7509.mo924()) {
                    break;
                }
                m17333();
                int i4 = this.f20392;
                int i5 = this.f20389;
                if (i4 - i5 <= 524288) {
                    break;
                }
                this.f20389 = i5 + 1;
            }
        }
        if (interfaceC7509.mo924()) {
            m17335(interfaceC7509, z);
            return false;
        }
        boolean zFind2 = c4245.find(5121);
        m17334(c4245, zFind2, interfaceC7509, z);
        return zFind2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17334(C4245 c4245, boolean z, InterfaceC7509 interfaceC7509, boolean z2) throws IOException {
        m17335(interfaceC7509, z2);
        if (!z2 || z) {
            return;
        }
        if (c4245.m13557() || c4245.m13560()) {
            throw new IOException("Regex matching did not complete.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17335(InterfaceC7509 interfaceC7509, boolean z) throws InterruptedIOException {
        if (z && interfaceC7509.mo924()) {
            throw new InterruptedIOException("Content search canceled.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17333() throws IOException {
        if (!this.f20393) {
            return;
        }
        int i = this.f20392;
        int i2 = this.f20389;
        int i3 = i - i2;
        char[] cArr = this.f20391;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.f20389 = 0;
        this.f20392 = i3;
        while (true) {
            int length = cArr.length;
            int i4 = this.f20392;
            int i5 = length - i4;
            if (i5 == 0) {
                return;
            }
            InputStreamReader inputStreamReader = this.f20390;
            int i6 = inputStreamReader.read(cArr, i4, i5);
            if (i6 == -1) {
                inputStreamReader.close();
                this.f20393 = false;
                return;
            }
            this.f20392 += i6;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return Math.min(this.f20392 - this.f20389, 524288);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f20391[i + this.f20389];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.f20391, this.f20389 + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f20391, this.f20389, length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20393) {
            this.f20390.close();
            this.f20393 = false;
        }
    }
}
