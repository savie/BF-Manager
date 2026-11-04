package l;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.۟᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8174 extends Writer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PrintWriter f26957;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26958;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f26959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f26960;

    public C8174(PrintWriter printWriter, String str) {
        super(printWriter);
        this.f26959 = true;
        this.f26957 = printWriter;
        this.f26960 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26957.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f26957.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            PrintWriter printWriter = this.f26957;
            if (c == '\n' || c == '\r') {
                this.f26959 = true;
            } else {
                if (this.f26959) {
                    int i4 = this.f26958;
                    String str = this.f26960;
                    if (str.charAt(i4) == ' ') {
                        printWriter.write("| ");
                    } else {
                        printWriter.write(str.charAt(this.f26958));
                        printWriter.write(32);
                    }
                    int i5 = this.f26958 + 1;
                    this.f26958 = i5;
                    if (i5 >= str.length()) {
                        this.f26958 = 0;
                    }
                }
                this.f26959 = false;
            }
            printWriter.write(cArr[i3]);
        }
    }
}
