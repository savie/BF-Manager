package l;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۛۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6136 extends AbstractC9863 {
    @Override // l.AbstractC9863
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17737(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        if (charSequence.charAt(0) == '\"') {
            if (charSequence.charAt(charSequence.length() - 1) == '\"') {
                String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
                char[] cArr = C24036.f77761;
                if (!C24276.m54286((CharSequence) string)) {
                    if (!((cArr != null ? Array.getLength(cArr) : 0) == 0)) {
                        int length = string.length();
                        int length2 = cArr.length;
                        int i = length - 1;
                        int i2 = length2 - 1;
                        for (int i3 = 0; i3 < length; i3++) {
                            char cCharAt = string.charAt(i3);
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (cArr[i4] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == string.charAt(i3 + 1)))) {
                                    stringWriter.write(AbstractC21292.f67894.m48531(string, C24036.f77760, C24036.f77762));
                                    return;
                                }
                            }
                        }
                    }
                }
                stringWriter.write(string);
                return;
            }
        }
        stringWriter.write(charSequence.toString());
    }
}
