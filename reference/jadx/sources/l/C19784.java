package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 699M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19784 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63647;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f63648;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f63649;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f63650;

    public C19784(AbstractC2805 abstractC2805) {
        super(abstractC2805);
        this.f63647 = new ArrayList();
    }

    public C19784(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        this.f63647 = new ArrayList();
        C17364.m40796(c20348, 20231);
        c20348.readInt();
        this.f63650 = c20348.m46742();
        this.f63648 = c20348.readByte();
        this.f63649 = C17941.m41877(c20348.m46742());
        int iM46749 = c20348.m46749();
        for (int i = 0; i < iM46749; i++) {
            this.f63647.add(AbstractC2805.m9274(this, c20348));
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20231);
        c6178.m17797();
        c6178.m17787(this.f63650);
        c6178.writeByte(this.f63648);
        c6178.m17787(C17941.m41878(this.f63649));
        ArrayList arrayList = this.f63647;
        c6178.mo17812(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9279(c6178);
        }
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        Iterator it = this.f63647.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9280(c9516);
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C19784 c19784 = new C19784(abstractC2805);
        c19784.f9224 = this.f9224;
        c19784.f63650 = this.f63650;
        c19784.f63648 = this.f63648;
        c19784.f63649 = this.f63649;
        Iterator it = this.f63647.iterator();
        while (it.hasNext()) {
            c19784.f63647.add(((AbstractC2805) it.next()).mo9275(c19784));
        }
        return c19784;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m45570() {
        return this.f63650;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45563(String str) {
        this.f63650 = str;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9278(ArrayList arrayList) {
        int i = this.f63648;
        ArrayList arrayList2 = this.f63647;
        if (i == 2) {
            if (arrayList2.size() == 1) {
                ((AbstractC2805) arrayList2.get(0)).mo9278(arrayList);
            }
        } else {
            if (arrayList2.isEmpty()) {
                return;
            }
            ((AbstractC2805) arrayList2.get(0)).mo9278(arrayList);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m45566() {
        return this.f63648;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45565(String str) {
        str.getClass();
        int i = 2;
        switch (str) {
            case "select":
                break;
            case "link":
                i = 0;
                break;
            case "linkAll":
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("Unknown group type: ".concat(str));
        }
        this.f63648 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45568(String str) {
        this.f63649 = C17941.m41877(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45569(AbstractC2805 abstractC2805) {
        this.f63647.add(abstractC2805);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m45567() {
        return this.f63647;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m45564() {
        return this.f63649;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        String str;
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM54281 = C24276.m54281(i2, "\t");
        sb.append(strM54281);
        sb.append("group: ");
        int i3 = this.f63648;
        if (i3 == 0) {
            str = "link";
        } else if (i3 == 1) {
            str = "linkAll";
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("group type=" + this.f63648);
            }
            str = "select";
        }
        sb.append(str);
        sb.append('\n');
        String strM41878 = C17941.m41878(this.f63649);
        if (strM41878 != null) {
            sb.append(strM54281);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM41878);
            sb.append('\"');
            sb.append('\n');
        }
        sb.append(strM54281);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f63647.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9277(sb, i2);
        }
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }
}
