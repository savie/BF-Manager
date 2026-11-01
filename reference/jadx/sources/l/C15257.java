package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15257 extends AbstractC18784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8907[] f49729;

    public C15257(AbstractC8907 abstractC8907, AbstractC8907 abstractC8908) {
        HashSet hashSet = new HashSet();
        if (abstractC8907 instanceof C15257) {
            hashSet.addAll(Arrays.asList(((C15257) abstractC8907).f49729));
        } else {
            hashSet.add(abstractC8907);
        }
        if (abstractC8908 instanceof C15257) {
            hashSet.addAll(Arrays.asList(((C15257) abstractC8908).f49729));
        } else {
            hashSet.add(abstractC8908);
        }
        List listM23167 = AbstractC8907.m23167(hashSet);
        if (!listM23167.isEmpty()) {
            hashSet.add((C8201) Collections.min(listM23167));
        }
        this.f49729 = (AbstractC8907[]) hashSet.toArray(new AbstractC8907[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15257) {
            return Arrays.equals(this.f49729, ((C15257) obj).f49729);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C15257.class.hashCode();
        AbstractC8907[] abstractC8907Arr = this.f49729;
        for (AbstractC8907 abstractC8907 : abstractC8907Arr) {
            iHashCode = C4758.m13214(iHashCode, abstractC8907);
        }
        return C4758.m13213(iHashCode, abstractC8907Arr.length);
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21489(AbstractC19055 abstractC19055, C8472 c8472) {
        for (AbstractC8907 abstractC8907 : this.f49729) {
            if (!abstractC8907.mo21489(abstractC19055, c8472)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC8907 mo21490(AbstractC19055 abstractC19055, C8472 c8472) {
        ArrayList arrayList = new ArrayList();
        AbstractC8907[] abstractC8907Arr = this.f49729;
        int length = abstractC8907Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return C21606.f70083;
                }
                AbstractC8907 abstractC8907M23168 = (AbstractC8907) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC8907M23168 = AbstractC8907.m23168(abstractC8907M23168, (AbstractC8907) arrayList.get(i3));
                }
                return abstractC8907M23168;
            }
            AbstractC8907 abstractC8907 = abstractC8907Arr[i];
            AbstractC8907 abstractC8907Mo21490 = abstractC8907.mo21490(abstractC19055, c8472);
            i2 |= abstractC8907Mo21490 == abstractC8907 ? 0 : 1;
            if (abstractC8907Mo21490 == null) {
                return null;
            }
            if (abstractC8907Mo21490 != C21606.f70083) {
                arrayList.add(abstractC8907Mo21490);
            }
            i++;
        }
    }

    public final String toString() {
        return C16845.m39504(Arrays.asList(this.f49729).iterator(), "&&");
    }
}
