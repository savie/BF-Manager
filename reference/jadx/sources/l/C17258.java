package l;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6JU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17258 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16512 f56220;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC3846 f56221;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24718 f56222;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24718 f56223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19105 f56224;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f56225;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f56226;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f56227 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20956 f56228;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f56229;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f56230;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final WebView f56231;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40556(Uri uri, String str, boolean z) {
        boolean zEqualsIgnoreCase = "GET".equalsIgnoreCase(str);
        boolean z2 = !zEqualsIgnoreCase;
        if (z) {
            this.f56226 = z2;
        }
        String string = uri.toString();
        if (zEqualsIgnoreCase) {
            this.f56225.remove(string);
        } else {
            this.f56225.add(string);
            if (this.f56225.size() > 64) {
                LinkedHashSet linkedHashSet = this.f56225;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
        }
    }

    public C17258(ActivityC3846 activityC3846, WebView webView, InterfaceC16512 interfaceC16512) {
        String str = "__mtDownload" + UUID.randomUUID().toString().replace("-", "");
        this.f56229 = str;
        this.f56225 = new LinkedHashSet();
        this.f56221 = activityC3846;
        this.f56231 = webView;
        this.f56220 = interfaceC16512;
        this.f56228 = ViewOnClickListenerC11499.m28898(activityC3846.mo16524(), "html_preview_download_directory", new C5326(this));
        if (C11972.m30031("WEB_MESSAGE_LISTENER") && C11972.m30031("DOCUMENT_START_SCRIPT")) {
            try {
                InputStream inputStreamOpen = activityC3846.getAssets().open("preview/download.js");
                try {
                    String strReplace = C5125.m15490(inputStreamOpen, StandardCharsets.UTF_8).replace("__MT_DOWNLOAD_BRIDGE__", str);
                    C11646.m29279(webView, str, Collections.singleton("*"), new C11021(this));
                    this.f56224 = C11646.m29277(webView, strReplace, Collections.singleton("*"));
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new IllegalStateException("Missing HTML download script", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40557(final String str, final String str2, final String str3, final String str4, final long j) {
        boolean z;
        if (m40541()) {
            synchronized (this) {
                String scheme = Uri.parse(str).getScheme();
                z = true;
                if (a.s.equalsIgnoreCase(scheme) || b.a.equalsIgnoreCase(scheme)) {
                    z = (this.f56226 || this.f56225.contains(str)) ? false : true;
                }
            }
            if (!z) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            if (this.f56224 == null) {
                m40548(str, str2, str3, str4, j);
                return;
            }
            final String url = this.f56231.getUrl();
            this.f56231.evaluateJavascript("!!(window.__mtHtmlDownload && window.__mtHtmlDownload(" + JSONObject.quote(str) + "," + JSONObject.quote(m40520(str, str3, str4)) + "))", new ValueCallback() { // from class: l.ۙ֫ܳ
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C17258.m40523(this.f16291, url, str, str2, str3, str4, j, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40523(C17258 c17258, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        if (c17258.m40541() && "false".equals(str6) && C17359.equals(str, c17258.f56231.getUrl())) {
            c17258.m40548(str2, str3, str4, str5, j);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40548(String str, String str2, String str3, String str4, long j) {
        Uri uri = Uri.parse(str);
        if (m40536(uri)) {
            if (e.m.equalsIgnoreCase(uri.getScheme()) && str.length() > 2.34881024E7d) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            C24718 c24718 = new C24718(this, str, m40520(str, str3, str4), str2, j);
            c24718.f80023 = this.f56220.mo36187(uri);
            m40546(c24718);
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m40541() {
        if (this.f56230) {
            return false;
        }
        ActivityC3846 activityC3846 = this.f56221;
        return !activityC3846.isFinishing() && !activityC3846.isDestroyed() && this.f56223 == null && this.f56222 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40536(Uri uri) {
        String scheme = uri.getScheme();
        if (e.m.equalsIgnoreCase(scheme)) {
            return true;
        }
        if (a.s.equalsIgnoreCase(scheme) || b.a.equalsIgnoreCase(scheme)) {
            return !C1707.m6068(uri.getHost() == null ? "" : uri.getHost()) || this.f56220.mo36187(uri);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m40546(final C24718 c24718) {
        this.f56223 = c24718;
        String string = C21576.f68931.getString("hpdd", null);
        c24718.f80026 = string;
        if (string == null) {
            c24718.f80026 = C6382.m18134().m49876("download").mo4294();
        }
        ActivityC3846 activityC3846 = this.f56221;
        View viewM40395 = activityC3846.m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        final C1626 c1627 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        c24718.f80020 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c23255.mo52335((CharSequence) c24718.f80022);
        c24718.f80020.mo52335((CharSequence) c24718.f80026);
        c23255.m52333(5);
        C7893.m21433(c1626);
        c24718.f80020.m52333(6);
        C7893.m21433(c1627);
        c1627.m5759(new View.OnClickListener() { // from class: l.ᩴ֫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17258.m40537(this.f62934, c24718);
            }
        });
        C2361 c2361BuildDialog = activityC3846.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.ܳ֫ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C17258.m40553(this.f49057, c24718);
            }
        });
        final DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        c24718.f80030 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22432();
        dialogInterfaceC8327M7999.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.۫֫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17258.m40525(this.f40895, c23255, c24718, c1626, c1627, dialogInterfaceC8327M7999);
            }
        });
        c24718.f80020.setOnKeyListener(new View.OnKeyListener() { // from class: l.۟ۚܳ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    dialogInterfaceC8327M7999.m22436().performClick();
                }
                return true;
            }
        });
        c23255.requestFocus();
        c23255.mo52316(0, c24718.f80022.length() - AbstractC22044.m49832(c24718.f80022).length());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m40537(C17258 c17258, C24718 c24718) {
        if (c17258.f56222 != null) {
            return;
        }
        c17258.f56222 = c24718;
        String strTrim = c24718.f80020.m54021().toString().trim();
        try {
            C20956 c20956 = c17258.f56228;
            if (!strTrim.startsWith("/")) {
                strTrim = c24718.f80026;
            }
            c20956.m37643(0, R.string.MT_Protector, strTrim, (String) null, (String[]) null, (Bundle) null);
        } catch (RuntimeException unused) {
            c17258.f56222 = null;
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40553(C17258 c17258, C24718 c24718) {
        if (c24718.f80005) {
            return;
        }
        c17258.m40531(c24718);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40525(final C17258 c17258, C23255 c23255, final C24718 c24718, C1626 c1626, C1626 c1627, DialogInterfaceC8327 dialogInterfaceC8327) {
        String strTrim = c23255.m54021().toString().trim();
        String strTrim2 = c24718.f80020.m54021().toString().trim();
        if (!C5436.m16169(strTrim)) {
            c1626.m5768(c17258.f56221.getString(R.string.MT_Protector));
            c23255.requestFocus();
            return;
        }
        if (strTrim2.startsWith("/")) {
            for (int i = 0; i < strTrim2.length(); i++) {
                char cCharAt = strTrim2.charAt(i);
                if (cCharAt >= ' ' && cCharAt != 127) {
                }
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strTrim2, new String[0]);
            if (!abstractC22044M35193.mo2934() || abstractC22044M35193.mo4281()) {
                c24718.f80022 = strTrim;
                c24718.f80026 = strTrim2;
                C21576.f68931.edit().putString("hpdd", strTrim2).apply();
                c24718.f80005 = true;
                dialogInterfaceC8327.dismiss();
                String strM35186 = C14584.m35186(c24718.f80026);
                if (strM35186 == null) {
                    strM35186 = C14584.m35214(c24718.f80026) ? "/" : c24718.f80026;
                }
                C12765 c12765 = new C12765(c17258.f56221);
                c12765.m31643(C21576.m49075(R.string.MT_Protector));
                c12765.m31641(strM35186);
                c12765.m31635(new Runnable() { // from class: l.֨ۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3519.m40531(c24718);
                    }
                });
                c12765.m31632(R.string.MT_Protector, new View.OnClickListener() { // from class: l.ۡۚܳ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c24718.f80008.m31630();
                    }
                });
                c12765.m31640();
                c24718.f80008 = c12765;
                c12765.m31639(c24718.f80022);
                if (c24718.f80028 >= 0) {
                    c17258.m40533(c24718, 0L, c24718.f80028, 0L);
                }
                c24718.f80024.m31997();
                c17258.f56227.execute(new Runnable() { // from class: l.ۖۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17258.m40518(this.f7872, c24718);
                    }
                });
                return;
            }
        }
        c1627.m5768(c17258.f56221.getString(R.string.MT_Protector));
        c24718.f80020.requestFocus();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40518(final C17258 c17258, final C24718 c24718) {
        try {
            m40551(c24718);
            c24718.f80018 = new C5436(C14584.m35193(c24718.f80026, new String[0]), c24718.f80022);
            m40551(c24718);
            if (c24718.f80007) {
                C21576.m49068(new Runnable() { // from class: l.۠ۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17258.m40544(this.f27574, c24718);
                    }
                });
                return;
            }
            c17258.m40554(c24718);
            m40551(c24718);
            C21576.m49068(new RunnableC9909(c17258, c24718, c24718.f80018.m16173()));
        } catch (Exception unused) {
            c17258.m40540(c24718);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m40544(C17258 c17258, C24718 c24718) {
        if (c17258.f56223 != c24718 || c24718.f80010) {
            return;
        }
        AbstractC21976 abstractC21976 = c24718.f80032;
        if (abstractC21976 != null) {
            c17258.m40530(abstractC21976, c24718.f80033, "read");
        }
        C21576.m49077().removeCallbacks(c24718.f80025);
        C21576.m49077().postDelayed(c24718.f80025, 30000L);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m40554(C24718 c24718) throws IOException {
        Uri uri = Uri.parse(c24718.f80014);
        if (c24718.f80023) {
            WebResourceResponse webResourceResponseMo36186 = this.f56220.mo36186(uri);
            if (webResourceResponseMo36186.getStatusCode() != 200) {
                throw new IOException("Preview download unavailable");
            }
            InputStream data = webResourceResponseMo36186.getData();
            try {
                c24718.f80031 = data;
                try {
                    m40534(c24718, data);
                    c24718.f80031 = null;
                    data.close();
                    return;
                } catch (Throwable th) {
                    c24718.f80031 = null;
                    throw th;
                }
            } catch (Throwable th2) {
                if (data != null) {
                    try {
                        data.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (e.m.equalsIgnoreCase(uri.getScheme())) {
            String strSubstring = c24718.f80014;
            int iIndexOf = strSubstring.indexOf(35);
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            int iIndexOf2 = strSubstring.indexOf(44);
            if (iIndexOf2 < 0 || strSubstring.length() > 2.34881024E7d) {
                throw new IOException("Invalid data download");
            }
            String strSubstring2 = strSubstring.substring(0, iIndexOf2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                iIndexOf2++;
                if (iIndexOf2 < strSubstring.length()) {
                    char cCharAt = strSubstring.charAt(iIndexOf2);
                    if (cCharAt == '%') {
                        int i = iIndexOf2 + 2;
                        if (i >= strSubstring.length()) {
                            throw new IOException("Invalid percent escape");
                        }
                        int iDigit = Character.digit(strSubstring.charAt(iIndexOf2 + 1), 16);
                        int iDigit2 = Character.digit(strSubstring.charAt(i), 16);
                        if (iDigit < 0 || iDigit2 < 0) {
                            throw new IOException("Invalid percent escape");
                        }
                        byteArrayOutputStream.write((iDigit << 4) | iDigit2);
                        iIndexOf2 = i;
                    } else if (cCharAt < 128) {
                        byteArrayOutputStream.write(cCharAt);
                    } else {
                        int iCodePointAt = strSubstring.codePointAt(iIndexOf2);
                        byte[] bytes = new String(Character.toChars(iCodePointAt)).getBytes(StandardCharsets.UTF_8);
                        byteArrayOutputStream.write(bytes, 0, bytes.length);
                        iIndexOf2 += Character.charCount(iCodePointAt) - 1;
                    }
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (strSubstring2.toLowerCase(Locale.ROOT).endsWith(";base64")) {
                        for (byte b : byteArray) {
                            int i2 = b & 255;
                            if ((i2 < 65 || i2 > 90) && ((i2 < 97 || i2 > 122) && !((i2 >= 48 && i2 <= 57) || i2 == 43 || i2 == 47 || i2 == 61 || i2 == 32 || i2 == 10 || i2 == 13 || i2 == 9))) {
                                throw new IOException("Invalid base64 data");
                            }
                        }
                        try {
                            byteArray = Base64.decode(byteArray, 0);
                        } catch (IllegalArgumentException e) {
                            throw new IOException("Invalid base64 data", e);
                        }
                    }
                    if (byteArray.length <= 16777216) {
                        c24718.f80028 = byteArray.length;
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                        try {
                            m40534(c24718, byteArrayInputStream);
                            byteArrayInputStream.close();
                            return;
                        } catch (Throwable th4) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                    throw new IOException("Data download too large");
                }
            } while (byteArrayOutputStream.size() <= 2.34881024E7d);
            throw new IOException("Data download too large");
        }
        c24718.f80016 = new C1707();
        if (c24718.f80010) {
            c24718.f80016.m6070();
        }
        C9444 c9444M6069 = c24718.f80016.m6069(c24718.f80014, c24718.f80006, c24718.f80021);
        try {
            AbstractC8699 abstractC8699M24818 = c9444M6069.m24818();
            if (abstractC8699M24818 == null) {
                throw new IOException("Missing download response body");
            }
            c24718.f80028 = abstractC8699M24818.mo9079();
            InputStream inputStreamM23391 = abstractC8699M24818.m23391();
            try {
                m40534(c24718, inputStreamM23391);
                inputStreamM23391.close();
                c9444M6069.close();
            } catch (Throwable th6) {
                try {
                    inputStreamM23391.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (Throwable th8) {
            try {
                c9444M6069.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40534(final C24718 c24718, InputStream inputStream) throws IOException {
        C21576.m49068(new Runnable() { // from class: l.ۜۚܳ
            @Override // java.lang.Runnable
            public final void run() {
                C17258 c17258 = this.f22933;
                C24718 c24719 = c24718;
                c17258.m40533(c24719, c24719.f80012.get(), c24719.f80028, c24719.f80015);
            }
        });
        byte[] bArr = new byte[65536];
        while (true) {
            m40551(c24718);
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            c24718.f80018.m16171(i, bArr);
            c24718.f80012.addAndGet(i);
            m40532(c24718, i);
        }
        if (c24718.f80028 >= 0 && c24718.f80012.get() != c24718.f80028) {
            throw new IOException("Incomplete download");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40532(C24718 c24718, int i) {
        c24718.f80024.m31995(i);
        c24718.f80015 = c24718.f80024.m31994();
        if (c24718.f80027.compareAndSet(false, true)) {
            C21576.m49077().postDelayed(c24718.f80017, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40533(C24718 c24718, long j, long j2, long j3) {
        String strM22390;
        if (this.f56223 != c24718 || c24718.f80010 || this.f56230) {
            return;
        }
        c24718.f80008.m31637(j2 < 0);
        c24718.f80008.m31645(j2 < 0 ? R.string.MT_Protector : R.string.MT_Protector);
        C12765 c12765 = c24718.f80008;
        if (j2 < 0) {
            strM22390 = C8311.m22390(j);
        } else {
            strM22390 = C8311.m22390(Math.max(0L, j2 - j)) + "/" + C8311.m22390(j2);
        }
        c12765.m31647(strM22390);
        c24718.f80008.m31633(j3);
        if (j2 >= 0) {
            c24718.f80008.m31631(j2 != 0 ? (int) Math.min(100.0d, (j * 100.0d) / j2) : 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40524(final C17258 c17258, C22089 c22089, Uri uri, boolean z, C7918 c7918) {
        String url;
        int port;
        String strM49906;
        AbstractC21976 abstractC21976;
        if (c17258.f56230 || !z || (url = c17258.f56231.getUrl()) == null) {
            return;
        }
        Uri uri2 = Uri.parse(url);
        if ((a.s.equalsIgnoreCase(uri.getScheme()) || b.a.equalsIgnoreCase(uri.getScheme())) && uri.getScheme().equalsIgnoreCase(uri2.getScheme()) && uri.getHost() != null && uri.getHost().equalsIgnoreCase(uri2.getHost())) {
            int port2 = 443;
            if (uri.getPort() != -1) {
                port = uri.getPort();
            } else {
                port = b.a.equalsIgnoreCase(uri.getScheme()) ? 443 : 80;
            }
            if (uri2.getPort() != -1) {
                port2 = uri2.getPort();
            } else if (!b.a.equalsIgnoreCase(uri2.getScheme())) {
                port2 = 80;
            }
            if (port != port2 || c22089.m49907() != 0 || (strM49906 = c22089.m49906()) == null || strM49906.length() > 98304) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM49906);
                String string = jSONObject.getString("type");
                String strOptString = jSONObject.optString("id");
                if (strOptString.length() > 80) {
                    return;
                }
                if (string.equals("offer")) {
                    if (!c17258.m40541()) {
                        c17258.m40530(c7918, strOptString, "cancel");
                        return;
                    }
                    String string2 = jSONObject.getString("url");
                    boolean z2 = string2.equals("blob:") || string2.equals("data:");
                    if (!z2 && !c17258.m40536(Uri.parse(string2))) {
                        c17258.m40530(c7918, strOptString, "cancel");
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    long j = jSONObject.getLong("size");
                    if (z2 && (j < 0 || (string2.equals("data:") && j > 16777216))) {
                        c17258.m40530(c7918, strOptString, "cancel");
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    String strM40519 = m40519(jSONObject.optString("name"));
                    if (strM40519.isEmpty()) {
                        strM40519 = m40520(string2, (String) null, jSONObject.optString("mime"));
                    }
                    C24718 c24718 = new C24718(c17258, string2, strM40519, c17258.f56231.getSettings().getUserAgentString(), j);
                    c24718.f80033 = strOptString;
                    c24718.f80032 = c7918;
                    c24718.f80007 = z2;
                    c24718.f80023 = z2 || c17258.f56220.mo36187(Uri.parse(string2));
                    c17258.m40546(c24718);
                    if (z2 || (abstractC21976 = c24718.f80032) == null) {
                        return;
                    }
                    c17258.m40530(abstractC21976, c24718.f80033, "cancel");
                    return;
                }
                if (string.equals("large")) {
                    if (c17258.f56223 == null) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    return;
                }
                final C24718 c24719 = c17258.f56223;
                if (c24719 == null && string.equals(d.O)) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                if (c24719 != null && c24719.f80007 && strOptString.equals(c24719.f80033) && c7918 == c24719.f80032 && !c24719.f80010) {
                    if (!string.equals(d.O)) {
                        if (c24719.f80005 && !c24719.f80029 && jSONObject.getInt("seq") == c24719.f80019) {
                            c24719.f80029 = true;
                            C21576.m49077().removeCallbacks(c24719.f80025);
                            if (string.equals("chunk")) {
                                final String string3 = jSONObject.getString(e.m);
                                c24719.f80019++;
                                c17258.f56227.execute(new Runnable() { // from class: l.ۤ֫ܳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C17258.m40528(this.f33522, c24719, string3);
                                    }
                                });
                                return;
                            } else if (string.equals("end")) {
                                c17258.f56227.execute(new Runnable() { // from class: l.᩸֫ܳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C17258.m40549(this.f72763, c24719);
                                    }
                                });
                                return;
                            } else {
                                c24719.f80009 = true;
                                c17258.m40531(c24719);
                                return;
                            }
                        }
                        return;
                    }
                    c24719.f80009 = true;
                    c17258.m40531(c24719);
                }
            } catch (Exception unused) {
                C24718 c247110 = c17258.f56223;
                if (c247110 == null || !c247110.f80007) {
                    return;
                }
                c247110.f80009 = true;
                c17258.m40531(c247110);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40528(final C17258 c17258, final C24718 c24718, String str) {
        try {
            m40551(c24718);
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 || bArrDecode.length > 49152 || bArrDecode.length > c24718.f80028 - c24718.f80012.get()) {
                throw new IOException("Invalid download chunk");
            }
            c24718.f80018.m16171(bArrDecode.length, bArrDecode);
            c24718.f80012.addAndGet(bArrDecode.length);
            m40532(c24718, bArrDecode.length);
            C21576.m49068(new Runnable() { // from class: l.ᩳۚܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C17258.m40526(this.f61240, c24718);
                }
            });
        } catch (Exception unused) {
            c17258.m40540(c24718);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40526(C17258 c17258, C24718 c24718) {
        if (c17258.f56223 != c24718 || c24718.f80010) {
            return;
        }
        c24718.f80029 = false;
        AbstractC21976 abstractC21976 = c24718.f80032;
        if (abstractC21976 != null) {
            c17258.m40530(abstractC21976, c24718.f80033, "read");
        }
        C21576.m49077().removeCallbacks(c24718.f80025);
        C21576.m49077().postDelayed(c24718.f80025, 30000L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40549(C17258 c17258, C24718 c24718) {
        try {
            if (c24718.f80012.get() == c24718.f80028) {
                m40551(c24718);
                C21576.m49068(new RunnableC9909(c17258, c24718, c24718.f80018.m16173()));
                return;
            }
            throw new IOException("Incomplete generated download");
        } catch (Exception unused) {
            c17258.m40540(c24718);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40542(C17258 c17258, C24718 c24718) {
        c24718.f80009 = true;
        c17258.m40531(c24718);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40531(final C24718 c24718) {
        if (c24718.f80010) {
            return;
        }
        c24718.f80010 = true;
        c24718.f80024.m31996();
        C21576.m49077().removeCallbacks(c24718.f80017);
        C21576.m49077().removeCallbacks(c24718.f80025);
        AbstractC21976 abstractC21976 = c24718.f80032;
        if (abstractC21976 != null) {
            m40530(abstractC21976, c24718.f80033, "cancel");
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = c24718.f80030;
        if (dialogInterfaceC8327 != null) {
            dialogInterfaceC8327.dismiss();
        }
        C12765 c12765 = c24718.f80008;
        if (c12765 != null) {
            c12765.m31644();
        }
        C1707 c1707 = c24718.f80016;
        if (c1707 != null) {
            c1707.m6070();
        }
        InputStream inputStream = c24718.f80031;
        if (inputStream != null) {
            C5261.f18538.execute(new RunnableC5458(2, inputStream));
        }
        this.f56227.execute(new Runnable() { // from class: l.۬ۚܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f43302.m40540(c24718);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40551(C24718 c24718) throws IOException {
        if (c24718.f80010) {
            throw new IOException("Download canceled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m40540(final C24718 c24718) {
        final String strMo4294;
        if (c24718.f80011) {
            return;
        }
        c24718.f80011 = true;
        C5436 c5436 = c24718.f80018;
        if (c5436 != null) {
            try {
                c5436.m16170();
            } catch (IOException unused) {
            }
            AbstractC22044 abstractC22044M16172 = c24718.f80018.m16172();
            if (abstractC22044M16172 != null) {
                strMo4294 = abstractC22044M16172.mo4294();
            } else {
                strMo4294 = null;
            }
        } else {
            strMo4294 = null;
        }
        C21576.m49068(new Runnable() { // from class: l.᩷֫ܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f69339.m40535(c24718, (String) null, strMo4294);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40535(C24718 c24718, String str, String str2) {
        if (this.f56223 != c24718) {
            return;
        }
        this.f56223 = null;
        c24718.f80024.m31996();
        C21576.m49077().removeCallbacks(c24718.f80017);
        C21576.m49077().removeCallbacks(c24718.f80025);
        AbstractC21976 abstractC21976 = c24718.f80032;
        if (abstractC21976 != null) {
            m40530(abstractC21976, c24718.f80033, "cancel");
        }
        C12765 c12765 = c24718.f80008;
        if (c12765 != null) {
            c12765.m31644();
        }
        if (this.f56230 || this.f56221.isFinishing() || this.f56221.isDestroyed()) {
            return;
        }
        if (str != null) {
            C2361 c2361BuildDialog = this.f56221.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(this.f56221.getString(R.string.MT_Protector, str));
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10029(2, this, str));
            c2361BuildDialog.m8016();
            return;
        }
        if (str2 != null) {
            C2361 c2361BuildDialog2 = this.f56221.buildDialog();
            c2361BuildDialog2.m8021(R.string.MT_Protector);
            c2361BuildDialog2.m8008(this.f56221.getString(R.string.MT_Protector, str2));
            c2361BuildDialog2.m8026(R.string.MT_Protector, null);
            c2361BuildDialog2.m8016();
            return;
        }
        if (!c24718.f80010 || c24718.f80009) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40530(AbstractC21976 abstractC21976, String str, String str2) {
        if (!this.f56230 && C11972.m30031("WEB_MESSAGE_LISTENER")) {
            try {
                abstractC21976.mo21458("{\"id\":" + JSONObject.quote(str) + ",\"type\":" + JSONObject.quote(str2) + l.d);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40558() {
        C24718 c24718 = this.f56223;
        if (c24718 != null) {
            if (!c24718.f80005 || c24718.f80023) {
                m40531(c24718);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40555() {
        if (this.f56230) {
            return;
        }
        C24718 c24718 = this.f56223;
        if (c24718 != null) {
            m40531(c24718);
        }
        this.f56230 = true;
        this.f56228.m37642();
        C19105 c19105 = this.f56224;
        if (c19105 != null) {
            if (C11972.m30031("DOCUMENT_START_SCRIPT")) {
                c19105.m44225();
            }
            if (C11972.m30031("WEB_MESSAGE_LISTENER")) {
                C11646.m29278(this.f56231, this.f56229);
            }
        }
        this.f56227.shutdown();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40520(String str, String str2, String str3) {
        if (str.startsWith("data:") || str.startsWith("blob:")) {
            str = "download";
        }
        String strM40519 = m40519(C4935.m15144(str, str2, str3));
        return strM40519.isEmpty() ? "download" : strM40519;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40519(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (iCodePointAt < 32 || iCodePointAt == 127 || iCodePointAt == 47 || iCodePointAt == 92) {
                iCodePointAt = 95;
            }
            if (iCodePointAt < 128) {
                i = 1;
            } else if (iCodePointAt < 2048) {
                i = 2;
            } else {
                i = iCodePointAt < 65536 ? 3 : 4;
            }
            i2 += i;
            if (i2 > 180) {
                break;
            }
            sb.appendCodePoint(iCodePointAt);
        }
        String strTrim = sb.toString().trim();
        return (strTrim.equals(".") || strTrim.equals("..")) ? "" : strTrim;
    }
}
