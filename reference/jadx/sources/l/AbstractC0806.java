package l;

/* JADX INFO: renamed from: l.֨֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0806 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC0806 f3408;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 f3409;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12802 f3410;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f3411;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3412;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC1696 f3413;

    public AbstractC0806(C12802 c12802, AbstractC1696 abstractC1696) {
        this.f3410 = c12802;
        this.f3413 = abstractC1696;
        this.f3411 = c12802.m31788(true);
        this.f3412 = c12802.f42641.m48596() - 1;
        this.f3408 = c12802.m31780();
        C22680 c22680 = c12802.f42638;
        this.f3409 = c22680.f73852.m52426(c22680.f73852.m52382(c22680.f73840, c22680.f73845.f77594, abstractC1696.f6716, 1536L));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m3375() {
        AbstractC16579 abstractC16579 = this.f3413.f6716;
        abstractC16579.getClass();
        return (abstractC16579 instanceof C23594) || m3376() || this.f3409.m48596() > 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m3376() {
        C22680 c22680 = this.f3410.f42638;
        if (c22680.f73860) {
            return true;
        }
        return c22680.f73852.m52423(c22680.f73844.f14268.f53222, this.f3413.f6716) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3374() {
        AbstractC11242 abstractC11242 = this.f3411.f77453;
        if (abstractC11242 == null) {
            return "null";
        }
        String string = abstractC11242.toString();
        if (string.equals("<clinit>")) {
            return "static";
        }
        return string.equals("<init>") ? "new" : string;
    }
}
