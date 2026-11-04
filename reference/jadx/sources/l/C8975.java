package l;

import android.content.DialogInterface;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8975 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29267;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f29268;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f29269;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C8975(AbstractActivityC17204 abstractActivityC17204, int i, IWXAPI iwxapi) {
        this.f29269 = abstractActivityC17204;
        this.f29267 = i;
        this.f29268 = iwxapi;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f29269);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        C17930 c17930 = C7484.f24760;
        String[] strArrM20533 = C7484.m20533(this.f29267, 1);
        C3076.f9994 = new RunnableC3009(0, strArrM20533);
        JSONObject jSONObject = new JSONObject(strArrM20533[0]);
        if ("OK".equals(jSONObject.getString("1"))) {
            PayReq payReq = new PayReq();
            C17930 c17931 = C3076.f9993;
            payReq.appId = C3076.m10032();
            payReq.partnerId = "1493963962";
            payReq.prepayId = jSONObject.getString("2");
            payReq.nonceStr = jSONObject.getString("3");
            payReq.timeStamp = jSONObject.getString("4");
            payReq.packageValue = jSONObject.getString("5");
            payReq.sign = jSONObject.getString("6");
            this.f29268.sendReq(payReq);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f29269.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
