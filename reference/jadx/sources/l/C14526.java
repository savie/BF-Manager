package l;

import bin.mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14526 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45684 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17510 f45686;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f45687;

    public C14526(InterfaceC9801 interfaceC9801) {
        this.f45686 = C17510.f56924;
        this.f45687 = interfaceC9801;
        String string = interfaceC9801.getString("smdh", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f45686 = C17510.m41127(jSONObject.getString("headers", ""), jSONObject.getBoolean("crossOrigin", false));
            } catch (RuntimeException unused) {
                this.f45685 = true;
            }
        }
        String string2 = interfaceC9801.getString("smhc", null);
        if (string2 == null) {
            return;
        }
        try {
            for (JSONObject.Member member : new JSONObject(string2)) {
                try {
                    JSONObject jSONObjectAsObject = member.getValue().asObject();
                    C17510 c17510M41127 = C17510.m41127(jSONObjectAsObject.getString("headers", ""), jSONObjectAsObject.getBoolean("crossOrigin", false));
                    this.f45685 = (this.f45684.put(member.getName(), c17510M41127) != null) | this.f45685;
                } catch (RuntimeException unused2) {
                    this.f45685 = true;
                }
            }
        } catch (RuntimeException unused3) {
            this.f45685 = true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17510 m35044(String str) {
        C17510 c17510 = (C17510) this.f45684.get(str);
        return c17510 == null ? this.f45686 : c17510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35043(String str) {
        return this.f45684.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35042(String str, C17510 c17510, boolean z) {
        LinkedHashMap linkedHashMap = this.f45684;
        if (z) {
            linkedHashMap.put(str, c17510);
        } else {
            linkedHashMap.remove(str);
            this.f45686 = c17510;
        }
        m35039();
        m35040();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35041() {
        if (m35039() || this.f45685) {
            m35040();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m35039() {
        return this.f45684.keySet().retainAll(new HashSet(Arrays.asList(this.f45687.mo7905("smur", new String[0]))));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m35040() {
        this.f45685 = false;
        InterfaceC18752 interfaceC18752Edit = this.f45687.edit();
        LinkedHashMap linkedHashMap = this.f45684;
        if (linkedHashMap.isEmpty()) {
            interfaceC18752Edit.remove("smhc");
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                C17510 c17510 = (C17510) entry.getValue();
                jSONObject.put(str, new JSONObject().put("headers", c17510.m41130()).put("crossOrigin", c17510.m41128()));
            }
            interfaceC18752Edit.putString("smhc", jSONObject.toString());
        }
        if (this.f45686.m41129().isEmpty() && !this.f45686.m41128()) {
            interfaceC18752Edit.remove("smdh");
        } else {
            C17510 c17511 = this.f45686;
            interfaceC18752Edit.putString("smdh", new JSONObject().put("headers", c17511.m41130()).put("crossOrigin", c17511.m41128()).toString());
        }
        interfaceC18752Edit.apply();
    }
}
