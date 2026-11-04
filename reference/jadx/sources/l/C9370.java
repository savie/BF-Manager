package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D5UJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9370 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Configuration f30437;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f30438;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Resources f30439;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Configuration f30441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Resources.Theme f30442;

    public C9370() {
        super(null);
    }

    public C9370(Context context, int i) {
        super(context);
        this.f30440 = i;
    }

    public C9370(Context context, Resources.Theme theme) {
        super(context);
        this.f30442 = theme;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24681(Configuration configuration) {
        if (this.f30439 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f30441 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f30441 = new Configuration(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f30439 == null) {
            Configuration configuration = this.f30441;
            if (configuration == null) {
                this.f30439 = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f30437 == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f30437 = configuration2;
                    }
                    if (configuration.equals(f30437)) {
                        this.f30439 = super.getResources();
                    }
                }
                this.f30439 = createConfigurationContext(this.f30441).getResources();
            }
        }
        return this.f30439;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f30440 != i) {
            this.f30440 = i;
            m24679();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24680() {
        return this.f30440;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f30442;
        if (theme != null) {
            return theme;
        }
        if (this.f30440 == 0) {
            this.f30440 = R.style.MT_Protector;
        }
        m24679();
        return this.f30442;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f30438 == null) {
                this.f30438 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f30438;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24679() {
        if (this.f30442 == null) {
            this.f30442 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f30442.setTo(theme);
            }
        }
        this.f30442.applyStyle(this.f30440, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
