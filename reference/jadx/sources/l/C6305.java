package l;

import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6305 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f21328 = new WeakHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f21329;

    public C6305(C23800 c23800) {
        this.f21329 = c23800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17594 m17401(final AbstractC0618 abstractC0618) {
        C17594 c17594;
        WeakHashMap weakHashMap = this.f21328;
        C12656 c12656 = (C12656) weakHashMap.get(abstractC0618);
        C23800 c23800 = this.f21329;
        C23549 c23549 = c23800.f76968;
        C5227 c5227M52366 = c23800.m52366(abstractC0618.f77449, false);
        if (c12656 != null && c12656.f42269 == c5227M52366.mo14412()) {
            return c12656.f42268;
        }
        if (!abstractC0618.m52721() || (abstractC0618.mo20276() & 8192) != 0 || abstractC0618.m52707()) {
            C11948 c11948M51914 = c23800.f76968.m51914("not.a.functional.intf", abstractC0618);
            C23945 c23945 = new C23945();
            c23945.f77665 = c11948M51914;
            throw c23945;
        }
        C19003<AbstractC23903> c19003 = new C19003();
        for (final AbstractC23903 abstractC23903 : c5227M52366.mo3802(new C11245(abstractC0618, c23800), EnumC10167.RECURSIVE)) {
            final AbstractC16579 abstractC16579M52409 = c23800.m52409(abstractC23903, abstractC0618.f77449);
            if (c19003.isEmpty()) {
                c19003.m43723(abstractC23903);
            } else {
                if (abstractC23903.f77453 != ((AbstractC23903) c19003.first()).f77453 || !c23800.m52417(abstractC16579M52409, c23800.m52409((AbstractC23903) c19003.first(), abstractC0618.f77449))) {
                    EnumC7654 enumC7654M38160 = C16121.m38160(abstractC0618);
                    C14377 c14377 = C14707.f48054;
                    C11948 c11948M51915 = c23800.f76968.m51914("not.a.functional.intf.1", abstractC0618, c23549.m51910(new C14377("compiler", "incompatible.abstracts", enumC7654M38160, abstractC0618)));
                    C23945 c23946 = new C23945();
                    c23946.f77665 = c11948M51915;
                    throw c23946;
                }
                if (!C9030.stream(c19003).filter(new Predicate() { // from class: l.᩷᩷ۤ
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
                        C6305 c6305 = this.f68788;
                        c6305.getClass();
                        return ((AbstractC23903) obj).f77448.mo50008(abstractC23903.m52720(), c6305.f21329);
                    }
                }).map(new Function() { // from class: l.ܺ᩷ۤ
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
                        return this.f52263.f21329.m52409((AbstractC23903) obj, abstractC0618.f77449);
                    }
                }).anyMatch(new Predicate() { // from class: l.᩶᩷ۤ
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
                        return this.f66184.f21329.m52429((AbstractC16579) obj, abstractC16579M52409, true);
                    }
                })) {
                    c19003.m43723(abstractC23903);
                }
            }
        }
        if (c19003.isEmpty()) {
            EnumC7654 enumC7654M38161 = C16121.m38160(abstractC0618);
            C14377 c14378 = C14707.f48054;
            C11948 c11948M51916 = c23800.f76968.m51914("not.a.functional.intf.1", abstractC0618, c23549.m51910(new C14377("compiler", "no.abstracts", enumC7654M38161, abstractC0618)));
            C23945 c23947 = new C23945();
            c23947.f77665 = c11948M51916;
            throw c23947;
        }
        if (c19003.size() == 1) {
            c17594 = new C17594(this, (AbstractC23903) c19003.first());
        } else {
            c17594 = (C17594) c23800.m52367(c19003.m43726(), abstractC0618.f77449, false).map(new Function() { // from class: l.֡᩷ۤ
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
                    AbstractC23903 abstractC23904 = (AbstractC23903) obj;
                    C6305 c6305 = this.f2794;
                    c6305.getClass();
                    return new C16889(c6305, abstractC23904.mo10880(), abstractC23904);
                }
            }).orElse(null);
            if (c17594 == null) {
                C19003 c19004 = new C19003();
                for (AbstractC23903 abstractC23904 : c19003) {
                    c19004.m43723(c23549.m51914(abstractC23904.f77449.mo33524().m48595() ? "descriptor.throws" : "descriptor", abstractC23904.f77453, abstractC23904.f77449.mo33523(), abstractC23904.f77449.mo16235(), abstractC23904.f77449.mo33524()));
                }
                EnumC7654 enumC7654M38162 = C16121.m38160(abstractC0618);
                C14377 c14379 = C14707.f48054;
                C1675 c1675 = new C1675(c23549.m51910(new C14377("compiler", "incompatible.descs.in.functional.intf", enumC7654M38162, abstractC0618)), c19004.m43726());
                C23945 c23948 = new C23945();
                c23948.f77665 = c1675;
                throw c23948;
            }
        }
        weakHashMap.put(abstractC0618, new C12656(c17594, c5227M52366.mo14412()));
        return c17594;
    }
}
