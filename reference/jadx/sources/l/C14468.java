package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܰ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14468 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuffer f45527;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14468 m34931(String str, Exception exc) {
        C14468 c14468;
        if (exc instanceof C14468) {
            c14468 = (C14468) exc;
        } else {
            c14468 = new C14468(null, exc);
        }
        StringBuffer stringBuffer = c14468.f45527;
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str);
        if (!str.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c14468;
    }

    public C14468(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C14468) {
            String string = ((C14468) exc).f45527.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f45527 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f45527 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f45527);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f45527);
    }
}
