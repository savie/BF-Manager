package l;

import java.util.ArrayList;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10093 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f34450 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f34451;

    public C10093(InterfaceC6025 interfaceC6025) {
        this.f34451 = interfaceC6025;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25504(C18559 c18559) {
        String strM42973;
        synchronized (this.f34451) {
            int iMax = -1;
            for (C8682 c8682 : m25502()) {
                if (c8682.f29887.equals(c18559.f59046)) {
                    iMax = Math.max(iMax, c18559.m42972(c8682.f29886));
                }
            }
            strM42973 = iMax < 0 ? c18559.m42973() : ((C17853) c18559.f59045.get(iMax)).m41444();
        }
        return strM42973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25505(final C18559 c18559, final String str, final boolean z) {
        if (c18559.f59046 == null || c18559.m42972(str) < 0) {
            return;
        }
        synchronized (this.f34451) {
            try {
                ArrayList<C8682> arrayListM25502 = m25502();
                boolean z2 = false;
                for (C8682 c8682 : arrayListM25502) {
                    if (c8682.f29887.equals(c18559.f59046) && c8682.f29886.equals(str)) {
                        z2 = true;
                    }
                }
                if (z2 || z) {
                    C9030.removeIf(arrayListM25502, new Predicate() { // from class: l.۠ۚ᩹
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C8512.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C8512.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C8682 c8683 = (C8682) obj;
                            String str2 = c8683.f29887;
                            C18559 c185510 = c18559;
                            if (!str2.equals(c185510.f59046)) {
                                return false;
                            }
                            String str3 = c8683.f29886;
                            String str4 = str;
                            if (str3.equals(str4)) {
                                return true;
                            }
                            return z && c185510.m42972(c8683.f29886) > c185510.m42972(str4);
                        }
                    });
                    arrayListM25502.add(0, new C8682(c18559.f59046, str));
                    while (arrayListM25502.size() > 64) {
                        arrayListM25502.remove(arrayListM25502.size() - 1);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (C8682 c8683 : arrayListM25502) {
                        jSONArray.put(new JSONArray().put(c8683.f29887).put(c8683.f29886));
                    }
                    try {
                        f34450.put(this.f34451, new JSONObject().put("version", 1).put("roots", jSONArray).toString());
                        C4716.f16636.execute(new RunnableC19265(0, this));
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25503(C10093 c10093) {
        synchronized (c10093.f34451) {
            String str = (String) f34450.remove(c10093.f34451);
            if (str != null) {
                c10093.f34451.edit().putString("hprt", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m25502() {
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC13783 concurrentMapC13783 = f34450;
        InterfaceC6025 interfaceC6025 = this.f34451;
        String string = (String) concurrentMapC13783.get(interfaceC6025);
        if (string == null) {
            string = interfaceC6025.getString("hprt", "");
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
                                            if (str2.equals(C18559.m42962(str2))) {
                                                C8682 c8682 = new C8682(str, str2);
                                                if (arrayList.contains(c8682)) {
                                                    continue;
                                                } else {
                                                    arrayList.add(c8682);
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
