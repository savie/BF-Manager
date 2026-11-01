package l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6995 extends C5459 {
    @Override // l.C5459
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15127(WebView webView, String str) {
        C23099.m51113("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = ".concat(str));
        if (Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 7) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                String str4 = (String) arrayList.get(4);
                String str5 = (String) arrayList.get(5);
                StringBuilder sbM30515 = C12278.m30515("-->canHandleUrl, objectName: ", str2, " | methodName: ", str3, " | snStr: ");
                sbM30515.append(str4);
                C23099.m51113("openSDK_LOG.SecureJsBridge", sbM30515.toString());
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    try {
                        C23224 c23224 = new C23224(webView, Long.parseLong(str4), str5);
                        List listSubList = arrayList.subList(6, arrayList.size() - 1);
                        C23099.m51107("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str2 + " | methodName: " + str3);
                        int size = listSubList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                listSubList.set(i, C12352.decode((String) listSubList.get(i), a.D));
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                        C6310 c6310 = (C6310) this.f18825.get(str2);
                        if (c6310 != null) {
                            C23099.m51110("openSDK_LOG.SecureJsBridge", "-->handler != null");
                            c6310.m17410(str3, listSubList, c23224);
                        } else {
                            C23099.m51115("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str2);
                            c23224.mo40920();
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
