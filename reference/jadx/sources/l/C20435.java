package l;

/* JADX INFO: renamed from: l.᩵۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20435 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f65449;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f65450;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f65451;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f65453;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C20435) obj).f65453.length() - this.f65453.length();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f65451);
        sb.append(" ");
        sb.append(this.f65453);
        sb.append(" ");
        sb.append(this.f65449);
        sb.append(" ");
        sb.append(this.f65452 ? "rw" : "ro");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20435.class != obj.getClass()) {
            return false;
        }
        return C17359.equals(this.f65453, ((C20435) obj).f65453);
    }

    public final int hashCode() {
        String str = this.f65453;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
