package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36RQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17523 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f55694;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6234 f55695;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f55696;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final UUID f55697;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f55698;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f55699;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f55700;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C12175 f55701;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f55702;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Bundle f55703;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f55704;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14641 f55705;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle f55706;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f55707;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3226 f55708;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f55709;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C14641 m40786() {
        return this.f55705;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m40783() {
        return this.f55700;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m40788() {
        return this.f55709;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bundle m40787() {
        return new Bundle(this.f55706);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m40792() {
        return this.f55698;
    }

    public C17523(C3226 c3226, C6234 c6234, Bundle bundle, C12175 c12175) {
        this.f55701 = c12175;
        this.f55703 = new Bundle(bundle);
        this.f55706 = new Bundle(bundle);
        this.f55702 = C22253.m49421().digest(c6234.m17288());
        UUID uuidM9675 = c3226.m9675();
        this.f55697 = uuidM9675;
        this.f55699 = c3226.m9677();
        byte[] bArrM9676 = c3226.m9676();
        this.f55707 = bArrM9676;
        C7235.m19280(uuidM9675, bArrM9676);
        this.f55708 = c3226;
        this.f55695 = c6234;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17523 m40781(C6111 c6111, Bundle bundle, C2063 c2063, byte[] bArr, byte[] bArr2, int i, long j, byte[] bArr3) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        if (!(interfaceC2916M17000 instanceof C16408)) {
            throw new IllegalStateException("Fragment checkpoint requires a session owner");
        }
        C16408 c16408 = (C16408) interfaceC2916M17000;
        C1254 c1254Mo8735 = c16408.mo8735();
        long jM4523 = c1254Mo8735.m4523();
        C12175 c12175M16806 = c6111.m16806();
        C6276 c6276M4554 = c1254Mo8735.m4554();
        try {
            C6234 c6234M52600 = C23874.m52600(c6276M4554, bundle, c2063, c12175M16806, bArr, bArr2, i);
            c6276M4554.close();
            try {
                synchronized (c1254Mo8735) {
                    if (c1254Mo8735.m4523() != jM4523 || c6111.m17000() != interfaceC2916M17000) {
                        throw new C12585("Fragment owner changed during capture");
                    }
                    if (jM4523 != j || !Arrays.equals(bArr3, C22253.m49421().digest(c6234M52600.m17288()))) {
                        C3226 c3226M4564 = c1254Mo8735.m4564();
                        try {
                            C17523 c17523 = new C17523(c3226M4564, c6234M52600, bundle, c12175M16806);
                            c17523.f55698 = c16408.isChanged();
                            c17523.f55700 = c2063 == null ? 0 : c2063.f7652;
                            c17523.f55709 = c6111.m17042();
                            return c17523;
                        } catch (Throwable th) {
                            c3226M4564.close();
                            throw th;
                        }
                    }
                    c6234M52600.close();
                    return null;
                }
            } catch (Throwable th2) {
                c6234M52600.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c6276M4554.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m40784() {
        return (byte[]) this.f55702.clone();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12175 m40790() {
        return this.f55701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40785(InterfaceC3800 interfaceC3800, C10428 c10428) {
        C3226 c3226;
        C6234 c6234;
        byte[] bArrM17288;
        C14641 c14641M35146;
        C3226 c3226M40782;
        synchronized (this) {
            if (this.f55694 || this.f55704 || this.f55696) {
                throw new IllegalStateException("Fragment checkpoint is unavailable");
            }
            this.f55696 = true;
            c3226 = this.f55708;
            c6234 = this.f55695;
            bArrM17288 = c6234.m17288();
            c14641M35146 = this.f55705;
        }
        try {
            C9017 c9017M17289 = c6234.m17289((((long) bArrM17288.length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
            if (c14641M35146 == null) {
                try {
                    c14641M35146 = C14641.m35146(interfaceC3800, this.f55697, new ByteArrayInputStream(bArrM17288), bArrM17288.length, bArrM17288.length, c10428);
                } catch (Throwable th) {
                    if (c9017M17289 == null) {
                        throw th;
                    }
                    try {
                        c9017M17289.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f55705 = c14641M35146;
                if (this.f55694) {
                    throw new CancellationException("Fragment checkpoint was discarded");
                }
            }
            C6961.m18713(interfaceC3800, this.f55703);
            long jM9678 = c3226.m9678(C7235.m19279(this.f55707, c14641M35146, this.f55697));
            synchronized (this) {
                this.f55704 = true;
            }
            if (c9017M17289 != null) {
                c9017M17289.close();
            }
            synchronized (this) {
                this.f55696 = false;
                c3226M40782 = (this.f55694 || this.f55704) ? m40782() : null;
            }
            if (c3226M40782 != null) {
                c3226M40782.close();
            }
            return jM9678;
        } catch (Throwable th3) {
            synchronized (this) {
                this.f55696 = false;
                c3226M40782 = (this.f55694 || this.f55704) ? m40782() : null;
                if (c3226M40782 != null) {
                    c3226M40782.close();
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m40791() {
        return this.f55699;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID m40789() {
        return this.f55697;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C3226 c3226M40782;
        synchronized (this) {
            this.f55694 = true;
            c3226M40782 = !this.f55696 ? m40782() : null;
        }
        if (c3226M40782 != null) {
            c3226M40782.close();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private C3226 m40782() {
        C3226 c3226 = this.f55708;
        this.f55708 = null;
        this.f55707 = null;
        this.f55703 = null;
        C6234 c6234 = this.f55695;
        this.f55695 = null;
        if (c6234 != null) {
            c6234.close();
        }
        return c3226;
    }
}
