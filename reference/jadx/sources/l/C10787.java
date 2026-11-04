package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBGQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10787 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f34232;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24960 f34234;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34235;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34236;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f34237;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f34238;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487[] f34239;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f34240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BitSet f34241;

    public C10787(C24960 c24960) {
        this.f34234 = c24960;
        int iM55737 = c24960.m55737();
        this.f34237 = iM55737;
        this.f34238 = new int[iM55737];
        this.f34239 = new AbstractC13487[iM55737];
        this.f34235 = new ArrayList();
        this.f34240 = new ArrayList();
        this.f34241 = new BitSet(c24960.m55749().size());
        this.f34232 = new ArrayList();
        this.f34236 = new ArrayList();
        this.f34233 = new ArrayList();
        for (int i = 0; i < this.f34237; i++) {
            this.f34238[i] = 0;
            this.f34239[i] = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27492(C24960 c24960) {
        BitSet bitSet;
        C10787 c10787 = new C10787(c24960);
        c10787.m27491(c24960.m55739());
        while (true) {
            ArrayList arrayList = c10787.f34235;
            boolean zIsEmpty = arrayList.isEmpty();
            bitSet = c10787.f34241;
            ArrayList arrayList2 = c10787.f34236;
            ArrayList arrayList3 = c10787.f34232;
            ArrayList arrayList4 = c10787.f34240;
            if (zIsEmpty && arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            while (!arrayList.isEmpty()) {
                for (AbstractC5568 abstractC5568 : ((C19738) C18011.m41990(arrayList, 1)).m45460()) {
                    if (abstractC5568 instanceof C14033) {
                        c10787.m27490((C14033) abstractC5568);
                    } else {
                        c10787.m27489(abstractC5568);
                    }
                }
            }
            while (!arrayList4.isEmpty()) {
                for (AbstractC5568 abstractC5569 : ((C19738) C18011.m41990(arrayList4, 1)).m45460()) {
                    if (!(abstractC5569 instanceof C14033)) {
                        break;
                    } else {
                        c10787.m27490((C14033) abstractC5569);
                    }
                }
            }
            while (!arrayList2.isEmpty()) {
                AbstractC5568 abstractC55610 = (AbstractC5568) C18011.m41990(arrayList2, 1);
                if (bitSet.get(abstractC55610.m16506().m45472())) {
                    if (abstractC55610 instanceof C14033) {
                        c10787.m27490((C14033) abstractC55610);
                    } else {
                        c10787.m27489(abstractC55610);
                    }
                }
            }
            while (!arrayList3.isEmpty()) {
                AbstractC5568 abstractC55611 = (AbstractC5568) C18011.m41990(arrayList3, 1);
                if (bitSet.get(abstractC55611.m16506().m45472())) {
                    if (abstractC55611 instanceof C14033) {
                        c10787.m27490((C14033) abstractC55611);
                    } else {
                        c10787.m27489(abstractC55611);
                    }
                }
            }
        }
        for (int i = 0; i < c10787.f34237; i++) {
            if (c10787.f34238[i] == 1) {
                AbstractC13487[] abstractC13487Arr = c10787.f34239;
                if (abstractC13487Arr[i] instanceof AbstractC2519) {
                    AbstractC5568 abstractC5568M55738 = c24960.m55738(i);
                    if (!abstractC5568M55738.m16508().m47898().mo8409()) {
                        abstractC5568M55738.m16504(abstractC5568M55738.m16508().m47892((AbstractC2519) abstractC13487Arr[i]));
                        for (AbstractC5568 abstractC55612 : c24960.m55752(i)) {
                            if (!abstractC55612.mo4989()) {
                                C1356 c1356 = (C1356) abstractC55612;
                                C0063 c0063Mo4992 = abstractC55612.mo4992();
                                int iM1041 = c0063Mo4992.m1041(i);
                                c1356.m4985(iM1041, c0063Mo4992.m31619get(iM1041).m47892((AbstractC2519) abstractC13487Arr[i]));
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC5568 abstractC55613 : c10787.f34233) {
            C19738 c19738M16506 = abstractC55613.m16506();
            int size = c19738M16506.m45469().size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = c19738M16506.m45469().get(i3);
                if (!bitSet.get(i4)) {
                    i2 = i4;
                }
            }
            if (size == 2 && i2 != -1) {
                c19738M16506.m45474(new C23930(C0809.f3062, abstractC55613.mo4993().m40433(), (C20946) null, C0063.f947));
                c19738M16506.m45477(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27491(C19738 c19738) {
        int iM45472 = c19738.m45472();
        BitSet bitSet = this.f34241;
        if (!bitSet.get(iM45472)) {
            this.f34235.add(c19738);
            bitSet.set(c19738.m45472());
        } else {
            this.f34240.add(c19738);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27488(int i, int i2) {
        C24960 c24960 = this.f34234;
        if (i2 == 2) {
            Iterator it = c24960.m55752(i).iterator();
            while (it.hasNext()) {
                this.f34236.add((AbstractC5568) it.next());
            }
            return;
        }
        Iterator it2 = c24960.m55752(i).iterator();
        while (it2.hasNext()) {
            this.f34232.add((AbstractC5568) it2.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27493(int i, int i2, AbstractC13487 abstractC13487) {
        int[] iArr = this.f34238;
        if (i2 != 1) {
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        int i3 = iArr[i];
        AbstractC13487[] abstractC13487Arr = this.f34239;
        if (i3 == i2 && abstractC13487Arr[i].equals(abstractC13487)) {
            return false;
        }
        iArr[i] = i2;
        abstractC13487Arr[i] = abstractC13487;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27490(C14033 c14033) {
        int iM47903 = c14033.m16508().m47903();
        int[] iArr = this.f34238;
        int i = 2;
        if (iArr[iM47903] == 2) {
            return;
        }
        C0063 c0063Mo4992 = c14033.mo4992();
        int size = c0063Mo4992.size();
        int i2 = 0;
        AbstractC13487 abstractC13487 = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iM34186 = c14033.m34186(i2);
            int iM47904 = c0063Mo4992.m31619get(i2).m47903();
            int i4 = iArr[iM47904];
            if (this.f34241.get(iM34186)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                }
                AbstractC13487[] abstractC13487Arr = this.f34239;
                if (abstractC13487 == null) {
                    abstractC13487 = abstractC13487Arr[iM47904];
                    i3 = 1;
                } else if (!abstractC13487Arr[iM47904].equals(abstractC13487)) {
                    break;
                }
            }
            i2++;
        }
        if (m27493(iM47903, i, abstractC13487)) {
            m27488(iM47903, i);
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
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
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
    private void m27489(l.AbstractC5568 r17) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10787.m27489(l.ۚۢܺ):void");
    }
}
