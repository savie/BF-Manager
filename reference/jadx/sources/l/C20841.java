package l;

import android.net.Uri;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public class C20841 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f66733 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47660(C15619 c15619, String str) {
        this.f66733.put(str, c15619);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo47661(WebView webView, String str) {
        C21587.m49118("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 6) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                List listSubList = arrayList.subList(4, arrayList.size() - 1);
                C20095 c20095 = new C20095(webView, 4L);
                C21587.m49118("openSDK_LOG.JsBridge", "getResult---objName = " + str2 + " methodName = " + str3);
                int size = listSubList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        listSubList.set(i, C10902.decode((String) listSubList.get(i), a.D));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                C15619 c15619 = (C15619) this.f66733.get(str2);
                if (c15619 != null) {
                    C21587.m49111("openSDK_LOG.JsBridge", "call----");
                    c15619.m37368(str3, listSubList, c20095);
                } else {
                    C21587.m49111("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
                    c20095.mo42435();
                }
                return true;
            }
        }
        return false;
    }
}
