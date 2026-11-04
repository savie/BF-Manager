package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֫۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E15S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1789 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f6107;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6108;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3280 f6106 = new C3280();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12975 f6105 = new C12975();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject m6251() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("b", this.f6106.m10817());
            jSONObject.put("e", this.f6105.m32387());
            jSONObject.put(am.aF, this.f6107);
            jSONObject.put("d", this.f6108);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m6250() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6107;
        if (i == 0) {
            sb.append(C21576.m49088(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f6106.m10815());
        } else if (i == 1) {
            sb.append(C21576.m49088(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f6106.m10815());
        } else if (i == 2) {
            sb.append(C21576.m49088(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f6105.m32385());
        }
        return sb.toString();
    }
}
