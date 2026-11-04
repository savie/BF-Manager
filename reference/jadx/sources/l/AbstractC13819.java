package l;

import com.google.android.material.slider.BaseSlider;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M1X3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13819 extends AbstractC23166 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f43805;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f43806;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f43807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f43808;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC10243 f43809;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8007 f43810;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f43811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f43812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo33724(int i, String str) {
        return str;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo12249(C22420 c22420);

    public AbstractC13819(C22420 c22420, InterfaceC23517 interfaceC23517) {
        super(c22420, interfaceC23517);
        this.f43809 = EnumC10243.STATIC;
        this.f43806 = true;
        this.f43808 = new ArrayList();
        this.f43807 = new ArrayList();
        this.f43805 = new ArrayList();
        this.f43812 = new ArrayList();
        this.f43811 = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ca A[PHI: r3
      0x02ca: PHI (r3v48 boolean) = (r3v7 boolean), (r3v52 boolean) binds: [B:109:0x02c8, B:106:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33725(InterfaceC4787 interfaceC4787) {
        int i;
        C10628 c10628;
        Iterator it;
        int i2;
        List list;
        C8850 c8850;
        boolean z;
        int i3;
        C7447 c7447;
        Iterator it2;
        InterfaceC23517 interfaceC23517;
        AbstractC13819 abstractC13819;
        C8850 c8851;
        Set set;
        C10628 c10629;
        C8850 c8852;
        AbstractC13819 abstractC138110;
        boolean z2;
        String strMo12248;
        Iterator it3;
        boolean z3;
        InterfaceC23517 interfaceC23518;
        InterfaceC21941 interfaceC21941;
        AbstractC13819 abstractC138111 = this;
        C22420 c22420 = abstractC138111.f75089;
        List listMo12249 = abstractC138111.mo12249(c22420);
        boolean z4 = false;
        if (listMo12249.isEmpty()) {
            return false;
        }
        C8850 c8853 = c22420.f72612;
        int size = c22420.f72611.values().size();
        Iterator it4 = c8853.f74945.m36267().values().iterator();
        int i4 = -1;
        boolean z5 = false;
        int i5 = 0;
        while (it4.hasNext()) {
            C7447 c7448 = (C7447) it4.next();
            i5++;
            int i6 = (i5 * 100) / size;
            InterfaceC23517 interfaceC23519 = abstractC138111.f75090;
            if (i6 != i4) {
                interfaceC23519.mo11094(i6);
                i4 = i6;
            }
            String type = c7448.getType();
            if (interfaceC4787.test(type.substring(1, type.length() - 1).replace('/', '.'))) {
                Iterator it5 = c7448.getMethods().iterator();
                boolean z6 = false;
                while (it5.hasNext()) {
                    C5122 c5122 = (C5122) it5.next();
                    if (interfaceC23519.mo924()) {
                        return z4;
                    }
                    InterfaceC7140 interfaceC7140Mo13175 = c5122.mo13175();
                    if (interfaceC7140Mo13175 == null) {
                        i = size;
                        c10628 = null;
                    } else {
                        i = size;
                        c10628 = interfaceC7140Mo13175 instanceof C10628 ? (C10628) interfaceC7140Mo13175 : new C10628(interfaceC7140Mo13175);
                    }
                    if (c10628 == null) {
                        list = listMo12249;
                        c8851 = c8853;
                        it = it4;
                        i2 = i4;
                        z = z5;
                        i3 = i5;
                        c7447 = c7448;
                        it2 = it5;
                        interfaceC23517 = interfaceC23519;
                        abstractC13819 = abstractC138111;
                    } else {
                        C12328 c12328 = new C12328(c7448, c5122, c10628);
                        it = it4;
                        i2 = i4;
                        C1295 c1295 = new C1295(listMo12249, abstractC138111.f43809);
                        C9497 c9497 = abstractC138111.f43806 ? new C9497() : null;
                        list = listMo12249;
                        List list2 = c12328.f39608;
                        if (c9497 != null) {
                            while (true) {
                                z = z5;
                                i3 = i5;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    if (!c1295.m4695(i7, list2) || c1295.m4696().equals(c5122)) {
                                        it3 = it5;
                                        interfaceC23518 = interfaceC23519;
                                        z3 = z6;
                                    } else {
                                        int i8 = i7 + 1;
                                        if (c9497.m24878(i8, list2)) {
                                            it3 = it5;
                                            AbstractCollection abstractCollection = (AbstractCollection) ((AbstractC12384) list2.get(i7)).m30863().m24747();
                                            if (!abstractCollection.isEmpty()) {
                                                AbstractC12384 abstractC12384 = (AbstractC12384) list2.get(i7);
                                                AbstractC12384 abstractC12385 = (AbstractC12384) list2.get(i8);
                                                interfaceC23518 = interfaceC23519;
                                                if (abstractC12384 instanceof InterfaceC6067) {
                                                    final InterfaceC6067 interfaceC6067 = (InterfaceC6067) abstractC12384;
                                                    c7448 = c7448;
                                                    interfaceC21941 = new InterfaceC21941() { // from class: l.۠ۧ᩸
                                                        @Override // l.InterfaceC21941
                                                        public final Object get() {
                                                            InterfaceC6067 interfaceC6068 = interfaceC6067;
                                                            return new C11131(interfaceC6068.mo30864(), interfaceC6068.mo1655(), interfaceC6068.mo7063(), interfaceC6068.mo7065(), interfaceC6068.mo7061(), interfaceC6068.mo7062(), interfaceC6068.mo7064(), interfaceC6068.getReference());
                                                        }
                                                    };
                                                } else {
                                                    c7448 = c7448;
                                                    if (abstractC12384 instanceof InterfaceC14269) {
                                                        final InterfaceC14269 interfaceC14269 = (InterfaceC14269) abstractC12384;
                                                        interfaceC21941 = new InterfaceC21941() { // from class: l.ۜۧ᩸
                                                            @Override // l.InterfaceC21941
                                                            public final Object get() {
                                                                InterfaceC14269 interfaceC142610 = interfaceC14269;
                                                                return new C15606(interfaceC142610.mo30864(), interfaceC142610.mo2772(), interfaceC142610.mo1655(), interfaceC142610.getReference());
                                                            }
                                                        };
                                                    }
                                                    c8853 = c8853;
                                                    z3 = z6;
                                                }
                                                if (abstractC12385 instanceof InterfaceC8413) {
                                                    InterfaceC8413 interfaceC8413 = (InterfaceC8413) abstractC12385;
                                                    z3 = z6;
                                                    HashSet hashSet = new HashSet();
                                                    for (AbstractC12384 abstractC12386 : (AbstractList) list2) {
                                                        C8850 c8854 = c8853;
                                                        if (abstractC12386 instanceof AbstractC6419) {
                                                            AbstractC6419 abstractC6419 = (AbstractC6419) abstractC12386;
                                                            if (abstractCollection.contains(abstractC6419.m18177())) {
                                                                hashSet.add(abstractC6419.m30863());
                                                            }
                                                        }
                                                        c8853 = c8854;
                                                    }
                                                    c8853 = c8853;
                                                    if (i7 > 0 && ((AbstractC12384) list2.get(i7 - 1)).mo30864().m51000()) {
                                                        hashSet.add(((AbstractC12384) list2.get(i7)).m30863());
                                                    }
                                                    if (hashSet.size() != 1) {
                                                        Iterator it6 = hashSet.iterator();
                                                        while (it6.hasNext()) {
                                                            int iM24745 = ((C9400) it6.next()).m24745();
                                                            c10628.m27107(iM24745, (AbstractC12384) interfaceC21941.get());
                                                            c10628.m27107(iM24745 + 1, new C3171(interfaceC8413.mo1542(), interfaceC8413.mo30864()));
                                                        }
                                                        c10628.m27114(abstractC12384.m30863().m24745());
                                                        c10628.m27114(abstractC12385.m30863().m24745());
                                                        i5 = i3;
                                                        z5 = z;
                                                        interfaceC23519 = interfaceC23518;
                                                        it5 = it3;
                                                        c7448 = c7448;
                                                        z6 = z3;
                                                        c8853 = c8853;
                                                    }
                                                } else {
                                                    c8853 = c8853;
                                                    z3 = z6;
                                                }
                                            }
                                        } else {
                                            it3 = it5;
                                        }
                                        interfaceC23518 = interfaceC23519;
                                        z3 = z6;
                                    }
                                    i7++;
                                    interfaceC23519 = interfaceC23518;
                                    it5 = it3;
                                    c7448 = c7448;
                                    z6 = z3;
                                    c8853 = c8853;
                                }
                            }
                            c8850 = c8853;
                        } else {
                            c8850 = c8853;
                            z = z5;
                            i3 = i5;
                        }
                        c7447 = c7448;
                        it2 = it5;
                        interfaceC23517 = interfaceC23519;
                        boolean z7 = z6;
                        boolean z8 = false;
                        boolean z9 = false;
                        int iM24746 = 0;
                        while (iM24746 < list2.size()) {
                            if (!c1295.m4695(iM24746, list2) || c1295.m4696().equals(c5122)) {
                                c8852 = c8850;
                            } else if (c9497 == null || c9497.m24878(iM24746 + 1, list2)) {
                                if (!z9) {
                                    try {
                                        String strMo6804 = c5122.mo6804();
                                        c22420.f72608.m36018(strMo6804.substring(1, strMo6804.length() - 1).replace('/', '.'), c5122.getName());
                                        z9 = true;
                                    } catch (Exception unused) {
                                        abstractC138110 = this;
                                        z2 = false;
                                        C14684.m35306((InterfaceC4859) c5122, false);
                                        strMo12248 = null;
                                        if (strMo12248 == null) {
                                            c8852 = c8850;
                                        } else {
                                            C14684.m35306(c5122, z2);
                                            c8852 = c8850;
                                            C16057 c16057 = new C16057(EnumC22631.f73506, abstractC138110.mo33130(c9497), c8852.m23719(strMo12248));
                                            abstractC138110.mo12250(c12328, c16057, c1295, c9497);
                                            iM24746 = c16057.m30863().m24745();
                                            z8 = true;
                                        }
                                        iM24746++;
                                        c8850 = c8852;
                                    }
                                }
                                abstractC138110 = this;
                                try {
                                    strMo12248 = abstractC138110.mo12248(c5122, c12328, c1295, iM24746);
                                    z2 = false;
                                } catch (Exception unused2) {
                                    z2 = false;
                                    C14684.m35306((InterfaceC4859) c5122, false);
                                    strMo12248 = null;
                                }
                                if (strMo12248 == null) {
                                    c8852 = c8850;
                                } else {
                                    C14684.m35306(c5122, z2);
                                    c8852 = c8850;
                                    C16057 c16058 = new C16057(EnumC22631.f73506, abstractC138110.mo33130(c9497), c8852.m23719(strMo12248));
                                    abstractC138110.mo12250(c12328, c16058, c1295, c9497);
                                    iM24746 = c16058.m30863().m24745();
                                    z8 = true;
                                }
                            } else {
                                C14684.m35306((InterfaceC4859) c5122, false);
                                c8852 = c8850;
                            }
                            iM24746++;
                            c8850 = c8852;
                        }
                        abstractC13819 = this;
                        c8851 = c8850;
                        if (z8) {
                            int i9 = 1;
                            while (true) {
                                int size2 = list2.size();
                                set = c12328.f39609;
                                c10629 = c12328.f39606;
                                if (i9 >= size2) {
                                    break;
                                }
                                AbstractC12384 abstractC12387 = (AbstractC12384) list2.get(i9);
                                if (!C14565.m35130(abstractC12387, set)) {
                                    if (C14565.m35131(abstractC12387)) {
                                        AbstractC12384 abstractC12388 = (AbstractC12384) list2.get(i9 - 1);
                                        if (C14565.m35131(abstractC12388) && ((InterfaceC12142) abstractC12387).mo1542() == ((InterfaceC18109) abstractC12388).mo1541() && ((InterfaceC18109) abstractC12387).mo1541() == ((InterfaceC12142) abstractC12388).mo1542()) {
                                            c10629.m27114(i9);
                                            i9--;
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                                i9++;
                            }
                            int size3 = list2.size();
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    break;
                                }
                                AbstractC12384 abstractC12389 = (AbstractC12384) list2.get(size3);
                                if (C14565.m35131(abstractC12389) && !C14565.m35132(c12328, ((InterfaceC12142) abstractC12389).mo1542(), size3 + 1)) {
                                    c10629.m27114(size3);
                                }
                            }
                            int size4 = list2.size();
                            while (true) {
                                size4--;
                                if (size4 < 0) {
                                    break;
                                }
                                InterfaceC23331 interfaceC23331 = (AbstractC12384) list2.get(size4);
                                if ((interfaceC23331.mo30864() != EnumC22631.f73504 ? false : ((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType().equals("[B")) && !C14565.m35132(c12328, ((InterfaceC12142) interfaceC23331).mo1542(), size4 + 1)) {
                                    c10629.m27114(size4);
                                }
                            }
                            int i10 = 1;
                            while (i10 < list2.size()) {
                                AbstractC12384 abstractC123810 = (AbstractC12384) list2.get(i10);
                                if (!C14565.m35130(abstractC123810, set)) {
                                    if (C14565.m35133(abstractC123810)) {
                                        AbstractC12384 abstractC123811 = (AbstractC12384) list2.get(i10 - 1);
                                        if (C14565.m35133(abstractC123811) && ((InterfaceC12142) abstractC123810).mo1542() == ((InterfaceC18109) abstractC123811).mo1541() && ((InterfaceC18109) abstractC123810).mo1541() == ((InterfaceC12142) abstractC123811).mo1542()) {
                                            c10629.m27114(i10);
                                            i10--;
                                        }
                                    } else {
                                        i10++;
                                    }
                                }
                                i10++;
                            }
                            int size5 = list2.size();
                            while (true) {
                                size5--;
                                if (size5 < 0) {
                                    break;
                                }
                                AbstractC12384 abstractC123812 = (AbstractC12384) list2.get(size5);
                                if (C14565.m35133(abstractC123812) && !C14565.m35132(c12328, ((InterfaceC12142) abstractC123812).mo1542(), size5 + 1)) {
                                    c10629.m27114(size5);
                                }
                            }
                            int size6 = list2.size();
                            while (true) {
                                size6--;
                                if (size6 < 0) {
                                    break;
                                }
                                InterfaceC23331 interfaceC23332 = (AbstractC12384) list2.get(size6);
                                EnumC22631 enumC22631Mo30864 = interfaceC23332.mo30864();
                                if (enumC22631Mo30864 != EnumC22631.f73482 && enumC22631Mo30864 != EnumC22631.f73402 && enumC22631Mo30864 != EnumC22631.f73450 && enumC22631Mo30864 != EnumC22631.f73295) {
                                    EnumC22631 enumC22631Mo30865 = interfaceC23332.mo30864();
                                    if (enumC22631Mo30865 == EnumC22631.f73506 || enumC22631Mo30865 == EnumC22631.f73418) {
                                    }
                                }
                                if (!C14565.m35132(c12328, ((InterfaceC12142) interfaceC23332).mo1542(), size6 + 1)) {
                                    c10629.m27114(size6);
                                }
                            }
                            int i11 = 0;
                            while (i11 < list2.size()) {
                                AbstractC12384 abstractC123813 = (AbstractC12384) list2.get(i11);
                                if (abstractC123813.mo30864() == EnumC22631.f73340 && ((AbstractCollection) abstractC123813.m30863().m24747()).isEmpty()) {
                                    c10629.m27114(i11);
                                    i11--;
                                }
                                i11++;
                            }
                            int size7 = list2.size();
                            while (true) {
                                size7--;
                                if (size7 < 0 || ((AbstractC12384) list2.get(size7)).mo30864() != EnumC22631.f73424) {
                                    break;
                                }
                                c10629.m27114(size7);
                            }
                            c5122.m15486(c10628);
                            z6 = true;
                        } else {
                            z6 = z7;
                        }
                    }
                    z4 = false;
                    abstractC138111 = abstractC13819;
                    c8853 = c8851;
                    size = i;
                    it4 = it;
                    i4 = i2;
                    listMo12249 = list;
                    i5 = i3;
                    z5 = z;
                    interfaceC23519 = interfaceC23517;
                    it5 = it2;
                    c7448 = c7447;
                }
                List list3 = listMo12249;
                C8850 c8855 = c8853;
                int i12 = size;
                Iterator it7 = it4;
                int i13 = i4;
                boolean z10 = z5;
                int i14 = i5;
                C7447 c7449 = c7448;
                AbstractC13819 abstractC138112 = abstractC138111;
                if (z6) {
                    c22420.f72607.add(c7449.getType());
                    z5 = true;
                } else {
                    z5 = z10;
                }
                z4 = false;
                abstractC138111 = abstractC138112;
                c8853 = c8855;
                size = i12;
                it4 = it7;
                i4 = i13;
                listMo12249 = list3;
                i5 = i14;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo33130(C9497 c9497) {
        if (c9497 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        return c9497.m24876();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x035a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0360  */
    /* JADX WARN: Code duplicated, block: B:168:0x0363  */
    /* JADX WARN: Code duplicated, block: B:170:0x037b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0398 A[LOOP:2: B:171:0x0394->B:173:0x0398, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d5 A[LOOP:3: B:176:0x03d3->B:177:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:185:0x0410  */
    /* JADX WARN: Code duplicated, block: B:186:0x0412  */
    /* JADX WARN: Code duplicated, block: B:188:0x0418  */
    /* JADX WARN: Code duplicated, block: B:189:0x042d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0451  */
    /* JADX WARN: Code duplicated, block: B:191:0x0465  */
    /* JADX WARN: Code duplicated, block: B:192:0x0479  */
    /* JADX WARN: Code duplicated, block: B:193:0x049c  */
    /* JADX WARN: Code duplicated, block: B:194:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:214:0x034e A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x03ba, please report this as an issue */
    /* JADX INFO: renamed from: ۙ */
    public String mo12248(C5122 c5122, C12328 c12328, C1295 c1295, int i) {
        byte b;
        String str;
        boolean z;
        int i2;
        int i3;
        short[] sArrM9255;
        int length;
        int i4;
        int i5;
        C14763 c14763;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractC13819 abstractC13819 = this;
        abstractC13819.f43810 = null;
        ArrayList arrayList5 = abstractC13819.f43808;
        arrayList5.clear();
        ArrayList arrayList6 = abstractC13819.f43807;
        arrayList6.clear();
        ArrayList arrayList7 = abstractC13819.f43805;
        arrayList7.clear();
        ArrayList arrayList8 = abstractC13819.f43812;
        arrayList8.clear();
        ArrayList arrayList9 = abstractC13819.f43811;
        arrayList9.clear();
        InterfaceC4859 interfaceC4859M4696 = c1295.m4696();
        List listMo6805 = interfaceC4859M4696.mo6805();
        C14763 c14764 = new C14763();
        InterfaceC6036 interfaceC6036M4697 = c1295.m4697();
        int i6 = 0;
        while (true) {
            int size = listMo6805.size();
            String str2 = "I";
            InterfaceC4859 interfaceC4859 = interfaceC4859M4696;
            C14763 c14765 = c14764;
            ArrayList arrayList10 = arrayList6;
            String str3 = "C";
            ArrayList arrayList11 = arrayList8;
            String str4 = "B";
            ArrayList arrayList12 = arrayList9;
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = arrayList5;
            C22420 c22420 = abstractC13819.f75089;
            if (i6 < size) {
                String strMo33724 = abstractC13819.mo33724(i6, ((CharSequence) listMo6805.get(i6)).toString());
                strMo33724.getClass();
                switch (strMo33724) {
                    case "B":
                    case "C":
                    case "F":
                    case "I":
                    case "S":
                    case "Z":
                        c14763 = c14765;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c14763.add(interfaceC6036M4697.nextInt());
                        break;
                    case "D":
                    case "J":
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c14763 = c14765;
                        c14763.add(interfaceC6036M4697.nextInt());
                        c14763.add(interfaceC6036M4697.nextInt());
                        break;
                    case "[B":
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C14718 c14718 = new C14718(c22420);
                        if (!c14718.m35413(c12328, i, interfaceC6036M4697.nextInt())) {
                            C17359.toString(c5122);
                            return null;
                        }
                        arrayList = arrayList10;
                        arrayList.add(c14718);
                        c14763 = c14765;
                        break;
                        break;
                    case "[C":
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C21432 c21432 = new C21432(c22420);
                        if (!c21432.m48756(c12328, i, interfaceC6036M4697.nextInt())) {
                            C17359.toString(c5122);
                            return null;
                        }
                        arrayList2 = arrayList11;
                        arrayList2.add(c21432);
                        c14763 = c14765;
                        arrayList = arrayList10;
                        break;
                        break;
                    case "[I":
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C18448 c18448 = new C18448(c22420);
                        if (!c18448.m42981(c12328, i, interfaceC6036M4697.nextInt())) {
                            C17359.toString(c5122);
                            return null;
                        }
                        arrayList9 = arrayList12;
                        arrayList9.add(c18448);
                        c14763 = c14765;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        break;
                        break;
                    case "[S":
                        arrayList4 = arrayList14;
                        C2786 c2786 = new C2786(c22420);
                        if (!c2786.m9254(c12328, i, interfaceC6036M4697.nextInt())) {
                            C17359.toString(c5122);
                            return null;
                        }
                        arrayList3 = arrayList13;
                        arrayList3.add(c2786);
                        c14763 = c14765;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        break;
                        break;
                    case "Ljava/lang/String;":
                        C8752 c8752 = new C8752(c22420);
                        if (!c8752.m23448(c12328, i, interfaceC6036M4697.nextInt())) {
                            C17359.toString(c5122);
                            return null;
                        }
                        arrayList4 = arrayList14;
                        arrayList4.add(c8752);
                        c14763 = c14765;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        break;
                        break;
                    default:
                        throw new RuntimeException("Unsupported parameter type: ".concat(strMo33724));
                }
                i6++;
                c14764 = c14763;
                arrayList6 = arrayList;
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList8 = arrayList2;
                interfaceC4859M4696 = interfaceC4859;
            } else {
                if (!c14765.isEmpty()) {
                    C8007 c8007 = new C8007();
                    abstractC13819.f43810 = c8007;
                    if (!c8007.m21870(c12328, i, c14765.mo2687())) {
                        C17359.toString(c5122);
                        return null;
                    }
                }
                C8007 c8008 = abstractC13819.f43810;
                Object[] objArrM21871 = c8008 == null ? new Object[0] : c8008.m21871(c22420);
                String strM52090 = AbstractC23166.m52090(interfaceC4859.mo6804());
                String name = interfaceC4859.getName();
                C6178 c6178 = new C6178();
                c6178.m17786((CharSequence) strM52090);
                c6178.m17786((CharSequence) name);
                c6178.writeByte(listMo6805.size());
                InterfaceC6036 interfaceC6036M4698 = c1295.m4697();
                Iterator it = arrayList14.iterator();
                Iterator it2 = arrayList10.iterator();
                Iterator it3 = arrayList13.iterator();
                Iterator it4 = arrayList11.iterator();
                Iterator it5 = arrayList12.iterator();
                Object[] objArr = objArrM21871;
                int i7 = 0;
                while (i7 < listMo6805.size()) {
                    String string = ((CharSequence) listMo6805.get(i7)).toString();
                    List list = listMo6805;
                    String strMo33725 = abstractC13819.mo33724(i7, string);
                    int iNextInt = interfaceC6036M4698.nextInt();
                    strMo33725.getClass();
                    switch (strMo33725.hashCode()) {
                        case 66:
                            str4 = str4;
                            b = !strMo33725.equals(str4) ? (byte) -1 : (byte) 0;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt2 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt2]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt3 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt3]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM48757 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM48757.length);
                                    for (char c : cArrM48757) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 67:
                            String str5 = str3;
                            if (strMo33725.equals(str5)) {
                                b = 1;
                                str3 = str5;
                            } else {
                                str3 = str5;
                                str4 = str4;
                                switch (b) {
                                    case 0:
                                        str = str2;
                                        c6178.writeByte(0);
                                        c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                        break;
                                    case 1:
                                        str = str2;
                                        c6178.writeByte(2);
                                        c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 2:
                                        str = str2;
                                        int iNextInt4 = interfaceC6036M4698.nextInt();
                                        c6178.writeByte(6);
                                        c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c6178.writeInt(((Number) objArr[iNextInt4]).intValue());
                                        break;
                                    case 3:
                                        str = str2;
                                        c6178.writeByte(5);
                                        c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 4:
                                        str = str2;
                                        c6178.writeByte(3);
                                        c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 5:
                                        str = str2;
                                        int iNextInt5 = interfaceC6036M4698.nextInt();
                                        c6178.writeByte(4);
                                        c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c6178.writeInt(((Number) objArr[iNextInt5]).intValue());
                                        break;
                                    case 6:
                                        str = str2;
                                        c6178.writeByte(1);
                                        c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 7:
                                        str = str2;
                                        c6178.writeByte(7);
                                        if (((Number) objArr[iNextInt]).intValue() != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c6178.m17789(z);
                                        break;
                                    case 8:
                                        str = str2;
                                        if (string.equals("[B")) {
                                            i2 = 10;
                                        } else {
                                            i2 = 11;
                                        }
                                        c6178.writeByte(i2);
                                        c6178.m17806(((C14718) it2.next()).m35414());
                                        break;
                                    case 9:
                                        str = str2;
                                        c6178.writeByte(13);
                                        char[] cArrM48758 = ((C21432) it4.next()).m48757();
                                        c6178.writeInt(cArrM48758.length);
                                        while (i3 < r1) {
                                            c6178.mo17801(c);
                                        }
                                        break;
                                    case 10:
                                        str = str2;
                                        c6178.writeByte(14);
                                        c6178.m17807(((C18448) it5.next()).m42982());
                                        break;
                                    case 11:
                                        c6178.writeByte(12);
                                        sArrM9255 = ((C2786) it3.next()).m9255();
                                        c6178.writeInt(sArrM9255.length);
                                        length = sArrM9255.length;
                                        i4 = 0;
                                        while (true) {
                                            str = str2;
                                            if (i4 < length) {
                                                c6178.mo17788(sArrM9255[i4]);
                                                i4++;
                                                str2 = str;
                                            }
                                        }
                                        break;
                                    case 12:
                                        if (string.equals("Ljava/lang/String;")) {
                                            i5 = 8;
                                        } else {
                                            i5 = 9;
                                        }
                                        c6178.writeByte(i5);
                                        c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                        str = str2;
                                        break;
                                    default:
                                        throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                                }
                                i7++;
                                abstractC13819 = this;
                                listMo6805 = list;
                                str2 = str;
                            }
                            break;
                        case 68:
                            if (strMo33725.equals("D")) {
                                b = 2;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt6 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt6]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt7 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt7]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM48759 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM48759.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 70:
                            if (strMo33725.equals("F")) {
                                b = 3;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt8 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt8]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt9 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt9]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487510 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487510.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 73:
                            if (strMo33725.equals(str2)) {
                                b = 4;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt10 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt10]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt11 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt11]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487511 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487511.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 74:
                            if (strMo33725.equals("J")) {
                                b = 5;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt12 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt12]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt13 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt13]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487512 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487512.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            if (strMo33725.equals("S")) {
                                b = 6;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt14 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt14]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt15 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt15]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487513 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487513.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 90:
                            if (strMo33725.equals("Z")) {
                                b = 7;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt16 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt16]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt17 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt17]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487514 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487514.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 2887:
                            if (strMo33725.equals("[B")) {
                                b = 8;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt18 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt18]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt19 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt19]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487515 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487515.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 2888:
                            if (strMo33725.equals("[C")) {
                                b = 9;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt110 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt110]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt111 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt111]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487516 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487516.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 2894:
                            if (strMo33725.equals("[I")) {
                                b = 10;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt112 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt112]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt113 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt113]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487517 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487517.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 2904:
                            if (strMo33725.equals("[S")) {
                                b = 11;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt114 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt114]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt115 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt115]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487518 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487518.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        case 1379658506:
                            if (strMo33725.equals("Ljava/lang/String;")) {
                                b = 12;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt116 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt116]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt117 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt117]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM487519 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM487519.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                        default:
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c6178.writeByte(0);
                                    c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c6178.writeByte(2);
                                    c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt118 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(6);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt118]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c6178.writeByte(5);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c6178.writeByte(3);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt119 = interfaceC6036M4698.nextInt();
                                    c6178.writeByte(4);
                                    c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c6178.writeInt(((Number) objArr[iNextInt119]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c6178.writeByte(1);
                                    c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c6178.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c6178.m17789(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c6178.writeByte(i2);
                                    c6178.m17806(((C14718) it2.next()).m35414());
                                    break;
                                case 9:
                                    str = str2;
                                    c6178.writeByte(13);
                                    char[] cArrM4875110 = ((C21432) it4.next()).m48757();
                                    c6178.writeInt(cArrM4875110.length);
                                    while (i3 < r1) {
                                        c6178.mo17801(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c6178.writeByte(14);
                                    c6178.m17807(((C18448) it5.next()).m42982());
                                    break;
                                case 11:
                                    c6178.writeByte(12);
                                    sArrM9255 = ((C2786) it3.next()).m9255();
                                    c6178.writeInt(sArrM9255.length);
                                    length = sArrM9255.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c6178.mo17788(sArrM9255[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c6178.writeByte(i5);
                                    c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                            }
                            i7++;
                            abstractC13819 = this;
                            listMo6805 = list;
                            str2 = str;
                            break;
                    }
                    str4 = str4;
                    switch (b) {
                        case 0:
                            str = str2;
                            c6178.writeByte(0);
                            c6178.writeInt(((Number) objArr[iNextInt]).byteValue());
                            break;
                        case 1:
                            str = str2;
                            c6178.writeByte(2);
                            c6178.mo17801((char) ((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 2:
                            str = str2;
                            int iNextInt1110 = interfaceC6036M4698.nextInt();
                            c6178.writeByte(6);
                            c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                            c6178.writeInt(((Number) objArr[iNextInt1110]).intValue());
                            break;
                        case 3:
                            str = str2;
                            c6178.writeByte(5);
                            c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 4:
                            str = str2;
                            c6178.writeByte(3);
                            c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 5:
                            str = str2;
                            int iNextInt1111 = interfaceC6036M4698.nextInt();
                            c6178.writeByte(4);
                            c6178.writeInt(((Number) objArr[iNextInt]).intValue());
                            c6178.writeInt(((Number) objArr[iNextInt1111]).intValue());
                            break;
                        case 6:
                            str = str2;
                            c6178.writeByte(1);
                            c6178.writeInt(((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 7:
                            str = str2;
                            c6178.writeByte(7);
                            if (((Number) objArr[iNextInt]).intValue() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c6178.m17789(z);
                            break;
                        case 8:
                            str = str2;
                            if (string.equals("[B")) {
                                i2 = 10;
                            } else {
                                i2 = 11;
                            }
                            c6178.writeByte(i2);
                            c6178.m17806(((C14718) it2.next()).m35414());
                            break;
                        case 9:
                            str = str2;
                            c6178.writeByte(13);
                            char[] cArrM4875111 = ((C21432) it4.next()).m48757();
                            c6178.writeInt(cArrM4875111.length);
                            while (i3 < r1) {
                                c6178.mo17801(c);
                            }
                            break;
                        case 10:
                            str = str2;
                            c6178.writeByte(14);
                            c6178.m17807(((C18448) it5.next()).m42982());
                            break;
                        case 11:
                            c6178.writeByte(12);
                            sArrM9255 = ((C2786) it3.next()).m9255();
                            c6178.writeInt(sArrM9255.length);
                            length = sArrM9255.length;
                            i4 = 0;
                            while (true) {
                                str = str2;
                                if (i4 < length) {
                                    c6178.mo17788(sArrM9255[i4]);
                                    i4++;
                                    str2 = str;
                                }
                            }
                            break;
                        case 12:
                            if (string.equals("Ljava/lang/String;")) {
                                i5 = 8;
                            } else {
                                i5 = 9;
                            }
                            c6178.writeByte(i5);
                            c6178.m17786((CharSequence) ((C8752) it.next()).m23446());
                            str = str2;
                            break;
                        default:
                            throw new RuntimeException("Unsupported type: ".concat(strMo33725));
                    }
                    i7++;
                    abstractC13819 = this;
                    listMo6805 = list;
                    str2 = str;
                }
                String strM36019 = c22420.f72608.m36019(c6178.m17796());
                if (strM36019 == null) {
                    C17359.toString(c5122);
                }
                return strM36019;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo12250(C12328 c12328, C16057 c16057, C1295 c1295, C9497 c9497) {
        if (c9497 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        c12328.f39606.m27115(c1295.m4699(), c16057);
        c9497.m24877(c12328);
        C8007 c8007 = this.f43810;
        if (c8007 != null) {
            c8007.m21869(c12328);
        }
        Iterator it = this.f43808.iterator();
        while (it.hasNext()) {
            ((C8752) it.next()).m23447(c12328);
        }
        Iterator it2 = this.f43807.iterator();
        while (it2.hasNext()) {
            ((C14718) it2.next()).m35412(c12328);
        }
        Iterator it3 = this.f43805.iterator();
        while (it3.hasNext()) {
            ((C2786) it3.next()).m9253(c12328);
        }
        Iterator it4 = this.f43812.iterator();
        while (it4.hasNext()) {
            ((C21432) it4.next()).m48755(c12328);
        }
        Iterator it5 = this.f43811.iterator();
        while (it5.hasNext()) {
            ((C18448) it5.next()).m42980(c12328);
        }
    }
}
