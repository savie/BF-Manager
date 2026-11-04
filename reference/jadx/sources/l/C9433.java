package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9433 extends AbstractC16344 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24705 f30603;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BiConsumer f30604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC16344 f30605;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11852 f30606;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f30607;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC2722 f30608;

    public C9433(C24705 c24705, AbstractC16344 abstractC16344, AbstractC19728 abstractC19728, InterfaceC2722 interfaceC2722, C11852 c11852, BiConsumer biConsumer) {
        super(abstractC16344.f53083);
        this.f30603 = c24705;
        this.f30605 = abstractC16344;
        this.f30607 = abstractC19728;
        this.f30608 = interfaceC2722;
        this.f30606 = c11852;
        this.f30604 = biConsumer;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7472(Predicate predicate, EnumC13908 enumC13908) {
        C11852 c11852 = this.f30606;
        AbstractC19728 abstractC19728 = this.f30607;
        if (abstractC19728 != null) {
            return mo7473(abstractC19728, predicate, enumC13908);
        }
        try {
            final C14769 c14769M4469 = new C19130(this, c11852.f38180, predicate, enumC13908).m4469((AbstractC22970) this.f30605.f53083, C14769.m35543());
            return new Iterable() { // from class: l.ܿܰ᩺
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM22793 = C8475.m22793(c14769M4469, new C11794(4));
                    final C9433 c9433 = this.f59897;
                    return C8475.m22794(itM22793, new Predicate() { // from class: l.۟ܰ᩺
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C19025.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C19025.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C9433 c9434 = c9433;
                            return c9434.f30608.mo9061(c9434.f30605, (AbstractC11781) obj);
                        }
                    });
                }
            };
        } catch (C21566 e) {
            this.f30604.accept(c11852, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7473(AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        C11852 c11852 = this.f30606;
        AbstractC19728 abstractC19729 = this.f30607;
        if (abstractC19729 != null && abstractC19729 != abstractC19728) {
            return Collections.EMPTY_LIST;
        }
        try {
            final C14769 c14769M4469 = new C10179(this, c11852.f38180, abstractC19728, predicate, enumC13908).m4469((AbstractC22970) this.f30605.f53083, C14769.m35543());
            return new Iterable() { // from class: l.᩶ܰ᩺
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM22793 = C8475.m22793(c14769M4469, new C11794(4));
                    final C9433 c9433 = this.f68054;
                    return C8475.m22794(itM22793, new Predicate() { // from class: l.֡ܰ᩺
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C19025.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C19025.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C9433 c9434 = c9433;
                            return c9434.f30608.mo9061(c9434.f30605, (AbstractC11781) obj);
                        }
                    });
                }
            };
        } catch (C21566 e) {
            this.f30604.accept(c11852, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16344 mo7475(AbstractC11781 abstractC11781) {
        return this.f30605;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24812() {
        return this.f30606.f38180;
    }
}
