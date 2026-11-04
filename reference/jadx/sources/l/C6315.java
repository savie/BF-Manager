package l;

/* JADX INFO: renamed from: l.ۛۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6315 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21401;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f21402;

    public C6315(int i, InterfaceC18775 interfaceC18775) {
        this.f21402 = interfaceC18775;
        this.f21401 = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21402) * 65535) + this.f21401;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6315)) {
            return false;
        }
        C6315 c6315 = (C6315) obj;
        return this.f21402 == c6315.f21402 && this.f21401 == c6315.f21401;
    }
}
