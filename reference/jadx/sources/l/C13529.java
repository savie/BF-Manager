package l;

import java.util.ArrayList;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۬֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13529 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f42993 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f42994;

    public C13529(InterfaceC9801 interfaceC9801) {
        this.f42994 = interfaceC9801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33234(C2343 c2343) {
        String strM7890;
        synchronized (this.f42994) {
            int iMax = -1;
            for (C6818 c6818 : m33232()) {
                if (c6818.f22683.equals(c2343.f7558)) {
                    iMax = Math.max(iMax, c2343.m7889(c6818.f22682));
                }
            }
            strM7890 = iMax < 0 ? c2343.m7890() : ((C9054) c2343.f7557.get(iMax)).m24189();
        }
        return strM7890;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33235(final C2343 c2343, final String str, final boolean z) {
        if (c2343.f7558 == null || c2343.m7889(str) < 0) {
            return;
        }
        synchronized (this.f42994) {
            ArrayList<C6818> arrayListM33232 = m33232();
            boolean z2 = false;
            for (C6818 c6818 : arrayListM33232) {
                if (c6818.f22683.equals(c2343.f7558) && c6818.f22682.equals(str)) {
                    z2 = true;
                }
            }
            if (z2 || z) {
                C1170.removeIf(arrayListM33232, new Predicate() { // from class: l.۠֫ܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C6818 c6819 = (C6818) obj;
                        String str2 = c6819.f22683;
                        C2343 c2344 = c2343;
                        if (!str2.equals(c2344.f7558)) {
                            return false;
                        }
                        String str3 = c6819.f22682;
                        String str4 = str;
                        if (str3.equals(str4)) {
                            return true;
                        }
                        return z && c2344.m7889(c6819.f22682) > c2344.m7889(str4);
                    }
                });
                arrayListM33232.add(0, new C6818(c2343.f7558, str));
                while (arrayListM33232.size() > 64) {
                    arrayListM33232.remove(arrayListM33232.size() - 1);
                }
                JSONArray jSONArray = new JSONArray();
                for (C6818 c6819 : arrayListM33232) {
                    jSONArray.put(new JSONArray().put(c6819.f22683).put(c6819.f22682));
                }
                try {
                    f42993.put(this.f42994, new JSONObject().put("version", 1).put("roots", jSONArray).toString());
                    C5261.f18540.execute(new RunnableC2198(2, this));
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33233(C13529 c13529) {
        synchronized (c13529.f42994) {
            String str = (String) f42993.remove(c13529.f42994);
            if (str != null) {
                c13529.f42994.edit().putString("hprt", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m33232() {
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC17249 concurrentMapC17249 = f42993;
        InterfaceC9801 interfaceC9801 = this.f42994;
        String string = (String) concurrentMapC17249.get(interfaceC9801);
        if (string == null) {
            string = interfaceC9801.getString("hprt", "");
        }
        if (!string.isEmpty() && string.length() <= 1048576) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.optInt("version") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("roots");
                    for (int i = 0; i < jSONArray.length() && arrayList.size() < 64; i++) {
                        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 2) {
                            Object objOpt = jSONArrayOptJSONArray.opt(0);
                            if (objOpt instanceof String) {
                                String str = (String) objOpt;
                                if (str.isEmpty()) {
                                    continue;
                                } else {
                                    Object objOpt2 = jSONArrayOptJSONArray.opt(1);
                                    if (objOpt2 instanceof String) {
                                        String str2 = (String) objOpt2;
                                        try {
                                            if (str2.equals(C2343.m7888(str2))) {
                                                C6818 c6818 = new C6818(str, str2);
                                                if (arrayList.contains(c6818)) {
                                                    continue;
                                                } else {
                                                    arrayList.add(c6818);
                                                }
                                            } else {
                                                continue;
                                            }
                                        } catch (IllegalArgumentException unused) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }
}
