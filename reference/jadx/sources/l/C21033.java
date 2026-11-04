package l;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩶ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21033 extends C23271 implements Closeable, InterfaceC10215 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f67207 = C16980.m40037(C21033.class);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final C14319 f67208 = new C14319(new C7497(), new C9733(), new C14954(), new C8593());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12828 f67209;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7608 f67210;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC9601 f67211;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C20044 f67212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23028 f67213;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18049 f67214;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20044 f67215;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20790 f67216;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f67217;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C4713 f67218;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14076 f67219;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19541 f67220;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9844 f67221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4382 f67222;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15568 f67223;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48063(InterfaceC13988 interfaceC13988) {
        this.f67216.m32898((AbstractC21779) interfaceC13988);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19541 m48068() {
        return this.f67220;
    }

    public C21033(C12828 c12828, C19541 c19541, C4382 c4382, C14076 c14076) {
        C20044 c20044 = new C20044();
        this.f67212 = c20044;
        this.f67215 = new C20044();
        C7608 c7608 = new C7608();
        this.f67210 = c7608;
        C20922 c20922 = new C20922();
        this.f67217 = new ReentrantLock();
        this.f67209 = c12828;
        this.f67220 = c19541;
        C1112 c1112M31826 = c12828.m31826();
        C19166 c19166 = new C19166(new C1709(), this, f67208);
        c1112M31826.getClass();
        this.f67218 = new C4713(c12828.m31816(), c12828.m31819(), c19166);
        this.f67222 = c4382;
        this.f67219 = c14076;
        c4382.m13990(this);
        this.f67213 = new C23028();
        if (c12828.m31823()) {
            this.f67223 = new C9098(c12828.m31824());
        } else {
            f67207.mo13729("Signing is disabled for this connection.");
            this.f67223 = new C5306();
        }
        this.f67221 = new C9844(c12828.m31824());
        C20790 c20790 = new C20790(c20044, this.f67221);
        C25266 c25266 = new C25266();
        C17806 c17806 = new C17806(c7608);
        C3636 c3636 = new C3636(c20044, this.f67223);
        C17060 c17060 = new C17060(this.f67213);
        C11839 c11839 = new C11839(c7608);
        C23774 c23774 = new C23774(c20922, c7608);
        C2145 c2145 = new C2145();
        c2145.m32897(new C5874());
        c23774.m32897(c2145);
        c11839.m32897(c23774);
        c17060.m32897(c11839);
        c3636.m32897(c17060);
        c17806.m32897(c3636);
        c25266.m32897(c17806);
        c20790.m32897(c25266);
        this.f67216 = c20790;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m48064(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48064(boolean z) {
        if (z || m52383()) {
            C4382 c4382 = this.f67222;
            C4713 c4713 = this.f67218;
            InterfaceC25186 interfaceC25186 = f67207;
            if (!z) {
                try {
                    for (C10852 c10852 : this.f67212.m46099()) {
                        try {
                            c10852.m27587();
                        } catch (IOException e) {
                            interfaceC25186.mo13710("Exception while closing session {}", Long.valueOf(c10852.m27586()), e);
                        }
                    }
                } catch (Throwable th) {
                    c4713.m14603();
                    interfaceC25186.mo13720(m48069(), "Closed connection to {}");
                    c4382.m13991(new C12585(this.f67214.m42054().m20224(), this.f67214.m42054().m20225()));
                    throw th;
                }
            }
            c4713.m14603();
            interfaceC25186.mo13720(m48069(), "Closed connection to {}");
            c4382.m13991(new C12585(this.f67214.m42054().m20224(), this.f67214.m42054().m20225()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10852 m48059(C1642 c1642) {
        return new C11093(this, this.f67209, new C24017(this)).m28008(c1642);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24652 m48061(C24652 c24652) {
        C12453 c12453M48060 = m48060(c24652, false);
        long jM31828 = this.f67209.m31828();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC6488 interfaceC6488 = C9469.f30684;
        return (C24652) C24388.m54498(jM31828, c12453M48060);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:5:0x000f, B:8:0x0025, B:10:0x002d, B:17:0x0042, B:19:0x004d, B:21:0x0060, B:24:0x00c9, B:15:0x003e, B:20:0x005c), top: B:33:0x000f, inners: #0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12453 m48060(C24652 c24652, boolean z) {
        C12453 c12453M8118;
        C23028 c23028 = this.f67213;
        if (c24652.mo3630() instanceof C10983) {
            c12453M8118 = null;
        } else {
            ReentrantLock reentrantLock = this.f67217;
            reentrantLock.lock();
            try {
                int iM51927 = c23028.m51927();
                int iAbs = Math.abs((c24652.mo3631() - 1) / 65536) + 1;
                InterfaceC25186 interfaceC25186 = f67207;
                if (iAbs <= 1 || this.f67214.m42062()) {
                    if (iAbs >= iM51927) {
                        if (iAbs > 1 && iM51927 > 1) {
                            iAbs = iM51927 - 1;
                        }
                    }
                    ((C18684) c24652.mo3632()).m43452(iAbs);
                    if (iM51927 == 0) {
                        interfaceC25186.mo13728(((C18684) c24652.mo3632()).m43462(), "There are no credits left to send {}, will block until there are more credits available.");
                    }
                    ((C18684) c24652.mo3632()).m43467(c23028.m51929(iAbs)[0]);
                    ((C18684) c24652.mo3632()).m43466(Math.max((512 - iM51927) - iAbs, iAbs));
                    interfaceC25186.mo13725("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM51927), c24652);
                    reentrantLock.unlock();
                    C2387 c2387 = new C2387(c24652.mo3630(), ((C18684) c24652.mo3632()).m43457(), UUID.randomUUID(), z);
                    this.f67210.m20809(c2387);
                    c12453M8118 = c2387.m8118(new C3879(this, c2387, ((C18684) c24652.mo3632()).m43461()));
                } else {
                    interfaceC25186.mo13708(m48069(), "Connection to {} does not support multi-credit requests.");
                }
                iAbs = 1;
                ((C18684) c24652.mo3632()).m43452(iAbs);
                if (iM51927 == 0) {
                    interfaceC25186.mo13728(((C18684) c24652.mo3632()).m43462(), "There are no credits left to send {}, will block until there are more credits available.");
                }
                ((C18684) c24652.mo3632()).m43467(c23028.m51929(iAbs)[0]);
                ((C18684) c24652.mo3632()).m43466(Math.max((512 - iM51927) - iAbs, iAbs));
                interfaceC25186.mo13725("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM51927), c24652);
                reentrantLock.unlock();
                C2387 c2388 = new C2387(c24652.mo3630(), ((C18684) c24652.mo3632()).m43457(), UUID.randomUUID(), z);
                this.f67210.m20809(c2388);
                c12453M8118 = c2388.m8118(new C3879(this, c2388, ((C18684) c24652.mo3632()).m43461()));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f67218.m14605(c24652);
        return c12453M8118;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0150 m48065() {
        return this.f67214.m42061();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48062(C9469 c9469) {
        this.f67210.m20810(c9469);
        try {
            m48064(false);
        } catch (Exception e) {
            f67207.mo13701("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m48069() {
        return this.f67214.m42054().m20224();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m48058() {
        return this.f67218.m14606();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48071(int i, String str) {
        C4713 c4713 = this.f67218;
        if (c4713.m14606()) {
            throw new IllegalStateException(C25272.m56409("This connection is already connected to ", m48069()));
        }
        c4713.m14604(new InetSocketAddress(str, i));
        C12828 c12828 = this.f67209;
        this.f67214 = new C18049(c12828.m31831(), str, i, c12828);
        new C13573(this, c12828, this.f67214).m33279();
        this.f67221.m25635(this.f67214);
        this.f67211 = new C8856();
        f67207.mo13720(m48069(), "Successfully connected to: {}");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18049 m48067() {
        return this.f67214;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m48066() {
        return this.f67213.m51927();
    }

    @Handler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48050(C21536 c21536) {
        this.f67212.m46102(Long.valueOf(c21536.m35692()));
        f67207.mo13716(Long.valueOf(c21536.m35692()), "Session << {} >> logged off");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20044 m48072() {
        return this.f67212;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20044 m48070() {
        return this.f67215;
    }
}
