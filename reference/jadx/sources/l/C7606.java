package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGS */
/* JADX INFO: loaded from: classes.dex */
public final class C7606 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f25112;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C17930 f25113;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final List f25114;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ArrayList f25115;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final List f25116;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static native synchronized void m20793();

    static {
        boolean z;
        ApplicationC23172.m52091(78);
        ArrayList arrayList = new ArrayList();
        f25112 = arrayList;
        f25116 = C4681.unmodifiableList(arrayList);
        f25113 = new C17930();
        ArrayList arrayList2 = new ArrayList();
        f25115 = arrayList2;
        f25114 = C4681.unmodifiableList(arrayList2);
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("config.init");
        JSONArray jSONArray = null;
        if (abstractC22044M49876.mo4281()) {
            try {
                C2345 c2345 = new C2345(new File(abstractC22044M49876.mo4294()));
                byte[] bArrMo7903 = c2345.mo7903("ftp_configs", (byte[]) null);
                if (bArrMo7903 != null && bArrMo7903.length != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    byte bMo7901 = c2345.mo7901((byte) 0, "ftp_configs_version");
                    C20348 c20348 = new C20348(bArrMo7903);
                    int i = c20348.readInt();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= i) {
                            f25112.addAll(arrayList3);
                            abstractC22044M49876.mo4296();
                            break;
                        }
                        if (bMo7901 == 0) {
                            arrayList3.add(C4645.m14497(c20348));
                        } else if (bMo7901 == 1) {
                            try {
                                arrayList3.add(C4645.m14496(c20348));
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw new RuntimeException("Unsupported config ver " + ((int) bMo7901));
                        }
                        i2++;
                    }
                }
                abstractC22044M49876.mo4296();
                z = false;
            } catch (Throwable th) {
                abstractC22044M49876.mo4296();
                throw th;
            }
        } else {
            z = false;
        }
        String string = ApplicationC17729.f58258.getString("ns_data", null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONParseException unused2) {
            }
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                AbstractC0148 abstractC0148M20781 = m20781(jSONArray.getJSONObject(i3));
                if (abstractC0148M20781 instanceof C23794) {
                    f25115.add((C23794) abstractC0148M20781);
                } else {
                    f25112.add(abstractC0148M20781);
                }
            } catch (RuntimeException unused3) {
            }
        }
        if (z) {
            m20793();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0148 m20781(JSONObject jSONObject) {
        switch (jSONObject.getInt("nct")) {
            case 0:
                return new C21799(jSONObject);
            case 1:
                return new C11356(jSONObject);
            case 2:
                return new C13263(jSONObject);
            case 3:
                return new C6574(jSONObject);
            case 4:
                return new C12957(jSONObject);
            case 5:
                return new C9423(jSONObject);
            case 6:
                return new C23794(jSONObject);
            default:
                throw new RuntimeException("Type: " + jSONObject.getInt("nct"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m20797(AbstractC0148 abstractC0148) {
        JSONObject jSONObjectMo1331 = abstractC0148.mo1331();
        Class<?> cls = abstractC0148.getClass();
        if (cls == C21799.class) {
            jSONObjectMo1331.put("nct", 0);
            return jSONObjectMo1331;
        }
        if (cls == C11356.class) {
            jSONObjectMo1331.put("nct", 1);
            return jSONObjectMo1331;
        }
        if (cls == C13263.class) {
            jSONObjectMo1331.put("nct", 2);
            return jSONObjectMo1331;
        }
        if (cls == C6574.class) {
            jSONObjectMo1331.put("nct", 3);
            return jSONObjectMo1331;
        }
        if (cls == C12957.class) {
            jSONObjectMo1331.put("nct", 4);
            return jSONObjectMo1331;
        }
        if (cls == C9423.class) {
            jSONObjectMo1331.put("nct", 5);
            return jSONObjectMo1331;
        }
        if (cls == C23794.class) {
            jSONObjectMo1331.put("nct", 6);
            return jSONObjectMo1331;
        }
        throw new RuntimeException(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static JSONArray m20801() {
        JSONArray jSONArray = new JSONArray();
        synchronized (C7606.class) {
            Iterator it = f25112.iterator();
            while (it.hasNext()) {
                jSONArray.add(m20797((AbstractC0148) it.next()));
            }
            Iterator it2 = f25115.iterator();
            while (it2.hasNext()) {
                jSONArray.add(m20797((C23794) it2.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20789(InterfaceC16438 interfaceC16438) {
        f25113.m40351(interfaceC16438);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20790(AbstractActivityC17204 abstractActivityC17204, InterfaceC16438 interfaceC16438) {
        f25113.m40350(abstractActivityC17204, interfaceC16438);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m20791() {
        return f25116;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static List m20795() {
        return f25114;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0148 m20792(int i) {
        if (i == -1) {
            return null;
        }
        for (AbstractC0148 abstractC0148 : f25112) {
            if (abstractC0148.f1127 == i) {
                return abstractC0148;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0148 m20782(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AbstractC0148 abstractC0148 : f25112) {
            if (abstractC0148.mo1325().equals(str)) {
                return abstractC0148;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C23794 m20802(int i) {
        if (i == -1) {
            return null;
        }
        for (C23794 c23794 : f25115) {
            if (c23794.f1127 == i) {
                return c23794;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C23794 m20798(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C23794 c23794 : f25115) {
            if (c23794.mo1325().equals(str)) {
                return c23794;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m20796() {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() / 100) & 2147483647L);
        while (true) {
            synchronized (C7606.class) {
                Iterator it = f25112.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC0148) it.next()).f1127 == iCurrentTimeMillis) {
                        }
                    } else {
                        Iterator it2 = f25115.iterator();
                        do {
                            if (!it2.hasNext()) {
                                return iCurrentTimeMillis;
                            }
                        } while (((AbstractC0148) it2.next()).f1127 != iCurrentTimeMillis);
                    }
                }
                iCurrentTimeMillis++;
            }
            iCurrentTimeMillis++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20786(ArrayList arrayList) {
        synchronized (C7606.class) {
            f25112.clear();
            f25115.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0148 abstractC0148 = (AbstractC0148) it.next();
                if (abstractC0148 instanceof C23794) {
                    f25115.add((C23794) abstractC0148);
                } else {
                    f25112.add(abstractC0148);
                }
            }
        }
        m20793();
        f25113.mo40348(f25116);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20787(AbstractC0148 abstractC0148) {
        synchronized (C7606.class) {
            if (abstractC0148 instanceof C23794) {
                f25115.add((C23794) abstractC0148);
            } else {
                f25112.add(abstractC0148);
            }
        }
        m20793();
        f25113.mo40348(f25116);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20783() {
        m20793();
        f25113.mo40348(f25116);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20785(int i, int i2) {
        synchronized (C7606.class) {
            C9911.m25734(i, i2, f25112);
        }
        m20794();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20800(int i, int i2) {
        synchronized (C7606.class) {
            C9911.m25734(i, i2, f25115);
        }
        m20794();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20784(int i) {
        synchronized (C7606.class) {
            f25112.remove(i);
        }
        m20794();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20799(int i) {
        synchronized (C7606.class) {
            f25115.remove(i);
        }
        m20794();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m20794() {
        C5261.m15836(new RunnableC19640(1), C7606.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20788(InterfaceC9018 interfaceC9018) {
        synchronized (C7606.class) {
            int size = interfaceC9018.size();
            ArrayList<AbstractC0148> arrayList = f25112;
            if (size == arrayList.size()) {
                C19327 c19327 = new C19327(arrayList.size());
                for (AbstractC0148 abstractC0148 : arrayList) {
                    c19327.mo13466(abstractC0148.f1127, abstractC0148);
                }
                ArrayList arrayList2 = new ArrayList(f25112.size());
                int size2 = interfaceC9018.size();
                for (int i = 0; i < size2; i++) {
                    int i2 = interfaceC9018.getInt(i);
                    AbstractC0148 abstractC0149 = (AbstractC0148) c19327.remove(i2);
                    if (abstractC0149 == null) {
                        throw new IllegalArgumentException("Unknown config id " + i2);
                    }
                    arrayList2.add(abstractC0149);
                }
                if (!c19327.isEmpty()) {
                    throw new IllegalArgumentException("Missing config ids " + c19327.keySet());
                }
                ArrayList arrayList3 = f25112;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            } else {
                throw new IllegalArgumentException("Unexpected config count " + interfaceC9018.size());
            }
        }
        m20794();
    }
}
