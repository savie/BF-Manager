package l;

/* JADX INFO: renamed from: l.ۛܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6522 extends AbstractC9503 {
    @Override // l.AbstractC15470
    public final boolean p0() {
        return false;
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC17686 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC17686 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.InterfaceC19924
    public final InterfaceC19924 unordered() {
        return !EnumC21614.ORDERED.p(this.m) ? this : new C6940(this, EnumC21614.r, 1);
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return spliterator();
    }
}
