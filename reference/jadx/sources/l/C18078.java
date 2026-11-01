package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18078 extends AbstractC18784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8907[] f57842;

    public C18078(AbstractC8907 abstractC8907, AbstractC8907 abstractC8908) {
        HashSet hashSet = new HashSet();
        if (abstractC8907 instanceof C18078) {
            hashSet.addAll(Arrays.asList(((C18078) abstractC8907).f57842));
        } else {
            hashSet.add(abstractC8907);
        }
        if (abstractC8908 instanceof C18078) {
            hashSet.addAll(Arrays.asList(((C18078) abstractC8908).f57842));
        } else {
            hashSet.add(abstractC8908);
        }
        List listM23167 = AbstractC8907.m23167(hashSet);
        if (!listM23167.isEmpty()) {
            hashSet.add((C8201) Collections.max(listM23167));
        }
        this.f57842 = (AbstractC8907[]) hashSet.toArray(new AbstractC8907[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18078) {
            return Arrays.equals(this.f57842, ((C18078) obj).f57842);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C18078.class.hashCode();
        AbstractC8907[] abstractC8907Arr = this.f57842;
        for (AbstractC8907 abstractC8907 : abstractC8907Arr) {
            iHashCode = C4758.m13214(iHashCode, abstractC8907);
        }
        return C4758.m13213(iHashCode, abstractC8907Arr.length);
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21489(AbstractC19055 abstractC19055, C8472 c8472) {
        for (AbstractC8907 abstractC8907 : this.f57842) {
            if (abstractC8907.mo21489(abstractC19055, c8472)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f A[PHI: r2
      0x005f: PHI (r2v2 l.ۡ۬᩵) = (r2v4 l.ۡ۬᩵), (r2v5 l.ۡ۬᩵), (r2v6 l.ۡ۬᩵) binds: [B:30:0x004d, B:31:0x004f, B:34:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC8907 mo21490(AbstractC19055 abstractC19055, C8472 c8472) {
        ArrayList arrayList = new ArrayList();
        AbstractC8907[] abstractC8907Arr = this.f57842;
        int length = abstractC8907Arr.length;
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
                AbstractC8907 abstractC8907 = (AbstractC8907) arrayList.get(0);
                while (i2 < arrayList.size()) {
                    AbstractC8907 abstractC8908 = (AbstractC8907) arrayList.get(i2);
                    if (abstractC8907 == null) {
                        abstractC8907 = abstractC8908;
                    } else if (abstractC8908 != null) {
                        C21606 c21606 = C21606.f70083;
                        if (abstractC8907 == c21606 || abstractC8908 == c21606) {
                            AbstractC8907 abstractC8909 = c21606;
                            abstractC8909 = c21606;
                            abstractC8907 = abstractC8909;
                        } else {
                            C18078 c18078 = new C18078(abstractC8907, abstractC8908);
                            AbstractC8907[] abstractC8907Arr2 = c18078.f57842;
                            abstractC8909 = c18078;
                            if (abstractC8907Arr2.length == 1) {
                                abstractC8907 = abstractC8907Arr2[0];
                            } else {
                                AbstractC8907 abstractC89010 = c21606;
                                abstractC89010 = c21606;
                                abstractC8907 = abstractC89010;
                            }
                        }
                    }
                    i2++;
                    abstractC8907 = abstractC8907;
                }
                return abstractC8907;
            }
            AbstractC8907 abstractC89011 = abstractC8907Arr[i];
            AbstractC8907 abstractC8907Mo21490 = abstractC89011.mo21490(abstractC19055, c8472);
            z |= abstractC8907Mo21490 != abstractC89011;
            C21606 c21607 = C21606.f70083;
            if (abstractC8907Mo21490 == c21607) {
                return c21607;
            }
            if (abstractC8907Mo21490 != null) {
                arrayList.add(abstractC8907Mo21490);
            }
            i++;
        }
    }

    public final String toString() {
        return C16845.m39504(Arrays.asList(this.f57842).iterator(), "||");
    }
}
