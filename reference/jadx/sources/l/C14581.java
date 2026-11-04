package l;

/* JADX INFO: renamed from: l.ܰۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14581 implements InterfaceC23642 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f45951;

    public C14581(long j) {
        this.f45951 = j;
    }

    @Override // l.InterfaceC23642
    public final Long apply(Object obj) {
        long jM23443 = ((C8746) obj).m23443();
        long j = this.f45951;
        if (jM23443 == j) {
            return Long.valueOf(j);
        }
        throw new C12082(C2764.m9137(C2458.m8289("Possible remote file corruption detected, server wrote less bytes (", ") in async mode than we sent (", jM23443), j, ")."));
    }
}
