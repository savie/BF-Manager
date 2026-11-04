package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۜ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7RM */
/* JADX INFO: loaded from: classes3.dex */
public class C7452 extends Writer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f24557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Writer f24558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24559;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C7452(Writer writer) {
        this(writer, 16);
    }

    public C7452(Writer writer, int i) {
        this.f24559 = 0;
        this.f24558 = writer;
        this.f24557 = new char[i];
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        if (this.f24559 > this.f24557.length - 1) {
            flush();
        }
        char[] cArr = this.f24557;
        int i2 = this.f24559;
        this.f24559 = i2 + 1;
        cArr[i2] = (char) i;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.f24559 > this.f24557.length - i2) {
            flush();
            if (i2 > this.f24557.length) {
                this.f24558.write(cArr, i, i2);
                return;
            }
        }
        System.arraycopy(cArr, i, this.f24557, this.f24559, i2);
        this.f24559 += i2;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (this.f24559 > this.f24557.length - i2) {
            flush();
            if (i2 > this.f24557.length) {
                this.f24558.write(str, i, i2);
                return;
            }
        }
        str.getChars(i, i + i2, this.f24557, this.f24559);
        this.f24559 += i2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f24558.write(this.f24557, 0, this.f24559);
        this.f24559 = 0;
    }
}
