package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۘ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4448 extends AbstractC8922 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f15916;

    public C4448() {
        super(EnumC22260.LOCAL);
    }

    public C4448(int i) {
        super(EnumC22260.LOCAL);
        this.f15916 = i;
    }

    @Override // l.AbstractC8922, l.AbstractC11071
    public final AbstractC11071 clone() {
        C4448 c4448 = new C4448(this.f15916);
        c4448.f34923 = this.f34923;
        return c4448;
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return c5194.m15613(this);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return am.av + this.f15916;
    }
}
