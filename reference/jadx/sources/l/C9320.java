package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9320 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C8614 f31635 = C8614.f29736;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C3673 f31636 = C3673.m10841();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0192 f31642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18806 f31643;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31640 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f31637 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f31641 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31639 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31638 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23955(InterfaceC5791 interfaceC5791) {
        if (interfaceC5791 instanceof C10731) {
            this.f31639++;
        } else if (interfaceC5791 instanceof EnumC3155) {
            int i = this.f31639 - 1;
            this.f31639 = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f31640.add(interfaceC5791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23952(List list) {
        AbstractC16706 abstractC16706ListIterator = ((AbstractC22433) list).listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            m23955((InterfaceC5791) abstractC16706ListIterator.next());
        }
    }

    public C9320(C0192 c0192, C18806 c18806) {
        this.f31642 = c0192;
        this.f31643 = c18806;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC19903 m23958() {
        return this.f31642;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m23943() {
        return this.f31639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23950(int i) {
        if (this.f31639 != i) {
            throw new C19197(m23947(String.format("saw %d unclosed ops", Integer.valueOf(this.f31639))));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7908 m23947(String str) {
        int i = this.f31641;
        C0192 c0192 = this.f31642;
        return C7908.m20922(c0192.m1418(i), c0192.m1424(i), str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23945(int i) {
        if (i > this.f31641) {
            AbstractC22433 abstractC22433M1419 = this.f31642.m1419();
            int size = abstractC22433M1419.size();
            this.f31641 = i;
            int i2 = this.f31637;
            if (i2 >= size || i <= ((InterfaceC15670) abstractC22433M1419.get(i2)).mo37335().getPosition()) {
                return;
            }
            int i3 = this.f31637;
            this.f31637 = i3 + 1;
            throw new C19197(m23947("did not generate token \"" + ((InterfaceC15670) abstractC22433M1419.get(i3)).mo37335().getText() + "\""));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m23962() {
        C0192 c0192 = this.f31642;
        int length = c0192.m1425().length() + 1;
        if (length > this.f31641) {
            AbstractC22433 abstractC22433M1419 = c0192.m1419();
            int size = abstractC22433M1419.size();
            while (true) {
                int i = this.f31637;
                if (i >= size || length <= ((InterfaceC15670) abstractC22433M1419.get(i)).mo37335().getPosition()) {
                    break;
                }
                int i2 = this.f31637;
                this.f31637 = i2 + 1;
                m23955(C21313.m47806((InterfaceC15670) abstractC22433M1419.get(i2), EnumC14964.IMAGINARY, f31635, C11521.empty()));
            }
        }
        this.f31641 = length;
        m23950(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23956(AbstractC7202 abstractC7202) {
        m23955(C10731.m26969(abstractC7202));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m23967() {
        m23955(EnumC3155.m9549());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11521 m23959(int i) {
        AbstractC22433 abstractC22433M1419 = this.f31642.m1419();
        int i2 = this.f31637 + i;
        if (i2 < abstractC22433M1419.size()) {
            return C11521.of(((InterfaceC15670) abstractC22433M1419.get(i2)).mo37335().mo37426());
        }
        return C11521.empty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m23963(int i) {
        AbstractC22433 abstractC22433M1419 = this.f31642.m1419();
        int i2 = this.f31637 + i;
        if (i2 < abstractC22433M1419.size()) {
            return (InterfaceC15670) abstractC22433M1419.get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m23948(int i, C10777 c10777) {
        AbstractC22433 abstractC22433M1419 = this.f31642.m1419();
        boolean z = ((InterfaceC15670) abstractC22433M1419.get(this.f31637)).mo37335().getPosition() == i;
        Object obj = abstractC22433M1419.get(this.f31637);
        if (!z) {
            throw new IllegalStateException(C11249.m28221("Expected the current token to be at position %s, found: %s", Integer.valueOf(i), obj));
        }
        C4793 c4793 = new C4793();
        for (int i2 = this.f31637; i2 < abstractC22433M1419.size(); i2++) {
            InterfaceC20608 interfaceC20608Mo37335 = ((InterfaceC15670) abstractC22433M1419.get(i2)).mo37335();
            if (!c10777.apply(interfaceC20608Mo37335)) {
                break;
            }
            c4793.m52163(interfaceC20608Mo37335);
        }
        return c4793.m13309();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23965(String str) {
        m23951(str, EnumC14964.IMAGINARY, f31635, C11521.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23951(String str, EnumC14964 enumC14964, AbstractC7202 abstractC7202, C11521 c11521) {
        AbstractC22433 abstractC22433M1419 = this.f31642.m1419();
        if (str.equals(m23959(0).orElse(null))) {
            int i = this.f31637;
            this.f31637 = i + 1;
            m23955(C21313.m47806((InterfaceC15670) abstractC22433M1419.get(i), EnumC14964.REAL, abstractC7202, c11521));
        } else if (enumC14964.m35948()) {
            throw new C19197(m23947(String.format("expected token: '%s'; generated %s instead", m23959(0).orElse(null), str)));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23961(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            m23951(str.substring(i, i2), EnumC14964.REAL, f31635, C11521.empty());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m23966() {
        m23955(C3673.m10841());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23949() {
        m23953(EnumC0851.UNIFIED, "", f31635);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23960() {
        m23953(EnumC0851.INDEPENDENT, "", f31635);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23946() {
        m23953(EnumC0851.FORCED, "", f31635);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23964() {
        m23953(EnumC0851.UNIFIED, " ", f31635);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23944() {
        m23953(EnumC0851.INDEPENDENT, " ", f31635);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23953(EnumC0851 enumC0851, String str, AbstractC7202 abstractC7202) {
        m23955(C22019.m48910(enumC0851, str, abstractC7202, C11521.empty()));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m23968() {
        int i = this.f31638;
        if (i == -1) {
            this.f31638 = this.f31637;
            return;
        }
        if (this.f31637 == i) {
            return;
        }
        C0192 c0192 = this.f31642;
        this.f31643.m43378((InterfaceC15670) c0192.m1419().get(this.f31638), (InterfaceC15670) c0192.m1419().get(this.f31637 - 1));
        this.f31638 = this.f31637;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23954(AbstractC1557 abstractC1557) {
        int index;
        InterfaceC15670 interfaceC15670 = (InterfaceC15670) this.f31642.m1419().get(this.f31637);
        AbstractC16706 abstractC16706ListIterator = interfaceC15670.mo37337().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            InterfaceC20608 interfaceC20608 = (InterfaceC20608) abstractC16706ListIterator.next();
            if (interfaceC20608.getIndex() >= 0) {
                index = interfaceC20608.getIndex();
                this.f31643.m43376(index, abstractC1557);
            }
        }
        index = interfaceC15670.mo37335().getIndex();
        this.f31643.m43376(index, abstractC1557);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m23957() {
        AbstractC22433 abstractC22433Of;
        m23968();
        C23119 c23119M51120 = C23119.m51120();
        ArrayList arrayList = this.f31640;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC5791 interfaceC5791 = (InterfaceC5791) arrayList.get(i);
            if (interfaceC5791 instanceof C21313) {
                C21313 c21313 = (C21313) interfaceC5791;
                InterfaceC15670 interfaceC15670M47810 = c21313.m47810();
                int i2 = i;
                while (i2 > 0 && (arrayList.get(i2 - 1) instanceof C10731)) {
                    i2--;
                }
                int i3 = i;
                do {
                    i3++;
                    if (i3 >= size) {
                        break;
                    }
                } while (arrayList.get(i3) instanceof EnumC3155);
                if (c21313.m47809().m35948()) {
                    AbstractC16706 abstractC16706ListIterator = interfaceC15670M47810.mo37337().listIterator(0);
                    boolean z = false;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean zMo37430 = false;
                    while (abstractC16706ListIterator.hasNext()) {
                        InterfaceC20608 interfaceC20608 = (InterfaceC20608) abstractC16706ListIterator.next();
                        if (interfaceC20608.mo37433()) {
                            i4++;
                        } else if (interfaceC20608.mo37429()) {
                            int position = interfaceC20608.getPosition();
                            c23119M51120.put(Integer.valueOf(i2), C22019.m48911(interfaceC20608.mo37428() ? EnumC0851.FORCED : EnumC0851.UNIFIED, position == 0 || this.f31642.m1425().charAt(position + (-1)) == '\n' ? C8614.f29737 : c21313.m47808()));
                            c23119M51120.m51121(interfaceC20608.mo37430() ? AbstractC22433.of((Object) C22725.m50380(interfaceC20608)) : AbstractC22433.of((Object) C22725.m50380(interfaceC20608), (Object) C22019.m48911(EnumC0851.FORCED, C8614.f29736)), Integer.valueOf(i2));
                            zMo37430 = interfaceC20608.mo37430();
                            if (interfaceC20608.mo37432()) {
                                c23119M51120.put(Integer.valueOf(i2), C22019.m48911(EnumC0851.FORCED, C8614.f29736));
                            }
                            z = interfaceC20608.mo37428() || (interfaceC20608.mo37430() && !interfaceC20608.mo37432());
                            i4 = 0;
                            z2 = true;
                        }
                    }
                    if (z && i4 > 1) {
                        this.f31643.m43376(interfaceC15670M47810.mo37335().getIndex(), AbstractC1557.f6288);
                    }
                    C3673 c3673 = f31636;
                    if (z2 && i4 > 0) {
                        Integer numValueOf = Integer.valueOf(i2);
                        int i5 = C22019.f71380;
                        c23119M51120.put(numValueOf, C22019.m48911(EnumC0851.FORCED, C8614.f29736));
                    } else if (zMo37430) {
                        c23119M51120.put(Integer.valueOf(i2), c3673);
                    }
                    AbstractC16706 abstractC16706ListIterator2 = interfaceC15670M47810.mo37336().listIterator(0);
                    while (abstractC16706ListIterator2.hasNext()) {
                        InterfaceC20608 interfaceC20609 = (InterfaceC20608) abstractC16706ListIterator2.next();
                        if (interfaceC20609.mo37429()) {
                            boolean z3 = interfaceC20609.mo37432() || (interfaceC20609.mo37430() && c21313.m47807().isPresent());
                            if (z3) {
                                c23119M51120.put(Integer.valueOf(i3), C22019.m48911(EnumC0851.FORCED, (AbstractC7202) c21313.m47807().orElse(C8614.f29736)));
                            } else {
                                c23119M51120.put(Integer.valueOf(i3), c3673);
                            }
                            Integer numValueOf2 = Integer.valueOf(i3);
                            if (interfaceC20609.mo37430()) {
                                abstractC22433Of = AbstractC22433.of((Object) C22725.m50380(interfaceC20609));
                            } else {
                                C22725 c22725M50380 = C22725.m50380(interfaceC20609);
                                int i6 = C22019.f71380;
                                abstractC22433Of = AbstractC22433.of((Object) c22725M50380, (Object) C22019.m48911(EnumC0851.FORCED, C8614.f29736));
                            }
                            c23119M51120.m51121(abstractC22433Of, numValueOf2);
                            if (z3) {
                                c23119M51120.put(Integer.valueOf(i3), C22019.m48911(EnumC0851.FORCED, f31635));
                            }
                        }
                    }
                } else {
                    AbstractC16706 abstractC16706ListIterator3 = interfaceC15670M47810.mo37337().listIterator(0);
                    int i7 = 0;
                    boolean zMo37429 = false;
                    while (abstractC16706ListIterator3.hasNext()) {
                        InterfaceC20608 interfaceC206010 = (InterfaceC20608) abstractC16706ListIterator3.next();
                        if (interfaceC206010.mo37433()) {
                            i7++;
                        } else if (interfaceC206010.mo37429()) {
                            zMo37429 = interfaceC206010.mo37429();
                            i7 = 0;
                        }
                        if (zMo37429 && i7 > 0) {
                            Integer numValueOf3 = Integer.valueOf(i2);
                            int i8 = C22019.f71380;
                            c23119M51120.put(numValueOf3, C22019.m48911(EnumC0851.FORCED, C8614.f29736));
                        }
                        c23119M51120.put(Integer.valueOf(i2), C22725.m50380(interfaceC206010));
                    }
                    AbstractC16706 abstractC16706ListIterator4 = interfaceC15670M47810.mo37336().listIterator(0);
                    while (abstractC16706ListIterator4.hasNext()) {
                        c23119M51120.put(Integer.valueOf(i3), C22725.m50380((InterfaceC20608) abstractC16706ListIterator4.next()));
                    }
                }
            }
        }
        int i9 = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            for (InterfaceC5791 interfaceC5792 : c23119M51120.get((Object) Integer.valueOf(i10))) {
                if (!z4 || !(interfaceC5792 instanceof C3673)) {
                    c4793.m52163(interfaceC5792);
                    z4 = (interfaceC5792 instanceof C22019) && ((C22019) interfaceC5792).m48914();
                }
            }
            Object obj = (InterfaceC5791) arrayList.get(i10);
            if (!z4 || (!(obj instanceof C3673) && (!(obj instanceof C22019) || ((C22019) obj).m48912() != 0 || !" ".equals(((AbstractC17785) obj).m41372())))) {
                c4793.m52163(obj);
                if (!(obj instanceof C10731)) {
                    z4 = (obj instanceof C22019) && ((C22019) obj).m48914();
                }
            }
        }
        for (InterfaceC5791 interfaceC5793 : c23119M51120.get((Object) Integer.valueOf(size))) {
            if (!z4 || !(interfaceC5793 instanceof C3673)) {
                c4793.m52163(interfaceC5793);
                z4 = (interfaceC5793 instanceof C22019) && ((C22019) interfaceC5793).m48914();
            }
        }
        return c4793.m13309();
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f31642, "input");
        c23244M37072.m51284(this.f31640, "ops");
        c23244M37072.m51284(this.f31643, "output");
        c23244M37072.m51285("tokenI", this.f31637);
        c23244M37072.m51285("inputPosition", this.f31641);
        return c23244M37072.toString();
    }
}
