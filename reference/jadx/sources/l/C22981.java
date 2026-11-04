package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2571 */
/* JADX INFO: loaded from: classes.dex */
public final class C22981 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10122 f74618;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5564 f74619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f74620;

    public C22981(C5564 c5564, InterfaceC10122 interfaceC10122) {
        InterfaceC7140 interfaceC7140Mo13175;
        this.f74619 = c5564;
        this.f74618 = interfaceC10122;
        HashSet hashSet = new HashSet();
        for (InterfaceC8631 interfaceC8631 : interfaceC10122.mo20405()) {
            if (interfaceC8631.getName().equals("<clinit>") && (interfaceC7140Mo13175 = interfaceC8631.mo13175()) != null) {
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    switch (C11046.f34865[interfaceC23331.mo30864().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            InterfaceC8304 interfaceC8304 = (InterfaceC8304) ((InterfaceC21729) interfaceC23331).getReference();
                            try {
                                interfaceC8304.mo6806();
                                if (interfaceC8304.mo4500().equals(interfaceC10122.getType())) {
                                    hashSet.add(C14684.m35307(interfaceC8304));
                                }
                            } catch (C22013 unused) {
                            }
                            break;
                    }
                }
            }
        }
        this.f74620 = hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51866(C2161 c2161) throws IOException {
        int i;
        c2161.getClass();
        c2161.write(".class ", 0, 7);
        InterfaceC10122 interfaceC10122 = this.f74618;
        for (EnumC2536 enumC2536 : EnumC2536.m8454(interfaceC10122.mo20404())) {
            c2161.write(enumC2536.toString());
            c2161.write(32);
        }
        boolean z = interfaceC10122 instanceof C22737;
        if (z) {
            ((C22737) interfaceC10122).m51265(c2161);
        } else {
            c2161.write(interfaceC10122.getType());
        }
        int i2 = 10;
        c2161.write(10);
        if (z) {
            C22737 c22737 = (C22737) interfaceC10122;
            int iM51270 = c22737.m51270();
            if (iM51270 != -1) {
                c2161.write(".super ", 0, 7);
                c22737.f73785.m55787(c2161, iM51270);
                c2161.write(10);
            }
        } else {
            String strMo20397 = interfaceC10122.mo20397();
            if (strMo20397 != null) {
                c2161.write(".super ", 0, 7);
                c2161.write(strMo20397, 0, strMo20397.length());
                c2161.write(10);
            }
        }
        C5564 c5564 = this.f74619;
        if (c5564.f19338) {
            if (z) {
                C22737 c22738 = (C22737) interfaceC10122;
                int iM51275 = c22738.m51275();
                if (iM51275 != -1) {
                    c2161.write(".source \"", 0, 9);
                    c22738.f73785.m55816(iM51275, c2161, true);
                    c2161.write("\"\n", 0, 2);
                }
            } else {
                String strMo20400 = interfaceC10122.mo20400();
                if (strMo20400 != null) {
                    c2161.write(".source \"", 0, 9);
                    C3652.m11836(c2161, strMo20400);
                    c2161.write("\"\n", 0, 2);
                }
            }
        }
        if (z) {
            C22737 c22739 = (C22737) interfaceC10122;
            int[] iArrM51269 = c22739.m51269();
            if (iArrM51269 != null) {
                c2161.write(10);
                c2161.write("# interfaces\n", 0, 13);
                C24975 c24975 = c22739.f73785;
                for (int i3 : iArrM51269) {
                    c2161.write(".implements ", 0, 12);
                    c24975.m55787(c2161, i3);
                    c2161.write(10);
                }
            }
        } else {
            List<String> listMo20402 = interfaceC10122.mo20402();
            if (listMo20402.size() != 0) {
                c2161.write(10);
                c2161.write("# interfaces\n", 0, 13);
                for (String str : listMo20402) {
                    c2161.write(".implements ", 0, 12);
                    c2161.write(str);
                    c2161.write(10);
                }
            }
        }
        Set annotations = interfaceC10122.getAnnotations();
        if (annotations.size() != 0) {
            c2161.write("\n\n", 0, 2);
            c2161.write("# annotations\n", 0, 14);
            C13701.m33494(c2161, annotations);
        }
        Iterable<InterfaceC2665> iterableM51272 = z ? ((C22737) interfaceC10122).m51272(false) : interfaceC10122.mo20398();
        boolean z2 = c5564.f19333;
        if (z2) {
            iterableM51272 = Arrays.asList((InterfaceC2665[]) C16625.m39334(iterableM51272, InterfaceC2665.class));
            Iterator it = iterableM51272.iterator();
            int i4 = 0;
            i = -1;
            while (it.hasNext()) {
                InterfaceC16791 interfaceC16791Mo8822 = ((InterfaceC2665) it.next()).mo8822();
                if (interfaceC16791Mo8822 != null && !C16922.m39905(interfaceC16791Mo8822)) {
                    i = i4;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = false;
        int i5 = 0;
        for (InterfaceC2665 interfaceC2665 : iterableM51272) {
            if (!z3) {
                c2161.write("\n\n", 0, 2);
                c2161.write("# static fields", 0, 15);
                z3 = true;
            }
            c2161.write(i2);
            HashSet hashSet = this.f74620;
            C12538.m31153(c5564, c2161, interfaceC2665, (!z2 || i5 <= i) ? interfaceC2665.mo8822() : null, !hashSet.isEmpty() && hashSet.remove(C14684.m35307(interfaceC2665)));
            i5++;
            i2 = 10;
        }
        boolean z4 = false;
        for (InterfaceC2665 interfaceC2666 : z ? ((C22737) interfaceC10122).m51274(false) : interfaceC10122.mo20401()) {
            if (!z4) {
                c2161.write("\n\n", 0, 2);
                c2161.write("# instance fields", 0, 17);
                z4 = true;
            }
            c2161.write(10);
            C12538.m31153(c5564, c2161, interfaceC2666, interfaceC2666.mo8822(), false);
        }
        boolean z5 = false;
        for (InterfaceC8631 interfaceC8631 : z ? ((C22737) interfaceC10122).m51268(false) : interfaceC10122.mo20405()) {
            if (!z5) {
                c2161.write("\n\n", 0, 2);
                c2161.write("# direct methods", 0, 16);
                z5 = true;
            }
            c2161.write(10);
            InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
            if (interfaceC7140Mo13175 == null || !interfaceC7140Mo13175.mo2840().iterator().hasNext()) {
                C22718.m51243(c2161, interfaceC8631, c5564);
            } else {
                C22718 c22718 = new C22718(c5564, interfaceC8631, interfaceC7140Mo13175);
                c22718.m51247(c2161);
                c22718.m51250();
            }
        }
        boolean z6 = false;
        for (InterfaceC8631 interfaceC8632 : z ? ((C22737) interfaceC10122).m51271(false) : interfaceC10122.mo20403()) {
            if (!z6) {
                c2161.write("\n\n", 0, 2);
                c2161.write("# virtual methods", 0, 17);
                z6 = true;
            }
            c2161.write(10);
            InterfaceC7140 interfaceC7140Mo13176 = interfaceC8632.mo13175();
            if (interfaceC7140Mo13176 == null || !interfaceC7140Mo13176.mo2840().iterator().hasNext()) {
                C22718.m51243(c2161, interfaceC8632, c5564);
            } else {
                C22718 c22719 = new C22718(c5564, interfaceC8632, interfaceC7140Mo13176);
                c22719.m51247(c2161);
                c22719.m51250();
            }
        }
    }
}
