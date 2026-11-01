package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H8A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set f18609;

    static {
        m14949();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m14949() {
        String string = ApplicationC0716.f2992.getString("mhf", null);
        if (!C6851.m18462((CharSequence) string)) {
            f18609 = m14950(string);
        } else {
            f18609 = Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m14954() {
        return ApplicationC0716.f2992.getBoolean("smhf", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14947(boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "smhf", z);
        m14941();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m14951() {
        return ApplicationC0716.f2992.getBoolean("sshf", true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14953(boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "sshf", z);
        m14941();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14948(String str) {
        return f18609.contains(m14952(str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m14952(String str) {
        if (str.startsWith("/sdcard/")) {
            str = C11904.f39934 + str.substring(7);
        }
        while (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14946(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (m14954()) {
            C1679.m5597(ApplicationC0716.f2992, "smhf", false);
        }
        HashSet hashSet = new HashSet(f18609);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(m14952((String) it.next()));
        }
        m14945(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14943() {
        return m14944(f18609);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m14942(String str) {
        m14945(m14950(str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashSet m14950(String str) {
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            if (str2.startsWith("/")) {
                hashSet.add(m14952(str2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14945(HashSet hashSet) {
        String strM14944 = m14944((Set) hashSet);
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        if (strM14944.endsWith("\n")) {
            strM14944 = C20630.m46498(1, 0, strM14944);
        }
        interfaceC17314Edit.putString("mhf", strM14944).apply();
        f18609 = hashSet;
        m14941();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m14941() {
        if (C13890.m33728()) {
            C21094.m47530();
        } else {
            C16737.m39273(new RunnableC15163(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14944(Set set) {
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
