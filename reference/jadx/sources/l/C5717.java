package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGS */
/* JADX INFO: loaded from: classes.dex */
public final class C5717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final List f19479;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f19480;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final List f19481;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9186 f19482;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f19483;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static native synchronized void m15755();

    static {
        boolean z;
        ApplicationC6132.m17119(80);
        ArrayList arrayList = new ArrayList();
        f19480 = arrayList;
        f19479 = C0561.unmodifiableList(arrayList);
        f19482 = new C9186();
        ArrayList arrayList2 = new ArrayList();
        f19483 = arrayList2;
        f19481 = C0561.unmodifiableList(arrayList2);
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("config.init");
        JSONArray jSONArray = null;
        if (abstractC20745M46690.mo33974()) {
            try {
                C14493 c14493 = new C14493(new File(abstractC20745M46690.mo33986()));
                byte[] bArrMo16347 = c14493.mo16347("ftp_configs", (byte[]) null);
                if (bArrMo16347 != null && bArrMo16347.length != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    byte bMo16345 = c14493.mo16345((byte) 0, "ftp_configs_version");
                    C17367 c17367 = new C17367(bArrMo16347);
                    int i = c17367.readInt();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= i) {
                            f19480.addAll(arrayList3);
                            abstractC20745M46690.mo24647();
                            break;
                        }
                        if (bMo16345 == 0) {
                            arrayList3.add(C3536.m10434(c17367));
                        } else if (bMo16345 == 1) {
                            try {
                                arrayList3.add(C3536.m10433(c17367));
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw new RuntimeException("Unsupported config ver " + ((int) bMo16345));
                        }
                        i2++;
                    }
                }
                abstractC20745M46690.mo24647();
                z = false;
            } catch (Throwable th) {
                abstractC20745M46690.mo24647();
                throw th;
            }
        } else {
            z = false;
        }
        String string = ApplicationC0716.f2992.getString("ns_data", null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONParseException unused2) {
            }
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                AbstractC12068 abstractC12068M15758 = m15758(jSONArray.getJSONObject(i3));
                if (abstractC12068M15758 instanceof C21735) {
                    f19483.add((C21735) abstractC12068M15758);
                } else {
                    f19480.add(abstractC12068M15758);
                }
            } catch (RuntimeException unused3) {
            }
        }
        if (z) {
            m15755();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12068 m15758(JSONObject jSONObject) {
        switch (jSONObject.getInt("nct")) {
            case 0:
                return new C4718(jSONObject);
            case 1:
                return new C13186(jSONObject);
            case 2:
                return new C22462(jSONObject);
            case 3:
                return new C8768(jSONObject);
            case 4:
                return new C1315(jSONObject);
            case 5:
                return new C17606(jSONObject);
            case 6:
                return new C21735(jSONObject);
            default:
                throw new RuntimeException("Type: " + jSONObject.getInt("nct"));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m15772(AbstractC12068 abstractC12068) {
        JSONObject jSONObjectMo4706 = abstractC12068.mo4706();
        Class<?> cls = abstractC12068.getClass();
        if (cls == C4718.class) {
            jSONObjectMo4706.put("nct", 0);
            return jSONObjectMo4706;
        }
        if (cls == C13186.class) {
            jSONObjectMo4706.put("nct", 1);
            return jSONObjectMo4706;
        }
        if (cls == C22462.class) {
            jSONObjectMo4706.put("nct", 2);
            return jSONObjectMo4706;
        }
        if (cls == C8768.class) {
            jSONObjectMo4706.put("nct", 3);
            return jSONObjectMo4706;
        }
        if (cls == C1315.class) {
            jSONObjectMo4706.put("nct", 4);
            return jSONObjectMo4706;
        }
        if (cls == C17606.class) {
            jSONObjectMo4706.put("nct", 5);
            return jSONObjectMo4706;
        }
        if (cls == C21735.class) {
            jSONObjectMo4706.put("nct", 6);
            return jSONObjectMo4706;
        }
        throw new RuntimeException(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONArray m15756() {
        JSONArray jSONArray = new JSONArray();
        synchronized (C5717.class) {
            Iterator it = f19480.iterator();
            while (it.hasNext()) {
                jSONArray.add(m15772((AbstractC12068) it.next()));
            }
            Iterator it2 = f19483.iterator();
            while (it2.hasNext()) {
                jSONArray.add(m15772((C21735) it2.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15764(InterfaceC10597 interfaceC10597) {
        f19482.m44961(interfaceC10597);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15767(AbstractActivityC12483 abstractActivityC12483, InterfaceC10597 interfaceC10597) {
        f19482.m44959(abstractActivityC12483, interfaceC10597);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m15769() {
        return f19479;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static List m15768() {
        return f19481;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC12068 m15770(int i) {
        if (i == -1) {
            return null;
        }
        for (AbstractC12068 abstractC12068 : f19480) {
            if (abstractC12068.f40385 == i) {
                return abstractC12068;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12068 m15759(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AbstractC12068 abstractC12068 : f19480) {
            if (abstractC12068.mo4700().equals(str)) {
                return abstractC12068;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C21735 m15757(int i) {
        if (i == -1) {
            return null;
        }
        for (C21735 c21735 : f19483) {
            if (c21735.f40385 == i) {
                return c21735;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21735 m15773(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C21735 c21735 : f19483) {
            if (c21735.mo4700().equals(str)) {
                return c21735;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m15771() {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() / 100) & 2147483647L);
        while (true) {
            synchronized (C5717.class) {
                Iterator it = f19480.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC12068) it.next()).f40385 == iCurrentTimeMillis) {
                        }
                    } else {
                        Iterator it2 = f19483.iterator();
                        do {
                            if (!it2.hasNext()) {
                                return iCurrentTimeMillis;
                            }
                        } while (((AbstractC12068) it2.next()).f40385 != iCurrentTimeMillis);
                    }
                }
                iCurrentTimeMillis++;
            }
            iCurrentTimeMillis++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15763(ArrayList arrayList) {
        synchronized (C5717.class) {
            f19480.clear();
            f19483.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC12068 abstractC12068 = (AbstractC12068) it.next();
                if (abstractC12068 instanceof C21735) {
                    f19483.add((C21735) abstractC12068);
                } else {
                    f19480.add(abstractC12068);
                }
            }
        }
        m15755();
        f19482.mo23641(f19479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15766(AbstractC12068 abstractC12068) {
        synchronized (C5717.class) {
            if (abstractC12068 instanceof C21735) {
                f19483.add((C21735) abstractC12068);
            } else {
                f19480.add(abstractC12068);
            }
        }
        m15755();
        f19482.mo23641(f19479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15760() {
        m15755();
        f19482.mo23641(f19479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15762(int i, int i2) {
        synchronized (C5717.class) {
            C23520.m51798(i, i2, f19480);
        }
        m15776();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15775(int i, int i2) {
        synchronized (C5717.class) {
            C23520.m51798(i, i2, f19483);
        }
        m15776();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15761(int i) {
        synchronized (C5717.class) {
            f19480.remove(i);
        }
        m15776();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15774(int i) {
        synchronized (C5717.class) {
            f19483.remove(i);
        }
        m15776();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m15776() {
        C4716.m13051(new RunnableC17006(), C5717.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15765(InterfaceC10609 interfaceC10609) {
        synchronized (C5717.class) {
            int size = interfaceC10609.size();
            ArrayList<AbstractC12068> arrayList = f19480;
            if (size == arrayList.size()) {
                C7931 c7931 = new C7931(arrayList.size());
                for (AbstractC12068 abstractC12068 : arrayList) {
                    c7931.mo8944(abstractC12068.f40385, abstractC12068);
                }
                ArrayList arrayList2 = new ArrayList(f19480.size());
                int size2 = interfaceC10609.size();
                for (int i = 0; i < size2; i++) {
                    int i2 = interfaceC10609.getInt(i);
                    AbstractC12068 abstractC12069 = (AbstractC12068) c7931.remove(i2);
                    if (abstractC12069 == null) {
                        throw new IllegalArgumentException("Unknown config id " + i2);
                    }
                    arrayList2.add(abstractC12069);
                }
                if (!c7931.isEmpty()) {
                    throw new IllegalArgumentException("Missing config ids " + c7931.keySet());
                }
                ArrayList arrayList3 = f19480;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            } else {
                throw new IllegalArgumentException("Unexpected config count " + interfaceC10609.size());
            }
        }
        m15776();
    }
}
