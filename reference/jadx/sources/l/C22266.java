package l;

/* JADX INFO: renamed from: l.᩹ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes2.dex */
public final class C22266 extends AbstractC23408 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5332 f72772;

    public C22266(C2509 c2509, int i, int i2, int i3, C5332 c5332) {
        super(c2509);
        this.f75804 = i;
        this.f75806 = i2;
        this.f75807 = i3;
        this.f72772 = c5332;
    }

    @Override // l.AbstractC23408, l.InterfaceC9961
    /* JADX INFO: renamed from: ۚܰ */
    public final InterfaceC12078 mo25187() {
        return this.f72772;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۘۙ */
    public final int mo25186() {
        C2509 c2509 = (C2509) getEntry();
        for (int i = 0; i < c2509.f9920.size(); i++) {
            if (c2509.f9920.get(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
