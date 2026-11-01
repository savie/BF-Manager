package l;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۘ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3626 extends Writer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13318;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f13319;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PrintWriter f13320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f13321;

    public C3626(PrintWriter printWriter, String str) {
        super(printWriter);
        this.f13318 = true;
        this.f13320 = printWriter;
        this.f13321 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13320.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f13320.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            PrintWriter printWriter = this.f13320;
            if (c == '\n' || c == '\r') {
                this.f13318 = true;
            } else {
                if (this.f13318) {
                    int i4 = this.f13319;
                    String str = this.f13321;
                    if (str.charAt(i4) == ' ') {
                        printWriter.write("| ");
                    } else {
                        printWriter.write(str.charAt(this.f13319));
                        printWriter.write(32);
                    }
                    int i5 = this.f13319 + 1;
                    this.f13319 = i5;
                    if (i5 >= str.length()) {
                        this.f13319 = 0;
                    }
                }
                this.f13318 = false;
            }
            printWriter.write(cArr[i3]);
        }
    }
}
