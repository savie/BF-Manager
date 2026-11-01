package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14730 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final List f48149 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC14730 f48150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48151;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract int mo2831();

    /* JADX INFO: renamed from: ۘ */
    public abstract boolean mo2836();

    /* JADX INFO: renamed from: ۙ */
    public abstract C15436 mo2839();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2842(Appendable appendable, int i, C19669 c19669);

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo2853();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo2854(String str);

    /* JADX INFO: renamed from: ۬ */
    public abstract List mo2858();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo2861(Appendable appendable, int i, C19669 c19669);

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo2863();

    /* JADX INFO: renamed from: ᩹ */
    public abstract AbstractC14730 mo2867();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m35266() {
        return this.f48150 != null;
    }

    /* JADX INFO: renamed from: ܰ */
    public String mo28144(String str) {
        C5557.m15341((Object) str);
        if (!mo2836()) {
            return "";
        }
        String strM36933 = mo2839().m36933(str);
        if (strM36933.length() > 0) {
            return strM36933;
        }
        return str.startsWith("abs:") ? mo28141(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC14730 mo20268(String str, String str2) {
        mo2839().m36943(C2028.m6519(this).m33519().m12726(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo28140(String str) {
        C5557.m15341((Object) str);
        if (!mo2836()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo2839().m36931(strSubstring) && !mo28141(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo2839().m36931(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35265(String str) {
        C5557.m15341((Object) str);
        mo2854(str);
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo28141(String str) {
        C5557.m15342(str);
        return (mo2836() && mo2839().m36931(str)) ? C4145.m11779(mo2853(), mo2839().m36933(str)) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 m35261(int i) {
        return (AbstractC14730) mo2858().get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m35264() {
        if (mo2831() == 0) {
            return f48149;
        }
        List listMo2858 = mo2858();
        ArrayList arrayList = new ArrayList(listMo2858.size());
        arrayList.addAll(listMo2858);
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۠ */
    public AbstractC14730 mo2849() {
        return this.f48150;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 m35270() {
        return this.f48150;
    }

    /* JADX INFO: renamed from: ۤ */
    public AbstractC14730 mo2851() {
        AbstractC14730 abstractC14730 = this;
        while (true) {
            AbstractC14730 abstractC14731 = abstractC14730.f48150;
            if (abstractC14731 == null) {
                return abstractC14730;
            }
            abstractC14730 = abstractC14731;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10497 m35269() {
        AbstractC14730 abstractC14730Mo2851 = mo2851();
        if (abstractC14730Mo2851 instanceof C10497) {
            return (C10497) abstractC14730Mo2851;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m35268() {
        C5557.m15341(this.f48150);
        this.f48150.mo17323(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35263(C9791 c9791) {
        C5557.m15341(this.f48150);
        AbstractC14730 abstractC14730 = this.f48150;
        abstractC14730.getClass();
        C5557.m15344(this.f48150 == abstractC14730);
        AbstractC14730 abstractC14731 = c9791.f48150;
        if (abstractC14731 != null) {
            abstractC14731.mo17323(c9791);
        }
        int i = this.f48151;
        abstractC14730.mo2858().set(i, c9791);
        c9791.f48150 = abstractC14730;
        c9791.f48151 = i;
        this.f48150 = null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo17323(AbstractC14730 abstractC14730) {
        C5557.m15344(abstractC14730.f48150 == this);
        int i = abstractC14730.f48151;
        mo2858().remove(i);
        m35259(i);
        abstractC14730.f48150 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35262(int i, AbstractC14730... abstractC14730Arr) {
        C5557.m15341(abstractC14730Arr);
        if (abstractC14730Arr.length == 0) {
            return;
        }
        List listMo2858 = mo2858();
        AbstractC14730 abstractC14730Mo2849 = abstractC14730Arr[0].mo2849();
        if (abstractC14730Mo2849 != null && abstractC14730Mo2849.mo2831() == abstractC14730Arr.length) {
            List listMo2859 = abstractC14730Mo2849.mo2858();
            int length = abstractC14730Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (abstractC14730Arr[i2] != listMo2859.get(i2)) {
                        break;
                    } else {
                        length = i2;
                    }
                } else {
                    boolean z = mo2831() == 0;
                    abstractC14730Mo2849.mo2867();
                    listMo2858.addAll(i, Arrays.asList(abstractC14730Arr));
                    int length2 = abstractC14730Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC14730Arr[i3].f48150 = this;
                        length2 = i3;
                    }
                    if (z && abstractC14730Arr[0].f48151 == 0) {
                        return;
                    }
                    m35259(i);
                    return;
                }
            }
        }
        for (AbstractC14730 abstractC14730 : abstractC14730Arr) {
            if (abstractC14730 == null) {
                throw new C22491("Array must not contain any null objects");
            }
        }
        for (AbstractC14730 abstractC14731 : abstractC14730Arr) {
            abstractC14731.getClass();
            AbstractC14730 abstractC14732 = abstractC14731.f48150;
            if (abstractC14732 != null) {
                abstractC14732.mo17323(abstractC14731);
            }
            abstractC14731.f48150 = this;
        }
        listMo2858.addAll(i, Arrays.asList(abstractC14730Arr));
        m35259(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m35259(int i) {
        int iMo2831 = mo2831();
        if (iMo2831 == 0) {
            return;
        }
        List listMo2858 = mo2858();
        while (i < iMo2831) {
            ((AbstractC14730) listMo2858.get(i)).f48151 = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m35272() {
        AbstractC14730 abstractC14730 = this.f48150;
        if (abstractC14730 == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC14730> listMo2858 = abstractC14730.mo2858();
        ArrayList arrayList = new ArrayList(listMo2858.size() - 1);
        for (AbstractC14730 abstractC14731 : listMo2858) {
            if (abstractC14731 != this) {
                arrayList.add(abstractC14731);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 m35273() {
        AbstractC14730 abstractC14730 = this.f48150;
        if (abstractC14730 == null) {
            return null;
        }
        List listMo2858 = abstractC14730.mo2858();
        int i = this.f48151 + 1;
        if (listMo2858.size() > i) {
            return (AbstractC14730) listMo2858.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m35267() {
        return this.f48151;
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo26643() {
        StringBuilder sbM11782 = C4145.m11782();
        C10497 c10497M35269 = m35269();
        if (c10497M35269 == null) {
            c10497M35269 = new C10497("");
        }
        C20149.m45564(new C23902(sbM11782, c10497M35269.m26641()), this);
        return C4145.m11780(sbM11782);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4541 m35271() {
        return C4541.m12677(this, true);
    }

    public String toString() {
        return mo26643();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m35260(Appendable appendable, int i, C19669 c19669) {
        appendable.append('\n');
        c19669.getClass();
        appendable.append(C4145.m11778(c19669.m44792() * i, c19669.m44797()));
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC14730 mo2874clone() {
        AbstractC14730 abstractC14730Mo2838 = mo2838((AbstractC14730) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC14730Mo2838);
        while (!linkedList.isEmpty()) {
            AbstractC14730 abstractC14730 = (AbstractC14730) linkedList.remove();
            int iMo2831 = abstractC14730.mo2831();
            for (int i = 0; i < iMo2831; i++) {
                List listMo2858 = abstractC14730.mo2858();
                AbstractC14730 abstractC14730Mo2839 = ((AbstractC14730) listMo2858.get(i)).mo2838(abstractC14730);
                listMo2858.set(i, abstractC14730Mo2839);
                linkedList.add(abstractC14730Mo2839);
            }
        }
        return abstractC14730Mo2838;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC14730 mo2838(AbstractC14730 abstractC14730) {
        C10497 c10497M35269;
        try {
            AbstractC14730 abstractC14731 = (AbstractC14730) super.clone();
            abstractC14731.f48150 = abstractC14730;
            abstractC14731.f48151 = abstractC14730 == null ? 0 : this.f48151;
            if (abstractC14730 == null && !(this instanceof C10497) && (c10497M35269 = m35269()) != null) {
                C10497 c10497M26639 = c10497M35269.m26639();
                abstractC14731.f48150 = c10497M26639;
                c10497M26639.mo2858().add(abstractC14731);
            }
            return abstractC14731;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
