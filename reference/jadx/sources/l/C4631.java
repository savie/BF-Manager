package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 36RQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4631 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Bundle f16395;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f16396;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f16397;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final UUID f16398;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f16399;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f16400;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C10596 f16401;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f16402;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f16403;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C12303 f16404;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f16405;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5090 f16406;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16407;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f16408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15267 f16409;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Bundle f16410;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5090 m14449() {
        return this.f16406;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m14452() {
        return this.f16396;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m14450() {
        return this.f16402;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle m14456() {
        return new Bundle(this.f16395);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m14453() {
        return this.f16403;
    }

    public C4631(C15267 c15267, C10596 c10596, Bundle bundle, C12303 c12303, byte[] bArr) {
        this.f16404 = c12303;
        this.f16410 = new Bundle(bundle);
        this.f16395 = new Bundle(bundle);
        this.f16400 = bArr;
        UUID uuidM36625 = c15267.m36625();
        this.f16398 = uuidM36625;
        this.f16399 = c15267.m36627();
        byte[] bArrM36624 = c15267.m36624();
        this.f16408 = bArrM36624;
        C11557.m29075(uuidM36625, bArrM36624);
        this.f16409 = c15267;
        this.f16401 = c10596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4631 m14447(C24132 c24132, Bundle bundle, C23056 c23056, byte[] bArr, byte[] bArr2, int i, long j, byte[] bArr3) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        if (!(interfaceC19106M54021 instanceof C3354)) {
            throw new IllegalStateException("Fragment checkpoint requires a session owner");
        }
        C3354 c3354 = (C3354) interfaceC19106M54021;
        C17505 c17505Mo11043 = c3354.mo11043();
        long jM41105 = c17505Mo11043.m41105();
        C12303 c12303M53964 = c24132.m53964();
        C7305 c7305M41121 = c17505Mo11043.m41121();
        try {
            C10596 c10596M31868 = C12834.m31868(c7305M41121, bundle, c23056, c12303M53964, bArr, bArr2, i);
            c7305M41121.close();
            try {
                byte[] bArrDigest = C15022.m36179().digest(c10596M31868.m27046());
                synchronized (c17505Mo11043) {
                    if (c17505Mo11043.m41105() != jM41105 || c24132.m54021() != interfaceC19106M54021) {
                        throw new C14170("Fragment owner changed during capture");
                    }
                    if (jM41105 != j || !Arrays.equals(bArr3, bArrDigest)) {
                        C15267 c15267M41110 = c17505Mo11043.m41110();
                        try {
                            C4631 c4631 = new C4631(c15267M41110, c10596M31868, bundle, c12303M53964, bArrDigest);
                            c4631.f16403 = c3354.isChanged();
                            c4631.f16396 = c23056 == null ? 0 : c23056.f74803;
                            c4631.f16402 = c24132.m54047();
                            return c4631;
                        } catch (Throwable th) {
                            c15267M41110.close();
                            throw th;
                        }
                    }
                    c10596M31868.close();
                    return null;
                }
            } catch (Throwable th2) {
                c10596M31868.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c7305M41121.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m14451() {
        return (byte[]) this.f16400.clone();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12303 m14457() {
        return this.f16404;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14448(InterfaceC24329 interfaceC24329, C0352 c0352) {
        C15267 c15267;
        C10596 c10596;
        byte[] bArrM27046;
        C5090 c5090M15386;
        C15267 c15267M14446;
        synchronized (this) {
            if (this.f16407 || this.f16397 || this.f16405) {
                throw new IllegalStateException("Fragment checkpoint is unavailable");
            }
            this.f16405 = true;
            c15267 = this.f16409;
            c10596 = this.f16401;
            bArrM27046 = c10596.m27046();
            c5090M15386 = this.f16406;
        }
        try {
            C18251 c18251M27047 = c10596.m27047(C1405.m5136(this.f16410) + X931RNG.BLOCK64_RESEED_MAX);
            if (c5090M15386 == null) {
                try {
                    c5090M15386 = C5090.m15386(interfaceC24329, this.f16398, new ByteArrayInputStream(bArrM27046), bArrM27046.length, bArrM27046.length, c0352);
                } catch (Throwable th) {
                    if (c18251M27047 == null) {
                        throw th;
                    }
                    try {
                        c18251M27047.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f16406 = c5090M15386;
                if (this.f16407) {
                    throw new CancellationException("Fragment checkpoint was discarded");
                }
            }
            C1405.m5138(interfaceC24329, this.f16410);
            long jM36628 = c15267.m36628(C11557.m29074(this.f16408, c5090M15386, this.f16398));
            synchronized (this) {
                this.f16397 = true;
            }
            if (c18251M27047 != null) {
                c18251M27047.close();
            }
            synchronized (this) {
                this.f16405 = false;
                c15267M14446 = (this.f16407 || this.f16397) ? m14446() : null;
            }
            if (c15267M14446 != null) {
                c15267M14446.close();
            }
            return jM36628;
        } catch (Throwable th3) {
            synchronized (this) {
                this.f16405 = false;
                c15267M14446 = (this.f16407 || this.f16397) ? m14446() : null;
                if (c15267M14446 != null) {
                    c15267M14446.close();
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m14455() {
        return this.f16399;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final UUID m14454() {
        return this.f16398;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C15267 c15267M14446;
        synchronized (this) {
            this.f16407 = true;
            c15267M14446 = !this.f16405 ? m14446() : null;
        }
        if (c15267M14446 != null) {
            c15267M14446.close();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private C15267 m14446() {
        C15267 c15267 = this.f16409;
        this.f16409 = null;
        this.f16408 = null;
        this.f16410 = null;
        C10596 c10596 = this.f16401;
        this.f16401 = null;
        if (c10596 != null) {
            c10596.close();
        }
        return c15267;
    }
}
