package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20627 extends AbstractC24357 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f66152;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Predicate f66153;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj2;
        C1917 c1917 = this.f66152;
        AbstractC22664 abstractC22664M6596 = c1917.m6596((AbstractC22664) obj);
        Predicate predicate = this.f66153;
        return predicate.test(abstractC22664M6596) && predicate.test(c1917.m6596(abstractC22664));
    }

    public C20627(C1917 c1917, EnumC21461 enumC21461) {
        this(c1917, enumC21461, new C6563(6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20627(C1917 c1917, EnumC21461 enumC21461, Predicate predicate) {
        super(c1917, enumC21461);
        this.f66152 = c1917;
        this.f66153 = predicate;
    }

    @Override // l.AbstractC24357
    /* JADX INFO: renamed from: ۙ */
    public final C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        AbstractC22664 abstractC22664M6597 = this.f66152.m6597(abstractC22664, abstractC22665);
        return m44271(new C6457(this, abstractC22664M6597, abstractC22664M6597));
    }
}
