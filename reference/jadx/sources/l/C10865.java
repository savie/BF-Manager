package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10865 extends AbstractC15340 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f34405;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Predicate f34406;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f34406.test(this.f34405.m6596((AbstractC22664) obj));
    }

    public C10865(C1917 c1917, EnumC21461 enumC21461) {
        this(c1917, enumC21461, new C6563(6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10865(C1917 c1917, EnumC21461 enumC21461, Predicate predicate) {
        super(c1917, enumC21461);
        this.f34405 = c1917;
        this.f34406 = predicate;
    }

    @Override // l.AbstractC15340
    /* JADX INFO: renamed from: ۙ */
    public C7395 mo16631(AbstractC22664 abstractC22664) {
        return m44271(new C19816(this, this.f34405.m6596(abstractC22664)));
    }
}
