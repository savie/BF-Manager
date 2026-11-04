package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ATX */
/* JADX INFO: loaded from: classes.dex */
public final class C22022 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f71051;

    public C22022(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        C17364.m40796(c20348, 20227);
        c20348.readInt();
        int iM46749 = c20348.m46749();
        ArrayList arrayList = new ArrayList(iM46749);
        for (int i = 0; i < iM46749; i++) {
            arrayList.add(AbstractC2805.m9274(this, c20348));
        }
        this.f71051 = C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20227);
        c6178.m17797();
        c6178.mo17812(this.f71051.size());
        Iterator it = this.f71051.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9279(c6178);
        }
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        Iterator it = this.f71051.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9280(c9516);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49806(ArrayList arrayList) {
        this.f71051 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m49805() {
        return this.f71051;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C22022 c22022 = new C22022(abstractC2805);
        c22022.f9224 = this.f9224;
        c22022.f71051 = (List) C1170.stream(this.f71051).map(new C6704(1, abstractC2805)).collect(C2025.toList());
        return c22022;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        Iterator it = this.f71051.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9277(sb, i + 1);
        }
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9278(ArrayList arrayList) {
        Iterator it = this.f71051.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9278(arrayList);
        }
    }
}
