package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۗۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes2.dex */
public class C3369 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11065(int i, int i2, int i3, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (i2 < length && i2 != i) {
            C3652.m11837(sb, str.charAt(i2));
            i2++;
        }
        return sb.length() + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11069(int i, Runnable runnable) {
        if (i < 1) {
            i = 1;
        }
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnable);
            thread.start();
            linkedList.add(thread);
        }
        runnable.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11066(String str, String str2, C4245 c4245, boolean z, boolean z2, C17539 c17539) {
        return m11067(str, str2, c4245, z, z2, c17539, new ArrayList(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11067(String str, String str2, C4245 c4245, boolean z, boolean z2, C17539 c17539, ArrayList arrayList) {
        String strExpandReplacement;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        c4245.m13568reset((CharSequence) str);
        if (z2) {
            if (c4245.matches()) {
                arrayList.add(c4245.toSnapshot());
            }
        } else {
            while (c4245.find()) {
                if (c4245.start() != c4245.end()) {
                    arrayList.add(c4245.toSnapshot());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c17539 != null) {
            c17539.m41195(arrayList.size());
        }
        StringBuilder sb = new StringBuilder(str.length());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C14685 c14685 = (C14685) it.next();
            int iStart = c14685.start();
            int iEnd = c14685.end();
            if (z) {
                try {
                    strExpandReplacement = c14685.expandReplacement(str2);
                } catch (Exception unused) {
                    strExpandReplacement = str2;
                }
                if (iStart > i) {
                    sb.append((CharSequence) str, i, iStart);
                }
                sb.append(strExpandReplacement);
            } else {
                if (iStart > i) {
                    sb.append((CharSequence) str, i, iStart);
                }
                sb.append(str2);
            }
            i = iEnd;
        }
        if (i < str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        arrayList.clear();
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18415 m11070(String str, boolean z, boolean z2) {
        if (!z) {
            str = C17370.m40798(str);
        }
        if (z2) {
            return C18415.m42924(8, str);
        }
        return C18415.m42924(74, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24999 m11068(String str, boolean z, boolean z2) {
        return new C24999(m11070(str, z, z2));
    }
}
