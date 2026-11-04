package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C20615 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC3461 f66135;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC23599 f66136;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC8681 f66137;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f66138;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47237(AbstractC8681[] abstractC8681Arr, C19123 c19123) {
        if (abstractC8681Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (((ArrayList) c19123.mo3721()).size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC8681 abstractC8681 : abstractC8681Arr) {
            EnumC3461 enumC3461 = null;
            AbstractC23599 abstractC23599 = null;
            AbstractC23599 abstractC235910 = null;
            int i = 0;
            for (AbstractC23599 abstractC235911 : abstractC8681.mo3721()) {
                EnumC3461 enumC3461Mo1454 = abstractC235911.mo1454();
                if (enumC3461Mo1454 != enumC3461) {
                    if (i != 0) {
                        arrayList.add(new C20615(enumC3461, abstractC8681, abstractC23599, abstractC235910, i));
                    }
                    i = 0;
                    abstractC23599 = abstractC235911;
                    enumC3461 = enumC3461Mo1454;
                }
                i++;
                abstractC235910 = abstractC235911;
            }
            if (i != 0) {
                arrayList.add(new C20615(enumC3461, abstractC8681, abstractC23599, abstractC235910, i));
            } else if (abstractC8681 == c19123) {
                arrayList.add(new C20615(c19123));
            }
        }
        c19123.m44244((AbstractC10172) new C5897(EnumC3461.TYPE_MAP_LIST, arrayList));
    }

    public C20615(EnumC3461 enumC3461, AbstractC8681 abstractC8681, AbstractC23599 abstractC23599, AbstractC23599 abstractC235910, int i) {
        super(4, 12);
        if (enumC3461 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC23599 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC235910 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f66135 = enumC3461;
        this.f66137 = abstractC8681;
        this.f66136 = abstractC23599;
        this.f66138 = i;
    }

    public C20615(C19123 c19123) {
        super(4, 12);
        if (c19123 == null) {
            throw new NullPointerException("section == null");
        }
        this.f66135 = EnumC3461.TYPE_MAP_LIST;
        this.f66137 = c19123;
        this.f66136 = null;
        this.f66138 = 1;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_MAP_ITEM;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C20615.class.getName());
        sb.append('{');
        sb.append(this.f66137.toString());
        sb.append(' ');
        sb.append(this.f66135.mo1843());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return toString();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        int iMo23361;
        EnumC3461 enumC3461 = this.f66135;
        int iM11395 = enumC3461.m11395();
        AbstractC8681 abstractC8681 = this.f66137;
        AbstractC23599 abstractC23599 = this.f66136;
        if (abstractC23599 == null) {
            iMo23361 = abstractC8681.m23364();
        } else {
            iMo23361 = abstractC8681.mo23361(abstractC23599);
        }
        boolean zM36116 = c15000.m36116();
        int i = this.f66138;
        if (zM36116) {
            c15000.m36111(0, m26281() + ' ' + enumC3461.m11394() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(C5306.m15934(iM11395));
            sb.append(" // ");
            sb.append(enumC3461.toString());
            c15000.m36111(2, sb.toString());
            c15000.m36111(2, "  unused: 0");
            c15000.m36111(4, "  size:   ".concat(C5306.m15938(i)));
            c15000.m36111(4, "  offset: ".concat(C5306.m15938(iMo23361)));
        }
        c15000.m36123(iM11395);
        c15000.m36123(0);
        c15000.m36124(i);
        c15000.m36124(iMo23361);
    }
}
