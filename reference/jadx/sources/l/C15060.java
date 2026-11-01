package l;

/* JADX INFO: renamed from: l.ܶۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15060 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C19122 f49103 = new C19122(C0690.f2900.f2940.m35074());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f49104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49105;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f49106;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19122 f49107;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f49108;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f49109;

    public /* synthetic */ C15060(int i) {
        this();
    }

    public C15060() {
        this.f49108 = null;
        this.f49109 = "..";
        this.f49106 = true;
        this.f49104 = null;
        this.f49107 = f49103;
    }

    public C15060(AbstractC20745 abstractC20745) {
        this.f49108 = abstractC20745;
        this.f49109 = abstractC20745.getName();
        boolean zMo33974 = abstractC20745.mo33974();
        this.f49106 = zMo33974;
        StringBuilder sb = new StringBuilder();
        sb.append(C5319.m14739(abstractC20745.mo33991()));
        if (!zMo33974) {
            sb.append(EnumC19730.f63352);
            sb.append(C1791.m5863(abstractC20745.mo33964()));
        }
        this.f49104 = sb.toString();
        if (zMo33974) {
            this.f49107 = f49103;
        } else {
            this.f49107 = new C19122(C0690.f2908.f2940.m35074());
        }
    }
}
