package l;

/* JADX INFO: renamed from: l.ۨܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11771 extends AbstractC10068 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f39515;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17685 f39516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int mo29405() {
        return 65536;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11771 mo29408() {
        return this;
    }

    public C11771() {
        super(new C1186());
    }

    public C11771(EnumC20508 enumC20508, EnumC2162 enumC2162) {
        this(25, enumC20508, enumC2162, 0L, 0L);
    }

    public C11771(EnumC20508 enumC20508, EnumC2162 enumC2162, long j) {
        this(4, enumC20508, enumC2162, j, 0L);
    }

    public C11771(int i, EnumC20508 enumC20508, EnumC2162 enumC2162, long j, long j2) {
        C1186 c1186 = new C1186();
        super(c1186);
        this.f39515 = i;
        c1186.m4334(enumC20508);
        ((C1186) this.f34399).m4332(enumC2162);
        ((C1186) this.f34399).m4340(j);
        ((C1186) this.f34399).m4327(j2);
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ۙ */
    public final C19240 mo25476() {
        return this.f34398;
    }

    @Override // l.InterfaceC19388
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void mo29404(C19240 c19240) {
        this.f34398 = c19240;
        ((C1186) this.f34399).m4346(c19240);
        mo3384(c19240);
        ((C1186) this.f34399).m4339(c19240.m27400());
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo3384(C19240 c19240) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29403(C2597 c2597) {
        this.f34398 = c2597.m19359();
        this.f34399 = c2597.m19360();
        mo2356(this.f34398);
        this.f34398.m27376(((C1186) this.f34399).mo4342());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29407(C2597 c2597) {
        this.f34398 = c2597.m19359();
        this.f34399 = c2597.m19360();
        C17685 c17685 = new C17685();
        c17685.m41207((C1186) this.f34399, this.f34398);
        this.f39516 = c17685;
        this.f34398.m27376(((C1186) this.f34399).mo4342());
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo2356(C19240 c19240) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m29401() {
        return this.f39516 == null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17685 m29402() {
        return this.f39516;
    }

    public String toString() {
        return ((C1186) this.f34399).m4325() + " with message id << " + ((C1186) this.f34399).m4341() + " >>";
    }
}
