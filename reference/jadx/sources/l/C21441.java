package l;

/* JADX INFO: renamed from: l.᩶ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21441 implements InterfaceC15429 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4989 f68394;

    public /* synthetic */ C21441(C4989 c4989) {
        this.f68394 = c4989;
    }

    @Override // l.InterfaceC15429
    /* JADX INFO: renamed from: ۙ */
    public final void mo36958(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
        C4989 c4989 = this.f68394;
        String str = c4989.f17339;
        if (interfaceC8697.mo23384() != c4989.f17333) {
            return;
        }
        if (c4989.f17336 == null) {
            InterfaceC10869 interfaceC10869Mo18153 = interfaceC8697.mo18153();
            InterfaceC15344 type = interfaceC8697.getType();
            int i = c4989.f17333;
            interfaceC10869Mo18153.getClass();
            int iMo27607 = interfaceC10869Mo18153.mo27607();
            c4989.f17336 = new C13192(type.getTypeName(), i, iMo27607, type.mo35833(), interfaceC8697.mo23383(), interfaceC8697.mo18156());
        }
        String strM26337 = C10208.m26337(interfaceC2731);
        c4989.f17340.add(strM26337);
        if ("*".equals(str) || str.equals(strM26337)) {
            c4989.f17334.add(new C8761(interfaceC2731, interfaceC8697));
        }
    }
}
