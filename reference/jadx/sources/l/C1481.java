package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.֨᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1481 extends C6702 implements InterfaceC0515 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f5149;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f5150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11330 m5272(InterfaceC2338 interfaceC2338) {
        return ((C9683) interfaceC2338).f31262;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo5275(Object obj) {
        return ((C9683) obj).f31264;
    }

    public C1481(C8850 c8850) {
        super(c8850);
        this.f5149 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9683 m5276(InterfaceC2338 interfaceC2338) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f5149;
        C9683 c9683 = (C9683) concurrentMapC17249.get(interfaceC2338);
        if (c9683 != null) {
            return c9683;
        }
        C9683 c9684 = new C9683(interfaceC2338.getName(), this.f22294.f74922.m16025((AbstractC22827) C11592.m29127(interfaceC2338)));
        C9683 c9685 = (C9683) concurrentMapC17249.putIfAbsent(c9684, c9684);
        return c9685 == null ? c9684 : c9685;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo5271() {
        return new C10429(this.f5149.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f5149.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m5274() {
        return this.f5150 + this.f5149.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5273(int i) {
        this.f5150 = i;
    }
}
