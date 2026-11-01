package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E15S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3629 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13331;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7864 f13333 = new C7864();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0807 f13332 = new C0807();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject m10731() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("b", this.f13333.m20763());
            jSONObject.put("e", this.f13332.m3379());
            jSONObject.put(am.aF, this.f13334);
            jSONObject.put("d", this.f13331);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10730() {
        StringBuilder sb = new StringBuilder();
        int i = this.f13334;
        if (i == 0) {
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f13333.m20761());
        } else if (i == 1) {
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f13333.m20761());
        } else if (i == 2) {
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f13332.m3377());
        }
        return sb.toString();
    }
}
