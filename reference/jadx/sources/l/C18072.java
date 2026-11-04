package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܿۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBAP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18072 extends AbstractC13354 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TreeMap f59154;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f59155;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42107(C5503 c5503) {
        try {
            if (c5503 == null) {
                throw new NullPointerException("cstRef");
            }
            m23363();
            if (((C21056) this.f59155.get(c5503)) == null) {
                this.f59155.put(c5503, new C21056(c5503));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C18072(C10918 c10918) {
        super("call_site_ids", c10918, 4);
        this.f59155 = new TreeMap();
        this.f59154 = new TreeMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m42106(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f59155.get((C5503) abstractC13487);
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ */
    public final void mo3720() {
        Iterator it = this.f59155.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C21056) it.next()).m38319(i);
            i++;
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f59155.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42108(C12960 c12960, C0173 c0173) {
        this.f59154.put(c12960, c0173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0173 m42105(C12960 c12960) {
        if (c12960 == null) {
            throw new NullPointerException("callSite == null");
        }
        return (C0173) this.f59154.get(c12960);
    }
}
