package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10111 implements InterfaceC7945 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34517;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34518;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34519;

    public C10111(InterfaceC7945 interfaceC7945) {
        AbstractC2348 c17166;
        this.f34519 = C3051.m9146(new C15050(null, 0, 0));
        this.f34516 = new ArrayList();
        this.f34517 = true;
        this.f34518 = interfaceC7945.mo11507();
        Iterator it = interfaceC7945.mo11508().iterator();
        int iMo5436 = 0;
        int i = 0;
        while (it.hasNext()) {
            iMo5436 += ((InterfaceC1594) it.next()).mo5436();
            i++;
            this.f34519.add(new C15050(null, iMo5436, i));
        }
        int[] iArr = new int[iMo5436 + 1];
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < this.f34519.size(); i2++) {
            iArr[((C15050) this.f34519.get(i2)).f49052] = i2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (InterfaceC1594 interfaceC1594 : interfaceC7945.mo11508()) {
            C15050 c15050 = (C15050) this.f34519.get(i3);
            EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
            if (enumC10297Mo5435 == EnumC10297.f35054 || enumC10297Mo5435 == EnumC10297.f35081) {
                arrayList.add(new C21399(this, c15050, iArr, interfaceC1594));
            } else {
                m25724(c15050, iArr, interfaceC1594);
            }
            i3++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC8700) it2.next()).perform();
        }
        for (InterfaceC7239 interfaceC7239 : interfaceC7945.mo11510()) {
            C15050 c15051 = (C15050) this.f34519.get(m25721(interfaceC7239.mo17670(), iArr));
            switch (interfaceC7239.mo1599()) {
                case 3:
                    InterfaceC12179 interfaceC12179 = (InterfaceC12179) interfaceC7239;
                    c17166 = new C17166(interfaceC12179.mo9024(), interfaceC12179.mo9023(), interfaceC12179.mo9026(), interfaceC12179.mo9025());
                    break;
                case 4:
                default:
                    throw new C20749(null, "Invalid debug item type: " + interfaceC7239.mo1599(), new Object[0]);
                case 5:
                    c17166 = new C20694(((InterfaceC20645) interfaceC7239).mo5491());
                    break;
                case 6:
                    c17166 = new C16461(((InterfaceC0183) interfaceC7239).mo1385());
                    break;
                case 7:
                    c17166 = new C0232();
                    break;
                case 8:
                    c17166 = new C15756();
                    break;
                case 9:
                    c17166 = new C12228(((InterfaceC16412) interfaceC7239).mo20790());
                    break;
                case 10:
                    c17166 = new C19989(((InterfaceC15707) interfaceC7239).getLineNumber());
                    break;
            }
            ((C12933) c15051.m36039()).add(c17166);
            c17166.f8288 = c15051;
        }
        for (InterfaceC8651 interfaceC8651 : interfaceC7945.mo11511()) {
            C5171 c5171M25726 = m25726(interfaceC8651.mo18941(), iArr);
            C5171 c5171M25727 = m25726(interfaceC8651.mo18942() + interfaceC8651.mo18941(), iArr);
            for (InterfaceC21350 interfaceC21350 : interfaceC8651.mo18943()) {
                this.f34516.add(new C11522(c5171M25726, c5171M25727, interfaceC21350.mo32743(), m25726(interfaceC21350.mo6346(), iArr)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m25727() {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList<C15050> arrayList = this.f34519;
        for (C15050 c15050 : arrayList) {
            AbstractC3384 abstractC3384 = c15050.f49051;
            if (abstractC3384 != null) {
                EnumC10297 enumC10297 = abstractC3384.f12506;
                int i = C7994.f26231[enumC10297.ordinal()];
                if (i == 1 || i == 2) {
                    C15050 c15050M14324 = ((AbstractC4465) abstractC3384).f15876.m14324();
                    AbstractC3384 abstractC3385 = c15050M14324.f49051;
                    if (abstractC3385 == null) {
                        throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d points to the end of the method.", Integer.valueOf(c15050.f49052), Integer.valueOf(c15050.f49054)));
                    }
                    if (abstractC3385.f12506 == EnumC10297.f35298) {
                        int i2 = c15050M14324.f49054 + 1;
                        while (true) {
                            if (i2 >= arrayList.size() - 1) {
                                abstractC3385 = null;
                                break;
                            }
                            AbstractC3384 abstractC3386 = ((C15050) arrayList.get(i2)).f49051;
                            if (abstractC3386.f12506 != EnumC10297.f35298) {
                                abstractC3385 = abstractC3386;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (abstractC3385 != null) {
                        EnumC10297 enumC10298 = abstractC3385.f12506;
                        if (abstractC3385 instanceof AbstractC13639) {
                            if ((enumC10297 == EnumC10297.f35282 && enumC10298 != EnumC10297.f35054) || (enumC10297 == EnumC10297.f35153 && enumC10298 != EnumC10297.f35081)) {
                                throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d refers to the wrong type of payload instruction.", Integer.valueOf(c15050.f49052), Integer.valueOf(c15050.f49054)));
                            }
                            if (!hashSet.add(c15050M14324)) {
                                throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                            }
                            ((AbstractC13639) abstractC3385).f44992 = c15050;
                        }
                    }
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d does not refer to a payload instruction.", Integer.valueOf(c15050.f49052), Integer.valueOf(c15050.f49054)));
                }
            }
        }
        do {
            int i3 = 0;
            z = false;
            while (i3 < arrayList.size()) {
                C15050 c15051 = (C15050) arrayList.get(i3);
                AbstractC3384 abstractC3387 = c15051.f49051;
                if (abstractC3387 != null) {
                    int i4 = C7994.f26231[abstractC3387.f12506.ordinal()];
                    if (i4 == 3) {
                        AbstractC4465 abstractC4465 = (AbstractC4465) abstractC3387;
                        C5171 c5171 = abstractC4465.f15876;
                        int i5 = c5171.m14324().f49052 - abstractC4465.m10035().f49052;
                        if (i5 < -128 || i5 > 127) {
                            m25738(c15051.f49054, (i5 < -32768 || i5 > 32767) ? new C18016(EnumC10297.f35303, c5171) : new C4610(EnumC10297.f35108, c5171));
                            z = true;
                        }
                    } else if (i4 != 4) {
                        if (i4 == 5 || i4 == 6) {
                            if (((AbstractC13639) abstractC3387).f44992 == null) {
                                m25737(i3);
                            }
                            i3--;
                            z = true;
                        } else if (i4 != 7) {
                        }
                        if ((c15051.f49052 & 1) != 0) {
                            int i6 = c15051.f49054 - 1;
                            EnumC10297 enumC10299 = ((C15050) arrayList.get(i6)).f49051.f12506;
                            EnumC10297 enumC102910 = EnumC10297.f35298;
                            if (enumC10299 == enumC102910) {
                                m25737(i6);
                                i3--;
                            } else {
                                m25731(c15051.f49054, new C23517(enumC102910));
                                i3++;
                            }
                            z = true;
                        }
                    } else {
                        AbstractC4465 abstractC4466 = (AbstractC4465) abstractC3387;
                        C5171 c5172 = abstractC4466.f15876;
                        int i7 = c5172.m14324().f49052 - abstractC4466.m10035().f49052;
                        if (i7 < -32768 || i7 > 32767) {
                            m25738(c15051.f49054, new C18016(EnumC10297.f35303, c5172));
                            z = true;
                        }
                    }
                }
                i3++;
            }
        } while (z);
        this.f34517 = false;
    }

    public C10111(int i) {
        this.f34519 = C3051.m9146(new C15050(null, 0, 0));
        this.f34516 = new ArrayList();
        this.f34517 = true;
        this.f34518 = i;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ֨ */
    public final int mo11507() {
        return this.f34518;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25736(int i) {
        this.f34518 = i;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۘ */
    public final List mo11508() {
        if (this.f34517) {
            m25727();
        }
        return new C17871(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25732(int i, AbstractC23847 abstractC23847) {
        if (this.f34517) {
            m25727();
        }
        ((C12933) ((C15050) this.f34519.get(i)).m36039()).add(abstractC23847);
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۬ */
    public final List mo11511() {
        if (this.f34517) {
            m25727();
        }
        return C0561.unmodifiableList(this.f34516);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m25729() {
        if (this.f34517) {
            m25727();
        }
        return this.f34516;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۜ */
    public final Iterable mo11510() {
        if (this.f34517) {
            m25727();
        }
        return C22808.m50464(C22808.m50466(this.f34519, new C18577(this)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25733(C1428 c1428, C5171 c5171, C5171 c5172, C5171 c5173) {
        this.f34516.add(new C11522(c5171, c5172, c1428, c5173));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25735(C5171 c5171, C5171 c5172, C5171 c5173) {
        this.f34516.add(new C11522(c5171, c5172, c5173));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25731(int i, AbstractC3384 abstractC3384) {
        ArrayList arrayList = this.f34519;
        if (i >= arrayList.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != arrayList.size() - 1) {
            int i2 = ((C15050) arrayList.get(i)).f49052;
            C15050 c15050 = new C15050(abstractC3384, i2, i);
            arrayList.add(i, c15050);
            abstractC3384.f12505 = c15050;
            int iMo5436 = abstractC3384.mo5436() + i2;
            for (int i3 = i + 1; i3 < arrayList.size(); i3++) {
                C15050 c15051 = (C15050) arrayList.get(i3);
                c15051.f49054++;
                c15051.f49052 = iMo5436;
                AbstractC3384 abstractC3385 = c15051.f49051;
                if (abstractC3385 != null) {
                    iMo5436 = abstractC3385.mo5436() + iMo5436;
                }
            }
            this.f34517 = true;
            return;
        }
        m25734(abstractC3384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25734(AbstractC3384 abstractC3384) {
        ArrayList arrayList = this.f34519;
        C15050 c15050 = (C15050) C19084.m43861(arrayList, 1);
        c15050.f49051 = abstractC3384;
        abstractC3384.f12505 = c15050;
        arrayList.add(new C15050(null, abstractC3384.mo5436() + c15050.f49052, arrayList.size()));
        this.f34517 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25738(int i, AbstractC3384 abstractC3384) {
        ArrayList arrayList = this.f34519;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C15050 c15050 = (C15050) arrayList.get(i);
        abstractC3384.f12505 = c15050;
        c15050.f49051.f12505 = null;
        c15050.f49051 = abstractC3384;
        int iMo5436 = abstractC3384.mo5436() + c15050.f49052;
        for (int i2 = i + 1; i2 < arrayList.size(); i2++) {
            C15050 c15051 = (C15050) arrayList.get(i2);
            c15051.f49052 = iMo5436;
            AbstractC3384 abstractC3385 = c15051.f49051;
            if (abstractC3385 != null) {
                iMo5436 = abstractC3385.mo5436() + iMo5436;
            }
        }
        this.f34517 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25739(AbstractC3384 abstractC3384) {
        if (abstractC3384.m10035().f49051 == abstractC3384) {
            m25737(abstractC3384.m10035().f49054);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25737(int i) {
        ArrayList arrayList = this.f34519;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C15050 c15050 = (C15050) arrayList.get(i);
        c15050.f49051 = null;
        c15050.m36035((C15050) arrayList.get(i + 1));
        arrayList.remove(i);
        int iMo5436 = c15050.f49052;
        while (i < arrayList.size()) {
            C15050 c15051 = (C15050) arrayList.get(i);
            c15051.f49054 = i;
            c15051.f49052 = iMo5436;
            AbstractC3384 abstractC3384 = c15051.f49051;
            if (abstractC3384 != null) {
                iMo5436 = abstractC3384.mo5436() + iMo5436;
            }
            i++;
        }
        this.f34517 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25721(int i, int[] iArr) {
        while (true) {
            if (i >= iArr.length) {
                i = iArr.length - 1;
            }
            int i2 = iArr[i];
            if (i2 >= 0) {
                return i2;
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5171 m25730(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f34519;
            if (i < arrayList.size()) {
                C15050 c15050 = (C15050) arrayList.get(i);
                c15050.getClass();
                C5171 c5171 = new C5171();
                ((C12933) c15050.m36037()).add(c5171);
                return c5171;
            }
        }
        throw new IndexOutOfBoundsException(String.format("instruction index %d out of bounds", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C5171 m25726(int i, int[] iArr) {
        C15050 c15050 = (C15050) this.f34519.get(m25721(i, iArr));
        c15050.getClass();
        C5171 c5171 = new C5171();
        ((C12933) c15050.m36037()).add(c5171);
        return c5171;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25724(C15050 c15050, int[] iArr, InterfaceC1594 interfaceC1594) {
        C5171 c5171M25726;
        C6022 c6022;
        C23662 c23662;
        switch (C7994.f26230[interfaceC1594.mo5435().f35328.ordinal()]) {
            case 1:
                InterfaceC15270 interfaceC15270 = (InterfaceC15270) interfaceC1594;
                C10817 c10817 = new C10817(interfaceC15270.mo5435(), m25726(interfaceC15270.mo8965() + c15050.f49052, iArr));
                c15050.f49051 = c10817;
                c10817.f12505 = c15050;
                return;
            case 2:
                C23517 c23517 = new C23517(((InterfaceC21619) interfaceC1594).mo5435());
                c15050.f49051 = c23517;
                c23517.f12505 = c15050;
                return;
            case 3:
                InterfaceC18091 interfaceC18091 = (InterfaceC18091) interfaceC1594;
                C14345 c14345 = new C14345(interfaceC18091.mo5435(), interfaceC18091.mo1140(), interfaceC18091.mo4063());
                c15050.f49051 = c14345;
                c14345.f12505 = c15050;
                return;
            case 4:
                InterfaceC18797 interfaceC18797 = (InterfaceC18797) interfaceC1594;
                C1643 c1643 = new C1643(interfaceC18797.mo1140(), interfaceC18797.mo5435());
                c15050.f49051 = c1643;
                c1643.f12505 = c15050;
                return;
            case 5:
                InterfaceC8214 interfaceC8214 = (InterfaceC8214) interfaceC1594;
                C9406 c9406 = new C9406(interfaceC8214.mo5435(), interfaceC8214.mo1140(), interfaceC8214.mo1144());
                c15050.f49051 = c9406;
                c9406.f12505 = c15050;
                return;
            case 6:
                InterfaceC19503 interfaceC19503 = (InterfaceC19503) interfaceC1594;
                C3054 c3054 = new C3054(interfaceC19503.mo5435(), interfaceC19503.mo9148(), interfaceC19503.getReference());
                c15050.f49051 = c3054;
                c3054.f12505 = c15050;
                return;
            case 7:
                InterfaceC8920 interfaceC8920 = (InterfaceC8920) interfaceC1594;
                C4610 c4610 = new C4610(interfaceC8920.mo5435(), m25726(interfaceC8920.mo8965() + c15050.f49052, iArr));
                c15050.f49051 = c4610;
                c4610.f12505 = c15050;
                return;
            case 8:
                InterfaceC10331 interfaceC10331 = (InterfaceC10331) interfaceC1594;
                C13784 c13784 = new C13784(interfaceC10331.mo5435(), interfaceC10331.mo1140(), interfaceC10331.getReference());
                c15050.f49051 = c13784;
                c13784.f12505 = c15050;
                return;
            case 9:
                InterfaceC7508 interfaceC7508 = (InterfaceC7508) interfaceC1594;
                C11667 c11667 = new C11667(interfaceC7508.mo5435(), interfaceC7508.mo1140(), interfaceC7508.mo4063());
                c15050.f49051 = c11667;
                c11667.f12505 = c15050;
                return;
            case 10:
                InterfaceC20914 interfaceC20914 = (InterfaceC20914) interfaceC1594;
                C2493 c2493 = new C2493(interfaceC20914.mo5435(), interfaceC20914.mo1140(), interfaceC20914.mo4062());
                c15050.f49051 = c2493;
                c2493.f12505 = c15050;
                return;
            case 11:
                InterfaceC15976 interfaceC15976 = (InterfaceC15976) interfaceC1594;
                C5316 c5316 = new C5316(interfaceC15976.mo5435(), interfaceC15976.mo1140(), interfaceC15976.mo4063());
                c15050.f49051 = c5316;
                c5316.f12505 = c15050;
                return;
            case 12:
                InterfaceC20209 interfaceC20209 = (InterfaceC20209) interfaceC1594;
                C22250 c22250 = new C22250(interfaceC20209.mo5435(), interfaceC20209.mo1140(), m25726(interfaceC20209.mo8965() + c15050.f49052, iArr));
                c15050.f49051 = c22250;
                c22250.f12505 = c15050;
                return;
            case 13:
                InterfaceC0452 interfaceC0452 = (InterfaceC0452) interfaceC1594;
                C1082 c1082 = new C1082(interfaceC0452.mo1140(), interfaceC0452.mo1144(), interfaceC0452.mo4063(), interfaceC0452.mo5435());
                c15050.f49051 = c1082;
                c1082.f12505 = c15050;
                return;
            case 14:
                InterfaceC16681 interfaceC16681 = (InterfaceC16681) interfaceC1594;
                C13078 c13078 = new C13078(interfaceC16681.mo5435(), interfaceC16681.mo1140(), interfaceC16681.mo1144(), interfaceC16681.getReference());
                c15050.f49051 = c13078;
                c13078.f12505 = c15050;
                return;
            case 15:
                InterfaceC12448 interfaceC12448 = (InterfaceC12448) interfaceC1594;
                C3904 c3904 = new C3904(interfaceC12448.mo1140(), interfaceC12448.mo1144(), interfaceC12448.mo11355(), interfaceC12448.mo5435());
                c15050.f49051 = c3904;
                c3904.f12505 = c15050;
                return;
            case 16:
                InterfaceC17386 interfaceC17386 = (InterfaceC17386) interfaceC1594;
                C6727 c6727 = new C6727(interfaceC17386.mo1140(), interfaceC17386.mo1144(), interfaceC17386.mo4063(), interfaceC17386.mo5435());
                c15050.f49051 = c6727;
                c6727.f12505 = c15050;
                return;
            case 17:
                InterfaceC6097 interfaceC6097 = (InterfaceC6097) interfaceC1594;
                C22956 c22956 = new C22956(interfaceC6097.mo5435(), interfaceC6097.mo1140(), interfaceC6097.mo1144(), m25726(interfaceC6097.mo8965() + c15050.f49052, iArr));
                c15050.f49051 = c22956;
                c22956.f12505 = c15050;
                return;
            case 18:
                InterfaceC11037 interfaceC11037 = (InterfaceC11037) interfaceC1594;
                C15195 c15195 = new C15195(interfaceC11037.mo5435(), interfaceC11037.mo1140(), interfaceC11037.mo1144());
                c15050.f49051 = c15195;
                c15195.f12505 = c15050;
                return;
            case 19:
                InterfaceC23737 interfaceC23737 = (InterfaceC23737) interfaceC1594;
                C21544 c21544 = new C21544(interfaceC23737.mo1140(), interfaceC23737.mo1144(), interfaceC23737.mo26898(), interfaceC23737.mo5435());
                c15050.f49051 = c21544;
                c21544.f12505 = c15050;
                return;
            case 20:
                InterfaceC14565 interfaceC14565 = (InterfaceC14565) interfaceC1594;
                C18016 c18016 = new C18016(interfaceC14565.mo5435(), m25726(interfaceC14565.mo8965() + c15050.f49052, iArr));
                c15050.f49051 = c18016;
                c18016.f12505 = c15050;
                return;
            case 21:
                InterfaceC1863 interfaceC1863 = (InterfaceC1863) interfaceC1594;
                C18722 c18722 = new C18722(interfaceC1863.mo5435(), interfaceC1863.mo1140(), interfaceC1863.getReference());
                c15050.f49051 = c18722;
                c18722.f12505 = c15050;
                return;
            case 22:
                InterfaceC9626 interfaceC9626 = (InterfaceC9626) interfaceC1594;
                C8139 c8139 = new C8139(interfaceC9626.mo5435(), interfaceC9626.mo1140(), interfaceC9626.mo4063());
                c15050.f49051 = c8139;
                c8139.f12505 = c15050;
                return;
            case 23:
                InterfaceC3274 interfaceC3274 = (InterfaceC3274) interfaceC1594;
                int i = c15050.f49052;
                if (interfaceC3274.mo5435() != EnumC10297.f35086) {
                    C15050 c15051 = (C15050) this.f34519.get(m25721(interfaceC3274.mo8965() + i, iArr));
                    C19283 c19283 = new C19283();
                    c19283.f62239 = c15050;
                    ((C12933) c15051.m36037()).add(c19283);
                    c5171M25726 = c19283;
                } else {
                    c5171M25726 = m25726(interfaceC3274.mo8965() + i, iArr);
                }
                C19428 c19428 = new C19428(interfaceC3274.mo5435(), interfaceC3274.mo1140(), c5171M25726);
                c15050.f49051 = c19428;
                c19428.f12505 = c15050;
                return;
            case 24:
                InterfaceC4623 interfaceC4623 = (InterfaceC4623) interfaceC1594;
                C8845 c8845 = new C8845(interfaceC4623.mo5435(), interfaceC4623.mo1140(), interfaceC4623.mo1144());
                c15050.f49051 = c8845;
                c8845.f12505 = c15050;
                return;
            case 25:
                InterfaceC13797 interfaceC13797 = (InterfaceC13797) interfaceC1594;
                C10256 c10256 = new C10256(interfaceC13797.mo5435(), interfaceC13797.mo2107(), interfaceC13797.mo3085(), interfaceC13797.mo3087(), interfaceC13797.mo3089(), interfaceC13797.mo3086(), interfaceC13797.mo3088(), interfaceC13797.getReference());
                c15050.f49051 = c10256;
                c10256.f12505 = c15050;
                return;
            case 26:
                InterfaceC11680 interfaceC11680 = (InterfaceC11680) interfaceC1594;
                C7433 c7433 = new C7433(interfaceC11680.mo5435(), interfaceC11680.mo2107(), interfaceC11680.mo3085(), interfaceC11680.mo3087(), interfaceC11680.mo3089(), interfaceC11680.mo3086(), interfaceC11680.mo3088(), interfaceC11680.mo14567());
                c15050.f49051 = c7433;
                c7433.f12505 = c15050;
                return;
            case 27:
                InterfaceC2506 interfaceC2506 = (InterfaceC2506) interfaceC1594;
                C20839 c20839 = new C20839(interfaceC2506.mo5435(), interfaceC2506.mo2107(), interfaceC2506.mo3085(), interfaceC2506.mo3087(), interfaceC2506.mo3089(), interfaceC2506.mo3086(), interfaceC2506.mo3088(), interfaceC2506.mo2110());
                c15050.f49051 = c20839;
                c20839.f12505 = c15050;
                return;
            case 28:
                InterfaceC5329 interfaceC5329 = (InterfaceC5329) interfaceC1594;
                C15901 c15901 = new C15901(interfaceC5329.mo5435(), interfaceC5329.mo2109(), interfaceC5329.mo2107(), interfaceC5329.getReference());
                c15050.f49051 = c15901;
                c15901.f12505 = c15050;
                return;
            case 29:
                InterfaceC22263 interfaceC22263 = (InterfaceC22263) interfaceC1594;
                C20134 c20134 = new C20134(interfaceC22263.mo2109(), interfaceC22263.mo2107(), interfaceC22263.mo14567(), interfaceC22263.mo5435());
                c15050.f49051 = c20134;
                c20134.f12505 = c15050;
                return;
            case 30:
                InterfaceC1095 interfaceC1095 = (InterfaceC1095) interfaceC1594;
                C0377 c0377 = new C0377(interfaceC1095.mo2109(), interfaceC1095.mo2107(), interfaceC1095.mo2110(), interfaceC1095.mo5435());
                c15050.f49051 = c0377;
                c0377.f12505 = c15050;
                return;
            case 31:
                InterfaceC13091 interfaceC13091 = (InterfaceC13091) interfaceC1594;
                C16606 c16606 = new C16606(interfaceC13091.mo5435(), interfaceC13091.mo2107(), interfaceC13091.mo3085(), interfaceC13091.mo3087(), interfaceC13091.mo3089(), interfaceC13091.mo3086(), interfaceC13091.mo3088(), interfaceC13091.getReference(), interfaceC13091.mo3896());
                c15050.f49051 = c16606;
                c16606.f12505 = c15050;
                return;
            case 32:
                InterfaceC3917 interfaceC3917 = (InterfaceC3917) interfaceC1594;
                C12373 c12373 = new C12373(interfaceC3917.mo5435(), interfaceC3917.mo2109(), interfaceC3917.mo2107(), interfaceC3917.getReference(), interfaceC3917.mo3896());
                c15050.f49051 = c12373;
                c12373.f12505 = c15050;
                return;
            case 33:
                InterfaceC6740 interfaceC6740 = (InterfaceC6740) interfaceC1594;
                C17311 c17311 = new C17311(interfaceC6740.mo5435(), interfaceC6740.mo1140(), interfaceC6740.mo4062());
                c15050.f49051 = c17311;
                c17311.f12505 = c15050;
                return;
            case 34:
                List listMo14955 = ((InterfaceC22969) interfaceC1594).mo14955();
                if (listMo14955.size() == 0) {
                    c6022 = new C6022(null, 0);
                } else {
                    C15050 c15050M25722 = m25722(c15050);
                    int i2 = c15050M25722 == null ? 0 : c15050M25722.f49052;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listMo14955.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m25726(((InterfaceC2568) it.next()).mo8019() + i2, iArr));
                    }
                    c6022 = new C6022(arrayList, ((InterfaceC2568) listMo14955.get(0)).getKey());
                }
                c15050.f49051 = c6022;
                c6022.f12505 = c15050;
                return;
            case 35:
                List<InterfaceC2568> listMo14956 = ((InterfaceC15208) interfaceC1594).mo14955();
                if (listMo14956.size() == 0) {
                    c23662 = new C23662(null);
                } else {
                    C15050 c15050M25723 = m25722(c15050);
                    int i3 = c15050M25723 != null ? c15050M25723.f49052 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC2568 interfaceC2568 : listMo14956) {
                        arrayList2.add(new C7288(interfaceC2568.getKey(), m25726(interfaceC2568.mo8019() + i3, iArr)));
                    }
                    c23662 = new C23662(arrayList2);
                }
                c15050.f49051 = c23662;
                c23662.f12505 = c15050;
                return;
            case 36:
                InterfaceC23031 interfaceC23031 = (InterfaceC23031) interfaceC1594;
                C5877 c5877 = new C5877(interfaceC23031.mo16087(), interfaceC23031.mo16088());
                c15050.f49051 = c5877;
                c5877.f12505 = c15050;
                return;
            default:
                throw new C20749(null, "Instruction format %s not supported", interfaceC1594.mo5435().f35328);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15050 m25722(C15050 c15050) {
        AbstractC3384 abstractC3384;
        C15050 c15051 = null;
        do {
            for (C5171 c5171 : (C12933) c15050.m36037()) {
                if (c5171 instanceof C19283) {
                    if (c15051 != null) {
                        throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                    }
                    c15051 = ((C19283) c5171).f62239;
                }
            }
            int i = c15050.f49054;
            if (i == 0) {
                break;
            }
            c15050 = (C15050) this.f34519.get(i - 1);
            abstractC3384 = c15050.f49051;
            if (abstractC3384 == null) {
                break;
            }
        } while (abstractC3384.f12506 == EnumC10297.f35298);
        return c15051;
    }
}
