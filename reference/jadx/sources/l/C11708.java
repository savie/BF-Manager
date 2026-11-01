package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۨ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11708 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public StringBuffer f39353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11708 m29248(String str, Exception exc) {
        C11708 c11708;
        if (exc instanceof C11708) {
            c11708 = (C11708) exc;
        } else {
            c11708 = new C11708(null, exc);
        }
        StringBuffer stringBuffer = c11708.f39353;
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str);
        if (!str.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c11708;
    }

    public C11708(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C11708) {
            String string = ((C11708) exc).f39353.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f39353 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f39353 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f39353);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f39353);
    }
}
