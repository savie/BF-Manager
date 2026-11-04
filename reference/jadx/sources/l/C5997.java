package l;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5997 extends AbstractC2618 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f20519;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997(C17929 c17929) {
        super(c17929, EnumC10712.MEMBERS_PHASE, null);
        this.f20519 = c17929;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ */
    public final void mo7699(C3168 c3168) {
        boolean z;
        C7093 c25389;
        long j;
        final C6633 c6633M41862;
        C14769 c14769M35549;
        C6633 c6633;
        C18565 c18565;
        AbstractC11781 abstractC11781;
        C7926 c7926 = c3168.f10279;
        C24550 c24550 = c7926.f26345;
        c24550.mo29590();
        if ((c24550.f38071 & 512) != 0) {
            z = false;
            break;
        }
        C14769 c14769 = c7926.f26344;
        while (true) {
            if (!c14769.m35550()) {
                z = true;
                break;
            } else {
                if (C11239.m28348((AbstractC8036) c14769.f48335)) {
                    z = false;
                    break;
                }
                c14769 = c14769.f48336;
            }
        }
        boolean zM54827 = c24550.m54827();
        C17929 c17929 = this.f20519;
        if (!z || zM54827) {
            c25389 = null;
        } else {
            c25389 = new C7093(c17929, c24550);
            if (c24550.f38072.isEmpty() && (abstractC11781 = (c18565 = (C18565) c3168.f10274.f10273).f60318) != null) {
                if (abstractC11781.f38066 != EnumC13603.f43208) {
                    c25389 = new C8584(c17929, c24550, (C10377) abstractC11781, c18565.f60321);
                } else {
                    c25389 = null;
                }
            }
        }
        if (zM54827) {
            if (z) {
                j = 2305843009213693952L;
                c6633 = null;
            } else {
                C7926 c7927 = c3168.f10279;
                C14769 c14769M55154 = c17929.f58720.m55154(C11239.m28326(c7927).m35547((Function) new C14305(3)));
                Iterator it = c7927.f26344.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 2305843009213693952L;
                        c6633 = null;
                        break;
                    }
                    AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
                    if (C11239.m28348(abstractC8036)) {
                        c6633 = (C6633) abstractC8036;
                        j = 2305843009213693952L;
                        if (c17929.f58720.m55148(c17929.f58720.m55154((C14769) C1170.stream(c6633.f22145).map(new C15753(2)).collect(C14769.m35544())), c14769M55154)) {
                            break;
                        }
                    }
                }
                if (c6633 == null) {
                }
                if (c6633 != null) {
                    c6633.f22152.f38071 |= j;
                }
            }
            c25389 = new C25389(c17929, c24550, C11239.m28326(c7926));
            if (c6633 != null) {
                c6633.f22152.f38071 |= j;
            }
        } else {
            j = 2305843009213693952L;
        }
        if (c25389 != null) {
            c17929.f58725.m50053(c24550, (InterfaceC5075) c7926);
            C15714 c15714 = c17929.f58722;
            c15714.f51040 = c7926.f26658;
            c6633M41862 = c17929.m41862(c15714, c25389);
            c7926.f26344 = c7926.f26344.m35552(c6633M41862);
        } else {
            c6633M41862 = null;
        }
        if (!c24550.m54827()) {
            m8758(c24550, c3168);
        }
        if (!c7926.f26343.isEmpty()) {
            for (C16239 c16239 : c7926.f26343) {
                c17929.f58725.m50009(c16239, (C17969) c16239.f26659);
            }
        }
        if ((c7926.f26341.f15825 & 16384) != 0 && !c7926.f26345.f38067.m51067(EnumC21172.ERROR) && (c17929.f58720.m55137(c7926.f26345.f38067).f73596.mo29591() & 16384) == 0) {
            c17929.f58738.m11696((AbstractC8036) c17929.f58722.m37511(c17929.f58722.m37507(9L), c17929.f58729.f49852, c17929.f58722.m37557(new C2832(c7926.f26345.f38067, c17929.f58739.f48271)), C14769.m35543(), null, C14769.m35543(), C14769.m35543(), null, null), c3168);
            C15714 c15715 = c17929.f58722;
            C4395 c4395M37507 = c17929.f58722.m37507(9L);
            AbstractC19728 abstractC19728 = c17929.f58729.f49817;
            AbstractC22295 abstractC22295M37557 = c17929.f58722.m37557(c7926.f26345.f38067);
            C14769 c14769M35543 = C14769.m35543();
            C15714 c15716 = c17929.f58722;
            C4395 c4395M37508 = c17929.f58722.m37507(8589967360L);
            AbstractC22712 abstractC22712 = c17929.f58729.f49864;
            abstractC22712.getClass();
            char[] charArray = "name".toCharArray();
            c17929.f58738.m11696((AbstractC8036) c15715.m37511(c4395M37507, abstractC19728, abstractC22295M37557, c14769M35543, null, C14769.of((Object) c15716.m37520(c4395M37508, abstractC22712.mo2069(charArray, charArray.length), c17929.f58722.m37557(c17929.f58739.f48282), (AbstractC22295) null)), C14769.m35543(), null, null), c3168);
        }
        boolean z2 = (c7926.f26345.f38071 & j) != 0;
        if (z2) {
            C14769 c14769M28326 = C11239.m28326(c7926);
            if (c14769M28326 == null) {
                c14769M28326 = null;
            } else {
                Iterator it2 = c14769M28326.iterator();
                while (it2.hasNext()) {
                    AbstractC8036.class.cast(it2.next());
                }
            }
            c14769M35549 = c14769M28326.m35549((C14769) C1170.stream(c7926.f26344).filter(new Predicate() { // from class: l.۫᩻ۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    AbstractC8036 abstractC8037 = (AbstractC8036) obj;
                    return C11239.m28348(abstractC8037) && abstractC8037 != c6633M41862;
                }
            }).collect(C14769.m35544()));
        } else {
            c14769M35549 = null;
        }
        C3605 c3605 = c17929.f58738;
        c3605.getClass();
        for (C14769 c14769M35548 = z2 ? c7926.f26344.m35548(c14769M35549) : c7926.f26344; c14769M35548.m35550(); c14769M35548 = c14769M35548.f48336) {
            c3605.m11696((AbstractC8036) c14769M35548.f48335, c3168);
        }
        if (z2) {
            if (C17929.m41842(c17929, c7926.f26345, c17929.f58729.f49848, C14769.m35543()) == null) {
                c17929.f58738.m11696((AbstractC8036) c17929.f58722.m37511(c17929.f58722.m37507(2305843009230471185L), c17929.f58729.f49848, c17929.f58722.m37557(c17929.f58739.f48282), C14769.m35543(), null, C14769.m35543(), C14769.m35543(), null, null), c3168);
            }
            if (C17929.m41842(c17929, c7926.f26345, c17929.f58729.f49834, C14769.m35543()) == null) {
                c17929.f58738.m11696((AbstractC8036) c17929.f58722.m37511(c17929.f58722.m37507(2305843009230471185L), c17929.f58729.f49834, c17929.f58722.m37557(c17929.f58739.f48253), C14769.m35543(), null, C14769.m35543(), C14769.m35543(), null, null), c3168);
            }
            if (C17929.m41842(c17929, c7926.f26345, c17929.f58729.f49845, C14769.of((Object) c17929.f58739.f48286)) == null) {
                C15714 c15717 = c17929.f58722;
                C4395 c4395M37509 = c17929.f58722.m37507(2305843009230471185L);
                AbstractC19728 abstractC19729 = c17929.f58729.f49845;
                AbstractC22295 abstractC22295M37558 = c17929.f58722.m37557(c17929.f58739.f48255);
                C14769 c14769M35544 = C14769.m35543();
                C15714 c15718 = c17929.f58722;
                C4395 c4395M375010 = c17929.f58722.m37507(8589934592L);
                AbstractC22712 abstractC22713 = c17929.f58729.f49864;
                abstractC22713.getClass();
                char[] charArray2 = "o".toCharArray();
                c17929.f58738.m11696((AbstractC8036) c15717.m37511(c4395M37509, abstractC19729, abstractC22295M37558, c14769M35544, null, C14769.of((Object) c15718.m37520(c4395M375010, abstractC22713.mo2069(charArray2, charArray2.length), c17929.f58722.m37557(c17929.f58739.f48286), (AbstractC22295) null)), C14769.m35543(), null, null), c3168);
            }
            C14769<C12510> c14769M28327 = C11239.m28326(c7926);
            for (C12510 c12510 : c14769M28327) {
                c12510.f40170.f15825 &= -17179869185L;
                c12510.f40168.f38071 &= -17179869185L;
            }
            C1170.stream(c14769M28327).filter(new C18035(1, this)).forEach(new C0136(1, this, c3168));
        }
        if (c7926.f26345.mo51844()) {
            C11972.m30026(c7926.f26345.f38070.mo11630());
            C24550 c24551 = c7926.f26345;
            c24551.m54830(new C19723(c24551, c17929.f58734.m28993()));
        }
        if (c17929.f58737) {
            c17929.f58730.m30496(c3168, (C7926) c3168.f10273);
            c17929.f58730.m30498(c3168, (C7926) c3168.f10273);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17429(C5997 c5997, C3168 c3168, C12510 c12510) {
        C14769 c14769M23492;
        C17929 c17929 = c5997.f20519;
        C10377 c10377M41842 = C17929.m41842(c17929, c3168.f10279.f26345, c12510.f40168.f38072, C14769.m35543());
        C5816 c5816 = c12510.f40168;
        C22224 c22224M54828 = ((C24550) c5816.f38069).m54828(c5816);
        if (c10377M41842 == null || (c10377M41842.f38071 & 16777216) != 0) {
            C15714 c15714 = c17929.f58722;
            c15714.f51040 = c12510.f26658;
            C8781 c8781 = new C8781(c15714);
            if (!c22224M54828.m50283().isEmpty()) {
                c14769M23492 = c8781.m23492((Object) null, c22224M54828.m50283());
            } else {
                c14769M23492 = c22224M54828.m50283();
            }
            C12510 c12511 = (C12510) C1170.stream(C11239.m28326((C7926) c3168.f10273)).filter(new C7594(2, c12510)).findAny().get();
            C15714 c15715 = c17929.f58722;
            c15715.f51040 = c12510.f26658;
            C6633 c6633M37511 = c15715.m37511(c17929.f58722.m37564(16777217L, c14769M23492), c12510.f40168.f38072, (AbstractC22295) c8781.mo23491(c12511.f40166, (Object) null), C14769.m35543(), null, C14769.m35543(), C14769.m35543(), null, null);
            c17929.f58738.m11696((AbstractC8036) c6633M37511, c3168);
            c22224M54828.f71601 = c6633M37511.f22152;
            c22224M54828.f71603 = c6633M37511;
            return;
        }
        c22224M54828.f71601 = c10377M41842;
    }
}
