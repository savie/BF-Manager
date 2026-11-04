package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08DV */
/* JADX INFO: loaded from: classes5.dex */
public class C19715 extends AbstractC4053 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f63454 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f63455 = new LinkedHashMap();

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        Iterator it = this.f63454.iterator();
        while (it.hasNext()) {
            ((AbstractC4053) it.next()).mo2017();
        }
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ۙ */
    public final void mo13035() {
        Iterator it = this.f63454.iterator();
        while (it.hasNext()) {
            ((AbstractC4053) it.next()).mo13035();
        }
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ۙ */
    public final void mo13041(boolean z) {
        super.mo13041(z);
        Iterator it = this.f63454.iterator();
        while (it.hasNext()) {
            ((AbstractC4053) it.next()).mo13041(z);
        }
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ۙ */
    public final void mo13038(C15745 c15745) {
        super.mo13038(c15745);
        Iterator it = this.f63454.iterator();
        while (it.hasNext()) {
            ((AbstractC4053) it.next()).mo13038(c15745);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45408(AbstractC4053 abstractC4053) {
        this.f63454.add(abstractC4053);
        abstractC4053.m13039(this);
        abstractC4053.mo13041(m13044());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45409(C13508 c13508, String str) {
        this.f63455.put(str.toLowerCase(), c13508);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ۙ */
    public final C21953 mo13034(String str) {
        C21953 c21953Mo13034 = super.mo13034(str);
        return c21953Mo13034 == null ? (C21953) this.f63455.get(str.toLowerCase()) : c21953Mo13034;
    }
}
