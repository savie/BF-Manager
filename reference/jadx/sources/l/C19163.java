package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19163 extends AbstractC9466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7230[] f62008;

    public C19163(AbstractC7230 abstractC7230, AbstractC7230 abstractC7231) {
        HashSet hashSet = new HashSet();
        if (abstractC7230 instanceof C19163) {
            hashSet.addAll(Arrays.asList(((C19163) abstractC7230).f62008));
        } else {
            hashSet.add(abstractC7230);
        }
        if (abstractC7231 instanceof C19163) {
            hashSet.addAll(Arrays.asList(((C19163) abstractC7231).f62008));
        } else {
            hashSet.add(abstractC7231);
        }
        List listM19829 = AbstractC7230.m19829(hashSet);
        if (!listM19829.isEmpty()) {
            hashSet.add((C2755) Collections.min(listM19829));
        }
        this.f62008 = (AbstractC7230[]) hashSet.toArray(new AbstractC7230[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19163) {
            return Arrays.equals(this.f62008, ((C19163) obj).f62008);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C19163.class.hashCode();
        AbstractC7230[] abstractC7230Arr = this.f62008;
        for (AbstractC7230 abstractC7230 : abstractC7230Arr) {
            iHashCode = C7103.m19445(iHashCode, abstractC7230);
        }
        return C7103.m19444(iHashCode, abstractC7230Arr.length);
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4584(AbstractC9488 abstractC9488, C2777 c2777) {
        for (AbstractC7230 abstractC7230 : this.f62008) {
            if (!abstractC7230.mo4584(abstractC9488, c2777)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC7230 mo4585(AbstractC9488 abstractC9488, C2777 c2777) {
        ArrayList arrayList = new ArrayList();
        AbstractC7230[] abstractC7230Arr = this.f62008;
        int length = abstractC7230Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return C10212.f32654;
                }
                AbstractC7230 abstractC7230M19830 = (AbstractC7230) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC7230M19830 = AbstractC7230.m19830(abstractC7230M19830, (AbstractC7230) arrayList.get(i3));
                }
                return abstractC7230M19830;
            }
            AbstractC7230 abstractC7230 = abstractC7230Arr[i];
            AbstractC7230 abstractC7230Mo4585 = abstractC7230.mo4585(abstractC9488, c2777);
            i2 |= abstractC7230Mo4585 == abstractC7230 ? 0 : 1;
            if (abstractC7230Mo4585 == null) {
                return null;
            }
            if (abstractC7230Mo4585 != C10212.f32654) {
                arrayList.add(abstractC7230Mo4585);
            }
            i++;
        }
    }

    public final String toString() {
        return C11855.m29706(Arrays.asList(this.f62008).iterator(), "&&");
    }
}
