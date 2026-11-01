package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩸ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5E9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21329 extends C11452 implements InterfaceC3958 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f69415;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69416;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5807 m47837(InterfaceC18029 interfaceC18029) {
        return ((C17801) interfaceC18029).f56418;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C17801) obj).f56419;
    }

    public C21329(C8485 c8485) {
        super(c8485);
        this.f69415 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17801 m47840(InterfaceC18029 interfaceC18029) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f69415;
        C17801 c17801 = (C17801) concurrentMapC13783.get(interfaceC18029);
        if (c17801 != null) {
            return c17801;
        }
        C17801 c17802 = new C17801(interfaceC18029.getName(), this.f38553.f51679.m30245((AbstractC7619) C6367.m17473(interfaceC18029)));
        C17801 c17803 = (C17801) concurrentMapC13783.putIfAbsent(c17802, c17802);
        return c17803 == null ? c17802 : c17803;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C14980(this.f69415.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f69415.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47839() {
        return this.f69416 + this.f69415.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47838(int i) {
        this.f69416 = i;
    }
}
