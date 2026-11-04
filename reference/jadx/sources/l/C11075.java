package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6C3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11075 extends AbstractC14146 {
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // l.AbstractC14146
    /* JADX INFO: renamed from: ᩸ */
    public final void mo15469(C2551 c2551, InterfaceC18213 interfaceC18213) {
        C18959 c18959;
        List listMo19035 = interfaceC18213.mo19035();
        InterfaceC6281 interfaceC6281 = (InterfaceC6281) C6823.m18999(listMo19035);
        if (interfaceC6281 instanceof InterfaceC23435) {
            InterfaceC23435 interfaceC23435 = (InterfaceC23435) interfaceC6281;
            if (m34361(interfaceC23435)) {
                if (interfaceC23435.mo1986().size() > 1) {
                    c18959 = (C18959) C7750.m21093(2, interfaceC23435.mo1986());
                } else if (listMo19035.size() > 1) {
                    InterfaceC6281 interfaceC6282 = (InterfaceC6281) C7750.m21093(2, listMo19035);
                    if (interfaceC6282 instanceof InterfaceC23435) {
                        c18959 = (C18959) C6823.m18999(((InterfaceC23435) interfaceC6282).mo1986());
                    } else {
                        c18959 = null;
                    }
                } else {
                    c18959 = null;
                }
                if (c18959 == null || !c18959.m44037()) {
                    return;
                }
                m34359(interfaceC23435, interfaceC18213);
            }
        }
    }
}
