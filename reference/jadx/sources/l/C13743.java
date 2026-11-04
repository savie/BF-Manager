package l;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13743 extends AbstractC22499 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f43613;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13743(C19515 c19515, String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(c19515, str, linkedHashMap);
        this.f43613 = arrayList;
    }

    @Override // l.AbstractC22499
    /* JADX INFO: renamed from: ᩸ */
    public final void mo19355() {
        ArrayList arrayList = new ArrayList();
        long size = 0;
        int i = 0;
        int i2 = 0;
        for (C6004 c6004 : this.f43613) {
            if (m50732()) {
                return;
            }
            if (c6004.isDirectory()) {
                i2++;
                if (!c6004.mo8107()) {
                    arrayList.add(c6004.mo8093());
                }
            } else {
                i++;
                if (!c6004.mo8107()) {
                    size += c6004.getSize();
                }
            }
        }
        int i3 = i;
        int i4 = i2;
        long j = size;
        m50730(i3, i4, j, false);
        LinkedList linkedList = new LinkedList(arrayList);
        while (!linkedList.isEmpty()) {
            if (m50732()) {
                return;
            }
            int i5 = i3;
            int i6 = i4;
            long jMo4285 = j;
            for (AbstractC22044 abstractC22044 : ((AbstractC22044) linkedList.removeFirst()).mo4299(true)) {
                if (abstractC22044.mo4281()) {
                    i6++;
                    if (!abstractC22044.m49860()) {
                        linkedList.addLast(abstractC22044);
                    }
                } else {
                    i5++;
                    if (!abstractC22044.m49860()) {
                        jMo4285 += abstractC22044.mo4285();
                    }
                }
            }
            i3 = i5;
            i4 = i6;
            j = jMo4285;
            m50730(i3, i4, j, false);
        }
        m50730(i3, i4, j, true);
    }
}
