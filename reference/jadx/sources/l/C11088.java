package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11088 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f37642 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f37641 = C11445.m28558();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m27969(String str, String str2) {
        HashMap map = f37642;
        if (C13638.equals(map.get(str), str2)) {
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized void m27973(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            HashMap map = f37642;
            if (TextUtils.isEmpty((CharSequence) map.get(str))) {
                map.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m27967(String str) {
        String str2;
        str2 = (String) C9735.getOrDefault(f37642, str, "");
        if (str2 != null && !str2.isEmpty()) {
            System.out.println(">> Get password: " + str + " -> " + str2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m27975(String str, String str2) {
        if (str2 != null) {
            if (!str2.isEmpty()) {
                f37642.put(str, str2);
            }
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
        if (f37642.remove(str) != null) {
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
    }

    static {
        m27971();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m27971() {
        List list = f37641;
        list.clear();
        String string = ApplicationC0716.f2992.getString("cpwsj", null);
        try {
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        list.add(new C6148(jSONArray2.getString(0), jSONArray2.getString(1)));
                    } else if (obj != null && obj != JSONObject.NULL) {
                        list.add(new C6148(obj.toString(), null));
                    }
                }
                return;
            }
            String[] strArrMo16349 = ApplicationC0716.f2992.mo16349("cpws", (String[]) null);
            if (strArrMo16349 != null) {
                for (String str : strArrMo16349) {
                    list.add(new C6148(str, null));
                }
                ApplicationC0716.f2992.edit().remove("cpws").putString("cpwsj", new JSONArray(strArrMo16349).toString()).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27970(ArrayList arrayList) {
        List<C6148> list = f37641;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C6148 c6148 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C6148 c6149 = (C6148) it.next();
                    if (C13638.equals(c6148.f21002, c6149.f21002)) {
                        if (!C13638.equals(c6148.f21001, c6149.f21001)) {
                            c6149.f21001 = c6148.f21001;
                            break;
                        }
                        break;
                    }
                } else {
                    arrayList.add(c6148);
                    break;
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        synchronized (f37641) {
            m27965();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Iterator m27974() {
        Iterator it;
        List list = f37641;
        synchronized (list) {
            it = ((List) C9030.stream(list).map(new C17437(0)).collect(C1890.toUnmodifiableList())).iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m27972() {
        return f37641;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static List m27966() {
        List listUnmodifiableList;
        List<C6148> list = f37641;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C6148 c6148 : list) {
                arrayList.add(new C6148(c6148.f21002, c6148.f21001));
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m27977() {
        C4716.m13051(new RunnableC19768(1), f37641, 500L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27976(ArrayList arrayList) {
        List list = f37641;
        synchronized (list) {
            list.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6148 c6148 = (C6148) it.next();
                f37641.add(new C6148(c6148.f21002, c6148.f21001));
            }
            m27965();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27968() {
        synchronized (f37641) {
            m27965();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m27965() {
        JSONArray jSONArray = new JSONArray();
        for (C6148 c6148 : f37641) {
            if (TextUtils.isEmpty(c6148.f21001)) {
                jSONArray.put(c6148.f21002);
            } else {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(c6148.f21002);
                jSONArray2.put(c6148.f21001);
                jSONArray.put(jSONArray2);
            }
        }
        ApplicationC0716.f2992.edit().putString("cpwsj", jSONArray.toString()).apply();
    }
}
