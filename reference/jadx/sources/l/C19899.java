package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public class C19899 extends AbstractC12138 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f63791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Predicate f63792;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f63792.test(this.f63791.m26964((AbstractC16579) obj));
    }

    public C19899(C10727 c10727, EnumC18651 enumC18651) {
        this(c10727, enumC18651, new C10085(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19899(C10727 c10727, EnumC18651 enumC18651, Predicate predicate) {
        super(c10727, enumC18651);
        this.f63791 = c10727;
        this.f63792 = predicate;
    }

    @Override // l.AbstractC12138
    /* JADX INFO: renamed from: ۙ */
    public C10498 mo15919(AbstractC16579 abstractC16579) {
        return m35939(new C16371(this, this.f63791.m26964(abstractC16579)));
    }
}
