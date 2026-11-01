package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩹᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5J6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22596 extends C11452 implements InterfaceC13569 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f73638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50096(InterfaceC15914 interfaceC15914) {
        return ((C1428) interfaceC15914).f5880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3067 m50098(CharSequence charSequence) {
        return ((C1428) charSequence).f5881;
    }

    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ۨ */
    public final int mo24177(Object obj) {
        C1428 c1428 = (C1428) obj;
        if (c1428 == null) {
            return -1;
        }
        return c1428.f5880;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C1428) obj).f5880;
    }

    public C22596(C8485 c8485) {
        super(c8485);
        this.f73638 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1428 m50097(String str) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f73638;
        C1428 c1428 = (C1428) concurrentMapC13783.get(str);
        if (c1428 != null) {
            return c1428;
        }
        C1428 c1429 = new C1428(((C9419) this.f38553.f51669).m24176(str));
        C1428 c14210 = (C1428) concurrentMapC13783.putIfAbsent(str, c1429);
        return c14210 == null ? c1429 : c14210;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C5662(this.f73638.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f73638.size();
    }
}
