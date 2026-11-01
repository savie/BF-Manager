package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2462 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f9811 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m7545() {
        f9811 = m7539();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7544(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo46709()) {
            return abstractC20745 instanceof C13357;
        }
        return ((abstractC20745 instanceof C17196) || abstractC20745.mo36912()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7542(AbstractC20745 abstractC20745, EnumC11636 enumC11636) {
        C4579 c4579M12724 = C4579.m12724(abstractC20745, enumC11636);
        if (c4579M12724 == null) {
            return;
        }
        m7543(c4579M12724);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7541(String str, EnumC11636 enumC11636) {
        m7543(C4579.m12723(str, enumC11636));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m7543(C4579... c4579Arr) {
        C13753 c13753M7540;
        C13753 c13753M7541;
        String strM18172;
        C13753 c13753M7542;
        m7545();
        HashSet<C13753> hashSet = new HashSet(c4579Arr.length);
        HashSet hashSet2 = new HashSet(c4579Arr.length);
        for (C4579 c4579 : c4579Arr) {
            if (c4579 != null) {
                String strM956 = c4579.f16231;
                EnumC11636 enumC11636 = c4579.f16232;
                if (enumC11636.f39090) {
                    try {
                        strM956 = C0055.m956(strM956);
                    } catch (IOException unused) {
                    }
                }
                String strM45052 = C19812.m45052(strM956);
                if (m7544(C5553.m15313(strM45052, new String[0])) && (c13753M7541 = m7540(strM45052)) != null && !c13753M7541.f45345) {
                    hashSet.add(c13753M7541);
                    if (enumC11636.f39091 && (strM18172 = C6730.m18172(strM45052)) != null && (c13753M7542 = m7540(strM18172)) != null && !c13753M7542.f45345 && !c13753M7542.equals(c13753M7541)) {
                        hashSet2.add(c13753M7542);
                    }
                }
            }
        }
        hashSet2.removeAll(hashSet);
        if (hashSet.isEmpty()) {
            return;
        }
        if (C6696.m18084()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C6696.m18091((C13753) it.next());
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C6696.m18091((C13753) it2.next());
            }
            m7545();
        }
        for (C13753 c13753 : hashSet) {
            if (!c13753.f45345 && (c13753M7540 = m7540(c13753.f45346)) != null && !c13753M7540.f45345) {
                throw new C4987(C16737.m39288(R.string.MT_Protector) + "\n" + c13753M7540.f45349);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7539() {
        ArrayList arrayList = new ArrayList(f9811.size());
        for (String str : C6696.m18109().f20239) {
            String[] strArrSplit = str.split(" ", 4);
            if (strArrSplit.length == 4 && (strArrSplit[3].startsWith("ro") || strArrSplit[3].startsWith("rw"))) {
                C13753 c13753 = new C13753();
                c13753.f45347 = strArrSplit[0];
                c13753.f45349 = strArrSplit[1];
                c13753.f45348 = strArrSplit[2];
                c13753.f45345 = strArrSplit[3].startsWith("rw");
                String lowerCase = c13753.f45349.toLowerCase();
                c13753.f45346 = lowerCase;
                if (!lowerCase.endsWith("/")) {
                    c13753.f45346 = C22697.m50267(new StringBuilder(), c13753.f45346, "/");
                }
                arrayList.add(c13753);
            }
        }
        if (C6983.m18764()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C13753) it.next()).f45345 = true;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13753 m7540(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C13753 c13753 : f9811) {
            if (lowerCase.startsWith(c13753.f45346)) {
                return c13753;
            }
        }
        return null;
    }
}
