package l;

import com.alipay.sdk.m.y.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public class C24352 extends AbstractC16344 implements InterfaceC11869 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f78965;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18499 f78966;

    public C24352(AbstractC11781 abstractC11781) {
        super(abstractC11781);
        this.f78966 = new C18499();
        this.f78965 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54393(AbstractC16344 abstractC16344) {
        if (abstractC16344 != null) {
            this.f78966.m43095(abstractC16344);
            C25296 c25296 = abstractC16344.f53082;
            c25296.f81699 = c25296.f81699.m35552(new WeakReference(this));
            this.f78965++;
            this.f53082.m56485(this, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54392(AbstractC16344 abstractC16344) {
        this.f78966.m43089(abstractC16344);
        C25296 c25296 = abstractC16344.f53082;
        c25296.f81699 = c25296.f81699.m35552(new WeakReference(this));
        this.f78965++;
        this.f53082.m56485(this, null);
    }

    @Override // l.InterfaceC11869
    /* JADX INFO: renamed from: ۙ */
    public final void mo23378(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
        this.f78965++;
        this.f53082.m56485(abstractC16344, abstractC11781);
    }

    @Override // l.InterfaceC11869
    /* JADX INFO: renamed from: ᩷ */
    public final void mo23379(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
        this.f78965++;
        this.f53082.m56486(abstractC16344, abstractC11781);
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo46991() {
        return this.f78965;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundScope{");
        String str = "";
        for (AbstractC16344 abstractC16344 : this.f78966) {
            sb.append(str);
            sb.append(abstractC16344);
            str = ",";
        }
        sb.append(l.d);
        return sb.toString();
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo7472(final Predicate predicate, final EnumC13908 enumC13908) {
        return new Iterable() { // from class: l.᩵ܰ᩺
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C18499 c18499 = this.f66143.f78966;
                final Predicate predicate2 = predicate;
                final EnumC13908 enumC13909 = enumC13908;
                return C8475.m22793(c18499, new Function() { // from class: l.ۨܰ᩺
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
                        return ((AbstractC16344) obj).mo7472(predicate2, enumC13909).iterator();
                    }
                });
            }
        };
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo7473(final AbstractC19728 abstractC19728, final Predicate predicate, final EnumC13908 enumC13908) {
        return new Iterable() { // from class: l.ۗܰ᩺
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C18499 c18499 = this.f12010.f78966;
                final AbstractC19728 abstractC19729 = abstractC19728;
                final Predicate predicate2 = predicate;
                final EnumC13908 enumC13909 = enumC13908;
                return C8475.m22793(c18499, new Function() { // from class: l.ۛܰ᩺
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

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16344 mo7475(AbstractC11781 abstractC11781) {
        for (AbstractC16344 abstractC16344 : this.f78966) {
            if (abstractC16344.mo7485(abstractC11781)) {
                return abstractC16344.mo7475(abstractC11781);
            }
        }
        return null;
    }
}
