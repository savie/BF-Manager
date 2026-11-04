package l;

import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5575 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f19360 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f19361;

    public C5575(C24705 c24705) {
        this.f19361 = c24705;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13032 m16519(final AbstractC22970 abstractC22970) {
        C13032 c13032;
        WeakHashMap weakHashMap = this.f19360;
        C15269 c15269 = (C15269) weakHashMap.get(abstractC22970);
        C24705 c24705 = this.f19361;
        C19991 c19991 = c24705.f79965;
        C24352 c24352M55106 = c24705.m55106(abstractC22970.f38067, false);
        if (c15269 != null && c15269.f49918 == c24352M55106.mo46991()) {
            return c15269.f49917;
        }
        if (!abstractC22970.m29587() || (abstractC22970.mo29591() & 8192) != 0 || abstractC22970.m29562()) {
            C17007 c17007M45980 = c24705.f79965.m45980("not.a.functional.intf", abstractC22970);
            C11540 c11540 = new C11540();
            c11540.f36297 = c17007M45980;
            throw c11540;
        }
        C18499<AbstractC11781> c18499 = new C18499();
        for (final AbstractC11781 abstractC11781 : c24352M55106.mo7472(new C1846(abstractC22970, c24705), EnumC13908.RECURSIVE)) {
            final AbstractC22664 abstractC22664M55126 = c24705.m55126(abstractC11781, abstractC22970.f38067);
            if (c18499.isEmpty()) {
                c18499.m43089(abstractC11781);
            } else {
                if (abstractC11781.f38072 != ((AbstractC11781) c18499.first()).f38072 || !c24705.m55121(abstractC22664M55126, c24705.m55126((AbstractC11781) c18499.first(), abstractC22970.f38067))) {
                    EnumC4960 enumC4960M27726 = C10925.m27726(abstractC22970);
                    C15515 c15515 = C19859.f63823;
                    C17007 c17007M45981 = c24705.f79965.m45980("not.a.functional.intf.1", abstractC22970, c19991.m45975(new C15515("compiler", "incompatible.abstracts", enumC4960M27726, abstractC22970)));
                    C11540 c11541 = new C11540();
                    c11541.f36297 = c17007M45981;
                    throw c11541;
                }
                if (!C1170.stream(c18499).filter(new Predicate() { // from class: l.ۙۢ᩺
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
                        C5575 c5575 = this.f16886;
                        c5575.getClass();
                        return ((AbstractC11781) obj).f38069.mo29596(abstractC11781.m29558(), c5575.f19361);
                    }
                }).map(new Function() { // from class: l.᩷ۢ᩺
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
                        return this.f70929.f19361.m55126((AbstractC11781) obj, abstractC22970.f38067);
                    }
                }).anyMatch(new Predicate() { // from class: l.ۤۢ᩺
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
                        return this.f34254.f19361.m55165((AbstractC22664) obj, abstractC22664M55126, true);
                    }
                })) {
                    c18499.m43089(abstractC11781);
                }
            }
        }
        if (c18499.isEmpty()) {
            EnumC4960 enumC4960M27727 = C10925.m27726(abstractC22970);
            C15515 c15516 = C19859.f63823;
            C17007 c17007M45982 = c24705.f79965.m45980("not.a.functional.intf.1", abstractC22970, c19991.m45975(new C15515("compiler", "no.abstracts", enumC4960M27727, abstractC22970)));
            C11540 c11542 = new C11540();
            c11542.f36297 = c17007M45982;
            throw c11542;
        }
        if (c18499.size() == 1) {
            c13032 = new C13032(this, (AbstractC11781) c18499.first());
        } else {
            c13032 = (C13032) c24705.m55099(c18499.m43093(), abstractC22970.f38067, false).map(new Function() { // from class: l.᩸ۢ᩺
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
                    AbstractC11781 abstractC11782 = (AbstractC11781) obj;
                    C5575 c5575 = this.f73771;
                    c5575.getClass();
                    return new C19745(c5575, abstractC11782.mo10410(), abstractC11782);
                }
            }).orElse(null);
            if (c13032 == null) {
                C18499 c184910 = new C18499();
                for (AbstractC11781 abstractC11782 : c18499) {
                    c184910.m43089(c19991.m45980(abstractC11782.f38067.mo50622().m35550() ? "descriptor.throws" : "descriptor", abstractC11782.f38072, abstractC11782.f38067.mo50621(), abstractC11782.f38067.mo31585(), abstractC11782.f38067.mo50622()));
                }
                EnumC4960 enumC4960M27728 = C10925.m27726(abstractC22970);
                C15515 c15517 = C19859.f63823;
                C13278 c13278 = new C13278(c19991.m45975(new C15515("compiler", "incompatible.descs.in.functional.intf", enumC4960M27728, abstractC22970)), c184910.m43093());
                C11540 c11543 = new C11540();
                c11543.f36297 = c13278;
                throw c11543;
            }
        }
        weakHashMap.put(abstractC22970, new C15269(c13032, c24352M55106.mo46991()));
        return c13032;
    }
}
