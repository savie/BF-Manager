package l;

/* JADX INFO: renamed from: l.ۜᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes4.dex */
public final class C7350 implements InterfaceC23013 {
    @Override // l.InterfaceC23013
    /* JADX INFO: renamed from: ۙ */
    public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        C14007 c14007 = (C14007) abstractC4534;
        int length = interfaceC20029.length();
        interfaceC20029.mo7364(c14007);
        AbstractC23705 abstractC23705Mo14267 = c14007.mo14267();
        if (abstractC23705Mo14267 instanceof C19450) {
            final C19450 c19450 = (C19450) abstractC23705Mo14267;
            AbstractC22881.f74344.m29674(interfaceC20029.mo7334(), EnumC22135.ORDERED);
            AbstractC22881.f74343.m29674(interfaceC20029.mo7334(), Integer.valueOf(c19450.m44936()));
            AbstractC22881.f74342.m29674(interfaceC20029.mo7334(), new InterfaceC10946() { // from class: l.۠ᩴ᩹
                @Override // l.InterfaceC10946
                /* JADX INFO: renamed from: ۙ */
                public final int mo7733() {
                    return c19450.m44936() - 1;
                }
            });
            c19450.m44932(c19450.m44936() + 1);
        } else {
            AbstractC22881.f74344.m29674(interfaceC20029.mo7334(), EnumC22135.BULLET);
            C11824 c11824 = AbstractC22881.f74339;
            InterfaceC17045 interfaceC17045Mo7334 = interfaceC20029.mo7334();
            int i = 0;
            for (AbstractC4534 abstractC4534Mo14267 = c14007.mo14267(); abstractC4534Mo14267 != null; abstractC4534Mo14267 = abstractC4534Mo14267.mo14267()) {
                if (abstractC4534Mo14267 instanceof C14007) {
                    i++;
                }
            }
            c11824.m29674(interfaceC17045Mo7334, Integer.valueOf(i));
        }
        interfaceC20029.mo7340(c14007, length);
        if (interfaceC20029.mo7361(c14007)) {
            interfaceC20029.mo7362();
        }
    }
}
