package l;

/* JADX INFO: renamed from: l.᩶ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20218 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC4870 f65626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f65627;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18304.m42523(!m45706());
        return this.f65626.compareTo(((C20218) obj).f65626);
    }

    public C20218(AbstractC22433 abstractC22433, EnumC4870 enumC4870) {
        this.f65627 = abstractC22433;
        this.f65626 = enumC4870;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m45706() {
        return this.f65627.isEmpty() || this.f65626 == null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC4870 m45707() {
        return this.f65626;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m45712() {
        return this.f65627;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m45709() {
        return ((InterfaceC15670) this.f65627.get(0)).mo37337();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m45710() {
        return ((C15716) ((InterfaceC15670) this.f65627.get(0)).mo37335()).getPosition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45708() {
        AbstractC22433 abstractC22433 = this.f65627;
        return ((C15716) ((InterfaceC15670) C22808.m50475(abstractC22433)).mo37335()).getText().length() + ((C15716) ((InterfaceC15670) C22808.m50475(abstractC22433)).mo37335()).getPosition();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m45711() {
        return ((InterfaceC15670) C22808.m50475(this.f65627)).mo37336();
    }
}
