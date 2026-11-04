package l;

import java.lang.ref.SoftReference;
import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: l.᩹ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O433 */
/* JADX INFO: loaded from: classes.dex */
public final class C23721 implements InterfaceC2263 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13477 f76874 = new C13477();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ResourceBundle f76875;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f76876;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4747 f76877;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC3782 f76878;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19991 f76879;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Locale f76880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 f76881;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14769 f76882;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23721 m52973(C4747 c4747) {
        AbstractC3782 c18698;
        C13477 c13477 = f76874;
        C23721 c23721 = (C23721) c4747.m14643(c13477);
        if (c23721 == null) {
            c23721 = new C23721((Locale) c4747.m14642(Locale.class));
            c23721.f76877 = c4747;
            c4747.m14646(c13477, c23721);
            C13015 c13015M32421 = C13015.m32421(c4747);
            if (c13015M32421.m32432("rawDiagnostics")) {
                c18698 = new C23458(c13015M32421);
            } else {
                c18698 = new C18698(c13015M32421, c23721);
            }
            c23721.f76878 = c18698;
        }
        return c23721;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Locale m52978() {
        return this.f76880;
    }

    public C23721() {
        this(null);
    }

    public C23721(Locale locale) {
        this.f76881 = C14769.m35543();
        this.f76876 = new HashMap();
        m52980("com.sun.tools.javac.resources.compiler");
        locale = locale == null ? Locale.getDefault() : locale;
        this.f76882 = m52979(locale);
        this.f76880 = locale;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52980(final String str) {
        InterfaceC16261 interfaceC16261 = new InterfaceC16261() { // from class: l.ܽᩳۘ
            @Override // l.InterfaceC16261
            /* JADX INFO: renamed from: ۙ */
            public final ResourceBundle mo38597(Locale locale) {
                return ResourceBundle.getBundle(str, locale);
            }
        };
        C14769 c14769 = this.f76881;
        c14769.getClass();
        this.f76881 = new C14769(interfaceC16261, c14769);
        HashMap map = this.f76876;
        if (!map.isEmpty()) {
            map.clear();
        }
        this.f76882 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m52979(Locale locale) {
        C14769 c14769;
        if (locale == this.f76880 && (c14769 = this.f76882) != null) {
            return c14769;
        }
        HashMap map = this.f76876;
        SoftReference softReference = (SoftReference) map.get(locale);
        C14769 c14769M35543 = softReference == null ? null : (C14769) softReference.get();
        if (c14769M35543 == null) {
            c14769M35543 = C14769.m35543();
            Iterator it = this.f76881.iterator();
            while (it.hasNext()) {
                try {
                    ResourceBundle resourceBundleMo38597 = ((InterfaceC16261) it.next()).mo38597(locale);
                    c14769M35543.getClass();
                    c14769M35543 = new C14769(resourceBundleMo38597, c14769M35543);
                } catch (MissingResourceException e) {
                    throw new C8449("Cannot find requested resource bundle for locale " + locale, e);
                }
            }
            map.put(locale, new SoftReference(c14769M35543));
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52975(String str, Object... objArr) {
        return m52976(this.f76880, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52977(AbstractC13695 abstractC13695) {
        String string = null;
        for (C14769 c14769M52979 = m52979(this.f76880); c14769M52979.m35550() && string == null; c14769M52979 = c14769M52979.f48336) {
            try {
                string = ((ResourceBundle) c14769M52979.f48335).getString(abstractC13695.m33485());
            } catch (MissingResourceException unused) {
            }
        }
        if (string == null) {
            string = "compiler message file broken: key=" + abstractC13695.m33485() + " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}";
        }
        if (abstractC13695 == C22843.f74152) {
            return MessageFormat.format(string, new Object[0]);
        }
        AbstractC3782 abstractC3782 = this.f76878;
        if (this.f76879 == null) {
            this.f76879 = C19991.m45972(this.f76877);
        }
        C19991 c19991 = this.f76879;
        C23393 c23393 = C23393.f75729;
        c19991.getClass();
        C17007 c17007M45976 = c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, (InterfaceC5075) null, abstractC13695);
        abstractC3782.getClass();
        return abstractC3782.mo12290(c17007M45976, this.f76880);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52976(Locale locale, String str, Object... objArr) {
        if (locale == null) {
            locale = this.f76880;
        }
        return m52972(m52979(locale), str, objArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52974(String str, Object... objArr) {
        try {
            if (f76875 == null) {
                f76875 = ResourceBundle.getBundle("com.sun.tools.javac.resources.compiler");
            }
            return m52972(C14769.of((Object) f76875), str, objArr);
        } catch (MissingResourceException e) {
            throw new Error("Fatal: Resource for compiler is missing", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52972(C14769 c14769, String str, Object... objArr) {
        String strM34865 = null;
        while (c14769.m35550() && strM34865 == null) {
            try {
                strM34865 = ((ResourceBundle) c14769.f48335).getString(str);
            } catch (MissingResourceException unused) {
            }
            c14769 = c14769.f48336;
        }
        if (strM34865 == null) {
            strM34865 = C14442.m34865("compiler message file broken: key=", str, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}");
        }
        return MessageFormat.format(strM34865, objArr);
    }
}
