package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۤ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C11087 extends C6702 implements InterfaceC11921 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f34946;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2381 m27999(InterfaceC6813 interfaceC6813) {
        return (C2381) ((C23022) interfaceC6813).f74716;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C23022) obj).f74714;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11833 m28001(InterfaceC6813 interfaceC6813) {
        return (C11833) ((C23022) interfaceC6813).f74716;
    }

    public C11087(C8850 c8850) {
        super(c8850);
        this.f34946 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23022 m28000(InterfaceC6813 interfaceC6813) {
        InterfaceC17800 interfaceC17800M24234;
        ConcurrentMapC17249 concurrentMapC17249 = this.f34946;
        C23022 c23022 = (C23022) concurrentMapC17249.get(interfaceC6813);
        if (c23022 != null) {
            return c23022;
        }
        int iMo17433 = interfaceC6813.mo17433();
        C8850 c8850 = this.f22294;
        switch (iMo17433) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC17800M24234 = c8850.f74937.m24234((InterfaceC8304) interfaceC6813.mo17434());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC17800M24234 = c8850.f74918.m17100((InterfaceC4859) interfaceC6813.mo17434());
                break;
            default:
                throw new C23044(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC6813.mo17433()));
        }
        C23022 c23023 = new C23022(interfaceC6813.mo17433(), interfaceC17800M24234);
        C23022 c23024 = (C23022) concurrentMapC17249.putIfAbsent(c23023, c23023);
        return c23024 == null ? c23023 : c23024;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C22276(this.f34946.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f34946.size();
    }
}
