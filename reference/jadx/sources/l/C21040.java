package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩷ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21040 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f68529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f68531;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f68532;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final JSONArray f68527 = JSON.array();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final JSONArray f68526 = JSON.array();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68528 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f68530 = -1;

    public C21040(int i) {
        this.f68532 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47441(long j, String str) {
        JSONArray jSONArray = this.f68526;
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONValue) it.next()).asObject().getString("reason"))) {
                return;
            }
        }
        jSONArray.add(JSON.object().add("reason", str).add("line", j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray m47440() {
        JSONArray jSONArrayArray = JSON.array();
        for (C7635 c7635 : this.f68528) {
            jSONArrayArray.add(JSON.object().add("startLine", c7635.f25207).add("startColumn", c7635.f25205).add(TextBundle.TEXT_ENTRY, c7635.f25206.toString()));
        }
        return jSONArrayArray;
    }
}
