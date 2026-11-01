package l;

/* JADX INFO: renamed from: l.ܰۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13753 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45345;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f45346;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f45347;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f45348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f45349;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C13753) obj).f45349.length() - this.f45349.length();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45347);
        sb.append(" ");
        sb.append(this.f45349);
        sb.append(" ");
        sb.append(this.f45348);
        sb.append(" ");
        sb.append(this.f45345 ? "rw" : "ro");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13753.class != obj.getClass()) {
            return false;
        }
        return C13638.equals(this.f45349, ((C13753) obj).f45349);
    }

    public final int hashCode() {
        String str = this.f45349;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
