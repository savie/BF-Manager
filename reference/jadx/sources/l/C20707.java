package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20707 extends C11452 implements InterfaceC6076 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f67332;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18590 m46556(InterfaceC8152 interfaceC8152) {
        return (C18590) ((C15769) interfaceC8152).f51078;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5890 m46558(InterfaceC8152 interfaceC8152) {
        return (C5890) ((C15769) interfaceC8152).f51078;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C15769) obj).f51077;
    }

    public C20707(C8485 c8485) {
        super(c8485);
        this.f67332 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15769 m46557(InterfaceC8152 interfaceC8152) {
        InterfaceC14358 interfaceC14358M41508;
        ConcurrentMapC13783 concurrentMapC13783 = this.f67332;
        C15769 c15769 = (C15769) concurrentMapC13783.get(interfaceC8152);
        if (c15769 != null) {
            return c15769;
        }
        int iMo20681 = interfaceC8152.mo20681();
        C8485 c8485 = this.f38553;
        switch (iMo20681) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC14358M41508 = c8485.f51680.m41508((InterfaceC18735) interfaceC8152.mo20680());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC14358M41508 = c8485.f51694.m30444((InterfaceC8858) interfaceC8152.mo20680());
                break;
            default:
                throw new C20749(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC8152.mo20681()));
        }
        C15769 c157610 = new C15769(interfaceC8152.mo20681(), interfaceC14358M41508);
        C15769 c157611 = (C15769) concurrentMapC13783.putIfAbsent(c157610, c157610);
        return c157611 == null ? c157610 : c157611;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C7301(this.f67332.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f67332.size();
    }
}
