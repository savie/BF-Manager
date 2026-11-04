package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۚܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1ER */
/* JADX INFO: loaded from: classes3.dex */
public final class C5715 extends C10320 {
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    @Override // l.C10320, l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public final void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        CharSequence charSequenceM34210;
        if (!interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        interfaceC18525.mo14234("style");
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        if (interfaceC8697.getParent() != 0) {
            interfaceC18525.mo14233("parent", "@".concat(c2863.mo9456(interfaceC8697.mo18153().mo27607(), interfaceC8697.getParent())));
        }
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        C7075 c7075M9457 = c2863.m9457();
        for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
            C2600 c2600M19410 = c7075M9457.m19410(interfaceC5650.mo16637());
            if (c2600M19410 == null) {
                C10320.m26592(interfaceC18525, interfaceC5650, c2863);
            } else {
                if (((C0594) c2600M19410.m8730()).contains(interfaceC5650.mo16635())) {
                    String strM9452 = c2863.m9452(interfaceC8697.mo18153().mo27607(), (c2600M19410.f8353 >>> 24) & 255);
                    interfaceC18525.mo14234("item");
                    StringBuilder sbM27333 = C10732.m27333(strM9452);
                    sbM27333.append(c2600M19410.f8356);
                    interfaceC18525.mo14233("name", sbM27333.toString());
                    if (interfaceC5650.mo16632()) {
                        int i = c2600M19410.f8357;
                        if ((65536 & i) != 0) {
                            charSequenceM34210 = c2600M19410.m8729(interfaceC5650.getValue());
                        } else if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                            charSequenceM34210 = c2600M19410.m8732(interfaceC5650.getValue());
                        } else {
                            charSequenceM34210 = null;
                        }
                    } else {
                        charSequenceM34210 = null;
                    }
                    if (charSequenceM34210 == null) {
                        charSequenceM34210 = C14049.m34210(c2863, interfaceC5650);
                    }
                    C14049.m34213(interfaceC18525, charSequenceM34210);
                    interfaceC18525.mo14232("item");
                } else {
                    C10320.m26592(interfaceC18525, interfaceC5650, c2863);
                }
            }
        }
        interfaceC18525.mo14232("style");
    }
}
