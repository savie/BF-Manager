package l;

/* JADX INFO: renamed from: l.ۨۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12084 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC24688 f38901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f38902;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C12128.m30315(!m30260());
        return this.f38901.compareTo(((C12084) obj).f38901);
    }

    public C12084(AbstractC1928 abstractC1928, EnumC24688 enumC24688) {
        this.f38902 = abstractC1928;
        this.f38901 = enumC24688;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m30260() {
        return this.f38902.isEmpty() || this.f38901 == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC24688 m30257() {
        return this.f38901;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m30263() {
        return this.f38902;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30259() {
        return ((C6710) ((InterfaceC12455) this.f38902.get(0)).mo30930()).getPosition();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m30261() {
        return ((InterfaceC12455) this.f38902.get(0)).mo30932();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30258() {
        AbstractC1928 abstractC1928 = this.f38902;
        return ((C6710) ((InterfaceC12455) C16625.m39339(abstractC1928)).mo30930()).getText().length() + ((C6710) ((InterfaceC12455) C16625.m39339(abstractC1928)).mo30930()).getPosition();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m30262() {
        return ((InterfaceC12455) C16625.m39339(this.f38902)).mo30931();
    }
}
