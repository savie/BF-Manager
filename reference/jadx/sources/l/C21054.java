package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩶ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21054 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f67288 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f67287 = C1402.m5127();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m48111(String str, String str2) {
        HashMap map = f67288;
        if (C17359.equals(map.get(str), str2)) {
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized void m48114(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            HashMap map = f67288;
            if (TextUtils.isEmpty((CharSequence) map.get(str))) {
                map.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m48109(String str) {
        String str2;
        str2 = (String) C11392.getOrDefault(f67288, str, "");
        if (str2 != null && !str2.isEmpty()) {
            System.out.println(">> Get password: " + str + " -> " + str2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m48119(String str, String str2) {
        if (str2 != null) {
            if (!str2.isEmpty()) {
                f67288.put(str, str2);
            }
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
        if (f67288.remove(str) != null) {
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
    }

    static {
        m48117();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m48117() {
        List list = f67287;
        list.clear();
        String string = ApplicationC17729.f58258.getString("cpwsj", null);
        try {
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        list.add(new C14340(jSONArray2.getString(0), jSONArray2.getString(1)));
                    } else if (obj != null && obj != JSONObject.NULL) {
                        list.add(new C14340(obj.toString(), null));
                    }
                }
                return;
            }
            String[] strArrMo7905 = ApplicationC17729.f58258.mo7905("cpws", (String[]) null);
            if (strArrMo7905 != null) {
                for (String str : strArrMo7905) {
                    list.add(new C14340(str, null));
                }
                ApplicationC17729.f58258.edit().remove("cpws").putString("cpwsj", new JSONArray(strArrMo7905).toString()).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48112(ArrayList arrayList) {
        List<C14340> list = f67287;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C14340 c14340 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C14340 c14341 = (C14340) it.next();
                    if (C17359.equals(c14340.f45235, c14341.f45235)) {
                        if (!C17359.equals(c14340.f45234, c14341.f45234)) {
                            c14341.f45234 = c14340.f45234;
                            break;
                        }
                        break;
                    }
                } else {
                    arrayList.add(c14340);
                    break;
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        synchronized (f67287) {
            m48115();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Iterator m48118() {
        Iterator it;
        List list = f67287;
        synchronized (list) {
            it = ((List) C1170.stream(list).map(new C3900(0)).collect(C2025.toUnmodifiableList())).iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m48113() {
        return f67287;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static List m48121() {
        List listUnmodifiableList;
        List<C14340> list = f67287;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C14340 c14340 : list) {
                arrayList.add(new C14340(c14340.f45235, c14340.f45234));
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m48116() {
        C5261.m15836(new RunnableC24038(), f67287, 500L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48120(ArrayList arrayList) {
        List list = f67287;
        synchronized (list) {
            list.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14340 c14340 = (C14340) it.next();
                f67287.add(new C14340(c14340.f45235, c14340.f45234));
            }
            m48115();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48110() {
        synchronized (f67287) {
            m48115();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m48115() {
        JSONArray jSONArray = new JSONArray();
        for (C14340 c14340 : f67287) {
            if (TextUtils.isEmpty(c14340.f45234)) {
                jSONArray.put(c14340.f45235);
            } else {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(c14340.f45235);
                jSONArray2.put(c14340.f45234);
                jSONArray.put(jSONArray2);
            }
        }
        ApplicationC17729.f58258.edit().putString("cpwsj", jSONArray.toString()).apply();
    }
}
