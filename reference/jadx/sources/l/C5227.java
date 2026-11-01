package l;

import com.alipay.sdk.m.y.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public class C5227 extends AbstractC3110 implements InterfaceC23573 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19003 f18128;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f18129;

    public C5227(AbstractC23903 abstractC23903) {
        super(abstractC23903);
        this.f18128 = new C19003();
        this.f18129 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14413(AbstractC3110 abstractC3110) {
        if (abstractC3110 != null) {
            this.f18128.m43729(abstractC3110);
            C14401 c14401 = abstractC3110.f11718;
            c14401.f47213 = c14401.f47213.m48597(new WeakReference(this));
            this.f18129++;
            this.f11718.m34669(this, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14410(AbstractC3110 abstractC3110) {
        this.f18128.m43723(abstractC3110);
        C14401 c14401 = abstractC3110.f11718;
        c14401.f47213 = c14401.f47213.m48597(new WeakReference(this));
        this.f18129++;
        this.f11718.m34669(this, null);
    }

    @Override // l.InterfaceC23573
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14411(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
        this.f18129++;
        this.f11718.m34669(abstractC3110, abstractC23903);
    }

    @Override // l.InterfaceC23573
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14414(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
        this.f18129++;
        this.f11718.m34670(abstractC3110, abstractC23903);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int mo14412() {
        return this.f18129;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundScope{");
        String str = "";
        for (AbstractC3110 abstractC3110 : this.f18128) {
            sb.append(str);
            sb.append(abstractC3110);
            str = ",";
        }
        sb.append(l.d);
        return sb.toString();
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo3802(final Predicate predicate, final EnumC10167 enumC10167) {
        return new Iterable() { // from class: l.ܰ۠ۤ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C19003 c19003 = this.f45173.f18128;
                final Predicate predicate2 = predicate;
                final EnumC10167 enumC10168 = enumC10167;
                return C20021.m45348(c19003, new Function() { // from class: l.ۨ۠ۤ
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
                        return ((AbstractC3110) obj).mo3802(predicate2, enumC10168).iterator();
                    }
                });
            }
        };
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo3803(final AbstractC11242 abstractC11242, final Predicate predicate, final EnumC10167 enumC10167) {
        return new Iterable() { // from class: l.ۙ۠ۤ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C19003 c19003 = this.f16094.f18128;
                final AbstractC11242 abstractC11243 = abstractC11242;
                final Predicate predicate2 = predicate;
                final EnumC10167 enumC10168 = enumC10167;
                return C20021.m45348(c19003, new Function() { // from class: l.ۖ۠ۤ
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
                        return ((AbstractC3110) obj).mo3803(abstractC11243, predicate2, enumC10168).iterator();
                    }
                });
            }
        };
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3110 mo9328(AbstractC23903 abstractC23903) {
        for (AbstractC3110 abstractC3110 : this.f18128) {
            if (abstractC3110.mo9331(abstractC23903)) {
                return abstractC3110.mo9328(abstractC23903);
            }
        }
        return null;
    }
}
