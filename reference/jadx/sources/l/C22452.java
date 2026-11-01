package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes.dex */
public final class C22452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2695[] f73291 = {new C2695("utf-32be-bom", C22037.f71429, new byte[]{0, 0, -2, -1}), new C2695("utf-32le-bom", C22037.f71430, new byte[]{-1, -2, 0, 0}), new C2695("utf-8-bom", C22037.f71424, new byte[]{-17, -69, -65}), new C2695("utf-16be-bom", C22037.f71428, new byte[]{-2, -1}), new C2695("utf-16le-bom", C22037.f71432, new byte[]{-1, -2})};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Map f73292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final List f73293;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < C22037.f71434) {
            int i2 = C22037.f71431;
            int i3 = i == i2 ? C22037.f71424 : i;
            C9735.putIfAbsent(linkedHashMap, m49939(i3), Integer.valueOf(i3));
            if (i == i2) {
                linkedHashMap.put("utf-8-bom", Integer.valueOf(C22037.f71424));
            } else if (i == C22037.f71428) {
                linkedHashMap.put("utf-16be-bom", Integer.valueOf(i));
            } else if (i == C22037.f71432) {
                linkedHashMap.put("utf-16le-bom", Integer.valueOf(i));
            } else if (i == C22037.f71429) {
                linkedHashMap.put("utf-32be-bom", Integer.valueOf(i));
            } else if (i == C22037.f71430) {
                linkedHashMap.put("utf-32le-bom", Integer.valueOf(i));
            }
            i++;
        }
        f73292 = C0561.unmodifiableMap(linkedHashMap);
        f73293 = C0561.unmodifiableList(new ArrayList(linkedHashMap.keySet()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2695 m49944(byte[] bArr) {
        boolean zM33176 = C13571.m33176(bArr.length, bArr);
        C2695[] c2695Arr = f73291;
        if (!zM33176) {
            if (!C13571.m33168(bArr.length, bArr)) {
                if (!C13571.m33175(bArr.length, bArr)) {
                    if (!C13571.m33172(bArr.length, bArr)) {
                        if (C13571.m33178(bArr.length, bArr)) {
                            return c2695Arr[4];
                        }
                        return null;
                    }
                    return c2695Arr[3];
                }
                return c2695Arr[2];
            }
            return c2695Arr[1];
        }
        return c2695Arr[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5518 m49942(String str, byte[] bArr) throws C12731 {
        int iM48951;
        if (str == null) {
            throw m49945((String) null);
        }
        int length = 0;
        if (!str.isEmpty()) {
            if (!str.equals(str.trim())) {
                throw m49945(str);
            }
            Integer num = (Integer) f73292.get(str);
            if (num == null) {
                throw m49945(str);
            }
            C2695 c2695M49944 = m49944(bArr);
            if (c2695M49944 != null && c2695M49944.f10389 == num.intValue()) {
                length = c2695M49944.f10387.length;
            }
            return new C5518(C22037.m48953(num.intValue()), length == 0 ? m49939(num.intValue()) : c2695M49944.f10388, length, length != 0 ? c2695M49944.f10387 : null);
        }
        C2695 c2695M49945 = m49944(bArr);
        if (c2695M49945 != null) {
            Charset charsetM48953 = C22037.m48953(c2695M49945.f10389);
            String str2 = c2695M49945.f10388;
            byte[] bArr2 = c2695M49945.f10387;
            return new C5518(charsetM48953, str2, bArr2.length, bArr2);
        }
        int i = C22037.f71424;
        if (bArr.length > 0) {
            String strM29552 = C11859.m29552(bArr.length, bArr);
            iM48951 = strM29552 == null ? -1 : C22037.m48951(strM29552);
            if (iM48951 == -1) {
                iM48951 = C22037.m48954(bArr.length, bArr);
            }
        } else {
            iM48951 = i;
        }
        if (iM48951 != C22037.f71431) {
            i = iM48951;
        }
        return new C5518(C22037.m48953(i), m49939(i), 0, null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5518 m49943(String str) throws C12731 {
        C2695 c2695;
        if (str == null || str.isEmpty() || !str.equals(str.trim())) {
            throw m49945(str);
        }
        Integer num = (Integer) f73292.get(str);
        if (num == null) {
            throw m49945(str);
        }
        C2695[] c2695Arr = f73291;
        int length = c2695Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c2695 = null;
                break;
            }
            c2695 = c2695Arr[i];
            if (c2695.f10388.equals(str)) {
                break;
            }
            i++;
        }
        return new C5518(C22037.m48953(num.intValue()), str, c2695 != null ? c2695.f10387.length : 0, c2695 != null ? c2695.f10387 : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2695 m49940(String str) {
        for (C2695 c2695 : f73291) {
            if (c2695.f10388.equals(str)) {
                return c2695;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49939(int i) {
        if (i == C22037.f71431) {
            i = C22037.f71424;
        }
        return C22037.m48955(i).toLowerCase(Locale.ROOT).replace('_', '-');
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m49945(String str) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = f73293.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return C12731.m31626("Unsupported text encoding token", "encoding", str == null ? JSON.NULL : JSON.value(str), jSONArrayArray, JSON.object().add("encoding", "utf-8"));
    }
}
