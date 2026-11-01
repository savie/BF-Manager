package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15020 extends C21369 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f48984 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f48985 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f48983 = new ConcurrentMapC13783();

    @Override // l.C21369
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 mo36011(InterfaceC3800 interfaceC3800) {
        return (InterfaceC3800) C2492.computeIfAbsent(this.f48984, interfaceC3800, new C0386(1, this));
    }

    @Override // l.C21369
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List mo36010(InterfaceC3800 interfaceC3800) {
        List listMo36010;
        synchronized (this.f48983) {
            listMo36010 = (List) this.f48983.get(interfaceC3800);
            if (listMo36010 == null) {
                listMo36010 = super.mo36010(interfaceC3800);
                this.f48983.put(interfaceC3800, listMo36010);
            }
        }
        return listMo36010;
    }

    @Override // l.C21369
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo36008(InterfaceC3800 interfaceC3800) {
        return ((Boolean) ((C11521) C2492.computeIfAbsent(this.f48985, interfaceC3800, new C22781(0, this))).map(new C18663(9)).orElse(Boolean.FALSE)).booleanValue();
    }

    @Override // l.C21369
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo36009(InterfaceC3800 interfaceC3800) {
        return ((C11521) C2492.computeIfAbsent(this.f48985, interfaceC3800, new C22781(0, this))).isPresent();
    }
}
