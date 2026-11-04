package l;

/* JADX INFO: renamed from: l.ܽۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 461A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56459;

    public C17347(int i) {
        this.f56459 = i;
    }

    public C17347() {
        this.f56459 = -1;
    }

    public final String toString() {
        int i = this.f56459;
        return i >= 0 ? String.format("L%04x", Integer.valueOf(i)) : String.format("L%08x", Integer.valueOf(hashCode()));
    }
}
