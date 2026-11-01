package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۨۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11457 extends AbstractC5106 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f38566;

    public C11457(C4669 c4669) {
        super("type_ids", c4669, 4);
        this.f38566 = new TreeMap();
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f38566.values();
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        Iterator it = this.f38566.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C13574) it.next()).m36533(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m28602(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f38566.get(((C6143) abstractC9901).m17128());
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found: " + abstractC9901);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28603(C2718 c2718) {
        m52243();
        TreeMap treeMap = this.f38566;
        int size = treeMap.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (size > 65536) {
            throw new C8925(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c2718.m8288()) {
            c2718.m8283(4, "type_ids_size:   ".concat(C22475.m49978(size)));
            c2718.m8283(4, "type_ids_off:    ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28605(C3320 c3320) {
        try {
            if (c3320 == null) {
                throw new NullPointerException("type == null");
            }
            m52249();
            if (((C13574) this.f38566.get(c3320)) == null) {
                this.f38566.put(c3320, new C13574(new C6143(c3320)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C13574 m28604(C6143 c6143) {
        C13574 c13574;
        try {
            if (c6143 == null) {
                throw new NullPointerException("type == null");
            }
            m52249();
            C3320 c3320M17128 = c6143.m17128();
            c13574 = (C13574) this.f38566.get(c3320M17128);
            if (c13574 == null) {
                c13574 = new C13574(c6143);
                this.f38566.put(c3320M17128, c13574);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c13574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28600(C3320 c3320) {
        if (c3320 == null) {
            throw new NullPointerException("type == null");
        }
        m52243();
        C13574 c13574 = (C13574) this.f38566.get(c3320);
        if (c13574 == null) {
            throw new IllegalArgumentException("not found: " + c3320);
        }
        return c13574.m36534();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28601(C6143 c6143) {
        if (c6143 == null) {
            throw new NullPointerException("type == null");
        }
        return m28600(c6143.m17128());
    }
}
