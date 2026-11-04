package l;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10647 implements InterfaceC20980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f33752;

    public C10647(C22010 c22010) {
        this.f33752 = c22010;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.۠۫ۘ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۜ۫ۘ] */
    @Override // l.InterfaceC20980
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 mo27137(C3168 c3168, AbstractC19728 abstractC19728) {
        final C14769 c14769M49593 = C21901.m49593(abstractC19728);
        ?? r4 = new Function() { // from class: l.۠۫ۘ
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
                final C10647 c10647 = this.f28192;
                final C14769 c14769 = c14769M49593;
                return new Iterable() { // from class: l.ۙۚۘ
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        final C10647 c10648 = c10647;
                        return C8475.m22793(c14769, new Function() { // from class: l.᩷ۚۘ
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
                            public final Object apply(Object obj2) {
                                return c10648.f33752.f71034.m35528((AbstractC19728) obj2).iterator();
                            }
                        });
                    }
                };
            }
        };
        ?? r5 = new BiFunction() { // from class: l.ۜ۫ۘ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C3363.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C2920 c2920 = (C2920) obj;
                C10647 c10647 = this.f23599;
                c10647.getClass();
                Iterator it = c14769M49593.iterator();
                while (it.hasNext()) {
                    try {
                        return c10647.f33752.f71006.m45172(c2920, (AbstractC19728) it.next());
                    } catch (C21566 unused) {
                    }
                }
                return null;
            }
        };
        C13848 c13848 = new C13848(0);
        C22010 c22010 = this.f33752;
        return c22010.m49744(c3168, abstractC19728, (Function) r4, (BiFunction) r5, c13848, c22010.f71028);
    }
}
