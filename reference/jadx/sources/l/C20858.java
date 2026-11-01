package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩷ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20858 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f67777 = C13488.m32997(C20858.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C1163 f67778;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18035 f67780;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12185 f67781;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0458 f67784;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5335 f67785;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15276 f67786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16418 f67788;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f67789;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20153 f67779 = new C20153();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f67783 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f67787 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15920 f67782 = new C15920();

    public C20858(C1163 c1163, C16418 c16418, C12185 c12185, C5335 c5335, InterfaceC18035 interfaceC18035, InterfaceC0458 interfaceC0458, C15276 c15276) {
        this.f67778 = c1163;
        this.f67788 = c16418;
        this.f67781 = c12185;
        this.f67785 = c5335;
        this.f67780 = interfaceC18035;
        this.f67784 = interfaceC0458;
        this.f67786 = c15276;
        if (c5335 != null) {
            c5335.m14812(this);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m46886() {
        return this.f67789;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46893(long j) {
        this.f67789 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21294 m46891(String str) {
        C21294 c5066;
        if (str.contains("\\")) {
            throw new IllegalArgumentException(C16523.m38890("Share name (", str, ") cannot contain '\\' characters."));
        }
        C20153 c20153 = this.f67779;
        C21294 c21294M45577 = c20153.m45577(str);
        InterfaceC4314 interfaceC4314 = f67777;
        if (c21294M45577 != null) {
            interfaceC4314.mo12121("Returning cached Share {} for {}", c21294M45577, str);
            return c21294M45577;
        }
        InterfaceC18035 interfaceC18035 = this.f67780;
        C1163 c1163 = this.f67778;
        C11748 c11748 = new C11748(c1163.m4292(), str, null);
        interfaceC4314.mo12117("Connecting to {} on session {}", c11748, Long.valueOf(this.f67789));
        try {
            C22688 c22688 = new C22688(c1163.m4290().m11484(), c11748, this.f67789);
            ((C1186) c22688.mo25478()).m4343(256);
            C13557 c13557M46889 = m46889((C11771) c22688, false);
            long jM38674 = this.f67788.m38674();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC11440 interfaceC11440 = C21317.f69360;
            C14927 c14927 = (C14927) C2266.m6947(jM38674, c13557M46889);
            try {
                C21294 c21294 = (C21294) interfaceC18035.mo21470(this, c14927, c11748, new C7452(this, c11748));
                if (c21294 != null) {
                    return c21294;
                }
            } catch (C15214 unused) {
            }
            if (EnumC3055.m9151(((C1186) c14927.mo25478()).m4349())) {
                interfaceC4314.mo12135(((C1186) c14927.mo25478()).toString());
                throw new C10360((C1186) c14927.mo25478(), "Could not connect to " + c11748);
            }
            if (c14927.m35673().contains(EnumC4008.SMB2_SHARE_CAP_ASYMMETRIC)) {
                throw new C13865("ASYMMETRIC capability unsupported");
            }
            C7889 c7889 = new C7889(((C1186) c14927.mo25478()).m4347(), c11748, this, (EnumSet) c14927.m35673(), this.f67788, c1163.m4281(), this.f67785, c14927.m35671(), c14927.m35672());
            if (c14927.m35676()) {
                c5066 = new C9570(c11748, c7889, interfaceC18035);
            } else if (c14927.m35674()) {
                c5066 = new C2243(c11748, c7889);
            } else {
                if (!c14927.m35675()) {
                    throw new C13865("Unknown ShareType returned in the TREE_CONNECT Response");
                }
                c5066 = new C5066(c11748, c7889);
            }
            c20153.m45579(c5066);
            return c5066;
        } catch (C21317 e) {
            throw new C13865(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20858 m46890(C11748 c11748) {
        HashMap map = this.f67783;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f67787;
        reentrantReadWriteLock.readLock().lock();
        try {
            C20858 c20858 = (C20858) map.get(c11748.m29355());
            if (c20858 != null) {
                reentrantReadWriteLock.readLock().unlock();
                return c20858;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                C20858 c20858M46884 = (C20858) map.get(c11748.m29355());
                if (c20858M46884 == null) {
                    c20858M46884 = m46884(c11748);
                    map.put(c11748.m29355(), c20858M46884);
                }
                reentrantReadWriteLock.readLock().lock();
                reentrantReadWriteLock.writeLock().unlock();
                reentrantReadWriteLock.readLock().unlock();
                return c20858M46884;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.readLock().unlock();
            throw th2;
        }
    }

    @Handler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46882(C13097 c13097) {
        if (c13097.m49436() == this.f67789) {
            f67777.mo12126(Long.valueOf(c13097.m32315()), "Notified of TreeDisconnected <<{}>>");
            this.f67779.m45578(c13097.m32315());
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m46885() {
        C5335 c5335 = this.f67785;
        C1163 c1163 = this.f67778;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f67787;
        InterfaceC4314 interfaceC4314 = f67777;
        try {
            interfaceC4314.mo12117("Logging off session {} from host {}", Long.valueOf(this.f67789), c1163.m4292());
            for (C21294 c21294 : this.f67779.m45576()) {
                try {
                    c21294.close();
                } catch (IOException e) {
                    interfaceC4314.mo12128("Caught exception while closing TreeConnect with id: {}", Long.valueOf(c21294.m47744().m20822()), e);
                }
            }
            reentrantReadWriteLock.writeLock().lock();
            try {
                for (C20858 c20858 : this.f67783.values()) {
                    interfaceC4314.mo12117("Logging off nested session {} for session {}", Long.valueOf(c20858.f67789), Long.valueOf(this.f67789));
                    try {
                        c20858.m46885();
                    } catch (C21317 unused) {
                        interfaceC4314.mo12118(Long.valueOf(c20858.f67789), "Caught exception while logging off nested session {}");
                    }
                }
                reentrantReadWriteLock.writeLock().unlock();
                C13557 c13557M46889 = m46889((C11771) new C23766(c1163.m4290().m11484(), this.f67789), false);
                long jM38674 = this.f67788.m38674();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC11440 interfaceC11440 = C21317.f69360;
                C23766 c23766 = (C23766) C2266.m6947(jM38674, c13557M46889);
                if (!EnumC3055.m9152(((C1186) c23766.mo25478()).m4349())) {
                    throw new C10360((C1186) c23766.mo25478(), "Could not logoff session <<" + this.f67789 + ">>");
                }
                c5335.m14813(new C1101(this.f67789));
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            c5335.m14813(new C1101(this.f67789));
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m46894() {
        return this.f67782.m37871();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46885();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C20858 m46884(C11748 c11748) {
        try {
            return this.f67778.m4295().m45242(c11748.m29355()).m4285(this.f67781);
        } catch (IOException e) {
            throw new C10360(EnumC3055.STATUS_OTHER.getValue(), EnumC2162.SMB2_NEGOTIATE, "Could not connect to DFS root " + c11748, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1163 m46888() {
        return this.f67778;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13557 m46889(C11771 c11771, boolean z) throws C21317 {
        SecretKey secretKeyM46887 = m46887((C1186) c11771.mo25478(), true);
        C15920 c15920 = this.f67782;
        if (c15920.m37871() && secretKeyM46887 == null) {
            throw new C21317("Message signing is required, but no signing key is negotiated");
        }
        C21294 c21294M45580 = this.f67779.m45580(((C1186) c11771.mo25478()).m4347());
        boolean z2 = c21294M45580 != null && c21294M45580.m47744().m20816();
        C1163 c1163 = this.f67778;
        boolean zM32541 = c1163.m4281().m32541();
        if ((c15920.m37884() || z2 || z) && c15920.m37882() == null) {
            throw new C21317("Message encryption is required, but no encryption key is negotiated");
        }
        if ((c15920.m37884() || z2 || z) | (c15920.m37882() != null && zM32541)) {
            return c1163.m4284(this.f67786.m36586(c11771, c15920.m37882()), true);
        }
        return c1163.m4284(this.f67784.mo2283(c11771, secretKeyM46887), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SecretKey m46887(C1186 c1186, boolean z) {
        boolean zM46306 = this.f67778.m4290().m11484().m46306();
        C15920 c15920 = this.f67782;
        if (zM46306) {
            if (c1186.m4325() == EnumC2162.SMB2_SESSION_SETUP) {
                if (z) {
                    return c15920.m37878();
                }
                if (c1186.m4349() != EnumC3055.STATUS_SUCCESS.getValue()) {
                    return c15920.m37878();
                }
            }
            return c15920.m37878();
        }
        return c15920.m37872();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15920 m46892() {
        return this.f67782;
    }
}
