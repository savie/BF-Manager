package l;

/* JADX INFO: renamed from: l.ܽۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M62C */
/* JADX INFO: loaded from: classes5.dex */
public final class C16350 extends AbstractC21730 implements InterfaceC5766 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5766 f52643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52644;

    public C16350(int i, InterfaceC5766 interfaceC5766) {
        this.f52644 = i;
        this.f52643 = interfaceC5766;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16350 m38521(InterfaceC8152 interfaceC8152) {
        InterfaceC5766 interfaceC5766M1182;
        if (interfaceC8152 instanceof C16350) {
            return (C16350) interfaceC8152;
        }
        int iMo20681 = interfaceC8152.mo20681();
        switch (iMo20681) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC5766M1182 = C0121.m1182((InterfaceC18735) interfaceC8152.mo20680());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC5766M1182 = C17055.m39832((InterfaceC8858) interfaceC8152.mo20680());
                break;
            default:
                throw new C20749(null, "Invalid method handle type: %d", Integer.valueOf(iMo20681));
        }
        return new C16350(iMo20681, interfaceC5766M1182);
    }

    @Override // l.InterfaceC8152
    /* JADX INFO: renamed from: ۙܰ */
    public final int mo20681() {
        return this.f52644;
    }

    @Override // l.InterfaceC8152
    /* JADX INFO: renamed from: ֨ܰ */
    public final InterfaceC7446 mo20680() {
        return this.f52643;
    }
}
