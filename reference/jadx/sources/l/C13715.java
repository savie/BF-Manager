package l;

/* JADX INFO: renamed from: l.ܰۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBJU */
/* JADX INFO: loaded from: classes4.dex */
public class C13715 extends AbstractC11202 {
    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ int mo2831() {
        return 0;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ */
    public void mo2861(Appendable appendable, int i, C19669 c19669) {
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public String mo2863() {
        return "#text";
    }

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC14730 mo2867() {
        return this;
    }

    public C13715(String str) {
        this.f37918 = str;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public void mo2842(Appendable appendable, int i, C19669 c19669) {
        boolean z;
        boolean z2;
        boolean zM44800 = c19669.m44800();
        AbstractC14730 abstractC14730 = this.f48150;
        C0617 c0617 = abstractC14730 instanceof C0617 ? (C0617) abstractC14730 : null;
        boolean z3 = zM44800 && !C0617.m2826(abstractC14730);
        if (z3) {
            boolean z4 = (this.f48151 == 0 && c0617 != null && c0617.m2860().m29053()) || (this.f48150 instanceof C10497);
            boolean z5 = m35273() == null && c0617 != null && c0617.m2860().m29053();
            AbstractC14730 abstractC14730M35273 = m35273();
            if ((((abstractC14730M35273 instanceof C0617) && ((C0617) abstractC14730M35273).m2843(c19669)) || ((abstractC14730M35273 instanceof C13715) && C4145.m11786(((C13715) abstractC14730M35273).m28139()))) && C4145.m11786(m28139())) {
                return;
            }
            if (this.f48151 == 0 && c0617 != null && c0617.m2860().m29050() && !C4145.m11786(m28139())) {
                AbstractC14730.m35260(appendable, i, c19669);
            }
            z = z4;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        C17551.m40822(appendable, m28139(), c19669, false, z3, z, z2);
    }

    @Override // l.AbstractC14730
    public final String toString() {
        return mo26643();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public C13715 mo2874clone() {
        return (C13715) super.mo2874clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33422(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
