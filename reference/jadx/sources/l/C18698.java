package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ᩳ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18698 extends AbstractC3782 {
    public C18698(C13015 c13015, C23721 c23721) {
        super(c23721, new C7511(c13015));
    }

    @Override // l.AbstractC3782
    /* JADX INFO: renamed from: ᩴ */
    public final String mo12289(C17007 c17007, Locale locale) {
        boolean z;
        String strValueOf;
        C7511 c7511;
        EnumC17952 enumC17952;
        C23721 c23721 = this.f12960;
        if (locale == null) {
            locale = c23721.m52978();
        }
        C23393 c23393M40091 = c17007.m40091();
        String str = (String) ((C7511) super.getConfiguration()).f24817.get(EnumC17952.DEFAULT_NO_POS_FORMAT);
        if (c23393M40091 != null && c23393M40091 != C23393.f75729) {
            if (c17007.m40087() != -1) {
                c7511 = (C7511) super.getConfiguration();
                enumC17952 = EnumC17952.DEFAULT_POS_FORMAT;
            } else {
                InterfaceC15976 interfaceC15976 = c23393M40091.f75737;
                if (interfaceC15976 != null && interfaceC15976.mo10885() == EnumC17468.CLASS) {
                    c7511 = (C7511) super.getConfiguration();
                    enumC17952 = EnumC17952.DEFAULT_CLASS_FORMAT;
                }
            }
            str = (String) c7511.f24817.get(enumC17952);
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
                    EnumC19876 enumC19876M40082 = c17007.m40082();
                    if (enumC19876M40082 != null) {
                        strValueOf = c23721.m52976(locale, "compiler.warn.lintOption", enumC19876M40082.f63945);
                    }
                } else if (cCharAt == '_') {
                    strValueOf = " ";
                } else if (cCharAt == 'b') {
                    strValueOf = AbstractC3782.m12278(c17007, false);
                } else if (cCharAt == 'c') {
                    strValueOf = AbstractC3782.m12277(c17007, EnumC23146.COLUMN);
                } else if (cCharAt == 'e') {
                    strValueOf = AbstractC3782.m12277(c17007, EnumC23146.END);
                } else if (cCharAt == 'f') {
                    strValueOf = AbstractC3782.m12278(c17007, true);
                } else if (cCharAt == 'l') {
                    strValueOf = AbstractC3782.m12277(c17007, EnumC23146.LINE);
                } else if (cCharAt == 'm') {
                    strValueOf = mo43485(c17007, locale);
                } else if (cCharAt == 'o') {
                    strValueOf = AbstractC3782.m12277(c17007, EnumC23146.OFFSET);
                } else if (cCharAt == 'p') {
                    strValueOf = m12288(c17007, locale);
                } else if (cCharAt == 's') {
                    strValueOf = AbstractC3782.m12277(c17007, EnumC23146.START);
                } else if (cCharAt != 't') {
                    strValueOf = String.valueOf(cCharAt);
                } else {
                    int i2 = C20936.f66984[c17007.m40089().ordinal()];
                    if (i2 != 1 && (i2 != 2 || c17007.m40087() == -1)) {
                        strValueOf = m12288(c17007, locale);
                    }
                }
            } else {
                strValueOf = "%";
            }
            sb.append(strValueOf);
            i++;
        }
        if (this.f12957 != 0) {
            return sb.toString();
        }
        String string = sb.toString();
        if (!m12285(c17007)) {
            return string;
        }
        String str2 = "\n" + m12283(c17007, ((C7511) super.getConfiguration()).m20566(EnumC5246.SOURCE));
        if (!string.contains("\n") || ((C7511) super.getConfiguration()).f24815 == EnumC0053.BOTTOM) {
            return C14483.m34972(string, str2);
        }
        return string.replaceFirst("\n", Matcher.quoteReplacement(str2) + "\n");
    }

    @Override // l.InterfaceC20162
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo43485(C17007 c17007, Locale locale) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = this.f12960.m52976(locale, c17007.mo32405(), m12291(c17007, locale).toArray()).split("\n");
        int iM20566 = 0;
        if (strArrSplit.length == 0) {
            strArrSplit = new String[]{""};
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf(((C7511) super.getConfiguration()).f77433);
        EnumC5246 enumC5246 = EnumC5246.SUMMARY;
        if (enumSetCopyOf.contains(enumC5246)) {
            int iM20567 = ((C7511) super.getConfiguration()).m20566(enumC5246);
            sb.append(AbstractC3782.m12276(iM20567, strArrSplit[0]));
            iM20566 = iM20567;
        }
        if (strArrSplit.length > 1) {
            EnumSet enumSetCopyOf2 = EnumSet.copyOf(((C7511) super.getConfiguration()).f77433);
            EnumC5246 enumC5247 = EnumC5246.DETAILS;
            if (enumSetCopyOf2.contains(enumC5247)) {
                iM20566 += ((C7511) super.getConfiguration()).m20566(enumC5247);
                for (int i = 1; i < strArrSplit.length; i++) {
                    sb.append("\n" + AbstractC3782.m12276(iM20566, strArrSplit[i]));
                }
            }
        }
        if (c17007 instanceof C13278) {
            EnumSet enumSetCopyOf3 = EnumSet.copyOf(((C7511) super.getConfiguration()).f77433);
            EnumC5246 enumC5248 = EnumC5246.SUBDIAGNOSTICS;
            if (enumSetCopyOf3.contains(enumC5248)) {
                int iM20568 = ((C7511) super.getConfiguration()).m20566(enumC5248) + iM20566;
                Iterator it = m12287(c17007, locale).iterator();
                while (it.hasNext()) {
                    sb.append("\n" + AbstractC3782.m12276(iM20568, (String) it.next()));
                }
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC3782, l.InterfaceC20162
    public final InterfaceC11211 getConfiguration() {
        return (C7511) super.getConfiguration();
    }

    @Override // l.AbstractC3782, l.InterfaceC20162
    public final C23920 getConfiguration() {
        return (C7511) super.getConfiguration();
    }
}
