package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6511 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18449 f21854 = new C17697();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3864 f21855;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3864 f21856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo18363(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo18366(long j, Object obj);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract long mo18367(Object obj);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract Object mo18368(String str);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo18369(long j, Object obj);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo18370(Object obj);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo18372(long j, Object obj);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract long mo18373(Object obj);

    public AbstractC6511(Collection collection) {
        boolean z;
        long jMo11549;
        boolean z2;
        C20681 c20681;
        AbstractC6511 abstractC6511 = this;
        abstractC6511.f21855 = new C3864(f21854);
        abstractC6511.f21856 = new C3864(f21854);
        C14560 c14560 = C14560.f45873;
        C20681 c20682 = new C20681(c14560, c14560);
        Iterator it = collection.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C14560 c14560M35113 = C14560.m35113(abstractC6511.mo18370(next));
            if (!c14560M35113.isEmpty()) {
                int iIndexOf = c14560M35113.indexOf(0);
                int i = 0;
                C20681 c20683 = c20682;
                while (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    C14560 c14560M35115 = c14560M35113.m35115(i, i2);
                    C20681 c20684 = (C20681) c20683.f66303.get(c14560M35115);
                    if (c20684 == null) {
                        C20681 c20685 = new C20681(c14560M35113.m35115(0, i2), c14560M35115);
                        c20683.f66303.put(c14560M35115, c20685);
                        if (c20683.f66303.size() == 20) {
                            c20683.f66303 = new HashMap(c20683.f66303);
                        }
                        c20684 = c20685;
                    }
                    if (iIndexOf == c14560M35113.length() - 1) {
                        c20684.f66306 = new C3527(abstractC6511, next);
                        c20684.f66307 = abstractC6511.mo18373(next);
                        break;
                    } else {
                        iIndexOf = c14560M35113.indexOf(i2);
                        i = i2;
                        c20683 = c20684;
                    }
                }
                if (iIndexOf == -1) {
                    C14560 c14560M35116 = c14560M35113.m35116(i);
                    C20681 c20686 = new C20681(c14560M35113, c14560M35116);
                    c20686.f66306 = new C3527(abstractC6511, next);
                    c20686.f66307 = abstractC6511.mo18373(next);
                    c20683.m47303(c14560M35116, c20686);
                }
            }
        }
        C9829 c9829 = new C9829();
        for (C20681 c20687 : c20682.f66303.values()) {
            if (c20687.m47304()) {
                c9829.add(new C23665(c20687));
            }
        }
        while (!c9829.isEmpty()) {
            C23665 c23665 = (C23665) c9829.get(c9829.size() - 1);
            C20681 c20688 = c23665.f76753;
            if (c23665.f76754) {
                c9829.pop();
                AbstractC16205 c12476 = c20688.f66306;
                long j = 0;
                if (c12476 == null) {
                    C14560 c14561 = c20688.f66304;
                    c12476 = new C12476(abstractC6511, c14561);
                    abstractC6511.f21856.put(c14561, c12476);
                    c20688.f66306 = c12476;
                    z2 = true;
                    jMo11549 = 0;
                } else {
                    jMo11549 = c12476.mo11549();
                    z2 = false;
                }
                long j2 = jMo11549;
                long j3 = 0;
                for (C20681 c20689 : c20688.f66303.values()) {
                    AbstractC16205 abstractC16205 = c20689.f66306;
                    C20681 c206810 = c20682;
                    long j4 = c20689.f66307;
                    long jMo11545 = abstractC16205.mo11545();
                    j = jMo11545 != -1 ? j + jMo11545 : j;
                    long jMo11543 = abstractC16205.mo11543();
                    j3 = jMo11543 != -1 ? j3 + jMo11543 : j3;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    c20682 = c206810;
                }
                c20681 = c20682;
                c12476.mo11548(j);
                c12476.mo11544(j3);
                if (z2) {
                    c12476.mo11546(j2);
                }
                c20688.f66307 = j2;
            } else {
                c23665.f76754 = z;
                for (C20681 c206811 : c20688.f66303.values()) {
                    if (c206811.m47304()) {
                        c9829.add(new C23665(c206811));
                    }
                }
                c20681 = c20682;
            }
            z = true;
            abstractC6511 = this;
            c20682 = c20681;
        }
        C9829 c98210 = new C9829();
        c98210.add(c20682);
        while (!c98210.isEmpty()) {
            C20681 c206812 = (C20681) c98210.pop();
            Collection<C20681> collectionValues = c206812.f66303.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (C20681 c206813 : collectionValues) {
                AbstractC16205 abstractC16206 = c206813.f66306;
                C17359.requireNonNull(abstractC16206);
                arrayList.add(abstractC16206);
                if (c206813.m47304()) {
                    c98210.add(c206813);
                }
            }
            this.f21855.put(c206812.f66304, arrayList);
        }
        this.f21855.m12501();
        this.f21856.m12501();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m18364(String str) {
        AbstractC16205 abstractC16205 = (AbstractC16205) this.f21856.get(str);
        if (abstractC16205 == null) {
            return null;
        }
        return abstractC16205.mo11547();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private InterfaceC20670 m18362(String str) {
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        List list = (List) this.f21855.get(str);
        if (list == null) {
            return C23654.empty();
        }
        return C1170.stream(list).map(new C16951());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m18371(String str) {
        return (List) m18362(str).collect(C2025.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m18365(String str, Comparator comparator) {
        return (List) m18362(str).sorted(comparator).collect(C2025.toUnmodifiableList());
    }
}
