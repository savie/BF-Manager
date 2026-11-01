package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6304 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f21325 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f21324 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f21327 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f21323 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f21326 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17397(String... strArr) {
        for (String str : strArr) {
            C5557.m15342(str);
            this.f21325.add(new C12655(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17396(String str, String... strArr) {
        C5557.m15342(str);
        if (!(strArr.length > 0)) {
            throw new C22491("No attribute names supplied.");
        }
        C12655 c12655 = new C12655(str);
        this.f21325.add(c12655);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C5557.m15342(str2);
            hashSet.add(new C20416(str2));
        }
        HashMap map = this.f21324;
        if (map.containsKey(c12655)) {
            ((Set) map.get(c12655)).addAll(hashSet);
        } else {
            map.put(c12655, hashSet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17394(String str, String str2) {
        C5557.m15342("input");
        C5557.m15342(str);
        C5557.m15342(str2);
        C12655 c12655 = new C12655("input");
        this.f21325.add(c12655);
        C20416 c20416 = new C20416(str);
        C0659 c0659 = new C0659(str2);
        HashMap map = this.f21327;
        if (map.containsKey(c12655)) {
            ((Map) map.get(c12655)).put(c20416, c0659);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(c20416, c0659);
        map.put(c12655, map2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17393() {
        this.f21326 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17395(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C5557.m15342(str);
        C5557.m15342(str2);
        C12655 c12655 = new C12655(str);
        C20416 c20416 = new C20416(str2);
        HashMap map2 = this.f21323;
        if (map2.containsKey(c12655)) {
            map = (Map) map2.get(c12655);
        } else {
            HashMap map3 = new HashMap();
            map2.put(c12655, map3);
            map = map3;
        }
        if (map.containsKey(c20416)) {
            set = (Set) map.get(c20416);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c20416, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C5557.m15342(str3);
            set.add(new C16888(str3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15436 m17392(String str) {
        C15436 c15436 = new C15436();
        C12655 c12655 = new C12655(str);
        HashMap map = this.f21327;
        if (map.containsKey(c12655)) {
            for (Map.Entry entry : ((Map) map.get(c12655)).entrySet()) {
                c15436.put(((C20416) entry.getKey()).toString(), ((C0659) entry.getValue()).toString());
            }
        }
        return c15436;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17398(String str, C0617 c0617, C6968 c6968) {
        C12655 c12655 = new C12655(str);
        C20416 c20416 = new C20416(c6968.getKey());
        Set set = (Set) this.f21324.get(c12655);
        if (set != null && set.contains(c20416)) {
            HashMap map = this.f21323;
            if (!map.containsKey(c12655)) {
                return true;
            }
            Map map2 = (Map) map.get(c12655);
            if (!map2.containsKey(c20416)) {
                return true;
            }
            Set set2 = (Set) map2.get(c20416);
            String strMo28141 = c0617.mo28141(c6968.getKey());
            if (strMo28141.length() == 0) {
                strMo28141 = c6968.getValue();
            }
            if (!this.f21326) {
                c6968.setValue(strMo28141);
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String string = ((C16888) it.next()).toString();
                if (!string.equals("#")) {
                    if (C1323.m4722(strMo28141).startsWith(string.concat(":"))) {
                        return true;
                    }
                } else if (strMo28141.startsWith("#") && !strMo28141.matches(".*\\s.*")) {
                    return true;
                }
            }
            return false;
        }
        if (((Map) this.f21327.get(c12655)) != null) {
            C15436 c15436M17392 = m17392(str);
            String key = c6968.getKey();
            if (c15436M17392.m36931(key)) {
                return c15436M17392.m36933(key).equals(c6968.getValue());
            }
        }
        return !str.equals(":all") && m17398(":all", c0617, c6968);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17399(String str) {
        return this.f21325.contains(new C12655(str));
    }
}
