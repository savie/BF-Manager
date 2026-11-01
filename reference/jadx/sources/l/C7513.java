package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۟ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes3.dex */
public class C7513 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public StringBuffer f24998;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7513 m20020(String str, Exception exc) {
        C7513 c7513;
        if (exc instanceof C7513) {
            c7513 = (C7513) exc;
        } else {
            c7513 = new C7513(null, exc);
        }
        c7513.m20021(str);
        return c7513;
    }

    public C7513(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C7513) {
            String string = ((C7513) exc).f24998.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f24998 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f24998 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f24998);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f24998);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20021(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f24998;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }
}
