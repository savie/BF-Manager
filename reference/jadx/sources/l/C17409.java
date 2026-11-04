package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17409 implements InterfaceC11442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3239 f56607;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f56608;

    public C17409(C3239 c3239, HashSet hashSet) {
        this.f56607 = c3239;
        this.f56608 = hashSet;
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۤ */
    public final void mo2553(int i) {
        this.f56608.add(Integer.valueOf(i));
        C3239 c3239 = this.f56607;
        if (c3239.f10561.contains(Integer.valueOf(i))) {
            return;
        }
        c3239.f10554.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۙ */
    public final void mo2552(int i) {
        C3239 c3239 = this.f56607;
        c3239.f10561.add(Integer.valueOf(i));
        if (this.f56608.contains(Integer.valueOf(i))) {
            return;
        }
        c3239.f10560.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2554(int i) {
        mo2553(i);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2555(int i) {
        mo2552(i);
    }
}
