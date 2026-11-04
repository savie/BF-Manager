package l;

/* JADX INFO: renamed from: l.ܶ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C16122 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52393;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f52394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52395;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f52396;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16361 f52397;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52398;

    public C16122(InterfaceC19106 interfaceC19106, InterfaceC19106 interfaceC19107, int i, C16361 c16361) {
        this.f52396 = interfaceC19106;
        this.f52394 = interfaceC19107;
        this.f52393 = i;
        this.f52397 = c16361;
        this.f52395 = interfaceC19106 == null ? 0 : interfaceC19106.mo15344();
        this.f52398 = interfaceC19107 != null ? interfaceC19107.mo15344() : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38283(C16122 c16122) {
        if (c16122 == null || this.f52396 != c16122.f52396 || this.f52394 != c16122.f52394 || this.f52395 != c16122.f52395 || this.f52398 != c16122.f52398 || this.f52393 != c16122.f52393) {
            return false;
        }
        C16361 c16361 = c16122.f52397;
        C16361 c16362 = this.f52397;
        return c16362.f53114 == c16361.f53114 && Float.compare(c16362.f53129, c16361.f53129) == 0 && Float.compare(c16362.f53123, c16361.f53123) == 0 && c16362.f53113 == c16361.f53113 && c16362.f53125 == c16361.f53125 && c16362.f53119 == c16361.f53119 && c16362.f53116 == c16361.f53116 && c16362.f53124 == c16361.f53124 && c16362.f53130 == c16361.f53130 && c16362.f53117 == c16361.f53117 && C17359.equals(c16362.f53128, c16361.f53128) && C17359.equals(c16362.f53131, c16361.f53131);
    }
}
