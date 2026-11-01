package l;

/* JADX INFO: renamed from: l.ܰ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13699 extends AbstractC5231 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f45187;

    public C13699(String str, String str2) {
        super(str);
        this.f45187 = str2;
    }

    @Override // l.AbstractC5231
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5231 mo14424(String str) {
        return new C13699(str, this.f45187);
    }

    @Override // l.AbstractC5231
    /* JADX INFO: renamed from: ۙ */
    public final EnumC2408 mo14423() {
        return EnumC2408.FIELD;
    }

    @Override // l.AbstractC5231
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13699)) {
            return false;
        }
        C13699 c13699 = (C13699) obj;
        return this.f18142.equals(c13699.f18142) && this.f45187.equals(c13699.f45187);
    }

    @Override // l.AbstractC5231
    public final int hashCode() {
        return this.f45187.hashCode() + (this.f18142.hashCode() * 31);
    }

    @Override // l.AbstractC5231
    public final String toString() {
        return this.f45187 + " " + this.f18142;
    }
}
