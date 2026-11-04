package l;

import android.webkit.WebView;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9261 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f30120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WebView f30121;

    public /* synthetic */ C9261(ActivityC3846 activityC3846, WebView webView) {
        this.f30120 = activityC3846;
        this.f30121 = webView;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        final String str = (String) obj;
        C3100 c3100 = ActivityC3846.f13105;
        final ActivityC3846 activityC3846 = this.f30120;
        final WebView webView = this.f30121;
        activityC3846.runOnUiThread(new Runnable() { // from class: l.۠ۡ֫
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC3846.m12412(activityC3846, webView, str);
            }
        });
    }
}
