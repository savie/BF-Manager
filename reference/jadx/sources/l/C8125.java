package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8WA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8125 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21390(boolean z, List list, InterfaceC1976 interfaceC1976) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19759 interfaceC19759 = (InterfaceC19759) it.next();
            int iMo22127 = interfaceC19759.mo22127(z);
            int iMo22131 = interfaceC19759.mo22131(z);
            if (iMo22127 != iMo22131 || iMo22127 != interfaceC1976.length()) {
                int iLastIndexOf = interfaceC1976.lastIndexOf('\n', 0, iMo22127) + 1;
                if (iLastIndexOf != iMo22127) {
                    interfaceC19759.mo22134(iLastIndexOf, z);
                    m21391(z, interfaceC19759, iMo22127 - iLastIndexOf);
                }
                if (interfaceC19759.mo23603(z) != interfaceC19759.mo23592(z)) {
                    int iIndexOf = interfaceC1976.indexOf('\n', iMo22131 - 1, interfaceC1976.length());
                    iLastIndexOf = iIndexOf == -1 ? interfaceC1976.length() : iIndexOf + 1;
                }
                if (iMo22131 != iLastIndexOf) {
                    interfaceC19759.mo22125(iLastIndexOf, z);
                }
            }
        }
        Iterator it2 = list.iterator();
        InterfaceC19759 interfaceC197510 = null;
        while (it2.hasNext()) {
            InterfaceC19759 interfaceC197511 = (InterfaceC19759) it2.next();
            if (interfaceC197510 != null && interfaceC197510.mo22131(z) >= interfaceC197511.mo22127(z)) {
                int i = 0;
                while (i < 2) {
                    boolean z2 = i == 0;
                    int iMo22128 = interfaceC197510.mo22127(z2);
                    int iMo22129 = interfaceC197511.mo22127(z2);
                    if (iMo22128 < iMo22129) {
                        interfaceC197511.mo22134(iMo22128, z2);
                        m21391(z2, interfaceC197511, iMo22129 - iMo22128);
                    }
                    int iMo22132 = interfaceC197510.mo22131(z2);
                    int iMo22133 = interfaceC197511.mo22131(z2);
                    if (iMo22132 < iMo22133) {
                        interfaceC197510.mo22125(iMo22133, z2);
                    }
                    int iMo23592 = interfaceC197510.mo23592(z2);
                    int iMo23593 = interfaceC197511.mo23592(z2);
                    if (iMo23592 < iMo23593) {
                        interfaceC197510.mo23596(iMo23593, z2);
                    }
                    i++;
                }
                List listMo23604 = interfaceC197510.mo23604();
                List listMo23605 = interfaceC197511.mo23604();
                if (listMo23605 != null) {
                    if (listMo23604 == null) {
                        listMo23604 = new ArrayList();
                    }
                    listMo23604.addAll(listMo23605);
                }
                interfaceC197510.mo23597(listMo23604);
                it2.remove();
            } else {
                interfaceC197510 = interfaceC197511;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21391(boolean z, InterfaceC19759 interfaceC19759, int i) {
        List<InterfaceC19053> listMo23604 = interfaceC19759.mo23604();
        if (listMo23604 != null) {
            for (InterfaceC19053 interfaceC19053 : listMo23604) {
                if (z) {
                    interfaceC19053.mo22130(interfaceC19053.mo22124() + i);
                    interfaceC19053.mo22132(interfaceC19053.mo22126() + i);
                } else {
                    interfaceC19053.mo22135(interfaceC19053.mo22129() + i);
                    interfaceC19053.mo22133(interfaceC19053.mo22123() + i);
                }
            }
        }
    }
}
