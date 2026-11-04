package l;

/* JADX INFO: renamed from: l.ܿᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18530 extends AbstractC23752 {
    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo2797(C5194 c5194) {
        return new C18530(this.f40344, this.f76980.mo5237(c5194));
    }

    public final String toString() {
        int i = C21514.f68750[this.f40344.ordinal()];
        if (i == 1) {
            return "lock " + this.f76980;
        }
        if (i == 2) {
            return "unlock " + this.f76980;
        }
        if (i == 3) {
            return "throw " + this.f76980;
        }
        if (i == 4) {
            return "return " + this.f76980;
        }
        if (i == 5) {
            return this.f76980 + " ::END";
        }
        return super.toString();
    }
}
