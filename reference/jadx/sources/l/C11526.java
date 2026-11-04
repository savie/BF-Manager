package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11526 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f36272 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f36270 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f36273 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f36274 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f36271 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29024(String... strArr) {
        for (String str : strArr) {
            C14838.m35755(str);
            this.f36272.add(new C5561(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29023(String str, String... strArr) {
        C14838.m35755(str);
        if (!(strArr.length > 0)) {
            throw new C21552("No attribute names supplied.");
        }
        C5561 c5561 = new C5561(str);
        this.f36272.add(c5561);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C14838.m35755(str2);
            hashSet.add(new C19731(str2));
        }
        HashMap map = this.f36270;
        if (map.containsKey(c5561)) {
            ((Set) map.get(c5561)).addAll(hashSet);
        } else {
            map.put(c5561, hashSet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29021(String str, String str2) {
        C14838.m35755("input");
        C14838.m35755(str);
        C14838.m35755(str2);
        C5561 c5561 = new C5561("input");
        this.f36272.add(c5561);
        C19731 c19731 = new C19731(str);
        C15255 c15255 = new C15255(str2);
        HashMap map = this.f36273;
        if (map.containsKey(c5561)) {
            ((Map) map.get(c5561)).put(c19731, c15255);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(c19731, c15255);
        map.put(c5561, map2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29020() {
        this.f36271 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29022(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C14838.m35755(str);
        C14838.m35755(str2);
        C5561 c5561 = new C5561(str);
        C19731 c19731 = new C19731(str2);
        HashMap map2 = this.f36274;
        if (map2.containsKey(c5561)) {
            map = (Map) map2.get(c5561);
        } else {
            HashMap map3 = new HashMap();
            map2.put(c5561, map3);
            map = map3;
        }
        if (map.containsKey(c19731)) {
            set = (Set) map.get(c19731);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c19731, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C14838.m35755(str3);
            set.add(new C13018(str3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10363 m29019(String str) {
        C10363 c10363 = new C10363();
        C5561 c5561 = new C5561(str);
        HashMap map = this.f36273;
        if (map.containsKey(c5561)) {
            for (Map.Entry entry : ((Map) map.get(c5561)).entrySet()) {
                c10363.put(((C19731) entry.getKey()).toString(), ((C15255) entry.getValue()).toString());
            }
        }
        return c10363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29025(String str, C15496 c15496, C8127 c8127) {
        C5561 c5561 = new C5561(str);
        C19731 c19731 = new C19731(c8127.getKey());
        Set set = (Set) this.f36270.get(c5561);
        if (set != null && set.contains(c19731)) {
            HashMap map = this.f36274;
            if (!map.containsKey(c5561)) {
                return true;
            }
            Map map2 = (Map) map.get(c5561);
            if (!map2.containsKey(c19731)) {
                return true;
            }
            Set set2 = (Set) map2.get(c19731);
            String strMo41526 = c15496.mo41526(c8127.getKey());
            if (strMo41526.length() == 0) {
                strMo41526 = c8127.getValue();
            }
            if (!this.f36271) {
                c8127.setValue(strMo41526);
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String string = ((C13018) it.next()).toString();
                if (!string.equals("#")) {
                    if (C15300.m36731(strMo41526).startsWith(string.concat(":"))) {
                        return true;
                    }
                } else if (strMo41526.startsWith("#") && !strMo41526.matches(".*\\s.*")) {
                    return true;
                }
            }
            return false;
        }
        if (((Map) this.f36273.get(c5561)) != null) {
            C10363 c10363M29019 = m29019(str);
            String key = c8127.getKey();
            if (c10363M29019.m26662(key)) {
                return c10363M29019.m26649(key).equals(c8127.getValue());
            }
        }
        return !str.equals(":all") && m29025(":all", c15496, c8127);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29026(String str) {
        return this.f36272.contains(new C5561(str));
    }
}
