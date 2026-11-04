package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2596 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f8335;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14528 f8336;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14769 f8337;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C24705 f8338;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f8339;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14769 f8340;

    public C2596() {
        throw null;
    }

    public C2596(C14528 c14528, C14769 c14769, C14769 c147610) {
        this.f8339 = new LinkedHashMap();
        this.f8335 = new HashMap();
        this.f8340 = c14769;
        this.f8337 = c147610;
        this.f8336 = c14528;
        this.f8338 = c14528.f45697;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m8712() {
        return m8689(new C14740(2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m8708() {
        return m8689(new C17546(2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m8692() {
        return m8689(new C13848(3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m8689(Predicate predicate) {
        C18499 c18499 = new C18499();
        Iterator it = this.f8337.iterator();
        while (it.hasNext()) {
            C8274 c8274 = (C8274) ((AbstractC22664) it.next());
            if (predicate.test(c8274)) {
                c18499.m43089(c8274.f72657);
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m8704(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            if (((AbstractC22664) it.next()).m51073(this.f8340)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m8702(AbstractC22664 abstractC22664) {
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22665 : this.f8340) {
            if (abstractC22664.mo9325(abstractC22665)) {
                c18499.m43089(abstractC22665);
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m8713(C14769 c14769) {
        C18499<AbstractC22664> c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43090(m8702((AbstractC22664) it.next()));
        }
        C18499 c184910 = new C18499();
        for (AbstractC22664 abstractC22664 : c18499) {
            if (!c184910.contains(abstractC22664)) {
                c184910.m43089(abstractC22664);
            }
        }
        return c184910.m43093();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m8710(AbstractC22664 abstractC22664) {
        return this.f8338.m55103(abstractC22664, this.f8340, this.f8337);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m8709(C14769 c14769) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43089(m8710((AbstractC22664) it.next()));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m8696(AbstractC22664 abstractC22664) {
        C14769 c14769 = this.f8340;
        C18499 c18499 = new C18499();
        Iterator it = this.f8337.iterator();
        while (it.hasNext()) {
            C8274 c8274 = (C8274) ((AbstractC22664) it.next());
            c18499.m43089(c8274.m22338() != null ? c8274.m22338() : c8274.f72657);
        }
        return this.f8338.m55103(abstractC22664, c14769, c18499.m43093());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m8693(C14769 c14769) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43089(m8696((AbstractC22664) it.next()));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8700(C14769 c14769, InterfaceC10382 interfaceC10382) {
        this.f8339.put(interfaceC10382, m8713(c14769));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8703() {
        m8707(this.f8340.m35548(m8712()));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8707(C14769 c14769) {
        LinkedHashMap linkedHashMap = this.f8339;
        C13037 c13037 = null;
        for (Map.Entry entry : new LinkedHashMap(linkedHashMap).entrySet()) {
            if (!AbstractC22664.m51060((C14769) entry.getValue(), this.f8340.m35548(c14769))) {
                try {
                    ((InterfaceC10382) entry.getKey()).mo2127(this);
                    linkedHashMap.remove(entry.getKey());
                } catch (C13037 e) {
                    if (c13037 == null) {
                        c13037 = e;
                    }
                }
            }
        }
        if (c13037 != null) {
            throw c13037;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m8706() {
        C18499 c18499 = new C18499();
        Iterator it = this.f8337.iterator();
        while (it.hasNext()) {
            C8274 c8274 = (C8274) ((AbstractC22664) it.next());
            C24705 c24705 = this.f8336.f45697;
            C8274 c8275 = new C8274((C17969) c8274.f72657, c8274.f27223, c24705);
            c8274.m22335(c8275, c24705);
            c18499.m43089(c8275);
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8705(C14769 c14769) {
        C11972.m30026(c14769 != null);
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        while (c14769.m35550() && this.f8337.m35550()) {
            C14769 c147610 = this.f8337;
            C8274 c8274 = (C8274) c147610.f48335;
            C8274 c8275 = (C8274) c14769.f48335;
            if (c8274.f72657 == c8275.f72657) {
                c8275.m22335(c8274, this.f8338);
                this.f8337 = this.f8337.f48336;
                c14769 = c14769.f48336;
                c18499.m43089(c8274);
                c184910.m43089(c8274.f72657);
            } else {
                this.f8337 = c147610.f48336;
            }
        }
        this.f8337 = c18499.m43093();
        this.f8340 = c184910.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8698(C2596 c2596, boolean z) {
        C14769 c14769 = c2596.f8340;
        C14769 c14769M35548 = this.f8340.m35548(c14769);
        c14769.getClass();
        c2596.f8340 = c14769M35548.m35549(c14769);
        C14769 c14769M8706 = z ? m8706() : this.f8337;
        C14769 c147610 = c2596.f8337;
        C14769 c14769M35549 = c14769M8706.m35548(c147610);
        c147610.getClass();
        c2596.f8337 = c14769M35549.m35549(c147610);
        Iterator it = this.f8340.iterator();
        while (it.hasNext()) {
            c2596.f8339.put(new InterfaceC10382() { // from class: l.֡ۤۘ
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo2127(C2596 c2597) {
                    this.f1869.m8703();
                }
            }, C14769.of(it.next()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2596 m8691(C14769 c14769, boolean z, final C1083 c1083) {
        if (c14769.m35551() != this.f8340.m35551()) {
            for (AbstractC22664 abstractC22664 : this.f8340) {
                if (!abstractC22664.m51067(EnumC21172.TYPEVAR) || !((C17969) abstractC22664).mo34139()) {
                }
            }
            final C9307 c9307 = new C9307(this);
            C1170.stream(c14769).forEach(new Consumer() { // from class: l.֨ۤۘ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((AbstractC22664) obj).mo9324(c9307, (Object) null);
                }
            });
            if (c9307.f30243.size() != this.f8340.m35551()) {
                C14769 c14769M35539 = C14769.m35539((Iterable) c9307.f30243);
                C14769 c14769M35548 = this.f8340.m35548(c14769M35539);
                C18499 c18499 = new C18499();
                Iterator it = c14769M35539.iterator();
                while (it.hasNext()) {
                    C8274 c8274 = (C8274) m8710((AbstractC22664) it.next());
                    C11972.m30026(c8274.f27219.isEmpty());
                    C17969 c17969 = (C17969) c8274.f72657;
                    InterfaceC2308 interfaceC2308 = c8274.f27223;
                    C24705 c24705 = this.f8338;
                    C8274 c8275 = new C8274(c17969, interfaceC2308, c24705);
                    c8274.m22335(c8275, c24705);
                    EnumC0816[] enumC0816ArrValues = EnumC0816.values();
                    int length = enumC0816ArrValues.length;
                    char c = 0;
                    int i = 0;
                    while (i < length) {
                        EnumC0816 enumC0816 = enumC0816ArrValues[i];
                        EnumC0816[] enumC0816Arr = new EnumC0816[1];
                        enumC0816Arr[c] = enumC0816;
                        c8275.m22333(enumC0816, (C14769) C1170.stream(c8274.m22332(enumC0816Arr)).filter(new C0220(1, c14769M35548)).collect(C14769.m35544()));
                        i++;
                        c = 0;
                    }
                    c18499.m43089(c8275);
                }
                C2596 c2596 = new C2596(this.f8336, c14769M35539, c18499.m43093());
                for (final AbstractC22664 abstractC22665 : c2596.f8340) {
                    c2596.m8700(C14769.of((Object) abstractC22665), new InterfaceC10382() { // from class: l.᩶ۤۘ
                        @Override // l.InterfaceC10382
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo2127(C2596 c2597) {
                            AbstractC22664 abstractC22666 = abstractC22665;
                            AbstractC22664 abstractC22664M8696 = c2597.m8696(abstractC22666);
                            Iterator it2 = ((Set) c9307.f30242.get(abstractC22666)).iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                C2596 c2598 = this.f67777;
                                if (zHasNext) {
                                    ((C8274) c2598.m8710((AbstractC22664) it2.next())).m22339(abstractC22664M8696);
                                } else {
                                    c2598.f8336.m35063(c2598, c1083);
                                    c2598.m8703();
                                    return;
                                }
                            }
                        }
                    });
                }
                if (z) {
                    final C14769 c14769M35549 = c14769M35548.m35548(C14769.m35539((Iterable) c9307.f30241));
                    c2596.m8700(c14769M35539, new InterfaceC10382() { // from class: l.ܿۤۘ
                        @Override // l.InterfaceC10382
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo2127(C2596 c2597) {
                            C14769 c147610 = c14769M35549;
                            C1083 c1084 = c1083;
                            C2596 c2598 = this.f59576;
                            c2598.m8699(c147610, c1084);
                            c2598.m8703();
                        }
                    });
                }
                return c2596;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8690(AbstractC20496 abstractC20496, C1083 c1083) {
        C14528 c14528 = this.f8336;
        C17359.requireNonNull(c14528);
        C8891 c8891 = new C8891(c14528, this, c1083);
        c14528.m35063(this, c1083);
        C2925 c2925 = new C2925(c8891);
        while (!abstractC20496.mo21288()) {
            if (c14528.f45693 != null) {
                C14769 c14769 = c14528.f45703;
                StringBuilder sb = new StringBuilder();
                Iterator it = c2925.f9584.f29052.f8337.iterator();
                while (it.hasNext()) {
                    C8274 c8274 = (C8274) ((AbstractC22664) it.next());
                    sb.append(String.format("var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n", c8274.f72657, c8274.m22332(EnumC0816.f3091), c8274.m22332(EnumC0816.f3093), c8274.m22332(EnumC0816.f3094)));
                }
                c14528.f45703 = c14769.m35552(C18917.m43924(c2925.f9583, "inferenceGraph" + c2925.hashCode(), sb.toString()));
            }
            C9636 c9636Mo34261 = abstractC20496.mo34261(c2925);
            C14769 c14769M35539 = C14769.m35539((Iterable) c9636Mo34261.f21176);
            C14769 c14769M8706 = m8706();
            while (AbstractC22664.m51060(m8712(), c14769M35539)) {
                try {
                    EnumC1434[] enumC1434ArrValues = EnumC1434.values();
                    int length = enumC1434ArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (m8694(c14769M35539, enumC1434ArrValues[i].f5036).m35550()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            throw C14528.m35046((C17007) null);
                        }
                    }
                    c14528.m35063(this, c1083);
                } catch (C13037 unused) {
                    m8705(c14769M8706);
                    c14528.m35066(c14769M35539, this);
                    c14528.m35063(this, c1083);
                }
            }
            C11972.m30026(c2925.f9583.contains(c9636Mo34261));
            c2925.f9583.remove(c9636Mo34261);
            c2925.m9574(c9636Mo34261, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8697(C1083 c1083) {
        C14528 c14528 = this.f8336;
        C17359.requireNonNull(c14528);
        m8690(new C7817(this, c14528), c1083);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8699(C14769 c14769, C1083 c1083) {
        C14528 c14528 = this.f8336;
        C17359.requireNonNull(c14528);
        m8690(new C19004(this, c14528, c14769, c14769), c1083);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8711(C14769 c14769, C1083 c1083) {
        C14528 c14528 = this.f8336;
        C17359.requireNonNull(c14528);
        m8690(new C10053(this, c14528, c14769.m35553(m8712())), c1083);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8701(boolean z, C1083 c1083, EnumSet enumSet) {
        C14528 c14528;
        while (true) {
            C14769 c14769M8694 = m8694(this.f8340, enumSet);
            boolean zIsEmpty = m8712().isEmpty();
            c14528 = this.f8336;
            if (zIsEmpty || z) {
                break;
            }
            if (c14769M8694.isEmpty()) {
                c14528.m35066(m8712(), this);
                break;
            }
            Iterator it = this.f8337.iterator();
            while (it.hasNext()) {
                ((C8274) ((AbstractC22664) it.next())).m22336(this.f8338, c14769M8694, m8693(c14769M8694));
            }
        }
        c14528.m35063(this, c1083);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m8694(C14769 c14769, EnumSet enumSet) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.m35553(m8712()).iterator();
        while (it.hasNext()) {
            C8274 c8274 = (C8274) m8710((AbstractC22664) it.next());
            Iterator it2 = enumSet.iterator();
            while (it2.hasNext()) {
                EnumC3342 enumC3342 = (EnumC3342) it2.next();
                if (enumC3342.mo10994(c8274, this)) {
                    c8274.m22339(enumC3342.mo6372(c8274, this));
                    c18499.m43089(c8274.f72657);
                    break;
                }
            }
        }
        return c18499.m43093();
    }

    public final String toString() {
        return "Inference vars: " + this.f8340 + "\nUndet vars: " + this.f8337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m8695(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, boolean z) {
        HashMap map = this.f8335;
        AbstractC22664 abstractC22665 = (AbstractC22664) map.get(abstractC8036);
        if (abstractC22665 != null) {
            return abstractC22665;
        }
        AbstractC22664 abstractC22664M55158 = this.f8338.m55158(abstractC22664);
        if (abstractC22664M55158 != abstractC22664 && !z) {
            map.put(abstractC8036, abstractC22664M55158);
        }
        return abstractC22664M55158;
    }
}
