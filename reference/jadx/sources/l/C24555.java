package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩺᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public class C24555 extends AbstractC21988 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public BiFunction f79588;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f79589;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public BiPredicate f79590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC0816 f79591;

    public C24555(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664, EnumC0816 enumC0816) {
        this(c14528, c8274, abstractC22664, new C6655(), null, enumC0816);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24555(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664, BiFunction biFunction, BiPredicate biPredicate, EnumC0816 enumC0816) {
        super(c14528, c8274, abstractC22664);
        this.f79589 = c14528;
        this.f79591 = enumC0816;
        this.f79588 = biFunction;
        this.f79590 = biPredicate;
    }

    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public AbstractC21988 mo13163(C8274 c8274) {
        return new C24555(this.f79589, c8274, this.f70942, this.f79588, this.f79590, this.f79591);
    }

    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public void mo13164(C2596 c2596, C1083 c1083) {
        boolean zM35067;
        AbstractC22664 abstractC22664 = this.f70942;
        BiFunction biFunction = this.f79588;
        AbstractC22664 abstractC22665 = (AbstractC22664) biFunction.apply(c2596, abstractC22664);
        this.f70942 = abstractC22665;
        BiPredicate biPredicate = this.f79590;
        if (biPredicate == null || !biPredicate.test(c2596, abstractC22665)) {
            for (EnumC0816 enumC0816 : mo14041()) {
                Iterator it = this.f70943.m22332(enumC0816).iterator();
                while (it.hasNext()) {
                    AbstractC22664 abstractC22666 = (AbstractC22664) biFunction.apply(c2596, (AbstractC22664) it.next());
                    if (biPredicate == null || !biPredicate.test(c2596, abstractC22666)) {
                        AbstractC22664 abstractC22667 = this.f70942;
                        EnumC0816 enumC0817 = this.f79591;
                        boolean zM3285 = enumC0817.m3285(enumC0816);
                        C14528 c14528 = this.f70944;
                        if (zM3285) {
                            zM35067 = c14528.m35067(EnumC15274.f49926, abstractC22667, abstractC22666, c1083);
                        } else {
                            zM35067 = enumC0816.m3285(enumC0817) ? c14528.m35067(EnumC15274.f49926, abstractC22666, abstractC22667, c1083) : c14528.m35067(EnumC15274.f49927, abstractC22667, abstractC22666, (C1083) null);
                        }
                        if (!zM35067) {
                            mo14042(enumC0817, enumC0816);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumSet mo14041() {
        EnumC0816 enumC0816 = EnumC0816.f3094;
        EnumC0816 enumC0817 = this.f79591;
        if (enumC0817 == enumC0816) {
            return EnumSet.allOf(EnumC0816.class);
        }
        return EnumSet.complementOf(EnumSet.of(enumC0817));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14042(EnumC0816 enumC0816, EnumC0816 enumC0817) {
        C8274 c8274 = this.f70943;
        C14528 c14528 = this.f79589;
        if (enumC0816 == enumC0817) {
            c14528.m35064(c8274, enumC0816);
        } else {
            if (enumC0816 == EnumC0816.f3093 || enumC0817 == EnumC0816.f3094) {
                c14528.m35065(c8274, enumC0817, enumC0816);
                throw null;
            }
            c14528.m35065(c8274, enumC0816, enumC0817);
            throw null;
        }
    }

    @Override // l.AbstractC21988
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", getClass().getSimpleName(), this.f70943.f72657, this.f70942, this.f79591);
    }
}
