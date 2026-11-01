package l;

/* JADX INFO: renamed from: l.᩶ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 87AH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20321 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C20321 f65801 = new C20321(-1, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f65802;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f65803;

    public C20321(long j, long j2) {
        this.f65802 = j < 0 ? -1L : j;
        this.f65803 = j2 <= 0 ? 0L : j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20321 m45854(long j, long j2) {
        C20321 c20321 = new C20321(j, j2);
        return c20321.m45860() ? c20321 : f65801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20321 m45855(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557 == null) {
            return f65801;
        }
        return m45854(interfaceC2557.mo7985() ? interfaceC2557.getSize() : -1L, interfaceC2557.getTime());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20321 m45856(AbstractC20745 abstractC20745) {
        long jMo33991;
        if (abstractC20745 == null) {
            return f65801;
        }
        long jMo33964 = -1;
        try {
            if (abstractC20745.mo33971()) {
                jMo33964 = abstractC20745.mo33964();
            }
        } catch (RuntimeException unused) {
        }
        try {
            jMo33991 = abstractC20745.mo33991();
        } catch (RuntimeException unused2) {
            jMo33991 = 0;
        }
        return m45854(jMo33964, jMo33991);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m45858() {
        return this.f65802;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m45861() {
        return this.f65803;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45857() {
        return this.f65802 >= 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m45859() {
        return this.f65803 > 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45860() {
        return m45857() || m45859();
    }
}
