package l;

/* JADX INFO: renamed from: l.ܿۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65VW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17270 extends AbstractC19614 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f55012;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f55013;

    public C17270(C17684 c17684, int i) {
        this.f55012 = c17684;
        this.f55013 = i;
    }

    @Override // l.InterfaceC20852
    public final String getString() {
        return this.f55012.m41168(this.f55013);
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f55013;
        if (i < 0 || i >= this.f55012.m41194()) {
            throw new C10269("string@" + i);
        }
    }
}
