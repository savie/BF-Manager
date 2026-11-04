package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۨۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12101 extends AbstractC9863 {
    @Override // l.AbstractC9863
    /* JADX INFO: renamed from: ۙ */
    public final void mo17737(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        String string = charSequence.toString();
        char[] cArr = C24036.f77761;
        int i = C24276.f78588;
        if (string != null && cArr != null) {
            int length = string.length();
            int i2 = length - 1;
            int length2 = cArr.length;
            int i3 = length2 - 1;
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = string.charAt(i4);
                for (int i5 = 0; i5 < length2; i5++) {
                    if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string.charAt(i4 + 1)))) {
                        stringWriter.write(34);
                        stringWriter.write(AbstractC21292.f67894.m48531(string, C24036.f77762, C24036.f77760));
                        stringWriter.write(34);
                        return;
                    }
                }
            }
        }
        stringWriter.write(string);
    }
}
