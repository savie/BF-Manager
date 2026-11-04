package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩹᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes2.dex */
public final class C23768 implements InterfaceC3718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f77011 = new ConcurrentMapC17249();

    @Override // l.InterfaceC3718
    /* JADX INFO: renamed from: ۙ */
    public final int mo12103(InterfaceC22759 interfaceC22759) {
        return ((C3630) interfaceC22759).f12442;
    }

    @Override // l.InterfaceC17142
    /* JADX INFO: renamed from: ۤ */
    public final int mo35672(Object obj) {
        C3630 c3630 = (C3630) obj;
        if (c3630 == null) {
            return -1;
        }
        return c3630.f12442;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C3630) obj).f12442;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3630 m53049(String str) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f77011;
        C3630 c3630 = (C3630) concurrentMapC17249.get(str);
        if (c3630 != null) {
            return c3630;
        }
        C3630 c3631 = new C3630(str);
        C3630 c3632 = (C3630) concurrentMapC17249.putIfAbsent(str, c3631);
        return c3632 == null ? c3631 : c3632;
    }

    @Override // l.InterfaceC3718
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo12104() {
        return this.f77011.size() > 65536;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C16308(this.f77011.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f77011.size();
    }
}
