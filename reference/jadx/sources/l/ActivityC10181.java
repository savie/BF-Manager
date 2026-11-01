package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC10181 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public static final C8064 f34767;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public static final int f34768;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public static final C8064 f34769;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public static final int f34770;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f34771;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f34772;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C8770 f34773;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f34774;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C10024 f34775;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f34776;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f34777;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public FrameLayout f34778;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C22087 f34779;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public View f34780;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public boolean f34783;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public FrameLayout f34784;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f34785;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC0302 f34786;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public TextView f34787;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C12210 f34788;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f34789;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public String f34790;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public WebView f34791;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C18647 f34792;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C16195 f34793;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public C19353 f34794;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C21381 f34795;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public ProgressBar f34796;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f34797;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f34798;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f34799;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public int f34800 = 100;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public volatile C8064 f34781 = f34767;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final Object f34782 = new Object();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "HtmlPreviewActivity";
    }

    static {
        int[] iArr = {25, 33, 50, 67, 75, 80, 90, 100, UMErrorCode.E_UM_BE_JSON_FAILED, q.h, 150, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 200, 250, 300, 400, 500};
        f34771 = iArr;
        f34768 = iArr[0];
        f34770 = iArr[16];
        f34772 = new ConcurrentMapC13783();
        f34767 = new C8064(false, null);
        f34769 = new C8064(true, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25941(C11545 c11545, final InterfaceC2557 interfaceC2557, C18559 c18559, String str, final RunnableC10716 runnableC10716) {
        m25930(c11545.m28824(), c11545.m28827(), interfaceC2557, c18559, str, C18559.m42968(c11545), new Runnable() { // from class: l.۬ۡۘ
            @Override // java.lang.Runnable
            public final void run() {
                C8064 c8064 = ActivityC10181.f34767;
                C6936.m18602(interfaceC2557, 2000);
                runnableC10716.run();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25929(ShortcutActivity shortcutActivity, String str) {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        if (!abstractC20745M15313.mo33971()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C21611 c21611 = C21611.f70098;
        InterfaceC2557 interfaceC2557Mo10264 = c21611.mo10264(abstractC20745M15313.mo33986());
        if (interfaceC2557Mo10264 == null) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        final C18559 c18559M42971 = C18559.m42971(abstractC20745M15313.mo33986());
        final C10093 c10093 = new C10093(C16737.f53607);
        final String strM25504 = c10093.m25504(c18559M42971);
        m25930(shortcutActivity, c21611, interfaceC2557Mo10264, c18559M42971, strM25504, Collections.EMPTY_LIST, new Runnable() { // from class: l.ۘۡۘ
            @Override // java.lang.Runnable
            public final void run() {
                C8064 c8064 = ActivityC10181.f34767;
                c10093.m25505(c18559M42971, strM25504, false);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25924(Activity activity, String str, String str2, boolean z, AbstractC20745 abstractC20745) {
        m25925(activity, str, str2, z, abstractC20745, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25923(Activity activity, String str, String str2, AbstractC20745 abstractC20745, int i) {
        m25925(activity, str, str2, false, abstractC20745, Math.max(0, i));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25925(Activity activity, String str, String str2, boolean z, AbstractC20745 abstractC20745, int i) {
        AbstractC20745 abstractC20745M15313;
        String strM42974;
        String name;
        String str3;
        String strM32003;
        Runnable runnable = null;
        if (str == null) {
            abstractC20745M15313 = null;
        } else {
            try {
                abstractC20745M15313 = C5553.m15313(str, new String[0]);
            } catch (RuntimeException unused) {
                abstractC20745.mo24647();
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        }
        String parent = abstractC20745M15313 == null ? null : abstractC20745M15313.getParent();
        String str4 = "/";
        if (parent == null || !parent.startsWith("/")) {
            parent = null;
        } else if (!parent.endsWith("/")) {
            parent = parent.concat("/");
        }
        boolean z2 = parent != null;
        if (z2) {
            if (z || i >= 0) {
                name = abstractC20745M15313.getName();
                str3 = parent;
            } else {
                final C18559 c18559M42971 = C18559.m42971(abstractC20745M15313.mo33986());
                String strM42973 = c18559M42971.m42973();
                if (C5553.m15319(strM42973, C11904.f39941.mo33986()) || C5553.m15319(strM42973, C11904.f39940.mo33986()) || C5553.m15319(strM42973, C11904.f39937.mo33986())) {
                    str4 = strM42973;
                } else {
                    final C10093 c10093 = new C10093(C16737.f53607);
                    final String strM25504 = c10093.m25504(c18559M42971);
                    str4 = strM25504;
                    runnable = new Runnable() { // from class: l.ۢ᩵ۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8064 c8064 = ActivityC10181.f34767;
                            c10093.m25505(c18559M42971, strM25504, false);
                        }
                    };
                }
                strM42974 = c18559M42971.m42974(str4);
            }
            strM32003 = C12915.m32003(str3, name);
            if (strM32003 != null) {
                throw new IllegalArgumentException("Invalid HTML preview path");
            }
            C8770 c8770 = new C8770(C21611.f70098, str3, name, strM32003, str2, true, z, abstractC20745, z2);
            c8770.f30176 = i;
            m25926(activity, c8770, runnable);
        }
        strM42974 = "index.html";
        name = strM42974;
        str3 = str4;
        strM32003 = C12915.m32003(str3, name);
        if (strM32003 != null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        C8770 c8771 = new C8770(C21611.f70098, str3, name, strM32003, str2, true, z, abstractC20745, z2);
        c8771.f30176 = i;
        m25926(activity, c8771, runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25930(ActivityC4866 activityC4866, AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557, C18559 c18559, String str, List list, Runnable runnable) {
        Object obj;
        AbstractC9677 abstractC9677M35094;
        boolean zEquals = "local".equals(abstractC9677.mo15077());
        if (!(abstractC9677 instanceof C21611) && !(abstractC9677 instanceof AbstractC12233) && !(abstractC9677 instanceof C8289) && !(abstractC9677 instanceof C5445) && !(abstractC9677 instanceof C21920)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC11462.m28611(((Long) it.next()).longValue());
            }
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        AbstractC9677 abstractC9678 = null;
        try {
            if (zEquals) {
                abstractC9677M35094 = C21611.f70098;
            } else {
                abstractC9677M35094 = C14616.m35094(abstractC9677.m24619(), true);
            }
            abstractC9678 = abstractC9677M35094;
            String strM42974 = c18559.m42974(str);
            String strM32003 = C12915.m32003(str, strM42974);
            try {
                if (strM32003 == null) {
                    throw new IllegalArgumentException("Invalid HTML preview path");
                }
                C8770 c8770 = new C8770(abstractC9678, str, strM42974, strM32003, interfaceC2557.getName(), zEquals, "multipart/related".equals(C10010.m25285(interfaceC2557.getName())), null, true);
                c8770.f30175 = list;
                m25926(activityC4866, c8770, runnable);
                return;
            } catch (RuntimeException unused) {
                obj = abstractC9678;
            }
        } catch (RuntimeException unused2) {
            obj = abstractC9678;
        }
        if (obj instanceof AutoCloseable) {
            try {
                C9023.m23359((AutoCloseable) obj);
            } catch (Exception unused3) {
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC11462.m28611(((Long) it2.next()).longValue());
        }
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25926(Activity activity, final C8770 c8770, Runnable runnable) {
        final String string = UUID.randomUUID().toString();
        ConcurrentMapC13783 concurrentMapC13783 = f34772;
        concurrentMapC13783.put(string, c8770);
        C16737.m39278().postDelayed(new Runnable() { // from class: l.֫᩵ۘ
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC10181.m25932(c8770, string);
            }
        }, 60000L);
        Intent intent = new Intent(activity, (Class<?>) ActivityC10181.class);
        intent.putExtra("session_token", string);
        try {
            activity.startActivity(intent);
            if (runnable != null) {
                runnable.run();
            }
        } catch (RuntimeException unused) {
            if (concurrentMapC13783.remove(string, c8770)) {
                c8770.close();
            }
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25932(C8770 c8770, String str) {
        if (c8770.f30180 || !f34772.remove(str, c8770)) {
            return;
        }
        c8770.close();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uriM32000;
        C8064 c8064;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("session_token");
        this.f34790 = stringExtra;
        C8770 c8770 = stringExtra == null ? null : (C8770) f34772.get(stringExtra);
        this.f34773 = c8770;
        if (c8770 == null) {
            C15829.m37611(R.string.MT_Protector);
            finish();
            return;
        }
        c8770.f30180 = true;
        boolean z = false;
        if (bundle != null) {
            this.f34797 = bundle.getBundle("markdown_scroll");
            this.f34800 = m25911(bundle.getInt("zoom_percent", 100));
            if (bundle.getBoolean("preview_resources_allowed")) {
                c8064 = f34769;
            } else {
                c8064 = new C8064(false, bundle.getString("source_label"));
            }
            this.f34781 = c8064;
        }
        m31016(R.layout.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۜۡۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8064 c8065 = ActivityC10181.f34767;
                this.f22468.finish();
            }
        });
        setTitle(this.f34773.f30172);
        this.f34796 = (ProgressBar) m31016(R.id.MT_Protector);
        this.f34780 = m31016(R.id.MT_Protector);
        View viewM31016 = m31016(R.id.MT_Protector);
        this.f34786 = new ViewOnTouchListenerC0302(viewM31016, ApplicationC0716.f2992);
        viewM31016.setOnClickListener(new ViewOnClickListenerC17587(this, 1));
        C18933.m43611(viewM31016, getString(R.string.MT_Protector));
        C16321.m38489(getWindow(), false);
        C5031.m13989(this.f34780, new C15161(this));
        this.f34795 = new C21381(this, this.f34773.f30173, this.f34773.f30179, this.f34773.f30182, this.f34773.f30184 ? null : this.f34773.f30171, this.f34773.f30178, this.f34773.f30183);
        if (this.f34773.f30176 >= 0) {
            this.f34788 = new C12210(getAssets());
        }
        C7907 c7907 = new C7907();
        c7907.m20920(this.f34773.f30181);
        c7907.m20921(this.f34795);
        this.f34775 = c7907.m20919();
        C15120 c15120 = new C15120(this, this);
        this.f34791 = c15120;
        c15120.setOnTouchListener(this.f34786);
        int iRgb = -1;
        ((FrameLayout) m31016(R.id.MT_Protector)).addView(this.f34791, new FrameLayout.LayoutParams(-1, -1));
        this.f34791.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩺ۡۘ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC10181.m25934(this.f74419, i, i3, i5, i7);
            }
        });
        WebView webView = this.f34791;
        if (this.f34773.f30176 < 0) {
            this.f34779 = new C22087(webView);
        } else {
            C18647 c18647 = new C18647(this.f34773);
            this.f34792 = c18647;
            webView.addJavascriptInterface(c18647, "__mtMarkdownState");
        }
        if (this.f34773.f30176 >= 0 && C16135.m38190(this)) {
            iRgb = Color.rgb(13, 17, 23);
        }
        webView.setBackgroundColor(iRgb);
        m25928(webView, C16135.m38190(this));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(this.f34773.f30184);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1 ^ (this.f34781.f28277 ? 1 : 0));
        webView.setWebViewClient(new C21469(this));
        webView.setWebChromeClient(new C17941(this));
        webView.setDownloadListener(new C14724());
        if (bundle != null && bundle.getBoolean("fullscreen")) {
            z = true;
        }
        m25958(z);
        if (this.f34773.f30184) {
            if (this.f34773.f30171 == null) {
                uriM32000 = C16360.m38531(this.f34773.f30170, this, this.f34773.f30173, this.f34773.f30178, this.f34773.f30182);
            } else {
                uriM32000 = C16360.m38532(this.f34773.f30170, this, this.f34773.f30171);
            }
        } else {
            uriM32000 = C12915.m32000(this.f34773.f30181, this.f34773.f30177);
        }
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("web_view");
        WebBackForwardList webBackForwardListRestoreState = bundle2 == null ? null : this.f34791.restoreState(bundle2);
        if (webBackForwardListRestoreState == null) {
            m25927(uriM32000);
            this.f34791.loadUrl(uriM32000.toString());
        } else {
            WebHistoryItem currentItem = webBackForwardListRestoreState.getCurrentItem();
            String url = currentItem == null ? null : currentItem.getUrl();
            m25927(url != null ? Uri.parse(url) : null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25934(ActivityC10181 activityC10181, int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            activityC10181.m25910();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25928(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        if (C9754.m24746("ALGORITHMIC_DARKENING")) {
            C18490.m42883(settings);
        }
        if (C9754.m24746("FORCE_DARK") && C9754.m24746("FORCE_DARK_STRATEGY")) {
            C18490.m42882(settings);
            C18490.m42881(settings, z ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m25913(ActivityC10181 activityC10181, Uri uri) {
        C8770 c8770;
        if (!activityC10181.f34799 || activityC10181.isFinishing() || activityC10181.isDestroyed() || (c8770 = activityC10181.f34773) == null || !(c8770.f30173 instanceof AbstractC12233)) {
            return;
        }
        if (C12915.m32002(uri, activityC10181.f34773.f30181) || C16360.m38534(uri, activityC10181.f34773.f30170)) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25927(Uri uri) {
        m25931(m25920(uri, this.f34773.f30181, this.f34773.f30184 ? this.f34773.f30170 : null, this.f34781));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25937(ActivityC10181 activityC10181, WebView webView, String str) {
        Uri uri;
        String url = webView.getUrl();
        if (str == null || !str.equals(url)) {
            uri = null;
        } else {
            uri = Uri.parse(str);
            if (uri.getScheme() == null) {
                uri = null;
            }
        }
        if (uri != null) {
            activityC10181.m25927(uri);
            if (activityC10181.f34781.f28277) {
                String string = uri.buildUpon().fragment(null).build().toString();
                synchronized (activityC10181.f34782) {
                    C19353 c19353 = activityC10181.f34794;
                    if (c19353 != null && c19353.f62394.equals(string)) {
                        activityC10181.f34794 = null;
                        boolean zM44358 = c19353.m44358(string);
                        if (zM44358) {
                            webView.reload();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m25950(Uri uri) {
        C8064 c8064 = this.f34781;
        C8064 c8064M25920 = m25920(uri, this.f34773.f30181, this.f34773.f30184 ? this.f34773.f30170 : null, c8064);
        if (uri == null || c8064.f28277 || !c8064M25920.f28277) {
            if (!c8064M25920.f28277 || c8064.f28277) {
                m25916();
                return;
            }
            return;
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        synchronized (this.f34782) {
            C19353 c19353 = this.f34794;
            if (c19353 == null || !c19353.f62394.equals(string)) {
                this.f34794 = new C19353(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m25916() {
        synchronized (this.f34782) {
            this.f34794 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m25957(ActivityC10181 activityC10181, Uri uri) {
        C8064 c8064M25920 = m25920(uri, activityC10181.f34773.f30181, activityC10181.f34773.f30184 ? activityC10181.f34773.f30170 : null, activityC10181.f34781);
        if (!activityC10181.f34783 || c8064M25920.f28277) {
            return;
        }
        activityC10181.m25931(c8064M25920);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25931(C8064 c8064) {
        C8770 c8770;
        boolean z = this.f34783;
        boolean z2 = c8064.f28277;
        boolean z3 = z2 && !z;
        this.f34783 = z2;
        this.f34781 = c8064;
        WebView webView = this.f34791;
        if (webView != null) {
            webView.getSettings().setMixedContentMode(!c8064.f28277 ? 1 : 0);
        }
        C6938 c6938 = this.f41645;
        if (c6938 != null) {
            c6938.setSubtitle(c8064.f28278);
        }
        if (!z3 || (c8770 = this.f34773) == null) {
            return;
        }
        setTitle(c8770.f30172);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m25955(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a))) {
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority != null) {
                int iLastIndexOf = encodedAuthority.lastIndexOf(64);
                if (iLastIndexOf >= 0) {
                    encodedAuthority = encodedAuthority.substring(iLastIndexOf + 1);
                }
                if (encodedAuthority.isEmpty()) {
                    encodedAuthority = null;
                }
            } else {
                encodedAuthority = null;
            }
            if (encodedAuthority != null) {
                return scheme.toLowerCase(Locale.ROOT) + "://" + encodedAuthority;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8064 m25920(Uri uri, String str, String str2, C8064 c8064) {
        String strM25955;
        boolean zM32002 = C12915.m32002(uri, str);
        C8064 c8065 = f34769;
        if (zM32002 || C16360.m38534(uri, str2)) {
            return c8065;
        }
        String scheme = uri == null ? null : uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String strM25956 = m25955(uri);
                if (strM25956 == null) {
                    return f34767;
                }
                return new C8064(false, strM25956);
            }
            if (lowerCase.equals("blob")) {
                Uri uri2 = Uri.parse(uri.toString().substring(scheme.length() + 1));
                if (C12915.m32002(uri2, str)) {
                    return c8065;
                }
                String scheme2 = uri2.getScheme();
                if (scheme2 != null && ((scheme2.equalsIgnoreCase(a.s) || scheme2.equalsIgnoreCase(b.a)) && (strM25955 = m25955(uri2)) != null)) {
                    return new C8064(false, strM25955);
                }
                return new C8064(false, "blob:");
            }
            if (lowerCase.equals(e.m) || lowerCase.equals("about")) {
                return new C8064(false, lowerCase.concat(":"));
            }
        }
        return c8064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25919(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m25949(ActivityC10181 activityC10181, String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() != null) {
                C8064 c8064M25920 = m25920(uri, activityC10181.f34773.f30181, activityC10181.f34773.f30184 ? activityC10181.f34773.f30170 : null, activityC10181.f34781);
                return c8064M25920.f28277 ? activityC10181.f34773.f30172 : c8064M25920.f28278;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m25918(ActivityC10181 activityC10181, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean zEqualsIgnoreCase;
        WebResourceResponse webResourceResponseM25302;
        C12210 c12210;
        Uri url = webResourceRequest.getUrl();
        String method = webResourceRequest.getMethod();
        if (webResourceRequest.isForMainFrame()) {
            activityC10181.m25950(url);
            C8064 c8064 = activityC10181.f34781;
            C8064 c8064M25920 = m25920(url, activityC10181.f34773.f30181, activityC10181.f34773.f30184 ? activityC10181.f34773.f30170 : null, c8064);
            if (!c8064.f28277 || c8064M25920.f28277) {
                c8064M25920 = c8064;
            }
            if (c8064M25920 != c8064) {
                activityC10181.f34781 = c8064M25920;
            }
        }
        if (C12915.m32002(url, activityC10181.f34773.f30181)) {
            synchronized (activityC10181.f34782) {
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                C8064 c8065 = activityC10181.f34781;
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String str = activityC10181.f34773.f30181;
                C19353 c19353 = activityC10181.f34794;
                z = false;
                if (!zIsForMainFrame && !c8065.f28277) {
                    String strM25919 = m25919("Sec-Fetch-Site", requestHeaders);
                    if (strM25919 != null) {
                        zEqualsIgnoreCase = "same-origin".equalsIgnoreCase(strM25919);
                    } else {
                        String strM259110 = m25919("Referer", requestHeaders);
                        zEqualsIgnoreCase = strM259110 != null && C12915.m32002(Uri.parse(strM259110), str);
                    }
                }
                if (!zEqualsIgnoreCase) {
                    if (c19353 != null) {
                        if (m25919("Sec-Fetch-Site", requestHeaders) == null && m25919("Referer", requestHeaders) == null) {
                            z = true;
                        }
                        if (z) {
                            c19353.m44357();
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                return C21381.m47930(403, "Forbidden");
            }
            if (!"GET".equalsIgnoreCase(method)) {
                return C21381.m47930(405, "Method Not Allowed");
            }
            if (activityC10181.f34773.f30176 >= 0 && url.getPath() != null && url.getPath().startsWith("/_mt_markdown_vendor_/")) {
                if (!webResourceRequest.isForMainFrame() && (c12210 = activityC10181.f34788) != null) {
                    return c12210.m30316(url.getPath());
                }
                return C21381.m47930(404, "Not Found");
            }
            if (webResourceRequest.isForMainFrame() && (activityC10181.f34773.f30173 instanceof AbstractC12233) && url.getPath() != null) {
                webResourceResponseM25302 = activityC10181.f34795.m47932(url.getPath());
            } else {
                webResourceResponseM25302 = activityC10181.f34775.m25302(url);
            }
            return webResourceResponseM25302 == null ? C21381.m47930(404, "Not Found") : webResourceResponseM25302;
        }
        if (activityC10181.f34773.f30184 && C16360.m38534(url, activityC10181.f34773.f30170)) {
            if (webResourceRequest.isForMainFrame() && "GET".equalsIgnoreCase(method) && (activityC10181.f34773.f30173 instanceof AbstractC12233)) {
                C16360.m38536(activityC10181.f34773.f30170);
            }
            if (!webResourceRequest.isForMainFrame() || !"GET".equalsIgnoreCase(method)) {
                return C21381.m47930(403, "Forbidden");
            }
        } else {
            String scheme = url.getScheme();
            if ("content".equalsIgnoreCase(scheme) || "file".equalsIgnoreCase(scheme)) {
                return C21381.m47930(403, "Forbidden");
            }
            if (webResourceRequest.isForMainFrame() && activityC10181.m25914(url)) {
                return C21381.m47930(403, "Forbidden");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m25914(Uri uri) {
        String str = this.f34773.f30181;
        String str2 = null;
        String str3 = this.f34773.f30184 ? this.f34773.f30170 : null;
        if (C12915.m32002(uri, str) || C16360.m38534(uri, str3)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals("about") || lowerCase.equals(e.m) || lowerCase.equals("blob") || lowerCase.equals("javascript") || lowerCase.equals("cid")) {
                return false;
            }
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String encodedAuthority = uri.getEncodedAuthority();
                if (encodedAuthority != null) {
                    int iLastIndexOf = encodedAuthority.lastIndexOf(64);
                    if (iLastIndexOf >= 0) {
                        encodedAuthority = encodedAuthority.substring(iLastIndexOf + 1);
                    }
                    if (!encodedAuthority.isEmpty()) {
                        str2 = encodedAuthority;
                    }
                }
                if (str2 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C15844 m25921(ActivityC10181 activityC10181, View view, C15844 c15844) {
        C13954 c13954M37673 = c15844.m37673((activityC10181.f34774 ? 0 : 7) | 128);
        view.setPadding(c13954M37673.f45915, c13954M37673.f45912, c13954M37673.f45914, Math.max(c13954M37673.f45913, c15844.m37673(8).f45913));
        activityC10181.f34786.m1846(c15844.m37673(7));
        return C15844.f51279;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m25958(boolean z) {
        this.f34774 = z;
        this.f41645.setVisibility(z ? 8 : 0);
        this.f34796.setVisibility((!this.f34799 || z) ? 8 : 0);
        this.f34786.m1847(z);
        m25960();
        C5031.m14002(this.f34780);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25960() {
        C5965 c5965M31021 = m31021();
        if (this.f34774) {
            c5965M31021.m16257(2);
            c5965M31021.m16253(7);
        } else {
            c5965M31021.m16257(1);
            c5965M31021.m16256(7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f34774) {
            m25960();
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f34780 != null) {
            this.f34786.m1847(this.f34774);
            m25960();
            C5031.m14002(this.f34780);
        }
        WebView webView = this.f34791;
        if (webView != null) {
            m25951(webView.getUrl());
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f34777 = menu.findItem(R.id.MT_Protector);
        this.f34798 = menu.findItem(R.id.MT_Protector);
        m25944();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f34791 == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            if (this.f34791.canGoBack()) {
                this.f34791.goBack();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            if (this.f34791.canGoForward()) {
                this.f34791.goForward();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            View viewFindViewById = this.f41645.findViewById(R.id.MT_Protector);
            if (viewFindViewById != null) {
                C16195 c16195M3001 = C0671.m3001(viewFindViewById);
                C12418 c12418M38298 = c16195M3001.m38298();
                this.f34789 = c12418M38298.add(0, 1, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                this.f34785 = c12418M38298.add(0, 2, 1, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c12418M38298.add(0, 5, 2, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                if (this.f34773.f30176 < 0) {
                    this.f34776 = c12418M38298.add(0, 3, 3, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c12418M38298.add(0, 4, 4, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c16195M3001.m38292();
                c16195M3001.m38296(new C12388(4, this));
                c16195M3001.m38295(new C17920(this));
                Context context = viewFindViewById.getContext();
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof C22815) {
                    C22815 c22815 = (C22815) parent;
                    context = c22815.getContext();
                    int iM50507 = c22815.m50507();
                    if (iM50507 != 0) {
                        context = new C5716(context, iM50507);
                    }
                }
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null, false);
                this.f34784 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f34787 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
                this.f34778 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f34784.setOnClickListener(new ViewOnClickListenerC0653(4, this));
                this.f34778.setOnClickListener(new ViewOnClickListenerC18832(this, 2));
                this.f34793 = c16195M3001;
                m25944();
                C0671.m3002(c16195M3001, this.f34800 + "%", viewInflate);
            }
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25939(ActivityC10181 activityC10181, C16195 c16195) {
        if (activityC10181.f34793 == c16195) {
            activityC10181.f34793 = null;
            activityC10181.f34789 = null;
            activityC10181.f34785 = null;
            activityC10181.f34776 = null;
            activityC10181.f34784 = null;
            activityC10181.f34787 = null;
            activityC10181.f34778 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25943(ActivityC10181 activityC10181, MenuItem menuItem) {
        if (activityC10181.f34791 != null) {
            if (menuItem.getItemId() == 1) {
                activityC10181.f34791.reload();
                return true;
            }
            if (menuItem.getItemId() == 2) {
                activityC10181.m25916();
                activityC10181.f34791.stopLoading();
                if (activityC10181.f34773.f30173 instanceof AbstractC12233) {
                    activityC10181.f34795.m47931();
                    C16360.m38536(activityC10181.f34773.f30170);
                }
                activityC10181.m25922(100, false);
                return true;
            }
            if (menuItem.getItemId() == 5) {
                activityC10181.m25958(true);
                return true;
            }
            if (menuItem.getItemId() == 3) {
                if (activityC10181.m25948()) {
                    activityC10181.f34779.m49035(C16135.m38190(activityC10181));
                }
                return true;
            }
            if (menuItem.getItemId() == 4) {
                activityC10181.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25942(boolean z) {
        int i;
        if (this.f34791 == null) {
            return;
        }
        int i2 = this.f34800;
        int[] iArr = f34771;
        if (z) {
            int i3 = 0;
            while (true) {
                if (i3 < 17) {
                    i = iArr[i3];
                    if (i > i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i = f34770;
                    break;
                }
            }
        } else {
            int i4 = 16;
            while (true) {
                if (i4 >= 0) {
                    i = iArr[i4];
                    if (i < i2) {
                        break;
                    } else {
                        i4--;
                    }
                } else {
                    i = f34768;
                    break;
                }
            }
        }
        if (i == i2) {
            return;
        }
        m25946(i);
        m25910();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25910() {
        WebView webView = this.f34791;
        if (webView == null || webView.getWidth() <= 0) {
            return;
        }
        int iMax = Math.max(1, Math.round(this.f34791.getWidth() / this.f34791.getResources().getDisplayMetrics().density));
        WebView webView2 = this.f34791;
        StringBuilder sbM40153 = C17214.m40153(m25911(this.f34800), "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key='__mt_html_preview_viewport_7d26a6c9__';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content='',metas=head.getElementsByTagName('meta');for(var i=0;i<metas.length;i++){if((metas[i].name||'').toLowerCase()==='viewport'){nodes.push(metas[i]);content=metas[i].getAttribute('content')||'';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement('meta');meta.name='viewport';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content='width='+width+',initial-scale='+scale+',minimum-scale='+Math.min(scale,0.1)+',maximum-scale='+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute('content',content);}})(", ",");
        sbM40153.append(Math.max(1, iMax));
        sbM40153.append(");");
        webView2.evaluateJavascript(sbM40153.toString(), null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m25946(int i) {
        int iM25911 = m25911(i);
        this.f34800 = iM25911;
        TextView textView = this.f34787;
        if (textView != null) {
            textView.setText(iM25911 + "%");
        }
        FrameLayout frameLayout = this.f34784;
        if (frameLayout != null) {
            frameLayout.setEnabled(this.f34800 > f34768);
        }
        FrameLayout frameLayout2 = this.f34778;
        if (frameLayout2 != null) {
            frameLayout2.setEnabled(this.f34800 < f34770);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m25911(int i) {
        int iMin = Math.min(f34770, i);
        int i2 = f34768;
        int iMax = Math.max(i2, iMin);
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = f34771[i3];
            if (Math.abs(i4 - iMax) < Math.abs(i2 - iMax)) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void onBackPressed() {
        C22087 c22087 = this.f34779;
        if (c22087 == null || !c22087.m49036(new RunnableC3185(7, this))) {
            WebView webView = this.f34791;
            if (webView != null && webView.canGoBack()) {
                this.f34791.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m25956(ActivityC10181 activityC10181) {
        WebView webView = activityC10181.f34791;
        if (webView != null && webView.canGoBack()) {
            activityC10181.f34791.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25922(int i, boolean z) {
        this.f34799 = z;
        ProgressBar progressBar = this.f34796;
        if (progressBar != null) {
            progressBar.setProgress(i);
            this.f34796.setVisibility((!z || this.f34774) ? 8 : 0);
        }
        m25944();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m25944() {
        MenuItem menuItem = this.f34777;
        boolean z = false;
        if (menuItem != null) {
            WebView webView = this.f34791;
            menuItem.setEnabled(webView != null && webView.canGoBack());
        }
        MenuItem menuItem2 = this.f34798;
        if (menuItem2 != null) {
            WebView webView2 = this.f34791;
            if (webView2 != null && webView2.canGoForward()) {
                z = true;
            }
            menuItem2.setEnabled(z);
        }
        MenuItem menuItem3 = this.f34789;
        if (menuItem3 != null) {
            menuItem3.setVisible(!this.f34799);
        }
        MenuItem menuItem4 = this.f34785;
        if (menuItem4 != null) {
            menuItem4.setVisible(this.f34799);
        }
        MenuItem menuItem5 = this.f34776;
        if (menuItem5 != null) {
            menuItem5.setEnabled(m25948());
        }
        m25946(this.f34800);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m25948() {
        C8770 c8770;
        WebView webView = this.f34791;
        String url = webView == null ? null : webView.getUrl();
        return (url == null || (c8770 = this.f34773) == null || c8770.f30176 >= 0 || C16360.m38534(Uri.parse(url), this.f34773.f30170)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m25951(String str) {
        String str2;
        if (this.f34791 == null || !m25915(str)) {
            return;
        }
        boolean zM38190 = C16135.m38190(this);
        this.f34791.setBackgroundColor(zM38190 ? Color.rgb(13, 17, 23) : -1);
        m25928(this.f34791, zM38190);
        String string = C12915.m32000(this.f34773.f30181, this.f34773.f30177).toString();
        final Bundle bundle = this.f34797;
        if (bundle == null) {
            str2 = "null";
        } else {
            str2 = "{x:" + bundle.getFloat("x") + ",y:" + bundle.getFloat("y") + l.d;
        }
        String str3 = this.f34773.f30174;
        String strQuote = str3 != null ? JSONObject.quote(str3) : "null";
        this.f34791.evaluateJavascript("(function(){if(location.href.split('#')[0]!==" + JSONObject.quote(string) + "||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply(" + zM38190 + "," + this.f34773.f30176 + "," + str2 + "," + strQuote + ",function(state){window.__mtMarkdownState.save(" + JSONObject.quote(this.f34792.f60460) + ",state);});return true;})()", new ValueCallback() { // from class: l.᩹ۡۘ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ActivityC10181.m25936(this.f72533, bundle, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25936(ActivityC10181 activityC10181, Bundle bundle, String str) {
        if ("true".equals(str) && activityC10181.f34797 == bundle) {
            activityC10181.f34797 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m25915(String str) {
        C8770 c8770 = this.f34773;
        return c8770 != null && c8770.f30176 >= 0 && str != null && Uri.parse(str).buildUpon().fragment(null).build().equals(C12915.m32000(this.f34773.f30181, this.f34773.f30177));
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onPause() {
        WebView webView = this.f34791;
        if (webView != null) {
            webView.onPause();
        }
        ViewOnTouchListenerC0302 viewOnTouchListenerC0302 = this.f34786;
        if (viewOnTouchListenerC0302 != null) {
            viewOnTouchListenerC0302.m1847(false);
        }
        super.onPause();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC0302 viewOnTouchListenerC0302 = this.f34786;
        if (viewOnTouchListenerC0302 != null) {
            viewOnTouchListenerC0302.m1847(this.f34774);
        }
        WebView webView = this.f34791;
        if (webView != null) {
            webView.onResume();
            m25951(this.f34791.getUrl());
        }
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f34791 != null) {
            Bundle bundle2 = new Bundle();
            this.f34791.saveState(bundle2);
            bundle.putBundle("web_view", bundle2);
            if (m25915(this.f34791.getUrl())) {
                Bundle bundle3 = new Bundle();
                float fMax = Math.max(0.01f, this.f34791.getScale());
                bundle3.putFloat("x", this.f34791.getScrollX() / fMax);
                bundle3.putFloat("y", this.f34791.getScrollY() / fMax);
                bundle.putBundle("markdown_scroll", bundle3);
            }
        }
        C8064 c8064 = this.f34781;
        bundle.putBoolean("preview_resources_allowed", c8064.f28277);
        bundle.putString("source_label", c8064.f28278);
        bundle.putInt("zoom_percent", this.f34800);
        bundle.putBoolean("fullscreen", this.f34774);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        C8770 c8770;
        ViewOnTouchListenerC0302 viewOnTouchListenerC0302 = this.f34786;
        if (viewOnTouchListenerC0302 != null) {
            viewOnTouchListenerC0302.m1847(false);
        }
        C22087 c22087 = this.f34779;
        if (c22087 != null) {
            c22087.m49034();
        }
        C18647 c18647 = this.f34792;
        if (c18647 != null) {
            C18647.m43131(c18647);
            WebView webView = this.f34791;
            if (webView != null) {
                webView.removeJavascriptInterface("__mtMarkdownState");
            }
        }
        C16195 c16195 = this.f34793;
        if (c16195 != null) {
            c16195.m38293();
            this.f34793 = null;
        }
        C8770 c8771 = this.f34773;
        C16360.m38535(c8771 == null ? null : c8771.f30170);
        m25916();
        WebView webView2 = this.f34791;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        C21381 c21381 = this.f34795;
        if (c21381 != null) {
            c21381.close();
            this.f34795 = null;
        }
        WebView webView3 = this.f34791;
        if (webView3 != null) {
            webView3.setWebChromeClient(null);
            this.f34791.setWebViewClient(new WebViewClient());
            this.f34791.clearHistory();
            ViewGroup viewGroup = (ViewGroup) this.f34791.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f34791);
            }
            this.f34791.destroy();
            this.f34791 = null;
        }
        if (!isChangingConfigurations() && (c8770 = this.f34773) != null) {
            f34772.remove(this.f34790, c8770);
            this.f34773.close();
            this.f34773 = null;
        }
        super.onDestroy();
    }
}
