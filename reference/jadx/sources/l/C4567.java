package l;

/* JADX INFO: renamed from: l.ۙ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f16242;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f16243;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f16244;

    public C4567(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C24705 c24705) {
        this.f16243 = c24705;
        this.f16242 = abstractC22664;
        this.f16244 = abstractC22665;
    }

    public final int hashCode() {
        return C24705.m55059(this.f16244) + (C24705.m55059(this.f16242) * 127);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4567)) {
            return false;
        }
        C4567 c4567 = (C4567) obj;
        AbstractC22664 abstractC22664 = this.f16242;
        AbstractC22664 abstractC22665 = c4567.f16242;
        C24705 c24705 = this.f16243;
        return c24705.m55149(abstractC22664, abstractC22665) && c24705.m55149(this.f16244, c4567.f16244);
    }
}
