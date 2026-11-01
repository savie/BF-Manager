package l;

/* JADX INFO: renamed from: l.ۛۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5793 extends AbstractC7944 {
    @Override // l.AbstractC5752
    public final boolean p0() {
        return true;
    }

    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC18796 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC18796 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.InterfaceC6124
    public final InterfaceC6124 unordered() {
        return !EnumC2970.ORDERED.s(this.m) ? this : new C6553(this, EnumC2970.r, 2);
    }

    @Override // l.AbstractC5752, l.InterfaceC6124
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return spliterator();
    }
}
