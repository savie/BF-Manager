package l;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.ܶ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16447 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53339;

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() {
        switch (this.f53339) {
            case 0:
                return C23907.m53405();
            default:
                String str = C0878.m3576((CharSequence) C21576.m49092(), (CharSequence) "canary", false) ? "wxebc3fbb7741c16ce" : "wxe5512392c6d80259";
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(C21576.m49084(), str, true);
                iwxapiCreateWXAPI.registerApp(str);
                return iwxapiCreateWXAPI;
        }
    }
}
