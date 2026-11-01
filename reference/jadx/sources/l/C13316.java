package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13316 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32824(C15530 c15530) {
        return m32822(C5244.m14438(c15530));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32822(String str) {
        try {
            return new JSONObject(str);
        } catch (RuntimeException e) {
            throw m32827(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32823(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.add((String) entry.getKey(), m32825(entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m32825(Object obj) {
        if (obj == null) {
            return JSON.NULL;
        }
        if (obj instanceof JSONValue) {
            return (JSONValue) obj;
        }
        if (obj instanceof String) {
            return JSON.value((String) obj);
        }
        if (obj instanceof Boolean) {
            return JSON.value(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return JSON.value(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return JSON.value(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return JSON.value(((Short) obj).intValue());
        }
        if (obj instanceof Byte) {
            return JSON.value(((Byte) obj).intValue());
        }
        if (obj instanceof Float) {
            return JSON.value(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return JSON.value(((Double) obj).doubleValue());
        }
        if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.bitLength() <= 63) {
                return JSON.value(bigInteger.longValue());
            }
            throw new ArithmeticException("BigInteger out of long range");
        }
        if (obj instanceof BigDecimal) {
            return JSON.value(((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof Map) {
            return m32823((Map) obj);
        }
        if (!(obj instanceof Iterable)) {
            if (!(obj instanceof C22157)) {
                throw new IllegalArgumentException(C12441.m30912(obj, "Unsupported JSON value type: "));
            }
            C22157 c22157 = (C22157) obj;
            return new JSONObject().add("mode", c22157.f72475).add("cacheKey", c22157.f72474);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.add(m32825(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m32829(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (RuntimeException e) {
            throw m32827(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m32826(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("paths");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (RuntimeException e) {
                    throw m32827(e);
                }
            }
            return arrayList;
        } catch (RuntimeException e2) {
            throw m32827(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32828(JSONObject jSONObject, String str) {
        try {
            Boolean booleanObject = jSONObject.getBooleanObject(str);
            if (booleanObject == null) {
                return false;
            }
            return booleanObject.booleanValue();
        } catch (RuntimeException e) {
            throw m32827(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m32830(JSONObject jSONObject, String str) {
        try {
            Long longObject = jSONObject.getLongObject(str);
            if (longObject == null) {
                return 0L;
            }
            return longObject.longValue();
        } catch (RuntimeException e) {
            throw m32827(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1320 m32827(RuntimeException runtimeException) {
        return runtimeException instanceof C1320 ? (C1320) runtimeException : new C1320(runtimeException);
    }
}
