package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۬ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13090 extends AbstractC3709 {
    public final boolean s;
    public final Comparator t;

    public C13090(AbstractC14295 abstractC14295) {
        super(abstractC14295, EnumC2970.q | EnumC2970.o);
        this.s = true;
        this.t = EnumC3198.INSTANCE;
    }

    public C13090(AbstractC14295 abstractC14295, Comparator comparator) {
        super(abstractC14295, EnumC2970.q | EnumC2970.p);
        this.s = false;
        this.t = (Comparator) C13638.requireNonNull(comparator);
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        if (EnumC2970.SORTED.s(i) && this.s) {
            return interfaceC19171;
        }
        if (EnumC2970.SIZED.s(i)) {
            return new C10705(interfaceC19171, this.t);
        }
        return new C10268(interfaceC19171, this.t);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        if (EnumC2970.SORTED.s(((AbstractC5752) abstractC22686).m) && this.s) {
            return abstractC22686.Q(interfaceC20693, false, intFunction);
        }
        Object[] objArrM = abstractC22686.Q(interfaceC20693, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.t);
        return new C19233(objArrM);
    }
}
