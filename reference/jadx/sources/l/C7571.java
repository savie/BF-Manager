package l;

/* JADX INFO: renamed from: l.۟ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f25099;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f25100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f25101;

    public C7571(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C23800 c23800) {
        this.f25100 = c23800;
        this.f25099 = abstractC16579;
        this.f25101 = abstractC165710;
    }

    public final int hashCode() {
        return C23800.m52345(this.f25101) + (C23800.m52345(this.f25099) * 127);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7571)) {
            return false;
        }
        C7571 c7571 = (C7571) obj;
        AbstractC16579 abstractC16579 = this.f25099;
        AbstractC16579 abstractC165710 = c7571.f25099;
        C23800 c23800 = this.f25100;
        return c23800.m52399(abstractC16579, abstractC165710) && c23800.m52399(this.f25101, c7571.f25101);
    }
}
