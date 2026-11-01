package l;

/* JADX INFO: renamed from: l.ۖۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V89H */
/* JADX INFO: loaded from: classes2.dex */
public class C2471 implements InterfaceC18659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1060 f9830;

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo7579(C15132 c15132) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1060 m7577() {
        return this.f9830;
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo7580(C15132 c15132) {
        c15132.m36284(EnumC17953.FOUR);
        if (c15132.m36288() != 0) {
            this.f9830 = new C1060();
        } else {
            this.f9830 = null;
        }
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo7578(C15132 c15132) {
        C1060 c1060 = this.f9830;
        if (c1060 != null) {
            c15132.m36285(c1060);
        }
    }

    public int hashCode() {
        return C13638.hash(this.f9830);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2471) {
            return C13638.equals(this.f9830, ((C2471) obj).f9830);
        }
        return false;
    }
}
