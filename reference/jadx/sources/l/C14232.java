package l;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14232 extends AbstractC9998 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f46631;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14232(C13609 c13609) {
        super(c13609, EnumC5992.MEMBERS_PHASE, null);
        this.f46631 = c13609;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ */
    public final void mo1178(final C4603 c4603) {
        boolean z;
        C20581 c2941;
        long j;
        C23195 c23195M33277;
        C21825 c21825M48594;
        C23195 c23195;
        C8378 c8378;
        AbstractC23903 abstractC23903;
        C8753 c8753 = c4603.f16301;
        C22492 c22492 = c8753.f30086;
        c22492.mo49994();
        if ((c22492.f77447 & 512) != 0) {
            z = false;
            break;
        }
        C21825 c21825 = c8753.f30090;
        while (true) {
            if (!c21825.m48595()) {
                z = true;
                break;
            } else {
                if (C3128.m9466((AbstractC8774) c21825.f70876)) {
                    z = false;
                    break;
                }
                c21825 = c21825.f70877;
            }
        }
        boolean zM50010 = c22492.m50010();
        C13609 c13609 = this.f46631;
        if (!z || zM50010) {
            c2941 = null;
        } else {
            c2941 = new C20581(c13609, c22492);
            if (c22492.f77453.isEmpty() && (abstractC23903 = (c8378 = (C8378) c4603.f16297.f16296).f29097) != null) {
                if (abstractC23903.f77452 != EnumC10477.f35866) {
                    c2941 = new C7175(c13609, c22492, (C18258) abstractC23903, c8378.f29093);
                } else {
                    c2941 = null;
                }
            }
        }
        if (zM50010) {
            if (z) {
                j = 2305843009213693952L;
                c23195 = null;
            } else {
                C8753 c8754 = c4603.f16301;
                C21825 c21825M52424 = c13609.f44895.m52424(C3128.m9444(c8754).m48592((Function) new C22057(7)));
                Iterator it = c8754.f30090.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 2305843009213693952L;
                        c23195 = null;
                        break;
                    }
                    AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
                    if (C3128.m9466(abstractC8774)) {
                        c23195 = (C23195) abstractC8774;
                        j = 2305843009213693952L;
                        if (c13609.f44895.m52401(c13609.f44895.m52424((C21825) C9030.stream(c23195.f75270).map(new C16177(6)).collect(C21825.m48587())), c21825M52424)) {
                            break;
                        }
                    }
                }
                if (c23195 == null) {
                }
                if (c23195 != null) {
                    c23195.f75263.f77447 |= j;
                }
            }
            c2941 = new C2941(c13609, c22492, C3128.m9444(c8753));
            if (c23195 != null) {
                c23195.f75263.f77447 |= j;
            }
        } else {
            j = 2305843009213693952L;
        }
        if (c2941 != null) {
            c13609.f44902.m47348(c22492, (InterfaceC12260) c8753);
            C5286 c5286 = c13609.f44896;
            c5286.f18294 = c8753.f30189;
            c23195M33277 = c13609.m33277(c5286, c2941);
            c8753.f30090 = c8753.f30090.m48597(c23195M33277);
        } else {
            c23195M33277 = null;
        }
        if (!c22492.m50010()) {
            m25266(c22492, c4603);
        }
        if (!c8753.f30088.isEmpty()) {
            for (C22179 c22179 : c8753.f30088) {
                c13609.f44902.m47305(c22179, (C22929) c22179.f30190);
            }
        }
        if ((c8753.f30089.f70567 & 16384) != 0 && !c8753.f30086.f77449.m39001(EnumC6617.ERROR) && (c13609.f44895.m52432(c8753.f30086.f77449).f53222.mo20276() & 16384) == 0) {
            c13609.f44904.m28956((AbstractC8774) c13609.f44896.m14624(c13609.f44896.m14618(9L), c13609.f44901.f77639, c13609.f44896.m14634(new C8777(c8753.f30086.f77449, c13609.f44893.f14258)), C21825.m48588(), null, C21825.m48588(), C21825.m48588(), null, null), c4603);
            C5286 c5287 = c13609.f44896;
            C21783 c21783M14618 = c13609.f44896.m14618(9L);
            AbstractC11242 abstractC11242 = c13609.f44901.f77616;
            AbstractC5930 abstractC5930M14634 = c13609.f44896.m14634(c8753.f30086.f77449);
            C21825 c21825M48588 = C21825.m48588();
            C5286 c5288 = c13609.f44896;
            C21783 c21783M14619 = c13609.f44896.m14618(8589967360L);
            AbstractC6302 abstractC6302 = c13609.f44901.f77631;
            abstractC6302.getClass();
            char[] charArray = "name".toCharArray();
            c13609.f44904.m28956((AbstractC8774) c5287.m14624(c21783M14618, abstractC11242, abstractC5930M14634, c21825M48588, null, C21825.of((Object) c5288.m14596(c21783M14619, abstractC6302.mo17390(charArray, charArray.length), c13609.f44896.m14634(c13609.f44893.f14220), (AbstractC5930) null)), C21825.m48588(), null, null), c4603);
        }
        boolean z2 = (c8753.f30086.f77447 & j) != 0;
        if (z2) {
            C21825 c21825M9444 = C3128.m9444(c8753);
            if (c21825M9444 == null) {
                c21825M9444 = null;
            } else {
                Iterator it2 = c21825M9444.iterator();
                while (it2.hasNext()) {
                    AbstractC8774.class.cast(it2.next());
                }
            }
            c21825M48594 = c21825M9444.m48594((C21825) C9030.stream(c8753.f30090).filter(new C20522(3, c23195M33277)).collect(C21825.m48587()));
        } else {
            c21825M48594 = null;
        }
        C11619 c11619 = c13609.f44904;
        c11619.getClass();
        for (C21825 c21825M48593 = z2 ? c8753.f30090.m48593(c21825M48594) : c8753.f30090; c21825M48593.m48595(); c21825M48593 = c21825M48593.f70877) {
            c11619.m28956((AbstractC8774) c21825M48593.f70876, c4603);
        }
        if (z2) {
            if (C13609.m33259(c13609, c8753.f30086, c13609.f44901.f77635, C21825.m48588()) == null) {
                c13609.f44904.m28956((AbstractC8774) c13609.f44896.m14624(c13609.f44896.m14618(2305843009230471185L), c13609.f44901.f77635, c13609.f44896.m14634(c13609.f44893.f14220), C21825.m48588(), null, C21825.m48588(), C21825.m48588(), null, null), c4603);
            }
            if (C13609.m33259(c13609, c8753.f30086, c13609.f44901.f77648, C21825.m48588()) == null) {
                c13609.f44904.m28956((AbstractC8774) c13609.f44896.m14624(c13609.f44896.m14618(2305843009230471185L), c13609.f44901.f77648, c13609.f44896.m14634(c13609.f44893.f14232), C21825.m48588(), null, C21825.m48588(), C21825.m48588(), null, null), c4603);
            }
            if (C13609.m33259(c13609, c8753.f30086, c13609.f44901.f77561, C21825.of((Object) c13609.f44893.f14275)) == null) {
                C5286 c5289 = c13609.f44896;
                C21783 c21783M146110 = c13609.f44896.m14618(2305843009230471185L);
                AbstractC11242 abstractC11243 = c13609.f44901.f77561;
                AbstractC5930 abstractC5930M14635 = c13609.f44896.m14634(c13609.f44893.f14263);
                C21825 c21825M48589 = C21825.m48588();
                C5286 c52810 = c13609.f44896;
                C21783 c21783M146111 = c13609.f44896.m14618(8589934592L);
                AbstractC6302 abstractC6303 = c13609.f44901.f77631;
                abstractC6303.getClass();
                char[] charArray2 = "o".toCharArray();
                c13609.f44904.m28956((AbstractC8774) c5289.m14624(c21783M146110, abstractC11243, abstractC5930M14635, c21825M48589, null, C21825.of((Object) c52810.m14596(c21783M146111, abstractC6303.mo17390(charArray2, charArray2.length), c13609.f44896.m14634(c13609.f44893.f14275), (AbstractC5930) null)), C21825.m48588(), null, null), c4603);
            }
            C21825<C6656> c21825M9445 = C3128.m9444(c8753);
            for (C6656 c6656 : c21825M9445) {
                c6656.f22476.f70567 &= -17179869185L;
                c6656.f22475.f77447 &= -17179869185L;
            }
            C9030.stream(c21825M9445).filter(new Predicate() { // from class: l.ۧۖ۟
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
                    C13609 c136010 = this.f36519.f46631;
                    return C13609.m33259(c136010, c136010.f44893.f14275.f53222, ((C6656) obj).f22478, C21825.m48588()) == null;
                }
            }).forEach(new Consumer() { // from class: l.᩻ۖ۟
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C14232.m34342(this.f75801, c4603, (C6656) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
        if (c8753.f30086.mo2877()) {
            C6171.m17176(c8753.f30086.f77451.mo1180());
            C22492 c22493 = c8753.f30086;
            c22493.m50001(new C16163(c22493, c13609.f44890.m40865()));
        }
        if (c13609.f44909) {
            c13609.f44891.m14389(c4603, (C8753) c4603.f16296);
            c13609.f44891.m14391(c4603, (C8753) c4603.f16296);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34342(C14232 c14232, C4603 c4603, C6656 c6656) {
        C21825 c21825M1922;
        C13609 c13609 = c14232.f46631;
        C18258 c18258M33259 = C13609.m33259(c13609, c4603.f16301.f30086, c6656.f22475.f77453, C21825.m48588());
        C6263 c6263 = c6656.f22475;
        C16142 c16142M49998 = ((C22492) c6263.f77448).m49998(c6263);
        if (c18258M33259 == null || (c18258M33259.f77447 & 16777216) != 0) {
            C5286 c5286 = c13609.f44896;
            c5286.f18294 = c6656.f30189;
            C0306 c0306 = new C0306(c5286);
            if (!c16142M49998.m38213().isEmpty()) {
                c21825M1922 = c0306.m1922((Object) null, c16142M49998.m38213());
            } else {
                c21825M1922 = c16142M49998.m38213();
            }
            C6656 c6657 = (C6656) C9030.stream(C3128.m9444((C8753) c4603.f16296)).filter(new C6056(1, c6656)).findAny().get();
            C5286 c5287 = c13609.f44896;
            c5287.f18294 = c6656.f30189;
            C23195 c23195M14624 = c5287.m14624(c13609.f44896.m14648(16777217L, c21825M1922), c6656.f22475.f77453, (AbstractC5930) c0306.mo1921(c6657.f22477, (Object) null), C21825.m48588(), null, C21825.m48588(), C21825.m48588(), null, null);
            c13609.f44904.m28956((AbstractC8774) c23195M14624, c4603);
            c16142M49998.f52153 = c23195M14624.f75263;
            c16142M49998.f52151 = c23195M14624;
            return;
        }
        c16142M49998.f52153 = c18258M33259;
    }
}
