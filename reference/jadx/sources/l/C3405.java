package l;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۗᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3405 extends AbstractC4132 {
    @Override // l.AbstractC4132
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10104(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        boolean z = false;
        if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
            stringWriter.write(charSequence.toString());
            return;
        }
        String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
        char[] cArr = C4838.f16996;
        if (!C6851.m18462((CharSequence) string)) {
            if (!((cArr == null ? 0 : Array.getLength(cArr)) == 0)) {
                int length = string.length();
                int length2 = cArr.length;
                int i = length - 1;
                int i2 = length2 - 1;
                loop0: for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = string.charAt(i3);
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (cArr[i4] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == string.charAt(i3 + 1)))) {
                            z = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        if (z) {
            stringWriter.write(C6851.m18458(string, C4838.f16995, C4838.f16997));
        } else {
            stringWriter.write(charSequence.toString());
        }
    }
}
