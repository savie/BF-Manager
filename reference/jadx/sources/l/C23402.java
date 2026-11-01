package l;

/* JADX INFO: renamed from: l.᩻ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23402 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f75792;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f75793;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f75794;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10946 f75795;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75796;

    public C23402() {
        throw null;
    }

    public C23402(String str, String str2, String str3, String str4, C10946 c10946) {
        this.f75792 = str;
        this.f75794 = str2;
        this.f75793 = str3;
        this.f75796 = str4;
        this.f75795 = c10946;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23402)) {
            return false;
        }
        C23402 c23402 = (C23402) obj;
        return C13638.equals(this.f75792, c23402.f75792) && C13638.equals(this.f75794, c23402.f75794) && C13638.equals(this.f75793, c23402.f75793) && C13638.equals(this.f75796, c23402.f75796) && C13638.equals(this.f75795, c23402.f75795);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f75795) + C0589.m2789(C0589.m2789(C0589.m2789(C13638.hashCode(this.f75792) * 31, 31, this.f75794), 31, this.f75793), 31, this.f75796);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10946 m51544() {
        return this.f75795;
    }

    public final String toString() {
        return "[" + this.f75794 + "] " + this.f75796;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51542() {
        return this.f75792 + "/" + this.f75793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51543(String str, String str2) {
        return this.f75792.equals(str) && this.f75793.equals(str2);
    }
}
