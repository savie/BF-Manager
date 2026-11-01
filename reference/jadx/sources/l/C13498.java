package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13498 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f44598;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33026() {
        return m33022(this.f44598);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m33030() {
        return C0561.unmodifiableList(this.f44598);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33022(List list) {
        Iterator it = list.iterator();
        int iM33022 = 0;
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            if (c3534.m10396()) {
                if (c3534.m10409()) {
                    iM33022++;
                }
            } else {
                iM33022 += m33022(c3534.f13024);
            }
        }
        return iM33022;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33027(HashSet hashSet) {
        m33023(hashSet, this.f44598);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33023(HashSet hashSet, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            if (c3534.m10396()) {
                if (c3534.m10409()) {
                    hashSet.add(c3534.f13022);
                }
            } else {
                m33023(hashSet, c3534.f13024);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33029() {
        m33025(this.f44598);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33025(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            boolean zM10396 = c3534.m10396();
            ArrayList arrayList = c3534.f13024;
            if (zM10396) {
                if (c3534.m10409()) {
                    it.remove();
                }
            } else {
                m33025(arrayList);
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33028(InterfaceC4324 interfaceC4324) {
        m33024(interfaceC4324, this.f44598);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33024(InterfaceC4324 interfaceC4324, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            boolean zMo12162 = interfaceC4324.mo12162();
            if (zMo12162) {
                interfaceC4324.mo12161(c3534);
            }
            if (!c3534.m10396()) {
                m33024(interfaceC4324, c3534.f13024);
            }
            if (!zMo12162) {
                interfaceC4324.mo12161(c3534);
            }
        }
    }
}
