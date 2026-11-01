package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12452 extends AbstractC15711 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C13689 f41516;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2641 f41517;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public long[][] f41518;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18095[] f41519;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C0456 f41520;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511[] f41521;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41522;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f41523;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41524;

    @Override // l.AbstractC15711
    /* JADX INFO: renamed from: ۙ */
    public final C15274 mo5890(Object obj, C15274 c15274) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f41522;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C16685) list.get(i)).f53461.equals(c15274)) {
                return ((C16685) ((List) arrayList.get(0)).get(i)).f53461;
            }
        }
        return null;
    }

    @Override // l.AbstractC15711
    /* JADX INFO: renamed from: ۙ */
    public final void mo5891(Object obj, AbstractC6537 abstractC6537, AbstractC16511 abstractC16511) {
        Integer num = (Integer) obj;
        if (this.f41520 != null) {
            return;
        }
        if (this.f41523 == -1) {
            this.f41523 = abstractC16511.mo19928();
        } else if (abstractC16511.mo19928() != this.f41523) {
            this.f41520 = new C0456();
            return;
        }
        int length = this.f41518.length;
        AbstractC16511[] abstractC16511Arr = this.f41521;
        if (length == 0) {
            this.f41518 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f41523, abstractC16511Arr.length);
        }
        ArrayList arrayList = this.f41524;
        arrayList.remove(abstractC6537);
        abstractC16511Arr[num.intValue()] = abstractC16511;
        if (arrayList.isEmpty()) {
            m17759(abstractC16511Arr[0]);
        }
    }

    static {
        C20348 c20348 = new C20348();
        c20348.m45918("MergingMediaSource");
        f41516 = c20348.m45915();
    }

    public C12452(InterfaceC18095... interfaceC18095Arr) {
        C2641 c2641 = new C2641();
        this.f41519 = interfaceC18095Arr;
        this.f41517 = c2641;
        this.f41524 = new ArrayList(Arrays.asList(interfaceC18095Arr));
        this.f41523 = -1;
        this.f41522 = new ArrayList(interfaceC18095Arr.length);
        for (int i = 0; i < interfaceC18095Arr.length; i++) {
            this.f41522.add(new ArrayList());
        }
        this.f41521 = new AbstractC16511[interfaceC18095Arr.length];
        this.f41518 = new long[0][];
        new HashMap();
        AbstractC0374.m2105().m45496().mo37809();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final C13689 mo4106() {
        InterfaceC18095[] interfaceC18095Arr = this.f41519;
        return interfaceC18095Arr.length > 0 ? interfaceC18095Arr[0].mo4106() : f41516;
    }

    @Override // l.AbstractC6537, l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4109(C13689 c13689) {
        this.f41519[0].mo4109(c13689);
    }

    @Override // l.AbstractC15711, l.AbstractC6537
    /* JADX INFO: renamed from: ۙ */
    public final void mo4110(InterfaceC19706 interfaceC19706) {
        super.mo4110(interfaceC19706);
        int i = 0;
        while (true) {
            InterfaceC18095[] interfaceC18095Arr = this.f41519;
            if (i >= interfaceC18095Arr.length) {
                return;
            }
            m37415(Integer.valueOf(i), interfaceC18095Arr[i]);
            i++;
        }
    }

    @Override // l.AbstractC15711, l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ */
    public final void mo4111() throws C0456 {
        C0456 c0456 = this.f41520;
        if (c0456 != null) {
            throw c0456;
        }
        super.mo4111();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6806 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        InterfaceC18095[] interfaceC18095Arr = this.f41519;
        int length = interfaceC18095Arr.length;
        InterfaceC6806[] interfaceC6806Arr = new InterfaceC6806[length];
        AbstractC16511[] abstractC16511Arr = this.f41521;
        int iMo14959 = abstractC16511Arr[0].mo14959(c15274.f49778);
        for (int i = 0; i < length; i++) {
            C15274 c15274M36575 = c15274.m36575(abstractC16511Arr[i].mo14960(iMo14959));
            interfaceC6806Arr[i] = interfaceC18095Arr[i].mo4105(c15274M36575, interfaceC15732, j - this.f41518[iMo14959][i]);
            ((List) this.f41522.get(i)).add(new C16685(c15274M36575, interfaceC6806Arr[i]));
        }
        return new C20213(this.f41517, this.f41518[iMo14959], interfaceC6806Arr);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        C20213 c20213 = (C20213) interfaceC6806;
        int i = 0;
        while (true) {
            InterfaceC18095[] interfaceC18095Arr = this.f41519;
            if (i >= interfaceC18095Arr.length) {
                return;
            }
            List list = (List) this.f41522.get(i);
            InterfaceC6806 interfaceC6806M45666 = c20213.m45666(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C16685) list.get(i2)).f53460.equals(interfaceC6806M45666)) {
                    list.remove(i2);
                    break;
                }
            }
            interfaceC18095Arr[i].mo4108(c20213.m45666(i));
            i++;
        }
    }

    @Override // l.AbstractC15711, l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public final void mo4104() {
        super.mo4104();
        Arrays.fill(this.f41521, (Object) null);
        this.f41523 = -1;
        this.f41520 = null;
        ArrayList arrayList = this.f41524;
        arrayList.clear();
        Collections.addAll(arrayList, this.f41519);
    }
}
