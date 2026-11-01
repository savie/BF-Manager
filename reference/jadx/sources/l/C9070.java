package l;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۡᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3GW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9070 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Writer f30927;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuffer f30928;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final StringBuffer f30929;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f30930;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1307 f30931;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1307 f30932;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23403(String str, int i, int i2, String str2) {
        StringWriter stringWriter = new StringWriter((str.length() + str2.length()) * 3);
        C9070 c9070 = new C9070(stringWriter, i, i2, "");
        try {
            c9070.f30931.write(str);
            c9070.f30932.write(str2);
            StringBuffer stringBuffer = c9070.f30929;
            StringBuffer stringBuffer2 = c9070.f30928;
            C1307 c1307 = c9070.f30932;
            C1307 c1308 = c9070.f30931;
            try {
                m23405(stringBuffer2, c1308);
                m23405(stringBuffer, c1307);
                c9070.m23404();
                m23405(stringBuffer2, c1308);
                while (stringBuffer2.length() != 0) {
                    c1307.write(10);
                    c9070.m23404();
                }
                m23405(stringBuffer, c1307);
                while (stringBuffer.length() != 0) {
                    c1308.write(10);
                    c9070.m23404();
                }
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("shouldn't happen", e2);
        }
    }

    public C9070(StringWriter stringWriter, int i, int i2, String str) {
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
        this.f30927 = stringWriter;
        this.f30930 = i;
        this.f30928 = stringWriter2.getBuffer();
        this.f30929 = stringWriter3.getBuffer();
        this.f30931 = new C1307(stringWriter2, i, "");
        this.f30932 = new C1307(stringWriter3, i2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23404() throws IOException {
        StringBuffer stringBuffer;
        int iIndexOf;
        while (true) {
            StringBuffer stringBuffer2 = this.f30928;
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = (stringBuffer = this.f30929).indexOf("\n")) < 0) {
                return;
            }
            Writer writer = this.f30927;
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f30930 - iIndexOf2; i > 0; i--) {
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
    public static void m23405(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }
}
