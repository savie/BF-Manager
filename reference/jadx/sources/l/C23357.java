package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes.dex */
public final class C23357 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f75639 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f75642 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f75643 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f75640 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f75641 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m52522(int i, String str) {
        ArrayList arrayList;
        this.f75641.add(m52520(i, str));
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f75639.entrySet()) {
            C3219 c3219 = (C3219) entry.getValue();
            if (c3219.f10491 && c3219.f10492.f33897 == i && C17359.equals(c3219.f10492.f33896, str)) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m52518((String) it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m52523(String str, String str2) {
        ArrayList arrayList;
        this.f75643.add(str);
        this.f75640.add(str2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f75642.get(str2);
        if (linkedHashSet2 != null) {
            linkedHashSet.addAll(linkedHashSet2);
        }
        arrayList = new ArrayList();
        for (String str3 : linkedHashSet) {
            if (m52518(str3) != null) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m52524(String str, String str2, C10676 c10676) {
        ArrayList arrayListM52517;
        arrayListM52517 = m52517(c10676.f33897, str, c10676.f33896);
        Iterator it = arrayListM52517.iterator();
        while (it.hasNext()) {
            m52518((String) it.next());
        }
        this.f75643.remove(str);
        this.f75640.remove(str2);
        this.f75641.remove(m52520(c10676.f33897, c10676.f33896));
        m52519(str, str2, c10676, false);
        return arrayListM52517;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52525(String str, String str2, C10676 c10676) {
        if (!this.f75643.contains(str) && !this.f75640.contains(str2)) {
            if (!this.f75641.contains(m52520(c10676.f33897, c10676.f33896))) {
                if (!m52521(c10676.f33897, str, c10676.f33896)) {
                    m52519(str, str2, c10676, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m52521(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = this.f75639;
        C3219 c3219 = (C3219) linkedHashMap.get(str);
        if (c3219 != null && !c3219.f10491) {
            return true;
        }
        for (C3219 c32110 : linkedHashMap.values()) {
            if (!c32110.f10491 && c32110.f10492.f33897 == i && C17359.equals(c32110.f10492.f33896, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m52517(int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f75639.entrySet()) {
            C3219 c3219 = (C3219) entry.getValue();
            if (c3219.f10491 && (((String) entry.getKey()).equals(str) || (c3219.f10492.f33897 == i && C17359.equals(c3219.f10492.f33896, str2)))) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52519(String str, String str2, C10676 c10676, boolean z) {
        m52518(str);
        this.f75639.put(str, new C3219(str2, c10676, z));
        LinkedHashMap linkedHashMap = this.f75642;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str2, linkedHashSet);
        }
        linkedHashSet.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3219 m52518(String str) {
        C3219 c3219 = (C3219) this.f75639.remove(str);
        if (c3219 == null) {
            return null;
        }
        String str2 = c3219.f10490;
        LinkedHashMap linkedHashMap = this.f75642;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(c3219.f10490);
            }
        }
        return c3219;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52520(int i, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = C12168.f39127;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        sb.append(i);
        return sb.toString();
    }
}
