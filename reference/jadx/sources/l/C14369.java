package l;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;

/* JADX INFO: renamed from: l.ܳۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51SZ */
/* JADX INFO: loaded from: classes3.dex */
public class C14369 extends WebView {
    public C14369(Context context) {
        super(Build.VERSION.SDK_INT < 23 ? context.createConfigurationContext(new Configuration()) : context);
    }

    public C14369(Context context, AttributeSet attributeSet) {
        super(Build.VERSION.SDK_INT < 23 ? context.createConfigurationContext(new Configuration()) : context, attributeSet);
    }

    public C14369(Context context, AttributeSet attributeSet, int i) {
        super(Build.VERSION.SDK_INT < 23 ? context.createConfigurationContext(new Configuration()) : context, attributeSet, i);
    }
}
