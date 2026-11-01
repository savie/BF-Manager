package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C17876 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f56582 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f56585 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f56581 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f56584 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f56583 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m41472(int i, String str) {
        ArrayList arrayList;
        this.f56583.add(m41470(i, str));
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f56582.entrySet()) {
            C18582 c18582 = (C18582) entry.getValue();
            if (c18582.f59082 && c18582.f59083.f45001 == i && C13638.equals(c18582.f59083.f45000, str)) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m41468((String) it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m41473(String str, String str2) {
        ArrayList arrayList;
        this.f56581.add(str);
        this.f56584.add(str2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f56585.get(str2);
        if (linkedHashSet2 != null) {
            linkedHashSet.addAll(linkedHashSet2);
        }
        arrayList = new ArrayList();
        for (String str3 : linkedHashSet) {
            if (m41468(str3) != null) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m41474(String str, String str2, C13644 c13644) {
        ArrayList arrayListM41467;
        arrayListM41467 = m41467(c13644.f45001, str, c13644.f45000);
        Iterator it = arrayListM41467.iterator();
        while (it.hasNext()) {
            m41468((String) it.next());
        }
        this.f56581.remove(str);
        this.f56584.remove(str2);
        this.f56583.remove(m41470(c13644.f45001, c13644.f45000));
        m41469(str, str2, c13644, false);
        return arrayListM41467;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41475(String str, String str2, C13644 c13644) {
        if (!this.f56581.contains(str) && !this.f56584.contains(str2)) {
            if (!this.f56583.contains(m41470(c13644.f45001, c13644.f45000))) {
                if (!m41471(c13644.f45001, str, c13644.f45000)) {
                    m41469(str, str2, c13644, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m41471(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = this.f56582;
        C18582 c18582 = (C18582) linkedHashMap.get(str);
        if (c18582 != null && !c18582.f59082) {
            return true;
        }
        for (C18582 c18583 : linkedHashMap.values()) {
            if (!c18583.f59082 && c18583.f59083.f45001 == i && C13638.equals(c18583.f59083.f45000, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m41467(int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f56582.entrySet()) {
            C18582 c18582 = (C18582) entry.getValue();
            if (c18582.f59082 && (((String) entry.getKey()).equals(str) || (c18582.f59083.f45001 == i && C13638.equals(c18582.f59083.f45000, str2)))) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41469(String str, String str2, C13644 c13644, boolean z) {
        m41468(str);
        this.f56582.put(str, new C18582(str2, c13644, z));
        LinkedHashMap linkedHashMap = this.f56585;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str2, linkedHashSet);
        }
        linkedHashSet.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18582 m41468(String str) {
        C18582 c18582 = (C18582) this.f56582.remove(str);
        if (c18582 == null) {
            return null;
        }
        String str2 = c18582.f59081;
        LinkedHashMap linkedHashMap = this.f56585;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(c18582.f59081);
            }
        }
        return c18582;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m41470(int i, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = C19288.f62246;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        sb.append(i);
        return sb.toString();
    }
}
