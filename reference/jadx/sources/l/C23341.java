package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6FE */
/* JADX INFO: loaded from: classes.dex */
public final class C23341 implements InterfaceC24444 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1610 f75606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6187 f75603 = new C6187();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6187 f75609 = new C6187();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6187 f75605 = new C6187();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6187 f75610 = new C6187();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6187 f75608 = new C6187();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6187 f75607 = new C6187();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6187 f75602 = new C6187();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f75604 = new HashMap();

    public C23341(C1610 c1610) {
        this.f75606 = c1610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52501() {
        this.f75603.m17829(new C11406());
        this.f75609.m17829(new C24833());
        this.f75605.m17829(new C7510(1, this));
        this.f75610.m17829(new BiConsumer() { // from class: l.ܺۚ᩵
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C17467) obj).m40971(this.f53762.m52490(C23341.m52491((Set) obj2)));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        });
        this.f75608.m17829(new BiConsumer() { // from class: l.ܽۚ᩵
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C2551) obj).m8520(this.f56514.m52490(C23341.m52491((Set) obj2)));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        });
        this.f75607.m17829(new BiConsumer() { // from class: l.ۤۚ᩵
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C2551) obj).m8555(this.f33785.m52490(C23341.m52491((Set) obj2)));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        });
        this.f75602.m17829(new C22595());
        C11392.forEach(this.f75604, new C19611(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52509(C24927 c24927) {
        Set set = Collections.EMPTY_SET;
        c24927.m55576(m52491(this.f75603.m17828(c24927)));
        c24927.m55557(m52491(this.f75609.m17828(c24927)));
        c24927.m55580(m52490(m52491(this.f75605.m17828(c24927))));
        for (C17467 c17467 : c24927.getFields()) {
            Set set2 = Collections.EMPTY_SET;
            c17467.m40971(m52490(m52491(this.f75610.m17828(c17467))));
        }
        for (C2551 c2551 : c24927.getMethods()) {
            Set set3 = Collections.EMPTY_SET;
            c2551.m8520(m52490(m52491(this.f75608.m17828(c2551))));
            c2551.m8555(m52490(m52491(this.f75607.m17828(c2551))));
            c2551.m8550(m52491(this.f75602.m17828(c2551)));
            ((Boolean) C11392.getOrDefault(this.f75604, c2551, Boolean.FALSE)).getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52510(final C24927 c24927, AbstractC1566 abstractC1566) {
        m52493(abstractC1566, new Consumer() { // from class: l.᩷ۚ᩵
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                this.f69611.m52511(c24927, (C24927) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52502(C2551 c2551, AbstractC1566 abstractC1566) {
        m52493(abstractC1566, new C16459(1, this, c2551));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52507(InterfaceC20451 interfaceC20451, AbstractC1566 abstractC1566) {
        Consumer consumer;
        int i = C15881.f51640[interfaceC20451.mo8493().ordinal()];
        if (i == 1) {
            final C24927 c24927 = (C24927) interfaceC20451;
            consumer = new Consumer() { // from class: l.۫ۚ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C12312.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.f41248.m52511(c24927, (C24927) obj);
                }
            };
        } else if (i == 2) {
            final C2551 c2551 = (C2551) interfaceC20451;
            consumer = new Consumer() { // from class: l.ۚۚ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C12312.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.f19009.m52506(c2551, (C24927) obj);
                }
            };
        } else if (i == 3) {
            final C24927 c24927M40972 = ((C17467) interfaceC20451).m40972();
            consumer = new Consumer() { // from class: l.֫ۚ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C12312.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.f5859.m52511(c24927M40972, (C24927) obj);
                }
            };
        } else {
            throw new C8597("Unexpected use type: " + interfaceC20451.mo8493());
        }
        m52493(abstractC1566, consumer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52506(C2551 c2551, C24927 c24927) {
        C24927 c24927M8536 = c2551.m8536();
        m52511(c24927M8536, c24927);
        if (c24927M8536 != c24927) {
            this.f75605.m17830(c24927, c2551);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52511(C24927 c24927, C24927 c24928) {
        C24927 c24927M55556 = c24927.m55556();
        this.f75603.m17830(c24927M55556, c24928.m55556());
        C6187 c6187 = this.f75609;
        c6187.m17830(c24928, c24927);
        c6187.m17830(c24928, c24927M55556);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52503(C2551 c2551, C2551 c2552) {
        m52506(c2551, c2552.m8536());
        this.f75608.m17830(c2552, c2551);
        this.f75607.m17830(c2551, c2552);
        if (c2551 == c2552) {
            this.f75604.put(c2551, Boolean.TRUE);
        }
        m52502(c2551, c2552.mo8519());
        C4937.forEach(c2552.mo8532().m49702(), new C14615(this, c2551, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52505(C2551 c2551, C21965 c21965) {
        if (c21965.m49707().equals("java.lang.Object.<init>()V")) {
            return;
        }
        this.f75602.m17830(c2551, c21965);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52504(C2551 c2551, C17467 c17467) {
        m52506(c2551, c17467.m40972());
        this.f75610.m17830(c17467, c2551);
        m52502(c2551, c17467.getType());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52508(InterfaceC20451 interfaceC20451, C14022 c14022) {
        C17467 c17467M5670 = this.f75606.m5670(c14022);
        if (c17467M5670 == null) {
            return;
        }
        int i = C15881.f51640[interfaceC20451.mo8493().ordinal()];
        if (i == 1) {
            m52511((C24927) interfaceC20451, c17467M5670.m40972());
        } else {
            if (i != 2) {
                return;
            }
            m52504((C2551) interfaceC20451, c17467M5670);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52493(AbstractC1566 abstractC1566, Consumer consumer) {
        if (abstractC1566 == null || abstractC1566 == AbstractC1566.f5426) {
            return;
        }
        if (abstractC1566.m5554()) {
            m52493(abstractC1566.mo5555(), consumer);
            return;
        }
        if (abstractC1566.mo5543()) {
            C1610 c1610 = this.f75606;
            c1610.m5691().m49222(abstractC1566);
            C24927 c24927M5672 = c1610.m5672(abstractC1566);
            if (c24927M5672 != null) {
                consumer.n(c24927M5672);
            }
            List listMo5541 = abstractC1566.mo5541();
            if (C4123.m13232((Collection) listMo5541)) {
                Iterator it = listMo5541.iterator();
                while (it.hasNext()) {
                    m52493((AbstractC1566) it.next(), consumer);
                }
            }
            List listMo5549 = abstractC1566.mo5549();
            if (C4123.m13232((Collection) listMo5549)) {
                Iterator it2 = listMo5549.iterator();
                while (it2.hasNext()) {
                    m52493((AbstractC1566) it2.next(), consumer);
                }
            }
            AbstractC1566 abstractC1566Mo5563 = abstractC1566.mo5563();
            if (abstractC1566Mo5563 != null) {
                m52493(abstractC1566Mo5563, consumer);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m52491(Set set) {
        if (set == null || set.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m52490(List list) {
        return C4123.m13226(list, new C15135(0, this));
    }
}
