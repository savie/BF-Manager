package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBGQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4814 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f16913;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BitSet f16914;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16915;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16916;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901[] f16917;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16918;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16919;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4108 f16920;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16921;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f16922;

    public C4814(C4108 c4108) {
        this.f16920 = c4108;
        int iM11685 = c4108.m11685();
        this.f16913 = iM11685;
        this.f16922 = new int[iM11685];
        this.f16917 = new AbstractC9901[iM11685];
        this.f16919 = new ArrayList();
        this.f16921 = new ArrayList();
        this.f16914 = new BitSet(c4108.m11687().size());
        this.f16915 = new ArrayList();
        this.f16918 = new ArrayList();
        this.f16916 = new ArrayList();
        for (int i = 0; i < this.f16913; i++) {
            this.f16922[i] = 0;
            this.f16917[i] = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13370(C4108 c4108) {
        BitSet bitSet;
        C4814 c4814 = new C4814(c4108);
        c4814.m13372(c4108.m11683());
        while (true) {
            ArrayList arrayList = c4814.f16919;
            boolean zIsEmpty = arrayList.isEmpty();
            bitSet = c4814.f16914;
            ArrayList arrayList2 = c4814.f16918;
            ArrayList arrayList3 = c4814.f16915;
            ArrayList arrayList4 = c4814.f16921;
            if (zIsEmpty && arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            while (!arrayList.isEmpty()) {
                for (AbstractC22454 abstractC22454 : ((C11871) C17745.m41308(arrayList, 1)).m29613()) {
                    if (abstractC22454 instanceof C9859) {
                        c4814.m13371((C9859) abstractC22454);
                    } else {
                        c4814.m13373(abstractC22454);
                    }
                }
            }
            while (!arrayList4.isEmpty()) {
                for (AbstractC22454 abstractC22455 : ((C11871) C17745.m41308(arrayList4, 1)).m29613()) {
                    if (!(abstractC22455 instanceof C9859)) {
                        break;
                    } else {
                        c4814.m13371((C9859) abstractC22455);
                    }
                }
            }
            while (!arrayList2.isEmpty()) {
                AbstractC22454 abstractC22456 = (AbstractC22454) C17745.m41308(arrayList2, 1);
                if (bitSet.get(abstractC22456.m49949().m29617())) {
                    if (abstractC22456 instanceof C9859) {
                        c4814.m13371((C9859) abstractC22456);
                    } else {
                        c4814.m13373(abstractC22456);
                    }
                }
            }
            while (!arrayList3.isEmpty()) {
                AbstractC22454 abstractC22457 = (AbstractC22454) C17745.m41308(arrayList3, 1);
                if (bitSet.get(abstractC22457.m49949().m29617())) {
                    if (abstractC22457 instanceof C9859) {
                        c4814.m13371((C9859) abstractC22457);
                    } else {
                        c4814.m13373(abstractC22457);
                    }
                }
            }
        }
        for (int i = 0; i < c4814.f16913; i++) {
            if (c4814.f16922[i] == 1) {
                AbstractC9901[] abstractC9901Arr = c4814.f16917;
                if (abstractC9901Arr[i] instanceof AbstractC23783) {
                    AbstractC22454 abstractC22454M11684 = c4108.m11684(i);
                    if (!abstractC22454M11684.m49955().m38401().mo9847()) {
                        abstractC22454M11684.m49952(abstractC22454M11684.m49955().m38390((AbstractC23783) abstractC9901Arr[i]));
                        for (AbstractC22454 abstractC22458 : c4108.m11667(i)) {
                            if (!abstractC22458.mo17424()) {
                                C6330 c6330 = (C6330) abstractC22458;
                                C0727 c0727Mo17429 = abstractC22458.mo17429();
                                int iM3152 = c0727Mo17429.m3152(i);
                                c6330.m17418(iM3152, c0727Mo17429.m15275get(iM3152).m38390((AbstractC23783) abstractC9901Arr[i]));
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC22454 abstractC22459 : c4814.f16916) {
            C11871 c11871M49949 = abstractC22459.m49949();
            int size = c11871M49949.m29625().size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = c11871M49949.m29625().get(i3);
                if (!bitSet.get(i4)) {
                    i2 = i4;
                }
            }
            if (size == 2 && i2 != -1) {
                c11871M49949.m29620(new C10607(C6372.f21606, abstractC22459.mo17428().m37183(), (C16251) null, C0727.f3015));
                c11871M49949.m29598(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13372(C11871 c11871) {
        int iM29617 = c11871.m29617();
        BitSet bitSet = this.f16914;
        if (!bitSet.get(iM29617)) {
            this.f16919.add(c11871);
            bitSet.set(c11871.m29617());
        } else {
            this.f16921.add(c11871);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13369(int i, int i2) {
        C4108 c4108 = this.f16920;
        if (i2 == 2) {
            Iterator it = c4108.m11667(i).iterator();
            while (it.hasNext()) {
                this.f16918.add((AbstractC22454) it.next());
            }
            return;
        }
        Iterator it2 = c4108.m11667(i).iterator();
        while (it2.hasNext()) {
            this.f16915.add((AbstractC22454) it2.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13374(int i, int i2, AbstractC9901 abstractC9901) {
        int[] iArr = this.f16922;
        if (i2 != 1) {
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        int i3 = iArr[i];
        AbstractC9901[] abstractC9901Arr = this.f16917;
        if (i3 == i2 && abstractC9901Arr[i].equals(abstractC9901)) {
            return false;
        }
        iArr[i] = i2;
        abstractC9901Arr[i] = abstractC9901;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13371(C9859 c9859) {
        int iM38400 = c9859.m49955().m38400();
        int[] iArr = this.f16922;
        int i = 2;
        if (iArr[iM38400] == 2) {
            return;
        }
        C0727 c0727Mo17429 = c9859.mo17429();
        int size = c0727Mo17429.size();
        int i2 = 0;
        AbstractC9901 abstractC9901 = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iM24960 = c9859.m24960(i2);
            int iM38401 = c0727Mo17429.m15275get(i2).m38400();
            int i4 = iArr[iM38401];
            if (this.f16914.get(iM24960)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                }
                AbstractC9901[] abstractC9901Arr = this.f16917;
                if (abstractC9901 == null) {
                    abstractC9901 = abstractC9901Arr[iM38401];
                    i3 = 1;
                } else if (!abstractC9901Arr[iM38401].equals(abstractC9901)) {
                    break;
                }
            }
            i2++;
        }
        if (m13374(iM38400, i, abstractC9901)) {
            m13369(iM38400, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13373(l.AbstractC22454 r17) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4814.m13373(l.᩹ᩳܶ):void");
    }
}
