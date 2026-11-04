package l;

/* JADX INFO: renamed from: l.᩻᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes.dex */
public final class C25263 implements InterfaceC11836 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f81594;

    @Override // l.InterfaceC11836
    public final void add(long j) {
        this.f81594 += j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC11836) && this.f81594 == ((InterfaceC11836) obj).get();
    }

    @Override // l.InterfaceC11836
    public final long get() {
        return this.f81594;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f81594));
    }

    @Override // l.InterfaceC11836
    /* JADX INFO: renamed from: ۙ */
    public final void mo29683() {
        this.f81594++;
    }

    public final String toString() {
        return Long.toString(this.f81594);
    }
}
