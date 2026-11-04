package l;

/* JADX INFO: renamed from: l.ۖᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C2875 implements InterfaceC23013 {
    @Override // l.InterfaceC23013
    /* JADX INFO: renamed from: ۙ */
    public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        C1330 c1330 = (C1330) abstractC4534;
        InterfaceC16299 interfaceC16299Mo15471 = interfaceC20029.mo7360().m26736().mo15471(C1330.class);
        if (interfaceC16299Mo15471 == null) {
            interfaceC20029.mo7364(c1330);
            return;
        }
        int length = interfaceC20029.length();
        interfaceC20029.mo7364(c1330);
        if (length == interfaceC20029.length()) {
            interfaceC20029.builder().append((char) 65532);
        }
        C10420 c10420Mo7360 = interfaceC20029.mo7360();
        boolean z = c1330.mo14267() instanceof C2821;
        AbstractC23671 abstractC23671M26737 = c10420Mo7360.m26737();
        String strM4898 = c1330.m4898();
        abstractC23671M26737.getClass();
        InterfaceC17045 interfaceC17045Mo7334 = interfaceC20029.mo7334();
        AbstractC14215.f44933.m29674(interfaceC17045Mo7334, strM4898);
        AbstractC14215.f44934.m29674(interfaceC17045Mo7334, Boolean.valueOf(z));
        AbstractC14215.f44935.m29674(interfaceC17045Mo7334, null);
        interfaceC20029.mo7335(length, interfaceC16299Mo15471.mo6845(c10420Mo7360, interfaceC17045Mo7334));
    }
}
