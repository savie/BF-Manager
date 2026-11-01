package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45BU */
/* JADX INFO: loaded from: classes2.dex */
public final class C22741 extends C11452 implements InterfaceC13132 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f74075;

    @Override // l.InterfaceC14544
    /* JADX INFO: renamed from: ۖ */
    public final int mo8596(Object obj) {
        C12863 c12863 = (C12863) obj;
        if (c12863 == null) {
            return 0;
        }
        return c12863.f42779;
    }

    @Override // l.InterfaceC13132
    /* JADX INFO: renamed from: ۚ */
    public final Set mo32490(Object obj) {
        return ((C12863) obj).f42778;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ܰ */
    public final int mo3477(Object obj) {
        return ((C12863) obj).f42779;
    }

    public C22741(C8485 c8485) {
        super(c8485);
        this.f74075 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12863 m50406(Set set) {
        if (set == null) {
            return C12863.f42777;
        }
        ConcurrentMapC13783 concurrentMapC13783 = this.f74075;
        C12863 c12863 = (C12863) concurrentMapC13783.get(set);
        if (c12863 != null) {
            return c12863;
        }
        C12863 c12864 = new C12863(AbstractC23844.m52569(C16458.m38720(set.iterator(), new C3689(this))));
        C12863 c12865 = (C12863) concurrentMapC13783.putIfAbsent(c12864, c12864);
        return c12865 == null ? c12864 : c12865;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3473() {
        return new C6512(this.f74075.values());
    }
}
