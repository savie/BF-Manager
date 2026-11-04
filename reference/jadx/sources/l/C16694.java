package l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16694 implements InterfaceC20730 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53934;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f53935;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Supplier f53936;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC22662 f53937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20424 f53938 = new C20424();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f53939;

    public C16694(EnumC22662 enumC22662, long j, long j2, Supplier supplier, boolean z) {
        this.f53934 = z;
        if (enumC22662 != EnumC22662.USER && enumC22662 != EnumC22662.BATCH) {
            throw new IllegalArgumentException("Only user edits produce history");
        }
        this.f53937 = enumC22662;
        this.f53935 = j;
        this.f53939 = j2;
        this.f53936 = supplier;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m39460() {
        return this.f53935;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m39459() {
        return this.f53939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 m39458() {
        return this.f53938;
    }

    @Override // l.InterfaceC20730
    /* JADX INFO: renamed from: ۙ */
    public final void mo34206(int i, int i2, C21697 c21697, C21697 c21698, int i3) {
        if (this.f53939 == C25227.FOREVER_NS) {
            throw new IllegalStateException("Edit mark exhausted");
        }
        C21498 c21498 = (C21498) this.f53936.get();
        C17359.requireNonNull(c21498);
        if (c21498.m48908() > c21697.m49259() || c21498.m48906() > c21697.m49259()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (this.f53934 && i2 > i && i3 > 0 && c21498.m48908() == i2 && c21498.m48906() == i2) {
            c21498 = new C21498(i, i2);
        }
        C21498 c21499 = c21498;
        C20424 c20424M46834 = this.f53938;
        if (i2 - i != i3) {
            c20424M46834 = this.f53938.m46834(new C10727(i, this.f53935, this.f53939 + 1, c21499, c21697.m49254(i, i2), c21698.m49254(i, i + i3)));
            break;
        }
        if (!c21697.m49260(c21698)) {
            C23714 c23714 = new C23714(c21697, i);
            try {
                C23714 c23715 = new C23714(c21698, i);
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        try {
                            if (c23714.m52965() != c23715.m52965()) {
                                c23715.close();
                                c23714.close();
                                c20424M46834 = this.f53938.m46834(new C10727(i, this.f53935, this.f53939 + 1, c21499, c21697.m49254(i, i2), c21698.m49254(i, i + i3)));
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            try {
                                c23715.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        c23715.close();
                        c23714.close();
                        break;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c23714.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        this.f53938 = c20424M46834;
        long j = this.f53939 + 1;
        this.f53939 = j;
        this.f53935 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3335 m39457(C3335 c3335, long j) {
        if (this.f53938.isEmpty()) {
            return c3335;
        }
        if (this.f53937 == EnumC22662.BATCH) {
            return c3335.m10988(this.f53938, j);
        }
        Iterator it = this.f53938.iterator();
        while (true) {
            C15948 c15948 = (C15948) it;
            if (!c15948.hasNext()) {
                return c3335;
            }
            c3335 = c3335.m10987((C10727) c15948.next(), j);
        }
    }
}
