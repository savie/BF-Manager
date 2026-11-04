package l;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩺֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3GW */
/* JADX INFO: loaded from: classes.dex */
public final class C23952 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuffer f77530;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f77531;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1577 f77532;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final StringBuffer f77533;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1577 f77534;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Writer f77535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53491(String str, int i, int i2, String str2) {
        StringWriter stringWriter = new StringWriter((str.length() + str2.length()) * 3);
        C23952 c23952 = new C23952(stringWriter, i, i2, "");
        try {
            c23952.f77534.write(str);
            c23952.f77532.write(str2);
            StringBuffer stringBuffer = c23952.f77533;
            StringBuffer stringBuffer2 = c23952.f77530;
            C1577 c1577 = c23952.f77532;
            C1577 c1578 = c23952.f77534;
            try {
                m53493(stringBuffer2, c1578);
                m53493(stringBuffer, c1577);
                c23952.m53492();
                m53493(stringBuffer2, c1578);
                while (stringBuffer2.length() != 0) {
                    c1577.write(10);
                    c23952.m53492();
                }
                m53493(stringBuffer, c1577);
                while (stringBuffer.length() != 0) {
                    c1578.write(10);
                    c23952.m53492();
                }
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("shouldn't happen", e2);
        }
    }

    public C23952(StringWriter stringWriter, int i, int i2, String str) {
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        StringWriter stringWriter2 = new StringWriter(1000);
        StringWriter stringWriter3 = new StringWriter(1000);
        this.f77535 = stringWriter;
        this.f77531 = i;
        this.f77530 = stringWriter2.getBuffer();
        this.f77533 = stringWriter3.getBuffer();
        this.f77534 = new C1577(stringWriter2, i, "");
        this.f77532 = new C1577(stringWriter3, i2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53492() throws IOException {
        StringBuffer stringBuffer;
        int iIndexOf;
        while (true) {
            StringBuffer stringBuffer2 = this.f77530;
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = (stringBuffer = this.f77533).indexOf("\n")) < 0) {
                return;
            }
            Writer writer = this.f77535;
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f77531 - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53493(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }
}
