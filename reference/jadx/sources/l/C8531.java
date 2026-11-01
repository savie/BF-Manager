package l;

/* JADX INFO: renamed from: l.ۡ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8531 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f29533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29534;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f29535;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29536;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f29534;
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
        sb.append(this.f29533);
        sb.append("c:");
        sb.append(this.f29536);
        sb.append(",p:");
        sb.append(this.f29535);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8531)) {
                return false;
            }
            C8531 c8531 = (C8531) obj;
            int i = this.f29534;
            if (i != c8531.f29534) {
                return false;
            }
            if (i != 8 || Math.abs(this.f29536 - this.f29533) != 1 || this.f29536 != c8531.f29533 || this.f29533 != c8531.f29536) {
                if (this.f29536 != c8531.f29536 || this.f29533 != c8531.f29533) {
                    return false;
                }
                Object obj2 = this.f29535;
                if (obj2 != null) {
                    if (!obj2.equals(c8531.f29535)) {
                        return false;
                    }
                } else if (c8531.f29535 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f29534 * 31) + this.f29533) * 31) + this.f29536;
    }
}
