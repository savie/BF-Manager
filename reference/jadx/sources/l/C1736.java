package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1736 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String f6856 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f6857 = new HashMap();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f6858;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f6859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15432 f6860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f6861;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f6862;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6863 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f6864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m5755(String str) {
        AbstractC20745 abstractC20745M5763 = m5763();
        if (abstractC20745M5763.m46723()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        if (abstractC20745M5763.mo33975()) {
            m5752(abstractC20745M5763);
            for (AbstractC20745 abstractC20745 : abstractC20745M5763.mo33983(true)) {
                if (m5766(abstractC20745.getName()) && abstractC20745.mo33974() && !abstractC20745.m46723()) {
                    C1736 c1736 = new C1736(abstractC20745, abstractC20745.getName());
                    if (!abstractC20745.getName().equals(str) || !c1736.m5782()) {
                        try {
                            c1736.m5783();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static synchronized C1736 m5770() {
        C1736 c1736;
        AbstractC20745 abstractC20745M5763 = m5763();
        if (abstractC20745M5763.m46723()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        abstractC20745M5763.m46739();
        m5752(abstractC20745M5763);
        for (int i = 0; i < 100; i++) {
            String string = UUID.randomUUID().toString();
            AbstractC20745 abstractC20745M46690 = abstractC20745M5763.m46690(string);
            if (!abstractC20745M46690.mo33975()) {
                if (abstractC20745M46690.mo33987()) {
                    c1736 = new C1736(abstractC20745M46690, string);
                    try {
                        c1736.m5772();
                        AbstractC20745 abstractC20745 = c1736.f6859;
                        m5760(abstractC20745, "Hex session owner file is unsafe");
                        abstractC20745.m46735(f6856);
                    } catch (IOException e) {
                        try {
                            c1736.m5783();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } else if (!abstractC20745M46690.mo33975()) {
                    throw new IOException("Unable to create hex session directory");
                }
            }
        }
        throw new IOException("Unable to allocate hex session token");
        return c1736;
    }

    public C1736(AbstractC20745 abstractC20745, String str) {
        this.f6858 = str;
        this.f6861 = abstractC20745;
        this.f6862 = abstractC20745.m46690("checkpoint");
        this.f6864 = abstractC20745.m46690("state.tmp");
        this.f6860 = abstractC20745.m46690("base").m46724();
        this.f6859 = abstractC20745.m46690("owner");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5757(String str, InterfaceC5614 interfaceC5614) throws IOException {
        C23610 c23610;
        while (!interfaceC5614.mo2357()) {
            synchronized (C1736.class) {
                c23610 = (C23610) f6857.get(str);
            }
            if (c23610 != null) {
                EnumC10910 enumC10910M52076 = c23610.m52076(interfaceC5614);
                if (enumC10910M52076 != EnumC10910.SUPERSEDED) {
                    if (enumC10910M52076 != EnumC10910.COMMITTED) {
                        throw c23610.m52075();
                    }
                    return;
                }
            } else {
                if (interfaceC5614.mo2357()) {
                    throw new C1105();
                }
                return;
            }
        }
        throw new C1105();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5758(InterfaceC5614 interfaceC5614) throws C1105 {
        if (interfaceC5614.mo2357()) {
            throw new C1105();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m5780() {
        return this.f6858;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15432 m5776() {
        return this.f6860;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m5775() {
        AbstractC20745 abstractC20745 = this.f6862;
        return abstractC20745.mo33971() && !abstractC20745.m46723();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m5782() {
        boolean zM52082;
        synchronized (C1736.class) {
            C23610 c23610 = (C23610) f6857.get(this.f6858);
            zM52082 = c23610 != null ? c23610.m52082() : m5775();
        }
        return zM52082;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23610 m5779() throws IOException {
        m5772();
        AbstractC20745 abstractC20745M46690 = this.f6861.m46690("state-" + UUID.randomUUID() + ".tmp");
        m5760(abstractC20745M46690, "Hex pending state file is unsafe");
        C23610 c23610 = new C23610(this, abstractC20745M46690);
        synchronized (C1736.class) {
            HashMap map = f6857;
            C23610 c23611 = (C23610) map.get(this.f6858);
            if (c23611 != null && c23611.f76499) {
                throw new IOException("Hex session deletion was requested");
            }
            map.put(this.f6858, c23610);
            if (c23611 != null) {
                C23610.m52073(c23611);
            }
        }
        return c23610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13163 m5778(C20559 c20559) throws IOException {
        C5970 c5970;
        m5772();
        if (!this.f6862.mo33971() || this.f6862.m46723()) {
            throw new IOException("Hex session checkpoint is unavailable");
        }
        synchronized (this.f6863) {
            c5970 = new C5970(this.f6862, c20559);
            this.f6863.add(c5970.f20332);
        }
        return c5970;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m5777() throws IOException {
        m5772();
        AbstractC20745 abstractC20745 = this.f6862;
        if (!abstractC20745.mo33971() || abstractC20745.m46723()) {
            throw new IOException("Hex session checkpoint does not exist: " + this.f6858);
        }
        return new BufferedInputStream(abstractC20745.mo33970());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m5761(C1736 c1736) {
        synchronized (c1736.f6863) {
            Iterator it = c1736.f6863.iterator();
            while (it.hasNext()) {
                try {
                    ((C14438) it.next()).m34723();
                } catch (IOException unused) {
                }
            }
            c1736.f6863.clear();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m5784() {
        synchronized (this.f6863) {
            Iterator it = this.f6863.iterator();
            while (it.hasNext()) {
                if (((C14438) it.next()).m34722()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5781() throws IOException {
        synchronized (C1736.class) {
            C23610 c23610 = (C23610) f6857.get(this.f6858);
            if (c23610 != null) {
                C23610.m52071(c23610, false);
            } else {
                m5771();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m5771() throws IOException {
        m5772();
        try {
            m5765(this.f6864);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            m5765(this.f6862);
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5783() throws IOException {
        synchronized (C1736.class) {
            C23610 c23610 = (C23610) f6857.get(this.f6858);
            if (c23610 != null) {
                C23610.m52071(c23610, true);
            } else {
                m5773();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5756(String str, Exception exc) {
        if ((exc instanceof C1105) || !m5766(str)) {
            return;
        }
        try {
            m5768(str);
        } catch (IOException e) {
            exc.addSuppressed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m5773() throws IOException {
        AbstractC20745 abstractC20745 = this.f6861;
        if (abstractC20745.m46723() || abstractC20745.mo33975()) {
            m5752(m5763());
            m5765(abstractC20745);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m5763() {
        return C11904.f39938.m46690("hex-sessions");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m5752(AbstractC20745 abstractC20745) throws IOException {
        if (!abstractC20745.mo33974() || abstractC20745.m46723()) {
            throw new IOException("Hex session root directory is unavailable");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1736 m5753(String str, C14915 c14915) throws IOException {
        C1736 c1736;
        if (m5766(str)) {
            m5757(str, C11965.m29777(c14915));
            synchronized (C1736.class) {
                AbstractC20745 abstractC20745M5763 = m5763();
                m5752(abstractC20745M5763);
                AbstractC20745 abstractC20745M46690 = abstractC20745M5763.m46690(str);
                if (!abstractC20745M46690.mo33974() || abstractC20745M46690.m46723()) {
                    throw new IOException("Hex session does not exist: " + str);
                }
                c1736 = new C1736(abstractC20745M46690, str);
                String str2 = f6856;
                AbstractC20745 abstractC20745 = c1736.f6859;
                String strM46730 = null;
                if (abstractC20745.mo33971() && !abstractC20745.m46723()) {
                    try {
                        strM46730 = abstractC20745.m46730();
                    } catch (IOException unused) {
                    }
                }
                if (!str2.equals(strM46730)) {
                    c1736.m5774();
                }
                c1736.m5772();
                AbstractC20745 abstractC20746 = c1736.f6859;
                m5760(abstractC20746, "Hex session owner file is unsafe");
                abstractC20746.m46735(f6856);
            }
            return c1736;
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5768(String str) {
        if (m5766(str)) {
            synchronized (C1736.class) {
                C23610 c23610 = (C23610) f6857.get(str);
                if (c23610 != null) {
                    C23610.m52071(c23610, true);
                    return;
                }
                AbstractC20745 abstractC20745M5763 = m5763();
                if (abstractC20745M5763.mo33975()) {
                    m5752(abstractC20745M5763);
                    AbstractC20745 abstractC20745M46690 = abstractC20745M5763.m46690(str);
                    if (abstractC20745M46690.mo33974() && !abstractC20745M46690.m46723()) {
                        new C1736(abstractC20745M46690, str).m5773();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5766(String str) {
        if (str == null || str.length() != 36) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 8 || i == 13 || i == 18 || i == 23) {
                if (cCharAt != '-') {
                    return false;
                }
            } else if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m5772() throws IOException {
        m5752(m5763());
        AbstractC20745 abstractC20745 = this.f6861;
        if (!abstractC20745.mo33974() || abstractC20745.m46723()) {
            throw new IOException("Hex session directory is unavailable: " + this.f6858);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m5774() {
        try {
            for (AbstractC20745 abstractC20745 : this.f6861.mo33983(true)) {
                String name = abstractC20745.getName();
                if ("state.tmp".equals(name)) {
                    m5765(abstractC20745);
                } else {
                    int length = name.length() - 4;
                    if ((name.startsWith("state-") && name.endsWith(".tmp") && length > 6 && m5766(name.substring(6, length))) || name.endsWith(".hex-base.tmp")) {
                        try {
                            m5765(abstractC20745);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5760(AbstractC20745 abstractC20745, String str) throws IOException {
        if (abstractC20745.m46723() || (abstractC20745.mo33975() && !abstractC20745.mo33971())) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m5765(AbstractC20745 abstractC20745) throws IOException {
        boolean zM46723 = abstractC20745.m46723();
        if (zM46723 || abstractC20745.mo33975()) {
            if (abstractC20745.mo33974() && !zM46723) {
                Iterator it = abstractC20745.mo33983(true).iterator();
                while (it.hasNext()) {
                    m5765((AbstractC20745) it.next());
                }
            }
            if (zM46723 || abstractC20745.mo33975()) {
                if (zM46723) {
                    if (abstractC20745.mo24644()) {
                        return;
                    }
                } else if (abstractC20745.mo24647()) {
                    return;
                }
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete hex session path: ")));
            }
        }
    }
}
