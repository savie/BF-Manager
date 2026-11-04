package l;

import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֨ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 623X */
/* JADX INFO: loaded from: classes2.dex */
public class C1158 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f4269;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f4270;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f4271;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f4272;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f4273;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f4274;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8615 f4275;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f4276;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10852 f4277;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f4278;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f4279;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C6117 f4280;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f4281;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC15700 f4282;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f4283;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f4284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f4285 = new AtomicBoolean(false);

    static {
        new C25398(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
        f4272 = new C0412();
        f4270 = new C7870();
        f4271 = new C19057();
        f4269 = new C10106();
        new C19298();
    }

    public C1158(C6117 c6117, C8615 c8615) {
        this.f4280 = c6117;
        this.f4275 = c8615;
        C10852 c10852M23244 = c8615.m23244();
        this.f4277 = c10852M23244;
        C0150 c0150M23239 = c8615.m23239();
        this.f4282 = c0150M23239.m1341();
        C12828 c12828M23243 = c8615.m23243();
        this.f4283 = Math.min(c12828M23243.m31829(), c0150M23239.m1343());
        this.f4273 = c12828M23243.m31825();
        this.f4276 = Math.min(c12828M23243.m31833(), c0150M23239.m1344());
        this.f4281 = c12828M23243.m31817();
        this.f4274 = Math.min(c12828M23243.m31827(), c0150M23239.m1342());
        this.f4279 = c12828M23243.m31828();
        this.f4284 = c10852M23244.m27586();
        this.f4278 = c8615.m23241();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4285.getAndSet(true)) {
            return;
        }
        this.f4275.m23238();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12453 m4256(C24652 c24652) {
        if (!this.f4285.get()) {
            try {
                return this.f4277.m27584(c24652, false);
            } catch (C9469 e) {
                throw new C12082(e);
            }
        }
        throw new C12082(getClass().getSimpleName().concat(" has already been closed"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6117 m4268() {
        return this.f4280;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8615 m4267() {
        return this.f4275;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4270() {
        return this.f4283;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m4266() {
        return this.f4273;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m4265() {
        return this.f4276;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m4269() {
        return this.f4281;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13221 m4262(C6117 c6117, Set set, Set set2, Set set3, EnumC11225 enumC11225, Set set4) {
        C15458 c15458 = new C15458(this.f4282, this.f4284, this.f4278, null, set, set2, set3, enumC11225, set4, c6117);
        return (C13221) m4257(m4256(c15458), "Create", c6117, mo4258(), this.f4279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2649 mo4258() {
        return f4272;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo4263(C25398 c25398) throws Throwable {
        C19934 c19934 = new C19934(this.f4282, this.f4284, this.f4278, c25398);
        m4257(m4256(c19934), "Close", c25398, f4269, this.f4279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4264(C25398 c25398, EnumC0543 enumC0543, EnumC6073 enumC6073, byte[] bArr) throws Throwable {
        C8001 c8001 = new C8001(this.f4282, this.f4284, this.f4278, enumC0543, c25398, enumC6073, bArr);
        m4257(m4256(c8001), "SetInfo", c25398, InterfaceC2649.f8461, this.f4279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12475 m4261(C25398 c25398, EnumSet enumSet, EnumC6073 enumC6073) {
        C20680 c20680 = new C20680(this.f4282, this.f4284, this.f4278, c25398, enumC6073, enumSet, this.f4274);
        return (C12475) m4257(m4256(c20680), "Query directory", c25398, f4270, this.f4279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12453 m4260(C25398 c25398, C0653 c0653) {
        return m4256(new C2780(this.f4282, c25398, this.f4284, this.f4278, c0653, this.f4276));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4272 m4259(C25398 c25398, long j, int i) {
        return (C4272) m4257(m4271(c25398, j, i), "Read", c25398, f4271, this.f4273);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12453 m4271(C25398 c25398, long j, int i) {
        return m4256(new C24410(this.f4282, c25398, this.f4284, this.f4278, j, Math.min(i, this.f4283)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24652 m4257(C12453 c12453, String str, Object obj, InterfaceC2649 interfaceC2649, long j) throws Throwable {
        C24652 c24652;
        try {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC6488 interfaceC6488 = C9469.f30684;
                c24652 = (C24652) C24388.m54498(j, c12453);
            } else {
                InterfaceC6488 interfaceC6489 = C9469.f30684;
                try {
                    try {
                        c24652 = (C24652) c12453.get();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw interfaceC6489.mo4586(e);
                    }
                } catch (ExecutionException e2) {
                    throw interfaceC6489.mo4586(e2);
                }
            }
            if (interfaceC2649.mo2217(((C18684) c24652.mo3632()).m43472())) {
                return c24652;
            }
            throw new C22172((C18684) c24652.mo3632(), str + " failed for " + obj);
        } catch (C9469 e3) {
            throw new C12082(e3);
        }
    }

    public final int hashCode() {
        C6117 c6117 = this.f4280;
        return (c6117 == null ? 0 : c6117.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6117 c6117 = ((C1158) obj).f4280;
        C6117 c6118 = this.f4280;
        if (c6118 == null) {
            if (c6117 != null) {
                return false;
            }
        } else if (!c6118.equals(c6117)) {
            return false;
        }
        return true;
    }
}
