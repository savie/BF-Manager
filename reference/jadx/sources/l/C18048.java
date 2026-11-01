package l;

/* JADX INFO: renamed from: l.ᩳ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18048 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15456 f57706;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f57707;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f57708;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f57709;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1114 f57710;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18048)) {
            return false;
        }
        C18048 c18048 = (C18048) obj;
        return C13465.m32965(this.f57708, c18048.f57708) && C13465.m32965(this.f57710, c18048.f57710) && C13465.m32965(this.f57706, c18048.f57706) && C13465.m32965(this.f57709, c18048.f57709) && C13465.m32965(this.f57707, c18048.f57707);
    }

    public final int hashCode() {
        Object obj = this.f57708;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1114 abstractC1114 = this.f57710;
        int iHashCode2 = (iHashCode + (abstractC1114 == null ? 0 : abstractC1114.hashCode())) * 31;
        InterfaceC15456 interfaceC15456 = this.f57706;
        int iHashCode3 = (iHashCode2 + (interfaceC15456 == null ? 0 : interfaceC15456.hashCode())) * 31;
        Object obj2 = this.f57709;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f57707;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f57708 + ", cancelHandler=" + this.f57710 + ", onCancellation=" + this.f57706 + ", idempotentResume=" + this.f57709 + ", cancelCause=" + this.f57707 + ')';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18048 m42044(C18048 c18048, AbstractC1114 abstractC1114, Throwable th, int i) {
        Object obj = c18048.f57708;
        if ((i & 2) != 0) {
            abstractC1114 = c18048.f57710;
        }
        AbstractC1114 abstractC1115 = abstractC1114;
        InterfaceC15456 interfaceC15456 = c18048.f57706;
        Object obj2 = c18048.f57709;
        if ((i & 16) != 0) {
            th = c18048.f57707;
        }
        c18048.getClass();
        return new C18048(obj, abstractC1115, interfaceC15456, obj2, th);
    }

    public C18048(Object obj, AbstractC1114 abstractC1114, InterfaceC15456 interfaceC15456, Object obj2, Throwable th) {
        this.f57708 = obj;
        this.f57710 = abstractC1114;
        this.f57706 = interfaceC15456;
        this.f57709 = obj2;
        this.f57707 = th;
    }

    public /* synthetic */ C18048(Object obj, AbstractC1114 abstractC1114, InterfaceC15456 interfaceC15456, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC1114, (i & 4) != 0 ? null : interfaceC15456, (Object) null, (i & 16) != 0 ? null : th);
    }
}
