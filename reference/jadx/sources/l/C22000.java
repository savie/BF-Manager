package l;

/* JADX INFO: renamed from: l.᩹ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22000 implements InterfaceC9511 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f71340;

    public C22000(long j) {
        this.f71340 = j;
    }

    @Override // l.InterfaceC9511
    public final Long apply(Object obj) {
        long jM42802 = ((C18454) obj).m42802();
        long j = this.f71340;
        if (jM42802 == j) {
            return Long.valueOf(j);
        }
        throw new C13865(C15037.m36023(C17114.m39970("Possible remote file corruption detected, server wrote less bytes (", ") in async mode than we sent (", jM42802), j, ")."));
    }
}
