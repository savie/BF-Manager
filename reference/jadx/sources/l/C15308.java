package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BM */
/* JADX INFO: loaded from: classes5.dex */
public final class C15308 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f50045;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC2805 f50046;

    public C15308(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        C17364.m40796(c20348, 20230);
        c20348.readInt();
        this.f50045 = c20348.m46758();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20230);
        c6178.m17797();
        c6178.m17800(this.f50045);
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        if (c9516.f30821.add(this.f50045)) {
            try {
                AbstractC2805 abstractC2805Mo9275 = this.f9223.mo9276().m39690(this.f50045).mo9275(this);
                this.f50046 = abstractC2805Mo9275;
                abstractC2805Mo9275.mo9280(c9516);
            } catch (RuntimeException e) {
                throw new C10833(this.f9224, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m36764() {
        return this.f50045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36763(String str) {
        this.f50045 = str;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C15308 c15308 = new C15308(abstractC2805);
        c15308.f9224 = this.f9224;
        c15308.f50045 = this.f50045;
        return c15308;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        sb.append(C24276.m54281(i + 1, "\t"));
        sb.append("include: \"");
        sb.append(this.f50045);
        sb.append("\"\n");
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9278(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C15308) it.next()).f50045.equals(this.f50045)) {
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add("include \"" + ((C15308) it2.next()).f50045 + "\"");
                }
                arrayList2.add("include \"" + this.f50045 + "\"");
                throw new C5786("There is a circular hard dependency: " + C24276.m54283(arrayList2, " > "));
            }
        }
        ArrayList arrayList3 = (ArrayList) arrayList.clone();
        arrayList3.add(this);
        if (this.f50046 == null) {
            this.f50046 = this.f9223.mo9276().m39690(this.f50045).mo9275(this);
        }
        this.f50046.mo9278(arrayList3);
    }
}
