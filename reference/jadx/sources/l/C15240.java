package l;

/* JADX INFO: renamed from: l.ܳۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15240 extends AbstractC1817 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f49723;

    public C15240(String str, String str2) {
        super(str);
        this.f49723 = str2;
    }

    @Override // l.AbstractC1817
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1817 mo6295(String str) {
        return new C15240(str, this.f49723);
    }

    @Override // l.AbstractC1817
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5546 mo6296() {
        return EnumC5546.FIELD;
    }

    @Override // l.AbstractC1817
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15240)) {
            return false;
        }
        C15240 c15240 = (C15240) obj;
        return this.f6169.equals(c15240.f6169) && this.f49723.equals(c15240.f49723);
    }

    @Override // l.AbstractC1817
    public final int hashCode() {
        return this.f49723.hashCode() + (this.f6169.hashCode() * 31);
    }

    @Override // l.AbstractC1817
    public final String toString() {
        return this.f49723 + " " + this.f6169;
    }
}
