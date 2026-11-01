package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ᩳᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18238 implements CharSequence, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f58222;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f58223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58225;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f58224 = new char[943718];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f58226 = true;

    public C18238(InputStreamReader inputStreamReader) throws IOException {
        this.f58223 = inputStreamReader;
        m42382();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42385(C14690 c14690, InterfaceC5614 interfaceC5614, boolean z) throws IOException {
        C6222 c6222Matcher = c14690.matcher((CharSequence) this);
        m42383(interfaceC5614, z);
        if (length() < 524288) {
            boolean zFind = c6222Matcher.find();
            m42384(c6222Matcher, zFind, interfaceC5614, z);
            return zFind;
        }
        for (int i = 0; i < 5120; i++) {
            boolean zM17266 = c6222Matcher.m17266(i);
            m42384(c6222Matcher, zM17266, interfaceC5614, z);
            if (zM17266) {
                return true;
            }
        }
        while (true) {
            boolean zM17267 = c6222Matcher.m17266(5120);
            m42384(c6222Matcher, zM17267, interfaceC5614, z);
            if (zM17267) {
                return true;
            }
            int i2 = this.f58222;
            int i3 = this.f58225;
            if (i2 - i3 > 524288) {
                this.f58225 = i3 + 1;
            } else {
                if (!this.f58226 || interfaceC5614.mo2357()) {
                    break;
                }
                m42382();
                int i4 = this.f58222;
                int i5 = this.f58225;
                if (i4 - i5 <= 524288) {
                    break;
                }
                this.f58225 = i5 + 1;
            }
        }
        if (interfaceC5614.mo2357()) {
            m42383(interfaceC5614, z);
            return false;
        }
        boolean zFind2 = c6222Matcher.find(5121);
        m42384(c6222Matcher, zFind2, interfaceC5614, z);
        return zFind2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42384(C6222 c6222, boolean z, InterfaceC5614 interfaceC5614, boolean z2) throws IOException {
        m42383(interfaceC5614, z2);
        if (!z2 || z) {
            return;
        }
        if (c6222.m17270() || c6222.m17258()) {
            throw new IOException("Regex matching did not complete.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42383(InterfaceC5614 interfaceC5614, boolean z) throws InterruptedIOException {
        if (z && interfaceC5614.mo2357()) {
            throw new InterruptedIOException("Content search canceled.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42382() throws IOException {
        if (!this.f58226) {
            return;
        }
        int i = this.f58222;
        int i2 = this.f58225;
        int i3 = i - i2;
        char[] cArr = this.f58224;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.f58225 = 0;
        this.f58222 = i3;
        while (true) {
            int length = cArr.length;
            int i4 = this.f58222;
            int i5 = length - i4;
            if (i5 == 0) {
                return;
            }
            InputStreamReader inputStreamReader = this.f58223;
            int i6 = inputStreamReader.read(cArr, i4, i5);
            if (i6 == -1) {
                inputStreamReader.close();
                this.f58226 = false;
                return;
            }
            this.f58222 += i6;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return Math.min(this.f58222 - this.f58225, 524288);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f58224[i + this.f58225];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.f58224, this.f58225 + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f58224, this.f58225, length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f58226) {
            this.f58223.close();
            this.f58226 = false;
        }
    }
}
