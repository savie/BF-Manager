package l;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S78W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1299 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences f5566;

    public C1299() {
        this(C16737.m39277());
    }

    public C1299(Application application) {
        this.f5566 = application.getSharedPreferences("remote_auth", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m4643() {
        String string = this.f5566.getString("trusted_devices_json", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObjectM32822 = C13316.m32822(string);
            if (C13316.m32830(jSONObjectM32822, "version") != 2) {
                m4641();
                return new ArrayList();
            }
            try {
                JSONArray jSONArray = jSONObjectM32822.getJSONArray("devices");
                if (jSONArray == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    C22467 c22467M4640 = m4640(jSONArray, i);
                    if (c22467M4640 != null) {
                        arrayList.add(c22467M4640);
                    }
                }
                return arrayList;
            } catch (RuntimeException e) {
                throw C13316.m32827(e);
            }
        } catch (C1320 unused) {
            m4641();
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4644(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22467 c22467 = (C22467) it.next();
            jSONArray.add(new JSONObject().add("deviceId", c22467.f73344).add("deviceName", c22467.f73348).add("publicKey", c22467.f73349).add("firstAccessAt", c22467.f73346).add("lastAccessAt", c22467.f73343).add("lastIp", c22467.f73345).add("userAgent", c22467.f73347).add("temporary", c22467.f73342));
        }
        jSONObject.add("version", 2);
        jSONObject.add("devices", jSONArray);
        this.f5566.edit().putString("trusted_devices_json", jSONObject.toString()).apply();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m4641() {
        this.f5566.edit().putString("trusted_devices_json", new JSONObject().add("version", 2).add("devices", new JSONArray()).toString()).commit();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4645(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayListM4643 = m4643();
        boolean zRemoveIf = C9030.removeIf(arrayListM4643, new Predicate() { // from class: l.ۚᩴۜ
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
                return str.equals(((C22467) obj).f73344);
            }
        });
        if (zRemoveIf) {
            m4644(arrayListM4643);
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m4642(ArrayList arrayList) {
        C23846.sort(arrayList, C21023.reversed(C7618.comparingLong(new C2710())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22467 m4640(JSONArray jSONArray, int i) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C22467 c22467 = new C22467();
            String strM32829 = C13316.m32829(jSONObject, "deviceId");
            c22467.f73344 = strM32829;
            if (TextUtils.isEmpty(strM32829)) {
                return null;
            }
            c22467.f73348 = C13316.m32829(jSONObject, "deviceName");
            c22467.f73349 = C13316.m32829(jSONObject, "publicKey");
            c22467.f73346 = C13316.m32830(jSONObject, "firstAccessAt");
            c22467.f73343 = C13316.m32830(jSONObject, "lastAccessAt");
            c22467.f73345 = C13316.m32829(jSONObject, "lastIp");
            c22467.f73347 = C13316.m32829(jSONObject, "userAgent");
            c22467.f73342 = false;
            return c22467;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11884 m4639(C22467 c22467) {
        return new C11884(c22467.f73344, c22467.f73348, c22467.f73346, c22467.f73343, c22467.f73345, c22467.f73347, c22467.f73342);
    }
}
