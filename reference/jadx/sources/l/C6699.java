package l;

/* JADX INFO: renamed from: l.ۜۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6699 extends AbstractC22928 {
    public C6699() {
        this.f69910 = EnumC15167.StartTag;
    }

    @Override // l.AbstractC22928, l.AbstractC21516
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22928 mo3991() {
        super.mo3991();
        this.f74528 = null;
        return this;
    }

    public final String toString() {
        if (!m50749() || this.f74528.size() <= 0) {
            String str = this.f74530;
            return C16523.m38890("<", str != null ? str : "[unset]", ">");
        }
        String str2 = this.f74530;
        return C0242.m1617("<", str2 != null ? str2 : "[unset]", " ", this.f74528.m36930(), ">");
    }
}
