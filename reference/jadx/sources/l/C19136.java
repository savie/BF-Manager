package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19136 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1661 f61808;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7847[] f61809;

    public C19136(C1661 c1661, C4669 c4669) {
        try {
            super(4, (c1661.size() * 4) + 4);
            this.f61808 = c1661;
            this.f61809 = new C7847[c1661.size()];
            Iterator it = c1661.getAnnotations().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f61809[i] = new C7847(c4669, (C23535) it.next());
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f61808.hashCode();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ */
    public final int mo6990(AbstractC12432 abstractC12432) {
        return this.f61808.compareTo(((C19136) abstractC12432).f61808);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f61808.toString();
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C16665 c16665M12873 = c4669.m12873();
        C7847[] c7847Arr = this.f61809;
        int length = c7847Arr.length;
        for (int i = 0; i < length; i++) {
            c7847Arr[i] = (C7847) c16665M12873.m39130(c7847Arr[i]);
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        C7847.m20726(this.f61809);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        C7847[] c7847Arr = this.f61809;
        int length = c7847Arr.length;
        if (zM8288) {
            c2718.m8283(0, m30901() + " annotation set");
            c2718.m8283(4, "  size: ".concat(C22475.m49978(length)));
        }
        c2718.m8289(length);
        for (int i = 0; i < length; i++) {
            int iM30904 = c7847Arr[i].m30904();
            if (zM8288) {
                c2718.m8283(4, "  entries[" + Integer.toHexString(i) + "]: " + C22475.m49978(iM30904));
                c7847Arr[i].m20727(c2718);
            }
            c2718.m8289(iM30904);
        }
    }
}
