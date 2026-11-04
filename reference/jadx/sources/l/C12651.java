package l;

/* JADX INFO: renamed from: l.ۨ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5DL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12651 extends AbstractC11905 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C24807 f40564;

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return "InvokeCustomExpr(....)";
    }

    public C12651(EnumC22260 enumC22260, AbstractC11071[] abstractC11071Arr, C24807 c24807) {
        super(enumC22260, abstractC11071Arr);
        this.f40564 = c24807;
    }

    @Override // l.AbstractC11905
    /* JADX INFO: renamed from: ֫ */
    public final C12126 mo18707() {
        return this.f40564.m55324();
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C12651(this.f34921, m15447(), this.f40564);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C12651(this.f34921, m15449(c5194), this.f40564);
    }
}
