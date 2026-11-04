package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩶֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6YT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20988 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Set f67101;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Set f67102;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Set f67103;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f67104;

    static {
        String[] strArr = {"console.asyncRender", "console.jsExecution", "console.catchGlobalErr", "console.overrideConsole", "console.displayIfErr", "console.displayExtraInfo", "console.displayUnenumerable", "console.displayGetterVal", "console.lazyEvaluation", "elements.overrideEventTarget", "resources.observeElement", "sources.showLineNum"};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            C17359.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f67102 = C4681.unmodifiableSet(hashSet);
        String[] strArr2 = {"System preference", "Light", "Dark", "Material Oceanic", "Material Darker", "Material Lighter", "Material Palenight", "Material Deep Ocean", "Monokai Pro", "Dracula", "Arc Dark", "Atom One Dark", "Atom One Light", "Solarized Dark", "Solarized Light", "Github", "Night Owl", "Light Owl", "AMOLED"};
        HashSet hashSet2 = new HashSet(19);
        for (int i2 = 0; i2 < 19; i2++) {
            String str2 = strArr2[i2];
            C17359.requireNonNull(str2);
            if (!hashSet2.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f67103 = C4681.unmodifiableSet(hashSet2);
        Object[] objArr = {"infinite", "250", "125", "100", "50", "10"};
        HashSet hashSet3 = new HashSet(6);
        for (int i3 = 0; i3 < 6; i3++) {
            Object obj = objArr[i3];
            C17359.requireNonNull(obj);
            if (!hashSet3.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f67101 = C4681.unmodifiableSet(hashSet3);
    }

    public C20988(InterfaceC9801 interfaceC9801) {
        this.f67104 = interfaceC9801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m47972() {
        JSONObject jSONObjectM47970;
        synchronized (this.f67104) {
            jSONObjectM47970 = m47970();
        }
        return jSONObjectM47970;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private JSONObject m47970() {
        JSONObject jSONObject = new JSONObject();
        String string = this.f67104.getString("hpic", "{}");
        if (string.length() <= 4096) {
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (m47968(obj, next)) {
                        jSONObject.put(next, obj);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47973(String str) {
        boolean zM47971;
        if (str == null || str.length() > 512) {
            return false;
        }
        synchronized (this.f67104) {
            zM47971 = m47971(str);
        }
        return zM47971;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m47971(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 1 && "reset".equals(jSONArray.get(0))) {
                return m47969(null);
            }
            if (jSONArray.length() == 4 && "set".equals(jSONArray.get(0)) && (jSONArray.get(1) instanceof String) && (jSONArray.get(2) instanceof String)) {
                String str2 = jSONArray.getString(1) + "." + jSONArray.getString(2);
                Object obj = jSONArray.get(3);
                if (!m47968(obj, str2)) {
                    return false;
                }
                JSONObject jSONObjectM47970 = m47970();
                if (obj.equals(jSONObjectM47970.opt(str2))) {
                    return true;
                }
                jSONObjectM47970.put(str2, obj);
                return m47969(jSONObjectM47970.toString());
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m47969(String str) {
        InterfaceC9801 interfaceC9801 = this.f67104;
        String string = interfaceC9801.getString("hpic", null);
        if (interfaceC9801.edit().putString("hpic", str).commit()) {
            return true;
        }
        interfaceC9801.edit().putString("hpic", string).commit();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47968(Object obj, String str) {
        if (f67102.contains(str)) {
            return obj instanceof Boolean;
        }
        if (str.equals("dev-tools.theme")) {
            return (obj instanceof String) && f67103.contains(obj);
        }
        if (str.equals("console.maxLogNum")) {
            return (obj instanceof String) && f67101.contains(obj);
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
            if (str.equals("dev-tools.transparency")) {
                return dDoubleValue >= 0.2d && dDoubleValue <= 1.0d;
            }
            if (str.equals("dev-tools.displaySize") && dDoubleValue >= 40.0d && dDoubleValue <= 100.0d) {
                return true;
            }
        }
        return false;
    }
}
