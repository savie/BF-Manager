package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC3846 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public static final C3100 f13102;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f13103;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public static final int f13104;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public static final C3100 f13105;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f13106;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public static final int f13107;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public C10139 f13108;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public String f13109;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public FrameLayout f13110;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public ValueCallback f13111;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f13113;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C6990 f13114;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public ProgressBar f13115;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public WebView f13116;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public String f13117;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public boolean f13118;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public View f13119;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f13120;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public boolean f13121;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public C20254 f13122;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public C0851 f13124;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public FrameLayout f13125;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f13126;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public MenuItem f13128;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C17258 f13129;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public C9811 f13130;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public C7847 f13131;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public String f13132;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f13133;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public boolean f13134;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public TextView f13135;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public boolean f13136;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f13137;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C23238 f13138;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public C18452 f13139;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public C23984 f13140;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C1952 f13141;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public C14274 f13142;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public Bundle f13143;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public MenuItem f13144;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public C6830 f13145;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C16524 f13146;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC7575 f13147;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public boolean f13148;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C3347 f13150;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C17270 f13127 = new C17270();

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public int f13149 = 100;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public volatile C3100 f13123 = f13105;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public final Object f13112 = new Object();

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "HtmlPreviewActivity";
    }

    static {
        int[] iArr = {25, 33, 50, 67, 75, 80, 90, 100, UMErrorCode.E_UM_BE_JSON_FAILED, q.h, 150, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 200, 250, 300, 400, 500};
        f13103 = iArr;
        f13107 = iArr[0];
        f13104 = iArr[16];
        f13106 = new ConcurrentMapC17249();
        f13105 = new C3100(false, null);
        f13102 = new C3100(true, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12421(C8614 c8614, final InterfaceC2386 interfaceC2386, C2343 c2343, String str, final Runnable runnable) {
        m12420(c8614.m23233(), c8614.m23223(), interfaceC2386, c2343, str, C2343.m7884(c8614), EnumC15778.MAIN, new Runnable() { // from class: l.֨ۡ֫
            @Override // java.lang.Runnable
            public final void run() {
                C3100 c3100 = ActivityC3846.f13105;
                C20065.m46115(interfaceC2386);
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12402(ShortcutActivity shortcutActivity, String str) {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        if (!abstractC22044M35193.mo4304()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C11969 c11969 = C11969.f38536;
        InterfaceC2386 interfaceC2386Mo20831 = c11969.mo20831(abstractC22044M35193.mo4294());
        if (interfaceC2386Mo20831 == null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        final C2343 c2343M7886 = C2343.m7886(abstractC22044M35193.mo4294());
        final C13529 c13529 = new C13529(C21576.f68931);
        final String strM33234 = c13529.m33234(c2343M7886);
        m12420(shortcutActivity, c11969, interfaceC2386Mo20831, c2343M7886, strM33234, Collections.EMPTY_LIST, EnumC15778.STANDALONE, new Runnable() { // from class: l.ۤۖ֫
            @Override // java.lang.Runnable
            public final void run() {
                C3100 c3100 = ActivityC3846.f13105;
                c13529.m33235(c2343M7886, strM33234, false);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: RuntimeException -> 0x00d1, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:11:0x001c, B:14:0x0023, B:24:0x003b, B:36:0x0094, B:38:0x009a, B:41:0x00b7, B:43:0x00c0, B:44:0x00c5, B:46:0x00c9, B:47:0x00d0, B:25:0x0044, B:27:0x005c, B:29:0x0068, B:31:0x0074, B:33:0x0089, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: RuntimeException -> 0x00d1, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:11:0x001c, B:14:0x0023, B:24:0x003b, B:36:0x0094, B:38:0x009a, B:41:0x00b7, B:43:0x00c0, B:44:0x00c5, B:46:0x00c9, B:47:0x00d0, B:25:0x0044, B:27:0x005c, B:29:0x0068, B:31:0x0074, B:33:0x0089, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[Catch: RuntimeException -> 0x00d1, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:11:0x001c, B:14:0x0023, B:24:0x003b, B:36:0x0094, B:38:0x009a, B:41:0x00b7, B:43:0x00c0, B:44:0x00c5, B:46:0x00c9, B:47:0x00d0, B:25:0x0044, B:27:0x005c, B:29:0x0068, B:31:0x0074, B:33:0x0089, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:50:0x000a }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12398(Activity activity, String str, String str2, boolean z, AbstractC22044 abstractC22044, int i, String str3) {
        AbstractC22044 abstractC22044M35193;
        String strM7891;
        C2343 c2343;
        RunnableC1016 runnableC1016;
        String name;
        String str4;
        String strM41987;
        C23984 c23984;
        if (str == null) {
            abstractC22044M35193 = null;
        } else {
            try {
                abstractC22044M35193 = C14584.m35193(str, new String[0]);
            } catch (RuntimeException unused) {
                abstractC22044.mo4296();
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        }
        String parent = abstractC22044M35193 == null ? null : abstractC22044M35193.getParent();
        String strM33234 = "/";
        if (parent == null || !parent.startsWith("/")) {
            parent = null;
        } else if (!parent.endsWith("/")) {
            parent = parent.concat("/");
        }
        boolean z2 = parent != null;
        if (z2) {
            if (z) {
                name = abstractC22044M35193.getName();
                str4 = parent;
                c2343 = null;
                runnableC1016 = null;
            } else {
                C2343 c2343M7886 = C2343.m7886(abstractC22044M35193.mo4294());
                String strM7890 = c2343M7886.m7890();
                if (C14584.m35198(strM7890, C6382.f21563.mo4294()) || C14584.m35198(strM7890, C6382.f21564.mo4294()) || C14584.m35198(strM7890, C6382.f21562.mo4294())) {
                    strM33234 = strM7890;
                    c2343 = null;
                    runnableC1016 = null;
                } else {
                    C13529 c13529 = new C13529(C21576.f68931);
                    strM33234 = c13529.m33234(c2343M7886);
                    runnableC1016 = new RunnableC1016(c13529, c2343M7886, strM33234);
                    c2343 = c2343M7886;
                }
                strM7891 = c2343M7886.m7891(strM33234);
            }
            strM41987 = C18004.m41987(str4, name);
            if (strM41987 != null) {
                throw new IllegalArgumentException("Invalid HTML preview path");
            }
            c23984 = new C23984(C11969.f38536, str4, name, strM41987, str2, true, z, abstractC22044, z2);
            c23984.f77623 = c2343;
            c23984.f77610 = i;
            c23984.f77609 = activity instanceof ActivityC18143 ? str3 : null;
            if (c23984.f77609 != null) {
                c23984.f77603 = EnumC15778.EDITOR;
            }
            m12399(activity, c23984, runnableC1016);
        }
        strM7891 = "index.html";
        c2343 = null;
        runnableC1016 = null;
        name = strM7891;
        str4 = strM33234;
        strM41987 = C18004.m41987(str4, name);
        if (strM41987 != null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        c23984 = new C23984(C11969.f38536, str4, name, strM41987, str2, true, z, abstractC22044, z2);
        c23984.f77623 = c2343;
        c23984.f77610 = i;
        c23984.f77609 = activity instanceof ActivityC18143 ? str3 : null;
        if (c23984.f77609 != null) {
            c23984.f77603 = EnumC15778.EDITOR;
        }
        m12399(activity, c23984, runnableC1016);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12420(ActivityC7405 activityC7405, AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386, C2343 c2343, String str, List list, EnumC15778 enumC15778, Runnable runnable) {
        AbstractC7629 abstractC7629M42101;
        boolean zEquals = "local".equals(abstractC7629.mo20842());
        if (!(abstractC7629 instanceof C11969) && !(abstractC7629 instanceof AbstractC18881) && !(abstractC7629 instanceof C24320) && !(abstractC7629 instanceof C11312) && !(abstractC7629 instanceof C17036)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7364.m20184(((Long) it.next()).longValue());
            }
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        Object obj = null;
        C2343 c2344 = null;
        try {
            if (zEquals) {
                abstractC7629M42101 = C11969.f38536;
            } else {
                abstractC7629M42101 = C18070.m42101(abstractC7629.m20838(), true);
            }
            try {
                String strM7891 = c2343.m7891(str);
                String strM41987 = C18004.m41987(str, strM7891);
                try {
                    if (strM41987 == null) {
                        throw new IllegalArgumentException("Invalid HTML preview path");
                    }
                    C23984 c23984 = new C23984(abstractC7629M42101, str, strM7891, strM41987, interfaceC2386.getName(), zEquals, "multipart/related".equals(C11401.m28751(interfaceC2386.getName())), null, true);
                    if (!c23984.f77608) {
                        c2344 = c2343;
                    }
                    c23984.f77623 = c2344;
                    c23984.f77621 = list;
                    c23984.f77603 = enumC15778;
                    if (C7847.m21368(interfaceC2386.getName())) {
                        c23984.f77610 = 0;
                    }
                    m12399(activityC7405, c23984, runnable);
                    return;
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
            }
            obj = abstractC7629M42101;
        } catch (RuntimeException unused3) {
        }
        if (obj instanceof AutoCloseable) {
            try {
                C20196.m46453((AutoCloseable) obj);
            } catch (Exception unused4) {
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC7364.m20184(((Long) it2.next()).longValue());
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12399(Activity activity, final C23984 c23984, Runnable runnable) {
        final String string = UUID.randomUUID().toString();
        ConcurrentMapC17249 concurrentMapC17249 = f13106;
        concurrentMapC17249.put(string, c23984);
        C21576.m49077().postDelayed(new Runnable() { // from class: l.ۢۡ֫
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC3846.m12422(c23984, string);
            }
        }, 60000L);
        Intent intent = new Intent(activity, (Class<?>) ActivityC3846.class);
        intent.putExtra("session_token", string);
        try {
            if (c23984.f77603 == EnumC15778.MAIN) {
                ((Main) activity).m114(intent);
            } else if (c23984.f77603 == EnumC15778.EDITOR) {
                ((ActivityC18143) activity).m42297(intent);
            } else {
                activity.startActivity(intent);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (RuntimeException unused) {
            if (concurrentMapC17249.remove(string, c23984)) {
                c23984.close();
            }
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12422(C23984 c23984, String str) {
        if (c23984.f77617 || !f13106.remove(str, c23984)) {
            return;
        }
        c23984.close();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("session_token");
        this.f13132 = stringExtra;
        C23984 c23984 = stringExtra == null ? null : (C23984) f13106.get(stringExtra);
        this.f13140 = c23984;
        if (c23984 == null) {
            C22673.m51152(R.string.MT_Protector);
            finish();
            return;
        }
        this.f13150 = C12296.m30693(this, new C10912(this));
        this.f13140.f77617 = true;
        if (C23984.m53533(this.f13140) && bundle != null) {
            bundle.remove("web_view");
            bundle.remove("preview_resources_allowed");
            bundle.remove("source_label");
            bundle.remove("editing_document_url");
            bundle.remove("markdown_scroll");
        }
        C23984.m53510(this.f13140, getApplicationContext(), new C22492(0, this, bundle));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12408(final ActivityC3846 activityC3846, Bundle bundle, Boolean bool) {
        Uri uriM41984;
        C3100 c3100;
        if (activityC3846.isFinishing() || activityC3846.isDestroyed()) {
            return;
        }
        if (!bool.booleanValue()) {
            C22673.m51152(R.string.MT_Protector);
            activityC3846.finish();
            return;
        }
        boolean z = false;
        if (bundle != null) {
            activityC3846.f13117 = bundle.getString("editing_document_url");
            activityC3846.f13143 = bundle.getBundle("markdown_scroll");
            activityC3846.f13149 = m12430(bundle.getInt("zoom_percent", 100));
            if (bundle.getBoolean("preview_resources_allowed")) {
                c3100 = f13102;
            } else {
                c3100 = new C3100(false, bundle.getString("source_label"));
            }
            activityC3846.f13123 = c3100;
        }
        activityC3846.m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) activityC3846.m40418(R.id.MT_Protector);
        activityC3846.f56046 = c16390;
        activityC3846.m40407(c16390);
        activityC3846.m40393();
        activityC3846.f56046.setNavigationOnClickListener(new ViewOnClickListenerC4526(activityC3846, 1));
        activityC3846.setTitle(activityC3846.f13140.f77604);
        activityC3846.f13115 = (ProgressBar) activityC3846.m40418(R.id.MT_Protector);
        activityC3846.f13119 = activityC3846.m40418(R.id.MT_Protector);
        View viewM40418 = activityC3846.m40418(R.id.MT_Protector);
        activityC3846.f13147 = new ViewOnTouchListenerC7575(viewM40418, ApplicationC17729.f58258);
        viewM40418.setOnClickListener(new ViewOnClickListenerC21993(3, activityC3846));
        View viewM40419 = activityC3846.m40418(R.id.MT_Protector);
        ViewOnTouchListenerC7575 viewOnTouchListenerC7575 = activityC3846.f13147;
        viewOnTouchListenerC7575.getClass();
        viewM40419.setOnTouchListener(new ViewOnTouchListenerC0117(viewOnTouchListenerC7575));
        viewM40419.setOnClickListener(new ViewOnClickListenerC3673(5, activityC3846));
        C6696.m18717(viewM40418, activityC3846.getString(R.string.MT_Protector));
        C18190.m42352(activityC3846.getWindow(), false);
        C22666.m51097(activityC3846.f13119, new InterfaceC22491() { // from class: l.۟ۡ֫
            @Override // l.InterfaceC22491
            public final C3977 onApplyWindowInsets(View view, C3977 c3977) {
                return ActivityC3846.m12396(this.f25577, view, c3977);
            }
        });
        activityC3846.f13124 = new C0851(activityC3846, activityC3846.f13140.f77614, activityC3846.f13140.f77613, activityC3846.f13140.f77611, activityC3846.f13140.f77608 ? null : activityC3846.f13140.f77624, activityC3846.f13140.f77625, activityC3846.f13140.f77622);
        if (activityC3846.f13140.f77610 >= 0) {
            activityC3846.f13114 = new C6990(activityC3846.getAssets());
            activityC3846.f13131 = new C7847(activityC3846.f13124, activityC3846.getAssets(), activityC3846.f13140.f77624 == null ? null : activityC3846.f13140.f77612, C23434.m52629(activityC3846));
        }
        C15375 c15375 = new C15375();
        c15375.m36830(activityC3846.f13140.f77620);
        c15375.m36831(activityC3846.f13124);
        activityC3846.f13141 = c15375.m36829();
        C19508 c19508 = new C19508(activityC3846, activityC3846);
        activityC3846.f13116 = c19508;
        c19508.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩶ۡ֫
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityC3846.m12410(this.f67673, view, motionEvent);
                return false;
            }
        });
        FrameLayout frameLayout = (FrameLayout) activityC3846.m40418(R.id.MT_Protector);
        int iRgb = -1;
        frameLayout.addView(activityC3846.f13116, new FrameLayout.LayoutParams(-1, -1));
        activityC3846.f13116.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ܿۡ֫
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC3846.m12405(this.f59466, i, i3, i5, i7);
            }
        });
        activityC3846.f13129 = new C17258(activityC3846, activityC3846.f13116, new C15032(activityC3846));
        WebView webView = activityC3846.f13116;
        if (activityC3846.f13140.f77610 < 0) {
            activityC3846.f13142 = new C14274(webView);
        } else {
            C23238 c23238 = new C23238(activityC3846.f13140, new C9261(activityC3846, webView));
            activityC3846.f13138 = c23238;
            webView.addJavascriptInterface(c23238, "__mtMarkdownState");
        }
        if (activityC3846.f13140.f77610 >= 0 && C23434.m52629(activityC3846)) {
            iRgb = Color.rgb(13, 17, 23);
        }
        webView.setBackgroundColor(iRgb);
        m12401(webView, C23434.m52629(activityC3846));
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
        settings.setAllowContentAccess(activityC3846.f13140.f77608);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1 ^ (activityC3846.f13123.f10024 ? 1 : 0));
        activityC3846.f13130 = new C9811(activityC3846, webView);
        webView.setWebViewClient(new C12795(activityC3846));
        webView.setWebChromeClient(new C5338(activityC3846));
        webView.setDownloadListener(new DownloadListener() { // from class: l.ۖۡ֫
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                ActivityC3846.m12416(this.f8163, str, str2, str3, str4, j);
            }
        });
        activityC3846.f13145 = new C6830((ViewStub) activityC3846.m40418(R.id.MT_Protector), activityC3846.f13116);
        if (activityC3846.f13140.f77610 >= 0) {
            C10139 c10139 = new C10139(frameLayout, activityC3846.f13116, activityC3846.f13140.f77616, new RunnableC0313(activityC3846), new RunnableC11209(1, activityC3846), new RunnableC13526(2, activityC3846));
            activityC3846.f13108 = c10139;
            ((C14286) frameLayout).m34694(c10139);
        }
        if (bundle != null && bundle.getBoolean("fullscreen")) {
            z = true;
        }
        activityC3846.m12436(z);
        if (activityC3846.f13140.f77608) {
            if (activityC3846.f13140.f77624 == null) {
                uriM41984 = C3198.m10527(activityC3846.f13140.f77602, activityC3846, activityC3846.f13140.f77614, activityC3846.f13140.f77625, activityC3846.f13140.f77611);
            } else {
                uriM41984 = C3198.m10528(activityC3846.f13140.f77602, activityC3846, activityC3846.f13140.f77624);
            }
        } else {
            uriM41984 = C18004.m41984(activityC3846.f13140.f77620, activityC3846.f13140.f77612);
        }
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("web_view");
        WebBackForwardList webBackForwardListRestoreState = bundle2 == null ? null : activityC3846.f13116.restoreState(bundle2);
        if (webBackForwardListRestoreState == null) {
            activityC3846.f13117 = uriM41984.toString();
            activityC3846.m12400(uriM41984);
            activityC3846.f13116.loadUrl(uriM41984.toString());
        } else {
            WebHistoryItem currentItem = webBackForwardListRestoreState.getCurrentItem();
            String url = currentItem == null ? null : currentItem.getUrl();
            activityC3846.m12400(url != null ? Uri.parse(url) : null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12410(ActivityC3846 activityC3846, View view, MotionEvent motionEvent) {
        if (activityC3846.f13108 != null && motionEvent.getActionMasked() == 0) {
            activityC3846.f13108.m26199();
        }
        activityC3846.f13147.onTouch(view, motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12405(ActivityC3846 activityC3846, int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            C10139 c10139 = activityC3846.f13108;
            if (c10139 == null || !c10139.m26207()) {
                activityC3846.m12438();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12412(ActivityC3846 activityC3846, WebView webView, String str) {
        if (activityC3846.f13116 != webView || activityC3846.isFinishing() || activityC3846.isDestroyed()) {
            return;
        }
        activityC3846.m12432(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12416(ActivityC3846 activityC3846, String str, String str2, String str3, String str4, long j) {
        activityC3846.f13109 = null;
        activityC3846.f13129.m40557(str, str2, str3, str4, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12401(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        if (C11972.m30031("ALGORITHMIC_DARKENING")) {
            C10900.m27666(settings);
        }
        if (C11972.m30031("FORCE_DARK") && C11972.m30031("FORCE_DARK_STRATEGY")) {
            C10900.m27665(settings);
            C10900.m27664(settings, z ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m12470(ActivityC3846 activityC3846, Uri uri) {
        C23984 c23984;
        if (!activityC3846.f13148 || activityC3846.isFinishing() || activityC3846.isDestroyed() || (c23984 = activityC3846.f13140) == null || !(c23984.f77614 instanceof AbstractC18881)) {
            return;
        }
        if (C18004.m41986(uri, activityC3846.f13140.f77620) || C3198.m10530(uri, activityC3846.f13140.f77602)) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12400(Uri uri) {
        C3100 c3100M12395 = m12395(uri, this.f13140.f77620, this.f13140.f77608 ? this.f13140.f77602 : null, this.f13123);
        m12403(c3100M12395);
        C16390 c16390 = this.f56046;
        if (c16390 != null) {
            c16390.setSubtitle(c3100M12395.f10025);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12463(ActivityC3846 activityC3846, WebView webView, String str) {
        Uri uriM12392 = m12392(str, webView.getUrl());
        if (uriM12392 != null) {
            activityC3846.m12400(uriM12392);
            if (activityC3846.f13123.f10024) {
                String strM12431 = m12431(uriM12392);
                synchronized (activityC3846.f13112) {
                    C20254 c20254 = activityC3846.f13122;
                    if (c20254 != null && c20254.f65039.equals(strM12431)) {
                        activityC3846.f13122 = null;
                        boolean zM46529 = c20254.m46529(strM12431);
                        if (zM46529) {
                            activityC3846.m12442();
                            webView.reload();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m12468(Uri uri) {
        C3100 c3100 = this.f13123;
        C3100 c3100M12395 = m12395(uri, this.f13140.f77620, this.f13140.f77608 ? this.f13140.f77602 : null, c3100);
        if (uri != null && !c3100.f10024 && c3100M12395.f10024) {
            String strM12431 = m12431(uri);
            synchronized (this.f13112) {
                C20254 c20254 = this.f13122;
                if (c20254 == null || !c20254.f65039.equals(strM12431)) {
                    this.f13122 = new C20254(strM12431);
                    return;
                }
                return;
            }
        }
        if (!c3100M12395.f10024 || c3100.f10024) {
            m12456();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public void m12456() {
        synchronized (this.f13112) {
            this.f13122 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12462(ActivityC3846 activityC3846, Uri uri) {
        C3100 c3100M12395 = m12395(uri, activityC3846.f13140.f77620, activityC3846.f13140.f77608 ? activityC3846.f13140.f77602 : null, activityC3846.f13123);
        if (!activityC3846.f13121 || c3100M12395.f10024) {
            return;
        }
        activityC3846.m12403(c3100M12395);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12403(C3100 c3100) {
        C23984 c23984;
        boolean z = this.f13121;
        boolean z2 = c3100.f10024;
        boolean z3 = z2 && !z;
        this.f13121 = z2;
        this.f13123 = c3100;
        WebView webView = this.f13116;
        if (webView != null) {
            webView.getSettings().setMixedContentMode(!c3100.f10024 ? 1 : 0);
        }
        if (!z3 || (c23984 = this.f13140) == null) {
            return;
        }
        setTitle(c23984.f77604);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m12459(Uri uri) {
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
    public static C3100 m12395(Uri uri, String str, String str2, C3100 c3100) {
        String strM12459;
        boolean zM41986 = C18004.m41986(uri, str);
        C3100 c3101 = f13102;
        if (zM41986 || C3198.m10530(uri, str2)) {
            return c3101;
        }
        String scheme = uri == null ? null : uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String strM124510 = m12459(uri);
                if (strM124510 == null) {
                    return f13105;
                }
                return new C3100(false, strM124510);
            }
            if (lowerCase.equals("blob")) {
                Uri uri2 = Uri.parse(uri.toString().substring(scheme.length() + 1));
                if (C18004.m41986(uri2, str)) {
                    return c3101;
                }
                String scheme2 = uri2.getScheme();
                if (scheme2 != null && ((scheme2.equalsIgnoreCase(a.s) || scheme2.equalsIgnoreCase(b.a)) && (strM12459 = m12459(uri2)) != null)) {
                    return new C3100(false, strM12459);
                }
                return new C3100(false, "blob:");
            }
            if (lowerCase.equals(e.m) || lowerCase.equals("about")) {
                return new C3100(false, lowerCase.concat(":"));
            }
        }
        return c3100;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12394(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m12392(String str, String str2) {
        if (str == null || !str.equals(str2)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null) {
            return null;
        }
        return uri;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m12431(Uri uri) {
        return uri.buildUpon().fragment(null).build().toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12411(ActivityC3846 activityC3846, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        if (!activityC3846.isFinishing() && !activityC3846.isDestroyed() && !activityC3846.f13126) {
            if (mode == 0 || mode == 1) {
                activityC3846.f13111 = valueCallback;
                activityC3846.f13126 = true;
                activityC3846.f13136 = mode == 1;
                try {
                    activityC3846.f13150.m10999(new Intent(activityC3846, (Class<?>) ViewOnClickListenerC11499.class).setAction("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", activityC3846.f13136).putExtra("android.intent.extra.MIME_TYPES", fileChooserParams.getAcceptTypes()));
                    return;
                } catch (RuntimeException unused) {
                    activityC3846.f13126 = false;
                    ValueCallback valueCallback2 = activityC3846.f13111;
                    activityC3846.f13111 = null;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(null);
                    }
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
            }
        }
        valueCallback.onReceiveValue(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12406(ActivityC3846 activityC3846, int i, Intent intent) {
        activityC3846.f13126 = false;
        ValueCallback valueCallback = activityC3846.f13111;
        Uri[] uriArr = null;
        activityC3846.f13111 = null;
        if (valueCallback == null) {
            return;
        }
        if (i == -1 && intent != null && !activityC3846.isFinishing() && !activityC3846.isDestroyed()) {
            ArrayList<Uri> arrayList = new ArrayList();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                int itemCount = activityC3846.f13136 ? clipData.getItemCount() : Math.min(1, clipData.getItemCount());
                for (int i2 = 0; i2 < itemCount; i2++) {
                    arrayList.add(clipData.getItemAt(i2).getUri());
                }
            } else if (intent.getData() != null) {
                arrayList.add(intent.getData());
            }
            boolean z = !arrayList.isEmpty();
            for (Uri uri : arrayList) {
                if (uri == null || !"content".equals(uri.getScheme()) || !C17568.f57086.equals(uri.getAuthority())) {
                    z = false;
                    break;
                }
            }
            if (z) {
                uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            }
        }
        valueCallback.onReceiveValue(uriArr);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static void m12427(ActivityC3846 activityC3846) {
        ValueCallback valueCallback = activityC3846.f13111;
        activityC3846.f13111 = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m12444(ActivityC3846 activityC3846, String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() != null) {
                C3100 c3100M12395 = m12395(uri, activityC3846.f13140.f77620, activityC3846.f13140.f77608 ? activityC3846.f13140.f77602 : null, activityC3846.f13123);
                return c3100M12395.f10024 ? activityC3846.f13140.f77604 : c3100M12395.f10025;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16524 m12397(String str, JsResult jsResult) {
        if (str == null || isFinishing() || isDestroyed() || this.f13118 || this.f13127.f56258 || this.f13146 != null) {
            jsResult.cancel();
            return null;
        }
        C17270 c17270 = this.f13127;
        if (c17270.f56259 < 0 || SystemClock.elapsedRealtime() - c17270.f56259 > 5000) {
            c17270.f56260 = 0;
        }
        c17270.f56260 = Math.min(3, c17270.f56260 + 1);
        C16524 c16524 = new C16524(this, c17270, jsResult);
        this.f13146 = c16524;
        return c16524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12414(ActivityC3846 activityC3846, String str, String str2, JsResult jsResult, boolean z) {
        final C16524 c16524M12397 = activityC3846.m12397(str, jsResult);
        if (c16524M12397 == null) {
            return;
        }
        C2361 c2361BuildDialog = activityC3846.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(str2);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7025(0, c16524M12397));
        if (z) {
            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۡ֫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3100 c3100 = ActivityC3846.f13105;
                    c16524M12397.m39150(null, false, true);
                }
            });
        }
        if (c16524M12397.f53495 != null) {
            FrameLayout frameLayout = (FrameLayout) activityC3846.m40395(R.layout.MT_Protector);
            frameLayout.addView(c16524M12397.f53495, new FrameLayout.LayoutParams(-1, -2));
            c2361BuildDialog.m8005(frameLayout);
        }
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        C16524.m39152(c16524M12397, dialogInterfaceC8327M7999);
        dialogInterfaceC8327M7999.m22432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12415(ActivityC3846 activityC3846, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C16524 c16524M12397 = activityC3846.m12397(str, jsPromptResult);
        if (c16524M12397 == null) {
            return;
        }
        C1609 c1609 = new C1609(activityC3846, c16524M12397);
        C16524.m39152(c16524M12397, c1609.m22956());
        c1609.m22945(R.string.MT_Protector);
        c1609.m22924((CharSequence) str3);
        c1609.m22959();
        c1609.m22950();
        if (str2 != null && !str2.isEmpty()) {
            c1609.m22949(str2);
        }
        if (c16524M12397.f53495 != null) {
            c1609.m22941().setVisibility(0);
            c1609.m22941().addView(c16524M12397.f53495, new FrameLayout.LayoutParams(-1, -2));
        }
        c1609.m22955(true);
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        TextView textView = (TextView) c1609.m22956().m22423(R.id.MT_Protector);
        TextView textView2 = (TextView) c1609.m22956().m22423(R.id.title);
        textView.setTextSize(16.0f);
        textView.setTextColor(textView2.getTextColors());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m12451(ActivityC3846 activityC3846) {
        C16524 c16524 = activityC3846.f13146;
        if (c16524 != null) {
            c16524.m39150(null, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m12393(ActivityC3846 activityC3846, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean zEqualsIgnoreCase;
        WebResourceResponse webResourceResponseM6736;
        C7847 c7847;
        C6990 c6990;
        Uri url = webResourceRequest.getUrl();
        String method = webResourceRequest.getMethod();
        if (webResourceRequest.isForMainFrame()) {
            activityC3846.m12468(url);
            C3100 c3100 = activityC3846.f13123;
            C3100 c3100M12395 = m12395(url, activityC3846.f13140.f77620, activityC3846.f13140.f77608 ? activityC3846.f13140.f77602 : null, c3100);
            if (!c3100.f10024 || c3100M12395.f10024) {
                c3100M12395 = c3100;
            }
            if (c3100M12395 != c3100) {
                activityC3846.f13123 = c3100M12395;
            }
        }
        if (C18004.m41986(url, activityC3846.f13140.f77620)) {
            synchronized (activityC3846.f13112) {
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                C3100 c3101 = activityC3846.f13123;
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String str = activityC3846.f13140.f77620;
                C20254 c20254 = activityC3846.f13122;
                z = false;
                if (!zIsForMainFrame && !c3101.f10024) {
                    String strM12394 = m12394("Sec-Fetch-Site", requestHeaders);
                    if (strM12394 != null) {
                        zEqualsIgnoreCase = "same-origin".equalsIgnoreCase(strM12394);
                    } else {
                        String strM12395 = m12394("Referer", requestHeaders);
                        zEqualsIgnoreCase = strM12395 != null && C18004.m41986(Uri.parse(strM12395), str);
                    }
                }
                if (!zEqualsIgnoreCase) {
                    if (c20254 != null) {
                        if (m12394("Sec-Fetch-Site", requestHeaders) == null && m12394("Referer", requestHeaders) == null) {
                            z = true;
                        }
                        if (z) {
                            c20254.m46528();
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                return C0851.m3474(403, "Forbidden");
            }
            if (!"GET".equalsIgnoreCase(method)) {
                return C0851.m3474(405, "Method Not Allowed");
            }
            if (activityC3846.f13140.f77610 >= 0 && url.getPath() != null && url.getPath().startsWith("/_mt_markdown_vendor_/")) {
                if (!webResourceRequest.isForMainFrame() && (c6990 = activityC3846.f13114) != null) {
                    return c6990.m19299(url.getPath());
                }
                return C0851.m3474(404, "Not Found");
            }
            if (webResourceRequest.isForMainFrame() && (c7847 = activityC3846.f13131) != null) {
                return c7847.m21370(url);
            }
            if (webResourceRequest.isForMainFrame() && (activityC3846.f13140.f77614 instanceof AbstractC18881) && url.getPath() != null) {
                webResourceResponseM6736 = activityC3846.f13124.m3480(url.getPath());
            } else {
                webResourceResponseM6736 = activityC3846.f13141.m6736(url);
            }
            return webResourceResponseM6736 == null ? C0851.m3474(404, "Not Found") : webResourceResponseM6736;
        }
        if (activityC3846.f13140.f77608 && C3198.m10530(url, activityC3846.f13140.f77602)) {
            if (webResourceRequest.isForMainFrame() && "GET".equalsIgnoreCase(method) && (activityC3846.f13140.f77614 instanceof AbstractC18881)) {
                C3198.m10532(activityC3846.f13140.f77602);
            }
            if (!webResourceRequest.isForMainFrame() || !"GET".equalsIgnoreCase(method)) {
                return C0851.m3474(403, "Forbidden");
            }
        } else {
            String scheme = url.getScheme();
            if ("content".equalsIgnoreCase(scheme) || "file".equalsIgnoreCase(scheme)) {
                return C0851.m3474(403, "Forbidden");
            }
            if (webResourceRequest.isForMainFrame() && activityC3846.m12455(url)) {
                return C0851.m3474(403, "Forbidden");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m12455(Uri uri) {
        String str = this.f13140.f77620;
        String str2 = null;
        String str3 = this.f13140.f77608 ? this.f13140.f77602 : null;
        if (C18004.m41986(uri, str) || C3198.m10530(uri, str3)) {
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12424(ActivityC3846 activityC3846) {
        C10139 c10139 = activityC3846.f13108;
        if (c10139 != null) {
            c10139.m26208();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3977 m12396(ActivityC3846 activityC3846, View view, C3977 c3977) {
        C13275 c13275M12817 = c3977.m12817((activityC3846.f13134 ? 0 : 7) | 128);
        view.setPadding(c13275M12817.f42407, c13275M12817.f42408, c13275M12817.f42406, Math.max(c13275M12817.f42405, c3977.m12817(8).f42405));
        activityC3846.f13147.m20715(c3977.m12817(7));
        return C3977.f13623;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m12436(boolean z) {
        this.f13134 = z;
        this.f56046.setVisibility(z ? 8 : 0);
        this.f13115.setVisibility((!this.f13148 || z) ? 8 : 0);
        this.f13147.m20716(z);
        m12466();
        C22666.m51079(this.f13119);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m12466() {
        C18893 c18893M40417 = m40417();
        if (this.f13134) {
            c18893M40417.m43815(2);
            c18893M40417.m43811(7);
        } else {
            c18893M40417.m43815(1);
            c18893M40417.m43814(7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f13134) {
            m12466();
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f13119 != null) {
            this.f13147.m20716(this.f13134);
            m12466();
            C22666.m51079(this.f13119);
        }
        WebView webView = this.f13116;
        if (webView != null) {
            m12432(webView.getUrl());
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f13120 = menu.findItem(R.id.MT_Protector);
        m12389();
        this.f13133 = menu.findItem(R.id.MT_Protector);
        this.f13137 = menu.findItem(R.id.MT_Protector);
        m12425();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public void m12389() {
        C10139 c10139 = this.f13108;
        boolean z = c10139 != null && c10139.m26206();
        MenuItem menuItem = this.f13120;
        if (menuItem != null) {
            C23984 c23984 = this.f13140;
            menuItem.setVisible(c23984 != null && c23984.f77610 >= 0);
            this.f13120.setEnabled(z);
        }
        View viewM40418 = m40418(R.id.MT_Protector);
        if (viewM40418 != null) {
            viewM40418.setVisibility(z ? 0 : 8);
        }
        View viewM40419 = m40418(R.id.MT_Protector);
        if (viewM40419 != null) {
            ViewGroup.LayoutParams layoutParams = viewM40419.getLayoutParams();
            layoutParams.width = Math.round((z ? 96 : 48) * getResources().getDisplayMetrics().density);
            viewM40419.setLayoutParams(layoutParams);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f13116 == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C10139 c10139 = this.f13108;
            if (c10139 != null) {
                c10139.m26208();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            if (this.f13116.canGoBack()) {
                m12442();
                this.f13116.goBack();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            if (this.f13116.canGoForward()) {
                m12442();
                this.f13116.goForward();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            View viewFindViewById = this.f56046.findViewById(R.id.MT_Protector);
            if (viewFindViewById != null) {
                Context context = viewFindViewById.getContext();
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof C17531) {
                    C17531 c17531 = (C17531) parent;
                    context = c17531.getContext();
                    int iM41176 = c17531.m41176();
                    if (iM41176 != 0) {
                        context = new C9370(context, iM41176);
                    }
                }
                C18452 c18452 = new C18452(context, viewFindViewById, 8388611, R.attr.MT_Protector);
                C9898 c9898M42995 = c18452.m42995();
                this.f13144 = c9898M42995.add(0, 1, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                this.f13128 = c9898M42995.add(0, 2, 1, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c9898M42995.add(0, 8, 2, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c9898M42995.add(0, 5, 3, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                if (this.f13140.f77610 < 0) {
                    this.f13113 = c9898M42995.add(0, 3, 4, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                if (m12446() != null) {
                    c9898M42995.add(0, 7, 5, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c9898M42995.add(0, 6, 6, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c9898M42995.add(0, 4, 7, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c18452.m42997();
                c18452.m42994(new C4592(this));
                c18452.m42993(new InterfaceC14722() { // from class: l.᩷ۖ֫
                    @Override // l.InterfaceC14722
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo18051(C18452 c18453) {
                        ActivityC3846.m12418(this.f69356, c18453);
                    }
                });
                Context context2 = viewFindViewById.getContext();
                ViewParent parent2 = viewFindViewById.getParent();
                if (parent2 instanceof C17531) {
                    C17531 c17532 = (C17531) parent2;
                    context2 = c17532.getContext();
                    int iM41177 = c17532.m41176();
                    if (iM41177 != 0) {
                        context2 = new C9370(context2, iM41177);
                    }
                }
                View viewInflate = LayoutInflater.from(context2).inflate(R.layout.MT_Protector, (ViewGroup) null, false);
                this.f13125 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f13135 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
                this.f13110 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f13125.setOnClickListener(new ViewOnClickListenerC17343(this, 1));
                this.f13110.setOnClickListener(new ViewOnClickListenerC12790(4, this));
                this.f13139 = c18452;
                m12425();
                C19198.m44469(c18452, this.f13149 + "%", viewInflate);
            }
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12418(ActivityC3846 activityC3846, C18452 c18452) {
        if (activityC3846.f13139 == c18452) {
            activityC3846.f13139 = null;
            activityC3846.f13144 = null;
            activityC3846.f13128 = null;
            activityC3846.f13113 = null;
            activityC3846.f13125 = null;
            activityC3846.f13135 = null;
            activityC3846.f13110 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12423(ActivityC3846 activityC3846, MenuItem menuItem) {
        boolean zM21368 = false;
        if (activityC3846.f13116 != null) {
            if (menuItem.getItemId() == 1) {
                activityC3846.m12442();
                activityC3846.f13116.reload();
                return true;
            }
            if (menuItem.getItemId() == 2) {
                activityC3846.f13109 = null;
                activityC3846.m12456();
                activityC3846.f13116.stopLoading();
                if (activityC3846.f13140.f77614 instanceof AbstractC18881) {
                    activityC3846.f13124.m3479();
                    C3198.m10532(activityC3846.f13140.f77602);
                }
                activityC3846.m12460(100, false);
                activityC3846.f13145.m19023();
                return true;
            }
            if (menuItem.getItemId() == 5) {
                activityC3846.m12436(true);
                return true;
            }
            if (menuItem.getItemId() == 8) {
                C10139 c10139 = activityC3846.f13108;
                if (c10139 != null) {
                    c10139.m26200();
                }
                activityC3846.f13145.m19024();
                return true;
            }
            if (menuItem.getItemId() == 3) {
                if (activityC3846.m12473()) {
                    activityC3846.f13142.m34680(C23434.m52629(activityC3846));
                    return true;
                }
            } else {
                if (menuItem.getItemId() == 6) {
                    C2343 c2343 = activityC3846.f13140.f77623;
                    String str = activityC3846.f13140.f77613;
                    String str2 = activityC3846.f13117;
                    Uri uri = str2 != null ? Uri.parse(str2) : null;
                    if (C18004.m41986(uri, activityC3846.f13140.f77620)) {
                        if (!activityC3846.f13140.f77612.equals(C18004.m41985(uri.getPath()))) {
                            zM21368 = C7847.m21368(uri.getPath());
                        } else if (activityC3846.f13140.f77610 >= 0) {
                            zM21368 = true;
                        }
                    } else if (activityC3846.f13140.f77610 >= 0) {
                        zM21368 = true;
                    }
                    C0215.m1662(activityC3846, c2343, str, zM21368, new C11296(1, activityC3846));
                    return true;
                }
                if (menuItem.getItemId() != 7) {
                    if (menuItem.getItemId() == 4) {
                        activityC3846.finish();
                        return true;
                    }
                } else {
                    Uri uriM12446 = activityC3846.m12446();
                    if (uriM12446 != null) {
                        if (activityC3846.f13140.f77609 != null && (activityC3846.f13140.f77608 || activityC3846.f13140.f77612.equals(C18004.m41985(uriM12446.getPath())))) {
                            activityC3846.setResult(-1, new Intent().putExtra("preview_editor_state", activityC3846.f13140.f77609));
                            activityC3846.finish();
                            return true;
                        }
                        new C11303(activityC3846, activityC3846.f13124, uriM12446).m8197();
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m12434(ActivityC3846 activityC3846, WebView webView, String str) {
        String str2 = activityC3846.f13109;
        if (str2 != null) {
            if (m12392(str, str2) == null && m12392(str, webView.getUrl()) == null) {
                return;
            }
            activityC3846.f13117 = activityC3846.f13109;
            activityC3846.f13109 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public Uri m12446() {
        WebView webView;
        if (this.f13140 == null || (webView = this.f13116) == null || webView.getUrl() == null || this.f13117 == null || this.f13109 != null) {
            return null;
        }
        Uri uri = Uri.parse(this.f13116.getUrl());
        Uri uri2 = Uri.parse(this.f13117);
        if (this.f13140.f77608) {
            if (!C3198.m10530(uri2, this.f13140.f77602) || !C3198.m10530(uri, this.f13140.f77602)) {
                return null;
            }
            if (this.f13140.f77609 != null || this.f13140.f77611) {
                return uri2;
            }
            return null;
        }
        if (!C18004.m41986(uri2, this.f13140.f77620) || !C18004.m41986(uri, this.f13140.f77620)) {
            return null;
        }
        if (this.f13140.f77609 != null && (this.f13140.f77608 || this.f13140.f77612.equals(C18004.m41985(uri2.getPath())))) {
            return uri2;
        }
        if (this.f13140.f77611 && this.f13140.f77622 && C18004.m41985(uri2.getPath()) != null) {
            return uri2;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12413(ActivityC3846 activityC3846, String str) {
        C23984 c23984 = activityC3846.f13140;
        if (c23984 == null || c23984.f77623 == null || activityC3846.isFinishing() || activityC3846.isDestroyed()) {
            return;
        }
        new C13529(C21576.f68931).m33235(activityC3846.f13140.f77623, str, true);
        if (str.equals(activityC3846.f13140.f77613)) {
            return;
        }
        activityC3846.f13140.f77606 = str;
        activityC3846.recreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m12465(boolean z) {
        int i;
        if (this.f13116 == null) {
            return;
        }
        int i2 = this.f13149;
        int[] iArr = f13103;
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
                    i = f13104;
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
                    i = f13107;
                    break;
                }
            }
        }
        if (i == i2) {
            return;
        }
        m12467(i);
        m12438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public void m12438() {
        WebView webView = this.f13116;
        if (webView == null || webView.getWidth() <= 0) {
            return;
        }
        int iMax = Math.max(1, Math.round(this.f13116.getWidth() / this.f13116.getResources().getDisplayMetrics().density));
        WebView webView2 = this.f13116;
        StringBuilder sbM12235 = C3769.m12235(m12430(this.f13149), "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key='__mt_html_preview_viewport_7d26a6c9__';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content='',metas=head.getElementsByTagName('meta');for(var i=0;i<metas.length;i++){if((metas[i].name||'').toLowerCase()==='viewport'){nodes.push(metas[i]);content=metas[i].getAttribute('content')||'';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement('meta');meta.name='viewport';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content='width='+width+',initial-scale='+scale+',minimum-scale='+Math.min(scale,0.1)+',maximum-scale='+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute('content',content);}})(", ",");
        sbM12235.append(Math.max(1, iMax));
        sbM12235.append(");");
        webView2.evaluateJavascript(sbM12235.toString(), null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m12467(int i) {
        int iM12430 = m12430(i);
        this.f13149 = iM12430;
        TextView textView = this.f13135;
        if (textView != null) {
            textView.setText(iM12430 + "%");
        }
        FrameLayout frameLayout = this.f13125;
        if (frameLayout != null) {
            frameLayout.setEnabled(this.f13149 > f13107);
        }
        FrameLayout frameLayout2 = this.f13110;
        if (frameLayout2 != null) {
            frameLayout2.setEnabled(this.f13149 < f13104);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m12430(int i) {
        int iMin = Math.min(f13104, i);
        int i2 = f13107;
        int iMax = Math.max(i2, iMin);
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = f13103[i3];
            if (Math.abs(i4 - iMax) < Math.abs(i2 - iMax)) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void onBackPressed() {
        C10139 c10139 = this.f13108;
        if (c10139 == null || !c10139.m26209()) {
            C6830 c6830 = this.f13145;
            if (c6830 == null || !c6830.m19022()) {
                C14274 c14274 = this.f13142;
                if (c14274 == null || !c14274.m34681(new RunnableC22205(2, this))) {
                    WebView webView = this.f13116;
                    if (webView != null && webView.canGoBack()) {
                        m12442();
                        this.f13116.goBack();
                    } else {
                        super.onBackPressed();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m12469(ActivityC3846 activityC3846) {
        WebView webView = activityC3846.f13116;
        if (webView != null && webView.canGoBack()) {
            activityC3846.m12442();
            activityC3846.f13116.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m12460(int i, boolean z) {
        this.f13148 = z;
        ProgressBar progressBar = this.f13115;
        if (progressBar != null) {
            progressBar.setProgress(i);
            this.f13115.setVisibility((!z || this.f13134) ? 8 : 0);
        }
        m12425();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m12425() {
        MenuItem menuItem = this.f13133;
        boolean z = false;
        if (menuItem != null) {
            WebView webView = this.f13116;
            menuItem.setEnabled(webView != null && webView.canGoBack());
        }
        MenuItem menuItem2 = this.f13137;
        if (menuItem2 != null) {
            WebView webView2 = this.f13116;
            if (webView2 != null && webView2.canGoForward()) {
                z = true;
            }
            menuItem2.setEnabled(z);
        }
        MenuItem menuItem3 = this.f13144;
        if (menuItem3 != null) {
            menuItem3.setVisible(!this.f13148);
        }
        MenuItem menuItem4 = this.f13128;
        if (menuItem4 != null) {
            menuItem4.setVisible(this.f13148);
        }
        MenuItem menuItem5 = this.f13113;
        if (menuItem5 != null) {
            menuItem5.setEnabled(m12473());
        }
        m12467(this.f13149);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private boolean m12473() {
        C23984 c23984;
        WebView webView = this.f13116;
        String url = webView == null ? null : webView.getUrl();
        return (url == null || (c23984 = this.f13140) == null || c23984.f77610 >= 0 || C3198.m10530(Uri.parse(url), this.f13140.f77602)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m12432(String str) {
        String str2;
        JSONObject jSONObjectM44118;
        if (this.f13116 == null || !m12471(str) || this.f13116.getUrl() == null || !m12431(Uri.parse(str)).equals(m12431(Uri.parse(this.f13116.getUrl())))) {
            return;
        }
        boolean zM52629 = C23434.m52629(this);
        this.f13116.setBackgroundColor(zM52629 ? Color.rgb(13, 17, 23) : -1);
        m12401(this.f13116, zM52629);
        final Bundle bundle = null;
        final String string = Uri.parse(str).buildUpon().fragment(null).build().toString();
        int i = string.equals(C18004.m41984(this.f13140.f77620, this.f13140.f77612).toString()) ? this.f13140.f77610 : 0;
        String strM52216 = C23238.m52216(this.f13138, string);
        Bundle bundle2 = this.f13143;
        if (bundle2 != null && string.equals(bundle2.getString("url"))) {
            bundle = this.f13143;
        }
        if (bundle == null) {
            str2 = "null";
        } else {
            str2 = "{x:" + bundle.getFloat("x") + ",y:" + bundle.getFloat("y") + l.d;
        }
        String str3 = (String) this.f13140.f77605.get(string);
        String string2 = (bundle == null && Uri.parse(str).getFragment() == null && (jSONObjectM44118 = new C19034(C21576.f68931).m44118(m12452(str))) != null) ? jSONObjectM44118.toString() : "null";
        String strQuote = str3 != null ? JSONObject.quote(str3) : "null";
        C10139 c10139 = this.f13108;
        final int iM26211 = c10139 != null ? c10139.m26211() : -1;
        WebView webView = this.f13116;
        StringBuilder sb = new StringBuilder("(function(){if(location.href.split('#')[0]!==");
        sb.append(JSONObject.quote(string));
        sb.append("||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply(");
        sb.append(zM52629);
        sb.append(",");
        sb.append(i);
        sb.append(",");
        sb.append(str2);
        sb.append(",");
        sb.append(strQuote);
        sb.append(",function(state){window.__mtMarkdownState.save(");
        sb.append(JSONObject.quote(strM52216));
        sb.append(",state);},");
        webView.evaluateJavascript(C8947.m23910(sb, string2, ");return true;})()"), new ValueCallback() { // from class: l.ᩳۡ֫
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ActivityC3846.m12409(this.f61465, bundle, string, iM26211, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12409(ActivityC3846 activityC3846, Bundle bundle, String str, int i, String str2) {
        if ("true".equals(str2)) {
            if (activityC3846.f13143 == bundle) {
                activityC3846.f13143 = null;
            }
            C10139 c10139 = activityC3846.f13108;
            if (c10139 != null) {
                c10139.m26201(i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m12471(String str) {
        C23984 c23984 = this.f13140;
        if (c23984 != null && c23984.f77610 >= 0 && str != null) {
            Uri uri = Uri.parse(str);
            if (C18004.m41986(uri, this.f13140.f77620)) {
                if (("/" + this.f13140.f77612).equals(uri.getPath())) {
                    return true;
                }
                if (this.f13140.f77622 && C7847.m21368(uri.getPath())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m12452(String str) {
        String strM41987;
        if (m12471(str) && this.f13140.f77624 == null && (strM41987 = C18004.m41987(this.f13140.f77613, C18004.m41985(Uri.parse(str).getPath()))) != null) {
            return C19034.m44115(this.f13140.f77623, strM41987);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public void m12442() {
        String url;
        String strM12452;
        WebView webView = this.f13116;
        if (webView == null || this.f13138 == null || (strM12452 = m12452((url = webView.getUrl()))) == null) {
            return;
        }
        String string = Uri.parse(url).buildUpon().fragment(null).build().toString();
        if (C23238.m52218(this.f13138, string)) {
            float fMax = Math.max(0.01f, this.f13116.getScale());
            new C19034(C21576.f68931).m44119(strM12452, this.f13116.getScrollX() / fMax, this.f13116.getScrollY() / fMax, (String) this.f13140.f77605.get(string));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m12453(ActivityC3846 activityC3846, String str) {
        Uri uri = Uri.parse(str);
        StringBuilder sb = new StringBuilder("/");
        sb.append(activityC3846.f13140.f77612);
        return sb.toString().equals(uri.getPath()) ? activityC3846.f13140.f77604 : uri.getLastPathSegment();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        m12442();
        WebView webView = this.f13116;
        if (webView != null) {
            webView.onPause();
        }
        ViewOnTouchListenerC7575 viewOnTouchListenerC7575 = this.f13147;
        if (viewOnTouchListenerC7575 != null) {
            viewOnTouchListenerC7575.m20716(false);
        }
        super.onPause();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC7575 viewOnTouchListenerC7575 = this.f13147;
        if (viewOnTouchListenerC7575 != null) {
            viewOnTouchListenerC7575.m20716(this.f13134);
        }
        WebView webView = this.f13116;
        if (webView != null) {
            webView.onResume();
            m12432(this.f13116.getUrl());
        }
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f13116 != null) {
            Bundle bundle2 = new Bundle();
            this.f13116.saveState(bundle2);
            bundle.putBundle("web_view", bundle2);
            if (m12471(this.f13116.getUrl())) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("url", Uri.parse(this.f13116.getUrl()).buildUpon().fragment(null).build().toString());
                float fMax = Math.max(0.01f, this.f13116.getScale());
                bundle3.putFloat("x", this.f13116.getScrollX() / fMax);
                bundle3.putFloat("y", this.f13116.getScrollY() / fMax);
                bundle.putBundle("markdown_scroll", bundle3);
            }
        }
        C3100 c3100 = this.f13123;
        bundle.putBoolean("preview_resources_allowed", c3100.f10024);
        bundle.putString("source_label", c3100.f10025);
        bundle.putInt("zoom_percent", this.f13149);
        bundle.putString("editing_document_url", this.f13117);
        bundle.putBoolean("fullscreen", this.f13134);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        C23984 c23984;
        this.f13118 = true;
        C10139 c10139 = this.f13108;
        if (c10139 != null) {
            c10139.m26204();
        }
        C6830 c6830 = this.f13145;
        if (c6830 != null) {
            c6830.m19025();
        }
        C16524 c16524 = this.f13146;
        if (c16524 != null) {
            c16524.m39150(null, false, false);
        }
        C17258 c17258 = this.f13129;
        if (c17258 != null) {
            c17258.m40555();
        }
        C9811 c9811 = this.f13130;
        if (c9811 != null) {
            c9811.m25570();
        }
        ValueCallback valueCallback = this.f13111;
        this.f13111 = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        ViewOnTouchListenerC7575 viewOnTouchListenerC7575 = this.f13147;
        if (viewOnTouchListenerC7575 != null) {
            viewOnTouchListenerC7575.m20716(false);
        }
        C14274 c14274 = this.f13142;
        if (c14274 != null) {
            c14274.m34679();
        }
        C23238 c23238 = this.f13138;
        if (c23238 != null) {
            C23238.m52217(c23238);
            WebView webView = this.f13116;
            if (webView != null) {
                webView.removeJavascriptInterface("__mtMarkdownState");
            }
        }
        C18452 c18452 = this.f13139;
        if (c18452 != null) {
            c18452.m42991();
            this.f13139 = null;
        }
        C23984 c23985 = this.f13140;
        C3198.m10531(c23985 == null ? null : c23985.f77602);
        m12456();
        WebView webView2 = this.f13116;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        C7847 c7847 = this.f13131;
        if (c7847 != null) {
            c7847.close();
        }
        C0851 c0851 = this.f13124;
        if (c0851 != null) {
            c0851.close();
            this.f13124 = null;
        }
        WebView webView3 = this.f13116;
        if (webView3 != null) {
            webView3.setWebChromeClient(null);
            this.f13116.setWebViewClient(new WebViewClient());
            this.f13116.clearHistory();
            ViewGroup viewGroup = (ViewGroup) this.f13116.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f13116);
            }
            this.f13116.destroy();
            this.f13116 = null;
        }
        if (!isChangingConfigurations() && (c23984 = this.f13140) != null) {
            f13106.remove(this.f13132, c23984);
            this.f13140.close();
            this.f13140 = null;
        }
        super.onDestroy();
    }
}
