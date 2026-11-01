package l;

import com.umeng.analytics.pro.o;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ܿۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 69ZM */
/* JADX INFO: loaded from: classes4.dex */
public class C17241 extends URLConnection implements InterfaceC11306 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54927 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f54928 = C13488.m32997(C17241.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2464 f54929;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f54930;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f54931;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f54932;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17987 f54933;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f54934;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54935;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f54936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54937;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21515 f54938;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f54933 != null) {
            this.f54933 = null;
            this.f54931.mo29449().getClass();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized C17987 m40191() {
        C17987 c17987 = this.f54933;
        if (c17987 != null && c17987.m41880()) {
            C17987 c17988 = this.f54933;
            c17988.m41869();
            return c17988;
        }
        if (this.f54933 != null) {
            this.f54931.mo29449().getClass();
        }
        C17987 c17987M48224 = this.f54938.m48224(this.f54929);
        this.f54933 = c17987M48224;
        c17987M48224.m41867();
        this.f54931.mo29449().getClass();
        return this.f54933;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo34688(C13276 c13276, C4102 c4102) {
    }

    public C17241(C17241 c17241, String str) throws MalformedURLException {
        URL url;
        if (m40190(c17241)) {
            m40189(str);
            url = new URL((URL) null, "smb://".concat(str), c17241.f54931.mo29451());
        } else {
            URL urlM7563 = c17241.f54929.m7563();
            m40189(str);
            url = new URL(urlM7563, str, c17241.f54931.mo29451());
        }
        this(url, c17241.f54931);
        m40188(c17241, str);
    }

    public C17241(String str, InterfaceC19067 interfaceC19067) {
        this(new URL((URL) null, str, interfaceC19067.mo29451()), interfaceC19067);
    }

    public C17241(URL url, InterfaceC19067 interfaceC19067) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: " + url);
        }
        this.f54931 = interfaceC19067;
        this.f54929 = new C2464(url, interfaceC19067);
        int i = C21515.f69901;
        interfaceC19067.mo29449().getClass();
        this.f54938 = new C21515(interfaceC19067);
    }

    public C17241(InterfaceC11306 interfaceC11306, String str, boolean z, int i, int i2, long j, long j2) throws MalformedURLException {
        URL url;
        if (m40190(interfaceC11306)) {
            StringBuilder sb = new StringBuilder("smb://");
            m40189(str);
            url = new URL((URL) null, C22697.m50267(sb, str, "/"), interfaceC11306.getContext().mo29451());
        } else {
            URL urlM7563 = ((C2464) interfaceC11306.mo28309()).m7563();
            m40189(str);
            url = new URL(urlM7563, str.concat((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, interfaceC11306.getContext());
        if (!m40190(interfaceC11306)) {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append((i2 & 16) > 0 ? "/" : "");
            m40188(interfaceC11306, sbM23356.toString());
        }
        this.f54929.m7560(i);
        this.f54937 = i2;
        this.f54932 = j;
        this.f54936 = j2;
        this.f54935 = true;
        if (z) {
            long jM25048 = ((C9895) this.f54931.mo29449()).m25048() + System.currentTimeMillis();
            this.f54930 = jM25048;
            this.f54934 = jM25048;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m40190(InterfaceC11306 interfaceC11306) {
        try {
            return ((C2464) interfaceC11306.mo28309()).m7568();
        } catch (C8484 e) {
            f54928.mo12120("Failed to check for workgroup", (Exception) e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        C17987 c17987M40191 = m40191();
        if (c17987M40191 != null) {
            c17987M40191.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40188(InterfaceC11306 interfaceC11306, String str) {
        this.f54929.m7561(interfaceC11306.mo28309(), str);
        if (((C2464) interfaceC11306.mo28309()).m7570() != null && (interfaceC11306 instanceof C17241)) {
            this.f54938 = C21515.m48210(((C17241) interfaceC11306).f54938);
            return;
        }
        InterfaceC19067 context = interfaceC11306.getContext();
        int i = C21515.f69901;
        context.mo29449().getClass();
        this.f54938 = new C21515(context);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40189(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40204() {
        this.f54938.getClass();
    }

    @Override // l.InterfaceC11306
    public final InterfaceC19067 getContext() {
        return this.f54931;
    }

    @Override // l.InterfaceC11306
    /* JADX INFO: renamed from: ۡܰ */
    public final InterfaceC24006 mo28309() {
        return this.f54929;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5952 m40193(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        C5952 c5952;
        long j;
        InterfaceC22553 interfaceC22553;
        long jM11645;
        long jCurrentTimeMillis;
        InterfaceC22553 interfaceC22554;
        InterfaceC4314 interfaceC4314 = f54928;
        C17987 c17987M40191 = m40191();
        try {
            boolean z3 = false;
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135(String.format("openUnshared: %s flags: %x access: %x attrs: %x options: %x", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            InterfaceC10601 interfaceC10601M41882 = c17987M40191.m41882();
            if (c17987M40191.m41875()) {
                C4519 c4519 = new C4519(str, interfaceC10601M41882);
                c4519.m12629(i2);
                int i6 = i & 64;
                if (i6 == 64 && (i & 16) == 16) {
                    c4519.m12628(5);
                } else if (i6 == 64) {
                    c4519.m12628(4);
                } else if ((i & 32) == 32) {
                    c4519.m12628(2);
                } else if ((i & 16) == 16) {
                    c4519.m12628(3);
                } else {
                    c4519.m12628(1);
                }
                c4519.m12626(i3);
                c4519.m12630(i4);
                C13693 c13693 = (C13693) c17987M40191.m41868(c4519, null, new EnumC19358[0]);
                long jM33398 = c13693.m33398();
                c5952 = new C5952(interfaceC10601M41882, c13693.m33399(), c17987M40191, str, i, i2, c13693.m33398());
                jM11645 = jM33398;
                interfaceC22554 = c13693;
            } else {
                boolean zM41870 = c17987M40191.m41870(16);
                C2464 c2464 = this.f54929;
                if (zM41870) {
                    C4102 c4102 = new C4102(interfaceC10601M41882);
                    C13276 c13276 = new C13276(interfaceC10601M41882, str, i, i2, i3, i4, i5);
                    mo34688(c13276, c4102);
                    c17987M40191.m41868(c13276, c4102, new EnumC19358[0]);
                    jM11645 = c4102.m11645();
                    c2464.m7560(c4102.m11646());
                    c5952 = new C5952(interfaceC10601M41882, c4102.m11648(), c17987M40191, str, i, i2, i4, i5, c4102.m11645());
                    interfaceC22554 = c4102;
                } else {
                    C21742 c21742 = new C21742(interfaceC10601M41882);
                    c17987M40191.m41868(new C15393(i2, i3, i, i4, str, interfaceC10601M41882), c21742, new EnumC19358[0]);
                    c2464.m7560(c21742.m48509());
                    long jM48508 = c21742.m48508();
                    C10454 c10454 = new C10454(interfaceC10601M41882);
                    c10454.m26416();
                    C7631 c7631 = new C7631(interfaceC10601M41882);
                    c10454.m26415(c21742.m48510());
                    try {
                        c17987M40191.m41868(c10454, c7631, new EnumC19358[0]);
                        if (interfaceC4314.mo12125() && c7631.m20178() != jM48508) {
                            interfaceC4314.mo12135(String.format("Open returned wrong size %d != %d", Long.valueOf(jM48508), Long.valueOf(c7631.m20178())));
                        }
                        jM48508 = c7631.m20178();
                        z = true;
                    } catch (Exception e) {
                        interfaceC4314.mo12120("Seek failed", e);
                        z = false;
                    }
                    long j2 = jM48508;
                    z2 = z;
                    c5952 = new C5952(interfaceC10601M41882, c21742.m48510(), c17987M40191, str, i, i2, 0, 0, j2);
                    j = j2;
                    interfaceC22553 = c21742;
                    jCurrentTimeMillis = System.currentTimeMillis() + ((C9895) interfaceC10601M41882).m25048();
                    if (z2) {
                        this.f54936 = j;
                        this.f54930 = jCurrentTimeMillis;
                    }
                    if (z3) {
                        this.f54932 = interfaceC22553.mo10132();
                        this.f54937 = interfaceC22553.getAttributes() & EnumC23529.f76192;
                        this.f54934 = jCurrentTimeMillis;
                    }
                    this.f54935 = true;
                    c17987M40191.close();
                    return c5952;
                }
            }
            z2 = true;
            j = jM11645;
            z3 = true;
            interfaceC22553 = interfaceC22554;
            jCurrentTimeMillis = System.currentTimeMillis() + ((C9895) interfaceC10601M41882).m25048();
            if (z2) {
                this.f54936 = j;
                this.f54930 = jCurrentTimeMillis;
            }
            if (z3) {
                this.f54932 = interfaceC22553.mo10132();
                this.f54937 = interfaceC22553.getAttributes() & EnumC23529.f76192;
                this.f54934 = jCurrentTimeMillis;
            }
            this.f54935 = true;
            c17987M40191.close();
            return c5952;
        } catch (Throwable th) {
            if (c17987M40191 == null) {
                throw th;
            }
            try {
                c17987M40191.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5952 m40192(int i, int i2, int i3, int i4, int i5) {
        return m40193(this.f54929.m7557(), i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40200(C17987 c17987, String str, int i) {
        InterfaceC4314 interfaceC4314 = f54928;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("queryPath: " + str);
        }
        if (c17987.m41875()) {
            return;
        }
        if (c17987.m41870(16)) {
            C16119 c16119 = (C16119) c17987.m41868(new C21057(c17987.m41882(), str, i), new C16119(c17987.m41882(), i), new EnumC19358[0]);
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Path information " + c16119);
            }
            InterfaceC19731 interfaceC19731 = (InterfaceC19731) c16119.m38158();
            this.f54935 = true;
            if (interfaceC19731 instanceof C9148) {
                C9148 c9148 = (C9148) interfaceC19731;
                this.f54937 = c9148.getAttributes() & EnumC23529.f76192;
                this.f54932 = c9148.mo10132();
                this.f54934 = ((C9895) c17987.m41882()).m25048() + System.currentTimeMillis();
                return;
            }
            if (interfaceC19731 instanceof C12675) {
                this.f54936 = ((C12675) interfaceC19731).getSize();
                this.f54930 = ((C9895) c17987.m41882()).m25048() + System.currentTimeMillis();
                return;
            }
            return;
        }
        C18920 c18920 = (C18920) c17987.m41868(new C18214(str, c17987.m41882()), new C18920(c17987.m41882(), c17987.m41876()), new EnumC19358[0]);
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Legacy path information " + c18920);
        }
        this.f54935 = true;
        this.f54937 = c18920.getAttributes() & EnumC23529.f76192;
        this.f54932 = c18920.mo10132();
        this.f54934 = ((C9895) c17987.m41882()).m25048() + System.currentTimeMillis();
        this.f54936 = c18920.getSize();
        this.f54930 = ((C9895) c17987.m41882()).m25048() + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m40205() throws C12303 {
        InterfaceC19067 interfaceC19067 = this.f54931;
        C2464 c2464 = this.f54929;
        long j = this.f54934;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC4314 interfaceC4314 = f54928;
        if (j > jCurrentTimeMillis) {
            interfaceC4314.mo12127("Using cached attributes");
            return this.f54935;
        }
        this.f54937 = 17;
        this.f54932 = 0L;
        this.f54935 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (c2464.m7570() == null) {
                    if (c2464.m7566() == 2) {
                        C19668 c19668 = ((RunnableC6967) interfaceC19067.mo29450()).m18734(((URLConnection) this).url.getHost(), true)[0];
                    } else {
                        ((RunnableC6967) interfaceC19067.mo29450()).m18734(((URLConnection) this).url.getHost(), false)[0].mo36921();
                    }
                } else {
                    C17987 c17987M40191 = m40191();
                    try {
                        if (c2464.m7566() == 8) {
                            C17987 c17987M40192 = m40191();
                            if (c17987M40192 != null) {
                                c17987M40192.close();
                            }
                        } else {
                            m40200(c17987M40191, c2464.m7557(), 4);
                        }
                        if (c17987M40191 != null) {
                            c17987M40191.close();
                        }
                    } catch (Throwable th) {
                        if (c17987M40191 != null) {
                            try {
                                c17987M40191.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f54935 = true;
        } catch (UnknownHostException e) {
            interfaceC4314.mo12120("Unknown host", (Exception) e);
        } catch (C12303 e2) {
            interfaceC4314.mo12131("exists:", e2);
            switch (e2.m30561()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e2;
            }
        } catch (C8484 e3) {
            throw C12303.m30559(e3);
        }
        this.f54934 = ((C9895) interfaceC19067.mo29449()).m25048() + System.currentTimeMillis();
        return this.f54935;
    }

    /* JADX INFO: renamed from: ֨ */
    public int mo34687() throws C12303 {
        C2464 c2464 = this.f54929;
        try {
            int iM7566 = c2464.m7566();
            if (iM7566 != 8) {
                return iM7566;
            }
            C17987 c17987M40191 = m40191();
            try {
                c2464.m7560(c17987M40191.m41878());
                c17987M40191.close();
                return iM7566;
            } catch (Throwable th) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    @Override // l.InterfaceC11306
    public final String getName() {
        return this.f54929.getName();
    }

    @Override // l.InterfaceC11306
    public final boolean isDirectory() {
        if (this.f54929.m7569()) {
            return true;
        }
        return m40205() && (this.f54937 & 16) == 16;
    }

    @Override // l.InterfaceC11306
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo28310() throws C12303 {
        C2464 c2464 = this.f54929;
        if (c2464.m7570() == null) {
            return false;
        }
        if (c2464.m7569()) {
            return c2464.m7570().endsWith("$");
        }
        m40205();
        return (this.f54937 & 2) == 2;
    }

    @Override // l.InterfaceC11306
    /* JADX INFO: renamed from: ۡ */
    public final long mo28308() throws C12303 {
        if (this.f54929.m7569()) {
            return 0L;
        }
        m40205();
        return this.f54932;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9190 m40195() {
        return C16536.m38912(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40199(InterfaceC11306 interfaceC11306) throws C12303 {
        C2464 c2464 = this.f54929;
        if (!(interfaceC11306 instanceof C17241)) {
            throw new C12303("Invalid target resource");
        }
        C17241 c17241 = (C17241) interfaceC11306;
        C2464 c2465 = c17241.f54929;
        try {
            C17987 c17987M40191 = m40191();
            try {
                InterfaceC18693 interfaceC18693M40191 = c17241.m40191();
                try {
                    if (!m40205()) {
                        throw new C12303(-1073741772);
                    }
                    c17241.m40205();
                    if (c2464.m7569() || c2465.m7569()) {
                        throw new C12303("Invalid operation for workgroups, servers, or shares");
                    }
                    if (!c17987M40191.m41871(interfaceC18693M40191)) {
                        m40205();
                        c17241.m40205();
                        if (!C13638.equals(c2464.m7562(), c2465.m7562()) || !C13638.equals(c2464.m7570(), c2465.m7570())) {
                            throw new C12303("Cannot rename between different trees");
                        }
                    }
                    InterfaceC4314 interfaceC4314 = f54928;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("renameTo: " + c2464.m7557() + " -> " + c2465.m7557());
                    }
                    c17241.f54930 = 0L;
                    c17241.f54934 = 0L;
                    if (c17987M40191.m41875()) {
                        C0991 c0991 = new C0991(c17987M40191.m41882());
                        c0991.m3797(new C16908(c2465.m7557().substring(1)));
                        m40194(c17987M40191, 65792, c0991, new AbstractC17529[0]);
                    } else {
                        c17987M40191.m41868(new C9043(c17987M40191.m41882(), c2464.m7557(), c2465.m7557()), new C3501(c17987M40191.m41882()), new EnumC19358[0]);
                    }
                    this.f54930 = 0L;
                    this.f54934 = 0L;
                    if (interfaceC18693M40191 != null) {
                        interfaceC18693M40191.close();
                    }
                    c17987M40191.close();
                } catch (Throwable th) {
                    if (interfaceC18693M40191 != null) {
                        try {
                            interfaceC18693M40191.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40201() {
        this.f54934 = 0L;
        this.f54930 = 0L;
    }

    @Override // l.InterfaceC11306
    public final void delete() throws C12303 {
        try {
            m40198(this.f54929.m7557());
            close();
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40198(String str) throws C12303 {
        InterfaceC4314 interfaceC4314 = f54928;
        if (this.f54929.m7569()) {
            throw new C12303("Invalid operation for workgroups, servers, or shares");
        }
        C17987 c17987M40191 = m40191();
        try {
            if (!m40205()) {
                throw new C12303(-1073741772);
            }
            if ((this.f54937 & 1) != 0) {
                m40203();
            }
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("delete: " + str);
            }
            if ((this.f54937 & 16) != 0) {
                try {
                    InterfaceC9190 interfaceC9190M38912 = C16536.m38912(this);
                    while (interfaceC9190M38912.hasNext()) {
                        try {
                            InterfaceC11306 interfaceC11306 = (InterfaceC11306) interfaceC9190M38912.next();
                            try {
                                try {
                                    interfaceC11306.delete();
                                    interfaceC11306.close();
                                } catch (C8484 e) {
                                    throw C12303.m30559(e);
                                }
                            } catch (Throwable th) {
                                if (interfaceC11306 != null) {
                                    try {
                                        interfaceC11306.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                interfaceC9190M38912.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    interfaceC9190M38912.close();
                } catch (C12303 e2) {
                    interfaceC4314.mo12120("delete", (Exception) e2);
                    if (e2.m30561() != -1073741809) {
                        throw e2;
                    }
                }
                if (c17987M40191.m41875()) {
                    C4519 c4519 = new C4519(str, c17987M40191.m41882());
                    c4519.m12629(65536);
                    c4519.m12631(o.a.a);
                    c4519.m12628(1);
                    c4519.mo27236(new C9769(str, c17987M40191.m41882()));
                    c17987M40191.m41868(c4519, null, new EnumC19358[0]);
                } else {
                    c17987M40191.m41868(new C2691(str, c17987M40191.m41882()), new C3501(c17987M40191.m41882()), new EnumC19358[0]);
                }
            } else if (c17987M40191.m41875()) {
                C4519 c45110 = new C4519(str.substring(1), c17987M40191.m41882());
                c45110.m12629(65536);
                c45110.m12631(4096);
                c45110.mo27236(new C9769(str, c17987M40191.m41882()));
                c17987M40191.m41868(c45110, null, new EnumC19358[0]);
            } else {
                c17987M40191.m41868(new C11865(str, c17987M40191.m41882()), new C3501(c17987M40191.m41882()), new EnumC19358[0]);
            }
            this.f54930 = 0L;
            this.f54934 = 0L;
            if (c17987M40191 != null) {
                c17987M40191.close();
            }
        } catch (Throwable th5) {
            if (c17987M40191 != null) {
                try {
                    c17987M40191.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // l.InterfaceC11306
    public final long length() throws C12303 {
        boolean z;
        InterfaceC1903 interfaceC1903;
        C2464 c2464 = this.f54929;
        if (this.f54930 > System.currentTimeMillis()) {
            return this.f54936;
        }
        try {
            C17987 c17987M40191 = m40191();
            try {
                int iMo34687 = mo34687();
                if (iMo34687 != 8) {
                    if (c2464.m7570() == null) {
                        z = true;
                        if (c2464.m7557().length() > 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z && iMo34687 != 16) {
                        m40200(c17987M40191, c2464.m7557(), 5);
                    } else {
                        this.f54936 = 0L;
                    }
                } else {
                    try {
                        interfaceC1903 = (InterfaceC1903) m40187(c17987M40191, (byte) 3);
                    } catch (C12303 e) {
                        f54928.mo12120("getDiskFreeSpace", (Exception) e);
                        int iM30561 = e.m30561();
                        if ((iM30561 == -1073741823 || iM30561 == -1073741821) && !c17987M40191.m41875()) {
                            interfaceC1903 = (InterfaceC1903) m40187(c17987M40191, (byte) -1);
                        } else {
                            throw e;
                        }
                    }
                    this.f54936 = interfaceC1903.mo6208();
                }
                this.f54930 = System.currentTimeMillis() + ((C9895) this.f54931.mo29449()).m25048();
                long j = this.f54936;
                if (c17987M40191 != null) {
                    c17987M40191.close();
                }
                return j;
            } catch (Throwable th) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C8484 e2) {
            throw C12303.m30559(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC17613 m40187(C17987 c17987, byte b) {
        if (c17987.m41875()) {
            C5225 c5225 = new C5225(c17987.m41882());
            c5225.m14409(b);
            return (InterfaceC17613) ((C22159) m40194(c17987, 128, c5225, new AbstractC17529[0])).m49168();
        }
        C7652 c7652 = new C7652(c17987.m41882(), b);
        c17987.m41868(new C10475(c17987.m41882(), b), c7652, new EnumC19358[0]);
        return c7652.m20205();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m40202() throws C12303 {
        C2464 c2464 = this.f54929;
        if (c2464.m7557().length() == 1) {
            throw new C12303("Invalid operation for workgroups, servers, or shares");
        }
        try {
            C17987 c17987M40191 = m40191();
            try {
                m40205();
                String strM7557 = c2464.m7557();
                InterfaceC4314 interfaceC4314 = f54928;
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("mkdir: " + strM7557);
                }
                if (c17987M40191.m41875()) {
                    C4519 c4519 = new C4519(strM7557, c17987M40191.m41882());
                    c4519.m12628(2);
                    c4519.m12631(1);
                    c4519.mo27236(new C9769(strM7557, c17987M40191.m41882()));
                    c17987M40191.m41868(c4519, null, new EnumC19358[0]);
                } else {
                    c17987M40191.m41868(new C13982(strM7557, c17987M40191.m41882()), new C3501(c17987M40191.m41882()), new EnumC19358[0]);
                }
                this.f54930 = 0L;
                this.f54934 = 0L;
                c17987M40191.close();
            } catch (Throwable th) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6240 m40194(C17987 c17987, int i, AbstractC17529 abstractC17529, AbstractC17529... abstractC17529Arr) {
        InterfaceC10601 interfaceC10601M41882 = c17987.m41882();
        C2464 c2464 = this.f54929;
        C4519 c4519 = new C4519(c2464.m7557(), interfaceC10601M41882);
        try {
            c4519.m12628(1);
            c4519.m12631(0);
            c4519.m12630(128);
            c4519.m12629(i);
            c4519.m12626(3);
            if (abstractC17529 != null) {
                c4519.mo27236(abstractC17529);
                int length = abstractC17529Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC17529 abstractC175210 = abstractC17529Arr[i2];
                    abstractC17529.mo27236(abstractC175210);
                    i2++;
                    abstractC17529 = abstractC175210;
                }
            } else {
                abstractC17529 = c4519;
            }
            C9769 c9769 = new C9769(c2464.m7557(), c17987.m41882());
            c9769.m24752();
            abstractC17529.mo27236(c9769);
            C13693 c13693 = (C13693) c17987.m41868(c4519, null, new EnumC19358[0]);
            C3417 c3417 = (C3417) c9769.mo9821();
            InterfaceC22553 interfaceC22553 = (c3417.m10131() & 1) != 0 ? c3417 : c13693;
            this.f54935 = true;
            interfaceC22553.getClass();
            this.f54932 = interfaceC22553.mo10132();
            this.f54937 = interfaceC22553.getAttributes() & EnumC23529.f76192;
            this.f54934 = System.currentTimeMillis() + ((C9895) c17987.m41882()).m25048();
            this.f54936 = interfaceC22553.getSize();
            this.f54930 = System.currentTimeMillis() + ((C9895) c17987.m41882()).m25048();
            return (AbstractC6240) c13693.m31362();
        } catch (RuntimeException | C8484 e) {
            try {
                C13693 c13694 = (C13693) c4519.mo9821();
                if (c13694.mo17295() && c13694.m31351() == 0) {
                    c17987.m41868(new C9769(c17987.m41882(), c13694.m33399()), null, EnumC19358.NO_RETRY);
                }
            } catch (Exception e2) {
                f54928.mo12120("Failed to close after failure", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40196(int i, long j, long j2, long j3) {
        C17987 c17987M40191 = m40191();
        try {
            if (!m40205()) {
                throw new C12303(-1073741772);
            }
            int i2 = this.f54937 & 16;
            if (c17987M40191.m41875()) {
                C0991 c0991 = new C0991(c17987M40191.m41882());
                c0991.m3797(new C9148(i | i2, j, j3, j2));
                m40194(c17987M40191, 256, c0991, new AbstractC17529[0]);
            } else if (c17987M40191.m41870(16)) {
                C5952 c5952M40192 = m40192(1, 256, 3, i2, i2 != 0 ? 1 : 64);
                try {
                    c17987M40191.m41868(new C20352(c17987M40191.m41882(), c5952M40192.m16223(), i | i2, j, j2, j3), new C0595(c17987M40191.m41882()), EnumC19358.NO_RETRY);
                    c5952M40192.m16227();
                } catch (Throwable th) {
                    try {
                        c5952M40192.m16227();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                if (j != 0 || j3 != 0) {
                    throw new C19399("Cannot set creation or access time without CAP_NT_SMBS");
                }
                c17987M40191.m41868(new C20331(c17987M40191.m41882(), this.f54929.m7557(), i, j2 - c17987M40191.m41876()), new C0574(c17987M40191.m41882()), new EnumC19358[0]);
            }
            this.f54934 = 0L;
            c17987M40191.close();
        } catch (Throwable th3) {
            if (c17987M40191 == null) {
                throw th3;
            }
            try {
                c17987M40191.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40197(long j, long j2, long j3) throws C12303 {
        if (this.f54929.m7569()) {
            throw new C12303("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m40196(0, j, j2, j3);
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m40203() throws C12303 {
        int i;
        C2464 c2464 = this.f54929;
        if (c2464.m7569()) {
            i = 0;
        } else {
            m40205();
            i = this.f54937 & EnumC23529.f76192;
        }
        if (c2464.m7569()) {
            throw new C12303("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m40196(i & 12454, 0L, 0L, 0L);
        } catch (C12303 e) {
            if (e.m30561() != -1073741637) {
                throw e;
            }
            throw new C19399("Attribute not supported by server");
        } catch (C8484 e2) {
            throw C12303.m30559(e2);
        }
    }

    public final int hashCode() {
        return this.f54929.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17241)) {
            return false;
        }
        InterfaceC11306 interfaceC11306 = (InterfaceC11306) obj;
        if (this == interfaceC11306) {
            return true;
        }
        return this.f54929.equals(interfaceC11306.mo28309());
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return ((URLConnection) this).url.toString();
    }

    @Override // java.net.URLConnection
    @Deprecated
    public final int getContentLength() {
        try {
            return (int) (length() & 4294967295L);
        } catch (C12303 e) {
            f54928.mo12120("getContentLength", (Exception) e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        try {
            return length();
        } catch (C12303 e) {
            f54928.mo12120("getContentLength", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        try {
            return mo28308();
        } catch (C12303 e) {
            f54928.mo12120("getDate", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        try {
            return mo28308();
        } catch (C12303 e) {
            f54928.mo12120("getLastModified", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new C10892(this);
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return new C23592(this);
    }
}
