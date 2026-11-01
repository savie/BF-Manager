package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O6YT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0919 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f3684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f3685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Set f3686;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f3687;

    static {
        String[] strArr = {"console.asyncRender", "console.jsExecution", "console.catchGlobalErr", "console.overrideConsole", "console.displayIfErr", "console.displayExtraInfo", "console.displayUnenumerable", "console.displayGetterVal", "console.lazyEvaluation", "elements.overrideEventTarget", "resources.observeElement", "sources.showLineNum"};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            C13638.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f3686 = C0561.unmodifiableSet(hashSet);
        String[] strArr2 = {"System preference", "Light", "Dark", "Material Oceanic", "Material Darker", "Material Lighter", "Material Palenight", "Material Deep Ocean", "Monokai Pro", "Dracula", "Arc Dark", "Atom One Dark", "Atom One Light", "Solarized Dark", "Solarized Light", "Github", "Night Owl", "Light Owl", "AMOLED"};
        HashSet hashSet2 = new HashSet(19);
        for (int i2 = 0; i2 < 19; i2++) {
            String str2 = strArr2[i2];
            C13638.requireNonNull(str2);
            if (!hashSet2.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f3684 = C0561.unmodifiableSet(hashSet2);
        Object[] objArr = {"infinite", "250", "125", "100", "50", "10"};
        HashSet hashSet3 = new HashSet(6);
        for (int i3 = 0; i3 < 6; i3++) {
            Object obj = objArr[i3];
            C13638.requireNonNull(obj);
            if (!hashSet3.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f3685 = C0561.unmodifiableSet(hashSet3);
    }

    public C0919(InterfaceC6025 interfaceC6025) {
        this.f3687 = interfaceC6025;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m3649() {
        JSONObject jSONObjectM3647;
        synchronized (this.f3687) {
            jSONObjectM3647 = m3647();
        }
        return jSONObjectM3647;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private JSONObject m3647() {
        JSONObject jSONObject = new JSONObject();
        String string = this.f3687.getString("hpic", "{}");
        if (string.length() <= 4096) {
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (m3645(obj, next)) {
                        jSONObject.put(next, obj);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3650(String str) {
        boolean zM3648;
        if (str == null || str.length() > 512) {
            return false;
        }
        synchronized (this.f3687) {
            zM3648 = m3648(str);
        }
        return zM3648;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m3648(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 1 && "reset".equals(jSONArray.get(0))) {
                return m3646(null);
            }
            if (jSONArray.length() == 4 && "set".equals(jSONArray.get(0)) && (jSONArray.get(1) instanceof String) && (jSONArray.get(2) instanceof String)) {
                String str2 = jSONArray.getString(1) + "." + jSONArray.getString(2);
                Object obj = jSONArray.get(3);
                if (!m3645(obj, str2)) {
                    return false;
                }
                JSONObject jSONObjectM3647 = m3647();
                if (obj.equals(jSONObjectM3647.opt(str2))) {
                    return true;
                }
                jSONObjectM3647.put(str2, obj);
                return m3646(jSONObjectM3647.toString());
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m3646(String str) {
        InterfaceC6025 interfaceC6025 = this.f3687;
        String string = interfaceC6025.getString("hpic", null);
        if (interfaceC6025.edit().putString("hpic", str).commit()) {
            return true;
        }
        interfaceC6025.edit().putString("hpic", string).commit();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3645(Object obj, String str) {
        if (f3686.contains(str)) {
            return obj instanceof Boolean;
        }
        if (str.equals("dev-tools.theme")) {
            return (obj instanceof String) && f3684.contains(obj);
        }
        if (str.equals("console.maxLogNum")) {
            return (obj instanceof String) && f3685.contains(obj);
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
