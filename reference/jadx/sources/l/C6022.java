package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۛ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6022 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f20585;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f20586;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final JSONArray f20587 = JSON.array();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final JSONArray f20583 = JSON.array();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20581 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f20582 = -1;

    public C6022(int i) {
        this.f20584 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17486(long j, String str) {
        JSONArray jSONArray = this.f20583;
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONValue) it.next()).asObject().getString("reason"))) {
                return;
            }
        }
        jSONArray.add(JSON.object().add("reason", str).add("line", j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray m17485() {
        JSONArray jSONArrayArray = JSON.array();
        for (C11987 c11987 : this.f20581) {
            jSONArrayArray.add(JSON.object().add("startLine", c11987.f38622).add("startColumn", c11987.f38620).add(TextBundle.TEXT_ENTRY, c11987.f38621.toString()));
        }
        return jSONArrayArray;
    }
}
