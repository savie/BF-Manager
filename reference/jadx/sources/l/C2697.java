package l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.WebView;
import com.alipay.sdk.m.u0.b;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: renamed from: l.ۖ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 96IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C2697 implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f8575;

    public /* synthetic */ C2697(Object obj) {
        this.f8575 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m8864(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else if (i == 2) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        } else {
            if (i != 4) {
                uri2 = null;
            } else {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
            }
            cursorQuery = ((Context) this.f8575).getContentResolver().query(uri2, null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(b.d)) : null;
                cursorQuery.close();
            }
            return string;
        }
        uri2 = uri;
        cursorQuery = ((Context) this.f8575).getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        C22089 c22089;
        C22089 c220810;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C8372.m22531(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        AbstractC11528[] abstractC11528Arr = new AbstractC11528[ports.length];
        for (int i = 0; i < ports.length; i++) {
            abstractC11528Arr[i] = new C8663(ports[i]);
        }
        if (C19580.f63138.mo27117()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C8372.m22531(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    c220810 = null;
                } else {
                    c22089 = new C22089(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (c220810 != null) {
                    JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C8372.m22531(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    C17258.m40524((C17258) ((C11021) this.f8575).f34801, c220810, uri, z, (C7918) jsReplyProxyBoundaryInterface.getOrCreatePeer(new CallableC4407(1, jsReplyProxyBoundaryInterface)));
                }
            }
            c22089 = new C22089(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            c22089 = new C22089(webMessageBoundaryInterface.getData());
        }
        c220810 = c22089;
        if (c220810 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) C8372.m22531(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            C17258.m40524((C17258) ((C11021) this.f8575).f34801, c220810, uri, z, (C7918) jsReplyProxyBoundaryInterface2.getOrCreatePeer(new CallableC4407(1, jsReplyProxyBoundaryInterface2)));
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }
}
