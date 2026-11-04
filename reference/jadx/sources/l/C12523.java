package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۨܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69ZM */
/* JADX INFO: loaded from: classes4.dex */
public class C12523 extends URLConnection implements InterfaceC12589 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f40191 = C16980.m40037(C12523.class);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40192 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f40193;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f40194;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19457 f40195;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f40196;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22441 f40197;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f40198;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f40199;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1337 f40200;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f40201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40202;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f40195 != null) {
            this.f40195 = null;
            this.f40194.mo2875().getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo31094(C8445 c8445, C6954 c6954) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C19457 m31099() {
        C19457 c19457 = this.f40195;
        if (c19457 != null && c19457.m44970()) {
            C19457 c19458 = this.f40195;
            c19458.m44972();
            return c19458;
        }
        if (this.f40195 != null) {
            this.f40194.mo2875().getClass();
        }
        C19457 c19457M50616 = this.f40197.m50616(this.f40200);
        this.f40195 = c19457M50616;
        c19457M50616.m44976();
        this.f40194.mo2875().getClass();
        return this.f40195;
    }

    public C12523(C12523 c12523, String str) throws MalformedURLException {
        URL url;
        if (m31086(c12523)) {
            m31085(str);
            url = new URL((URL) null, "smb://".concat(str), c12523.f40194.mo2871());
        } else {
            URL urlM4922 = c12523.f40200.m4922();
            m31085(str);
            url = new URL(urlM4922, str, c12523.f40194.mo2871());
        }
        this(url, c12523.f40194);
        m31084(c12523, str);
    }

    public C12523(String str, InterfaceC23032 interfaceC23032) {
        this(new URL((URL) null, str, interfaceC23032.mo2871()), interfaceC23032);
    }

    public C12523(URL url, InterfaceC23032 interfaceC23032) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: " + url);
        }
        this.f40194 = interfaceC23032;
        this.f40200 = new C1337(url, interfaceC23032);
        int i = C22441.f72644;
        interfaceC23032.mo2875().getClass();
        this.f40197 = new C22441(interfaceC23032);
    }

    public C12523(InterfaceC12589 interfaceC12589, String str, boolean z, int i, int i2, long j, long j2) throws MalformedURLException {
        URL url;
        if (m31086(interfaceC12589)) {
            StringBuilder sb = new StringBuilder("smb://");
            m31085(str);
            url = new URL((URL) null, C8947.m23910(sb, str, "/"), interfaceC12589.getContext().mo2871());
        } else {
            URL urlM4922 = ((C1337) interfaceC12589.mo31101()).m4922();
            m31085(str);
            url = new URL(urlM4922, str.concat((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, interfaceC12589.getContext());
        if (!m31086(interfaceC12589)) {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append((i2 & 16) > 0 ? "/" : "");
            m31084(interfaceC12589, sbM27333.toString());
        }
        this.f40200.m4918(i);
        this.f40202 = i2;
        this.f40196 = j;
        this.f40201 = j2;
        this.f40193 = true;
        if (z) {
            long jM35705 = ((C14826) this.f40194.mo2875()).m35705() + System.currentTimeMillis();
            this.f40198 = jM35705;
            this.f40199 = jM35705;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31086(InterfaceC12589 interfaceC12589) {
        try {
            return ((C1337) interfaceC12589.mo31101()).m4924();
        } catch (C20048 e) {
            f40191.mo13711("Failed to check for workgroup", e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        C19457 c19457M31099 = m31099();
        if (c19457M31099 != null) {
            c19457M31099.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31084(InterfaceC12589 interfaceC12589, String str) {
        this.f40200.m4919(interfaceC12589.mo31101(), str);
        if (((C1337) interfaceC12589.mo31101()).m4923() != null && (interfaceC12589 instanceof C12523)) {
            this.f40197 = C22441.m50603(((C12523) interfaceC12589).f40197);
            return;
        }
        InterfaceC23032 context = interfaceC12589.getContext();
        int i = C22441.f72644;
        context.mo2875().getClass();
        this.f40197 = new C22441(context);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31085(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31105() {
        this.f40197.getClass();
    }

    @Override // l.InterfaceC12589
    public final InterfaceC23032 getContext() {
        return this.f40194;
    }

    @Override // l.InterfaceC12589
    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6624 mo31101() {
        return this.f40200;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6558 m31088(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        C6558 c6558;
        long j;
        InterfaceC1162 interfaceC1162;
        long jM19253;
        long jCurrentTimeMillis;
        InterfaceC1162 interfaceC1163;
        InterfaceC25186 interfaceC25186 = f40191;
        C19457 c19457M31099 = m31099();
        try {
            boolean z3 = false;
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721(String.format("openUnshared: %s flags: %x access: %x attrs: %x options: %x", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            InterfaceC5878 interfaceC5878M44979 = c19457M31099.m44979();
            if (c19457M31099.m44978()) {
                C0176 c0176 = new C0176(str, interfaceC5878M44979);
                c0176.m1467(i2);
                int i6 = i & 64;
                if (i6 == 64 && (i & 16) == 16) {
                    c0176.m1468(5);
                } else if (i6 == 64) {
                    c0176.m1468(4);
                } else if ((i & 32) == 32) {
                    c0176.m1468(2);
                } else if ((i & 16) == 16) {
                    c0176.m1468(3);
                } else {
                    c0176.m1468(1);
                }
                c0176.m1461(i3);
                c0176.m1473(i4);
                C7634 c7634 = (C7634) c19457M31099.m44971(c0176, null, new EnumC13269[0]);
                long jM20850 = c7634.m20850();
                c6558 = new C6558(interfaceC5878M44979, c7634.m20851(), c19457M31099, str, i, i2, c7634.m20850());
                jM19253 = jM20850;
                interfaceC1163 = c7634;
            } else {
                boolean zM44973 = c19457M31099.m44973(16);
                C1337 c1337 = this.f40200;
                if (zM44973) {
                    C6954 c6954 = new C6954(interfaceC5878M44979);
                    C8445 c8445 = new C8445(interfaceC5878M44979, str, i, i2, i3, i4, i5);
                    mo31094(c8445, c6954);
                    c19457M31099.m44971(c8445, c6954, new EnumC13269[0]);
                    jM19253 = c6954.m19253();
                    c1337.m4918(c6954.m19252());
                    c6558 = new C6558(interfaceC5878M44979, c6954.m19254(), c19457M31099, str, i, i2, i4, i5, c6954.m19253());
                    interfaceC1163 = c6954;
                } else {
                    C11207 c11207 = new C11207(interfaceC5878M44979);
                    c19457M31099.m44971(new C22396(i2, i3, i, i4, str, interfaceC5878M44979), c11207, new EnumC13269[0]);
                    c1337.m4918(c11207.m28238());
                    long jM28239 = c11207.m28239();
                    C2259 c2259 = new C2259(interfaceC5878M44979);
                    c2259.m7688();
                    C11953 c11953 = new C11953(interfaceC5878M44979);
                    c2259.m7687(c11207.m28240());
                    try {
                        c19457M31099.m44971(c2259, c11953, new EnumC13269[0]);
                        if (interfaceC25186.mo13707() && c11953.m29924() != jM28239) {
                            interfaceC25186.mo13721(String.format("Open returned wrong size %d != %d", Long.valueOf(jM28239), Long.valueOf(c11953.m29924())));
                        }
                        jM28239 = c11953.m29924();
                        z = true;
                    } catch (Exception e) {
                        interfaceC25186.mo13711("Seek failed", e);
                        z = false;
                    }
                    long j2 = jM28239;
                    z2 = z;
                    c6558 = new C6558(interfaceC5878M44979, c11207.m28240(), c19457M31099, str, i, i2, 0, 0, j2);
                    j = j2;
                    interfaceC1162 = c11207;
                    jCurrentTimeMillis = System.currentTimeMillis() + ((C14826) interfaceC5878M44979).m35705();
                    if (z2) {
                        this.f40201 = j;
                        this.f40198 = jCurrentTimeMillis;
                    }
                    if (z3) {
                        this.f40196 = interfaceC1162.mo4305();
                        this.f40202 = interfaceC1162.getAttributes() & EnumC6121.f20881;
                        this.f40199 = jCurrentTimeMillis;
                    }
                    this.f40193 = true;
                    c19457M31099.close();
                    return c6558;
                }
            }
            z2 = true;
            j = jM19253;
            z3 = true;
            interfaceC1162 = interfaceC1163;
            jCurrentTimeMillis = System.currentTimeMillis() + ((C14826) interfaceC5878M44979).m35705();
            if (z2) {
                this.f40201 = j;
                this.f40198 = jCurrentTimeMillis;
            }
            if (z3) {
                this.f40196 = interfaceC1162.mo4305();
                this.f40202 = interfaceC1162.getAttributes() & EnumC6121.f20881;
                this.f40199 = jCurrentTimeMillis;
            }
            this.f40193 = true;
            c19457M31099.close();
            return c6558;
        } catch (Throwable th) {
            if (c19457M31099 == null) {
                throw th;
            }
            try {
                c19457M31099.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6558 m31087(int i, int i2, int i3, int i4, int i5) {
        return m31088(this.f40200.m4914(), i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31096(C19457 c19457, String str, int i) {
        InterfaceC25186 interfaceC25186 = f40191;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("queryPath: " + str);
        }
        if (c19457.m44978()) {
            return;
        }
        if (c19457.m44973(16)) {
            C16583 c16583 = (C16583) c19457.m44971(new C24789(c19457.m44979(), str, i), new C16583(c19457.m44979(), i), new EnumC13269[0]);
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Path information " + c16583);
            }
            InterfaceC12920 interfaceC12920 = (InterfaceC12920) c16583.m39257();
            this.f40193 = true;
            if (interfaceC12920 instanceof C5463) {
                C5463 c5463 = (C5463) interfaceC12920;
                this.f40202 = c5463.getAttributes() & EnumC6121.f20881;
                this.f40196 = c5463.mo4305();
                this.f40199 = ((C14826) c19457.m44979()).m35705() + System.currentTimeMillis();
                return;
            }
            if (interfaceC12920 instanceof C3225) {
                this.f40201 = ((C3225) interfaceC12920).getSize();
                this.f40198 = ((C14826) c19457.m44979()).m35705() + System.currentTimeMillis();
                return;
            }
            return;
        }
        C20158 c20158 = (C20158) c19457.m44971(new C23142(str, c19457.m44979()), new C20158(c19457.m44979(), c19457.m44980()), new EnumC13269[0]);
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Legacy path information " + c20158);
        }
        this.f40193 = true;
        this.f40202 = c20158.getAttributes() & EnumC6121.f20881;
        this.f40196 = c20158.mo4305();
        this.f40199 = ((C14826) c19457.m44979()).m35705() + System.currentTimeMillis();
        this.f40201 = c20158.getSize();
        this.f40198 = ((C14826) c19457.m44979()).m35705() + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31103() throws C20728 {
        InterfaceC23032 interfaceC23032 = this.f40194;
        C1337 c1337 = this.f40200;
        long j = this.f40199;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC25186 interfaceC25186 = f40191;
        if (j > jCurrentTimeMillis) {
            interfaceC25186.mo13717("Using cached attributes");
            return this.f40193;
        }
        this.f40202 = 17;
        this.f40196 = 0L;
        this.f40193 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (c1337.m4923() == null) {
                    if (c1337.m4920() == 2) {
                        C13357 c13357 = ((RunnableC13904) interfaceC23032.mo2872()).m33883(((URLConnection) this).url.getHost(), true)[0];
                    } else {
                        ((RunnableC13904) interfaceC23032.mo2872()).m33883(((URLConnection) this).url.getHost(), false)[0].mo28044();
                    }
                } else {
                    C19457 c19457M31099 = m31099();
                    try {
                        if (c1337.m4920() == 8) {
                            C19457 c19457M310910 = m31099();
                            if (c19457M310910 != null) {
                                c19457M310910.close();
                            }
                        } else {
                            m31096(c19457M31099, c1337.m4914(), 4);
                        }
                        if (c19457M31099 != null) {
                            c19457M31099.close();
                        }
                    } catch (Throwable th) {
                        if (c19457M31099 != null) {
                            try {
                                c19457M31099.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f40193 = true;
        } catch (UnknownHostException e) {
            interfaceC25186.mo13711("Unknown host", e);
        } catch (C20728 e2) {
            interfaceC25186.mo13722("exists:", (Exception) e2);
            switch (e2.m47408()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e2;
            }
        } catch (C20048 e3) {
            throw C20728.m47406(e3);
        }
        this.f40199 = ((C14826) interfaceC23032.mo2875()).m35705() + System.currentTimeMillis();
        return this.f40193;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int mo31102() throws C20728 {
        C1337 c1337 = this.f40200;
        try {
            int iM4920 = c1337.m4920();
            if (iM4920 != 8) {
                return iM4920;
            }
            C19457 c19457M31099 = m31099();
            try {
                c1337.m4918(c19457M31099.m44982());
                c19457M31099.close();
                return iM4920;
            } catch (Throwable th) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    @Override // l.InterfaceC12589
    public final String getName() {
        return this.f40200.getName();
    }

    @Override // l.InterfaceC12589
    public final boolean isDirectory() {
        if (this.f40200.m4926()) {
            return true;
        }
        return m31103() && (this.f40202 & 16) == 16;
    }

    @Override // l.InterfaceC12589
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo31098() throws C20728 {
        C1337 c1337 = this.f40200;
        if (c1337.m4923() == null) {
            return false;
        }
        if (c1337.m4926()) {
            return c1337.m4923().endsWith("$");
        }
        m31103();
        return (this.f40202 & 2) == 2;
    }

    @Override // l.InterfaceC12589
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo31100() throws C20728 {
        if (this.f40200.m4926()) {
            return 0L;
        }
        m31103();
        return this.f40196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13335 m31090() {
        return C3574.m11624(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31095(InterfaceC12589 interfaceC12589) throws C20728 {
        C1337 c1337 = this.f40200;
        if (!(interfaceC12589 instanceof C12523)) {
            throw new C20728("Invalid target resource");
        }
        C12523 c12523 = (C12523) interfaceC12589;
        C1337 c1338 = c12523.f40200;
        try {
            C19457 c19457M31099 = m31099();
            try {
                InterfaceC14981 interfaceC14981M31099 = c12523.m31099();
                try {
                    if (!m31103()) {
                        throw new C20728(-1073741772);
                    }
                    c12523.m31103();
                    if (c1337.m4926() || c1338.m4926()) {
                        throw new C20728("Invalid operation for workgroups, servers, or shares");
                    }
                    if (!c19457M31099.m44974(interfaceC14981M31099)) {
                        m31103();
                        c12523.m31103();
                        if (!C17359.equals(c1337.m4927(), c1338.m4927()) || !C17359.equals(c1337.m4923(), c1338.m4923())) {
                            throw new C20728("Cannot rename between different trees");
                        }
                    }
                    InterfaceC25186 interfaceC25186 = f40191;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("renameTo: " + c1337.m4914() + " -> " + c1338.m4914());
                    }
                    c12523.f40198 = 0L;
                    c12523.f40199 = 0L;
                    if (c19457M31099.m44978()) {
                        C2413 c2413 = new C2413(c19457M31099.m44979());
                        c2413.m8156(new C23363(c1338.m4914().substring(1)));
                        m31089(c19457M31099, 65792, c2413, new AbstractC20313[0]);
                    } else {
                        c19457M31099.m44971(new C5988(c19457M31099.m44979(), c1337.m4914(), c1338.m4914()), new C18141(c19457M31099.m44979()), new EnumC13269[0]);
                    }
                    this.f40198 = 0L;
                    this.f40199 = 0L;
                    if (interfaceC14981M31099 != null) {
                        interfaceC14981M31099.close();
                    }
                    c19457M31099.close();
                } catch (Throwable th) {
                    if (interfaceC14981M31099 != null) {
                        try {
                            interfaceC14981M31099.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31106() {
        this.f40199 = 0L;
        this.f40198 = 0L;
    }

    @Override // l.InterfaceC12589
    public final void delete() throws C20728 {
        try {
            m31093(this.f40200.m4914());
            close();
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006c */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m31093(java.lang.String r10) throws l.C20728 {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12523.m31093(java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // l.InterfaceC12589
    public final long length() throws C20728 {
        boolean z;
        InterfaceC4145 interfaceC4145;
        C1337 c1337 = this.f40200;
        if (this.f40198 > System.currentTimeMillis()) {
            return this.f40201;
        }
        try {
            C19457 c19457M31099 = m31099();
            try {
                int iMo31102 = mo31102();
                if (iMo31102 != 8) {
                    if (c1337.m4923() == null) {
                        z = true;
                        if (c1337.m4914().length() > 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z && iMo31102 != 16) {
                        m31096(c19457M31099, c1337.m4914(), 5);
                    } else {
                        this.f40201 = 0L;
                    }
                } else {
                    try {
                        interfaceC4145 = (InterfaceC4145) m31083(c19457M31099, (byte) 3);
                    } catch (C20728 e) {
                        f40191.mo13711("getDiskFreeSpace", e);
                        int iM47408 = e.m47408();
                        if ((iM47408 == -1073741823 || iM47408 == -1073741821) && !c19457M31099.m44978()) {
                            interfaceC4145 = (InterfaceC4145) m31083(c19457M31099, (byte) -1);
                        } else {
                            throw e;
                        }
                    }
                    this.f40201 = interfaceC4145.mo13272();
                }
                this.f40198 = System.currentTimeMillis() + ((C14826) this.f40194.mo2875()).m35705();
                long j = this.f40201;
                if (c19457M31099 != null) {
                    c19457M31099.close();
                }
                return j;
            } catch (Throwable th) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20048 e2) {
            throw C20728.m47406(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC20379 m31083(C19457 c19457, byte b) {
        if (c19457.m44978()) {
            C0922 c0922 = new C0922(c19457.m44979());
            c0922.m3726(b);
            return (InterfaceC20379) ((C9124) m31089(c19457, 128, c0922, new AbstractC20313[0])).m24273();
        }
        C11362 c11362 = new C11362(c19457.m44979(), b);
        c19457.m44971(new C1668(c19457.m44979(), b), c11362, new EnumC13269[0]);
        return c11362.m28671();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31097() throws C20728 {
        C1337 c1337 = this.f40200;
        if (c1337.m4914().length() == 1) {
            throw new C20728("Invalid operation for workgroups, servers, or shares");
        }
        try {
            C19457 c19457M31099 = m31099();
            try {
                m31103();
                String strM4914 = c1337.m4914();
                InterfaceC25186 interfaceC25186 = f40191;
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("mkdir: " + strM4914);
                }
                if (c19457M31099.m44978()) {
                    C0176 c0176 = new C0176(strM4914, c19457M31099.m44979());
                    c0176.m1468(2);
                    c0176.m1469(1);
                    c0176.mo10313(new C21059(strM4914, c19457M31099.m44979()));
                    c19457M31099.m44971(c0176, null, new EnumC13269[0]);
                } else {
                    c19457M31099.m44971(new C7700(strM4914, c19457M31099.m44979()), new C18141(c19457M31099.m44979()), new EnumC13269[0]);
                }
                this.f40198 = 0L;
                this.f40199 = 0L;
                c19457M31099.close();
            } catch (Throwable th) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12108 m31089(C19457 c19457, int i, AbstractC20313 abstractC20313, AbstractC20313... abstractC20313Arr) {
        InterfaceC5878 interfaceC5878M44979 = c19457.m44979();
        C1337 c1337 = this.f40200;
        C0176 c0176 = new C0176(c1337.m4914(), interfaceC5878M44979);
        try {
            c0176.m1468(1);
            c0176.m1469(0);
            c0176.m1473(128);
            c0176.m1467(i);
            c0176.m1461(3);
            if (abstractC20313 != null) {
                c0176.mo10313(abstractC20313);
                int length = abstractC20313Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC20313 abstractC20314 = abstractC20313Arr[i2];
                    abstractC20313.mo10313(abstractC20314);
                    i2++;
                    abstractC20313 = abstractC20314;
                }
            } else {
                abstractC20313 = c0176;
            }
            C21059 c21059 = new C21059(c1337.m4914(), c19457.m44979());
            c21059.m48132();
            abstractC20313.mo10313(c21059);
            C7634 c7634 = (C7634) c19457.m44971(c0176, null, new EnumC13269[0]);
            C18075 c18075 = (C18075) c21059.mo1727();
            InterfaceC1162 interfaceC1162 = (c18075.m42109() & 1) != 0 ? c18075 : c7634;
            this.f40193 = true;
            interfaceC1162.getClass();
            this.f40196 = interfaceC1162.mo4305();
            this.f40202 = interfaceC1162.getAttributes() & EnumC6121.f20881;
            this.f40199 = System.currentTimeMillis() + ((C14826) c19457.m44979()).m35705();
            this.f40201 = interfaceC1162.getSize();
            this.f40198 = System.currentTimeMillis() + ((C14826) c19457.m44979()).m35705();
            return (AbstractC12108) c7634.m10334();
        } catch (RuntimeException | C20048 e) {
            try {
                C7634 c7635 = (C7634) c0176.mo1727();
                if (c7635.mo12784() && c7635.m10323() == 0) {
                    c19457.m44971(new C21059(c19457.m44979(), c7635.m20851()), null, EnumC13269.NO_RETRY);
                }
            } catch (Exception e2) {
                f40191.mo13711("Failed to close after failure", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31091(int i, long j, long j2, long j3) {
        C19457 c19457M31099 = m31099();
        try {
            if (!m31103()) {
                throw new C20728(-1073741772);
            }
            int i2 = this.f40202 & 16;
            if (c19457M31099.m44978()) {
                C2413 c2413 = new C2413(c19457M31099.m44979());
                c2413.m8156(new C5463(i | i2, j, j3, j2));
                m31089(c19457M31099, 256, c2413, new AbstractC20313[0]);
            } else if (c19457M31099.m44973(16)) {
                C6558 c6558M31087 = m31087(1, 256, 3, i2, i2 != 0 ? 1 : 64);
                try {
                    c19457M31099.m44971(new C17329(c19457M31099.m44979(), c6558M31087.m18467(), i | i2, j, j2, j3), new C15837(c19457M31099.m44979()), EnumC13269.NO_RETRY);
                    c6558M31087.m18470();
                } catch (Throwable th) {
                    try {
                        c6558M31087.m18470();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                if (j != 0 || j3 != 0) {
                    throw new C5287("Cannot set creation or access time without CAP_NT_SMBS");
                }
                c19457M31099.m44971(new C17920(c19457M31099.m44979(), this.f40200.m4914(), i, j2 - c19457M31099.m44980()), new C16428(c19457M31099.m44979()), new EnumC13269[0]);
            }
            this.f40199 = 0L;
            c19457M31099.close();
        } catch (Throwable th3) {
            if (c19457M31099 == null) {
                throw th3;
            }
            try {
                c19457M31099.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31092(long j, long j2, long j3) throws C20728 {
        if (this.f40200.m4926()) {
            throw new C20728("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31091(0, j, j2, j3);
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m31104() throws C20728 {
        int i;
        C1337 c1337 = this.f40200;
        if (c1337.m4926()) {
            i = 0;
        } else {
            m31103();
            i = this.f40202 & EnumC6121.f20881;
        }
        if (c1337.m4926()) {
            throw new C20728("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31091(i & 12454, 0L, 0L, 0L);
        } catch (C20728 e) {
            if (e.m47408() != -1073741637) {
                throw e;
            }
            throw new C5287("Attribute not supported by server");
        } catch (C20048 e2) {
            throw C20728.m47406(e2);
        }
    }

    public final int hashCode() {
        return this.f40200.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12523)) {
            return false;
        }
        InterfaceC12589 interfaceC12589 = (InterfaceC12589) obj;
        if (this == interfaceC12589) {
            return true;
        }
        return this.f40200.equals(interfaceC12589.mo31101());
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
        } catch (C20728 e) {
            f40191.mo13711("getContentLength", e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        try {
            return length();
        } catch (C20728 e) {
            f40191.mo13711("getContentLength", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        try {
            return mo31100();
        } catch (C20728 e) {
            f40191.mo13711("getDate", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        try {
            return mo31100();
        } catch (C20728 e) {
            f40191.mo13711("getLastModified", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new C24458(this);
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return new C4320(this);
    }
}
