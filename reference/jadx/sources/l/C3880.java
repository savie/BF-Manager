package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۘۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes2.dex */
public class C3880 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuffer f13234;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3880 m12507(String str, Exception exc) {
        C3880 c3880;
        if (exc instanceof C3880) {
            c3880 = (C3880) exc;
        } else {
            c3880 = new C3880(null, exc);
        }
        c3880.m12508(str);
        return c3880;
    }

    public C3880(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C3880) {
            String string = ((C3880) exc).f13234.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f13234 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f13234 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f13234);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f13234);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12508(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f13234;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }
}
