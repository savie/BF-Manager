package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6265 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f21252 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m17916() {
        f21252 = m17910();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17915(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo49854()) {
            return abstractC22044 instanceof C15593;
        }
        return ((abstractC22044 instanceof C18379) || abstractC22044.mo4295()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17913(AbstractC22044 abstractC22044, EnumC12230 enumC12230) {
        C3281 c3281M10819 = C3281.m10819(abstractC22044, enumC12230);
        if (c3281M10819 == null) {
            return;
        }
        m17914(c3281M10819);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17912(String str, EnumC12230 enumC12230) {
        m17914(C3281.m10818(str, enumC12230));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m17914(C3281... c3281Arr) {
        C20435 c20435M17911;
        C20435 c20435M17912;
        String strM28556;
        C20435 c20435M17913;
        m17916();
        HashSet<C20435> hashSet = new HashSet(c3281Arr.length);
        HashSet hashSet2 = new HashSet(c3281Arr.length);
        for (C3281 c3281 : c3281Arr) {
            if (c3281 != null) {
                String strM34911 = c3281.f10696;
                EnumC12230 enumC12230 = c3281.f10697;
                if (enumC12230.f39364) {
                    try {
                        strM34911 = C14453.m34911(strM34911);
                    } catch (IOException unused) {
                    }
                }
                String strM12981 = C4013.m12981(strM34911);
                if (m17915(C14584.m35193(strM12981, new String[0])) && (c20435M17912 = m17911(strM12981)) != null && !c20435M17912.f65452) {
                    hashSet.add(c20435M17912);
                    if (enumC12230.f39365 && (strM28556 = C11293.m28556(strM12981)) != null && (c20435M17913 = m17911(strM28556)) != null && !c20435M17913.f65452 && !c20435M17913.equals(c20435M17912)) {
                        hashSet2.add(c20435M17913);
                    }
                }
            }
        }
        hashSet2.removeAll(hashSet);
        if (hashSet.isEmpty()) {
            return;
        }
        if (C7756.m21096()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C7756.m21102((C20435) it.next());
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C7756.m21102((C20435) it2.next());
            }
            m17916();
        }
        for (C20435 c20435 : hashSet) {
            if (!c20435.f65452 && (c20435M17911 = m17911(c20435.f65450)) != null && !c20435M17911.f65452) {
                throw new C4866(C21576.m49088(R.string.MT_Protector) + "\n" + c20435M17911.f65453);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17910() {
        ArrayList arrayList = new ArrayList(f21252.size());
        for (String str : C7756.m21123().f36125) {
            String[] strArrSplit = str.split(" ", 4);
            if (strArrSplit.length == 4 && (strArrSplit[3].startsWith("ro") || strArrSplit[3].startsWith("rw"))) {
                C20435 c20435 = new C20435();
                c20435.f65451 = strArrSplit[0];
                c20435.f65453 = strArrSplit[1];
                c20435.f65449 = strArrSplit[2];
                c20435.f65452 = strArrSplit[3].startsWith("rw");
                String lowerCase = c20435.f65453.toLowerCase();
                c20435.f65450 = lowerCase;
                if (!lowerCase.endsWith("/")) {
                    c20435.f65450 = C8947.m23910(new StringBuilder(), c20435.f65450, "/");
                }
                arrayList.add(c20435);
            }
        }
        if (C5585.m16558()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C20435) it.next()).f65452 = true;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20435 m17911(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C20435 c20435 : f21252) {
            if (lowerCase.startsWith(c20435.f65450)) {
                return c20435;
            }
        }
        return null;
    }
}
