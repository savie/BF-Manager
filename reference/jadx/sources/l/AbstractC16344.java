package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16344 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C25296 f53082;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f53083;

    /* JADX INFO: renamed from: ۙ */
    public abstract Iterable mo7472(Predicate predicate, EnumC13908 enumC13908);

    /* JADX INFO: renamed from: ۙ */
    public abstract Iterable mo7473(AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC16344 mo7475(AbstractC11781 abstractC11781);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo7476(C20548 c20548);

    public AbstractC16344(AbstractC11781 abstractC11781) {
        C25296 c25296 = new C25296();
        c25296.f81699 = C14769.m35543();
        this.f53082 = c25296;
        this.f53083 = abstractC11781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable m38842(AbstractC19728 abstractC19728) {
        return mo7473(abstractC19728, null, EnumC13908.RECURSIVE);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC11781 mo7474(AbstractC19728 abstractC19728, Predicate predicate) {
        Iterator it = mo7473(abstractC19728, predicate, EnumC13908.RECURSIVE).iterator();
        if (it.hasNext()) {
            return (AbstractC11781) it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo7485(AbstractC11781 abstractC11781) {
        return mo7473(abstractC11781.f38072, new C23606(0, abstractC11781), EnumC13908.RECURSIVE).iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38843() {
        return !mo7472((Predicate) null, EnumC13908.NON_RECURSIVE).iterator().hasNext();
    }
}
