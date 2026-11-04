package l;

import java.io.Closeable;
import java.io.IOException;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.ᩴۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19541 implements Closeable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f63014 = C16980.m40037(C19541.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14076 f63015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4382 f63016;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC17249 f63017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12828 f63018;

    public C19541(C12828 c12828) {
        C4382 c4382 = new C4382();
        this.f63017 = new ConcurrentMapC17249();
        this.f63015 = new C14076();
        this.f63018 = c12828;
        this.f63016 = c4382;
        c4382.m13990(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21033 m45075(String str) {
        return m45074(445, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21033 m45076(int i, String str) {
        return m45074(i, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C21033 m45074(int i, String str) {
        synchronized (this) {
            String str2 = str + ":" + i;
            C21033 c21033 = (C21033) this.f63017.get(str2);
            if (c21033 != null) {
                c21033 = (C21033) c21033.m52382();
            }
            if (c21033 != null && c21033.m48058()) {
                return c21033;
            }
            C21033 c21034 = new C21033(this.f63018, this, this.f63016, this.f63015);
            try {
                c21034.m48071(i, str);
                this.f63017.put(str2, c21034);
                return c21034;
            } catch (IOException e) {
                AutoCloseable[] autoCloseableArr = {c21034};
                int i2 = C13199.f42151;
                AutoCloseable autoCloseable = autoCloseableArr[0];
                if (autoCloseable != null) {
                    try {
                        C20196.m46453(autoCloseable);
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        }
    }

    public C19541() {
        this(C12828.m31815().m36296());
    }

    @Handler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45073(C12585 c12585) {
        synchronized (this) {
            String str = c12585.m31290() + ":" + c12585.m31291();
            this.f63017.remove(str);
            this.f63015.m34245(c12585.m31290());
            f63014.mo13716(str, "Connection to << {} >> closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC25186 interfaceC25186 = f63014;
        interfaceC25186.mo13709("Going to close all remaining connections");
        for (C21033 c21033 : this.f63017.values()) {
            try {
                c21033.m48064(true);
            } catch (Exception e) {
                interfaceC25186.mo13716(c21033.m48069(), "Error closing connection to host {}");
                interfaceC25186.mo13711("Exception was: ", e);
            }
        }
    }
}
