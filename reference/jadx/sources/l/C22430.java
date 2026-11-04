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

/* JADX INFO: renamed from: l.᩸֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes.dex */
public final class C22430 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21684[] f72627 = {new C21684("utf-32be-bom", C2448.f7857, new byte[]{0, 0, -2, -1}), new C21684("utf-32le-bom", C2448.f7864, new byte[]{-1, -2, 0, 0}), new C21684("utf-8-bom", C2448.f7850, new byte[]{-17, -69, -65}), new C21684("utf-16be-bom", C2448.f7858, new byte[]{-2, -1}), new C21684("utf-16le-bom", C2448.f7859, new byte[]{-1, -2})};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Map f72628;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final List f72629;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < C2448.f7865) {
            int i2 = C2448.f7861;
            int i3 = i == i2 ? C2448.f7850 : i;
            C11392.putIfAbsent(linkedHashMap, m50578(i3), Integer.valueOf(i3));
            if (i == i2) {
                linkedHashMap.put("utf-8-bom", Integer.valueOf(C2448.f7850));
            } else if (i == C2448.f7858) {
                linkedHashMap.put("utf-16be-bom", Integer.valueOf(i));
            } else if (i == C2448.f7859) {
                linkedHashMap.put("utf-16le-bom", Integer.valueOf(i));
            } else if (i == C2448.f7857) {
                linkedHashMap.put("utf-32be-bom", Integer.valueOf(i));
            } else if (i == C2448.f7864) {
                linkedHashMap.put("utf-32le-bom", Integer.valueOf(i));
            }
            i++;
        }
        f72628 = C4681.unmodifiableMap(linkedHashMap);
        f72629 = C4681.unmodifiableList(new ArrayList(linkedHashMap.keySet()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21684 m50584(byte[] bArr) {
        boolean zM43753 = C18856.m43753(bArr.length, bArr);
        C21684[] c21684Arr = f72627;
        if (!zM43753) {
            if (!C18856.m43758(bArr.length, bArr)) {
                if (!C18856.m43754(bArr.length, bArr)) {
                    if (!C18856.m43747(bArr.length, bArr)) {
                        if (C18856.m43757(bArr.length, bArr)) {
                            return c21684Arr[4];
                        }
                        return null;
                    }
                    return c21684Arr[3];
                }
                return c21684Arr[2];
            }
            return c21684Arr[1];
        }
        return c21684Arr[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10495 m50579(String str, byte[] bArr) throws C10186 {
        int iM8270;
        if (str == null) {
            throw m50583((String) null);
        }
        int length = 0;
        if (!str.isEmpty()) {
            if (!str.equals(str.trim())) {
                throw m50583(str);
            }
            Integer num = (Integer) f72628.get(str);
            if (num == null) {
                throw m50583(str);
            }
            C21684 c21684M50584 = m50584(bArr);
            if (c21684M50584 != null && c21684M50584.f69213 == num.intValue()) {
                length = c21684M50584.f69211.length;
            }
            return new C10495(C2448.m8272(num.intValue()), length == 0 ? m50578(num.intValue()) : c21684M50584.f69212, length, length != 0 ? c21684M50584.f69211 : null);
        }
        C21684 c21684M50585 = m50584(bArr);
        if (c21684M50585 != null) {
            Charset charsetM8272 = C2448.m8272(c21684M50585.f69213);
            String str2 = c21684M50585.f69212;
            byte[] bArr2 = c21684M50585.f69211;
            return new C10495(charsetM8272, str2, bArr2.length, bArr2);
        }
        int i = C2448.f7850;
        if (bArr.length > 0) {
            String strM15228 = C5002.m15228(bArr.length, bArr);
            iM8270 = strM15228 == null ? -1 : C2448.m8270(strM15228);
            if (iM8270 == -1) {
                iM8270 = C2448.m8273(bArr.length, bArr);
            }
        } else {
            iM8270 = i;
        }
        if (iM8270 != C2448.f7861) {
            i = iM8270;
        }
        return new C10495(C2448.m8272(i), m50578(i), 0, null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10495 m50582(String str) throws C10186 {
        C21684 c21684;
        if (str == null || str.isEmpty() || !str.equals(str.trim())) {
            throw m50583(str);
        }
        Integer num = (Integer) f72628.get(str);
        if (num == null) {
            throw m50583(str);
        }
        C21684[] c21684Arr = f72627;
        int length = c21684Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c21684 = null;
                break;
            }
            c21684 = c21684Arr[i];
            if (c21684.f69212.equals(str)) {
                break;
            }
            i++;
        }
        return new C10495(C2448.m8272(num.intValue()), str, c21684 != null ? c21684.f69211.length : 0, c21684 != null ? c21684.f69211 : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21684 m50580(String str) {
        for (C21684 c21684 : f72627) {
            if (c21684.f69212.equals(str)) {
                return c21684;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50578(int i) {
        if (i == C2448.f7861) {
            i = C2448.f7850;
        }
        return C2448.m8274(i).toLowerCase(Locale.ROOT).replace('_', '-');
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m50583(String str) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = f72629.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return C10186.m26301("Unsupported text encoding token", "encoding", str == null ? JSON.NULL : JSON.value(str), jSONArrayArray, JSON.object().add("encoding", "utf-8"));
    }
}
