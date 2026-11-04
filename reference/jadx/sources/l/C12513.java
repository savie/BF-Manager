package l;

/* JADX INFO: renamed from: l.ۨܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBJU */
/* JADX INFO: loaded from: classes4.dex */
public class C12513 extends AbstractC25194 {
    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final /* bridge */ /* synthetic */ int mo9543() {
        return 0;
    }

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17734 mo9544() {
        return this;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public String mo5151() {
        return "#text";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public void mo5152(Appendable appendable, int i, C7381 c7381) {
    }

    public C12513(String str) {
        this.f81430 = str;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public void mo5150(Appendable appendable, int i, C7381 c7381) {
        boolean z;
        boolean z2;
        boolean zM20280 = c7381.m20280();
        AbstractC17734 abstractC17734 = this.f58267;
        C15496 c15496 = abstractC17734 instanceof C15496 ? (C15496) abstractC17734 : null;
        boolean z3 = zM20280 && !C15496.m37061(abstractC17734);
        if (z3) {
            boolean z4 = (this.f58268 == 0 && c15496 != null && c15496.m37077().m17497()) || (this.f58267 instanceof C5056);
            boolean z5 = m41541() == null && c15496 != null && c15496.m37077().m17497();
            AbstractC17734 abstractC17734M41541 = m41541();
            if ((((abstractC17734M41541 instanceof C15496) && ((C15496) abstractC17734M41541).m37073(c7381)) || ((abstractC17734M41541 instanceof C12513) && C0669.m2902(((C12513) abstractC17734M41541).m56171()))) && C0669.m2902(m56171())) {
                return;
            }
            if (this.f58268 == 0 && c15496 != null && c15496.m37077().m17490() && !C0669.m2902(m56171())) {
                AbstractC17734.m41524(appendable, i, c7381);
            }
            z = z4;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        C2073.m7147(appendable, m56171(), c7381, false, z3, z, z2);
    }

    @Override // l.AbstractC17734
    public final String toString() {
        return mo15298();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public C12513 mo5153clone() {
        return (C12513) super.mo5153clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31068(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
