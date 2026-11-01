package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12158 extends C11452 implements InterfaceC1842 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f40695;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m30244(Object obj) {
        return ((C5807) obj).f19725;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ܰ */
    public final int mo3477(Object obj) {
        return ((C5807) obj).f19726;
    }

    public C12158(C8485 c8485) {
        super(c8485);
        this.f40695 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5807 m30245(AbstractC7619 abstractC7619) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f40695;
        C5807 c5807 = (C5807) concurrentMapC13783.get(abstractC7619);
        if (c5807 != null) {
            return c5807;
        }
        C5807 c5808 = (C5807) this.f38553.m22154(abstractC7619);
        C5807 c5809 = (C5807) concurrentMapC13783.putIfAbsent(c5808, c5808);
        return c5809 == null ? c5808 : c5809;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3473() {
        return new C16391(this.f40695.values());
    }
}
