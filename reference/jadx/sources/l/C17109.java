package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17109 extends AbstractC5420 {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C14902 f55833;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C11888 f55834;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55835;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17933 f55836;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f55837;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC13622[] f55838;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755[] f55839;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55840;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long[][] f55841;

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final C8402 mo16148(Object obj, C8402 c8402) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f55835;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C25315) list.get(i)).f81775.equals(c8402)) {
                return ((C25315) ((List) arrayList.get(0)).get(i)).f81775;
            }
        }
        return null;
    }

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final void mo16149(Object obj, AbstractC9395 abstractC9395, AbstractC24755 abstractC24755) {
        Integer num = (Integer) obj;
        if (this.f55834 != null) {
            return;
        }
        if (this.f55837 == -1) {
            this.f55837 = abstractC24755.mo16021();
        } else if (abstractC24755.mo16021() != this.f55837) {
            this.f55834 = new C11888();
            return;
        }
        int length = this.f55841.length;
        AbstractC24755[] abstractC24755Arr = this.f55839;
        if (length == 0) {
            this.f55841 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f55837, abstractC24755Arr.length);
        }
        ArrayList arrayList = this.f55840;
        arrayList.remove(abstractC9395);
        abstractC24755Arr[num.intValue()] = abstractC24755;
        if (arrayList.isEmpty()) {
            m24728(abstractC24755Arr[0]);
        }
    }

    static {
        C2225 c2225 = new C2225();
        c2225.m7573("MergingMediaSource");
        f55833 = c2225.m7570();
    }

    public C17109(InterfaceC13622... interfaceC13622Arr) {
        C17933 c17933 = new C17933();
        this.f55838 = interfaceC13622Arr;
        this.f55836 = c17933;
        this.f55840 = new ArrayList(Arrays.asList(interfaceC13622Arr));
        this.f55837 = -1;
        this.f55835 = new ArrayList(interfaceC13622Arr.length);
        for (int i = 0; i < interfaceC13622Arr.length; i++) {
            this.f55835.add(new ArrayList());
        }
        this.f55839 = new AbstractC24755[interfaceC13622Arr.length];
        this.f55841 = new long[0][];
        new HashMap();
        AbstractC14277.m34688().m12376().mo17587();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final C14902 mo30717() {
        InterfaceC13622[] interfaceC13622Arr = this.f55838;
        return interfaceC13622Arr.length > 0 ? interfaceC13622Arr[0].mo30717() : f55833;
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo24727(C14902 c14902) {
        this.f55838[0].mo24727(c14902);
    }

    @Override // l.AbstractC5420, l.AbstractC9395
    /* JADX INFO: renamed from: ۙ */
    public final void mo16151(InterfaceC4639 interfaceC4639) {
        super.mo16151(interfaceC4639);
        int i = 0;
        while (true) {
            InterfaceC13622[] interfaceC13622Arr = this.f55838;
            if (i >= interfaceC13622Arr.length) {
                return;
            }
            m16150(Integer.valueOf(i), interfaceC13622Arr[i]);
            i++;
        }
    }

    @Override // l.AbstractC5420, l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16154() throws C11888 {
        C11888 c11888 = this.f55834;
        if (c11888 != null) {
            throw c11888;
        }
        super.mo16154();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9147 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        InterfaceC13622[] interfaceC13622Arr = this.f55838;
        int length = interfaceC13622Arr.length;
        InterfaceC9147[] interfaceC9147Arr = new InterfaceC9147[length];
        AbstractC24755[] abstractC24755Arr = this.f55839;
        int iMo1588 = abstractC24755Arr[0].mo1588(c8402.f27520);
        for (int i = 0; i < length; i++) {
            C8402 c8402M22580 = c8402.m22580(abstractC24755Arr[i].mo1589(iMo1588));
            interfaceC9147Arr[i] = interfaceC13622Arr[i].mo33371(c8402M22580, interfaceC13314, j - this.f55841[iMo1588][i]);
            ((List) this.f55835.get(i)).add(new C25315(c8402M22580, interfaceC9147Arr[i]));
        }
        return new C2194(this.f55836, this.f55841[iMo1588], interfaceC9147Arr);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        C2194 c2194 = (C2194) interfaceC9147;
        int i = 0;
        while (true) {
            InterfaceC13622[] interfaceC13622Arr = this.f55838;
            if (i >= interfaceC13622Arr.length) {
                return;
            }
            List list = (List) this.f55835.get(i);
            InterfaceC9147 interfaceC9147M7500 = c2194.m7500(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C25315) list.get(i2)).f81774.equals(interfaceC9147M7500)) {
                    list.remove(i2);
                    break;
                }
            }
            interfaceC13622Arr[i].mo33372(c2194.m7500(i));
            i++;
        }
    }

    @Override // l.AbstractC5420, l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
        super.mo16145();
        Arrays.fill(this.f55839, (Object) null);
        this.f55837 = -1;
        this.f55834 = null;
        ArrayList arrayList = this.f55840;
        arrayList.clear();
        Collections.addAll(arrayList, this.f55838);
    }
}
