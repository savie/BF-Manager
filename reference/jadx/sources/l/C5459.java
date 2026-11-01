package l;

import android.net.Uri;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public class C5459 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f18825 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15126(C6310 c6310, String str) {
        this.f18825.put(str, c6310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo15127(WebView webView, String str) {
        C23099.m51107("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 6) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                List listSubList = arrayList.subList(4, arrayList.size() - 1);
                C17599 c17599 = new C17599(webView, 4L);
                C23099.m51107("openSDK_LOG.JsBridge", "getResult---objName = " + str2 + " methodName = " + str3);
                int size = listSubList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        listSubList.set(i, C12352.decode((String) listSubList.get(i), a.D));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                C6310 c6310 = (C6310) this.f18825.get(str2);
                if (c6310 != null) {
                    C23099.m51110("openSDK_LOG.JsBridge", "call----");
                    c6310.m17410(str3, listSubList, c17599);
                } else {
                    C23099.m51110("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
                    c17599.mo40920();
                }
                return true;
            }
        }
        return false;
    }
}
