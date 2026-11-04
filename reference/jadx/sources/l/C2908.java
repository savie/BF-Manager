package l;

/* JADX INFO: renamed from: l.ۖ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C6389 f9515 = new C6389(C20613.f66109.f66118.m30080());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9516;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6389 f9517;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f9518;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f9519;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f9520;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f9521;

    public /* synthetic */ C2908(int i) {
        this();
    }

    public C2908() {
        this.f9520 = null;
        this.f9518 = "..";
        this.f9519 = true;
        this.f9521 = null;
        this.f9517 = f9515;
    }

    public C2908(AbstractC22044 abstractC22044) {
        this.f9520 = abstractC22044;
        this.f9518 = abstractC22044.getName();
        boolean zMo4281 = abstractC22044.mo4281();
        this.f9519 = zMo4281;
        StringBuilder sb = new StringBuilder();
        sb.append(C22482.m50713(abstractC22044.mo4286()));
        if (!zMo4281) {
            sb.append(EnumC7687.f25319);
            sb.append(C8311.m22390(abstractC22044.mo4285()));
        }
        this.f9521 = sb.toString();
        if (zMo4281) {
            this.f9517 = f9515;
        } else {
            this.f9517 = new C6389(C20613.f66058.f66118.m30080());
        }
    }
}
