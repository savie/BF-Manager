package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18633 extends AbstractC3110 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC3110 f60404;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8050 f60405;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f60406;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BiConsumer f60407;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23800 f60408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14023 f60409;

    public C18633(C23800 c23800, AbstractC3110 abstractC3110, AbstractC11242 abstractC11242, InterfaceC8050 interfaceC8050, C14023 c14023, BiConsumer biConsumer) {
        super(abstractC3110.f11719);
        this.f60408 = c23800;
        this.f60404 = abstractC3110;
        this.f60406 = abstractC11242;
        this.f60405 = interfaceC8050;
        this.f60409 = c14023;
        this.f60407 = biConsumer;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo3802(Predicate predicate, EnumC10167 enumC10167) {
        C14023 c14023 = this.f60409;
        AbstractC11242 abstractC11242 = this.f60406;
        if (abstractC11242 != null) {
            return mo3803(abstractC11242, predicate, enumC10167);
        }
        try {
            final C21825 c21825M41743 = new C15106(this, c14023.f46087, predicate, enumC10167).m41743((AbstractC0618) this.f60404.f11719, C21825.m48588());
            return new Iterable() { // from class: l.ۘ۠ۤ
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM45348 = C20021.m45348(c21825M41743, new C7497(9));
                    final C18633 c18633 = this.f14154;
                    return C20021.m45349(itM45348, new Predicate() { // from class: l.᩺۠ۤ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C8512.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C8512.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C18633 c18634 = c18633;
                            return c18634.f60405.mo21181(c18634.f60404, (AbstractC23903) obj);
                        }
                    });
                }
            };
        } catch (C4146 e) {
            this.f60407.accept(c14023, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo3803(AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        C14023 c14023 = this.f60409;
        AbstractC11242 abstractC11243 = this.f60406;
        if (abstractC11243 != null && abstractC11243 != abstractC11242) {
            return Collections.EMPTY_LIST;
        }
        try {
            final C21825 c21825M41743 = new C21455(this, c14023.f46087, abstractC11242, predicate, enumC10167).m41743((AbstractC0618) this.f60404.f11719, C21825.m48588());
            return new Iterable() { // from class: l.۬۠ۤ
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM45348 = C20021.m45348(c21825M41743, new C7497(9));
                    final C18633 c18633 = this.f43315;
                    return C20021.m45349(itM45348, new Predicate() { // from class: l.ۜ۠ۤ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C8512.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C8512.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C18633 c18634 = c18633;
                            return c18634.f60405.mo21181(c18634.f60404, (AbstractC23903) obj);
                        }
                    });
                }
            };
        } catch (C4146 e) {
            this.f60407.accept(c14023, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3110 mo9328(AbstractC23903 abstractC23903) {
        return this.f60404;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43091() {
        return this.f60409.f46087;
    }
}
