package l;

/* JADX INFO: renamed from: l.ۤۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10799 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f34262;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC15274 f34263;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f34264;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f34265;

    public C10799(C14528 c14528, EnumC15274 enumC15274, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        this.f34265 = c14528;
        this.f34263 = enumC15274;
        this.f34262 = abstractC22664;
        this.f34264 = abstractC22665;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10799)) {
            return false;
        }
        C10799 c10799 = (C10799) obj;
        if (this.f34263 != c10799.f34263) {
            return false;
        }
        C14528 c14528 = this.f34265;
        return c14528.f45697.m55149(this.f34262, c10799.f34262) && c14528.f45697.m55149(this.f34264, c10799.f34264);
    }

    public final int hashCode() {
        int iHashCode = this.f34263.hashCode() * 127;
        C24705 c24705 = this.f34265.f45697;
        c24705.getClass();
        int iM55059 = (C24705.m55059(this.f34262) + iHashCode) * 127;
        c24705.getClass();
        return C24705.m55059(this.f34264) + iM55059;
    }
}
