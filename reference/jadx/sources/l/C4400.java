package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۙۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400 extends AbstractC5106 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f15667;

    public C4400(C4669 c4669) {
        super("string_ids", c4669, 4);
        this.f15667 = new TreeMap();
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Collection mo12263() {
        return this.f15667.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m12265(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f15667.get((C17432) abstractC9901);
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12267(C2718 c2718) {
        m52243();
        int size = this.f15667.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (c2718.m8288()) {
            c2718.m8283(4, "string_ids_size: ".concat(C22475.m49978(size)));
            c2718.m8283(4, "string_ids_off:  ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12268(C17432 c17432) {
        C3258 c3258 = new C3258(c17432);
        synchronized (this) {
            m52249();
            C17432 value = c3258.getValue();
            if (((C3258) this.f15667.get(value)) != null) {
                return;
            }
            this.f15667.put(value, c3258);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12264(C17432 c17432) {
        if (c17432 == null) {
            throw new NullPointerException("string == null");
        }
        m52243();
        C3258 c3258 = (C3258) this.f15667.get(c17432);
        if (c3258 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c3258.m36534();
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo12266() {
        Iterator it = this.f15667.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C3258) it.next()).m36533(i);
            i++;
        }
    }
}
