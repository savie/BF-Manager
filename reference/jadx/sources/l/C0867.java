package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4TJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0867 extends C11452 implements InterfaceC1136 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f3524;

    @Override // l.InterfaceC1136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1428 mo3474(InterfaceC3710 interfaceC3710) {
        return ((C2278) interfaceC3710).f8135;
    }

    @Override // l.InterfaceC1136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9336 mo3475(InterfaceC6533 interfaceC6533) {
        return ((C5101) interfaceC6533).f17775;
    }

    @Override // l.InterfaceC1136
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set mo3476(InterfaceC3710 interfaceC3710) {
        return ((C2278) interfaceC3710).f8136;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo3477(Object obj) {
        return ((C2278) obj).f8133;
    }

    @Override // l.InterfaceC1136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo3478(InterfaceC3710 interfaceC3710) {
        return ((C2278) interfaceC3710).f8134;
    }

    @Override // l.InterfaceC1136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3067 mo3479(InterfaceC6533 interfaceC6533) {
        return ((C5101) interfaceC6533).f17776;
    }

    public C0867(C8485 c8485) {
        super(c8485);
        this.f3524 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2278 m3472(InterfaceC3710 interfaceC3710) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f3524;
        C2278 c2278 = (C2278) concurrentMapC13783.get(interfaceC3710);
        if (c2278 != null) {
            return c2278;
        }
        int visibility = interfaceC3710.getVisibility();
        C8485 c8485 = this.f38553;
        C2278 c2279 = new C2278(visibility, c8485.f51666.m50097(interfaceC3710.getType()), AbstractC23844.m52569(C16458.m38720(interfaceC3710.getElements().iterator(), new C15541(c8485))));
        C2278 c22710 = (C2278) concurrentMapC13783.putIfAbsent(c2279, c2279);
        return c22710 == null ? c2279 : c22710;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo3473() {
        return new C22035(this.f3524.values());
    }
}
