package l;

import android.content.res.AssetManager;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.w.a;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12210 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AssetManager f40815;

    public C12210(AssetManager assetManager) {
        this.f40815 = assetManager;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m30316(String str) {
        String strSubstring = str.startsWith("/_mt_markdown_vendor_/") ? str.substring(22) : "";
        if (!strSubstring.equals("katex.min.css") && !strSubstring.equals("katex.min.js")) {
            return C21381.m47930(404, "Not Found");
        }
        try {
            return new WebResourceResponse(strSubstring.endsWith(".js") ? "application/javascript" : "text/css", a.D, 200, "OK", C15037.m36024(), this.f40815.open("markdown-preview/".concat(strSubstring)));
        } catch (IOException unused) {
            return C21381.m47930(404, "Not Found");
        }
    }
}
