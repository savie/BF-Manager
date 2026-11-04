package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6240 extends AbstractC5142 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC24755[] f21177;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f21178;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object[] f21179;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f21180;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f21181;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f21182;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f21183;

    public C6240(AbstractC24755[] abstractC24755Arr, Object[] objArr, InterfaceC19764 interfaceC19764) {
        super(interfaceC19764);
        int length = abstractC24755Arr.length;
        this.f21177 = abstractC24755Arr;
        this.f21181 = new int[length];
        this.f21180 = new int[length];
        this.f21179 = objArr;
        this.f21182 = new HashMap();
        int length2 = abstractC24755Arr.length;
        int i = 0;
        int iMo16022 = 0;
        int iMo16021 = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC24755 abstractC24755 = abstractC24755Arr[i];
            this.f21177[i2] = abstractC24755;
            this.f21180[i2] = iMo16022;
            this.f21181[i2] = iMo16021;
            iMo16022 += abstractC24755.mo16022();
            iMo16021 += this.f21177[i2].mo16021();
            this.f21182.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f21183 = iMo16022;
        this.f21178 = iMo16021;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m17872() {
        return Arrays.asList(this.f21177);
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15540(int i) {
        return C7116.m19471(this.f21181, i + 1, false, false);
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ۤ */
    public final int mo15536(int i) {
        return C7116.m19471(this.f21180, i + 1, false, false);
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15542(Object obj) {
        Integer num = (Integer) this.f21182.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC24755 mo15537(int i) {
        return this.f21177[i];
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ᩴ */
    public final int mo15539(int i) {
        return this.f21181[i];
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ܳ */
    public final int mo15538(int i) {
        return this.f21180[i];
    }

    @Override // l.AbstractC5142
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo15544(int i) {
        return this.f21179[i];
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ᩷ */
    public final int mo16022() {
        return this.f21183;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final int mo16021() {
        return this.f21178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6240 m17871(InterfaceC19764 interfaceC19764) {
        AbstractC24755[] abstractC24755Arr = this.f21177;
        AbstractC24755[] abstractC24755Arr2 = new AbstractC24755[abstractC24755Arr.length];
        for (int i = 0; i < abstractC24755Arr.length; i++) {
            abstractC24755Arr2[i] = new C12205(abstractC24755Arr[i]);
        }
        return new C6240(abstractC24755Arr2, this.f21179, interfaceC19764);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6240(List list, InterfaceC19764 interfaceC19764) {
        AbstractC24755[] abstractC24755Arr = new AbstractC24755[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC24755Arr[i2] = ((InterfaceC0800) it.next()).mo3209();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC0800) it2.next()).getUid();
            i++;
        }
        this(abstractC24755Arr, objArr, interfaceC19764);
    }
}
