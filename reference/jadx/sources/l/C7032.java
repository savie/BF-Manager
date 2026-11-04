package l;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7032 extends AbstractC22499 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6004 f23201;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7032(C19515 c19515, String str, LinkedHashMap linkedHashMap, C6004 c6004) {
        super(c19515, str, linkedHashMap);
        this.f23201 = c6004;
    }

    @Override // l.AbstractC22499
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo19355() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f23201.mo8093());
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            if (m50732()) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            long jMo4285 = j;
            for (AbstractC22044 abstractC22044 : ((AbstractC22044) linkedList.removeFirst()).mo4299(true)) {
                if (abstractC22044.mo4281()) {
                    i4++;
                    if (!abstractC22044.m49860()) {
                        linkedList.addLast(abstractC22044);
                    }
                } else {
                    i3++;
                    if (!abstractC22044.m49860()) {
                        jMo4285 += abstractC22044.mo4285();
                    }
                }
            }
            i = i3;
            i2 = i4;
            j = jMo4285;
            m50730(i, i2, j, false);
        }
        m50730(i, i2, j, true);
    }
}
