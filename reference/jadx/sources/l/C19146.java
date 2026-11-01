package l;

/* JADX INFO: renamed from: l.᩵֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19146 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f61837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13626 f61839;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f61840;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f61842;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13626 f61844;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f61843 = -1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f61838 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f61840.compareTo(((C19146) obj).f61840);
    }

    public C19146(String str, boolean z) {
        this.f61840 = str;
        this.f61842 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43964() {
        C13626 c13626 = this.f61844;
        C13638.requireNonNull(c13626);
        C14546 c14546 = new C14546(c13626.m33318());
        try {
            c14546.seek(this.f61837);
            if (this.f61842) {
                String strM41962 = C18019.m41962(c14546.m35012());
                c14546.close();
                return strM41962;
            }
            String strM35011 = c14546.m35011();
            c14546.close();
            return strM35011;
        } catch (Throwable th) {
            try {
                c14546.close();
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
        if (obj == null || C19146.class != obj.getClass()) {
            return false;
        }
        return this.f61840.equals(((C19146) obj).f61840);
    }

    public final int hashCode() {
        return this.f61840.hashCode();
    }
}
