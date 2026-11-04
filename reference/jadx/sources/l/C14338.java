package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A2DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C14338 extends AbstractC20306 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f45230 = 32;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f45231;

    public C14338(int i) {
        this.f45231 = i;
    }

    @Override // l.AbstractC20306
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24271(int i, StringWriter stringWriter) throws IOException {
        if (i >= this.f45230 && i <= this.f45231) {
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
        char[] cArr = AbstractC3152.f10217;
        stringWriter.write(cArr[(i >> 12) & 15]);
        stringWriter.write(cArr[(i >> 8) & 15]);
        stringWriter.write(cArr[(i >> 4) & 15]);
        stringWriter.write(cArr[i & 15]);
        return true;
    }
}
