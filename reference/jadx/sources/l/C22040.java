package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BGM */
/* JADX INFO: loaded from: classes.dex */
public final class C22040 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC18075 f71439;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71440;

    /* JADX WARN: Illegal instructions before constructor call */
    public C22040(EnumC18075 enumC18075, ArrayList arrayList) {
        int iM48956 = m48956(arrayList);
        AbstractC12432 abstractC12432 = (AbstractC12432) arrayList.get(0);
        super(iM48956, (abstractC12432.mo9739() * arrayList.size()) + m48956(arrayList));
        if (enumC18075 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f71440 = arrayList;
        this.f71439 = enumC18075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48956(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC12432) arrayList.get(0)).m30900());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return this.f71439;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C22040.class.getName());
        sb.append(this.f71440);
        return sb.toString();
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        Iterator it = this.f71440.iterator();
        while (it.hasNext()) {
            ((AbstractC12432) it.next()).mo4171(c4669);
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        StringBuilder sbM40152 = C17214.m40152(100, "{");
        boolean z = true;
        for (AbstractC12432 abstractC12432 : this.f71440) {
            if (z) {
                z = false;
            } else {
                sbM40152.append(", ");
            }
            sbM40152.append(abstractC12432.mo6991());
        }
        sbM40152.append(l.d);
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List m48957() {
        return this.f71440;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        ArrayList arrayList = this.f71440;
        int size = arrayList.size();
        if (c2718.m8288()) {
            c2718.m8283(0, m30901() + " " + mo4170().mo2376());
            c2718.m8283(4, "  size: ".concat(C22475.m49978(size)));
        }
        c2718.m8289(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC12432) it.next()).mo9738(c4669, c2718);
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        int iM30900 = m30900() + i;
        boolean z = true;
        int i2 = -1;
        int iM30901 = -1;
        for (AbstractC12432 abstractC12432 : this.f71440) {
            int iMo9739 = abstractC12432.mo9739();
            if (z) {
                iM30901 = abstractC12432.m30900();
                i2 = iMo9739;
                z = false;
            } else {
                if (iMo9739 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC12432.m30900() != iM30901) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM30900 = abstractC12432.m30902(c16665, iM30900) + iMo9739;
        }
    }
}
