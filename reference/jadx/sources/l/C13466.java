package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SARS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13466 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f42860;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f42861;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f42862;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42863;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f42864;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15703 f42865;

    public C13466(AbstractC2805 abstractC2805) {
        super(abstractC2805);
        List list = Collections.EMPTY_LIST;
        this.f42861 = list;
        this.f42862 = list;
        this.f42860 = list;
    }

    public C13466(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        List list = Collections.EMPTY_LIST;
        this.f42861 = list;
        this.f42862 = list;
        this.f42860 = list;
        C17364.m40796(c20348, 20225);
        c20348.readInt();
        this.f42864 = c20348.m46742();
        int iM46749 = c20348.m46749();
        int iM467410 = c20348.m46749();
        ArrayList arrayList = new ArrayList(iM467410 + 1);
        ArrayList arrayList2 = new ArrayList(iM467410);
        arrayList.add(c20348.m46756());
        for (int i = 0; i < iM467410; i++) {
            arrayList2.add(c20348.m46756());
            arrayList.add(c20348.m46756());
        }
        this.f42865 = C15703.m37484(arrayList, arrayList2, iM46749);
        this.f42863 = c20348.m46753();
        int iM467411 = c20348.m46749();
        ArrayList arrayList3 = new ArrayList(iM467411);
        for (int i2 = 0; i2 < iM467411; i2++) {
            arrayList3.add(new C20992(c20348.m46749(), c20348.m46756()));
        }
        this.f42861 = C4681.unmodifiableList(arrayList3);
        int iM467412 = c20348.m46749();
        ArrayList arrayList4 = new ArrayList(iM467412);
        for (int i3 = 0; i3 < iM467412; i3++) {
            arrayList4.add(C16449.m39003(c20348.m46749(), c20348.m46758()));
        }
        this.f42862 = C4681.unmodifiableList(arrayList4);
        int iM467413 = c20348.m46749();
        ArrayList arrayList5 = new ArrayList(iM467413);
        for (int i4 = 0; i4 < iM467413; i4++) {
            arrayList5.add(new C8771(c20348.m46749(), AbstractC2805.m9274(this, c20348)));
        }
        this.f42860 = C4681.unmodifiableList(arrayList5);
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20225);
        c6178.m17797();
        c6178.m17787(this.f42864);
        this.f42865.m37491(c6178);
        c6178.m17789(this.f42863);
        c6178.mo17812(this.f42861.size());
        for (C20992 c20992 : this.f42861) {
            c6178.mo17812(c20992.m47979());
            c6178.m17786((CharSequence) c20992.m47980());
        }
        List list = this.f42862;
        int size = list.size();
        c6178.mo17812(size);
        for (int i = 0; i < size; i++) {
            C16449 c16449 = (C16449) list.get(i);
            c6178.m17800(c16449.f53343);
            c6178.mo17812(c16449.f53346);
        }
        c6178.mo17812(this.f42860.size());
        for (C8771 c8771 : this.f42860) {
            c6178.mo17812(c8771.m23468());
            c8771.m23470().mo9279(c6178);
        }
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        this.f42865.getClass();
        boolean zIsEmpty = this.f42861.isEmpty();
        AbstractC2805 abstractC2805 = this.f9223;
        if (!zIsEmpty && (!(abstractC2805 instanceof C6009) || ((C6009) abstractC2805).m17473() != this)) {
            throw new C10833(this.f9224, "export is only allowed on a direct start match");
        }
        if (this.f42865.m37494() && (!(abstractC2805 instanceof C6009) || ((C6009) abstractC2805).m17470() != this)) {
            throw new C10833(this.f9224, "var() is only allowed on a direct end match");
        }
        Iterator it = this.f42860.iterator();
        while (it.hasNext()) {
            ((C8771) it.next()).m23470().mo9280(c9516);
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C13466 c13466 = new C13466(abstractC2805);
        c13466.f9224 = this.f9224;
        c13466.f42864 = this.f42864;
        c13466.f42865 = this.f42865;
        c13466.f42861 = this.f42861;
        c13466.f42862 = this.f42862;
        if (!this.f42860.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f42860.size());
            Iterator it = this.f42860.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8771) it.next()).m23469(c13466));
            }
            c13466.f42860 = arrayList;
        }
        c13466.f42863 = this.f42863;
        return c13466;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m33123() {
        return this.f42864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33111(String str) {
        this.f42864 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33114(C18415 c18415) {
        this.f42865 = C15703.m37485(c18415);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15703 m33116() {
        return this.f42865;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33112(C15703 c15703) {
        this.f42865 = c15703;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m33121() {
        return this.f42861;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33122(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C17359.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f42861 = C4681.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m33120() {
        return this.f42862;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33117(ArrayList arrayList) {
        this.f42862 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33113(C16449 c16449) {
        this.f42862 = Collections.singletonList(c16449);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m33119() {
        return this.f42860;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33124(ArrayList arrayList) {
        if (arrayList.isEmpty() && this.f42860.isEmpty()) {
            return;
        }
        this.f42860 = arrayList;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m33118() {
        return this.f42863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33115(boolean z) {
        this.f42863 = z;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM54281 = C24276.m54281(i2, "\t");
        sb.append(strM54281);
        sb.append("match: ");
        this.f42865.m37490(sb);
        sb.append('\n');
        sb.append(strM54281);
        sb.append("recordAllGroups: ");
        sb.append(this.f42863);
        sb.append('\n');
        for (C20992 c20992 : this.f42861) {
            sb.append(strM54281);
            sb.append("export: ");
            sb.append(c20992.m47979());
            sb.append(" => \"");
            sb.append(C3652.m11834(c20992.m47980()));
            sb.append("\"\n");
        }
        for (C16449 c16449 : this.f42862) {
            sb.append(strM54281);
            sb.append(c16449.f53346);
            sb.append(": \"");
            sb.append(c16449.f53343);
            sb.append("\"\n");
        }
        for (C8771 c8771 : this.f42860) {
            sb.append(strM54281);
            sb.append("subMatcher: ");
            sb.append(c8771.m23468());
            sb.append('\n');
            c8771.m23470().mo9277(sb, i2);
        }
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }
}
