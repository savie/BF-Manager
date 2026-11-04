package l;

/* JADX INFO: renamed from: l.ۙܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes2.dex */
public final class C5067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17653;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f17654;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17656;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f17653;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f17656);
        sb.append("c:");
        sb.append(this.f17655);
        sb.append(",p:");
        sb.append(this.f17654);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5067)) {
                return false;
            }
            C5067 c5067 = (C5067) obj;
            int i = this.f17653;
            if (i != c5067.f17653) {
                return false;
            }
            if (i != 8 || Math.abs(this.f17655 - this.f17656) != 1 || this.f17655 != c5067.f17656 || this.f17656 != c5067.f17655) {
                if (this.f17655 != c5067.f17655 || this.f17656 != c5067.f17656) {
                    return false;
                }
                Object obj2 = this.f17654;
                if (obj2 != null) {
                    if (!obj2.equals(c5067.f17654)) {
                        return false;
                    }
                } else if (c5067.f17654 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f17653 * 31) + this.f17656) * 31) + this.f17655;
    }
}
