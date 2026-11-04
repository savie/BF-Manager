package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BGM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5897 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final EnumC3461 f20189;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20190;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5897(EnumC3461 enumC3461, ArrayList arrayList) {
        int iM17117 = m17117(arrayList);
        AbstractC10172 abstractC10172 = (AbstractC10172) arrayList.get(0);
        super(iM17117, (abstractC10172.mo13418() * arrayList.size()) + m17117(arrayList));
        if (enumC3461 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f20190 = arrayList;
        this.f20189 = enumC3461;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17117(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC10172) arrayList.get(0)).m26284());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return this.f20189;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C5897.class.getName());
        sb.append(this.f20190);
        return sb.toString();
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        Iterator it = this.f20190.iterator();
        while (it.hasNext()) {
            ((AbstractC10172) it.next()).mo1455(c10918);
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        StringBuilder sbM3018 = C0703.m3018(100, "{");
        boolean z = true;
        for (AbstractC10172 abstractC10172 : this.f20190) {
            if (z) {
                z = false;
            } else {
                sbM3018.append(", ");
            }
            sbM3018.append(abstractC10172.mo1456());
        }
        sbM3018.append(l.d);
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List m17118() {
        return this.f20190;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        ArrayList arrayList = this.f20190;
        int size = arrayList.size();
        if (c15000.m36116()) {
            c15000.m36111(0, m26281() + " " + mo1454().mo1843());
            c15000.m36111(4, "  size: ".concat(C5306.m15938(size)));
        }
        c15000.m36124(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC10172) it.next()).mo13417(c10918, c15000);
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        int iM26284 = m26284() + i;
        boolean z = true;
        int i2 = -1;
        int iM26285 = -1;
        for (AbstractC10172 abstractC10172 : this.f20190) {
            int iMo13418 = abstractC10172.mo13418();
            if (z) {
                iM26285 = abstractC10172.m26284();
                i2 = iMo13418;
                z = false;
            } else {
                if (iMo13418 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC10172.m26284() != iM26285) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM26284 = abstractC10172.m26282(c19123, iM26284) + iMo13418;
        }
    }
}
