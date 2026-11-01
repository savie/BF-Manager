package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3110 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14401 f11718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f11719;

    /* JADX INFO: renamed from: ۙ */
    public abstract Iterable mo3802(Predicate predicate, EnumC10167 enumC10167);

    /* JADX INFO: renamed from: ۙ */
    public abstract Iterable mo3803(AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC3110 mo9328(AbstractC23903 abstractC23903);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9330(C18798 c18798);

    public AbstractC3110(AbstractC23903 abstractC23903) {
        C14401 c14401 = new C14401();
        c14401.f47213 = C21825.m48588();
        this.f11718 = c14401;
        this.f11719 = abstractC23903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable m9327(AbstractC11242 abstractC11242) {
        return mo3803(abstractC11242, null, EnumC10167.RECURSIVE);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC23903 mo3804(AbstractC11242 abstractC11242, Predicate predicate) {
        Iterator it = mo3803(abstractC11242, predicate, EnumC10167.RECURSIVE).iterator();
        if (it.hasNext()) {
            return (AbstractC23903) it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo9331(AbstractC23903 abstractC23903) {
        return mo3803(abstractC23903.f77453, new C3419(abstractC23903), EnumC10167.RECURSIVE).iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9329() {
        return !mo3802((Predicate) null, EnumC10167.NON_RECURSIVE).iterator().hasNext();
    }
}
