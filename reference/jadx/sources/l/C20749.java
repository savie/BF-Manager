package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩷۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public class C20749 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public StringBuffer f67507;

    public C20749(Exception exc) {
        this(exc, null, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20749 m46751(Exception exc, String str, Object... objArr) {
        C20749 c20749;
        if (exc instanceof C20749) {
            c20749 = (C20749) exc;
        } else {
            c20749 = new C20749(exc);
        }
        String str2 = String.format(str, objArr);
        StringBuffer stringBuffer = c20749.f67507;
        if (str2 == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str2);
        if (!str2.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c20749;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20749(Exception exc, String str, Object... objArr) {
        String message;
        if (str == null) {
            message = exc != null ? exc.getMessage() : null;
        } else {
            message = String.format(str, objArr);
        }
        super(message, exc);
        if (exc instanceof C20749) {
            String string = ((C20749) exc).f67507.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f67507 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f67507 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f67507);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f67507);
    }
}
