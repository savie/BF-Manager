package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20045 extends C8756 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f64182;

    public C20045(AbstractC23903 abstractC23903) {
        super(abstractC23903);
        this.f64182 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3110 m45412(C23800 c23800, AbstractC9462 abstractC9462, AbstractC11242 abstractC11242, C12115 c12115, C14023 c14023, C16348 c16348) {
        C18633 c18633 = new C18633(c23800, abstractC9462, abstractC11242, c12115, c14023, c16348);
        m45410(c18633, abstractC11242);
        return c18633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3110 m45411(AbstractC9462 abstractC9462, AbstractC9462 abstractC9463, AbstractC0618 abstractC0618) {
        C15812 c15812 = new C15812(abstractC9462.f11719, abstractC0618, abstractC9463);
        m45410(c15812, abstractC0618.f77453);
        return c15812;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45410(AbstractC3110 abstractC3110, AbstractC11242 abstractC11242) {
        m14410(abstractC3110);
        HashMap map = this.f64182;
        AbstractC3110[] abstractC3110Arr = (AbstractC3110[]) map.get(abstractC11242);
        AbstractC3110[] abstractC3110Arr2 = abstractC3110Arr != null ? (AbstractC3110[]) Arrays.copyOf(abstractC3110Arr, abstractC3110Arr.length + 1) : new AbstractC3110[1];
        abstractC3110Arr2[abstractC3110Arr2.length - 1] = abstractC3110;
        map.put(abstractC11242, abstractC3110Arr2);
    }

    @Override // l.C5227, l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo3803(final AbstractC11242 abstractC11242, final Predicate predicate, final EnumC10167 enumC10167) {
        final AbstractC3110[] abstractC3110Arr = (AbstractC3110[]) this.f64182.get(abstractC11242);
        if (abstractC3110Arr == null) {
            return Collections.EMPTY_LIST;
        }
        return new Iterable() { // from class: l.۟۠ۤ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                List listAsList = Arrays.asList(abstractC3110Arr);
                final AbstractC11242 abstractC11243 = abstractC11242;
                final Predicate predicate2 = predicate;
                final EnumC10167 enumC10168 = enumC10167;
                return C20021.m45348(listAsList, new Function() { // from class: l.᩷۠ۤ
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

    @Override // l.C8756
    /* JADX INFO: renamed from: ۨ */
    public final void mo22713() {
        super.mo22713();
        for (AbstractC3110[] abstractC3110Arr : this.f64182.values()) {
            for (int i = 0; i < abstractC3110Arr.length; i++) {
                abstractC3110Arr[i] = C8756.m22712(abstractC3110Arr[i]);
            }
        }
    }
}
