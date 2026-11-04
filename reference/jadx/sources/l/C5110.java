package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6C3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5110 extends AbstractC14146 {
    @Override // l.AbstractC14146
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo15469(C2551 c2551, InterfaceC18213 interfaceC18213) {
        boolean z;
        if (!(interfaceC18213 instanceof InterfaceC3297) || (interfaceC18213 instanceof C14287)) {
            return;
        }
        InterfaceC18213 parent = interfaceC18213.getParent();
        if (parent.mo17865(EnumC1763.FALL_THROUGH)) {
            return;
        }
        InterfaceC23435 interfaceC23435M47074 = C20531.m47074(parent);
        boolean z2 = true;
        if (!C23231.m52183(interfaceC23435M47074)) {
            z = false;
        } else if (!m34361(interfaceC23435M47074)) {
            return;
        } else {
            z = true;
        }
        List<InterfaceC6281> listMo10884 = ((InterfaceC3297) interfaceC18213).mo10884();
        ArrayList<C19501> arrayList = new ArrayList();
        for (InterfaceC6281 interfaceC6281 : listMo10884) {
            if (interfaceC6281 != null) {
                C22485 c22485M47078 = C20531.m47078(interfaceC6281);
                if (c22485M47078 == null) {
                    return;
                }
                C18959 c18959M50720 = c22485M47078.m50720();
                if (c18959M50720.getType() == EnumC24203.BREAK) {
                    InterfaceC23435 interfaceC23435M50719 = c22485M47078.m50719();
                    arrayList.add(new C19501(interfaceC23435M50719, C20531.m47064(interfaceC23435M50719, interfaceC6281)));
                } else if (!c18959M50720.m44037()) {
                }
            }
            z2 = false;
        }
        if (!arrayList.isEmpty()) {
            for (C19501 c19501 : arrayList) {
                m34359(c19501.m45024(), c19501.m45025());
            }
            if (!z) {
                this.f44734.add(parent);
                m34363();
            }
            c2551.mo17866(EnumC1763.REQUEST_IF_REGION_OPTIMIZE);
        }
        if (!z2 || interfaceC23435M47074 == null) {
            return;
        }
        m34359(interfaceC23435M47074, parent);
    }
}
