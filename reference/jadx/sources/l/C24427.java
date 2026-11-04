package l;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: l.᩺ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAPP */
/* JADX INFO: loaded from: classes.dex */
public final class C24427 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79293;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f79294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f79295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f79296;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f79297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStreamReader f79298;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C24427(InputStreamReader inputStreamReader) {
        super(inputStreamReader);
        this.f79296 = -1;
        this.f79297 = 0;
        this.f79298 = inputStreamReader;
        this.f79295 = new char[8192];
        this.f79293 = 0;
        this.f79294 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54640() throws IOException {
        if (this.f79298 == null) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m54641() throws IOException {
        int i;
        int i2 = this.f79296;
        int i3 = 0;
        if (i2 > -1) {
            int i4 = this.f79294 - i2;
            int i5 = this.f79297;
            if (i4 >= i5) {
                this.f79296 = -2;
                this.f79297 = 0;
            } else {
                char[] cArr = this.f79295;
                if (i5 <= cArr.length) {
                    System.arraycopy(cArr, i2, cArr, 0, i4);
                    this.f79296 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i5) {
                        i5 = length;
                    }
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, i2, cArr2, 0, i4);
                    this.f79295 = cArr2;
                    this.f79296 = 0;
                }
                this.f79293 = i4;
                this.f79294 = i4;
                i3 = i4;
            }
        }
        do {
            InputStreamReader inputStreamReader = this.f79298;
            char[] cArr3 = this.f79295;
            i = inputStreamReader.read(cArr3, i3, cArr3.length - i3);
        } while (i == 0);
        if (i > 0) {
            this.f79293 = i + i3;
            this.f79294 = i3;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        m54640();
        if (this.f79294 >= this.f79293) {
            m54641();
            if (this.f79294 >= this.f79293) {
                return -1;
            }
        }
        char[] cArr = this.f79295;
        int i = this.f79294;
        this.f79294 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m54639(char[] cArr, int i, int i2) throws IOException {
        if (this.f79294 >= this.f79293) {
            if (i2 >= this.f79295.length && this.f79296 <= -1) {
                return this.f79298.read(cArr, i, i2);
            }
            m54641();
        }
        int i3 = this.f79294;
        int i4 = this.f79293;
        if (i3 >= i4) {
            return -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f79295, this.f79294, cArr, i, iMin);
        this.f79294 += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        m54640();
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iM54639 = m54639(cArr, i, i2);
        if (iM54639 <= 0) {
            return iM54639;
        }
        while (iM54639 < i2 && this.f79298.ready()) {
            int iM546310 = m54639(cArr, i + iM54639, i2 - iM54639);
            if (iM546310 <= 0) {
                break;
            }
            iM54639 += iM546310;
        }
        return iM54639;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        m54640();
        long j3 = j;
        while (j3 > 0) {
            if (this.f79294 >= this.f79293) {
                m54641();
            }
            int i = this.f79294;
            int i2 = this.f79293;
            if (i >= i2) {
                break;
            }
            long j4 = i2 - i;
            if (j3 <= j4) {
                this.f79294 = (int) (((long) i) + j3);
            } else {
                j3 -= j4;
                this.f79294 = i2;
            }
            return j - j2;
        }
        j2 = j3;
        return j - j2;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        m54640();
        return this.f79294 < this.f79293 || this.f79298.ready();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        m54640();
        this.f79297 = i;
        this.f79296 = this.f79294;
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        m54640();
        int i = this.f79296;
        if (i < 0) {
            throw new IOException(this.f79296 == -2 ? "Mark invalid" : "Stream not marked");
        }
        this.f79294 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStreamReader inputStreamReader = this.f79298;
        if (inputStreamReader == null) {
            return;
        }
        try {
            inputStreamReader.close();
        } finally {
            this.f79298 = null;
            this.f79295 = null;
        }
    }
}
