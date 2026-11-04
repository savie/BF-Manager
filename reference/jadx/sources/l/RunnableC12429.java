package l;

/* JADX INFO: renamed from: l.ۨܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12429 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f39960;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f39961;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f39962;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24364 f39963;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f39964;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f39965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC24958 f39966;

    public /* synthetic */ RunnableC12429(C24364 c24364, EnumC24958 enumC24958, C12915 c12915, AbstractC22044 abstractC22044, long j, boolean z, boolean z2) {
        this.f39963 = c24364;
        this.f39966 = enumC24958;
        this.f39964 = c12915;
        this.f39960 = abstractC22044;
        this.f39961 = j;
        this.f39965 = z;
        this.f39962 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8458 c8458;
        EnumC24958 enumC24958 = EnumC24958.ZIP;
        C24364 c24364 = this.f39963;
        EnumC24958 enumC24959 = this.f39966;
        C12915 c12915 = this.f39964;
        AbstractC22044 abstractC22044 = this.f39960;
        long j = this.f39961;
        boolean z = this.f39965;
        if (enumC24959 == enumC24958) {
            int i = C13678.f43415;
            c8458 = new C8458(C22061.class);
            c8458.m22723(c12915.m31982());
            c8458.m22719("output", abstractC22044.mo4294());
            c8458.m22719("password", c24364.m39563());
            c8458.m22715(c24364.m39551(), "level");
            c8458.m22720("deleteSources", c24364.m39562());
            c8458.m22716(j, "splitSize");
            c8458.m22720("replaceExisting", z);
        } else if (enumC24959 == EnumC24958.SEVEN_ZIP) {
            int i2 = C13678.f43415;
            c8458 = new C8458(C7955.class);
            c8458.m22723(c12915.m31982());
            c8458.m22719("output", abstractC22044.mo4294());
            c8458.m22719("password", c24364.m39563());
            c8458.m22715(c24364.m39559(), "level");
            c8458.m22720("headerEncryption", c24364.m39561());
            c8458.m22720("deleteSources", c24364.m39562());
            c8458.m22716(j, "splitSize");
            c8458.m22720("replaceExisting", z);
        } else {
            int i3 = C13678.f43415;
            c8458 = new C8458(C8700.class);
            c8458.m22723(c12915.m31982());
            c8458.m22719("output", abstractC22044.mo4294());
            c8458.m22715(enumC24959.ordinal(), "format");
            c8458.m22715(c24364.m39565(), "level");
            c8458.m22720("deleteSources", c24364.m39562());
            c8458.m22720("replaceExisting", z);
        }
        c24364.m39552();
        C22807.m51421(c8458, c12915, this.f39962);
    }
}
