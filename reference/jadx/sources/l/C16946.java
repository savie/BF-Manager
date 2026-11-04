package l;

/* JADX INFO: renamed from: l.ܺܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16946 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f55356;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9378 f55357;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f55358;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55360;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f55361;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9378 f55363;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f55362 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f55359 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f55358.compareTo(((C16946) obj).f55358);
    }

    public C16946(String str, boolean z) {
        this.f55358 = str;
        this.f55356 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39919() {
        C9378 c9378 = this.f55363;
        C17359.requireNonNull(c9378);
        C24078 c24078 = new C24078(c9378.m24699());
        try {
            c24078.seek(this.f55361);
            if (this.f55356) {
                String strM37700 = C15768.m37700(c24078.m53627());
                c24078.close();
                return strM37700;
            }
            String strM53630 = c24078.m53630();
            c24078.close();
            return strM53630;
        } catch (Throwable th) {
            try {
                c24078.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16946.class != obj.getClass()) {
            return false;
        }
        return this.f55358.equals(((C16946) obj).f55358);
    }

    public final int hashCode() {
        return this.f55358.hashCode();
    }
}
