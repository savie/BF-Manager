package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBEA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11021 extends AbstractC5106 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f37470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m27803(C1909 c1909) {
        try {
            if (c1909 == null) {
                throw new NullPointerException("prototype == null");
            }
            m52249();
            if (((C6081) this.f37470.get(c1909)) == null) {
                this.f37470.put(c1909, new C6081(c1909));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C11021(C4669 c4669) {
        super("proto_ids", c4669, 4);
        this.f37470 = new TreeMap();
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f37470.values();
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        Iterator it = this.f37470.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C6081) it.next()).m36533(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m27801(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(abstractC9901 instanceof C16727)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f37470.get(((C16727) abstractC9901).m39215());
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27802(C2718 c2718) {
        m52243();
        int size = this.f37470.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c2718.m8288()) {
            c2718.m8283(4, "proto_ids_size:  ".concat(C22475.m49978(size)));
            c2718.m8283(4, "proto_ids_off:   ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27800(C1909 c1909) {
        if (c1909 == null) {
            throw new NullPointerException("prototype == null");
        }
        m52243();
        C6081 c6081 = (C6081) this.f37470.get(c1909);
        if (c6081 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c6081.m36534();
    }
}
