package l;

/* JADX INFO: renamed from: l.ܽ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17825 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f58483;

    public C17825(char c, int i) {
        this.f58483 = c;
        this.f58482 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17825)) {
            return false;
        }
        C17825 c17825 = (C17825) obj;
        return this.f58483 == c17825.f58483 && this.f58482 == c17825.f58482;
    }

    public final int hashCode() {
        return C17359.hash(Character.valueOf(this.f58483), Integer.valueOf(this.f58482));
    }
}
