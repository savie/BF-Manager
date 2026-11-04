package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.Locale;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3782 implements InterfaceC20162 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23920 f12959;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23721 f12960;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12957 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f12956 = C14769.m35543();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC16146 f12958 = new C11985(this);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract String mo12289(C17007 c17007, Locale locale);

    public AbstractC3782(C23721 c23721, C23920 c23920) {
        this.f12960 = c23721;
        this.f12959 = c23920;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12288(C17007 c17007, Locale locale) {
        int i = C6020.f20578[c17007.m40089().ordinal()];
        if (i == 1) {
            return "";
        }
        C23721 c23721 = this.f12960;
        if (i == 2) {
            return c23721.m52976(locale, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return c23721.m52976(locale, "compiler.warn.warning", new Object[0]);
        }
        if (i != 4) {
            throw new AssertionError("Unknown diagnostic type: " + c17007.m40089());
        }
        return c23721.m52976(locale, "compiler.err.error", new Object[0]);
    }

    @Override // l.InterfaceC20162
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo12290(C17007 c17007, Locale locale) {
        this.f12956 = C14769.m35543();
        return mo12289(c17007, locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12278(C17007 c17007, boolean z) {
        InterfaceC15976 interfaceC15976M40086 = c17007.m40086();
        if (interfaceC15976M40086 == null) {
            throw new IllegalArgumentException();
        }
        if (z) {
            return interfaceC15976M40086.getName();
        }
        if (interfaceC15976M40086 instanceof AbstractC13234) {
            return ((AbstractC13234) interfaceC15976M40086).mo32790();
        }
        int i = AbstractC13234.f42297;
        String schemeSpecificPart = interfaceC15976M40086.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m12291(C17007 c17007, Locale locale) {
        C18499 c18499 = new C18499();
        for (Object obj : c17007.m40085()) {
            c18499.m43089(mo12284(c17007, obj, locale));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo12284(C17007 c17007, Object obj, Locale locale) {
        if (obj instanceof C17007) {
            C17007 c17008 = (C17007) obj;
            this.f12957++;
            try {
                return mo43485(c17008, locale);
            } finally {
                this.f12957--;
            }
        }
        if (obj instanceof AbstractC22295) {
            return m12279((AbstractC22295) obj);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            if (!(obj instanceof InterfaceC24329)) {
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Object obj2 : iterable) {
                    sb.append(str);
                    sb.append(mo12284(c17007, obj2, locale));
                    str = ",";
                }
                return sb.toString();
            }
        }
        if (obj instanceof AbstractC22664) {
            AbstractC16146 abstractC16146 = this.f12958;
            abstractC16146.getClass();
            return (String) ((AbstractC22664) obj).mo9324(abstractC16146, locale);
        }
        if (obj instanceof AbstractC11781) {
            AbstractC16146 abstractC16147 = this.f12958;
            abstractC16147.getClass();
            return (String) ((AbstractC11781) obj).mo16953(abstractC16147, locale);
        }
        if (obj instanceof InterfaceC15976) {
            return ((InterfaceC15976) obj).getName();
        }
        if (obj instanceof EnumC5865) {
            return ((EnumC5865) obj).f20120;
        }
        if (obj instanceof EnumC7687) {
            return ((EnumC7687) obj).f25368;
        }
        boolean z = obj instanceof InterfaceC13449;
        C23721 c23721 = this.f12960;
        if (z) {
            return ((InterfaceC13449) obj).mo15163(locale, c23721);
        }
        if (obj instanceof EnumC16305) {
            return ((EnumC16305) obj).f52944;
        }
        if (obj instanceof EnumC20820) {
            return ((EnumC20820) obj).f66685;
        }
        if (obj instanceof EnumC21461) {
            return c23721.m52976(locale, "compiler.misc.tree.tag." + ((EnumC21461) obj).name().toLowerCase(Locale.US), new Object[0]);
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12279(AbstractC22295 abstractC22295) {
        int i = C6020.f20579[abstractC22295.mo2285().ordinal()];
        if (i == 1) {
            return m12279(((C1412) abstractC22295).f4986);
        }
        if (i != 2 && i != 3 && i != 4) {
            C11972.m30024("unexpected tree kind " + abstractC22295.mo2283());
            throw null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            new C9526(stringWriter, false).m24928(abstractC22295, 0);
            String strReplaceAll = stringWriter.toString().trim().replaceAll("\\s+", " ").replaceAll("/\\*missing\\*/", "");
            if (strReplaceAll.length() < 20) {
                return strReplaceAll;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strReplaceAll.substring(0, 10));
            sb.append("[...]");
            return ExternalValue$$ExternalSyntheticOutline0.m(strReplaceAll.length() - 5, strReplaceAll, sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14769 m12287(C17007 c17007, Locale locale) {
        C14769 c14769M35543 = C14769.m35543();
        EnumC22400 enumC22400 = EnumC22400.DEPTH;
        C23920 c23920 = this.f12959;
        int iIntValue = ((Integer) c23920.f77434.get(enumC22400)).intValue();
        if (iIntValue != -1 && this.f12957 >= iIntValue) {
            return c14769M35543;
        }
        this.f12957++;
        try {
            int iIntValue2 = ((Integer) c23920.f77434.get(EnumC22400.LENGTH)).intValue();
            int i = 0;
            for (C17007 c17008 : c17007.mo32825()) {
                if (iIntValue2 != -1 && i >= iIntValue2) {
                    break;
                }
                c14769M35543 = c14769M35543.m35546((Object) mo43485(c17008, locale));
                i++;
            }
            this.f12957--;
            return c14769M35543;
        } catch (Throwable th) {
            this.f12957--;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12283(C17007 c17007, int i) {
        char c;
        StringBuilder sb = new StringBuilder();
        C23393 c23393M40091 = c17007.m40091();
        int iM40087 = c17007.m40087();
        if (c17007.m40087() == -1) {
            throw new AssertionError();
        }
        String str = null;
        if (c23393M40091 != null) {
            try {
                if (c23393M40091.mo37956(iM40087)) {
                    int i2 = c23393M40091.f75734;
                    while (i2 < c23393M40091.f75736 && (c = c23393M40091.f75730[i2]) != '\r' && c != '\n') {
                        i2++;
                    }
                    int i3 = c23393M40091.f75734;
                    int i4 = i2 - i3;
                    if (i4 != 0) {
                        String str2 = new String(c23393M40091.f75730, i3, i4);
                        c23393M40091.f75730 = null;
                        str = str2;
                    }
                }
                c23393M40091.f75730 = null;
            } catch (Throwable th) {
                c23393M40091.f75730 = null;
                throw th;
            }
        }
        if (str == null) {
            return "";
        }
        sb.append(m12276(i, str));
        int iM52572 = c23393M40091.m52572(iM40087, false);
        if (this.f12959.f77432) {
            sb.append("\n");
            for (int i5 = 0; i5 < iM52572 - 1; i5++) {
                sb.append(str.charAt(i5) == '\t' ? "\t" : " ");
            }
            sb.append(m12276(i, "^"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo12282(Locale locale, String str, Object... objArr) {
        return this.f12960.m52976(locale, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12285(C17007 c17007) {
        return (!EnumSet.copyOf(this.f12959.f77433).contains(EnumC5246.SOURCE) || c17007.m40089() == EnumC22229.FRAGMENT || c17007.m40087() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12275(int i) {
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
    public static String m12276(int i, String str) {
        String strM12275 = m12275(i);
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        String str2 = "";
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArrSplit[i2];
            sb.append(str2);
            sb.append(strM12275 + str3);
            i2++;
            str2 = "\n";
        }
        return sb.toString();
    }

    @Override // l.InterfaceC20162
    public C23920 getConfiguration() {
        return this.f12959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12277(C17007 c17007, EnumC23146 enumC23146) {
        int iM40084;
        long lineNumber;
        C11972.m30026(((long) c17007.m40087()) != -1);
        int i = C6020.f20577[enumC23146.ordinal()];
        if (i == 1) {
            iM40084 = c17007.m40084();
        } else {
            if (i != 2) {
                if (i == 3) {
                    lineNumber = c17007.getLineNumber();
                } else if (i == 4) {
                    lineNumber = c17007.getColumnNumber();
                } else if (i == 5) {
                    iM40084 = c17007.m40087();
                } else {
                    throw new AssertionError("Unknown diagnostic position: " + enumC23146);
                }
                return String.valueOf(lineNumber);
            }
            iM40084 = c17007.m40088();
        }
        lineNumber = iM40084;
        return String.valueOf(lineNumber);
    }
}
