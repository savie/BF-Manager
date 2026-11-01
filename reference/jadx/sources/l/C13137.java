package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBFX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13137 extends AbstractC19487 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f43743;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C1141 m32497(C23077 c23077) {
        C1141 c1141;
        try {
            if (c23077 == null) {
                throw new NullPointerException("field == null");
            }
            m52249();
            c1141 = (C1141) this.f43743.get(c23077);
            if (c1141 == null) {
                c1141 = new C1141(c23077);
                this.f43743.put(c23077, c1141);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1141;
    }

    public C13137(C4669 c4669) {
        super("field_ids", c4669, 4);
        this.f43743 = new TreeMap();
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f43743.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m32495(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f43743.get((C23077) abstractC9901);
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32496(C2718 c2718) {
        m52243();
        int size = this.f43743.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (c2718.m8288()) {
            c2718.m8283(4, "field_ids_size:  ".concat(C22475.m49978(size)));
            c2718.m8283(4, "field_ids_off:   ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32494(C23077 c23077) {
        if (c23077 == null) {
            throw new NullPointerException("ref == null");
        }
        m52243();
        C1141 c1141 = (C1141) this.f43743.get(c23077);
        if (c1141 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1141.m36534();
    }
}
