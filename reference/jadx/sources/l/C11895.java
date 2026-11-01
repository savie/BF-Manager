package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A2DO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11895 extends AbstractC1994 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f39907 = 32;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39908 = 127;

    @Override // l.AbstractC1994
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6410(int i, StringWriter stringWriter) throws IOException {
        if (i >= this.f39907 && i <= this.f39908) {
            return false;
        }
        if (i > 65535) {
            char[] chars = Character.toChars(i);
            StringBuilder sb = new StringBuilder("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            sb.append(hexString.toUpperCase(locale));
            sb.append("\\u");
            sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            stringWriter.write(sb.toString());
            return true;
        }
        stringWriter.write("\\u");
        char[] cArr = AbstractC14696.f48014;
        stringWriter.write(cArr[(i >> 12) & 15]);
        stringWriter.write(cArr[(i >> 8) & 15]);
        stringWriter.write(cArr[(i >> 4) & 15]);
        stringWriter.write(cArr[i & 15]);
        return true;
    }
}
