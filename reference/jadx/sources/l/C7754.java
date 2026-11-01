package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAV4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7754 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25604 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f25606 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C9186 f25605 = new C9186();

    static {
        m20411();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m20411() {
        int i = C16839.f53880;
        m20401();
        String string = ApplicationC0716.f2992.getString("tfg", null);
        String string2 = ApplicationC0716.f2992.getString("text_function", null);
        ArrayList arrayList = f25606;
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
                    m20405(arrayList3, jSONArray2);
                    arrayList2.add(new C9166(string3, arrayList3));
                }
            }
            if (!arrayList2.isEmpty()) {
                if (string2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    m20405(arrayList4, new JSONArray(string2));
                    ApplicationC0716.f2992.edit().remove("text_function").apply();
                    if (!arrayList4.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C9166 c9166 = (C9166) it.next();
                                if (c9166.m23581().equals("backup")) {
                                    ((ArrayList) c9166.m23579()).clear();
                                    ((ArrayList) c9166.m23579()).addAll(arrayList4);
                                    break;
                                }
                            } else {
                                arrayList2.add(0, new C9166("backup", arrayList4));
                                break;
                            }
                        }
                        z = true;
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (z) {
                    m20400();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (string2 == null) {
            arrayList5.add(new C21159("→", new C13607(9), null));
            arrayList5.add(m20403("/", "/"));
            arrayList5.add(m20403(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX));
            arrayList5.add(m20403("-", "-"));
            arrayList5.add(m20403("*", "*"));
            arrayList5.add(m20403("=", "="));
            arrayList5.add(m20403("<", "<"));
            arrayList5.add(m20403(">", ">"));
            arrayList5.add(m20403("\"", "\""));
            arrayList5.add(m20403("'", "'"));
            arrayList5.add(m20403(l.b, l.b));
            arrayList5.add(m20403("|", "|"));
            arrayList5.add(m20403("\\", "\\"));
            arrayList5.add(m20403("_", "_"));
            arrayList5.add(m20403("()", "($S$T$E)"));
            arrayList5.add(m20403("[]", "[$S$T$E]"));
            arrayList5.add(m20403("{}", "{$S$T$E}"));
            arrayList5.add(new C21159("…", new C13607(22), null));
        } else {
            m20405(arrayList5, new JSONArray(string2));
            ApplicationC0716.f2992.edit().remove("text_function").apply();
        }
        arrayList.clear();
        arrayList.add(new C9166(C16737.m39288(R.string.MT_Protector), arrayList5));
        m20400();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20405(ArrayList arrayList, JSONArray jSONArray) {
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            C21159 c21159M47613 = C21159.m47613(jSONArray.getJSONObject(i));
            if (c21159M47613.m47615()) {
                arrayList.add(c21159M47613);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21159 m20403(String str, String str2) {
        return new C21159(str, new C16346(str2), null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m20409() {
        return f25606;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9186 m20410() {
        return f25605;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m20408() {
        f25605.mo23641(new Object());
        C4716.m13051(new RunnableC10577(), C7754.class, 200L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m20401() {
        f25605.mo23641(new Object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20402(ArrayList arrayList) {
        ArrayList arrayList2 = f25606;
        JSONArray jSONArray = new JSONArray(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (arrayList == null || arrayList.contains(Integer.valueOf(i))) {
                C9166 c9166 = (C9166) arrayList2.get(i);
                ArrayList arrayList3 = (ArrayList) c9166.m23579();
                JSONArray jSONArray2 = new JSONArray(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.add(((C21159) it.next()).m47616());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", c9166.m23581());
                jSONObject.put("d", jSONArray2);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m20400() {
        ApplicationC0716.f2992.edit().putString("tfg", m20402(null)).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20407(AbstractC20745 abstractC20745, ArrayList arrayList) {
        abstractC20745.m46735(m20402(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20406(AbstractC20745 abstractC20745, int i) throws C8142 {
        JSONArray jSONArray = new JSONArray(abstractC20745.m46730());
        if (jSONArray.size() == 0) {
            throw new C8142(R.string.MT_Protector);
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject == null) {
            throw new C8142(R.string.MT_Protector);
        }
        ArrayList<C9166> arrayList = new ArrayList();
        if (jSONObject.size() == 2 && jSONObject.contains("n") && jSONObject.contains("d")) {
            JSONArray jSONArray2 = new JSONArray(jSONArray);
            int size = jSONArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                String string = jSONObject2.getString("n");
                JSONArray jSONArray3 = jSONObject2.getJSONArray("d");
                if (string == null || jSONArray3 == null) {
                    throw new C8142(R.string.MT_Protector);
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = jSONArray3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C21159 c21159M47613 = C21159.m47613(jSONArray3.getJSONObject(i3));
                    if (c21159M47613.m47615()) {
                        arrayList2.add(c21159M47613);
                    }
                }
                arrayList.add(new C9166(string, arrayList2));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size3 = jSONArray.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C21159 c21159M47614 = C21159.m47613(jSONArray.getJSONObject(i4));
                if (!c21159M47614.m47615()) {
                    throw new C8142(R.string.MT_Protector);
                }
                arrayList3.add(c21159M47614);
            }
            if (arrayList3.isEmpty()) {
                throw new C8142(R.string.MT_Protector);
            }
            arrayList.add(new C9166(C16737.m39288(i == 0 ? R.string.MT_Protector : R.string.MT_Protector), arrayList3));
        }
        ArrayList arrayList4 = f25606;
        if (i == 0) {
            arrayList4.addAll(arrayList);
        } else if (i == 1) {
            for (C9166 c9166 : arrayList) {
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C9166 c9167 = (C9166) it.next();
                        if (c9167.m23581().equals(c9166.m23581())) {
                            ((ArrayList) c9167.m23579()).addAll(c9166.m23579());
                            break;
                        }
                    } else {
                        arrayList4.add(c9166);
                        break;
                    }
                }
            }
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList);
        }
        f25605.mo23641(new Object());
        m20400();
    }
}
