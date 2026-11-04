package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23058 extends C7197 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f74809;

    public C23058(AbstractC11781 abstractC11781) {
        super(abstractC11781);
        this.f74809 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16344 m51967(C24705 c24705, AbstractC17836 abstractC17836, AbstractC19728 abstractC19728, C23151 c23151, C11852 c11852, C11216 c11216) {
        C9433 c9433 = new C9433(c24705, abstractC17836, abstractC19728, c23151, c11852, c11216);
        m51965(c9433, abstractC19728);
        return c9433;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16344 m51966(AbstractC17836 abstractC17836, AbstractC17836 abstractC17837, AbstractC22970 abstractC22970) {
        C11123 c11123 = new C11123(abstractC17836.f53083, abstractC22970, abstractC17837);
        m51965(c11123, abstractC22970.f38072);
        return c11123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51965(AbstractC16344 abstractC16344, AbstractC19728 abstractC19728) {
        m54392(abstractC16344);
        HashMap map = this.f74809;
        AbstractC16344[] abstractC16344Arr = (AbstractC16344[]) map.get(abstractC19728);
        AbstractC16344[] abstractC16344Arr2 = abstractC16344Arr != null ? (AbstractC16344[]) Arrays.copyOf(abstractC16344Arr, abstractC16344Arr.length + 1) : new AbstractC16344[1];
        abstractC16344Arr2[abstractC16344Arr2.length - 1] = abstractC16344;
        map.put(abstractC19728, abstractC16344Arr2);
    }

    @Override // l.C24352, l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7473(final AbstractC19728 abstractC19728, final Predicate predicate, final EnumC13908 enumC13908) {
        final AbstractC16344[] abstractC16344Arr = (AbstractC16344[]) this.f74809.get(abstractC19728);
        if (abstractC16344Arr == null) {
            return Collections.EMPTY_LIST;
        }
        return new Iterable() { // from class: l.ۙ᩶᩺
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                List listAsList = Arrays.asList(abstractC16344Arr);
                final AbstractC19728 abstractC19729 = abstractC19728;
                final Predicate predicate2 = predicate;
                final EnumC13908 enumC13909 = enumC13908;
                return C8475.m22793(listAsList, new Function() { // from class: l.᩷᩶᩺
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC16344) obj).mo7473(abstractC19729, predicate2, enumC13909).iterator();
                    }
                });
            }
        };
    }

    @Override // l.C7197
    /* JADX INFO: renamed from: ۤ */
    public final void mo19770() {
        super.mo19770();
        for (AbstractC16344[] abstractC16344Arr : this.f74809.values()) {
            for (int i = 0; i < abstractC16344Arr.length; i++) {
                abstractC16344Arr[i] = C7197.m19769(abstractC16344Arr[i]);
            }
        }
    }
}
