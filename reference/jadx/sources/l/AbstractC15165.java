package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15165 implements InterfaceC17615 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22531 f49524;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22926 f49528;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49527 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f49525 = C21825.m48588();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC9771 f49526 = new C3874(this);

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo15113(C11948 c11948, Locale locale);

    public AbstractC15165(C22531 c22531, C22926 c22926) {
        this.f49524 = c22531;
        this.f49528 = c22926;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m36375(C11948 c11948, Locale locale) {
        int i = C6697.f22587[c11948.m29767().ordinal()];
        if (i == 1) {
            return "";
        }
        C22531 c22531 = this.f49524;
        if (i == 2) {
            return c22531.m50051(locale, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return c22531.m50051(locale, "compiler.warn.warning", new Object[0]);
        }
        if (i != 4) {
            throw new AssertionError("Unknown diagnostic type: " + c11948.m29767());
        }
        return c22531.m50051(locale, "compiler.err.error", new Object[0]);
    }

    @Override // l.InterfaceC17615
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo36374(C11948 c11948, Locale locale) {
        this.f49525 = C21825.m48588();
        return mo15113(c11948, locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36366(C11948 c11948, boolean z) {
        InterfaceC2173 interfaceC2173M29762 = c11948.m29762();
        if (interfaceC2173M29762 == null) {
            throw new IllegalArgumentException();
        }
        if (z) {
            return interfaceC2173M29762.getName();
        }
        if (interfaceC2173M29762 instanceof AbstractC6344) {
            return ((AbstractC6344) interfaceC2173M29762).mo17451();
        }
        int i = AbstractC6344.f21400;
        String schemeSpecificPart = interfaceC2173M29762.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m36370(C11948 c11948, Locale locale) {
        C19003 c19003 = new C19003();
        for (Object obj : c11948.m29763()) {
            c19003.m43723(mo15111(c11948, obj, locale));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo15111(C11948 c11948, Object obj, Locale locale) {
        if (obj instanceof C11948) {
            C11948 c11949 = (C11948) obj;
            this.f49527++;
            try {
                return mo15112(c11949, locale);
            } finally {
                this.f49527--;
            }
        }
        if (obj instanceof AbstractC5930) {
            return m36364((AbstractC5930) obj);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            if (!(obj instanceof InterfaceC3800)) {
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Object obj2 : iterable) {
                    sb.append(str);
                    sb.append(mo15111(c11948, obj2, locale));
                    str = ",";
                }
                return sb.toString();
            }
        }
        if (obj instanceof AbstractC16579) {
            AbstractC9771 abstractC9771 = this.f49526;
            abstractC9771.getClass();
            return (String) ((AbstractC16579) obj).mo1928(abstractC9771, locale);
        }
        if (obj instanceof AbstractC23903) {
            AbstractC9771 abstractC9772 = this.f49526;
            abstractC9772.getClass();
            return (String) ((AbstractC23903) obj).mo2879(abstractC9772, locale);
        }
        if (obj instanceof InterfaceC2173) {
            return ((InterfaceC2173) obj).getName();
        }
        if (obj instanceof EnumC23528) {
            return ((EnumC23528) obj).f76178;
        }
        if (obj instanceof EnumC19730) {
            return ((EnumC19730) obj).f63414;
        }
        boolean z = obj instanceof InterfaceC11266;
        C22531 c22531 = this.f49524;
        if (z) {
            return ((InterfaceC11266) obj).mo2722(locale, c22531);
        }
        if (obj instanceof EnumC14128) {
            return ((EnumC14128) obj).f46387;
        }
        if (obj instanceof EnumC11909) {
            return ((EnumC11909) obj).f39974;
        }
        if (obj instanceof EnumC18651) {
            return c22531.m50051(locale, "compiler.misc.tree.tag." + ((EnumC18651) obj).name().toLowerCase(Locale.US), new Object[0]);
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36364(AbstractC5930 abstractC5930) {
        int i = C6697.f22588[abstractC5930.mo1803().ordinal()];
        if (i == 1) {
            return m36364(((C21077) abstractC5930).f68656);
        }
        if (i != 2 && i != 3 && i != 4) {
            C6171.m17174("unexpected tree kind " + abstractC5930.mo1801());
            throw null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            new C15830(stringWriter, false).m37631(abstractC5930, 0);
            String strReplaceAll = stringWriter.toString().trim().replaceAll("\\s+", " ").replaceAll("/\\*missing\\*/", "");
            if (strReplaceAll.length() < 20) {
                return strReplaceAll;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strReplaceAll.substring(0, 10));
            sb.append("[...]");
            return C0242.m1616(strReplaceAll.length() - 5, strReplaceAll, sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21825 m36369(C11948 c11948, Locale locale) {
        C21825 c21825M48588 = C21825.m48588();
        EnumC0681 enumC0681 = EnumC0681.DEPTH;
        C22926 c22926 = this.f49528;
        int iIntValue = ((Integer) c22926.f74521.get(enumC0681)).intValue();
        if (iIntValue != -1 && this.f49527 >= iIntValue) {
            return c21825M48588;
        }
        this.f49527++;
        try {
            int iIntValue2 = ((Integer) c22926.f74521.get(EnumC0681.LENGTH)).intValue();
            int i = 0;
            for (C11948 c11949 : c11948.mo5589()) {
                if (iIntValue2 != -1 && i >= iIntValue2) {
                    break;
                }
                c21825M48588 = c21825M48588.m48591((Object) mo15112(c11949, locale));
                i++;
            }
            this.f49527--;
            return c21825M48588;
        } catch (Throwable th) {
            this.f49527--;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36371(C11948 c11948, int i) {
        char c;
        StringBuilder sb = new StringBuilder();
        C22137 c22137M29761 = c11948.m29761();
        int iM29755 = c11948.m29755();
        if (c11948.m29755() == -1) {
            throw new AssertionError();
        }
        String str = null;
        if (c22137M29761 != null) {
            try {
                if (c22137M29761.mo14385(iM29755)) {
                    int i2 = c22137M29761.f71663;
                    while (i2 < c22137M29761.f71662 && (c = c22137M29761.f71658[i2]) != '\r' && c != '\n') {
                        i2++;
                    }
                    int i3 = c22137M29761.f71663;
                    int i4 = i2 - i3;
                    if (i4 != 0) {
                        String str2 = new String(c22137M29761.f71658, i3, i4);
                        c22137M29761.f71658 = null;
                        str = str2;
                    }
                }
                c22137M29761.f71658 = null;
            } catch (Throwable th) {
                c22137M29761.f71658 = null;
                throw th;
            }
        }
        if (str == null) {
            return "";
        }
        sb.append(m36363(i, str));
        int iM49094 = c22137M29761.m49094(iM29755, false);
        if (this.f49528.f74519) {
            sb.append("\n");
            for (int i5 = 0; i5 < iM49094 - 1; i5++) {
                sb.append(str.charAt(i5) == '\t' ? "\t" : " ");
            }
            sb.append(m36363(i, "^"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo15110(Locale locale, String str, Object... objArr) {
        return this.f49524.m50051(locale, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36372(C11948 c11948) {
        return (!EnumSet.copyOf(this.f49528.f74520).contains(EnumC20438.SOURCE) || c11948.m29767() == EnumC17198.FRAGMENT || c11948.m29755() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36362(int i) {
        if (i <= 24) {
            return "                        ".substring(0, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36363(int i, String str) {
        String strM36362 = m36362(i);
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        String str2 = "";
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArrSplit[i2];
            sb.append(str2);
            sb.append(strM36362 + str3);
            i2++;
            str2 = "\n";
        }
        return sb.toString();
    }

    @Override // l.InterfaceC17615
    public C22926 getConfiguration() {
        return this.f49528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36365(C11948 c11948, EnumC12677 enumC12677) {
        int iM29764;
        long lineNumber;
        C6171.m17176(((long) c11948.m29755()) != -1);
        int i = C6697.f22586[enumC12677.ordinal()];
        if (i == 1) {
            iM29764 = c11948.m29764();
        } else {
            if (i != 2) {
                if (i == 3) {
                    lineNumber = c11948.getLineNumber();
                } else if (i == 4) {
                    lineNumber = c11948.getColumnNumber();
                } else if (i == 5) {
                    iM29764 = c11948.m29755();
                } else {
                    throw new AssertionError("Unknown diagnostic position: " + enumC12677);
                }
                return String.valueOf(lineNumber);
            }
            iM29764 = c11948.m29769();
        }
        lineNumber = iM29764;
        return String.valueOf(lineNumber);
    }
}
