package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۚ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U7RM */
/* JADX INFO: loaded from: classes2.dex */
public class C5029 extends Writer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Writer f17531;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f17532;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17533;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C5029(Writer writer) {
        this(writer, 16);
    }

    public C5029(Writer writer, int i) {
        this.f17533 = 0;
        this.f17531 = writer;
        this.f17532 = new char[i];
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        if (this.f17533 > this.f17532.length - 1) {
            flush();
        }
        char[] cArr = this.f17532;
        int i2 = this.f17533;
        this.f17533 = i2 + 1;
        cArr[i2] = (char) i;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.f17533 > this.f17532.length - i2) {
            flush();
            if (i2 > this.f17532.length) {
                this.f17531.write(cArr, i, i2);
                return;
            }
        }
        System.arraycopy(cArr, i, this.f17532, this.f17533, i2);
        this.f17533 += i2;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (this.f17533 > this.f17532.length - i2) {
            flush();
            if (i2 > this.f17532.length) {
                this.f17531.write(str, i, i2);
                return;
            }
        }
        str.getChars(i, i + i2, this.f17532, this.f17533);
        this.f17533 += i2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f17531.write(this.f17532, 0, this.f17533);
        this.f17533 = 0;
    }
}
