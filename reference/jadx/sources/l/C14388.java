package l;

/* JADX INFO: renamed from: l.ܳ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 461A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14388 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47136;

    public C14388(int i) {
        this.f47136 = i;
    }

    public C14388() {
        this.f47136 = -1;
    }

    public final String toString() {
        int i = this.f47136;
        return i >= 0 ? String.format("L%04x", Integer.valueOf(i)) : String.format("L%08x", Integer.valueOf(hashCode()));
    }
}
