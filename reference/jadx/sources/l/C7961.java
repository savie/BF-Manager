package l;

/* JADX INFO: renamed from: l.۟ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GIS0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7961 implements InterfaceC20640 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15418 f26441;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f26442;

    public C7961(EnumC15418 enumC15418, AbstractC1566 abstractC1566, int i) {
        this.f26441 = enumC15418;
        this.f26442 = abstractC1566;
    }

    @Override // l.InterfaceC20640
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15418 mo2468() {
        return this.f26441;
    }

    @Override // l.InterfaceC20640
    public final AbstractC1566 getType() {
        return this.f26442;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7961.class == obj.getClass()) {
            C7961 c7961 = (C7961) obj;
            if (this.f26441 == c7961.f26441 && C17359.equals(this.f26442, c7961.f26442)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f26441, this.f26442);
    }

    public final String toString() {
        return "{" + this.f26441 + ": " + this.f26442 + '}';
    }
}
