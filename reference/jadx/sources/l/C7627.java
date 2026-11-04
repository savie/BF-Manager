package l;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.۟ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2E6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7627 extends AbstractC3152 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f25170 = EnumSet.copyOf((Collection) Collections.singletonList(EnumC0169.semiColonRequired));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet f25171;

    public C7627(EnumC0169... enumC0169Arr) {
        this.f25171 = Array.getLength(enumC0169Arr) == 0 ? f25170 : EnumSet.copyOf((Collection) Arrays.asList(enumC0169Arr));
    }

    @Override // l.AbstractC3152
    /* JADX INFO: renamed from: ۙ */
    public final int mo3683(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        int i2;
        int i3;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i4 = i + 2;
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i4 = i + 3;
                i2 = i4 != length ? 1 : 0;
            }
            int i5 = i4;
            while (i5 < length && ((charSequence.charAt(i5) >= '0' && charSequence.charAt(i5) <= '9') || ((charSequence.charAt(i5) >= 'a' && charSequence.charAt(i5) <= 'f') || (charSequence.charAt(i5) >= 'A' && charSequence.charAt(i5) <= 'F')))) {
                i5++;
            }
            int i6 = (i5 == length || charSequence.charAt(i5) != ';') ? 0 : 1;
            if (i6 == 0) {
                EnumC0169 enumC0169 = EnumC0169.semiColonRequired;
                EnumSet enumSet = this.f25171;
                if (!enumSet.contains(enumC0169)) {
                    if (enumSet.contains(EnumC0169.errorIfNoSemiColon)) {
                        throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                    }
                }
            }
            try {
                if (i2 != 0) {
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 16);
                } else {
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 10);
                }
                if (i3 > 65535) {
                    char[] chars = Character.toChars(i3);
                    stringWriter.write(chars[0]);
                    stringWriter.write(chars[1]);
                } else {
                    stringWriter.write(i3);
                }
                return ((i5 + 2) - i4) + i2 + i6;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
