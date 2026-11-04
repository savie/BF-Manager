package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ܶۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16028 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f51989 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f51990 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1161 f51991;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f51992;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f51993;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f51994;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f51995;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f51996 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f51997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38155(String str) {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("hex-sessions");
        if (abstractC22044M49876.m49860()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        if (abstractC22044M49876.mo2934()) {
            m38169(abstractC22044M49876);
            for (AbstractC22044 abstractC22044 : abstractC22044M49876.mo4299(true)) {
                if (m38177(abstractC22044.getName()) && abstractC22044.mo4281() && !abstractC22044.m49860()) {
                    C16028 c16028 = new C16028(abstractC22044, abstractC22044.getName());
                    if (!abstractC22044.getName().equals(str) || !c16028.m38183()) {
                        try {
                            c16028.m38188();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized C16028 m38167() {
        return m38161(C6382.f21568.m49876("hex-compare-sessions"));
    }

    public C16028(AbstractC22044 abstractC22044, String str) {
        this.f51993 = str;
        this.f51995 = abstractC22044;
        this.f51992 = abstractC22044.m49876("checkpoint");
        this.f51994 = abstractC22044.m49876("state.tmp");
        this.f51991 = abstractC22044.m49876("base").m49861();
        this.f51997 = abstractC22044.m49876("owner");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C16028 m38161(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.m49860()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        abstractC22044.m49853();
        m38169(abstractC22044);
        for (int i = 0; i < 100; i++) {
            String string = UUID.randomUUID().toString();
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(string);
            if (!abstractC22044M49876.mo2934()) {
                if (abstractC22044M49876.mo4274()) {
                    C16028 c16028 = new C16028(abstractC22044M49876, string);
                    try {
                        c16028.m38151();
                        AbstractC22044 abstractC22045 = c16028.f51997;
                        m38174(abstractC22045, "Hex session owner file is unsafe");
                        abstractC22045.m49879(f51989);
                        return c16028;
                    } catch (IOException e) {
                        try {
                            c16028.m38188();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                }
                if (!abstractC22044M49876.mo2934()) {
                    throw new IOException("Unable to create hex session directory");
                }
            }
        }
        throw new IOException("Unable to allocate hex session token");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38157(String str, InterfaceC7509 interfaceC7509) throws IOException {
        C16774 c16774;
        while (!interfaceC7509.mo924()) {
            synchronized (C16028.class) {
                c16774 = (C16774) f51990.get(str);
            }
            if (c16774 != null) {
                EnumC24980 enumC24980M39599 = c16774.m39599(interfaceC7509);
                if (enumC24980M39599 != EnumC24980.SUPERSEDED) {
                    if (enumC24980M39599 != EnumC24980.COMMITTED) {
                        throw c16774.m39598();
                    }
                    return;
                }
            } else {
                if (interfaceC7509.mo924()) {
                    throw new C9446();
                }
                return;
            }
        }
        throw new C9446();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38158(InterfaceC7509 interfaceC7509) throws C9446 {
        if (interfaceC7509.mo924()) {
            throw new C9446();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m38187() {
        return this.f51993;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1161 m38189() {
        return this.f51991;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m38185() {
        AbstractC22044 abstractC22044 = this.f51992;
        return abstractC22044.mo4304() && !abstractC22044.m49860();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m38183() {
        boolean zM39604;
        synchronized (C16028.class) {
            C16774 c16774 = (C16774) f51990.get(this.f51993);
            zM39604 = c16774 != null ? c16774.m39604() : m38185();
        }
        return zM39604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16774 m38182() {
        m38151();
        AbstractC22044 abstractC22044M49876 = this.f51995.m49876("state-" + UUID.randomUUID() + ".tmp");
        m38174(abstractC22044M49876, "Hex pending state file is unsafe");
        C16774 c16774 = new C16774(this, abstractC22044M49876);
        synchronized (C16028.class) {
            HashMap map = f51990;
            C16774 c16775 = (C16774) map.get(this.f51993);
            if (c16775 != null && c16775.f54138) {
                throw new IOException("Hex session deletion was requested");
            }
            map.put(this.f51993, c16774);
            if (c16775 != null) {
                C16774.m39597(c16775);
            }
        }
        return c16774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9578 m38181(LongSupplier longSupplier) throws IOException {
        C11553 c11553;
        m38151();
        if (!this.f51992.mo4304() || this.f51992.m49860()) {
            throw new IOException("Hex session checkpoint is unavailable");
        }
        synchronized (this.f51996) {
            c11553 = new C11553(this.f51992, longSupplier);
            this.f51996.add(c11553.f36335);
        }
        return c11553;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m38180() throws IOException {
        m38151();
        AbstractC22044 abstractC22044 = this.f51992;
        if (!abstractC22044.mo4304() || abstractC22044.m49860()) {
            throw new IOException("Hex session checkpoint does not exist: " + this.f51993);
        }
        return new BufferedInputStream(abstractC22044.mo4290());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m38168(C16028 c16028) {
        synchronized (c16028.f51996) {
            Iterator it = c16028.f51996.iterator();
            while (it.hasNext()) {
                try {
                    ((C17520) it.next()).m41138();
                } catch (IOException unused) {
                }
            }
            c16028.f51996.clear();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m38186() {
        synchronized (this.f51996) {
            Iterator it = this.f51996.iterator();
            while (it.hasNext()) {
                if (((C17520) it.next()).m41136()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38184() throws IOException {
        synchronized (C16028.class) {
            C16774 c16774 = (C16774) f51990.get(this.f51993);
            if (c16774 != null) {
                C16774.m39594(c16774, false);
            } else {
                m38178();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m38178() throws IOException {
        m38151();
        try {
            m38176(this.f51994);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            m38176(this.f51992);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38188() {
        synchronized (C16028.class) {
            C16774 c16774 = (C16774) f51990.get(this.f51993);
            if (c16774 != null) {
                C16774.m39594(c16774, true);
            } else {
                m38165();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38156(String str, Exception exc) {
        if ((exc instanceof C9446) || !m38177(str)) {
            return;
        }
        try {
            m38162(str);
        } catch (IOException e) {
            exc.addSuppressed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m38165() throws IOException {
        AbstractC22044 abstractC22044 = this.f51995;
        if (abstractC22044.m49860() || abstractC22044.mo2934()) {
            m38169(abstractC22044.m49858());
            m38176(abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16028 m38171(String str, InterfaceC7509 interfaceC7509) {
        return m38152(str, interfaceC7509, C6382.f21568.m49876("hex-compare-sessions"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38172(String str) {
        m38160(C6382.f21568.m49876("hex-compare-sessions"), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16028 m38153(String str, C21145 c21145) {
        return m38152(str, c21145, C6382.f21568.m49876("hex-sessions"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m38162(String str) {
        m38160(C6382.f21568.m49876("hex-sessions"), str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static synchronized C16028 m38166() {
        return m38161(C6382.f21568.m49876("hex-sessions"));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m38169(AbstractC22044 abstractC22044) throws IOException {
        if (!abstractC22044.mo4281() || abstractC22044.m49860()) {
            throw new IOException("Hex session root directory is unavailable");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16028 m38152(String str, InterfaceC7509 interfaceC7509, AbstractC22044 abstractC22044) throws IOException {
        C16028 c16028;
        if (m38177(str)) {
            m38157(str, C17950.m41888(interfaceC7509));
            synchronized (C16028.class) {
                m38169(abstractC22044);
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str);
                if (!abstractC22044M49876.mo4281() || abstractC22044M49876.m49860()) {
                    throw new IOException("Hex session does not exist: " + str);
                }
                c16028 = new C16028(abstractC22044M49876, str);
                String str2 = f51989;
                AbstractC22044 abstractC22045 = c16028.f51997;
                String strM49871 = null;
                if (abstractC22045.mo4304() && !abstractC22045.m49860()) {
                    try {
                        strM49871 = abstractC22045.m49871();
                    } catch (IOException unused) {
                    }
                }
                if (!str2.equals(strM49871)) {
                    c16028.m38179();
                }
                c16028.m38151();
                AbstractC22044 abstractC22046 = c16028.f51997;
                m38174(abstractC22046, "Hex session owner file is unsafe");
                abstractC22046.m49879(f51989);
            }
            return c16028;
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38160(AbstractC22044 abstractC22044, String str) {
        if (m38177(str)) {
            synchronized (C16028.class) {
                C16774 c16774 = (C16774) f51990.get(str);
                if (c16774 != null) {
                    C16774.m39594(c16774, true);
                    return;
                }
                if (abstractC22044.mo2934()) {
                    m38169(abstractC22044);
                    AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str);
                    if (abstractC22044M49876.mo4281() && !abstractC22044M49876.m49860()) {
                        new C16028(abstractC22044M49876, str).m38165();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m38177(String str) {
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

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m38151() throws IOException {
        AbstractC22044 abstractC22044 = this.f51995;
        m38169(abstractC22044.m49858());
        if (!abstractC22044.mo4281() || abstractC22044.m49860()) {
            throw new IOException("Hex session directory is unavailable: " + this.f51993);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m38179() {
        try {
            for (AbstractC22044 abstractC22044 : this.f51995.mo4299(true)) {
                String name = abstractC22044.getName();
                if ("state.tmp".equals(name)) {
                    m38176(abstractC22044);
                } else {
                    int length = name.length() - 4;
                    if ((name.startsWith("state-") && name.endsWith(".tmp") && length > 6 && m38177(name.substring(6, length))) || name.endsWith(".hex-base.tmp")) {
                        try {
                            m38176(abstractC22044);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38174(AbstractC22044 abstractC22044, String str) throws IOException {
        if (abstractC22044.m49860() || (abstractC22044.mo2934() && !abstractC22044.mo4304())) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m38176(AbstractC22044 abstractC22044) throws IOException {
        boolean zM49860 = abstractC22044.m49860();
        if (zM49860 || abstractC22044.mo2934()) {
            if (abstractC22044.mo4281() && !zM49860) {
                Iterator it = abstractC22044.mo4299(true).iterator();
                while (it.hasNext()) {
                    m38176((AbstractC22044) it.next());
                }
            }
            if (zM49860 || abstractC22044.mo2934()) {
                if (zM49860) {
                    if (abstractC22044.mo4287()) {
                        return;
                    }
                } else if (abstractC22044.mo4296()) {
                    return;
                }
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete hex session path: ")));
            }
        }
    }
}
