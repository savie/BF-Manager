package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9838 extends AbstractC9204 implements InterfaceC2665 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Set f31665;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC23265 f31666;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31667;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2381 f31668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18634 f31669;

    public C9838(C2381 c2381, int i, InterfaceC23265 interfaceC23265, C18634 c18634, Set set) {
        this.f31668 = c2381;
        this.f31667 = i;
        this.f31666 = interfaceC23265;
        this.f31669 = c18634;
        this.f31665 = set;
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8823() {
        return this.f31667;
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۨۙ */
    public final InterfaceC16791 mo8822() {
        return this.f31666;
    }

    @Override // l.InterfaceC2665
    public final Set getAnnotations() {
        return this.f31669;
    }

    @Override // l.InterfaceC8304
    /* JADX INFO: renamed from: ܳ */
    public final String mo4500() {
        return this.f31668.f7661.f68791.f12443;
    }

    @Override // l.InterfaceC8304
    public final String getName() {
        return this.f31668.f7660.f12443;
    }

    @Override // l.InterfaceC8304
    public final String getType() {
        return this.f31668.f7663.f68791.f12443;
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۗ */
    public final Set mo8821() {
        return this.f31665;
    }
}
