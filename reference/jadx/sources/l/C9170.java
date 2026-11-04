package l;

/* JADX INFO: renamed from: l.ۡۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9170 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f29765;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f29766;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f29767;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f29768;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f29769;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f29770;

    public C9170(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, String str, String str2, AbstractC7364 abstractC7364, AbstractC7364 abstractC7365) {
        this.f29765 = abstractC22044;
        this.f29769 = abstractC22045;
        this.f29768 = str;
        this.f29767 = str2;
        this.f29766 = abstractC7364;
        this.f29770 = abstractC7365;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24305() {
        if (this.f29765.mo4286() > this.f29769.mo4286()) {
            m24304();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24304() {
        AbstractC22044 abstractC22044 = this.f29765;
        this.f29765 = this.f29769;
        this.f29769 = abstractC22044;
        String str = this.f29768;
        this.f29768 = this.f29767;
        this.f29767 = str;
        AbstractC7364 abstractC7364 = this.f29766;
        this.f29766 = this.f29770;
        this.f29770 = abstractC7364;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24303() {
        this.f29766.mo18796(this.f29765.mo4294(), false);
        this.f29770.mo18796(this.f29769.mo4294(), false);
    }
}
