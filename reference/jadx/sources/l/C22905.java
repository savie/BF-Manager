package l;

/* JADX INFO: renamed from: l.᩺ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes.dex */
public final class C22905 extends C4943 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74459;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21493 f74460;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22905(InterfaceC10589 interfaceC10589, C21493 c21493) {
        super((AbstractC1415) interfaceC10589);
        this.f74460 = c21493;
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ᩹ */
    public final int mo13730(int i) {
        this.f74460.m48131();
        if (size() >= 200000) {
            throw C8794.m22909(EnumC19377.LIMIT, "Token count limit exceeded");
        }
        return super.mo13730(Math.min(i, 200000 - size()));
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19761 mo13724(int i) {
        int i2 = this.f74459 + 1;
        this.f74459 = i2;
        if ((i2 & 1023) == 0) {
            this.f74460.m48131();
        }
        return super.mo13724(i);
    }
}
