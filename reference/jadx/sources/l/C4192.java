package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public class C4192 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f15329 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1083 f15330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16124 f15331;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12863 f15332;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC20234 f15333;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4192 f15334;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2596 f15335;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f15336;

    public C4192(C12863 c12863, EnumC16124 enumC16124, AbstractC11781 abstractC11781, EnumC20234 enumC20234, C2596 c2596, C4192 c4192, C1083 c1083) {
        this.f15332 = c12863;
        this.f15331 = enumC16124;
        this.f15336 = abstractC11781;
        this.f15333 = enumC20234;
        this.f15334 = c4192;
        this.f15330 = c1083;
        this.f15335 = c2596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13376(C8666 c8666, C14479 c14479, InterfaceC1209 interfaceC1209) {
        this.f15329.add(new C10157(this.f15332, c8666, c14479, interfaceC1209));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13375() {
        C2596 c2596;
        while (true) {
            ArrayList arrayList = this.f15329;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = C14769.m35539((Iterable) arrayList).iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                c2596 = this.f15335;
                if (zHasNext) {
                    C10157 c10157 = (C10157) it.next();
                    C12863 c12863 = c10157.f32523;
                    C14479 c14479 = c10157.f32521;
                    C8666 c8666 = c10157.f32522;
                    AbstractC22295 abstractC22295 = c8666.f28301;
                    InterfaceC1209 interfaceC1209 = c10157.f32520;
                    int iOrdinal = this.f15331.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            if (interfaceC1209.mo4423()) {
                                C5684 c5684 = c12863.f41172;
                                C4192 c4192 = this.f15334;
                                if (c4192 != c5684 && AbstractC22664.m51060(c4192.f15335.f8340, C14769.m35539((Iterable) interfaceC1209.mo4424()))) {
                                    c4192.mo13376(c8666, c14479.mo30218(new C0463(c14479.f45571, this)), interfaceC1209);
                                    abstractC22295.f26659 = AbstractC22664.f73592;
                                }
                            } else {
                                C11972.m30025("attribution shouldn't be happening here", !m13378());
                                c8666.m23332(c14479.mo30219(c2596.m8696(c14479.f45575)), c12863.f41175);
                            }
                        } else {
                            throw new AssertionError("Bad mode");
                        }
                    } else if (interfaceC1209.mo4423()) {
                        C19108 c19108 = new C19108(c10157);
                        c19108.f61838 = c14479;
                        c19108.f61839 = c2596;
                        c19108.f61837 = c8666.f28296;
                        abstractC22295.mo2284(c19108);
                        c8666.f28299.m8866(c12863.f41173, c14479);
                    } else {
                        C11972.m30024("Cannot get here");
                        throw null;
                    }
                    arrayList.remove(c10157);
                    z = true;
                }
            }
            if (!z) {
                if (m13378()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C10157) it2.next()).f32522.f28301.f26659 = AbstractC22664.f73590;
                    }
                    return;
                }
                try {
                    c2596.m8711(C14769.m35539((Iterable) m13377().f32520.mo4424()), this.f15330);
                    c2596.m8703();
                } catch (C7400 unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13378() {
        if (this == this.f15332.f41172) {
            return false;
        }
        if (this.f15331 == EnumC16124.SPECULATIVE) {
            return true;
        }
        return this.f15334.m13378();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10157 m13377() {
        C9636 c9636;
        C12863 c12863 = this.f15332;
        C14528 c14528 = c12863.f41182;
        C1083 c1083 = this.f15330;
        C2596 c2596 = this.f15335;
        c14528.m35063(c2596, c1083);
        C14528 c14529 = c12863.f41182;
        C17359.requireNonNull(c14529);
        final C2925 c2925 = new C2925(new C8891(c14529, c2596, c12863.f41178.f79958));
        ArrayList arrayList = this.f15329;
        C14769<C24330> c14769 = (C14769) C1170.stream(arrayList).map(new C0490(this)).collect(C14769.m35544());
        for (C24330 c24330 : c14769) {
            for (C24330 c24331 : c14769) {
                if (c24330 != c24331) {
                    Set setMo4425 = ((C10157) c24331.f21176).f32520.mo4425();
                    for (AbstractC22664 abstractC22664 : ((C10157) c24330.f21176).f32520.mo4424()) {
                        Iterator it = c2925.f9583.iterator();
                        do {
                            if (!it.hasNext()) {
                                c9636 = null;
                                break;
                            }
                            c9636 = (C9636) it.next();
                        } while (!((C18499) c9636.f21176).contains(abstractC22664));
                        if (c9636 != null) {
                            if (C1170.stream(setMo4425).map(new Function() { // from class: l.ۛ۬᩺
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo10608andThen(Function function) {
                                    return C24247.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C24247.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    AbstractC22664 abstractC22665 = (AbstractC22664) obj;
                                    for (C9636 c9637 : c2925.f9583) {
                                        if (((C18499) c9637.f21176).contains(abstractC22665)) {
                                            return c9637;
                                        }
                                    }
                                    return null;
                                }
                            }).anyMatch(new C4110(1, c9636.m25148()))) {
                                c24330.f78906.add(c24331);
                                break;
                            }
                        }
                    }
                }
            }
        }
        C14769 c147610 = (C14769) C18917.m43925(c14769).get(0);
        return (C10157) (c147610.m35551() == 1 ? ((C24330) c147610.get(0)).f21176 : arrayList.get(0));
    }
}
