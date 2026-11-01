package l;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۡ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9083 extends AbstractC20371 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6794 f30952;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9083(C0614 c0614, String str, LinkedHashMap linkedHashMap, C6794 c6794) {
        super(c0614, str, linkedHashMap);
        this.f30952 = c6794;
    }

    @Override // l.AbstractC20371
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo23414() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f30952.mo7989());
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            if (m46031()) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            long jMo33964 = j;
            for (AbstractC20745 abstractC20745 : ((AbstractC20745) linkedList.removeFirst()).mo33983(true)) {
                if (abstractC20745.mo33974()) {
                    i4++;
                    if (!abstractC20745.m46723()) {
                        linkedList.addLast(abstractC20745);
                    }
                } else {
                    i3++;
                    if (!abstractC20745.m46723()) {
                        jMo33964 += abstractC20745.mo33964();
                    }
                }
            }
            i = i3;
            i2 = i4;
            j = jMo33964;
            m46029(i, i2, j, false);
        }
        m46029(i, i2, j, true);
    }
}
