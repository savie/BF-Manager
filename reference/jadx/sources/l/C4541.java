package l;

/* JADX INFO: renamed from: l.ۙۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4541 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C4541 f16148;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3439 f16150;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3439 f16151;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f16147 = C15436.m36928("jsoup.sourceRange");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f16149 = C15436.m36928("jsoup.endSourceRange");

    static {
        C3439 c3439 = new C3439(-1, -1, -1);
        f16148 = new C4541(c3439, c3439);
    }

    public C4541(C3439 c3439, C3439 c34310) {
        this.f16151 = c3439;
        this.f16150 = c34310;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3439 m12680() {
        return this.f16151;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3439 m12678() {
        return this.f16150;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12681() {
        return this != f16148;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4541 m12677(AbstractC14730 abstractC14730, boolean z) {
        String str = z ? f16147 : f16149;
        if (!abstractC14730.mo28140(str)) {
            return f16148;
        }
        Object objM36942 = abstractC14730.mo2839().m36942(str);
        if (objM36942 != null) {
            return (C4541) objM36942;
        }
        throw new C22491("Object must not be null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12679(AbstractC14730 abstractC14730, boolean z) {
        abstractC14730.mo2839().m36936(z ? f16147 : f16149, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4541.class != obj.getClass()) {
            return false;
        }
        C4541 c4541 = (C4541) obj;
        if (this.f16151.equals(c4541.f16151)) {
            return this.f16150.equals(c4541.f16150);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16150.hashCode() + (this.f16151.hashCode() * 31);
    }

    public final String toString() {
        return C1679.m5594(String.valueOf(this.f16151), "-", String.valueOf(this.f16150));
    }
}
