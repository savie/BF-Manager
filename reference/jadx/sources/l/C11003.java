package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۧ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11003 implements InterfaceC12414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1829 f37429;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f37430;

    public C11003(C1829 c1829, HashSet hashSet) {
        this.f37429 = c1829;
        this.f37430 = hashSet;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۨ */
    public final void mo1609(int i) {
        this.f37430.add(Integer.valueOf(i));
        C1829 c1829 = this.f37429;
        if (c1829.f7017.contains(Integer.valueOf(i))) {
            return;
        }
        c1829.f7011.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۙ */
    public final void mo1606(int i) {
        C1829 c1829 = this.f37429;
        c1829.f7017.add(Integer.valueOf(i));
        if (this.f37430.contains(Integer.valueOf(i))) {
            return;
        }
        c1829.f7013.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ܰ */
    public final void mo1610(int i) {
        mo1609(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۖ */
    public final void mo1605(int i) {
        mo1606(i);
    }
}
