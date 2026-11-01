package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1EV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617 extends C11994 {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    @Override // l.C11994, l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public final void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) throws IOException {
        String str;
        String strM18902;
        if (!interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        Iterator it = interfaceC3609.values().iterator();
        int i = 16777217;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (((InterfaceC9961) it.next()).mo25193() != i) {
                super.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
                return;
            }
            i = i2;
        }
        Iterator it2 = interfaceC3609.values().iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (i3 > 0) {
                    str = "string-array";
                }
                interfaceC9380.mo24062(str);
                interfaceC9380.mo24061("name", interfaceC3609.mo7645());
                C7054.m18906(interfaceC9380, interfaceC3609, c2820);
                for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
                    if (z) {
                        strM18902 = C7054.m18902(interfaceC9961);
                    } else {
                        strM18902 = "item";
                    }
                    interfaceC9380.mo24062(strM18902);
                    C7054.m18903(interfaceC9380, C7054.m18900(c22577, interfaceC9961));
                    interfaceC9380.mo24060(strM18902);
                }
                interfaceC9380.mo24060(str);
                return;
            }
            InterfaceC9961 interfaceC9962 = (InterfaceC9961) it2.next();
            int iMo25192 = interfaceC9962.mo25192();
            if (iMo25192 != 2) {
                if (iMo25192 == 1) {
                    InterfaceC19133 interfaceC19133M50080 = c22577.m50080(interfaceC9962.getValue());
                    if (interfaceC19133M50080 == null || !interfaceC19133M50080.getTypeName().equals("string")) {
                    }
                    i3++;
                } else {
                    if (iMo25192 != 3) {
                    }
                    i3++;
                }
            }
            Iterator it3 = interfaceC3609.values().iterator();
            int i4 = 0;
            while (true) {
                if (it3.hasNext()) {
                    InterfaceC9961 interfaceC9963 = (InterfaceC9961) it3.next();
                    int iMo25193 = interfaceC9963.mo25192();
                    if (iMo25193 != 2) {
                        if (iMo25193 == 1) {
                            InterfaceC19133 interfaceC19133M50081 = c22577.m50080(interfaceC9963.getValue());
                            if (interfaceC19133M50081 == null || !interfaceC19133M50081.getTypeName().equals("integer")) {
                            }
                            i4++;
                        } else {
                            if (interfaceC9963.mo25192() != 16 && interfaceC9963.mo25192() != 17) {
                            }
                            i4++;
                        }
                    }
                } else if (i4 > 0) {
                    str = "integer-array";
                    break;
                }
                str = "array";
                z = true;
                break;
            }
            interfaceC9380.mo24062(str);
            interfaceC9380.mo24061("name", interfaceC3609.mo7645());
            C7054.m18906(interfaceC9380, interfaceC3609, c2820);
            while (r10.hasNext()) {
                if (z) {
                    strM18902 = C7054.m18902(interfaceC9961);
                } else {
                    strM18902 = "item";
                }
                interfaceC9380.mo24062(strM18902);
                C7054.m18903(interfaceC9380, C7054.m18900(c22577, interfaceC9961));
                interfaceC9380.mo24060(strM18902);
            }
            interfaceC9380.mo24060(str);
            return;
        }
    }
}
