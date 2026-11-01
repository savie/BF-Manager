package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D5UJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5716 extends ContextWrapper {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Configuration f19473;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Resources.Theme f19474;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f19475;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19476;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Resources f19477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Configuration f19478;

    public C5716() {
        super(null);
    }

    public C5716(Context context, int i) {
        super(context);
        this.f19476 = i;
    }

    public C5716(Context context, Resources.Theme theme) {
        super(context);
        this.f19474 = theme;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15754(Configuration configuration) {
        if (this.f19477 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f19478 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f19478 = new Configuration(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f19477 == null) {
            Configuration configuration = this.f19478;
            if (configuration == null) {
                this.f19477 = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f19473 == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f19473 = configuration2;
                    }
                    if (configuration.equals(f19473)) {
                        this.f19477 = super.getResources();
                    }
                }
                this.f19477 = createConfigurationContext(this.f19478).getResources();
            }
        }
        return this.f19477;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f19476 != i) {
            this.f19476 = i;
            m15752();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15753() {
        return this.f19476;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f19474;
        if (theme != null) {
            return theme;
        }
        if (this.f19476 == 0) {
            this.f19476 = R.style.MT_Protector;
        }
        m15752();
        return this.f19474;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f19475 == null) {
                this.f19475 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f19475;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15752() {
        if (this.f19474 == null) {
            this.f19474 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f19474.setTo(theme);
            }
        }
        this.f19474.applyStyle(this.f19476, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
