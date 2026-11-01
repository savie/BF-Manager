package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩹᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public class C22617 extends AbstractC16267 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public BiFunction f73696;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC8112 f73697;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public BiPredicate f73698;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f73699;

    public C22617(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579, EnumC8112 enumC8112) {
        this(c13174, c10229, abstractC16579, new C5683(), null, enumC8112);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22617(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579, BiFunction biFunction, BiPredicate biPredicate, EnumC8112 enumC8112) {
        super(c13174, c10229, abstractC16579);
        this.f73699 = c13174;
        this.f73697 = enumC8112;
        this.f73696 = biFunction;
        this.f73698 = biPredicate;
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16267 mo4311(C10229 c10229) {
        return new C22617(this.f73699, c10229, this.f52427, this.f73696, this.f73698, this.f73697);
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public void mo4312(C19524 c19524, C10391 c10391) {
        boolean zM32586;
        AbstractC16579 abstractC16579 = this.f52427;
        BiFunction biFunction = this.f73696;
        AbstractC16579 abstractC165710 = (AbstractC16579) biFunction.apply(c19524, abstractC16579);
        this.f52427 = abstractC165710;
        BiPredicate biPredicate = this.f73698;
        if (biPredicate == null || !biPredicate.test(c19524, abstractC165710)) {
            for (EnumC8112 enumC8112 : mo5039()) {
                Iterator it = this.f52428.m26012(enumC8112).iterator();
                while (it.hasNext()) {
                    AbstractC16579 abstractC165711 = (AbstractC16579) biFunction.apply(c19524, (AbstractC16579) it.next());
                    if (biPredicate == null || !biPredicate.test(c19524, abstractC165711)) {
                        AbstractC16579 abstractC165712 = this.f52427;
                        EnumC8112 enumC8113 = this.f73697;
                        boolean zM21372 = enumC8113.m21372(enumC8112);
                        C13174 c13174 = this.f52429;
                        if (zM21372) {
                            zM32586 = c13174.m32586(EnumC12739.f42492, abstractC165712, abstractC165711, c10391);
                        } else {
                            zM32586 = enumC8112.m21372(enumC8113) ? c13174.m32586(EnumC12739.f42492, abstractC165711, abstractC165712, c10391) : c13174.m32586(EnumC12739.f42494, abstractC165712, abstractC165711, (C10391) null);
                        }
                        if (!zM32586) {
                            mo5040(enumC8113, enumC8112);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumSet mo5039() {
        EnumC8112 enumC8112 = EnumC8112.f28428;
        EnumC8112 enumC8113 = this.f73697;
        if (enumC8113 == enumC8112) {
            return EnumSet.allOf(EnumC8112.class);
        }
        return EnumSet.complementOf(EnumSet.of(enumC8113));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5040(EnumC8112 enumC8112, EnumC8112 enumC8113) {
        C10229 c10229 = this.f52428;
        C13174 c13174 = this.f73699;
        if (enumC8112 == enumC8113) {
            c13174.m32582(c10229, enumC8112);
        } else {
            if (enumC8112 == EnumC8112.f28425 || enumC8113 == EnumC8112.f28428) {
                c13174.m32583(c10229, enumC8113, enumC8112);
                throw null;
            }
            c13174.m32583(c10229, enumC8112, enumC8113);
            throw null;
        }
    }

    @Override // l.AbstractC16267
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", getClass().getSimpleName(), this.f52428.f53121, this.f52427, this.f73697);
    }
}
