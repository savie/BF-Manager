package l;

/* JADX INFO: renamed from: l.ܳᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: WITU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15514 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Throwable f50495;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f50496;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f50496.compareTo(((C15514) obj).f50496);
    }

    public C15514(String str, Throwable th) {
        C17359.requireNonNull(str);
        this.f50496 = str;
        this.f50495 = th;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m37183() {
        return this.f50496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m37182() {
        return this.f50495;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15514.class != obj.getClass()) {
            return false;
        }
        return this.f50496.equals(((C15514) obj).f50496);
    }

    public final int hashCode() {
        return this.f50496.hashCode();
    }

    public final String toString() {
        String str = this.f50496;
        Throwable th = this.f50495;
        if (th == null) {
            return str;
        }
        return str + ": " + C4123.m13224(th);
    }
}
