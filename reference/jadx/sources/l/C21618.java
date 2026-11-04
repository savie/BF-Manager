package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4TJ */
/* JADX INFO: loaded from: classes.dex */
public final class C21618 extends C6702 implements InterfaceC21398 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f69045;

    @Override // l.InterfaceC21398
    /* JADX INFO: renamed from: ۙ */
    public final C21530 mo48649(InterfaceC7886 interfaceC7886) {
        return ((C24602) interfaceC7886).f79698;
    }

    @Override // l.InterfaceC21398
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23265 mo48650(InterfaceC19073 interfaceC19073) {
        return ((C4464) interfaceC19073).f15974;
    }

    @Override // l.InterfaceC21398
    /* JADX INFO: renamed from: ۤ */
    public final Set mo48651(InterfaceC7886 interfaceC7886) {
        return ((C24602) interfaceC7886).f79701;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ᩷ */
    public final int mo16027(Object obj) {
        return ((C24602) obj).f79700;
    }

    @Override // l.InterfaceC21398
    /* JADX INFO: renamed from: ᩷ */
    public final int mo48652(InterfaceC7886 interfaceC7886) {
        return ((C24602) interfaceC7886).f79699;
    }

    @Override // l.InterfaceC21398
    /* JADX INFO: renamed from: ᩷ */
    public final C3630 mo48653(InterfaceC19073 interfaceC19073) {
        return ((C4464) interfaceC19073).f15975;
    }

    public C21618(C8850 c8850) {
        super(c8850);
        this.f69045 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24602 m49141(InterfaceC7886 interfaceC7886) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f69045;
        C24602 c24602 = (C24602) concurrentMapC17249.get(interfaceC7886);
        if (c24602 != null) {
            return c24602;
        }
        int visibility = interfaceC7886.getVisibility();
        C8850 c8850 = this.f22294;
        C24602 c24603 = new C24602(visibility, c8850.f74939.m35671(interfaceC7886.getType()), AbstractC8639.m23278(C7676.m20911(interfaceC7886.getElements().iterator(), new C10341(c8850))));
        C24602 c24604 = (C24602) concurrentMapC17249.putIfAbsent(c24603, c24603);
        return c24604 == null ? c24603 : c24604;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo16024() {
        return new C14904(this.f69045.values());
    }
}
