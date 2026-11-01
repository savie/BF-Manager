package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܺ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBHA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15960 extends AbstractC19487 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f51726;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37947(AbstractC11788 abstractC11788) {
        try {
            if (abstractC11788 == null) {
                throw new NullPointerException("method == null");
            }
            m52249();
            if (((C20898) this.f51726.get(abstractC11788)) == null) {
                this.f51726.put(abstractC11788, new C20898(abstractC11788));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C15960(C4669 c4669) {
        super("method_ids", c4669, 4);
        this.f51726 = new TreeMap();
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f51726.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m37945(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f51726.get((AbstractC11788) abstractC9901);
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37946(C2718 c2718) {
        m52243();
        int size = this.f51726.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (c2718.m8288()) {
            c2718.m8283(4, "method_ids_size: ".concat(C22475.m49978(size)));
            c2718.m8283(4, "method_ids_off:  ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37944(AbstractC11788 abstractC11788) {
        if (abstractC11788 == null) {
            throw new NullPointerException("ref == null");
        }
        m52243();
        C20898 c20898 = (C20898) this.f51726.get(abstractC11788);
        if (c20898 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c20898.m36534();
    }
}
