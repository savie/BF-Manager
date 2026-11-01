package l;

/* JADX INFO: renamed from: l.ܳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14366 implements InterfaceC23538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f47105;

    @Override // l.InterfaceC23538
    public final void add(long j) {
        this.f47105 += j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC23538) && this.f47105 == ((InterfaceC23538) obj).get();
    }

    @Override // l.InterfaceC23538
    public final long get() {
        return this.f47105;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f47105));
    }

    @Override // l.InterfaceC23538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34603() {
        this.f47105++;
    }

    public final String toString() {
        return Long.toString(this.f47105);
    }
}
