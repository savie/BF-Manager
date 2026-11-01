package l;

import com.google.android.material.slider.BaseSlider;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1X3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12006 extends AbstractC1421 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC14599 f40233;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f40234;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f40235;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f40236;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f40237;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f40238;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f40239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11071 f40240;

    /* JADX INFO: renamed from: ۙ */
    public String mo23640(int i, String str) {
        return str;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo8585(C5655 c5655);

    public AbstractC12006(C5655 c5655, InterfaceC8706 interfaceC8706) {
        super(c5655, interfaceC8706);
        this.f40233 = EnumC14599.STATIC;
        this.f40239 = true;
        this.f40237 = new ArrayList();
        this.f40238 = new ArrayList();
        this.f40235 = new ArrayList();
        this.f40234 = new ArrayList();
        this.f40236 = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ca A[PHI: r3
      0x02ca: PHI (r3v48 boolean) = (r3v7 boolean), (r3v52 boolean) binds: [B:109:0x02c8, B:106:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4984(InterfaceC3183 interfaceC3183) {
        int i;
        C10111 c10111;
        Iterator it;
        int i2;
        List list;
        C8485 c8485;
        boolean z;
        int i3;
        C19213 c19213;
        Iterator it2;
        InterfaceC8706 interfaceC8706;
        AbstractC12006 abstractC12006;
        C8485 c8486;
        Set set;
        C10111 c10112;
        C8485 c8487;
        AbstractC12006 abstractC12007;
        boolean z2;
        String strMo18934;
        Iterator it3;
        boolean z3;
        InterfaceC8706 interfaceC8707;
        InterfaceC4968 interfaceC4968;
        AbstractC12006 abstractC12008 = this;
        C5655 c5655 = abstractC12008.f5864;
        List listMo8585 = abstractC12008.mo8585(c5655);
        boolean z4 = false;
        if (listMo8585.isEmpty()) {
            return false;
        }
        C8485 c8488 = c5655.f19318;
        int size = c5655.f19322.values().size();
        Iterator it4 = c8488.f51692.m1292().values().iterator();
        int i4 = -1;
        boolean z5 = false;
        int i5 = 0;
        while (it4.hasNext()) {
            C19213 c19214 = (C19213) it4.next();
            i5++;
            int i6 = (i5 * 100) / size;
            InterfaceC8706 interfaceC8708 = abstractC12008.f5865;
            if (i6 != i4) {
                interfaceC8708.mo22533(i6);
                i4 = i6;
            }
            String type = c19214.getType();
            if (interfaceC3183.mo1619(type.substring(1, type.length() - 1).replace('/', '.'))) {
                Iterator it5 = c19214.getMethods().iterator();
                boolean z6 = false;
                while (it5.hasNext()) {
                    C10124 c10124 = (C10124) it5.next();
                    if (interfaceC8708.mo2357()) {
                        return z4;
                    }
                    InterfaceC7945 interfaceC7945Mo25747 = c10124.mo25747();
                    if (interfaceC7945Mo25747 == null) {
                        i = size;
                        c10111 = null;
                    } else {
                        i = size;
                        c10111 = interfaceC7945Mo25747 instanceof C10111 ? (C10111) interfaceC7945Mo25747 : new C10111(interfaceC7945Mo25747);
                    }
                    if (c10111 == null) {
                        list = listMo8585;
                        c8486 = c8488;
                        it = it4;
                        i2 = i4;
                        z = z5;
                        i3 = i5;
                        c19213 = c19214;
                        it2 = it5;
                        interfaceC8706 = interfaceC8708;
                        abstractC12006 = abstractC12008;
                    } else {
                        C20700 c20700 = new C20700(c19214, c10124, c10111);
                        it = it4;
                        i2 = i4;
                        C1897 c1897 = new C1897(listMo8585, abstractC12008.f40233);
                        C9660 c9660 = abstractC12008.f40239 ? new C9660() : null;
                        list = listMo8585;
                        List list2 = c20700.f67317;
                        if (c9660 != null) {
                            while (true) {
                                z = z5;
                                i3 = i5;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    if (!c1897.m6188(i7, list2) || c1897.m6190().equals(c10124)) {
                                        it3 = it5;
                                        interfaceC8707 = interfaceC8708;
                                        z3 = z6;
                                    } else {
                                        int i8 = i7 + 1;
                                        if (c9660.m24562(i8, list2)) {
                                            it3 = it5;
                                            AbstractCollection abstractCollection = (AbstractCollection) ((AbstractC3384) list2.get(i7)).m10035().m36037();
                                            if (!abstractCollection.isEmpty()) {
                                                AbstractC3384 abstractC3384 = (AbstractC3384) list2.get(i7);
                                                AbstractC3384 abstractC3385 = (AbstractC3384) list2.get(i8);
                                                interfaceC8707 = interfaceC8708;
                                                if (abstractC3384 instanceof InterfaceC13797) {
                                                    final InterfaceC13797 interfaceC13797 = (InterfaceC13797) abstractC3384;
                                                    c19214 = c19214;
                                                    interfaceC4968 = new InterfaceC4968() { // from class: l.ۙ᩺ۖ
                                                        @Override // l.InterfaceC4968
                                                        public final Object get() {
                                                            InterfaceC13797 interfaceC13798 = interfaceC13797;
                                                            return new C10256(interfaceC13798.mo5435(), interfaceC13798.mo2107(), interfaceC13798.mo3085(), interfaceC13798.mo3087(), interfaceC13798.mo3089(), interfaceC13798.mo3086(), interfaceC13798.mo3088(), interfaceC13798.getReference());
                                                        }
                                                    };
                                                } else {
                                                    c19214 = c19214;
                                                    if (abstractC3384 instanceof InterfaceC5329) {
                                                        final InterfaceC5329 interfaceC5329 = (InterfaceC5329) abstractC3384;
                                                        interfaceC4968 = new InterfaceC4968() { // from class: l.ܰ᩺ۖ
                                                            @Override // l.InterfaceC4968
                                                            public final Object get() {
                                                                InterfaceC5329 interfaceC53210 = interfaceC5329;
                                                                return new C15901(interfaceC53210.mo5435(), interfaceC53210.mo2109(), interfaceC53210.mo2107(), interfaceC53210.getReference());
                                                            }
                                                        };
                                                    }
                                                    c8488 = c8488;
                                                    z3 = z6;
                                                }
                                                if (abstractC3385 instanceof InterfaceC18797) {
                                                    InterfaceC18797 interfaceC18797 = (InterfaceC18797) abstractC3385;
                                                    z3 = z6;
                                                    HashSet hashSet = new HashSet();
                                                    for (AbstractC3384 abstractC3386 : (AbstractList) list2) {
                                                        C8485 c8489 = c8488;
                                                        if (abstractC3386 instanceof AbstractC4465) {
                                                            AbstractC4465 abstractC4465 = (AbstractC4465) abstractC3386;
                                                            if (abstractCollection.contains(abstractC4465.m12443())) {
                                                                hashSet.add(abstractC4465.m10035());
                                                            }
                                                        }
                                                        c8488 = c8489;
                                                    }
                                                    c8488 = c8488;
                                                    if (i7 > 0 && ((AbstractC3384) list2.get(i7 - 1)).mo5435().m26111()) {
                                                        hashSet.add(((AbstractC3384) list2.get(i7)).m10035());
                                                    }
                                                    if (hashSet.size() != 1) {
                                                        Iterator it6 = hashSet.iterator();
                                                        while (it6.hasNext()) {
                                                            int iM36038 = ((C15050) it6.next()).m36038();
                                                            c10111.m25731(iM36038, (AbstractC3384) interfaceC4968.get());
                                                            c10111.m25731(iM36038 + 1, new C1643(interfaceC18797.mo1140(), interfaceC18797.mo5435()));
                                                        }
                                                        c10111.m25737(abstractC3384.m10035().m36038());
                                                        c10111.m25737(abstractC3385.m10035().m36038());
                                                        i5 = i3;
                                                        z5 = z;
                                                        interfaceC8708 = interfaceC8707;
                                                        it5 = it3;
                                                        c19214 = c19214;
                                                        z6 = z3;
                                                        c8488 = c8488;
                                                    }
                                                } else {
                                                    c8488 = c8488;
                                                    z3 = z6;
                                                }
                                            }
                                        } else {
                                            it3 = it5;
                                        }
                                        interfaceC8707 = interfaceC8708;
                                        z3 = z6;
                                    }
                                    i7++;
                                    interfaceC8708 = interfaceC8707;
                                    it5 = it3;
                                    c19214 = c19214;
                                    z6 = z3;
                                    c8488 = c8488;
                                }
                            }
                            c8485 = c8488;
                        } else {
                            c8485 = c8488;
                            z = z5;
                            i3 = i5;
                        }
                        c19213 = c19214;
                        it2 = it5;
                        interfaceC8706 = interfaceC8708;
                        boolean z7 = z6;
                        boolean z8 = false;
                        boolean z9 = false;
                        int iM36039 = 0;
                        while (iM36039 < list2.size()) {
                            if (!c1897.m6188(iM36039, list2) || c1897.m6190().equals(c10124)) {
                                c8487 = c8485;
                            } else if (c9660 == null || c9660.m24562(iM36039 + 1, list2)) {
                                if (!z9) {
                                    try {
                                        String strMo9700 = c10124.mo9700();
                                        c5655.f19321.m39686(strMo9700.substring(1, strMo9700.length() - 1).replace('/', '.'), c10124.getName());
                                        z9 = true;
                                    } catch (Exception unused) {
                                        abstractC12007 = this;
                                        z2 = false;
                                        C22304.m49465((InterfaceC8858) c10124, false);
                                        strMo18934 = null;
                                        if (strMo18934 == null) {
                                            c8487 = c8485;
                                        } else {
                                            C22304.m49465(c10124, z2);
                                            c8487 = c8485;
                                            C19289 c19289 = new C19289(EnumC10297.f35313, abstractC12007.mo18933(c9660), c8487.m22164(strMo18934));
                                            abstractC12007.mo18935(c20700, c19289, c1897, c9660);
                                            iM36039 = c19289.m10035().m36038();
                                            z8 = true;
                                        }
                                        iM36039++;
                                        c8485 = c8487;
                                    }
                                }
                                abstractC12007 = this;
                                try {
                                    strMo18934 = abstractC12007.mo18934(c10124, c20700, c1897, iM36039);
                                    z2 = false;
                                } catch (Exception unused2) {
                                    z2 = false;
                                    C22304.m49465((InterfaceC8858) c10124, false);
                                    strMo18934 = null;
                                }
                                if (strMo18934 == null) {
                                    c8487 = c8485;
                                } else {
                                    C22304.m49465(c10124, z2);
                                    c8487 = c8485;
                                    C19289 c192810 = new C19289(EnumC10297.f35313, abstractC12007.mo18933(c9660), c8487.m22164(strMo18934));
                                    abstractC12007.mo18935(c20700, c192810, c1897, c9660);
                                    iM36039 = c192810.m10035().m36038();
                                    z8 = true;
                                }
                            } else {
                                C22304.m49465((InterfaceC8858) c10124, false);
                                c8487 = c8485;
                            }
                            iM36039++;
                            c8485 = c8487;
                        }
                        abstractC12006 = this;
                        c8486 = c8485;
                        if (z8) {
                            int i9 = 1;
                            while (true) {
                                int size2 = list2.size();
                                set = c20700.f67314;
                                c10112 = c20700.f67315;
                                if (i9 >= size2) {
                                    break;
                                }
                                AbstractC3384 abstractC3387 = (AbstractC3384) list2.get(i9);
                                if (!C16467.m38736(abstractC3387, set)) {
                                    if (C16467.m38737(abstractC3387)) {
                                        AbstractC3384 abstractC3388 = (AbstractC3384) list2.get(i9 - 1);
                                        if (C16467.m38737(abstractC3388) && ((InterfaceC4685) abstractC3387).mo1140() == ((InterfaceC1157) abstractC3388).mo1144() && ((InterfaceC1157) abstractC3387).mo1144() == ((InterfaceC4685) abstractC3388).mo1140()) {
                                            c10112.m25737(i9);
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
                                AbstractC3384 abstractC3389 = (AbstractC3384) list2.get(size3);
                                if (C16467.m38737(abstractC3389) && !C16467.m38739(c20700, ((InterfaceC4685) abstractC3389).mo1140(), size3 + 1)) {
                                    c10112.m25737(size3);
                                }
                            }
                            int size4 = list2.size();
                            while (true) {
                                size4--;
                                if (size4 < 0) {
                                    break;
                                }
                                InterfaceC1594 interfaceC1594 = (AbstractC3384) list2.get(size4);
                                if ((interfaceC1594.mo5435() != EnumC10297.f35314 ? false : ((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType().equals("[B")) && !C16467.m38739(c20700, ((InterfaceC4685) interfaceC1594).mo1140(), size4 + 1)) {
                                    c10112.m25737(size4);
                                }
                            }
                            int i10 = 1;
                            while (i10 < list2.size()) {
                                AbstractC3384 abstractC33810 = (AbstractC3384) list2.get(i10);
                                if (!C16467.m38736(abstractC33810, set)) {
                                    if (C16467.m38738(abstractC33810)) {
                                        AbstractC3384 abstractC33811 = (AbstractC3384) list2.get(i10 - 1);
                                        if (C16467.m38738(abstractC33811) && ((InterfaceC4685) abstractC33810).mo1140() == ((InterfaceC1157) abstractC33811).mo1144() && ((InterfaceC1157) abstractC33810).mo1144() == ((InterfaceC4685) abstractC33811).mo1140()) {
                                            c10112.m25737(i10);
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
                                AbstractC3384 abstractC33812 = (AbstractC3384) list2.get(size5);
                                if (C16467.m38738(abstractC33812) && !C16467.m38739(c20700, ((InterfaceC4685) abstractC33812).mo1140(), size5 + 1)) {
                                    c10112.m25737(size5);
                                }
                            }
                            int size6 = list2.size();
                            while (true) {
                                size6--;
                                if (size6 < 0) {
                                    break;
                                }
                                InterfaceC1594 interfaceC1595 = (AbstractC3384) list2.get(size6);
                                EnumC10297 enumC10297Mo5435 = interfaceC1595.mo5435();
                                if (enumC10297Mo5435 != EnumC10297.f35078 && enumC10297Mo5435 != EnumC10297.f35305 && enumC10297Mo5435 != EnumC10297.f35110 && enumC10297Mo5435 != EnumC10297.f35200) {
                                    EnumC10297 enumC10297Mo5436 = interfaceC1595.mo5435();
                                    if (enumC10297Mo5436 == EnumC10297.f35313 || enumC10297Mo5436 == EnumC10297.f35225) {
                                    }
                                }
                                if (!C16467.m38739(c20700, ((InterfaceC4685) interfaceC1595).mo1140(), size6 + 1)) {
                                    c10112.m25737(size6);
                                }
                            }
                            int i11 = 0;
                            while (i11 < list2.size()) {
                                AbstractC3384 abstractC33813 = (AbstractC3384) list2.get(i11);
                                if (abstractC33813.mo5435() == EnumC10297.f35114 && ((AbstractCollection) abstractC33813.m10035().m36037()).isEmpty()) {
                                    c10112.m25737(i11);
                                    i11--;
                                }
                                i11++;
                            }
                            int size7 = list2.size();
                            while (true) {
                                size7--;
                                if (size7 < 0 || ((AbstractC3384) list2.get(size7)).mo5435() != EnumC10297.f35298) {
                                    break;
                                }
                                c10112.m25737(size7);
                            }
                            c10124.m25748(c10111);
                            z6 = true;
                        } else {
                            z6 = z7;
                        }
                    }
                    z4 = false;
                    abstractC12008 = abstractC12006;
                    c8488 = c8486;
                    size = i;
                    it4 = it;
                    i4 = i2;
                    listMo8585 = list;
                    i5 = i3;
                    z5 = z;
                    interfaceC8708 = interfaceC8706;
                    it5 = it2;
                    c19214 = c19213;
                }
                List list3 = listMo8585;
                C8485 c84810 = c8488;
                int i12 = size;
                Iterator it7 = it4;
                int i13 = i4;
                boolean z10 = z5;
                int i14 = i5;
                C19213 c19215 = c19214;
                AbstractC12006 abstractC12009 = abstractC12008;
                if (z6) {
                    c5655.f19319.add(c19215.getType());
                    z5 = true;
                } else {
                    z5 = z10;
                }
                z4 = false;
                abstractC12008 = abstractC12009;
                c8488 = c84810;
                size = i12;
                it4 = it7;
                i4 = i13;
                listMo8585 = list3;
                i5 = i14;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo18933(C9660 c9660) {
        if (c9660 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        return c9660.m24560();
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
    public String mo18934(C10124 c10124, C20700 c20700, C1897 c1897, int i) throws C12711 {
        byte b;
        String str;
        boolean z;
        int i2;
        int i3;
        short[] sArrM9813;
        int length;
        int i4;
        int i5;
        C15070 c15070;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractC12006 abstractC12006 = this;
        abstractC12006.f40240 = null;
        ArrayList arrayList5 = abstractC12006.f40237;
        arrayList5.clear();
        ArrayList arrayList6 = abstractC12006.f40238;
        arrayList6.clear();
        ArrayList arrayList7 = abstractC12006.f40235;
        arrayList7.clear();
        ArrayList arrayList8 = abstractC12006.f40234;
        arrayList8.clear();
        ArrayList arrayList9 = abstractC12006.f40236;
        arrayList9.clear();
        InterfaceC8858 interfaceC8858M6190 = c1897.m6190();
        List listMo9699 = interfaceC8858M6190.mo9699();
        C15070 c15071 = new C15070();
        InterfaceC13431 interfaceC13431M6192 = c1897.m6192();
        int i6 = 0;
        while (true) {
            int size = listMo9699.size();
            String str2 = "I";
            InterfaceC8858 interfaceC8858 = interfaceC8858M6190;
            C15070 c15072 = c15071;
            ArrayList arrayList10 = arrayList6;
            String str3 = "C";
            ArrayList arrayList11 = arrayList8;
            String str4 = "B";
            ArrayList arrayList12 = arrayList9;
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = arrayList5;
            C5655 c5655 = abstractC12006.f5864;
            if (i6 < size) {
                String strMo23640 = abstractC12006.mo23640(i6, ((CharSequence) listMo9699.get(i6)).toString());
                strMo23640.getClass();
                switch (strMo23640) {
                    case "B":
                    case "C":
                    case "F":
                    case "I":
                    case "S":
                    case "Z":
                        c15070 = c15072;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15070.add(interfaceC13431M6192.nextInt());
                        break;
                    case "D":
                    case "J":
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15070 = c15072;
                        c15070.add(interfaceC13431M6192.nextInt());
                        c15070.add(interfaceC13431M6192.nextInt());
                        break;
                    case "[B":
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C16715 c16715 = new C16715(c5655);
                        if (!c16715.m39203(c20700, i, interfaceC13431M6192.nextInt())) {
                            C13638.toString(c10124);
                            return null;
                        }
                        arrayList = arrayList10;
                        arrayList.add(c16715);
                        c15070 = c15072;
                        break;
                        break;
                    case "[C":
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C12482 c12482 = new C12482(c5655);
                        if (!c12482.m30984(c20700, i, interfaceC13431M6192.nextInt())) {
                            C13638.toString(c10124);
                            return null;
                        }
                        arrayList2 = arrayList11;
                        arrayList2.add(c12482);
                        c15070 = c15072;
                        arrayList = arrayList10;
                        break;
                        break;
                    case "[I":
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C17420 c17420 = new C17420(c5655);
                        if (!c17420.m40618(c20700, i, interfaceC13431M6192.nextInt())) {
                            C13638.toString(c10124);
                            return null;
                        }
                        arrayList9 = arrayList12;
                        arrayList9.add(c17420);
                        c15070 = c15072;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        break;
                        break;
                    case "[S":
                        arrayList4 = arrayList14;
                        C3308 c3308 = new C3308(c5655);
                        if (!c3308.m9812(c20700, i, interfaceC13431M6192.nextInt())) {
                            C13638.toString(c10124);
                            return null;
                        }
                        arrayList3 = arrayList13;
                        arrayList3.add(c3308);
                        c15070 = c15072;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        break;
                        break;
                    case "Ljava/lang/String;":
                        C4907 c4907 = new C4907(c5655);
                        if (!c4907.m13642(c20700, i, interfaceC13431M6192.nextInt())) {
                            C13638.toString(c10124);
                            return null;
                        }
                        arrayList4 = arrayList14;
                        arrayList4.add(c4907);
                        c15070 = c15072;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        break;
                        break;
                    default:
                        throw new RuntimeException("Unsupported parameter type: ".concat(strMo23640));
                }
                i6++;
                c15071 = c15070;
                arrayList6 = arrayList;
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList8 = arrayList2;
                interfaceC8858M6190 = interfaceC8858;
            } else {
                if (!c15072.isEmpty()) {
                    C11071 c11071 = new C11071();
                    abstractC12006.f40240 = c11071;
                    if (!c11071.m27919(c20700, i, c15072.mo3181())) {
                        C13638.toString(c10124);
                        return null;
                    }
                }
                C11071 c11072 = abstractC12006.f40240;
                Object[] objArrM27920 = c11072 == null ? new Object[0] : c11072.m27920(c5655);
                String strM4982 = AbstractC1421.m4982(interfaceC8858.mo9700());
                String name = interfaceC8858.getName();
                C11018 c11018 = new C11018();
                c11018.m27782((CharSequence) strM4982);
                c11018.m27782((CharSequence) name);
                c11018.writeByte(listMo9699.size());
                InterfaceC13431 interfaceC13431M6193 = c1897.m6192();
                Iterator it = arrayList14.iterator();
                Iterator it2 = arrayList10.iterator();
                Iterator it3 = arrayList13.iterator();
                Iterator it4 = arrayList11.iterator();
                Iterator it5 = arrayList12.iterator();
                Object[] objArr = objArrM27920;
                int i7 = 0;
                while (i7 < listMo9699.size()) {
                    String string = ((CharSequence) listMo9699.get(i7)).toString();
                    List list = listMo9699;
                    String strMo23641 = abstractC12006.mo23640(i7, string);
                    int iNextInt = interfaceC13431M6193.nextInt();
                    strMo23641.getClass();
                    switch (strMo23641.hashCode()) {
                        case 66:
                            str4 = str4;
                            b = !strMo23641.equals(str4) ? (byte) -1 : (byte) 0;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt2 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt2]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt3 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt3]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM30985 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM30985.length);
                                    for (char c : cArrM30985) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 67:
                            String str5 = str3;
                            if (strMo23641.equals(str5)) {
                                b = 1;
                                str3 = str5;
                            } else {
                                str3 = str5;
                                str4 = str4;
                                switch (b) {
                                    case 0:
                                        str = str2;
                                        c11018.writeByte(0);
                                        c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                        break;
                                    case 1:
                                        str = str2;
                                        c11018.writeByte(2);
                                        c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 2:
                                        str = str2;
                                        int iNextInt4 = interfaceC13431M6193.nextInt();
                                        c11018.writeByte(6);
                                        c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c11018.writeInt(((Number) objArr[iNextInt4]).intValue());
                                        break;
                                    case 3:
                                        str = str2;
                                        c11018.writeByte(5);
                                        c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 4:
                                        str = str2;
                                        c11018.writeByte(3);
                                        c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 5:
                                        str = str2;
                                        int iNextInt5 = interfaceC13431M6193.nextInt();
                                        c11018.writeByte(4);
                                        c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c11018.writeInt(((Number) objArr[iNextInt5]).intValue());
                                        break;
                                    case 6:
                                        str = str2;
                                        c11018.writeByte(1);
                                        c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 7:
                                        str = str2;
                                        c11018.writeByte(7);
                                        if (((Number) objArr[iNextInt]).intValue() != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c11018.m27784(z);
                                        break;
                                    case 8:
                                        str = str2;
                                        if (string.equals("[B")) {
                                            i2 = 10;
                                        } else {
                                            i2 = 11;
                                        }
                                        c11018.writeByte(i2);
                                        c11018.m27794(((C16715) it2.next()).m39204());
                                        break;
                                    case 9:
                                        str = str2;
                                        c11018.writeByte(13);
                                        char[] cArrM30986 = ((C12482) it4.next()).m30985();
                                        c11018.writeInt(cArrM30986.length);
                                        while (i3 < r1) {
                                            c11018.mo24501(c);
                                        }
                                        break;
                                    case 10:
                                        str = str2;
                                        c11018.writeByte(14);
                                        c11018.m27795(((C17420) it5.next()).m40619());
                                        break;
                                    case 11:
                                        c11018.writeByte(12);
                                        sArrM9813 = ((C3308) it3.next()).m9813();
                                        c11018.writeInt(sArrM9813.length);
                                        length = sArrM9813.length;
                                        i4 = 0;
                                        while (true) {
                                            str = str2;
                                            if (i4 < length) {
                                                c11018.mo24505(sArrM9813[i4]);
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
                                        c11018.writeByte(i5);
                                        c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                        str = str2;
                                        break;
                                    default:
                                        throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                                }
                                i7++;
                                abstractC12006 = this;
                                listMo9699 = list;
                                str2 = str;
                            }
                            break;
                        case 68:
                            if (strMo23641.equals("D")) {
                                b = 2;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt6 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt6]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt7 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt7]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM30987 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM30987.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 70:
                            if (strMo23641.equals("F")) {
                                b = 3;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt8 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt8]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt9 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt9]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM30988 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM30988.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 73:
                            if (strMo23641.equals(str2)) {
                                b = 4;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt10 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt10]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt11 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt11]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM30989 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM30989.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 74:
                            if (strMo23641.equals("J")) {
                                b = 5;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt12 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt12]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt13 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt13]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309810 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309810.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            if (strMo23641.equals("S")) {
                                b = 6;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt14 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt14]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt15 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt15]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309811 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309811.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 90:
                            if (strMo23641.equals("Z")) {
                                b = 7;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt16 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt16]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt17 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt17]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309812 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309812.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 2887:
                            if (strMo23641.equals("[B")) {
                                b = 8;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt18 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt18]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt19 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt19]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309813 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309813.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 2888:
                            if (strMo23641.equals("[C")) {
                                b = 9;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt110 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt110]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt111 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt111]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309814 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309814.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 2894:
                            if (strMo23641.equals("[I")) {
                                b = 10;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt112 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt112]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt113 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt113]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309815 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309815.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 2904:
                            if (strMo23641.equals("[S")) {
                                b = 11;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt114 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt114]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt115 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt115]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309816 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309816.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        case 1379658506:
                            if (strMo23641.equals("Ljava/lang/String;")) {
                                b = 12;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt116 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt116]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt117 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt117]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309817 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309817.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                        default:
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11018.writeByte(0);
                                    c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11018.writeByte(2);
                                    c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt118 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(6);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt118]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11018.writeByte(5);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11018.writeByte(3);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt119 = interfaceC13431M6193.nextInt();
                                    c11018.writeByte(4);
                                    c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11018.writeInt(((Number) objArr[iNextInt119]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11018.writeByte(1);
                                    c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11018.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11018.m27784(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11018.writeByte(i2);
                                    c11018.m27794(((C16715) it2.next()).m39204());
                                    break;
                                case 9:
                                    str = str2;
                                    c11018.writeByte(13);
                                    char[] cArrM309818 = ((C12482) it4.next()).m30985();
                                    c11018.writeInt(cArrM309818.length);
                                    while (i3 < r1) {
                                        c11018.mo24501(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11018.writeByte(14);
                                    c11018.m27795(((C17420) it5.next()).m40619());
                                    break;
                                case 11:
                                    c11018.writeByte(12);
                                    sArrM9813 = ((C3308) it3.next()).m9813();
                                    c11018.writeInt(sArrM9813.length);
                                    length = sArrM9813.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11018.mo24505(sArrM9813[i4]);
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
                                    c11018.writeByte(i5);
                                    c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                            }
                            i7++;
                            abstractC12006 = this;
                            listMo9699 = list;
                            str2 = str;
                            break;
                    }
                    str4 = str4;
                    switch (b) {
                        case 0:
                            str = str2;
                            c11018.writeByte(0);
                            c11018.writeInt(((Number) objArr[iNextInt]).byteValue());
                            break;
                        case 1:
                            str = str2;
                            c11018.writeByte(2);
                            c11018.mo24501((char) ((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 2:
                            str = str2;
                            int iNextInt1110 = interfaceC13431M6193.nextInt();
                            c11018.writeByte(6);
                            c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                            c11018.writeInt(((Number) objArr[iNextInt1110]).intValue());
                            break;
                        case 3:
                            str = str2;
                            c11018.writeByte(5);
                            c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 4:
                            str = str2;
                            c11018.writeByte(3);
                            c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 5:
                            str = str2;
                            int iNextInt1111 = interfaceC13431M6193.nextInt();
                            c11018.writeByte(4);
                            c11018.writeInt(((Number) objArr[iNextInt]).intValue());
                            c11018.writeInt(((Number) objArr[iNextInt1111]).intValue());
                            break;
                        case 6:
                            str = str2;
                            c11018.writeByte(1);
                            c11018.writeInt(((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 7:
                            str = str2;
                            c11018.writeByte(7);
                            if (((Number) objArr[iNextInt]).intValue() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c11018.m27784(z);
                            break;
                        case 8:
                            str = str2;
                            if (string.equals("[B")) {
                                i2 = 10;
                            } else {
                                i2 = 11;
                            }
                            c11018.writeByte(i2);
                            c11018.m27794(((C16715) it2.next()).m39204());
                            break;
                        case 9:
                            str = str2;
                            c11018.writeByte(13);
                            char[] cArrM309819 = ((C12482) it4.next()).m30985();
                            c11018.writeInt(cArrM309819.length);
                            while (i3 < r1) {
                                c11018.mo24501(c);
                            }
                            break;
                        case 10:
                            str = str2;
                            c11018.writeByte(14);
                            c11018.m27795(((C17420) it5.next()).m40619());
                            break;
                        case 11:
                            c11018.writeByte(12);
                            sArrM9813 = ((C3308) it3.next()).m9813();
                            c11018.writeInt(sArrM9813.length);
                            length = sArrM9813.length;
                            i4 = 0;
                            while (true) {
                                str = str2;
                                if (i4 < length) {
                                    c11018.mo24505(sArrM9813[i4]);
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
                            c11018.writeByte(i5);
                            c11018.m27782((CharSequence) ((C4907) it.next()).m13640());
                            str = str2;
                            break;
                        default:
                            throw new RuntimeException("Unsupported type: ".concat(strMo23641));
                    }
                    i7++;
                    abstractC12006 = this;
                    listMo9699 = list;
                    str2 = str;
                }
                String strM39690 = c5655.f19321.m39690(c11018.m27773());
                if (strM39690 == null) {
                    C13638.toString(c10124);
                }
                return strM39690;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18935(C20700 c20700, C19289 c19289, C1897 c1897, C9660 c9660) {
        if (c9660 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        c20700.f67315.m25738(c1897.m6191(), c19289);
        c9660.m24561(c20700);
        C11071 c11071 = this.f40240;
        if (c11071 != null) {
            c11071.m27918(c20700);
        }
        Iterator it = this.f40237.iterator();
        while (it.hasNext()) {
            ((C4907) it.next()).m13641(c20700);
        }
        Iterator it2 = this.f40238.iterator();
        while (it2.hasNext()) {
            ((C16715) it2.next()).m39202(c20700);
        }
        Iterator it3 = this.f40235.iterator();
        while (it3.hasNext()) {
            ((C3308) it3.next()).m9811(c20700);
        }
        Iterator it4 = this.f40234.iterator();
        while (it4.hasNext()) {
            ((C12482) it4.next()).m30983(c20700);
        }
        Iterator it5 = this.f40236.iterator();
        while (it5.hasNext()) {
            ((C17420) it5.next()).m40617(c20700);
        }
    }
}
