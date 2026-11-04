package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1EV */
/* JADX INFO: loaded from: classes.dex */
public final class C21509 extends C10320 {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    @Override // l.C10320, l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public final void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) throws IOException {
        String str;
        String strM34212;
        if (!interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        Iterator it = interfaceC8697.values().iterator();
        int i = 16777217;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (((InterfaceC5650) it.next()).mo16637() != i) {
                super.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
                return;
            }
            i = i2;
        }
        Iterator it2 = interfaceC8697.values().iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (i3 > 0) {
                    str = "string-array";
                }
                interfaceC18525.mo14234(str);
                interfaceC18525.mo14233("name", interfaceC8697.mo18156());
                C14049.m34216(interfaceC18525, interfaceC8697, c1372);
                for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
                    if (z) {
                        strM34212 = C14049.m34212(interfaceC5650);
                    } else {
                        strM34212 = "item";
                    }
                    interfaceC18525.mo14234(strM34212);
                    C14049.m34213(interfaceC18525, C14049.m34210(c2863, interfaceC5650));
                    interfaceC18525.mo14232(strM34212);
                }
                interfaceC18525.mo14232(str);
                return;
            }
            InterfaceC5650 interfaceC5651 = (InterfaceC5650) it2.next();
            int iMo16635 = interfaceC5651.mo16635();
            if (iMo16635 != 2) {
                if (iMo16635 == 1) {
                    InterfaceC15344 interfaceC15344M9454 = c2863.m9454(interfaceC5651.getValue());
                    if (interfaceC15344M9454 == null || !interfaceC15344M9454.getTypeName().equals("string")) {
                    }
                    i3++;
                } else {
                    if (iMo16635 != 3) {
                    }
                    i3++;
                }
            }
            Iterator it3 = interfaceC8697.values().iterator();
            int i4 = 0;
            while (true) {
                if (it3.hasNext()) {
                    InterfaceC5650 interfaceC5652 = (InterfaceC5650) it3.next();
                    int iMo16636 = interfaceC5652.mo16635();
                    if (iMo16636 != 2) {
                        if (iMo16636 == 1) {
                            InterfaceC15344 interfaceC15344M9455 = c2863.m9454(interfaceC5652.getValue());
                            if (interfaceC15344M9455 == null || !interfaceC15344M9455.getTypeName().equals("integer")) {
                            }
                            i4++;
                        } else {
                            if (interfaceC5652.mo16635() != 16 && interfaceC5652.mo16635() != 17) {
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
            interfaceC18525.mo14234(str);
            interfaceC18525.mo14233("name", interfaceC8697.mo18156());
            C14049.m34216(interfaceC18525, interfaceC8697, c1372);
            while (r10.hasNext()) {
                if (z) {
                    strM34212 = C14049.m34212(interfaceC5650);
                } else {
                    strM34212 = "item";
                }
                interfaceC18525.mo14234(strM34212);
                C14049.m34213(interfaceC18525, C14049.m34210(c2863, interfaceC5650));
                interfaceC18525.mo14232(strM34212);
            }
            interfaceC18525.mo14232(str);
            return;
        }
    }
}
