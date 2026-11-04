package l;

/* JADX INFO: renamed from: l.ܰᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C14807 implements InterfaceC23013 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.InterfaceC23013
    /* JADX INFO: renamed from: ۙ */
    public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        boolean zM19963;
        C14974 c14974 = (C14974) abstractC4534;
        AbstractC23705 abstractC23705Mo14267 = c14974.mo14267();
        if (abstractC23705Mo14267 != null) {
            AbstractC4534 abstractC4534Mo14267 = abstractC23705Mo14267.mo14267();
            if (abstractC4534Mo14267 instanceof AbstractC7296) {
                zM19963 = ((AbstractC7296) abstractC4534Mo14267).m19963();
            } else {
                zM19963 = false;
            }
        } else {
            zM19963 = false;
        }
        if (!zM19963) {
            interfaceC20029.mo7366(c14974);
        }
        int length = interfaceC20029.length();
        interfaceC20029.mo7364(c14974);
        AbstractC22881.f74340.m29674(interfaceC20029.mo7334(), Boolean.valueOf(zM19963));
        interfaceC20029.mo7340(c14974, length);
        if (zM19963) {
            return;
        }
        interfaceC20029.mo7363(c14974);
    }
}
