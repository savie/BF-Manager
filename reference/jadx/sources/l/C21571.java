package l;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final class C21571 extends AbstractC21988 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f68921;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21571(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664) {
        super(c14528, c8274, abstractC22664);
        this.f68921 = c14528;
    }

    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21988 mo13163(C8274 c8274) {
        return new C21571(this.f68921, c8274, this.f70942);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.ܰ᩷ۘ] */
    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public final void mo13164(C2596 c2596, C1083 c1083) {
        EnumC0816[] enumC0816Arr = {EnumC0816.f3091};
        C8274 c8274 = this.f70943;
        InterfaceC20670 interfaceC20670Stream = C1170.stream(c8274.m22332(enumC0816Arr));
        C14528 c14528 = this.f68921;
        final C24705 c24705 = c14528.f45697;
        C17359.requireNonNull(c24705);
        final ?? r4 = new BiPredicate() { // from class: l.ܰ᩷ۘ
            public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return C20517.$default$and(this, biPredicate);
            }

            public /* synthetic */ BiPredicate negate() {
                return C20517.$default$negate(this);
            }

            public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return C20517.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return c24705.m55149((AbstractC22664) obj, (AbstractC22664) obj2);
            }
        };
        for (AbstractC22664 abstractC22664 : (C14769) interfaceC20670Stream.collect(C15448.of(new Supplier() { // from class: l.ۢ۟᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                C24705 c24706 = c24705;
                c24706.getClass();
                return new C8820(c24706, r4);
            }
        }, new C1035(), new C9237(), new C2526(), new EnumC13211[0]))) {
            AbstractC22664 abstractC22665 = this.f70942;
            if (abstractC22665 != abstractC22664 && abstractC22665 != abstractC22664) {
                EnumC21172 enumC21172 = EnumC21172.WILDCARD;
                if (!abstractC22665.m51067(enumC21172) && !abstractC22664.m51067(enumC21172)) {
                    for (C5558 c5558 : c14528.m35059(this.f70942, abstractC22664)) {
                        C14769 c14769Mo9323 = ((AbstractC22664) c5558.f19300).mo9323();
                        C14769 c14769Mo9324 = ((AbstractC22664) c5558.f19301).mo9323();
                        while (c14769Mo9323.m35550() && c14769Mo9324.m35550()) {
                            AbstractC22664 abstractC22666 = (AbstractC22664) c14769Mo9323.f48335;
                            EnumC21172 enumC21173 = EnumC21172.WILDCARD;
                            if (!abstractC22666.m51067(enumC21173) && !((AbstractC22664) c14769Mo9324.f48335).m51067(enumC21173)) {
                                if (!this.f70944.m35067(EnumC15274.f49927, c2596.m8710((AbstractC22664) c14769Mo9323.f48335), c2596.m8710((AbstractC22664) c14769Mo9324.f48335), (C1083) null)) {
                                    c14528.m35064(c8274, EnumC0816.f3091);
                                }
                            }
                            c14769Mo9323 = c14769Mo9323.f48336;
                            c14769Mo9324 = c14769Mo9324.f48336;
                        }
                        C11972.m30026(c14769Mo9323.isEmpty() && c14769Mo9324.isEmpty());
                    }
                }
            }
        }
    }
}
