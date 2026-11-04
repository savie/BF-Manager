package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15960 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24738 f51827;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC15214 f51830;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f51829 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f51831 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51828 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo38080(C4028 c4028, C17452 c17452);

    public AbstractC15960(C24738 c24738, EnumC15214 enumC15214) {
        this.f51827 = c24738;
        this.f51830 = enumC15214;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo28583(int i) {
        ArrayList arrayList = this.f51828;
        if (arrayList.size() > 0) {
            EnumC15214 enumC15214 = this.f51830;
            int i2 = enumC15214.f49669 - 1;
            int iM27354 = (i + i2) & (~i2);
            this.f51831 = iM27354;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC10739 abstractC10739 = (AbstractC10739) arrayList.get(i3);
                int i4 = enumC15214.f49669 - 1;
                iM27354 = abstractC10739.m27354((iM27354 + i4) & (~i4), i3);
            }
            return iM27354;
        }
        this.f51831 = 0;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38078() {
        return this.f51828;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10739 m38079(AbstractC10739 abstractC10739) {
        HashMap map = this.f51829;
        ArrayList<AbstractC10739> arrayList = this.f51828;
        if (map == null) {
            this.f51829 = new HashMap();
            for (AbstractC10739 abstractC107310 : arrayList) {
                this.f51829.put(abstractC107310, abstractC107310);
            }
        }
        AbstractC10739 abstractC107311 = (AbstractC10739) this.f51829.get(abstractC10739);
        if (abstractC107311 != null) {
            return abstractC107311;
        }
        this.f51829.put(abstractC10739, abstractC10739);
        arrayList.add(abstractC10739);
        return abstractC10739;
    }
}
