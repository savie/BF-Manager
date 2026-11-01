package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C18781 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC23721 f60896;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC18075 f60897;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC21603 f60898;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f60899;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43337(AbstractC23721[] abstractC23721Arr, C16665 c16665) {
        if (abstractC23721Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (((ArrayList) c16665.mo12263()).size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC23721 abstractC23721 : abstractC23721Arr) {
            EnumC18075 enumC18075 = null;
            AbstractC21603 abstractC21603 = null;
            AbstractC21603 abstractC21604 = null;
            int i = 0;
            for (AbstractC21603 abstractC21605 : abstractC23721.mo12263()) {
                EnumC18075 enumC18075Mo4170 = abstractC21605.mo4170();
                if (enumC18075Mo4170 != enumC18075) {
                    if (i != 0) {
                        arrayList.add(new C18781(enumC18075, abstractC23721, abstractC21603, abstractC21604, i));
                    }
                    i = 0;
                    abstractC21603 = abstractC21605;
                    enumC18075 = enumC18075Mo4170;
                }
                i++;
                abstractC21604 = abstractC21605;
            }
            if (i != 0) {
                arrayList.add(new C18781(enumC18075, abstractC23721, abstractC21603, abstractC21604, i));
            } else if (abstractC23721 == c16665) {
                arrayList.add(new C18781(c16665));
            }
        }
        c16665.m39128((AbstractC12432) new C22040(EnumC18075.TYPE_MAP_LIST, arrayList));
    }

    public C18781(EnumC18075 enumC18075, AbstractC23721 abstractC23721, AbstractC21603 abstractC21603, AbstractC21603 abstractC21604, int i) {
        super(4, 12);
        if (enumC18075 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC21603 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC21604 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f60897 = enumC18075;
        this.f60896 = abstractC23721;
        this.f60898 = abstractC21603;
        this.f60899 = i;
    }

    public C18781(C16665 c16665) {
        super(4, 12);
        if (c16665 == null) {
            throw new NullPointerException("section == null");
        }
        this.f60897 = EnumC18075.TYPE_MAP_LIST;
        this.f60896 = c16665;
        this.f60898 = null;
        this.f60899 = 1;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_MAP_ITEM;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C18781.class.getName());
        sb.append('{');
        sb.append(this.f60896.toString());
        sb.append(' ');
        sb.append(this.f60897.mo2376());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return toString();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        int iMo14220;
        EnumC18075 enumC18075 = this.f60897;
        int iM42071 = enumC18075.m42071();
        AbstractC23721 abstractC23721 = this.f60896;
        AbstractC21603 abstractC21603 = this.f60898;
        if (abstractC21603 == null) {
            iMo14220 = abstractC23721.m52248();
        } else {
            iMo14220 = abstractC23721.mo14220(abstractC21603);
        }
        boolean zM8288 = c2718.m8288();
        int i = this.f60899;
        if (zM8288) {
            c2718.m8283(0, m30901() + ' ' + enumC18075.m42070() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(C22475.m49982(iM42071));
            sb.append(" // ");
            sb.append(enumC18075.toString());
            c2718.m8283(2, sb.toString());
            c2718.m8283(2, "  unused: 0");
            c2718.m8283(4, "  size:   ".concat(C22475.m49978(i)));
            c2718.m8283(4, "  offset: ".concat(C22475.m49978(iMo14220)));
        }
        c2718.m8297(iM42071);
        c2718.m8297(0);
        c2718.m8289(i);
        c2718.m8289(iMo14220);
    }
}
