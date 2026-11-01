package l;

import android.content.DialogInterface;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0796 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f3383;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3384;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f3385;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    public C0796(AbstractActivityC12483 abstractActivityC12483, int i, IWXAPI iwxapi) {
        this.f3385 = abstractActivityC12483;
        this.f3384 = i;
        this.f3383 = iwxapi;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f3385);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        C9186 c9186 = C12792.f42615;
        String[] strArrM31774 = C12792.m31774(this.f3384, 1);
        C20364.f65940 = new RunnableC17895(1, strArrM31774);
        JSONObject jSONObject = new JSONObject(strArrM31774[0]);
        if ("OK".equals(jSONObject.getString("1"))) {
            PayReq payReq = new PayReq();
            C9186 c9187 = C20364.f65938;
            payReq.appId = C20364.m45945();
            payReq.partnerId = "1493963962";
            payReq.prepayId = jSONObject.getString("2");
            payReq.nonceStr = jSONObject.getString("3");
            payReq.timeStamp = jSONObject.getString("4");
            payReq.packageValue = jSONObject.getString("5");
            payReq.sign = jSONObject.getString("6");
            this.f3383.sendReq(payReq);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f3385.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
