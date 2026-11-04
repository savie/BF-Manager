package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAV4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f80322 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ArrayList f80324 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17930 f80323 = new C17930();

    static {
        m55355();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m55355() {
        int i = C5639.f19498;
        m55358();
        String string = ApplicationC17729.f58258.getString("tfg", null);
        String string2 = ApplicationC17729.f58258.getString("text_function", null);
        ArrayList arrayList = f80324;
        if (string != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = new JSONArray(string);
            int size = jSONArray.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string3 = jSONObject.getString("n");
                JSONArray jSONArray2 = jSONObject.getJSONArray("d");
                if (string3 != null && jSONArray2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    m55350(arrayList3, jSONArray2);
                    arrayList2.add(new C1711(string3, arrayList3));
                }
            }
            if (!arrayList2.isEmpty()) {
                if (string2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    m55350(arrayList4, new JSONArray(string2));
                    ApplicationC17729.f58258.edit().remove("text_function").apply();
                    if (!arrayList4.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C1711 c1711 = (C1711) it.next();
                                if (c1711.m6082().equals("backup")) {
                                    ((ArrayList) c1711.m6080()).clear();
                                    ((ArrayList) c1711.m6080()).addAll(arrayList4);
                                    break;
                                }
                            } else {
                                arrayList2.add(0, new C1711("backup", arrayList4));
                                break;
                            }
                        }
                        z = true;
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (z) {
                    m55354();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (string2 == null) {
            arrayList5.add(new C16626("→", new C19147(9), null));
            arrayList5.add(m55348("/", "/"));
            arrayList5.add(m55348(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX));
            arrayList5.add(m55348("-", "-"));
            arrayList5.add(m55348("*", "*"));
            arrayList5.add(m55348("=", "="));
            arrayList5.add(m55348("<", "<"));
            arrayList5.add(m55348(">", ">"));
            arrayList5.add(m55348("\"", "\""));
            arrayList5.add(m55348("'", "'"));
            arrayList5.add(m55348(l.b, l.b));
            arrayList5.add(m55348("|", "|"));
            arrayList5.add(m55348("\\", "\\"));
            arrayList5.add(m55348("_", "_"));
            arrayList5.add(m55348("()", "($S$T$E)"));
            arrayList5.add(m55348("[]", "[$S$T$E]"));
            arrayList5.add(m55348("{}", "{$S$T$E}"));
            arrayList5.add(new C16626("…", new C19147(22), null));
        } else {
            m55350(arrayList5, new JSONArray(string2));
            ApplicationC17729.f58258.edit().remove("text_function").apply();
        }
        arrayList.clear();
        arrayList.add(new C1711(C21576.m49088(R.string.MT_Protector), arrayList5));
        m55354();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55350(ArrayList arrayList, JSONArray jSONArray) {
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            C16626 c16626M39341 = C16626.m39341(jSONArray.getJSONObject(i));
            if (c16626M39341.m39342()) {
                arrayList.add(c16626M39341);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16626 m55348(String str, String str2) {
        return new C16626(str, new C3485(str2), null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m55353() {
        return f80324;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17930 m55357() {
        return f80323;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m55356() {
        f80323.mo40348(new Object());
        C5261.m15836(new RunnableC11405(), C24832.class, 200L);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m55358() {
        f80323.mo40348(new Object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55347(ArrayList arrayList) {
        ArrayList arrayList2 = f80324;
        JSONArray jSONArray = new JSONArray(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (arrayList == null || arrayList.contains(Integer.valueOf(i))) {
                C1711 c1711 = (C1711) arrayList2.get(i);
                ArrayList arrayList3 = (ArrayList) c1711.m6080();
                JSONArray jSONArray2 = new JSONArray(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.add(((C16626) it.next()).m39344());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", c1711.m6082());
                jSONObject.put("d", jSONArray2);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m55354() {
        ApplicationC17729.f58258.edit().putString("tfg", m55347(null)).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55352(AbstractC22044 abstractC22044, ArrayList arrayList) {
        abstractC22044.m49879(m55347(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55351(AbstractC22044 abstractC22044, int i) {
        JSONArray jSONArray = new JSONArray(abstractC22044.m49871());
        if (jSONArray.size() == 0) {
            throw new C3090(R.string.MT_Protector);
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject == null) {
            throw new C3090(R.string.MT_Protector);
        }
        ArrayList<C1711> arrayList = new ArrayList();
        if (jSONObject.size() == 2 && jSONObject.contains("n") && jSONObject.contains("d")) {
            JSONArray jSONArray2 = new JSONArray(jSONArray);
            int size = jSONArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                String string = jSONObject2.getString("n");
                JSONArray jSONArray3 = jSONObject2.getJSONArray("d");
                if (string == null || jSONArray3 == null) {
                    throw new C3090(R.string.MT_Protector);
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = jSONArray3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C16626 c16626M39341 = C16626.m39341(jSONArray3.getJSONObject(i3));
                    if (c16626M39341.m39342()) {
                        arrayList2.add(c16626M39341);
                    }
                }
                arrayList.add(new C1711(string, arrayList2));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size3 = jSONArray.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C16626 c16626M39342 = C16626.m39341(jSONArray.getJSONObject(i4));
                if (!c16626M39342.m39342()) {
                    throw new C3090(R.string.MT_Protector);
                }
                arrayList3.add(c16626M39342);
            }
            if (arrayList3.isEmpty()) {
                throw new C3090(R.string.MT_Protector);
            }
            arrayList.add(new C1711(C21576.m49088(i == 0 ? R.string.MT_Protector : R.string.MT_Protector), arrayList3));
        }
        ArrayList arrayList4 = f80324;
        if (i == 0) {
            arrayList4.addAll(arrayList);
        } else if (i == 1) {
            for (C1711 c1711 : arrayList) {
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C1711 c1712 = (C1711) it.next();
                        if (c1712.m6082().equals(c1711.m6082())) {
                            ((ArrayList) c1712.m6080()).addAll(c1711.m6080());
                            break;
                        }
                    } else {
                        arrayList4.add(c1711);
                        break;
                    }
                }
            }
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList);
        }
        f80323.mo40348(new Object());
        m55354();
    }
}
