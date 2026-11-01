package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2571 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22762 f34659;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20424 f34660;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f34661;

    public C10153(C20424 c20424, InterfaceC22762 interfaceC22762) {
        InterfaceC7945 interfaceC7945Mo25747;
        this.f34660 = c20424;
        this.f34659 = interfaceC22762;
        HashSet hashSet = new HashSet();
        for (InterfaceC18528 interfaceC18528 : interfaceC22762.mo20495()) {
            if (interfaceC18528.getName().equals("<clinit>") && (interfaceC7945Mo25747 = interfaceC18528.mo25747()) != null) {
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    switch (C8742.f30036[interfaceC1594.mo5435().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            InterfaceC18735 interfaceC18735 = (InterfaceC18735) ((InterfaceC10331) interfaceC1594).getReference();
                            try {
                                interfaceC18735.mo1997();
                                if (interfaceC18735.mo1183().equals(interfaceC22762.getType())) {
                                    hashSet.add(C22304.m49466(interfaceC18735));
                                }
                            } catch (C10269 unused) {
                            }
                            break;
                    }
                }
            }
        }
        this.f34661 = hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25796(C12283 c12283) throws IOException {
        int i;
        c12283.getClass();
        c12283.write(".class ", 0, 7);
        InterfaceC22762 interfaceC22762 = this.f34659;
        for (EnumC15236 enumC15236 : EnumC15236.m36498(interfaceC22762.mo20491())) {
            c12283.write(enumC15236.toString());
            c12283.write(32);
        }
        boolean z = interfaceC22762 instanceof C7807;
        if (z) {
            ((C7807) interfaceC22762).m20483(c12283);
        } else {
            c12283.write(interfaceC22762.getType());
        }
        int i2 = 10;
        c12283.write(10);
        if (z) {
            C7807 c7807 = (C7807) interfaceC22762;
            int iM20497 = c7807.m20497();
            if (iM20497 != -1) {
                c12283.write(".super ", 0, 7);
                c7807.f25683.m41172(c12283, iM20497);
                c12283.write(10);
            }
        } else {
            String strMo20494 = interfaceC22762.mo20494();
            if (strMo20494 != null) {
                c12283.write(".super ", 0, 7);
                c12283.write(strMo20494, 0, strMo20494.length());
                c12283.write(10);
            }
        }
        C20424 c20424 = this.f34660;
        if (c20424.f66199) {
            if (z) {
                C7807 c7808 = (C7807) interfaceC22762;
                int iM20487 = c7808.m20487();
                if (iM20487 != -1) {
                    c12283.write(".source \"", 0, 9);
                    c7808.f25683.m41192(iM20487, c12283, true);
                    c12283.write("\"\n", 0, 2);
                }
            } else {
                String strMo20493 = interfaceC22762.mo20493();
                if (strMo20493 != null) {
                    c12283.write(".source \"", 0, 9);
                    C9461.m24219(c12283, strMo20493);
                    c12283.write("\"\n", 0, 2);
                }
            }
        }
        if (z) {
            C7807 c7809 = (C7807) interfaceC22762;
            int[] iArrM20488 = c7809.m20488();
            if (iArrM20488 != null) {
                c12283.write(10);
                c12283.write("# interfaces\n", 0, 13);
                C17684 c17684 = c7809.f25683;
                for (int i3 : iArrM20488) {
                    c12283.write(".implements ", 0, 12);
                    c17684.m41172(c12283, i3);
                    c12283.write(10);
                }
            }
        } else {
            List<String> listMo20500 = interfaceC22762.mo20500();
            if (listMo20500.size() != 0) {
                c12283.write(10);
                c12283.write("# interfaces\n", 0, 13);
                for (String str : listMo20500) {
                    c12283.write(".implements ", 0, 12);
                    c12283.write(str);
                    c12283.write(10);
                }
            }
        }
        Set annotations = interfaceC22762.getAnnotations();
        if (annotations.size() != 0) {
            c12283.write("\n\n", 0, 2);
            c12283.write("# annotations\n", 0, 14);
            C18619.m43060(c12283, annotations);
        }
        Iterable<InterfaceC17822> iterableM20485 = z ? ((C7807) interfaceC22762).m20485(false) : interfaceC22762.mo20496();
        boolean z2 = c20424.f66195;
        if (z2) {
            iterableM20485 = Arrays.asList((InterfaceC17822[]) C22808.m50470(iterableM20485, InterfaceC17822.class));
            Iterator it = iterableM20485.iterator();
            int i4 = 0;
            i = -1;
            while (it.hasNext()) {
                InterfaceC10975 interfaceC10975Mo28399 = ((InterfaceC17822) it.next()).mo28399();
                if (interfaceC10975Mo28399 != null && !C23365.m51480(interfaceC10975Mo28399)) {
                    i = i4;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = false;
        int i5 = 0;
        for (InterfaceC17822 interfaceC17822 : iterableM20485) {
            if (!z3) {
                c12283.write("\n\n", 0, 2);
                c12283.write("# static fields", 0, 15);
                z3 = true;
            }
            c12283.write(i2);
            HashSet hashSet = this.f34661;
            C9448.m24201(c20424, c12283, interfaceC17822, (!z2 || i5 <= i) ? interfaceC17822.mo28399() : null, !hashSet.isEmpty() && hashSet.remove(C22304.m49466(interfaceC17822)));
            i5++;
            i2 = 10;
        }
        boolean z4 = false;
        for (InterfaceC17822 interfaceC17823 : z ? ((C7807) interfaceC22762).m20482(false) : interfaceC22762.mo20489()) {
            if (!z4) {
                c12283.write("\n\n", 0, 2);
                c12283.write("# instance fields", 0, 17);
                z4 = true;
            }
            c12283.write(10);
            C9448.m24201(c20424, c12283, interfaceC17823, interfaceC17823.mo28399(), false);
        }
        boolean z5 = false;
        for (InterfaceC18528 interfaceC18528 : z ? ((C7807) interfaceC22762).m20492(false) : interfaceC22762.mo20495()) {
            if (!z5) {
                c12283.write("\n\n", 0, 2);
                c12283.write("# direct methods", 0, 16);
                z5 = true;
            }
            c12283.write(10);
            InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
            if (interfaceC7945Mo25747 == null || !interfaceC7945Mo25747.mo11508().iterator().hasNext()) {
                C10547.m26680(c12283, interfaceC18528, c20424);
            } else {
                C10547 c10547 = new C10547(c20424, interfaceC18528, interfaceC7945Mo25747);
                c10547.m26684(c12283);
                c10547.m26687();
            }
        }
        boolean z6 = false;
        for (InterfaceC18528 interfaceC18529 : z ? ((C7807) interfaceC22762).m20499(false) : interfaceC22762.mo20486()) {
            if (!z6) {
                c12283.write("\n\n", 0, 2);
                c12283.write("# virtual methods", 0, 17);
                z6 = true;
            }
            c12283.write(10);
            InterfaceC7945 interfaceC7945Mo25748 = interfaceC18529.mo25747();
            if (interfaceC7945Mo25748 == null || !interfaceC7945Mo25748.mo11508().iterator().hasNext()) {
                C10547.m26680(c12283, interfaceC18529, c20424);
            } else {
                C10547 c10548 = new C10547(c20424, interfaceC18529, interfaceC7945Mo25748);
                c10548.m26684(c12283);
                c10548.m26687();
            }
        }
    }
}
