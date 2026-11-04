package l;

/* JADX INFO: renamed from: l.᩹ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23469 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24478 f75931;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f75932;

    public C23469(C24478 c24478, int i) {
        this.f75931 = c24478;
        this.f75932 = i;
    }

    public final int hashCode() {
        return (this.f75931.hashCode() * 65535) + this.f75932;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23469)) {
            return false;
        }
        C23469 c23469 = (C23469) obj;
        return this.f75931 == c23469.f75931 && this.f75932 == c23469.f75932;
    }
}
