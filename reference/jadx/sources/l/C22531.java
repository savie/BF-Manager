package l;

import java.lang.ref.SoftReference;
import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: l.᩹᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O433 */
/* JADX INFO: loaded from: classes.dex */
public final class C22531 implements InterfaceC14794 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C16576 f73496 = new C16576();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static ResourceBundle f73497;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC15165 f73498;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21825 f73499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f73500;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Locale f73501;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12343 f73502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 f73503;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23549 f73504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22531 m50048(C12343 c12343) {
        AbstractC15165 c8815;
        C16576 c16576 = f73496;
        C22531 c22531 = (C22531) c12343.m30656(c16576);
        if (c22531 == null) {
            c22531 = new C22531((Locale) c12343.m30655(Locale.class));
            c22531.f73502 = c12343;
            c12343.m30659(c16576, c22531);
            C14770 c14770M35395 = C14770.m35395(c12343);
            if (c14770M35395.m35407("rawDiagnostics")) {
                c8815 = new C5451(c14770M35395);
            } else {
                c8815 = new C8815(c14770M35395, c22531);
            }
            c22531.f73498 = c8815;
        }
        return c22531;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Locale m50053() {
        return this.f73501;
    }

    public C22531() {
        this(null);
    }

    public C22531(Locale locale) {
        this.f73503 = C21825.m48588();
        this.f73500 = new HashMap();
        m50055("com.sun.tools.javac.resources.compiler");
        locale = locale == null ? Locale.getDefault() : locale;
        this.f73499 = m50054(locale);
        this.f73501 = locale;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50055(final String str) {
        InterfaceC5597 interfaceC5597 = new InterfaceC5597() { // from class: l.ۖ᩷۟
            @Override // l.InterfaceC5597
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final ResourceBundle mo8450(Locale locale) {
                return ResourceBundle.getBundle(str, locale);
            }
        };
        C21825 c21825 = this.f73503;
        c21825.getClass();
        this.f73503 = new C21825(interfaceC5597, c21825);
        HashMap map = this.f73500;
        if (!map.isEmpty()) {
            map.clear();
        }
        this.f73499 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m50054(Locale locale) {
        C21825 c21825;
        if (locale == this.f73501 && (c21825 = this.f73499) != null) {
            return c21825;
        }
        HashMap map = this.f73500;
        SoftReference softReference = (SoftReference) map.get(locale);
        C21825 c21825M48588 = softReference == null ? null : (C21825) softReference.get();
        if (c21825M48588 == null) {
            c21825M48588 = C21825.m48588();
            Iterator it = this.f73503.iterator();
            while (it.hasNext()) {
                try {
                    ResourceBundle resourceBundleMo8450 = ((InterfaceC5597) it.next()).mo8450(locale);
                    c21825M48588.getClass();
                    c21825M48588 = new C21825(resourceBundleMo8450, c21825M48588);
                } catch (MissingResourceException e) {
                    throw new C7738("Cannot find requested resource bundle for locale " + locale, e);
                }
            }
            map.put(locale, new SoftReference(c21825M48588));
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50050(String str, Object... objArr) {
        return m50051(this.f73501, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50052(AbstractC16493 abstractC16493) {
        String string = null;
        for (C21825 c21825M50054 = m50054(this.f73501); c21825M50054.m48595() && string == null; c21825M50054 = c21825M50054.f70877) {
            try {
                string = ((ResourceBundle) c21825M50054.f70876).getString(abstractC16493.m38768());
            } catch (MissingResourceException unused) {
            }
        }
        if (string == null) {
            string = "compiler message file broken: key=" + abstractC16493.m38768() + " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}";
        }
        if (abstractC16493 == C23879.f77336) {
            return MessageFormat.format(string, new Object[0]);
        }
        AbstractC15165 abstractC15165 = this.f73498;
        if (this.f73504 == null) {
            this.f73504 = C23549.m51906(this.f73502);
        }
        C23549 c23549 = this.f73504;
        C22137 c22137 = C22137.f71655;
        c23549.getClass();
        C11948 c11948M51909 = c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, (InterfaceC12260) null, abstractC16493);
        abstractC15165.getClass();
        return abstractC15165.mo36374(c11948M51909, this.f73501);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50051(Locale locale, String str, Object... objArr) {
        if (locale == null) {
            locale = this.f73501;
        }
        return m50047(m50054(locale), str, objArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m50049(String str, Object... objArr) {
        try {
            if (f73497 == null) {
                f73497 = ResourceBundle.getBundle("com.sun.tools.javac.resources.compiler");
            }
            return m50047(C21825.of((Object) f73497), str, objArr);
        } catch (MissingResourceException e) {
            throw new Error("Fatal: Resource for compiler is missing", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50047(C21825 c21825, String str, Object... objArr) {
        String strM38890 = null;
        while (c21825.m48595() && strM38890 == null) {
            try {
                strM38890 = ((ResourceBundle) c21825.f70876).getString(str);
            } catch (MissingResourceException unused) {
            }
            c21825 = c21825.f70877;
        }
        if (strM38890 == null) {
            strM38890 = C16523.m38890("compiler message file broken: key=", str, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}");
        }
        return MessageFormat.format(strM38890, objArr);
    }
}
