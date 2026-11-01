package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۡ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1ER */
/* JADX INFO: loaded from: classes4.dex */
public final class C9172 extends C11994 {
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    @Override // l.C11994, l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public final void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        CharSequence charSequenceM18900;
        if (!interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        interfaceC9380.mo24062("style");
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        if (interfaceC3609.getParent() != 0) {
            interfaceC9380.mo24061("parent", "@".concat(c22577.mo39837(interfaceC3609.mo10692().mo19106(), interfaceC3609.getParent())));
        }
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        C5062 c5062M50082 = c22577.m50082();
        for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
            C11413 c11413M14108 = c5062M50082.m14108(interfaceC9961.mo25193());
            if (c11413M14108 == null) {
                C11994.m29876(interfaceC9380, interfaceC9961, c22577);
            } else {
                if (((C18597) c11413M14108.m28516()).contains(interfaceC9961.mo25192())) {
                    String strM50078 = c22577.m50078(interfaceC3609.mo10692().mo19106(), (c11413M14108.f38428 >>> 24) & 255);
                    interfaceC9380.mo24062("item");
                    StringBuilder sbM23356 = C9023.m23356(strM50078);
                    sbM23356.append(c11413M14108.f38431);
                    interfaceC9380.mo24061("name", sbM23356.toString());
                    if (interfaceC9961.mo25189()) {
                        int i = c11413M14108.f38427;
                        if ((65536 & i) != 0) {
                            charSequenceM18900 = c11413M14108.m28515(interfaceC9961.getValue());
                        } else if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                            charSequenceM18900 = c11413M14108.m28518(interfaceC9961.getValue());
                        } else {
                            charSequenceM18900 = null;
                        }
                    } else {
                        charSequenceM18900 = null;
                    }
                    if (charSequenceM18900 == null) {
                        charSequenceM18900 = C7054.m18900(c22577, interfaceC9961);
                    }
                    C7054.m18903(interfaceC9380, charSequenceM18900);
                    interfaceC9380.mo24060("item");
                } else {
                    C11994.m29876(interfaceC9380, interfaceC9961, c22577);
                }
            }
        }
        interfaceC9380.mo24060("style");
    }
}
