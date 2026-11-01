package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۡۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8815 extends AbstractC15165 {
    public C8815(C14770 c14770, C22531 c22531) {
        super(c22531, new C19398(c14770));
    }

    @Override // l.AbstractC15165
    /* JADX INFO: renamed from: ۚ */
    public final String mo15113(C11948 c11948, Locale locale) {
        boolean z;
        String strValueOf;
        C19398 c19398;
        EnumC18692 enumC18692;
        C22531 c22531 = this.f49524;
        if (locale == null) {
            locale = c22531.m50053();
        }
        C22137 c22137M29761 = c11948.m29761();
        String str = (String) ((C19398) super.getConfiguration()).f62537.get(EnumC18692.DEFAULT_NO_POS_FORMAT);
        if (c22137M29761 != null && c22137M29761 != C22137.f71655) {
            if (c11948.m29755() != -1) {
                c19398 = (C19398) super.getConfiguration();
                enumC18692 = EnumC18692.DEFAULT_POS_FORMAT;
            } else {
                InterfaceC2173 interfaceC2173 = c22137M29761.f71657;
                if (interfaceC2173 != null && interfaceC2173.mo6760() == EnumC11347.CLASS) {
                    c19398 = (C19398) super.getConfiguration();
                    enumC18692 = EnumC18692.DEFAULT_CLASS_FORMAT;
                }
            }
            str = (String) c19398.f62537.get(enumC18692);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%' || i >= str.length() - 1) {
                z = false;
            } else {
                i++;
                cCharAt = str.charAt(i);
                z = true;
            }
            if (!z) {
                strValueOf = String.valueOf(cCharAt);
            } else if (cCharAt != '%') {
                strValueOf = "";
                if (cCharAt == 'L') {
                    EnumC0597 enumC0597M29757 = c11948.m29757();
                    if (enumC0597M29757 != null) {
                        strValueOf = c22531.m50051(locale, "compiler.warn.lintOption", enumC0597M29757.f2616);
                    }
                } else if (cCharAt == '_') {
                    strValueOf = " ";
                } else if (cCharAt == 'b') {
                    strValueOf = AbstractC15165.m36366(c11948, false);
                } else if (cCharAt == 'c') {
                    strValueOf = AbstractC15165.m36365(c11948, EnumC12677.COLUMN);
                } else if (cCharAt == 'e') {
                    strValueOf = AbstractC15165.m36365(c11948, EnumC12677.END);
                } else if (cCharAt == 'f') {
                    strValueOf = AbstractC15165.m36366(c11948, true);
                } else if (cCharAt == 'l') {
                    strValueOf = AbstractC15165.m36365(c11948, EnumC12677.LINE);
                } else if (cCharAt == 'm') {
                    strValueOf = mo15112(c11948, locale);
                } else if (cCharAt == 'o') {
                    strValueOf = AbstractC15165.m36365(c11948, EnumC12677.OFFSET);
                } else if (cCharAt == 'p') {
                    strValueOf = m36375(c11948, locale);
                } else if (cCharAt == 's') {
                    strValueOf = AbstractC15165.m36365(c11948, EnumC12677.START);
                } else if (cCharAt != 't') {
                    strValueOf = String.valueOf(cCharAt);
                } else {
                    int i2 = C17986.f57521[c11948.m29767().ordinal()];
                    if (i2 != 1 && (i2 != 2 || c11948.m29755() == -1)) {
                        strValueOf = m36375(c11948, locale);
                    }
                }
            } else {
                strValueOf = "%";
            }
            sb.append(strValueOf);
            i++;
        }
        if (this.f49527 != 0) {
            return sb.toString();
        }
        String string = sb.toString();
        if (!m36372(c11948)) {
            return string;
        }
        String str2 = "\n" + m36371(c11948, ((C19398) super.getConfiguration()).m44447(EnumC20438.SOURCE));
        if (!string.contains("\n") || ((C19398) super.getConfiguration()).f62539 == EnumC8109.BOTTOM) {
            return C15489.m37076(string, str2);
        }
        return string.replaceFirst("\n", Matcher.quoteReplacement(str2) + "\n");
    }

    @Override // l.InterfaceC17615
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo15112(C11948 c11948, Locale locale) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = this.f49524.m50051(locale, c11948.mo29765(), m36370(c11948, locale).toArray()).split("\n");
        int iM44447 = 0;
        if (strArrSplit.length == 0) {
            strArrSplit = new String[]{""};
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf(((C19398) super.getConfiguration()).f74520);
        EnumC20438 enumC20438 = EnumC20438.SUMMARY;
        if (enumSetCopyOf.contains(enumC20438)) {
            int iM44448 = ((C19398) super.getConfiguration()).m44447(enumC20438);
            sb.append(AbstractC15165.m36363(iM44448, strArrSplit[0]));
            iM44447 = iM44448;
        }
        if (strArrSplit.length > 1) {
            EnumSet enumSetCopyOf2 = EnumSet.copyOf(((C19398) super.getConfiguration()).f74520);
            EnumC20438 enumC20439 = EnumC20438.DETAILS;
            if (enumSetCopyOf2.contains(enumC20439)) {
                iM44447 += ((C19398) super.getConfiguration()).m44447(enumC20439);
                for (int i = 1; i < strArrSplit.length; i++) {
                    sb.append("\n" + AbstractC15165.m36363(iM44447, strArrSplit[i]));
                }
            }
        }
        if (c11948 instanceof C1675) {
            EnumSet enumSetCopyOf3 = EnumSet.copyOf(((C19398) super.getConfiguration()).f74520);
            EnumC20438 enumC204310 = EnumC20438.SUBDIAGNOSTICS;
            if (enumSetCopyOf3.contains(enumC204310)) {
                int iM44449 = ((C19398) super.getConfiguration()).m44447(enumC204310) + iM44447;
                Iterator it = m36369(c11948, locale).iterator();
                while (it.hasNext()) {
                    sb.append("\n" + AbstractC15165.m36363(iM44449, (String) it.next()));
                }
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC15165, l.InterfaceC17615
    public final InterfaceC16910 getConfiguration() {
        return (C19398) super.getConfiguration();
    }

    @Override // l.AbstractC15165, l.InterfaceC17615
    public final C22926 getConfiguration() {
        return (C19398) super.getConfiguration();
    }
}
