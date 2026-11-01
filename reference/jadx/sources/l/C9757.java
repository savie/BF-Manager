package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۢᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9757 extends AbstractC4132 {
    @Override // l.AbstractC4132
    /* JADX INFO: renamed from: ۙ */
    public final void mo10104(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        String string = charSequence.toString();
        char[] cArr = C4838.f16996;
        if (string != null && cArr != null) {
            int length = string.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = string.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == string.charAt(i3 + 1)))) {
                        stringWriter.write(34);
                        stringWriter.write(C6851.m18458(string, C4838.f16997, C4838.f16995));
                        stringWriter.write(34);
                        return;
                    }
                }
            }
        }
        stringWriter.write(string);
    }
}
