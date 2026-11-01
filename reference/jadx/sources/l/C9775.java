package l;

/* JADX INFO: renamed from: l.ۢᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9775 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f33467;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f33468;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3819 f33469;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11582 f33470;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f33471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f33472;

    public C9775(C3819 c3819, C11582 c11582, Object obj, String str) {
        int i;
        synchronized (this) {
            i = f33467;
            f33467 = i + 1;
        }
        this.f33468 = i;
        this.f33469 = c3819;
        this.f33470 = c11582;
        this.f33472 = obj;
        this.f33471 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C3819 c3819 = this.f33469;
        if (c3819 != null) {
            sb.append(c3819);
            sb.append(':');
        }
        sb.append(this.f33470);
        Object obj = this.f33472;
        if (obj != null && !c3819.equals(obj)) {
            sb.append(":");
            sb.append(obj);
        }
        sb.append(" -> ");
        sb.append(this.f33471);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9775)) {
            return false;
        }
        C9775 c9775 = (C9775) obj;
        return C13638.equals(this.f33469, c9775.f33469) && C13638.equals(this.f33472, c9775.f33472) && this.f33470.equals(c9775.f33470) && this.f33471.equals(c9775.f33471);
    }

    public final int hashCode() {
        return this.f33471.hashCode() + ((this.f33470.hashCode() + ((C13638.hashCode(this.f33472) + (C13638.hashCode(this.f33469) * 31)) * 31)) * 31);
    }
}
