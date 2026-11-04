package l;

/* JADX INFO: renamed from: l.᩵ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V89H */
/* JADX INFO: loaded from: classes5.dex */
public class C20396 implements InterfaceC9996 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24126 f65380;

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۤ */
    public final void mo12848(C0302 c0302) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24126 m46797() {
        return this.f65380;
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ᩷ */
    public void mo10601(C0302 c0302) {
        c0302.m1882(EnumC18947.FOUR);
        if (c0302.m1884() != 0) {
            this.f65380 = new C24126();
        } else {
            this.f65380 = null;
        }
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۙ */
    public void mo10598(C0302 c0302) {
        C24126 c24126 = this.f65380;
        if (c24126 != null) {
            c0302.m1881(c24126);
        }
    }

    public int hashCode() {
        return C17359.hash(this.f65380);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20396) {
            return C17359.equals(this.f65380, ((C20396) obj).f65380);
        }
        return false;
    }
}
