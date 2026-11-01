package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public class C12926 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5870 f42950;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f42951;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f42952 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12926 f42953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC9729 f42954;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10391 f42955;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19524 f42956;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC11678 f42957;

    public C12926(C5870 c5870, EnumC9729 enumC9729, AbstractC23903 abstractC23903, EnumC11678 enumC11678, C19524 c19524, C12926 c12926, C10391 c10391) {
        this.f42950 = c5870;
        this.f42954 = enumC9729;
        this.f42951 = abstractC23903;
        this.f42957 = enumC11678;
        this.f42953 = c12926;
        this.f42955 = c10391;
        this.f42956 = c19524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32013(C10104 c10104, C1116 c1116, InterfaceC7987 interfaceC7987) {
        this.f42952.add(new C18570(this.f42950, c10104, c1116, interfaceC7987));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32012() {
        C19524 c19524;
        while (true) {
            ArrayList arrayList = this.f42952;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = C21825.m48583((Iterable) arrayList).iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                c19524 = this.f42956;
                if (zHasNext) {
                    C18570 c18570 = (C18570) it.next();
                    C5870 c5870 = c18570.f59063;
                    C1116 c1116 = c18570.f59065;
                    C10104 c10104 = c18570.f59066;
                    AbstractC5930 abstractC5930 = c10104.f34494;
                    InterfaceC7987 interfaceC7987 = c18570.f59064;
                    int iOrdinal = this.f42954.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            if (interfaceC7987.mo21044()) {
                                C17489 c17489 = c5870.f20035;
                                C12926 c12926 = this.f42953;
                                if (c12926 != c17489 && AbstractC16579.m38997(c12926.f42956.f62771, C21825.m48583((Iterable) interfaceC7987.mo21045()))) {
                                    c12926.mo32013(c10104, c1116.mo4136(new C15043(c1116.f5037, this)), interfaceC7987);
                                    abstractC5930.f30190 = AbstractC16579.f53217;
                                }
                            } else {
                                C6171.m17175("attribution shouldn't be happening here", !m32015());
                                c10104.m25710(c1116.mo4134(c19524.m44587(c1116.f5036)), c5870.f20042);
                            }
                        } else {
                            throw new AssertionError("Bad mode");
                        }
                    } else if (interfaceC7987.mo21044()) {
                        C17864 c17864 = new C17864(c18570);
                        c17864.f56562 = c1116;
                        c17864.f56563 = c19524;
                        c17864.f56561 = c10104.f34496;
                        abstractC5930.mo1802(c17864);
                        c10104.f34493.m22515(c5870.f20039, c1116);
                    } else {
                        C6171.m17174("Cannot get here");
                        throw null;
                    }
                    arrayList.remove(c18570);
                    z = true;
                }
            }
            if (!z) {
                if (m32015()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C18570) it2.next()).f59066.f34494.f30190 = AbstractC16579.f53219;
                    }
                    return;
                }
                try {
                    c19524.m44605(C21825.m48583((Iterable) m32014().f59064.mo21045()), this.f42955);
                    c19524.m44600();
                } catch (C10623 unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32015() {
        if (this == this.f42950.f20035) {
            return false;
        }
        if (this.f42954 == EnumC9729.SPECULATIVE) {
            return true;
        }
        return this.f42953.m32015();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18570 m32014() {
        C8506 c8506;
        C5870 c5870 = this.f42950;
        C13174 c13174 = c5870.f20044;
        C10391 c10391 = this.f42955;
        C19524 c19524 = this.f42956;
        c13174.m32584(c19524, c10391);
        C13174 c13175 = c5870.f20044;
        C13638.requireNonNull(c13175);
        final C19795 c19795 = new C19795(new C9212(c13175, c19524, c5870.f20040.f76946));
        ArrayList arrayList = this.f42952;
        C21825<C0930> c21825 = (C21825) C9030.stream(arrayList).map(new C2341()).collect(C21825.m48587());
        for (C0930 c0930 : c21825) {
            for (C0930 c0931 : c21825) {
                if (c0930 != c0931) {
                    Set setMo21046 = ((C18570) c0931.f22269).f59064.mo21046();
                    for (AbstractC16579 abstractC16579 : ((C18570) c0930.f22269).f59064.mo21045()) {
                        Iterator it = c19795.f63562.iterator();
                        do {
                            if (!it.hasNext()) {
                                c8506 = null;
                                break;
                            }
                            c8506 = (C8506) it.next();
                        } while (!((C19003) c8506.f22269).contains(abstractC16579));
                        if (c8506 != null) {
                            final HashSet hashSetM22235 = c8506.m22235();
                            if (C9030.stream(setMo21046).map(new Function() { // from class: l.ۚۛۤ
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo33696andThen(Function function) {
                                    return C4277.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C4277.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    AbstractC16579 abstractC165710 = (AbstractC16579) obj;
                                    for (C8506 c8507 : c19795.f63562) {
                                        if (((C19003) c8507.f22269).contains(abstractC165710)) {
                                            return c8507;
                                        }
                                    }
                                    return null;
                                }
                            }).anyMatch(new Predicate() { // from class: l.᩹ۛۤ
                                @Override // java.util.function.Predicate
                                public /* synthetic */ Predicate and(Predicate predicate) {
                                    return C8512.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* JADX INFO: renamed from: negate */
                                public /* synthetic */ Predicate mo9645negate() {
                                    return C8512.$default$negate(this);
                                }

                                public /* synthetic */ Predicate or(Predicate predicate) {
                                    return C8512.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return hashSetM22235.contains((C8506) obj);
                                }
                            })) {
                                c0930.f3728.add(c0931);
                                break;
                            }
                        }
                    }
                }
            }
        }
        C21825 c21826 = (C21825) C8732.m22598(c21825).get(0);
        return (C18570) (c21826.m48596() == 1 ? ((C0930) c21826.get(0)).f22269 : arrayList.get(0));
    }
}
