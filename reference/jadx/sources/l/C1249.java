package l;

/* JADX INFO: renamed from: l.֨ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TK */
/* JADX INFO: loaded from: classes3.dex */
public final class C1249 extends AbstractC1479 {
    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4777 mo985(C10527 c10527) {
        return new C1249(this.f16795, this.f6011.mo3325(c10527));
    }

    public final String toString() {
        int i = C22417.f73147[this.f16795.ordinal()];
        if (i == 1) {
            return "lock " + this.f6011;
        }
        if (i == 2) {
            return "unlock " + this.f6011;
        }
        if (i == 3) {
            return "throw " + this.f6011;
        }
        if (i == 4) {
            return "return " + this.f6011;
        }
        if (i == 5) {
            return this.f6011 + " ::END";
        }
        return super.toString();
    }
}
