package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۢۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9419 implements InterfaceC3253 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f31922 = new ConcurrentMapC13783();

    @Override // l.InterfaceC3253
    /* JADX INFO: renamed from: ۙ */
    public final int mo9732(InterfaceC20852 interfaceC20852) {
        return ((C3067) interfaceC20852).f11558;
    }

    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo24177(Object obj) {
        C3067 c3067 = (C3067) obj;
        if (c3067 == null) {
            return -1;
        }
        return c3067.f11558;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo24178(Object obj) {
        return ((C3067) obj).f11558;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3067 m24176(String str) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f31922;
        C3067 c3067 = (C3067) concurrentMapC13783.get(str);
        if (c3067 != null) {
            return c3067;
        }
        C3067 c3068 = new C3067(str);
        C3067 c3069 = (C3067) concurrentMapC13783.putIfAbsent(str, c3068);
        return c3069 == null ? c3068 : c3069;
    }

    @Override // l.InterfaceC3253
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo9733() {
        return this.f31922.size() > 65536;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C1656(this.f31922.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f31922.size();
    }
}
