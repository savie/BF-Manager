package l;

import android.content.res.AssetManager;
import android.net.Uri;
import android.text.Html;
import android.webkit.WebResourceResponse;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۟ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7847 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f26136 = {"index.md", "index.markdown", "index.html", "index.htm"};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0851 f26137;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f26138;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AssetManager f26139;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f26140;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f26141;

    public C7847(C0851 c0851, AssetManager assetManager, String str, boolean z) {
        this.f26137 = c0851;
        this.f26139 = assetManager;
        this.f26138 = str == null ? null : "/".concat(str);
        this.f26140 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21368(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.endsWith(".md") || lowerCase.endsWith(".markdown");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m21370(Uri uri) {
        try {
            try {
                if (this.f26141) {
                    return C0851.m3474(404, "Not Found");
                }
                String strM3481 = this.f26137.m3481(uri.getPath(), f26136);
                if (strM3481 == null) {
                    return m21367(R.string.MT_Protector);
                }
                if (!strM3481.equals(uri.getPath())) {
                    String strReplace = JSONObject.quote(uri.buildUpon().path(strM3481).query(null).fragment(null).build().toString()).replace("<", "\\u003c");
                    return m21369(200, "<!doctype html><meta charset=\"utf-8\"><script>try{var key='mt-markdown-position:'+location.pathname+location.search;if(sessionStorage.getItem('mt-markdown-link')===key){var next=document.createElement('a');next.href=" + strReplace + "+location.search;sessionStorage.setItem('mt-markdown-link','mt-markdown-position:'+next.pathname+next.search);}}catch(e){}location.replace(" + strReplace + "+location.search+location.hash)</script>");
                }
                WebResourceResponse webResourceResponseMo3477 = this.f26137.mo3477(strM3481);
                if (webResourceResponseMo3477.getStatusCode() != 200) {
                    if (webResourceResponseMo3477.getData() != null) {
                        webResourceResponseMo3477.getData().close();
                    }
                    return m21367(R.string.MT_Protector);
                }
                if (!strM3481.equals(this.f26138) && m21368(strM3481)) {
                    C13812 c13812 = new C13812();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(webResourceResponseMo3477.getData());
                    try {
                        byte[] bArr = new byte[8192];
                        bufferedInputStream.mark(8192);
                        int iM15487 = C5125.m15487(bufferedInputStream, bArr, 0, 8192);
                        bufferedInputStream.reset();
                        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, C2448.m8272(iM15487 == 0 ? C2448.f7850 : C2448.m8273(iM15487, bArr)));
                        char[] cArr = new char[4096];
                        boolean z = true;
                        while (true) {
                            int i = inputStreamReader.read(cArr);
                            if (i != -1) {
                                if (this.f26141) {
                                    throw new IOException("Markdown preview closed");
                                }
                                int i2 = (z && i > 0 && cArr[0] == 65279) ? 1 : 0;
                                c13812.m33722(-1, new String(cArr, i2, i - i2));
                                z = false;
                            } else {
                                bufferedInputStream.close();
                                StringWriter stringWriter = new StringWriter();
                                C11224.m28289(c13812, uri.getLastPathSegment(), this.f26140, this.f26139, stringWriter, C21576.m49088(R.string.MT_Protector));
                                return this.f26141 ? C0851.m3474(404, "Not Found") : m21369(200, stringWriter.toString());
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return webResourceResponseMo3477;
            } catch (C22413 unused) {
                return m21367(R.string.MT_Protector);
            }
        } catch (IOException | RuntimeException unused2) {
            return m21367(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m21367(int i) {
        return m21369(404, "<!doctype html><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C21576.m49088(i)) + "</p>");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m21369(int i, String str) {
        return new WebResourceResponse("text/html", a.D, i, i == 200 ? "OK" : "Not Found", C0851.m3475(), new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f26141 = true;
    }
}
