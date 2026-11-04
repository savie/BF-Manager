package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩸᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes.dex */
public class C23044 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuffer f74786;

    public C23044(Exception exc) {
        this(exc, null, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23044 m51951(Exception exc, String str, Object... objArr) {
        C23044 c23044;
        if (exc instanceof C23044) {
            c23044 = (C23044) exc;
        } else {
            c23044 = new C23044(exc);
        }
        String str2 = String.format(str, objArr);
        StringBuffer stringBuffer = c23044.f74786;
        if (str2 == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str2);
        if (!str2.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c23044;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23044(Exception exc, String str, Object... objArr) {
        String message;
        if (str == null) {
            message = exc != null ? exc.getMessage() : null;
        } else {
            message = String.format(str, objArr);
        }
        super(message, exc);
        if (exc instanceof C23044) {
            String string = ((C23044) exc).f74786.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f74786 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f74786 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f74786);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f74786);
    }
}
