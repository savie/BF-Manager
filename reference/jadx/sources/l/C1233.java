package l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1233 implements InterfaceC23211 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f5396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5397;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC9226 f5398;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f5399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15346 f5400 = new C15346();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Supplier f5401;

    public C1233(EnumC9226 enumC9226, long j, long j2, Supplier supplier, boolean z) {
        this.f5397 = z;
        if (enumC9226 != EnumC9226.USER && enumC9226 != EnumC9226.BATCH) {
            throw new IllegalArgumentException("Only user edits produce history");
        }
        this.f5398 = enumC9226;
        this.f5399 = j;
        this.f5396 = j2;
        this.f5401 = supplier;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m4434() {
        return this.f5399;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m4433() {
        return this.f5396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15346 m4431() {
        return this.f5400;
    }

    @Override // l.InterfaceC23211
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4432(int i, int i2, C14744 c14744, C14744 c14745, int i3) {
        if (this.f5396 == C17492.FOREVER_NS) {
            throw new IllegalStateException("Edit mark exhausted");
        }
        C8872 c8872 = (C8872) this.f5401.get();
        C13638.requireNonNull(c8872);
        if (c8872.m23016() > c14744.m35339() || c8872.m23014() > c14744.m35339()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (this.f5397 && i2 > i && i3 > 0 && c8872.m23016() == i2 && c8872.m23014() == i2) {
            c8872 = new C8872(i, i2);
        }
        C8872 c8873 = c8872;
        C15346 c15346M36738 = this.f5400;
        if (i2 - i != i3) {
            c15346M36738 = this.f5400.m36738(new C1463(i, this.f5399, this.f5396 + 1, c8873, c14744.m35334(i, i2), c14745.m35334(i, i + i3)));
            break;
        }
        if (!c14744.m35340(c14745)) {
            C4159 c4159 = new C4159(c14744, i);
            try {
                C4159 c41510 = new C4159(c14745, i);
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        try {
                            if (c4159.m11802() != c41510.m11802()) {
                                c41510.close();
                                c4159.close();
                                c15346M36738 = this.f5400.m36738(new C1463(i, this.f5399, this.f5396 + 1, c8873, c14744.m35334(i, i2), c14745.m35334(i, i + i3)));
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            try {
                                c41510.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        c41510.close();
                        c4159.close();
                        break;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c4159.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        this.f5400 = c15346M36738;
        long j = this.f5396 + 1;
        this.f5396 = j;
        this.f5399 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6899 m4430(C6899 c6899, long j) {
        if (this.f5400.isEmpty()) {
            return c6899;
        }
        if (this.f5398 == EnumC9226.BATCH) {
            return c6899.m18516(this.f5400, j);
        }
        Iterator it = this.f5400.iterator();
        while (true) {
            C4055 c4055 = (C4055) it;
            if (!c4055.hasNext()) {
                return c6899;
            }
            c6899 = c6899.m18515((C1463) c4055.next(), j);
        }
    }
}
