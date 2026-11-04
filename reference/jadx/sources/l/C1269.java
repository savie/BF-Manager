package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1269 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16184 f4561 = C16184.f52525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C19914 f4562 = C19914.m45843();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11338 f4566;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4472 f4568;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4567 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4565 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4564 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4563 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4569 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4598(InterfaceC18422 interfaceC18422) {
        if (interfaceC18422 instanceof C0523) {
            this.f4563++;
        } else if (interfaceC18422 instanceof EnumC9515) {
            int i = this.f4563 - 1;
            this.f4563 = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f4567.add(interfaceC18422);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4594(List list) {
        AbstractC14956 abstractC14956ListIterator = ((AbstractC1928) list).listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            m4598((InterfaceC18422) abstractC14956ListIterator.next());
        }
    }

    public C1269(C4472 c4472, C11338 c11338) {
        this.f4568 = c4472;
        this.f4566 = c11338;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6490 m4603() {
        return this.f4568;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m4604() {
        return this.f4563;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4592(int i) {
        if (this.f4563 != i) {
            throw new C17676(m4590(String.format("saw %d unclosed ops", Integer.valueOf(this.f4563))));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16930 m4590(String str) {
        int i = this.f4564;
        C4472 c4472 = this.f4568;
        return C16930.m39908(c4472.m14172(i), c4472.m14167(i), str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4612(int i) {
        if (i > this.f4564) {
            AbstractC1928 abstractC1928M14173 = this.f4568.m14173();
            int size = abstractC1928M14173.size();
            this.f4564 = i;
            int i2 = this.f4565;
            if (i2 >= size || i <= ((InterfaceC12455) abstractC1928M14173.get(i2)).mo30930().getPosition()) {
                return;
            }
            int i3 = this.f4565;
            this.f4565 = i3 + 1;
            throw new C17676(m4590("did not generate token \"" + ((InterfaceC12455) abstractC1928M14173.get(i3)).mo30930().getText() + "\""));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m4599() {
        C4472 c4472 = this.f4568;
        int length = c4472.m14168().length() + 1;
        if (length > this.f4564) {
            AbstractC1928 abstractC1928M14173 = c4472.m14173();
            int size = abstractC1928M14173.size();
            while (true) {
                int i = this.f4565;
                if (i >= size || length <= ((InterfaceC12455) abstractC1928M14173.get(i)).mo30930().getPosition()) {
                    break;
                }
                int i2 = this.f4565;
                this.f4565 = i2 + 1;
                m4598(C2015.m6930((InterfaceC12455) abstractC1928M14173.get(i2), EnumC5744.IMAGINARY, f4561, C15867.empty()));
            }
        }
        this.f4564 = length;
        m4592(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4595(AbstractC3506 abstractC3506) {
        m4598(C0523.m2484(abstractC3506));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4605() {
        m4598(EnumC9515.m24905());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15867 m4600(int i) {
        AbstractC1928 abstractC1928M14173 = this.f4568.m14173();
        int i2 = this.f4565 + i;
        if (i2 < abstractC1928M14173.size()) {
            return C15867.of(((InterfaceC12455) abstractC1928M14173.get(i2)).mo30930().mo18733());
        }
        return C15867.empty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC12455 m4608(int i) {
        AbstractC1928 abstractC1928M14173 = this.f4568.m14173();
        int i2 = this.f4565 + i;
        if (i2 < abstractC1928M14173.size()) {
            return (InterfaceC12455) abstractC1928M14173.get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m4589(int i, C18642 c18642) {
        AbstractC1928 abstractC1928M14173 = this.f4568.m14173();
        boolean z = ((InterfaceC12455) abstractC1928M14173.get(this.f4565)).mo30930().getPosition() == i;
        Object obj = abstractC1928M14173.get(this.f4565);
        if (z) {
            C22811 c22811 = new C22811();
            for (int i2 = this.f4565; i2 < abstractC1928M14173.size(); i2++) {
                InterfaceC20660 interfaceC20660Mo30930 = ((InterfaceC12455) abstractC1928M14173.get(i2)).mo30930();
                if (!c18642.apply(interfaceC20660Mo30930)) {
                    break;
                }
                c22811.m19807(interfaceC20660Mo30930);
            }
            return c22811.m51441();
        }
        throw new IllegalStateException(C8399.m22571("Expected the current token to be at position %s, found: %s", Integer.valueOf(i), obj));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4610(String str) {
        m4593(str, EnumC5744.IMAGINARY, f4561, C15867.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4593(String str, EnumC5744 enumC5744, AbstractC3506 abstractC3506, C15867 c15867) {
        AbstractC1928 abstractC1928M14173 = this.f4568.m14173();
        if (str.equals(m4600(0).orElse(null))) {
            int i = this.f4565;
            this.f4565 = i + 1;
            m4598(C2015.m6930((InterfaceC12455) abstractC1928M14173.get(i), EnumC5744.REAL, abstractC3506, c15867));
        } else if (enumC5744.m16803()) {
            throw new C17676(m4590(String.format("expected token: '%s'; generated %s instead", m4600(0).orElse(null), str)));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4602(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            m4593(str.substring(i, i2), EnumC5744.REAL, f4561, C15867.empty());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m4606() {
        m4598(C19914.m45843());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4591() {
        m4597(EnumC10963.UNIFIED, "", f4561);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4601() {
        m4597(EnumC10963.INDEPENDENT, "", f4561);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4588() {
        m4597(EnumC10963.FORCED, "", f4561);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4609() {
        m4597(EnumC10963.UNIFIED, " ", f4561);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4611() {
        m4597(EnumC10963.INDEPENDENT, " ", f4561);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4597(EnumC10963 enumC10963, String str, AbstractC3506 abstractC3506) {
        m4598(C22152.m50111(enumC10963, str, abstractC3506, C15867.empty()));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m4613() {
        int i = this.f4569;
        if (i == -1) {
            this.f4569 = this.f4565;
            return;
        }
        if (this.f4565 == i) {
            return;
        }
        C4472 c4472 = this.f4568;
        this.f4566.m28632((InterfaceC12455) c4472.m14173().get(this.f4569), (InterfaceC12455) c4472.m14173().get(this.f4565 - 1));
        this.f4569 = this.f4565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4596(AbstractC10217 abstractC10217) {
        int index;
        InterfaceC12455 interfaceC12455 = (InterfaceC12455) this.f4568.m14173().get(this.f4565);
        AbstractC14956 abstractC14956ListIterator = interfaceC12455.mo30932().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            InterfaceC20660 interfaceC20660 = (InterfaceC20660) abstractC14956ListIterator.next();
            if (interfaceC20660.getIndex() >= 0) {
                index = interfaceC20660.getIndex();
                this.f4566.m28630(index, abstractC10217);
            }
        }
        index = interfaceC12455.mo30930().getIndex();
        this.f4566.m28630(index, abstractC10217);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m4607() {
        AbstractC1928 abstractC1928Of;
        m4613();
        C17786 c17786M41612 = C17786.m41612();
        ArrayList arrayList = this.f4567;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC18422 interfaceC18422 = (InterfaceC18422) arrayList.get(i);
            if (interfaceC18422 instanceof C2015) {
                C2015 c2015 = (C2015) interfaceC18422;
                InterfaceC12455 interfaceC12455M6939 = c2015.m6939();
                int i2 = i;
                while (i2 > 0 && (arrayList.get(i2 - 1) instanceof C0523)) {
                    i2--;
                }
                int i3 = i;
                do {
                    i3++;
                    if (i3 >= size) {
                        break;
                    }
                } while (arrayList.get(i3) instanceof EnumC9515);
                if (c2015.m6937().m16803()) {
                    AbstractC14956 abstractC14956ListIterator = interfaceC12455M6939.mo30932().listIterator(0);
                    boolean z = false;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean zMo18728 = false;
                    while (abstractC14956ListIterator.hasNext()) {
                        InterfaceC20660 interfaceC20660 = (InterfaceC20660) abstractC14956ListIterator.next();
                        if (interfaceC20660.mo18730()) {
                            i4++;
                        } else if (interfaceC20660.mo18731()) {
                            int position = interfaceC20660.getPosition();
                            c17786M41612.mo46065(Integer.valueOf(i2), C22152.m50112(interfaceC20660.mo18726() ? EnumC10963.FORCED : EnumC10963.UNIFIED, position == 0 || this.f4568.m14168().charAt(position + (-1)) == '\n' ? C16184.f52526 : c2015.m6936()));
                            c17786M41612.m41613(interfaceC20660.mo18728() ? AbstractC1928.of((Object) C13201.m32711(interfaceC20660)) : AbstractC1928.of((Object) C13201.m32711(interfaceC20660), (Object) C22152.m50112(EnumC10963.FORCED, C16184.f52525)), Integer.valueOf(i2));
                            zMo18728 = interfaceC20660.mo18728();
                            if (interfaceC20660.mo18732()) {
                                c17786M41612.mo46065(Integer.valueOf(i2), C22152.m50112(EnumC10963.FORCED, C16184.f52525));
                            }
                            z = interfaceC20660.mo18726() || (interfaceC20660.mo18728() && !interfaceC20660.mo18732());
                            i4 = 0;
                            z2 = true;
                        }
                    }
                    if (z && i4 > 1) {
                        this.f4566.m28630(interfaceC12455M6939.mo30930().getIndex(), AbstractC10217.f32658);
                    }
                    C19914 c19914 = f4562;
                    if (z2 && i4 > 0) {
                        Integer numValueOf = Integer.valueOf(i2);
                        int i5 = C22152.f71354;
                        c17786M41612.mo46065(numValueOf, C22152.m50112(EnumC10963.FORCED, C16184.f52525));
                    } else if (zMo18728) {
                        c17786M41612.mo46065(Integer.valueOf(i2), c19914);
                    }
                    AbstractC14956 abstractC14956ListIterator2 = interfaceC12455M6939.mo30931().listIterator(0);
                    while (abstractC14956ListIterator2.hasNext()) {
                        InterfaceC20660 interfaceC20661 = (InterfaceC20660) abstractC14956ListIterator2.next();
                        if (interfaceC20661.mo18731()) {
                            boolean z3 = interfaceC20661.mo18732() || (interfaceC20661.mo18728() && c2015.m6931().isPresent());
                            if (z3) {
                                c17786M41612.mo46065(Integer.valueOf(i3), C22152.m50112(EnumC10963.FORCED, (AbstractC3506) c2015.m6931().orElse(C16184.f52525)));
                            } else {
                                c17786M41612.mo46065(Integer.valueOf(i3), c19914);
                            }
                            Integer numValueOf2 = Integer.valueOf(i3);
                            if (interfaceC20661.mo18728()) {
                                abstractC1928Of = AbstractC1928.of((Object) C13201.m32711(interfaceC20661));
                            } else {
                                C13201 c13201M32711 = C13201.m32711(interfaceC20661);
                                int i6 = C22152.f71354;
                                abstractC1928Of = AbstractC1928.of((Object) c13201M32711, (Object) C22152.m50112(EnumC10963.FORCED, C16184.f52525));
                            }
                            c17786M41612.m41613(abstractC1928Of, numValueOf2);
                            if (z3) {
                                c17786M41612.mo46065(Integer.valueOf(i3), C22152.m50112(EnumC10963.FORCED, f4561));
                            }
                        }
                    }
                } else {
                    AbstractC14956 abstractC14956ListIterator3 = interfaceC12455M6939.mo30932().listIterator(0);
                    int i7 = 0;
                    boolean zMo18731 = false;
                    while (abstractC14956ListIterator3.hasNext()) {
                        InterfaceC20660 interfaceC20662 = (InterfaceC20660) abstractC14956ListIterator3.next();
                        if (interfaceC20662.mo18730()) {
                            i7++;
                        } else if (interfaceC20662.mo18731()) {
                            zMo18731 = interfaceC20662.mo18731();
                            i7 = 0;
                        }
                        if (zMo18731 && i7 > 0) {
                            Integer numValueOf3 = Integer.valueOf(i2);
                            int i8 = C22152.f71354;
                            c17786M41612.mo46065(numValueOf3, C22152.m50112(EnumC10963.FORCED, C16184.f52525));
                        }
                        c17786M41612.mo46065(Integer.valueOf(i2), C13201.m32711(interfaceC20662));
                    }
                    AbstractC14956 abstractC14956ListIterator4 = interfaceC12455M6939.mo30931().listIterator(0);
                    while (abstractC14956ListIterator4.hasNext()) {
                        c17786M41612.mo46065(Integer.valueOf(i3), C13201.m32711((InterfaceC20660) abstractC14956ListIterator4.next()));
                    }
                }
            }
        }
        int i9 = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            for (InterfaceC18422 interfaceC18423 : c17786M41612.get((Object) Integer.valueOf(i10))) {
                if (!z4 || !(interfaceC18423 instanceof C19914)) {
                    c22811.m19807(interfaceC18423);
                    z4 = (interfaceC18423 instanceof C22152) && ((C22152) interfaceC18423).m50115();
                }
            }
            Object obj = (InterfaceC18422) arrayList.get(i10);
            if (!z4 || (!(obj instanceof C19914) && (!(obj instanceof C22152) || ((C22152) obj).m50113() != 0 || !" ".equals(((AbstractC11709) obj).m29386())))) {
                c22811.m19807(obj);
                if (!(obj instanceof C0523)) {
                    z4 = (obj instanceof C22152) && ((C22152) obj).m50115();
                }
            }
        }
        for (InterfaceC18422 interfaceC18424 : c17786M41612.get((Object) Integer.valueOf(size))) {
            if (!z4 || !(interfaceC18424 instanceof C19914)) {
                c22811.m19807(interfaceC18424);
                z4 = (interfaceC18424 instanceof C22152) && ((C22152) interfaceC18424).m50115();
            }
        }
        return c22811.m51441();
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f4568, "input");
        c3179M46714.m10379(this.f4567, "ops");
        c3179M46714.m10379(this.f4566, "output");
        c3179M46714.m10380("tokenI", this.f4565);
        c3179M46714.m10380("inputPosition", this.f4564);
        return c3179M46714.toString();
    }
}
