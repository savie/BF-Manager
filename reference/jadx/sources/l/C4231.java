package l;

/* JADX INFO: renamed from: l.ۘܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4231 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f15440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2310 f15441;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f15442;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f15443;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f15444;

    public C4231() {
        throw null;
    }

    public C4231(String str, String str2, String str3, String str4, C2310 c2310) {
        this.f15444 = str;
        this.f15442 = str2;
        this.f15440 = str3;
        this.f15443 = str4;
        this.f15441 = c2310;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4231)) {
            return false;
        }
        C4231 c4231 = (C4231) obj;
        return C17359.equals(this.f15444, c4231.f15444) && C17359.equals(this.f15442, c4231.f15442) && C17359.equals(this.f15440, c4231.f15440) && C17359.equals(this.f15443, c4231.f15443) && C17359.equals(this.f15441, c4231.f15441);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f15441) + C24966.m55771(C24966.m55771(C24966.m55771(C17359.hashCode(this.f15444) * 31, 31, this.f15442), 31, this.f15440), 31, this.f15443);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2310 m13528() {
        return this.f15441;
    }

    public final String toString() {
        return "[" + this.f15442 + "] " + this.f15443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13526() {
        return this.f15444 + "/" + this.f15440;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13527(String str, String str2) {
        return this.f15444.equals(str) && this.f15440.equals(str2);
    }
}
