package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264 extends AbstractC9466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7230[] f4557;

    public C1264(AbstractC7230 abstractC7230, AbstractC7230 abstractC7231) {
        HashSet hashSet = new HashSet();
        if (abstractC7230 instanceof C1264) {
            hashSet.addAll(Arrays.asList(((C1264) abstractC7230).f4557));
        } else {
            hashSet.add(abstractC7230);
        }
        if (abstractC7231 instanceof C1264) {
            hashSet.addAll(Arrays.asList(((C1264) abstractC7231).f4557));
        } else {
            hashSet.add(abstractC7231);
        }
        List listM19829 = AbstractC7230.m19829(hashSet);
        if (!listM19829.isEmpty()) {
            hashSet.add((C2755) Collections.max(listM19829));
        }
        this.f4557 = (AbstractC7230[]) hashSet.toArray(new AbstractC7230[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1264) {
            return Arrays.equals(this.f4557, ((C1264) obj).f4557);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C1264.class.hashCode();
        AbstractC7230[] abstractC7230Arr = this.f4557;
        for (AbstractC7230 abstractC7230 : abstractC7230Arr) {
            iHashCode = C7103.m19445(iHashCode, abstractC7230);
        }
        return C7103.m19444(iHashCode, abstractC7230Arr.length);
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4584(AbstractC9488 abstractC9488, C2777 c2777) {
        for (AbstractC7230 abstractC7230 : this.f4557) {
            if (abstractC7230.mo4584(abstractC9488, c2777)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f A[PHI: r2
      0x005f: PHI (r2v2 l.ۜܶۨ) = (r2v4 l.ۜܶۨ), (r2v5 l.ۜܶۨ), (r2v6 l.ۜܶۨ) binds: [B:30:0x004d, B:31:0x004f, B:34:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC7230 mo4585(AbstractC9488 abstractC9488, C2777 c2777) {
        ArrayList arrayList = new ArrayList();
        AbstractC7230[] abstractC7230Arr = this.f4557;
        int length = abstractC7230Arr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int i2 = 1;
                AbstractC7230 abstractC7230 = (AbstractC7230) arrayList.get(0);
                while (i2 < arrayList.size()) {
                    AbstractC7230 abstractC7231 = (AbstractC7230) arrayList.get(i2);
                    if (abstractC7230 == null) {
                        abstractC7230 = abstractC7231;
                    } else if (abstractC7231 != null) {
                        C10212 c10212 = C10212.f32654;
                        if (abstractC7230 == c10212 || abstractC7231 == c10212) {
                            AbstractC7230 abstractC7232 = c10212;
                            abstractC7232 = c10212;
                            abstractC7230 = abstractC7232;
                        } else {
                            C1264 c1264 = new C1264(abstractC7230, abstractC7231);
                            AbstractC7230[] abstractC7230Arr2 = c1264.f4557;
                            abstractC7232 = c1264;
                            if (abstractC7230Arr2.length == 1) {
                                abstractC7230 = abstractC7230Arr2[0];
                            } else {
                                AbstractC7230 abstractC7233 = c10212;
                                abstractC7233 = c10212;
                                abstractC7230 = abstractC7233;
                            }
                        }
                    }
                    i2++;
                    abstractC7230 = abstractC7230;
                }
                return abstractC7230;
            }
            AbstractC7230 abstractC7234 = abstractC7230Arr[i];
            AbstractC7230 abstractC7230Mo4585 = abstractC7234.mo4585(abstractC9488, c2777);
            z |= abstractC7230Mo4585 != abstractC7234;
            C10212 c10213 = C10212.f32654;
            if (abstractC7230Mo4585 == c10213) {
                return c10213;
            }
            if (abstractC7230Mo4585 != null) {
                arrayList.add(abstractC7230Mo4585);
            }
            i++;
        }
    }

    public final String toString() {
        return C11855.m29706(Arrays.asList(this.f4557).iterator(), "||");
    }
}
