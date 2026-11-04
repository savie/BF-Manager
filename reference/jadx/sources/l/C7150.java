package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0IXA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7150 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 f23642;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f23643;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2675 f23646;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f23645 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f23647 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23641 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23644 = 0;

    public C7150(C2551 c2551, C2675 c2675, C6129 c6129) {
        this.f23642 = c2551;
        this.f23646 = c2675;
        this.f23643 = c6129.m17708() * c2551.m8543();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19716(C13861 c13861) {
        this.f23647.add(c13861);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19723(C13861 c13861) {
        if (c13861.m33807() != null) {
            this.f23641.add(c13861);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13861 m19720() {
        return (C13861) C6823.m19006(this.f23647);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13861 m19721() {
        return (C13861) C6823.m19006(this.f23641);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19724(AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        int i = this.f23644;
        this.f23644 = i + 1;
        C1184 c1184 = (C1184) this.f23645.put(abstractC16481, new C1184(i, abstractC16481, abstractC1566));
        if (c1184 == null) {
            int i2 = this.f23644;
            if (i2 > this.f23643) {
                throw new C2631(C12669.m31437(this.f23644, ". Try increasing type updates limit count.", new StringBuilder("Type inference error: updates count limit reached with updateSeq = ")));
            }
            if (i2 % 100 == 0) {
                C4123.m13227();
                return;
            }
            return;
        }
        throw new C8597("Unexpected type update override for arg: " + abstractC16481 + " types: prev=" + c1184.getType() + ", new=" + abstractC1566 + ", insn: " + abstractC16481.m39118());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m19719(AbstractC16481 abstractC16481) {
        IdentityHashMap identityHashMap = this.f23645;
        C1184 c1184 = (C1184) identityHashMap.remove(abstractC16481);
        if (c1184 != null) {
            final int iM4360 = c1184.m4360();
            C1170.removeIf(identityHashMap.values(), new Predicate() { // from class: l.۠۫᩵
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
                    return ((C1184) obj).m4360() > iM4360;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19715() {
        C1170.stream(this.f23645.values()).sorted().forEach(new C22689(2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m19725(AbstractC16481 abstractC16481) {
        return this.f23645.containsKey(abstractC16481);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19717(AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        C1184 c1184 = (C1184) this.f23645.get(abstractC16481);
        if (c1184 != null) {
            return c1184.getType().equals(abstractC1566);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m19714(AbstractC16481 abstractC16481) {
        C1184 c1184 = (C1184) this.f23645.get(abstractC16481);
        if (c1184 != null) {
            return c1184.getType();
        }
        return abstractC16481.getType();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 m19718() {
        return this.f23642;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19726() {
        return this.f23645.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2675 m19722() {
        return this.f23646;
    }

    public final String toString() {
        return "TypeUpdateInfo{" + this.f23646 + ' ' + ((List) C1170.stream(this.f23645.values()).sorted().collect(C2025.toList())) + '}';
    }
}
