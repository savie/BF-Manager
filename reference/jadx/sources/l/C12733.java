package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes3.dex */
public class C12733 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31633(int i, int i2, int i3, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (i2 < length && i2 != i) {
            C9461.m24220(sb, str.charAt(i2));
            i2++;
        }
        return sb.length() + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31637(int i, Runnable runnable) {
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
    public static String m31634(String str, String str2, C6222 c6222, boolean z, boolean z2, C20494 c20494) {
        return m31635(str, str2, c6222, z, z2, c20494, new ArrayList(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31635(String str, String str2, C6222 c6222, boolean z, boolean z2, C20494 c20494, ArrayList arrayList) {
        String strExpandReplacement;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        c6222.m17276reset((CharSequence) str);
        if (z2) {
            if (c6222.matches()) {
                arrayList.add(c6222.toSnapshot());
            }
        } else {
            while (c6222.find()) {
                if (c6222.start() != c6222.end()) {
                    arrayList.add(c6222.toSnapshot());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c20494 != null) {
            c20494.m46298(arrayList.size());
        }
        StringBuilder sb = new StringBuilder(str.length());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C11162 c11162 = (C11162) it.next();
            int iStart = c11162.start();
            int iEnd = c11162.end();
            if (z) {
                try {
                    strExpandReplacement = c11162.expandReplacement(str2);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14690 m31638(String str, boolean z, boolean z2) {
        if (!z) {
            str = C17874.m41459(str);
        }
        if (z2) {
            return C14690.m35218(8, str);
        }
        return C14690.m35218(74, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21199 m31636(String str, boolean z, boolean z2) {
        return new C21199(m31638(str, z, z2));
    }
}
