package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19135 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f61926;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15867 f61927 = C15867.empty();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14769 f61928 = C14769.m35543();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f61929;

    public AbstractC19135(C1917 c1917, EnumC21461 enumC21461) {
        this.f61926 = c1917;
        this.f61929 = c1917.m6595(enumC21461);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7395 m44271(Predicate predicate) {
        return (C7395) C23654.of((Object[]) this.f61927.orElseGet(new Supplier() { // from class: l.ܿܳۘ
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC19135.m44270(this.f59904);
            }
        })).filter(predicate).findFirst().orElse(this.f61926.f6450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7395[] m44270(AbstractC19135 abstractC19135) {
        C7395[] c7395Arr = (C7395[]) C1170.stream(abstractC19135.f61928).map(new C0490()).toArray(new C7948());
        abstractC19135.f61927 = C15867.of(c7395Arr);
        abstractC19135.f61928 = null;
        return c7395Arr;
    }
}
