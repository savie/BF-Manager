package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16314 extends AbstractC12432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6143 f52535;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52536;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f52539;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13905 f52540;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f52541;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f52542;

    public C16314(C6143 c6143) {
        super(1, -1);
        if (c6143 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f52535 = c6143;
        this.f52538 = new ArrayList(20);
        this.f52542 = new HashMap(40);
        this.f52536 = new ArrayList(20);
        this.f52539 = new ArrayList(20);
        this.f52537 = new ArrayList(20);
        this.f52540 = null;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_CLASS_DATA_ITEM;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return toString();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m38480() {
        return this.f52538.isEmpty() && this.f52536.isEmpty() && this.f52539.isEmpty() && this.f52537.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38478(C11726 c11726, AbstractC9901 abstractC9901) {
        if (this.f52540 != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f52538.add(c11726);
        this.f52542.put(c11726, abstractC9901);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38477(C11726 c11726) {
        this.f52536.add(c11726);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38476(C5375 c5375) {
        this.f52539.add(c5375);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38479(C5375 c5375) {
        this.f52537.add(c5375);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        ArrayList arrayList = this.f52538;
        if (!arrayList.isEmpty()) {
            m38481();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C11726) it.next()).m29307(c4669);
            }
        }
        ArrayList arrayList2 = this.f52536;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C11726) it2.next()).m29307(c4669);
            }
        }
        ArrayList arrayList3 = this.f52539;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C5375) it3.next()).m14891(c4669);
            }
        }
        ArrayList arrayList4 = this.f52537;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C5375) it4.next()).m14891(c4669);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C13905 m38481() {
        HashMap map;
        C13905 c13905;
        if (this.f52540 == null) {
            ArrayList arrayList = this.f52538;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f52542;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC9901 abstractC9901 = (AbstractC9901) map.get((C11726) arrayList.get(size - 1));
                    if (abstractC9901 instanceof AbstractC10377) {
                        if (((AbstractC10377) abstractC9901).mo21659() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC9901 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c13905 = null;
                } else {
                    C4731 c4731 = new C4731(size);
                    for (int i = 0; i < size; i++) {
                        C11726 c11726 = (C11726) arrayList.get(i);
                        AbstractC9901 abstractC9901M35085 = (AbstractC9901) map.get(c11726);
                        if (abstractC9901M35085 == null) {
                            abstractC9901M35085 = C14611.m35085(c11726.m29308().getType());
                        }
                        c4731.mo15257(i, abstractC9901M35085);
                    }
                    c4731.mo9637();
                    c13905 = new C13905(c4731);
                }
                this.f52540 = c13905;
            }
        }
        return this.f52540;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        C2718 c2718 = new C2718();
        m38475(c16665.m52251(), c2718);
        byte[] bArrM8278 = c2718.m8278();
        this.f52541 = bArrM8278;
        m30903(bArrM8278.length);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m38475(C4669 c4669, C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        if (zM8288) {
            c2718.m8283(0, m30901() + " class data for " + this.f52535.mo2376());
        }
        ArrayList arrayList = this.f52538;
        m38473(c2718, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f52536;
        m38473(c2718, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f52539;
        m38473(c2718, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f52537;
        m38473(c2718, "virtual_methods", arrayList4.size());
        m38474(c4669, c2718, "static_fields", arrayList);
        m38474(c4669, c2718, "instance_fields", arrayList2);
        m38474(c4669, c2718, "direct_methods", arrayList3);
        m38474(c4669, c2718, "virtual_methods", arrayList4);
        if (zM8288) {
            c2718.m8294();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38473(C2718 c2718, String str, int i) {
        if (c2718.m8288()) {
            c2718.m8285(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c2718.m8293(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38474(C4669 c4669, C2718 c2718, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c2718.m8288()) {
            c2718.m8283(0, EnumC19730.f63352 + str + ":");
        }
        int iMo7959 = 0;
        for (int i = 0; i < size; i++) {
            iMo7959 = ((AbstractC2552) arrayList.get(i)).mo7959(c4669, c2718, iMo7959, i);
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        if (c2718.m8288()) {
            m38475(c4669, c2718);
        } else {
            c2718.m8287(this.f52541);
        }
    }
}
