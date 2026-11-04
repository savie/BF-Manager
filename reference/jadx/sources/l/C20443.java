package l;

/* JADX INFO: renamed from: l.᩵۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20443 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f65476;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f65477;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f65478;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1798 f65479;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 f65480;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20443)) {
            return false;
        }
        C20443 c20443 = (C20443) obj;
        return C15243.m36589(this.f65478, c20443.f65478) && C15243.m36589(this.f65479, c20443.f65479) && C15243.m36589(this.f65480, c20443.f65480) && C15243.m36589(this.f65477, c20443.f65477) && C15243.m36589(this.f65476, c20443.f65476);
    }

    public final int hashCode() {
        Object obj = this.f65478;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1798 interfaceC1798 = this.f65479;
        int iHashCode2 = (iHashCode + (interfaceC1798 == null ? 0 : interfaceC1798.hashCode())) * 31;
        InterfaceC3071 interfaceC3071 = this.f65480;
        int iHashCode3 = (iHashCode2 + (interfaceC3071 == null ? 0 : interfaceC3071.hashCode())) * 31;
        Object obj2 = this.f65477;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f65476;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f65478 + ", cancelHandler=" + this.f65479 + ", onCancellation=" + this.f65480 + ", idempotentResume=" + this.f65477 + ", cancelCause=" + this.f65476 + ')';
    }

    public C20443(Object obj, InterfaceC1798 interfaceC1798, InterfaceC3071 interfaceC3071, Object obj2, Throwable th) {
        this.f65478 = obj;
        this.f65479 = interfaceC1798;
        this.f65480 = interfaceC3071;
        this.f65477 = obj2;
        this.f65476 = th;
    }

    public /* synthetic */ C20443(Object obj, InterfaceC1798 interfaceC1798, InterfaceC3071 interfaceC3071, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC1798, (i & 4) != 0 ? null : interfaceC3071, (Object) null, (i & 16) != 0 ? null : th);
    }
}
