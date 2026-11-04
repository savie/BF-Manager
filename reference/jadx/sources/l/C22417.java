package l;

/* JADX INFO: renamed from: l.᩷᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9SS */
/* JADX INFO: loaded from: classes.dex */
public final class C22417 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f72601;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72602;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5263 f72603;

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
    }

    public C22417(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        C17364.m40796(c20348, 20229);
        c20348.readInt();
        this.f72601 = c20348.m46742();
        this.f72603 = new C5263(c20348);
        this.f72602 = C17941.m41877(c20348.m46742());
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20229);
        c6178.m17797();
        c6178.m17787(this.f72601);
        this.f72603.m15849(c6178);
        c6178.m17787(C17941.m41878(this.f72602));
        c6178.m17780();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m50560() {
        return this.f72601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50558(String str) {
        this.f72601 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50559(C5263 c5263) {
        this.f72603 = c5263;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5263 m50563() {
        return this.f72603;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50562(String str) {
        this.f72602 = C17941.m41877(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50561() {
        int i = this.f72602;
        return i == 0 ? C17941.f58780 : i;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C22417 c22417 = new C22417(abstractC2805);
        c22417.f9224 = this.f9224;
        c22417.f72601 = this.f72601;
        c22417.f72603 = this.f72603;
        c22417.f72602 = this.f72602;
        return c22417;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        String strM54281 = C24276.m54281(i, "\t");
        sb.append(strM54281);
        sb.append("{\n");
        sb.append(strM54281);
        sb.append("\t");
        sb.append("numFormat: \"");
        sb.append(this.f72603.m15850());
        sb.append("\"\n");
        String strM15854 = this.f72603.m15854();
        if (!strM15854.isEmpty()) {
            C4794.m14774(sb, strM54281, "\t", "iSuffixes: \"", strM15854);
            sb.append("\"\n");
        }
        String strM15853 = this.f72603.m15853();
        if (!strM15853.isEmpty()) {
            C4794.m14774(sb, strM54281, "\t", "fSuffixes: \"", strM15853);
            sb.append("\"\n");
        }
        String strM41878 = C17941.m41878(this.f72602);
        if (strM41878 != null) {
            C4794.m14774(sb, strM54281, "\t", "style: \"", strM41878);
            sb.append("\"\n");
        }
        sb.append(strM54281);
        sb.append("}\n");
    }
}
