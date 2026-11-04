package l;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes4.dex */
public class C11567 extends AbstractC24994 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f36363 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17534 f36364;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC24994 f36365;

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo29104(C6650 c6650, C12510 c12510) {
        return false;
    }

    public C11567(C17534 c17534) {
        this.f36364 = c17534;
        this.f36365 = c17534.f56999;
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5816 mo29099(C6650 c6650) {
        C5816 c5816Mo29099 = this.f36365.mo29099(c6650);
        if (c5816Mo29099 != null) {
            return c5816Mo29099;
        }
        C5816 c5816 = new C5816(c6650.f38071, c6650.f38072, c6650.f38067, this.f36364.f57006);
        c5816.m29569(c6650.mo29597());
        this.f36363.put(c6650, c5816);
        return c5816;
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5816 mo29105(final C6650 c6650) {
        C5816 c5816Mo29105 = this.f36365.mo29105(c6650);
        return c5816Mo29105 != null ? c5816Mo29105 : (C5816) C1170.stream(this.f36363.entrySet()).filter(new Predicate() { // from class: l.֫ۧۘ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C6650 c6651 = (C6650) ((Map.Entry) obj).getKey();
                c6651.getClass();
                C14769 c14769Of = C14769.of((Object) c6651);
                C6650 c6652 = c6650;
                c6652.getClass();
                return c14769Of.containsAll(C14769.of((Object) c6652));
            }
        }).findFirst().map(new C3984(11)).orElse(null);
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 mo29100(int i) {
        LinkedHashMap linkedHashMap = this.f36363;
        if (linkedHashMap.isEmpty()) {
            return C14769.m35543();
        }
        C18499 c18499 = new C18499();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C5816 c5816 = (C5816) entry.getValue();
            C15714 c15714 = this.f36364.f56998;
            c15714.f51040 = i;
            C12510 c12510M37523 = c15714.m37523(c5816, (AbstractC22295) null);
            if ((((C6650) entry.getKey()).f38071 & 1152921504606846976L) != 0) {
                if (!this.f36365.mo29104((C6650) entry.getKey(), c12510M37523)) {
                }
            }
            c18499.m43089(c12510M37523);
        }
        return c18499.m43093();
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19969 mo29101(AbstractC19969 abstractC19969) {
        C14769 c14769Mo29100 = mo29100(abstractC19969.f26658);
        if (!c14769Mo29100.m35550()) {
            return abstractC19969;
        }
        C15714 c15714 = this.f36364.f56998;
        c15714.f51040 = abstractC19969.f26658;
        return c15714.m37506(0L, c14769Mo29100.m35546(abstractC19969));
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 mo29102(AbstractC22295 abstractC22295) {
        for (C5816 c5816 : this.f36363.values()) {
            C17534 c17534 = this.f36364;
            C15714 c15714 = c17534.f56998;
            int i = abstractC22295.f26658;
            c15714.f51040 = i;
            C15714 c15715 = c17534.f56998;
            c15715.f51040 = i;
            C14747 c14747M37526 = c15714.m37526(c15715.m37523(c5816, (AbstractC22295) null), abstractC22295);
            c14747M37526.f26659 = abstractC22295.f26659;
            abstractC22295 = c14747M37526;
        }
        return abstractC22295;
    }

    @Override // l.AbstractC24994
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24994 mo29103() {
        C17534 c17534 = this.f36364;
        AbstractC24994 abstractC24994 = this.f36365;
        c17534.f56999 = abstractC24994;
        return abstractC24994;
    }
}
