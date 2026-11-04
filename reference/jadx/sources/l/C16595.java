package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16595 extends AbstractC12384 implements InterfaceC9904 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC22631 f53676 = EnumC22631.f73340;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f53677;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f53678;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509;
    }

    public C16595(int i, List list) {
        super(f53676);
        this.f53677 = i;
        this.f53678 = list == null ? AbstractC1928.of() : list;
    }

    @Override // l.InterfaceC9904
    /* JADX INFO: renamed from: ۧ */
    public final int mo3032() {
        return this.f53677;
    }

    @Override // l.InterfaceC9904
    /* JADX INFO: renamed from: ᩳ */
    public final List mo3034() {
        return this.f53678;
    }

    @Override // l.AbstractC12384, l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public final int mo3033() {
        return (((this.f53678.size() * this.f53677) + 1) / 2) + 4;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f53676.f73508;
    }
}
