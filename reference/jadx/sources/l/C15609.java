package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܺ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBAP */
/* JADX INFO: loaded from: classes5.dex */
public final class C15609 extends AbstractC5106 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TreeMap f50747;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f50748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37277(C1203 c1203) {
        try {
            if (c1203 == null) {
                throw new NullPointerException("cstRef");
            }
            m52249();
            if (((C20547) this.f50748.get(c1203)) == null) {
                this.f50748.put(c1203, new C20547(c1203));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C15609(C4669 c4669) {
        super("call_site_ids", c4669, 4);
        this.f50748 = new TreeMap();
        this.f50747 = new TreeMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m37275(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f50748.get((C1203) abstractC9901);
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        Iterator it = this.f50748.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C20547) it.next()).m36533(i);
            i++;
        }
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f50748.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37278(C22371 c22371, C19842 c19842) {
        this.f50747.put(c22371, c19842);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19842 m37276(C22371 c22371) {
        if (c22371 == null) {
            throw new NullPointerException("callSite == null");
        }
        return (C19842) this.f50747.get(c22371);
    }
}
