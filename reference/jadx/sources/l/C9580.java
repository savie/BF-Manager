package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9580 extends AbstractC18979 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f32293;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511[] f32294;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f32295;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object[] f32296;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f32297;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f32298;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f32299;

    public C9580(AbstractC16511[] abstractC16511Arr, Object[] objArr, InterfaceC10273 interfaceC10273) {
        super(interfaceC10273);
        int length = abstractC16511Arr.length;
        this.f32294 = abstractC16511Arr;
        this.f32298 = new int[length];
        this.f32293 = new int[length];
        this.f32296 = objArr;
        this.f32295 = new HashMap();
        int length2 = abstractC16511Arr.length;
        int i = 0;
        int iMo19929 = 0;
        int iMo19928 = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC16511 abstractC16511 = abstractC16511Arr[i];
            this.f32294[i2] = abstractC16511;
            this.f32293[i2] = iMo19929;
            this.f32298[i2] = iMo19928;
            iMo19929 += abstractC16511.mo19929();
            iMo19928 += this.f32294[i2].mo19928();
            this.f32295.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f32299 = iMo19929;
        this.f32297 = iMo19928;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m24448() {
        return Arrays.asList(this.f32294);
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo24452(int i) {
        return C17983.m41824(this.f32298, i + 1, false, false);
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo24451(int i) {
        return C17983.m41824(this.f32293, i + 1, false, false);
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo24453(Object obj) {
        Integer num = (Integer) this.f32295.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 mo24446(int i) {
        return this.f32294[i];
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo24450(int i) {
        return this.f32298[i];
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo24454(int i) {
        return this.f32293[i];
    }

    @Override // l.AbstractC18979
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object mo24447(int i) {
        return this.f32296[i];
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ܰ */
    public final int mo19929() {
        return this.f32299;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final int mo19928() {
        return this.f32297;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9580 m24449(InterfaceC10273 interfaceC10273) {
        AbstractC16511[] abstractC16511Arr = this.f32294;
        AbstractC16511[] abstractC16511Arr2 = new AbstractC16511[abstractC16511Arr.length];
        for (int i = 0; i < abstractC16511Arr.length; i++) {
            abstractC16511Arr2[i] = new C1817(abstractC16511Arr[i]);
        }
        return new C9580(abstractC16511Arr2, this.f32296, interfaceC10273);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9580(List list, InterfaceC10273 interfaceC10273) {
        AbstractC16511[] abstractC16511Arr = new AbstractC16511[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC16511Arr[i2] = ((InterfaceC3933) it.next()).mo2143();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC3933) it2.next()).getUid();
            i++;
        }
        this(abstractC16511Arr, objArr, interfaceC10273);
    }
}
