package l;

/* JADX INFO: renamed from: l.ۧ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10880 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36990;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f36991;

    public C10880(char c, int i) {
        this.f36991 = c;
        this.f36990 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10880)) {
            return false;
        }
        C10880 c10880 = (C10880) obj;
        return this.f36991 == c10880.f36991 && this.f36990 == c10880.f36990;
    }

    public final int hashCode() {
        return C13638.hash(Character.valueOf(this.f36991), Integer.valueOf(this.f36990));
    }
}
