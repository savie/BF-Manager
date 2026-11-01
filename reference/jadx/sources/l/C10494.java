package l;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۤ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10494 extends AbstractC20371 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f35955;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10494(C0614 c0614, String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(c0614, str, linkedHashMap);
        this.f35955 = arrayList;
    }

    @Override // l.AbstractC20371
    /* JADX INFO: renamed from: ۖ */
    public final void mo23414() {
        ArrayList arrayList = new ArrayList();
        long size = 0;
        int i = 0;
        int i2 = 0;
        for (C6794 c6794 : this.f35955) {
            if (m46031()) {
                return;
            }
            if (c6794.isDirectory()) {
                i2++;
                if (!c6794.mo7986()) {
                    arrayList.add(c6794.mo7989());
                }
            } else {
                i++;
                if (!c6794.mo7986()) {
                    size += c6794.getSize();
                }
            }
        }
        int i3 = i;
        int i4 = i2;
        long j = size;
        m46029(i3, i4, j, false);
        LinkedList linkedList = new LinkedList(arrayList);
        while (!linkedList.isEmpty()) {
            if (m46031()) {
                return;
            }
            int i5 = i3;
            int i6 = i4;
            long jMo33964 = j;
            for (AbstractC20745 abstractC20745 : ((AbstractC20745) linkedList.removeFirst()).mo33983(true)) {
                if (abstractC20745.mo33974()) {
                    i6++;
                    if (!abstractC20745.m46723()) {
                        linkedList.addLast(abstractC20745);
                    }
                } else {
                    i5++;
                    if (!abstractC20745.m46723()) {
                        jMo33964 += abstractC20745.mo33964();
                    }
                }
            }
            i3 = i5;
            i4 = i6;
            j = jMo33964;
            m46029(i3, i4, j, false);
        }
        m46029(i3, i4, j, true);
    }
}
