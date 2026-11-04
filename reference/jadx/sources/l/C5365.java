package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5365 extends C6702 implements InterfaceC16396 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f18811;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m16026(Object obj) {
        return ((C11330) obj).f35702;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo16027(Object obj) {
        return ((C11330) obj).f35703;
    }

    public C5365(C8850 c8850) {
        super(c8850);
        this.f18811 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11330 m16025(AbstractC22827 abstractC22827) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f18811;
        C11330 c11330 = (C11330) concurrentMapC17249.get(abstractC22827);
        if (c11330 != null) {
            return c11330;
        }
        C11330 c11331 = (C11330) this.f22294.m23715(abstractC22827);
        C11330 c11332 = (C11330) concurrentMapC17249.putIfAbsent(c11331, c11331);
        return c11332 == null ? c11331 : c11332;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo16024() {
        return new C12822(this.f18811.values());
    }
}
