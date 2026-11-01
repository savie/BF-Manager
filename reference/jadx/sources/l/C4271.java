package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۘ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4271 extends AbstractC16267 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f15406;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4271(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579) {
        super(c13174, c10229, abstractC16579);
        this.f15406 = c13174;
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16267 mo4311(C10229 c10229) {
        return new C4271(this.f15406, c10229, this.f52427);
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public final void mo4312(C19524 c19524, C10391 c10391) {
        EnumC8112[] enumC8112Arr = {EnumC8112.f28427};
        C10229 c10229 = this.f52428;
        InterfaceC5046 interfaceC5046Stream = C9030.stream(c10229.m26012(enumC8112Arr));
        C13174 c13174 = this.f15406;
        final C23800 c23800 = c13174.f43867;
        C13638.requireNonNull(c23800);
        for (AbstractC16579 abstractC16579 : (C21825) interfaceC5046Stream.collect(C11064.of(new C17906(0, c23800, new BiPredicate() { // from class: l.۬᩻ۤ
            public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return C22623.$default$and(this, biPredicate);
            }

            public /* synthetic */ BiPredicate negate() {
                return C22623.$default$negate(this);
            }

            public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return C22623.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return c23800.m52399((AbstractC16579) obj, (AbstractC16579) obj2);
            }
        }), new C18612(), new C8029(), new C19318(), new EnumC23764[0]))) {
            AbstractC16579 abstractC165710 = this.f52427;
            if (abstractC165710 != abstractC16579 && abstractC165710 != abstractC16579) {
                EnumC6617 enumC6617 = EnumC6617.WILDCARD;
                if (!abstractC165710.m39001(enumC6617) && !abstractC16579.m39001(enumC6617)) {
                    for (C2068 c2068 : c13174.m32578(this.f52427, abstractC16579)) {
                        C21825 c21825Mo1943 = ((AbstractC16579) c2068.f7664).mo1943();
                        C21825 c21825Mo1944 = ((AbstractC16579) c2068.f7665).mo1943();
                        while (c21825Mo1943.m48595() && c21825Mo1944.m48595()) {
                            AbstractC16579 abstractC165711 = (AbstractC16579) c21825Mo1943.f70876;
                            EnumC6617 enumC6618 = EnumC6617.WILDCARD;
                            if (!abstractC165711.m39001(enumC6618) && !((AbstractC16579) c21825Mo1944.f70876).m39001(enumC6618)) {
                                if (!this.f52429.m32586(EnumC12739.f42494, c19524.m44602((AbstractC16579) c21825Mo1943.f70876), c19524.m44602((AbstractC16579) c21825Mo1944.f70876), (C10391) null)) {
                                    c13174.m32582(c10229, EnumC8112.f28427);
                                }
                            }
                            c21825Mo1943 = c21825Mo1943.f70877;
                            c21825Mo1944 = c21825Mo1944.f70877;
                        }
                        C6171.m17176(c21825Mo1943.isEmpty() && c21825Mo1944.isEmpty());
                    }
                }
            }
        }
    }
}
