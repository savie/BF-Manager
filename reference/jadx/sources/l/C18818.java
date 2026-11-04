package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18818 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f61152;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10722 f61153;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61154;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f61155;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C1028 f61156;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashMap f61157;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61158;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f61159;

    public C18818(C1028 c1028) {
        super(1, -1);
        if (c1028 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f61156 = c1028;
        this.f61152 = new ArrayList(20);
        this.f61157 = new HashMap(40);
        this.f61158 = new ArrayList(20);
        this.f61155 = new ArrayList(20);
        this.f61154 = new ArrayList(20);
        this.f61153 = null;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_CLASS_DATA_ITEM;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return toString();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m43678() {
        return this.f61152.isEmpty() && this.f61158.isEmpty() && this.f61155.isEmpty() && this.f61154.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43677(C19869 c19869, AbstractC13487 abstractC13487) {
        if (this.f61153 != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f61152.add(c19869);
        this.f61157.put(c19869, abstractC13487);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43676(C19869 c19869) {
        this.f61158.add(c19869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43675(C13156 c13156) {
        this.f61155.add(c13156);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43679(C13156 c13156) {
        this.f61154.add(c13156);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        ArrayList arrayList = this.f61152;
        if (!arrayList.isEmpty()) {
            m43680();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C19869) it.next()).m45724(c10918);
            }
        }
        ArrayList arrayList2 = this.f61158;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C19869) it2.next()).m45724(c10918);
            }
        }
        ArrayList arrayList3 = this.f61155;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C13156) it3.next()).m32684(c10918);
            }
        }
        ArrayList arrayList4 = this.f61154;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C13156) it4.next()).m32684(c10918);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10722 m43680() {
        HashMap map;
        C10722 c10722;
        if (this.f61153 == null) {
            ArrayList arrayList = this.f61152;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f61157;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC13487 abstractC13487 = (AbstractC13487) map.get((C19869) arrayList.get(size - 1));
                    if (abstractC13487 instanceof AbstractC24149) {
                        if (((AbstractC24149) abstractC13487).mo17876() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC13487 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c10722 = null;
                } else {
                    C21911 c21911 = new C21911(size);
                    for (int i = 0; i < size; i++) {
                        C19869 c19869 = (C19869) arrayList.get(i);
                        AbstractC13487 abstractC13487M22802 = (AbstractC13487) map.get(c19869);
                        if (abstractC13487M22802 == null) {
                            abstractC13487M22802 = C8485.m22802(c19869.m45725().getType());
                        }
                        c21911.mo31602(i, abstractC13487M22802);
                    }
                    c21911.mo15005();
                    c10722 = new C10722(c21911);
                }
                this.f61153 = c10722;
            }
        }
        return this.f61153;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        C15000 c15000 = new C15000();
        m43674(c19123.m23369(), c15000);
        byte[] bArrM36121 = c15000.m36121();
        this.f61159 = bArrM36121;
        m26283(bArrM36121.length);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43674(C10918 c10918, C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        if (zM36116) {
            c15000.m36111(0, m26281() + " class data for " + this.f61156.mo1843());
        }
        ArrayList arrayList = this.f61152;
        m43673(c15000, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f61158;
        m43673(c15000, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f61155;
        m43673(c15000, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f61154;
        m43673(c15000, "virtual_methods", arrayList4.size());
        m43672(c10918, c15000, "static_fields", arrayList);
        m43672(c10918, c15000, "instance_fields", arrayList2);
        m43672(c10918, c15000, "direct_methods", arrayList3);
        m43672(c10918, c15000, "virtual_methods", arrayList4);
        if (zM36116) {
            c15000.m36126();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43673(C15000 c15000, String str, int i) {
        if (c15000.m36116()) {
            c15000.m36113(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c15000.m36117(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43672(C10918 c10918, C15000 c15000, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c15000.m36116()) {
            c15000.m36111(0, EnumC7687.f25319 + str + ":");
        }
        int iMo32683 = 0;
        for (int i = 0; i < size; i++) {
            iMo32683 = ((AbstractC15393) arrayList.get(i)).mo32683(c10918, c15000, iMo32683, i);
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        if (c15000.m36116()) {
            m43674(c10918, c15000);
        } else {
            c15000.m36115(this.f61159);
        }
    }
}
