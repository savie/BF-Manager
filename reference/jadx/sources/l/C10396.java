package l;

/* JADX INFO: renamed from: l.ۢ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10396 implements InterfaceC15551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20027 f33049;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10396 f33050;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f33051;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f33052;

    public C10396(int i, long j) {
        C20782.m47568(this.f33049 == null);
        this.f33052 = j;
        this.f33051 = j + ((long) i);
    }

    @Override // l.InterfaceC15551
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20027 mo26711() {
        C20027 c20027 = this.f33049;
        c20027.getClass();
        return c20027;
    }

    @Override // l.InterfaceC15551
    public final InterfaceC15551 next() {
        C10396 c10396 = this.f33050;
        if (c10396 == null || c10396.f33049 == null) {
            return null;
        }
        return c10396;
    }
}
