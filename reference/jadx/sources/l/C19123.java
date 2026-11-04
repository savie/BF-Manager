package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ᩳܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19123 extends AbstractC8681 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Comparator f61888 = new C0478();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f61889;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC7936 f61890;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f61891;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f61892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC10172 m44247(AbstractC10172 abstractC10172) {
        m23363();
        AbstractC10172 abstractC10173 = (AbstractC10172) this.f61892.get(abstractC10172);
        if (abstractC10173 != null) {
            return abstractC10173;
        }
        m44244(abstractC10172);
        this.f61892.put(abstractC10172, abstractC10172);
        return abstractC10172;
    }

    public C19123(String str, C10918 c10918, int i, EnumC7936 enumC7936) {
        super(str, c10918, i);
        this.f61891 = new ArrayList(100);
        this.f61892 = new HashMap(100);
        this.f61890 = enumC7936;
        this.f61889 = -1;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f61891;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ֫ */
    public final int mo23358() {
        m23365();
        return this.f61889;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ۙ */
    public final int mo23361(AbstractC23599 abstractC23599) {
        return ((AbstractC10172) abstractC23599).m26285();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44244(AbstractC10172 abstractC10172) {
        m23363();
        try {
            if (abstractC10172.m26284() > m23359()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f61891.add(abstractC10172);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44245(C15000 c15000, EnumC3461 enumC3461) {
        m23365();
        TreeMap treeMap = new TreeMap();
        for (AbstractC10172 abstractC10172 : this.f61891) {
            if (abstractC10172.mo1454() == enumC3461) {
                treeMap.put(abstractC10172.mo1456(), abstractC10172);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c15000.m36111(0, "\nmethod code index:\n\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            c15000.m36111(0, ((AbstractC10172) entry.getValue()).m26281() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ܳ */
    public final void mo23366() {
        C10918 c10918M23369 = m23369();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f61891;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC10172) arrayList.get(i)).mo1455(c10918M23369);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44246() {
        m23365();
        int iOrdinal = this.f61890.ordinal();
        ArrayList arrayList = this.f61891;
        if (iOrdinal == 1) {
            Collections.sort(arrayList, f61888);
        } else if (iOrdinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo13418 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC10172 abstractC10172 = (AbstractC10172) arrayList.get(i);
            try {
                int iM26282 = abstractC10172.m26282(this, iMo13418);
                if (iM26282 < iMo13418) {
                    throw new RuntimeException("bogus place() result for " + abstractC10172);
                }
                iMo13418 = abstractC10172.mo13418() + iM26282;
            } catch (RuntimeException e) {
                throw C3880.m12507("...while placing " + abstractC10172, e);
            }
        }
        this.f61889 = iMo13418;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩷ */
    public final void mo23370(C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        C10918 c10918M23369 = m23369();
        int iMo13418 = 0;
        boolean z = true;
        for (AbstractC10172 abstractC10172 : this.f61891) {
            if (zM36116) {
                if (z) {
                    z = false;
                } else {
                    c15000.m36111(0, "\n");
                }
            }
            int iM26284 = abstractC10172.m26284() - 1;
            int i = (~iM26284) & (iMo13418 + iM26284);
            if (iMo13418 != i) {
                c15000.m36109(i - iMo13418);
                iMo13418 = i;
            }
            abstractC10172.mo13417(c10918M23369, c15000);
            iMo13418 += abstractC10172.mo13418();
        }
        if (iMo13418 != this.f61889) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
