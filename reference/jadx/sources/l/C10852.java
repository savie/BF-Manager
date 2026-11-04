package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.ۤۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10852 implements AutoCloseable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f34361 = C16980.m40037(C10852.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9844 f34362;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC15568 f34364;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C1642 f34365;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f34368;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9601 f34369;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4382 f34370;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21033 f34371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12828 f34373;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C19803 f34367 = new C19803();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HashMap f34366 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f34372 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22787 f34363 = new C22787();

    public C10852(C21033 c21033, C12828 c12828, C1642 c1642, C4382 c4382, InterfaceC9601 interfaceC9601, InterfaceC15568 interfaceC15568, C9844 c9844) {
        this.f34371 = c21033;
        this.f34373 = c12828;
        this.f34365 = c1642;
        this.f34370 = c4382;
        this.f34369 = interfaceC9601;
        this.f34364 = interfaceC15568;
        this.f34362 = c9844;
        if (c4382 != null) {
            c4382.m13990(this);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m27586() {
        return this.f34368;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27590(long j) {
        this.f34368 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1158 m27582(String str) {
        C1158 c4141;
        if (str.contains("\\")) {
            throw new IllegalArgumentException(C14442.m34865("Share name (", str, ") cannot contain '\\' characters."));
        }
        C19803 c19803 = this.f34367;
        C1158 c1158M45575 = c19803.m45575(str);
        InterfaceC25186 interfaceC25186 = f34361;
        if (c1158M45575 != null) {
            interfaceC25186.mo13701("Returning cached Share {} for {}", c1158M45575, str);
            return c1158M45575;
        }
        InterfaceC9601 interfaceC9601 = this.f34369;
        C21033 c21033 = this.f34371;
        C6117 c6117 = new C6117(c21033.m48069(), str, null);
        interfaceC25186.mo13730("Connecting to {} on session {}", c6117, Long.valueOf(this.f34368));
        try {
            C10237 c10237 = new C10237(c21033.m48065().m1341(), c6117, this.f34368);
            ((C18684) c10237.mo3632()).m43466(256);
            C12453 c12453M27584 = m27584((C24652) c10237, false);
            long jM31828 = this.f34373.m31828();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC6488 interfaceC6488 = C9469.f30684;
            C1289 c1289 = (C1289) C24388.m54498(jM31828, c12453M27584);
            try {
                C1158 c1158 = (C1158) interfaceC9601.mo23732(this, c1289, c6117, new C22041(this, c6117));
                if (c1158 != null) {
                    return c1158;
                }
            } catch (C10347 unused) {
            }
            if (EnumC20243.m46513(((C18684) c1289.mo3632()).m43472())) {
                interfaceC25186.mo13721(((C18684) c1289.mo3632()).toString());
                throw new C22172((C18684) c1289.mo3632(), "Could not connect to " + c6117);
            }
            if (c1289.m4680().contains(EnumC8243.SMB2_SHARE_CAP_ASYMMETRIC)) {
                throw new C12082("ASYMMETRIC capability unsupported");
            }
            C8615 c8615 = new C8615(((C18684) c1289.mo3632()).m43464(), c6117, this, (EnumSet) c1289.m4680(), this.f34373, c21033.m48067(), this.f34370, c1289.m4679(), c1289.m4681());
            if (c1289.m4685()) {
                c4141 = new C23533(c6117, c8615, interfaceC9601);
            } else if (c1289.m4682()) {
                c4141 = new C24279(c6117, c8615);
            } else {
                if (!c1289.m4683()) {
                    throw new C12082("Unknown ShareType returned in the TREE_CONNECT Response");
                }
                c4141 = new C4141(c6117, c8615);
            }
            c19803.m45577(c4141);
            return c4141;
        } catch (C9469 e) {
            throw new C12082(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10852 m27583(C6117 c6117) {
        HashMap map = this.f34366;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f34372;
        reentrantReadWriteLock.readLock().lock();
        try {
            C10852 c10852 = (C10852) map.get(c6117.m17648());
            if (c10852 != null) {
                reentrantReadWriteLock.readLock().unlock();
                return c10852;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                C10852 c10852M27580 = (C10852) map.get(c6117.m17648());
                if (c10852M27580 == null) {
                    c10852M27580 = m27580(c6117);
                    map.put(c6117.m17648(), c10852M27580);
                }
                reentrantReadWriteLock.readLock().lock();
                reentrantReadWriteLock.writeLock().unlock();
                reentrantReadWriteLock.readLock().unlock();
                return c10852M27580;
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
    private void m27578(C18552 c18552) {
        if (c18552.m35692() == this.f34368) {
            f34361.mo13716(Long.valueOf(c18552.m43133()), "Notified of TreeDisconnected <<{}>>");
            this.f34367.m45576(c18552.m43133());
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m27587() {
        C4382 c4382 = this.f34370;
        C21033 c21033 = this.f34371;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f34372;
        InterfaceC25186 interfaceC25186 = f34361;
        try {
            interfaceC25186.mo13730("Logging off session {} from host {}", Long.valueOf(this.f34368), c21033.m48069());
            for (C1158 c1158 : this.f34367.m45574()) {
                try {
                    c1158.close();
                } catch (IOException e) {
                    interfaceC25186.mo13718("Caught exception while closing TreeConnect with id: {}", Long.valueOf(c1158.m4267().m23241()), e);
                }
            }
            reentrantReadWriteLock.writeLock().lock();
            try {
                for (C10852 c10852 : this.f34366.values()) {
                    interfaceC25186.mo13730("Logging off nested session {} for session {}", Long.valueOf(c10852.f34368), Long.valueOf(this.f34368));
                    try {
                        c10852.m27587();
                    } catch (C9469 unused) {
                        interfaceC25186.mo13698(Long.valueOf(c10852.f34368), "Caught exception while logging off nested session {}");
                    }
                }
                reentrantReadWriteLock.writeLock().unlock();
                C12453 c12453M27584 = m27584((C24652) new C17696(c21033.m48065().m1341(), this.f34368), false);
                long jM31828 = this.f34373.m31828();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC6488 interfaceC6488 = C9469.f30684;
                C17696 c17696 = (C17696) C24388.m54498(jM31828, c12453M27584);
                if (!EnumC20243.m46514(((C18684) c17696.mo3632()).m43472())) {
                    throw new C22172((C18684) c17696.mo3632(), "Could not logoff session <<" + this.f34368 + ">>");
                }
                c4382.m13991(new C21536(this.f34368));
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            c4382.m13991(new C21536(this.f34368));
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m27588() {
        return this.f34363.m51396();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m27587();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10852 m27580(C6117 c6117) {
        try {
            return this.f34371.m48068().m45075(c6117.m17648()).m48059(this.f34365);
        } catch (IOException e) {
            throw new C22172(EnumC20243.STATUS_OTHER.getValue(), EnumC23906.SMB2_NEGOTIATE, "Could not connect to DFS root " + c6117, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21033 m27585() {
        return this.f34371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12453 m27584(C24652 c24652, boolean z) throws C9469 {
        SecretKey secretKeyM27581 = m27581((C18684) c24652.mo3632(), true);
        C22787 c22787 = this.f34363;
        if (c22787.m51396() && secretKeyM27581 == null) {
            throw new C9469("Message signing is required, but no signing key is negotiated");
        }
        C1158 c1158M45578 = this.f34367.m45578(((C18684) c24652.mo3632()).m43464());
        boolean z2 = c1158M45578 != null && c1158M45578.m4267().m23240();
        C21033 c21033 = this.f34371;
        boolean zM42056 = c21033.m48067().m42056();
        if ((c22787.m51397() || z2 || z) && c22787.m51399() == null) {
            throw new C9469("Message encryption is required, but no encryption key is negotiated");
        }
        if ((c22787.m51397() || z2 || z) | (c22787.m51399() != null && zM42056)) {
            return c21033.m48060(this.f34362.m25634(c24652, c22787.m51399()), true);
        }
        return c21033.m48060(this.f34364.mo15939(c24652, secretKeyM27581), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SecretKey m27581(C18684 c18684, boolean z) {
        boolean zM37476 = this.f34371.m48065().m1341().m37476();
        C22787 c22787 = this.f34363;
        if (zM37476) {
            if (c18684.m43462() == EnumC23906.SMB2_SESSION_SETUP) {
                if (z) {
                    return c22787.m51398();
                }
                if (c18684.m43472() != EnumC20243.STATUS_SUCCESS.getValue()) {
                    return c22787.m51398();
                }
            }
            return c22787.m51398();
        }
        return c22787.m51401();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22787 m27589() {
        return this.f34363;
    }
}
