package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1JW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0772 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f2791;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3151() {
        return m3147(this.f2791);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m3155() {
        return C4681.unmodifiableList(this.f2791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3147(List list) {
        Iterator it = list.iterator();
        int iM3147 = 0;
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            if (c21655.m49186()) {
                if (c21655.m49182()) {
                    iM3147++;
                }
            } else {
                iM3147 += m3147(c21655.f69129);
            }
        }
        return iM3147;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3152(HashSet hashSet) {
        m3148(hashSet, this.f2791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3148(HashSet hashSet, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            if (c21655.m49186()) {
                if (c21655.m49182()) {
                    hashSet.add(c21655.f69128);
                }
            } else {
                m3148(hashSet, c21655.f69129);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3154() {
        m3150(this.f2791);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3150(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            boolean zM49186 = c21655.m49186();
            ArrayList arrayList = c21655.f69129;
            if (zM49186) {
                if (c21655.m49182()) {
                    it.remove();
                }
            } else {
                m3150(arrayList);
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3153(InterfaceC18671 interfaceC18671) {
        m3149(interfaceC18671, this.f2791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3149(InterfaceC18671 interfaceC18671, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            boolean zMo18831 = interfaceC18671.mo18831();
            if (zMo18831) {
                interfaceC18671.mo18830(c21655);
            }
            if (!c21655.m49186()) {
                m3149(interfaceC18671, c21655.f69129);
            }
            if (!zMo18831) {
                interfaceC18671.mo18830(c21655);
            }
        }
    }
}
