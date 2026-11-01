package l;

import bin.mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18883 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f61154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f61155 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f61156;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22411 f61157;

    public C18883(InterfaceC6025 interfaceC6025) {
        this.f61157 = C22411.f73137;
        this.f61154 = interfaceC6025;
        String string = interfaceC6025.getString("smdh", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f61157 = C22411.m49694(jSONObject.getString("headers", ""), jSONObject.getBoolean("crossOrigin", false));
            } catch (RuntimeException unused) {
                this.f61156 = true;
            }
        }
        String string2 = interfaceC6025.getString("smhc", null);
        if (string2 == null) {
            return;
        }
        try {
            for (JSONObject.Member member : new JSONObject(string2)) {
                try {
                    JSONObject jSONObjectAsObject = member.getValue().asObject();
                    C22411 c22411M49694 = C22411.m49694(jSONObjectAsObject.getString("headers", ""), jSONObjectAsObject.getBoolean("crossOrigin", false));
                    this.f61156 = (this.f61155.put(member.getName(), c22411M49694) != null) | this.f61156;
                } catch (RuntimeException unused2) {
                    this.f61156 = true;
                }
            }
        } catch (RuntimeException unused3) {
            this.f61156 = true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22411 m43559(String str) {
        C22411 c22411 = (C22411) this.f61155.get(str);
        return c22411 == null ? this.f61157 : c22411;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43558(String str) {
        return this.f61155.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43557(String str, C22411 c22411, boolean z) {
        LinkedHashMap linkedHashMap = this.f61155;
        if (z) {
            linkedHashMap.put(str, c22411);
        } else {
            linkedHashMap.remove(str);
            this.f61157 = c22411;
        }
        m43554();
        m43555();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43556() {
        if (m43554() || this.f61156) {
            m43555();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m43554() {
        return this.f61155.keySet().retainAll(new HashSet(Arrays.asList(this.f61154.mo16349("smur", new String[0]))));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43555() {
        this.f61156 = false;
        InterfaceC17314 interfaceC17314Edit = this.f61154.edit();
        LinkedHashMap linkedHashMap = this.f61155;
        if (linkedHashMap.isEmpty()) {
            interfaceC17314Edit.remove("smhc");
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                C22411 c22411 = (C22411) entry.getValue();
                jSONObject.put(str, new JSONObject().put("headers", c22411.m49697()).put("crossOrigin", c22411.m49695()));
            }
            interfaceC17314Edit.putString("smhc", jSONObject.toString());
        }
        if (this.f61157.m49696().isEmpty() && !this.f61157.m49695()) {
            interfaceC17314Edit.remove("smdh");
        } else {
            C22411 c22412 = this.f61157;
            interfaceC17314Edit.putString("smdh", new JSONObject().put("headers", c22412.m49697()).put("crossOrigin", c22412.m49695()).toString());
        }
        interfaceC17314Edit.apply();
    }
}
