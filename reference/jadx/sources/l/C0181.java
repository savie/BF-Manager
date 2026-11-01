package l;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0181 implements InterfaceC3915 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f1297;

    public C0181(C20145 c20145) {
        this.f1297 = c20145;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.۟ۙ۟] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.᩷ۙ۟] */
    @Override // l.InterfaceC3915
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 mo1384(C4603 c4603, AbstractC11242 abstractC11242) {
        final C21825 c21825M40242 = C17281.m40242(abstractC11242);
        ?? r4 = new Function() { // from class: l.۟ۙ۟
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final C0181 c0181 = this.f24122;
                final C21825 c21825 = c21825M40242;
                return new Iterable() { // from class: l.ܺۙ۟
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        final C0181 c0182 = c0181;
                        return C20021.m45348(c21825, new Function() { // from class: l.᩶ۙ۟
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo33696andThen(Function function) {
                                return C4277.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C4277.$default$compose(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return c0182.f1297.f65410.m11156((AbstractC11242) obj2).iterator();
                            }
                        });
                    }
                };
            }
        };
        ?? r5 = new BiFunction() { // from class: l.᩷ۙ۟
            public /* synthetic */ BiFunction andThen(Function function) {
                return C5689.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C19670 c19670 = (C19670) obj;
                C0181 c0181 = this.f67216;
                c0181.getClass();
                Iterator it = c21825M40242.iterator();
                while (it.hasNext()) {
                    try {
                        return c0181.f1297.f65423.m2738(c19670, (AbstractC11242) it.next());
                    } catch (C4146 unused) {
                    }
                }
                return null;
            }
        };
        C5705 c5705 = new C5705(1);
        C20145 c20145 = this.f1297;
        return c20145.m45506(c4603, abstractC11242, (Function) r4, (BiFunction) r5, c5705, c20145.f65416);
    }
}
