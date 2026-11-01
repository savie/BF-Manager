package l;

/* JADX INFO: renamed from: l.᩶᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C20500 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f66464;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f66465;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC12739 f66466;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f66467;

    public C20500(C13174 c13174, EnumC12739 enumC12739, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        this.f66464 = c13174;
        this.f66466 = enumC12739;
        this.f66465 = abstractC16579;
        this.f66467 = abstractC165710;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20500)) {
            return false;
        }
        C20500 c20500 = (C20500) obj;
        if (this.f66466 != c20500.f66466) {
            return false;
        }
        C13174 c13174 = this.f66464;
        return c13174.f43867.m52399(this.f66465, c20500.f66465) && c13174.f43867.m52399(this.f66467, c20500.f66467);
    }

    public final int hashCode() {
        int iHashCode = this.f66466.hashCode() * 127;
        C23800 c23800 = this.f66464.f43867;
        c23800.getClass();
        int iM52345 = (C23800.m52345(this.f66465) + iHashCode) * 127;
        c23800.getClass();
        return C23800.m52345(this.f66467) + iM52345;
    }
}
