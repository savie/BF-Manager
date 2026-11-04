package l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21258 extends C20841 {
    @Override // l.C20841
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo47661(WebView webView, String str) {
        C21587.m49113("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = ".concat(str));
        if (Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 7) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                String str4 = (String) arrayList.get(4);
                String str5 = (String) arrayList.get(5);
                StringBuilder sbM10406 = C3188.m10406("-->canHandleUrl, objectName: ", str2, " | methodName: ", str3, " | snStr: ");
                sbM10406.append(str4);
                C21587.m49113("openSDK_LOG.SecureJsBridge", sbM10406.toString());
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    try {
                        C18274 c18274 = new C18274(webView, Long.parseLong(str4), str5);
                        List listSubList = arrayList.subList(6, arrayList.size() - 1);
                        C21587.m49118("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str2 + " | methodName: " + str3);
                        int size = listSubList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                listSubList.set(i, C10902.decode((String) listSubList.get(i), a.D));
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                        C15619 c15619 = (C15619) this.f66733.get(str2);
                        if (c15619 != null) {
                            C21587.m49111("openSDK_LOG.SecureJsBridge", "-->handler != null");
                            c15619.m37368(str3, listSubList, c18274);
                        } else {
                            C21587.m49116("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str2);
                            c18274.mo42435();
                        }
                        return true;
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return false;
    }
}
