package l;

/* JADX INFO: renamed from: l.ۛۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D5ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5981 extends AbstractC9031 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f20345;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20346;

    public C5981(C17684 c17684, int i) {
        this.f20345 = c17684;
        this.f20346 = i;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return this.f20345.m41204(this.f20346);
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f20346;
        if (i < 0 || i >= this.f20345.m41196()) {
            throw new C10269("type@" + i);
        }
    }
}
