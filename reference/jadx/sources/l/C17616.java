package l;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: l.ܿ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAPP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17616 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f55971;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f55972;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f55973;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f55974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f55975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStreamReader f55976;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C17616(InputStreamReader inputStreamReader) {
        super(inputStreamReader);
        this.f55971 = -1;
        this.f55975 = 0;
        this.f55976 = inputStreamReader;
        this.f55973 = new char[8192];
        this.f55974 = 0;
        this.f55972 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40940() throws IOException {
        if (this.f55976 == null) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40941() throws IOException {
        int i;
        int i2 = this.f55971;
        int i3 = 0;
        if (i2 > -1) {
            int i4 = this.f55972 - i2;
            int i5 = this.f55975;
            if (i4 >= i5) {
                this.f55971 = -2;
                this.f55975 = 0;
            } else {
                char[] cArr = this.f55973;
                if (i5 <= cArr.length) {
                    System.arraycopy(cArr, i2, cArr, 0, i4);
                    this.f55971 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i5) {
                        i5 = length;
                    }
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, i2, cArr2, 0, i4);
                    this.f55973 = cArr2;
                    this.f55971 = 0;
                }
                this.f55974 = i4;
                this.f55972 = i4;
                i3 = i4;
            }
        }
        do {
            InputStreamReader inputStreamReader = this.f55976;
            char[] cArr3 = this.f55973;
            i = inputStreamReader.read(cArr3, i3, cArr3.length - i3);
        } while (i == 0);
        if (i > 0) {
            this.f55974 = i + i3;
            this.f55972 = i3;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        m40940();
        if (this.f55972 >= this.f55974) {
            m40941();
            if (this.f55972 >= this.f55974) {
                return -1;
            }
        }
        char[] cArr = this.f55973;
        int i = this.f55972;
        this.f55972 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m40939(char[] cArr, int i, int i2) throws IOException {
        if (this.f55972 >= this.f55974) {
            if (i2 >= this.f55973.length && this.f55971 <= -1) {
                return this.f55976.read(cArr, i, i2);
            }
            m40941();
        }
        int i3 = this.f55972;
        int i4 = this.f55974;
        if (i3 >= i4) {
            return -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f55973, this.f55972, cArr, i, iMin);
        this.f55972 += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        m40940();
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iM40939 = m40939(cArr, i, i2);
        if (iM40939 <= 0) {
            return iM40939;
        }
        while (iM40939 < i2 && this.f55976.ready()) {
            int iM409310 = m40939(cArr, i + iM40939, i2 - iM40939);
            if (iM409310 <= 0) {
                break;
            }
            iM40939 += iM409310;
        }
        return iM40939;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        m40940();
        long j3 = j;
        while (j3 > 0) {
            if (this.f55972 >= this.f55974) {
                m40941();
            }
            int i = this.f55972;
            int i2 = this.f55974;
            if (i >= i2) {
                break;
            }
            long j4 = i2 - i;
            if (j3 <= j4) {
                this.f55972 = (int) (((long) i) + j3);
            } else {
                j3 -= j4;
                this.f55972 = i2;
            }
            return j - j2;
        }
        j2 = j3;
        return j - j2;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        m40940();
        return this.f55972 < this.f55974 || this.f55976.ready();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        m40940();
        this.f55975 = i;
        this.f55971 = this.f55972;
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        m40940();
        int i = this.f55971;
        if (i < 0) {
            throw new IOException(this.f55971 == -2 ? "Mark invalid" : "Stream not marked");
        }
        this.f55972 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStreamReader inputStreamReader = this.f55976;
        if (inputStreamReader == null) {
            return;
        }
        try {
            inputStreamReader.close();
        } finally {
            this.f55976 = null;
            this.f55973 = null;
        }
    }
}
