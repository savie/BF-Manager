package l;

/* JADX INFO: renamed from: l.ܺܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16006 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f51817;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51818;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f51819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20239 f51820;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f51821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13060 f51823;

    public /* synthetic */ RunnableC16006(C20239 c20239, EnumC13060 enumC13060, C21422 c21422, AbstractC20745 abstractC20745, long j, boolean z, boolean z2) {
        this.f51820 = c20239;
        this.f51823 = enumC13060;
        this.f51817 = c21422;
        this.f51821 = abstractC20745;
        this.f51819 = j;
        this.f51822 = z;
        this.f51818 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10142 c10142;
        EnumC13060 enumC13060 = EnumC13060.ZIP;
        C20239 c20239 = this.f51820;
        EnumC13060 enumC13061 = this.f51823;
        C21422 c21422 = this.f51817;
        AbstractC20745 abstractC20745 = this.f51821;
        long j = this.f51819;
        boolean z = this.f51822;
        if (enumC13061 == enumC13060) {
            int i = C20725.f67443;
            c10142 = new C10142(C5049.class);
            c10142.m25772(c21422.m47979());
            c10142.m25768("output", abstractC20745.mo33986());
            c10142.m25768("password", c20239.m11289());
            c10142.m25764(c20239.m11285(), "level");
            c10142.m25769("deleteSources", c20239.m11296());
            c10142.m25765(j, "splitSize");
            c10142.m25769("replaceExisting", z);
        } else if (enumC13061 == EnumC13060.SEVEN_ZIP) {
            int i2 = C20725.f67443;
            c10142 = new C10142(C11067.class);
            c10142.m25772(c21422.m47979());
            c10142.m25768("output", abstractC20745.mo33986());
            c10142.m25768("password", c20239.m11289());
            c10142.m25764(c20239.m11297(), "level");
            c10142.m25769("headerEncryption", c20239.m11294());
            c10142.m25769("deleteSources", c20239.m11296());
            c10142.m25765(j, "splitSize");
            c10142.m25769("replaceExisting", z);
        } else {
            int i3 = C20725.f67443;
            c10142 = new C10142(C4343.class);
            c10142.m25772(c21422.m47979());
            c10142.m25768("output", abstractC20745.mo33986());
            c10142.m25764(enumC13061.ordinal(), "format");
            c10142.m25764(c20239.m11284(), "level");
            c10142.m25769("deleteSources", c20239.m11296());
            c10142.m25769("replaceExisting", z);
        }
        c20239.m11286();
        C0815.m3394(c10142, c21422, this.f51818);
    }
}
