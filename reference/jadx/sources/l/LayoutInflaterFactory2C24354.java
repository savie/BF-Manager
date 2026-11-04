package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatViewInflater;
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C24354 extends AbstractC1365 implements InterfaceC7662, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f78972;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f78973;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f78974;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f78975;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC2944 f78976;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C21833 f78977;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f78978;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f78979;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C0094 f78980;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C12419[] f78981;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C3470 f78982;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public Rect f78983;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C24158 f78984;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC10116 f78985;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f78986;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78987;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C22862 f78988;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78989;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f78990;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f78991;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f78992;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public Runnable f78993;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f78994;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f78995;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f78996;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C17640 f78997;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public Rect f78998;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PopupWindow f78999;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C6454 f79000;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f79001;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C16894 f79002;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79003;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12463 f79004;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final Context f79005;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public Window f79006;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f79007;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79008;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Object f79009;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f79010;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AppCompatViewInflater f79011;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ViewGroup f79012;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public Configuration f79013;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79014;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f79015;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public C12419 f79016;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Object f79017;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public View f79018;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79019;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79020;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79021;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public TextView f79022;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public static final C9086 f78971 = new C9086();

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f78969 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean f78970 = !"robolectric".equals(Build.FINGERPRINT);

    public LayoutInflaterFactory2C24354(ActivityC4348 activityC4348, ActivityC4348 activityC4349) {
        this(activityC4348, null, activityC4349, activityC4348);
    }

    public LayoutInflaterFactory2C24354(DialogC14656 dialogC14656, DialogC14656 dialogC14657) {
        this(dialogC14656.getContext(), dialogC14656.getWindow(), dialogC14657, dialogC14656);
    }

    public LayoutInflaterFactory2C24354(Context context, Window window, InterfaceC14788 interfaceC14788, Object obj) {
        ActivityC4348 activityC4348 = null;
        this.f78984 = null;
        this.f79001 = true;
        this.f78973 = -100;
        this.f79010 = new RunnableC9567(this);
        this.f79005 = context;
        this.f79017 = interfaceC14788;
        this.f79009 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof ActivityC4348) {
                    activityC4348 = (ActivityC4348) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activityC4348 != null) {
                this.f78973 = activityC4348.m13854().mo5048();
            }
        }
        if (this.f78973 == -100) {
            String name = this.f79009.getClass().getName();
            C9086 c9086 = f78971;
            Integer num = (Integer) c9086.get(name);
            if (num != null) {
                this.f78973 = num.intValue();
                c9086.remove(this.f79009.getClass().getName());
            }
        }
        if (window != null) {
            m54396(window);
        }
        C8581.m23070();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m54407() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f78978 != null && (m54418(0).f39923 || this.f78985 != null)) {
                z = true;
            }
            if (z && this.f78974 == null) {
                this.f78974 = C25100.m55960((Object) this.f78978, this);
            } else {
                if (z || (onBackInvokedCallback = this.f78974) == null) {
                    return;
                }
                C25100.m55962(this.f78978, onBackInvokedCallback);
                this.f78974 = null;
            }
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final Context mo5026(Context context) {
        this.f78994 = true;
        int iM5012 = this.f78973;
        if (iM5012 == -100) {
            iM5012 = AbstractC1365.m5012();
        }
        int iM54410 = m54410(context, iM5012);
        if (AbstractC1365.m5017(context)) {
            AbstractC1365.m5023(context);
        }
        C12266 c12266M54403 = m54403(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m54395(context, iM54410, c12266M54403, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C9370) {
            try {
                ((C9370) context).m24681(m54395(context, iM54410, c12266M54403, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f78970) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i = configuration3.mcc;
                int i2 = configuration4.mcc;
                if (i != i2) {
                    configuration.mcc = i2;
                }
                int i3 = configuration3.mnc;
                int i4 = configuration4.mnc;
                if (i3 != i4) {
                    configuration.mnc = i4;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 24) {
                    if (!C17359.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                } else {
                    C5708.m16745(configuration3, configuration4, configuration);
                }
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                if (i5 >= 26) {
                    C1979.m6798(configuration3, configuration4, configuration);
                }
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        }
        Configuration configurationM54395 = m54395(context, iM54410, c12266M54403, configuration, true);
        C9370 c9370 = new C9370(context, bin.mt.plus.R.style.MT_Protector);
        c9370.m24681(configurationM54395);
        try {
            if (context.getTheme() != null) {
                C1015.m3912(c9370.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c9370;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ֫ */
    public final void mo5025() {
        String strM56155;
        this.f78994 = true;
        m54399(false, true);
        m54402();
        Object obj = this.f79009;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM56155 = C25188.m56155(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM56155 = null;
            }
            if (strM56155 != null) {
                AbstractC2944 abstractC2944 = this.f78976;
                if (abstractC2944 == null) {
                    this.f78996 = true;
                } else {
                    abstractC2944.mo9637(true);
                }
            }
            AbstractC1365.m5013(this);
        }
        this.f79013 = new Configuration(this.f79005.getResources().getConfiguration());
        this.f79007 = true;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩻ */
    public final void mo5050() {
        m54400();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m54408(int i) {
        if (i == 108) {
            m54401();
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 != null) {
                abstractC2944.mo9627(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Context m54409() {
        m54401();
        AbstractC2944 abstractC2944 = this.f78976;
        Context contextMo9639 = abstractC2944 != null ? abstractC2944.mo9639() : null;
        return contextMo9639 == null ? this.f79005 : contextMo9639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54416(int i, KeyEvent keyEvent) {
        m54401();
        AbstractC2944 abstractC2944 = this.f78976;
        if (abstractC2944 == null || !abstractC2944.mo9629(i, keyEvent)) {
            C12419 c12419 = this.f79016;
            if (c12419 != null && m54398(c12419, keyEvent.getKeyCode(), keyEvent)) {
                C12419 c124110 = this.f79016;
                if (c124110 != null) {
                    c124110.f39926 = true;
                    return true;
                }
            } else {
                if (this.f79016 == null) {
                    C12419 c12419M54418 = m54418(0);
                    m54405(c12419M54418, keyEvent);
                    boolean zM54398 = m54398(c12419M54418, keyEvent.getKeyCode(), keyEvent);
                    c12419M54418.f39920 = false;
                    if (zM54398) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m54419(int i) {
        if (i == 108) {
            m54401();
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 != null) {
                abstractC2944.mo9627(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C12419 c12419M54418 = m54418(i);
            if (c12419M54418.f39923) {
                m54415(c12419M54418, false);
            }
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC2944 mo5039() {
        m54401();
        return this.f78976;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ܶ */
    public final void mo5040() {
        m54401();
        AbstractC2944 abstractC2944 = this.f78976;
        if (abstractC2944 != null) {
            abstractC2944.mo9640(false);
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ܺ */
    public final void mo5041() {
        m54401();
        AbstractC2944 abstractC2944 = this.f78976;
        if (abstractC2944 != null) {
            abstractC2944.mo9640(true);
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۚ */
    public final void mo5034() {
        if (this.f78976 != null) {
            m54401();
            if (this.f78976.mo9636()) {
                return;
            }
            m54406(0);
        }
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        C12419 c12419M54424;
        Window.Callback callback = this.f79006.getCallback();
        if (callback == null || this.f79019 || (c12419M54424 = m54424(c9898.getRootMenu())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(c12419M54424.f39933, menuItem);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m54401() {
        m54400();
        if (this.f79014 && this.f78976 == null) {
            Object obj = this.f79009;
            if (obj instanceof Activity) {
                this.f78976 = new C13100((Activity) obj, this.f78989);
            } else if (obj instanceof Dialog) {
                this.f78976 = new C13100((Dialog) obj);
            }
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 != null) {
                abstractC2944.mo9637(this.f78996);
            }
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5033(C16390 c16390) {
        CharSequence title;
        Object obj = this.f79009;
        if (obj instanceof Activity) {
            m54401();
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 instanceof C13100) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f78977 = null;
            if (abstractC2944 != null) {
                abstractC2944.mo9634();
            }
            this.f78976 = null;
            if (c16390 == null) {
                this.f79002.m39854((InterfaceC10927) null);
            } else {
                if (obj instanceof Activity) {
                    title = ((Activity) obj).getTitle();
                } else {
                    title = this.f78995;
                }
                C7199 c7199 = new C7199(c16390, title, this.f79002);
                this.f78976 = c7199;
                this.f79002.m39854(c7199.f23769);
                c16390.setBackInvokedCallbackEnabled(true);
            }
            mo5034();
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩴ */
    public final MenuInflater mo5043() {
        if (this.f78977 == null) {
            m54401();
            AbstractC2944 abstractC2944 = this.f78976;
            this.f78977 = new C21833(abstractC2944 != null ? abstractC2944.mo9639() : this.f79005);
        }
        return this.f78977;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final View mo5027(int i) {
        m54400();
        return this.f79006.findViewById(i);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5029(Configuration configuration) {
        if (this.f79014 && this.f79003) {
            m54401();
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 != null) {
                abstractC2944.mo9635();
            }
        }
        C8581 c8581M23071 = C8581.m23071();
        Context context = this.f79005;
        c8581M23071.m23073(context);
        this.f79013 = new Configuration(context.getResources().getConfiguration());
        m54399(false, false);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ܽ */
    public final void mo5042() {
        m54399(true, false);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5030(View view) {
        m54400();
        ViewGroup viewGroup = (ViewGroup) this.f79012.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f79002.m39852(this.f79006.getCallback());
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۤ */
    public final void mo5036(int i) {
        m54400();
        ViewGroup viewGroup = (ViewGroup) this.f79012.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f79005).inflate(i, viewGroup);
        this.f79002.m39852(this.f79006.getCallback());
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5045(View view, ViewGroup.LayoutParams layoutParams) {
        m54400();
        ViewGroup viewGroup = (ViewGroup) this.f79012.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f79002.m39852(this.f79006.getCallback());
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5031(View view, ViewGroup.LayoutParams layoutParams) {
        m54400();
        ((ViewGroup) this.f79012.findViewById(R.id.content)).addView(view, layoutParams);
        this.f79002.m39852(this.f79006.getCallback());
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۧ */
    public final void mo5037() {
        Object obj = this.f79009;
        boolean z = obj instanceof Activity;
        if (z) {
            AbstractC1365.m5022(this);
        }
        if (this.f78987) {
            this.f79006.getDecorView().removeCallbacks(this.f79010);
        }
        this.f79019 = true;
        int i = this.f78973;
        C9086 c9086 = f78971;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            c9086.put(obj.getClass().getName(), Integer.valueOf(this.f78973));
        } else {
            c9086.remove(obj.getClass().getName());
        }
        AbstractC2944 abstractC2944 = this.f78976;
        if (abstractC2944 != null) {
            abstractC2944.mo9634();
        }
        C3470 c3470 = this.f78982;
        if (c3470 != null) {
            c3470.m52852();
        }
        C17640 c17640 = this.f78997;
        if (c17640 != null) {
            c17640.m52852();
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5044(int i) {
        this.f78975 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m54402() {
        if (this.f79006 == null) {
            Object obj = this.f79009;
            if (obj instanceof Activity) {
                m54396(((Activity) obj).getWindow());
            }
        }
        if (this.f79006 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54396(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f79006 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C16894) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C16894 c16894 = new C16894(this, callback);
        this.f79002 = c16894;
        window.setCallback(c16894);
        C5204 c5204M15648 = C5204.m15648(this.f79005, (AttributeSet) null, f78969);
        Drawable drawableM15663 = c5204M15648.m15663(0);
        if (drawableM15663 != null) {
            window.setBackgroundDrawable(drawableM15663);
        }
        c5204M15648.m15664();
        this.f79006 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f78978) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f78974) != null) {
            C25100.m55962(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f78974 = null;
        }
        Object obj = this.f79009;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f78978 = C25100.m55961(activity);
            } else {
                this.f78978 = null;
            }
        } else {
            this.f78978 = null;
        }
        m54407();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m54400() {
        ViewGroup viewGroup;
        CharSequence title;
        if (this.f79003) {
            return;
        }
        Context context = this.f79005;
        int[] iArr = C10401.f33085;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo5047(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, false)) {
            mo5047(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo5047(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo5047(10);
        }
        this.f78991 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m54402();
        this.f79006.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (!this.f79008) {
            if (this.f78991) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                this.f78989 = false;
                this.f79014 = false;
            } else if (this.f79014) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C9370(context, typedValue.resourceId) : context).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                InterfaceC12463 interfaceC12463 = (InterfaceC12463) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
                this.f79004 = interfaceC12463;
                interfaceC12463.mo7857(this.f79006.getCallback());
                if (this.f78989) {
                    this.f79004.mo7855(109);
                }
                if (this.f78979) {
                    this.f79004.mo7855(2);
                }
                if (this.f79020) {
                    this.f79004.mo7855(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.f78986 ? (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f79014 + ", windowActionBarOverlay: " + this.f78989 + ", android:windowIsFloating: " + this.f78991 + ", windowActionModeOverlay: " + this.f78986 + ", windowNoTitle: " + this.f79008 + " }");
        }
        C22666.m51097(viewGroup, new C2856(this));
        if (this.f79004 == null) {
            this.f79022 = (TextView) viewGroup.findViewById(bin.mt.plus.R.id.title);
        }
        int i = C19374.f62602;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C20668 c20668 = (C20668) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
        ViewGroup viewGroup2 = (ViewGroup) this.f79006.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c20668.addView(childAt);
            }
            viewGroup2.setId(-1);
            c20668.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f79006.setContentView(viewGroup);
        c20668.m47294(new C8822(this));
        this.f79012 = viewGroup;
        Object obj = this.f79009;
        if (obj instanceof Activity) {
            title = ((Activity) obj).getTitle();
        } else {
            title = this.f78995;
        }
        if (!TextUtils.isEmpty(title)) {
            InterfaceC12463 interfaceC12464 = this.f79004;
            if (interfaceC12464 == null) {
                AbstractC2944 abstractC2944 = this.f78976;
                if (abstractC2944 != null) {
                    abstractC2944.mo9626(title);
                } else {
                    TextView textView = this.f79022;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            } else {
                interfaceC12464.mo7858(title);
            }
        }
        C20668 c20669 = (C20668) this.f79012.findViewById(R.id.content);
        View decorView = this.f79006.getDecorView();
        c20669.m47293(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, c20669.m47297());
        typedArrayObtainStyledAttributes2.getValue(q.h, c20669.m47296());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, c20669.m47295());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, c20669.m47299());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, c20669.m47292());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH, c20669.m47298());
        }
        typedArrayObtainStyledAttributes2.recycle();
        c20669.requestLayout();
        this.f79003 = true;
        C12419 c12419M54418 = m54418(0);
        if (this.f79019 || c12419M54418.f39929 != null) {
            return;
        }
        m54406(108);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo5047(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f79008 && i == 108) {
            return false;
        }
        if (this.f79014 && i == 1) {
            this.f79014 = false;
        }
        if (i == 1) {
            m54394();
            this.f79008 = true;
            return true;
        }
        if (i == 2) {
            m54394();
            this.f78979 = true;
            return true;
        }
        if (i == 5) {
            m54394();
            this.f79020 = true;
            return true;
        }
        if (i == 10) {
            m54394();
            this.f78986 = true;
            return true;
        }
        if (i == 108) {
            m54394();
            this.f79014 = true;
            return true;
        }
        if (i == 109) {
            m54394();
            this.f78989 = true;
            return true;
        }
        return this.f79006.requestFeature(i);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5032(CharSequence charSequence) {
        this.f78995 = charSequence;
        InterfaceC12463 interfaceC12463 = this.f79004;
        if (interfaceC12463 == null) {
            AbstractC2944 abstractC2944 = this.f78976;
            if (abstractC2944 != null) {
                abstractC2944.mo9626(charSequence);
                return;
            }
            TextView textView = this.f79022;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        interfaceC12463.mo7858(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ܰᩴ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10116 m54412(C8625 c8625) {
        AbstractC10116 abstractC10116OnWindowStartingSupportActionMode;
        AbstractC10116 abstractC10116 = this.f78985;
        if (abstractC10116 != null) {
            abstractC10116.mo8800();
        }
        C15402 c15402 = new C15402(this, c8625);
        m54401();
        AbstractC2944 abstractC2944 = this.f78976;
        ?? r1 = this.f79017;
        if (abstractC2944 != null) {
            AbstractC10116 abstractC10116Mo9623 = abstractC2944.mo9623(c15402);
            this.f78985 = abstractC10116Mo9623;
            if (abstractC10116Mo9623 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC10116Mo9623);
            }
        }
        if (this.f78985 == null) {
            C24158 c24158 = this.f78984;
            if (c24158 != null) {
                c24158.m54119();
            }
            AbstractC10116 abstractC10117 = this.f78985;
            if (abstractC10117 != null) {
                abstractC10117.mo8800();
            }
            if (r1 == 0 || this.f79019) {
                abstractC10116OnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC10116OnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c15402);
                } catch (AbstractMethodError unused) {
                    abstractC10116OnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC10116OnWindowStartingSupportActionMode != null) {
                this.f78985 = abstractC10116OnWindowStartingSupportActionMode;
            } else {
                if (this.f78980 == null) {
                    if (this.f78991) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f79005;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C9370 c9370 = new C9370(context, 0);
                            c9370.getTheme().setTo(themeNewTheme);
                            context = c9370;
                        }
                        this.f78980 = new C0094(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, bin.mt.plus.R.attr.MT_Protector);
                        this.f78999 = popupWindow;
                        C20323.m46664(popupWindow, 2);
                        this.f78999.setContentView(this.f78980);
                        this.f78999.setWidth(-1);
                        context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        this.f78980.mo1183(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f78999.setHeight(-2);
                        this.f78993 = new RunnableC14042(this);
                    } else {
                        C0729 c0729 = (C0729) this.f79012.findViewById(bin.mt.plus.R.id.MT_Protector);
                        if (c0729 != null) {
                            c0729.m3054(LayoutInflater.from(m54409()));
                            this.f78980 = (C0094) c0729.m3053();
                        }
                    }
                }
                if (this.f78980 != null) {
                    C24158 c24159 = this.f78984;
                    if (c24159 != null) {
                        c24159.m54119();
                    }
                    this.f78980.m1190();
                    C2659 c2659 = new C2659(this.f78980.getContext(), this.f78980, c15402);
                    if (c15402.m36882(c2659, c2659.mo8805())) {
                        c2659.mo8799();
                        this.f78980.m1186(c2659);
                        this.f78985 = c2659;
                        if (m54422()) {
                            this.f78980.setAlpha(0.0f);
                            C24158 c24158M51085 = C22666.m51085(this.f78980);
                            c24158M51085.m54120(1.0f);
                            this.f78984 = c24158M51085;
                            c24158M51085.m54123(new C4962(this));
                        } else {
                            this.f78980.setAlpha(1.0f);
                            this.f78980.setVisibility(0);
                            if (this.f78980.getParent() instanceof View) {
                                C22666.m51079((View) this.f78980.getParent());
                            }
                        }
                        if (this.f78999 != null) {
                            this.f79006.getDecorView().post(this.f78993);
                        }
                    } else {
                        this.f78985 = null;
                    }
                }
            }
            AbstractC10116 abstractC10118 = this.f78985;
            if (abstractC10118 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC10118);
            }
            m54407();
            this.f78985 = this.f78985;
        }
        m54407();
        return this.f78985;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m54422() {
        ViewGroup viewGroup;
        return this.f79003 && (viewGroup = this.f79012) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m54421() {
        return this.f79001;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m54423() {
        boolean z = this.f78990;
        this.f78990 = false;
        C12419 c12419M54418 = m54418(0);
        if (!c12419M54418.f39923) {
            AbstractC10116 abstractC10116 = this.f78985;
            if (abstractC10116 == null) {
                m54401();
                AbstractC2944 abstractC2944 = this.f78976;
                if (abstractC2944 == null || !abstractC2944.mo9638()) {
                    return false;
                }
            } else {
                abstractC10116.mo8800();
                return true;
            }
        } else if (!z) {
            m54415(c12419M54418, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54417(KeyEvent keyEvent) {
        View decorView;
        boolean zMo7869;
        boolean zM54405;
        AudioManager audioManager;
        Object obj = this.f79009;
        if (((!(obj instanceof InterfaceC4041) && !(obj instanceof DialogC14656)) || (decorView = this.f79006.getDecorView()) == null || !C14481.m34958(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f79002.m39855(this.f79006.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f78990 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C12419 c12419M54418 = m54418(0);
                        if (!c12419M54418.f39923) {
                            m54405(c12419M54418, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f78985 == null) {
                        C12419 c12419M54419 = m54418(0);
                        InterfaceC12463 interfaceC12463 = this.f79004;
                        Context context = this.f79005;
                        if (interfaceC12463 != null && interfaceC12463.mo7861() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            if (!this.f79004.mo7870()) {
                                if (this.f79019 || !m54405(c12419M54419, keyEvent)) {
                                    zMo7869 = false;
                                } else {
                                    zMo7869 = this.f79004.mo7863();
                                }
                            } else {
                                zMo7869 = this.f79004.mo7869();
                            }
                        } else {
                            boolean z = c12419M54419.f39923;
                            if (z || c12419M54419.f39926) {
                                m54415(c12419M54419, true);
                                zMo7869 = z;
                            } else if (c12419M54419.f39920) {
                                if (c12419M54419.f39928) {
                                    c12419M54419.f39920 = false;
                                    zM54405 = m54405(c12419M54419, keyEvent);
                                } else {
                                    zM54405 = true;
                                }
                                if (zM54405) {
                                    m54397(c12419M54419, keyEvent);
                                    zMo7869 = true;
                                } else {
                                    zMo7869 = false;
                                }
                            } else {
                                zMo7869 = false;
                            }
                        }
                        if (zMo7869 && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (!m54423()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f79011 == null) {
            int[] iArr = C10401.f33085;
            Context context2 = this.f79005;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f79011 = new AppCompatViewInflater();
            } else {
                try {
                    this.f79011 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f79011 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f79011;
        int i = C18628.f60549;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۫ */
    public final void mo5038() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f79005);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54397(C12419 c12419, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c12419.f39923;
        int i2 = c12419.f39933;
        if (z || this.f79019) {
            return;
        }
        Context context = this.f79005;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f79006.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c12419.f39929)) {
            m54415(c12419, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m54405(c12419, keyEvent)) {
            ViewGroup viewGroup = c12419.f39924;
            if (viewGroup != null && !c12419.f39930) {
                View view = c12419.f39932;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c12419.f39926 = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
                layoutParams2.gravity = c12419.f39927;
                layoutParams2.windowAnimations = c12419.f39921;
                windowManager.addView(c12419.f39924, layoutParams2);
                c12419.f39923 = true;
                if (i2 == 0) {
                    m54407();
                }
            }
            if (viewGroup != null) {
                if (c12419.f39930 && viewGroup.getChildCount() > 0) {
                    c12419.f39924.removeAllViews();
                }
            } else {
                Context contextM54409 = m54409();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextM54409.getResources().newTheme();
                themeNewTheme.setTo(contextM54409.getTheme());
                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(bin.mt.plus.R.style.MT_Protector, true);
                }
                C9370 c9370 = new C9370(contextM54409, 0);
                c9370.getTheme().setTo(themeNewTheme);
                c12419.f39935 = c9370;
                TypedArray typedArrayObtainStyledAttributes = c9370.obtainStyledAttributes(C10401.f33085);
                c12419.f39922 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c12419.f39921 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c12419.f39924 = new C20624(this, c12419.f39935);
                c12419.f39927 = 81;
            }
            View view2 = c12419.f39932;
            if (view2 != null) {
                c12419.f39934 = view2;
            } else {
                if (c12419.f39929 != null) {
                    if (this.f79000 == null) {
                        this.f79000 = new C6454(this);
                    }
                    C6454 c6454 = this.f79000;
                    if (c12419.f39925 == null) {
                        C18103 c18103 = new C18103(c12419.f39935, bin.mt.plus.R.layout.MT_Protector);
                        c12419.f39925 = c18103;
                        c18103.setCallback(c6454);
                        c12419.f39929.addMenuPresenter(c12419.f39925);
                    }
                    View view3 = (View) c12419.f39925.m42223(c12419.f39924);
                    c12419.f39934 = view3;
                    if (view3 != null) {
                    }
                }
                c12419.f39930 = true;
                return;
            }
            if (c12419.f39934 != null && (c12419.f39932 != null || c12419.f39925.m42222().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c12419.f39934.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c12419.f39924.setBackgroundResource(c12419.f39922);
                ViewParent parent = c12419.f39934.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c12419.f39934);
                }
                c12419.f39924.addView(c12419.f39934, layoutParams3);
                if (!c12419.f39934.hasFocus()) {
                    c12419.f39934.requestFocus();
                }
            }
            c12419.f39930 = true;
            return;
            i = -2;
            c12419.f39926 = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
            layoutParams4.gravity = c12419.f39927;
            layoutParams4.windowAnimations = c12419.f39921;
            windowManager.addView(c12419.f39924, layoutParams4);
            c12419.f39923 = true;
            if (i2 == 0) {
                m54407();
            }
        }
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        InterfaceC12463 interfaceC12463 = this.f79004;
        if (interfaceC12463 != null && interfaceC12463.mo7861() && (!ViewConfiguration.get(this.f79005).hasPermanentMenuKey() || this.f79004.mo7866())) {
            Window.Callback callback = this.f79006.getCallback();
            if (!this.f79004.mo7870()) {
                if (callback == null || this.f79019) {
                    return;
                }
                if (this.f78987 && (1 & this.f78972) != 0) {
                    View decorView = this.f79006.getDecorView();
                    Runnable runnable = this.f79010;
                    decorView.removeCallbacks(runnable);
                    ((RunnableC9567) runnable).run();
                }
                C12419 c12419M54418 = m54418(0);
                C9898 c9899 = c12419M54418.f39929;
                if (c9899 == null || c12419M54418.f39928 || !callback.onPreparePanel(0, c12419M54418.f39932, c9899)) {
                    return;
                }
                callback.onMenuOpened(108, c12419M54418.f39929);
                this.f79004.mo7863();
                return;
            }
            this.f79004.mo7869();
            if (this.f79019) {
                return;
            }
            callback.onPanelClosed(108, m54418(0).f39929);
            return;
        }
        C12419 c12419M54419 = m54418(0);
        c12419M54419.f39930 = true;
        m54415(c12419M54419, false);
        m54397(c12419M54419, (KeyEvent) null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m54405(C12419 c12419, KeyEvent keyEvent) {
        C9898 c9898;
        InterfaceC12463 interfaceC12463;
        InterfaceC12463 interfaceC12464;
        Resources.Theme themeNewTheme;
        InterfaceC12463 interfaceC12465;
        InterfaceC12463 interfaceC12466;
        if (!this.f79019) {
            boolean z = c12419.f39920;
            int i = c12419.f39933;
            if (z) {
                return true;
            }
            C12419 c124110 = this.f79016;
            if (c124110 != null && c124110 != c12419) {
                m54415(c124110, false);
            }
            Window.Callback callback = this.f79006.getCallback();
            if (callback != null) {
                c12419.f39932 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC12466 = this.f79004) != null) {
                interfaceC12466.mo7867();
            }
            if (c12419.f39932 == null && (!z2 || !(this.f78976 instanceof C7199))) {
                C9898 c9899 = c12419.f39929;
                if (c9899 == null || c12419.f39928) {
                    if (c9899 == null) {
                        Context context = this.f79005;
                        if ((i == 0 || i == 108) && this.f79004 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                            } else {
                                theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C9370 c9370 = new C9370(context, 0);
                                c9370.getTheme().setTo(themeNewTheme);
                                context = c9370;
                            }
                        }
                        C9898 c98910 = new C9898(context);
                        c98910.setCallback(this);
                        C9898 c98911 = c12419.f39929;
                        if (c98910 != c98911) {
                            if (c98911 != null) {
                                c98911.removeMenuPresenter(c12419.f39925);
                            }
                            c12419.f39929 = c98910;
                            C18103 c18103 = c12419.f39925;
                            if (c18103 != null) {
                                c98910.addMenuPresenter(c18103);
                            }
                        }
                        if (c12419.f39929 != null) {
                            if (z2 && (interfaceC12464 = this.f79004) != null) {
                                if (this.f78988 == null) {
                                    this.f78988 = new C22862(this);
                                }
                                interfaceC12464.mo7856(c12419.f39929, this.f78988);
                            }
                            c12419.f39929.stopDispatchingItemsChanged();
                            if (!callback.onCreatePanelMenu(i, c12419.f39929)) {
                                c12419.f39928 = false;
                            } else {
                                c9898 = c12419.f39929;
                                if (c9898 != null) {
                                    if (c9898 != null) {
                                        c9898.removeMenuPresenter(c12419.f39925);
                                    }
                                    c12419.f39929 = null;
                                }
                                if (z2 && (interfaceC12463 = this.f79004) != null) {
                                    interfaceC12463.mo7856(null, this.f78988);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f78988 == null) {
                                this.f78988 = new C22862(this);
                            }
                            interfaceC12464.mo7856(c12419.f39929, this.f78988);
                        }
                        c12419.f39929.stopDispatchingItemsChanged();
                        if (!callback.onCreatePanelMenu(i, c12419.f39929)) {
                            c12419.f39928 = false;
                        } else {
                            c9898 = c12419.f39929;
                            if (c9898 != null) {
                                if (c9898 != null) {
                                    c9898.removeMenuPresenter(c12419.f39925);
                                }
                                c12419.f39929 = null;
                            }
                            if (z2) {
                                interfaceC12463.mo7856(null, this.f78988);
                            }
                        }
                    }
                }
                c12419.f39929.stopDispatchingItemsChanged();
                Bundle bundle = c12419.f39931;
                if (bundle != null) {
                    c12419.f39929.restoreActionViewStates(bundle);
                    c12419.f39931 = null;
                }
                if (!callback.onPreparePanel(0, c12419.f39932, c12419.f39929)) {
                    if (z2 && (interfaceC12465 = this.f79004) != null) {
                        interfaceC12465.mo7856(null, this.f78988);
                    }
                    c12419.f39929.startDispatchingItemsChanged();
                    return false;
                }
                c12419.f39929.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c12419.f39929.startDispatchingItemsChanged();
            }
            c12419.f39920 = true;
            c12419.f39926 = false;
            this.f79016 = c12419;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54414(C9898 c9898) {
        if (this.f79021) {
            return;
        }
        this.f79021 = true;
        this.f79004.mo7865();
        Window.Callback callback = this.f79006.getCallback();
        if (callback != null && !this.f79019) {
            callback.onPanelClosed(108, c9898);
        }
        this.f79021 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54415(C12419 c12419, boolean z) {
        ViewGroup viewGroup;
        InterfaceC12463 interfaceC12463;
        if (z && c12419.f39933 == 0 && (interfaceC12463 = this.f79004) != null && interfaceC12463.mo7870()) {
            m54414(c12419.f39929);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f79005.getSystemService("window");
        if (windowManager != null && c12419.f39923 && (viewGroup = c12419.f39924) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m54413(c12419.f39933, c12419, (C9898) null);
            }
        }
        c12419.f39920 = false;
        c12419.f39926 = false;
        c12419.f39923 = false;
        c12419.f39934 = null;
        c12419.f39930 = true;
        if (this.f79016 == c12419) {
            this.f79016 = null;
        }
        if (c12419.f39933 == 0) {
            m54407();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54413(int i, C12419 c12419, C9898 c9898) {
        if (c9898 == null) {
            if (c12419 == null && i >= 0) {
                C12419[] c12419Arr = this.f78981;
                if (i < c12419Arr.length) {
                    c12419 = c12419Arr[i];
                }
            }
            if (c12419 != null) {
                c9898 = c12419.f39929;
            }
        }
        if ((c12419 == null || c12419.f39923) && !this.f79019) {
            this.f79002.m39853(this.f79006.getCallback(), i, c9898);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12419 m54424(C9898 c9898) {
        C12419[] c12419Arr = this.f78981;
        int length = c12419Arr != null ? c12419Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C12419 c12419 = c12419Arr[i];
            if (c12419 != null && c12419.f39929 == c9898) {
                return c12419;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12419 m54418(int i) {
        C12419[] c12419Arr = this.f78981;
        if (c12419Arr == null || c12419Arr.length <= i) {
            C12419[] c12419Arr2 = new C12419[i + 1];
            if (c12419Arr != null) {
                System.arraycopy(c12419Arr, 0, c12419Arr2, 0, c12419Arr.length);
            }
            this.f78981 = c12419Arr2;
            c12419Arr = c12419Arr2;
        }
        C12419 c12419 = c12419Arr[i];
        if (c12419 != null) {
            return c12419;
        }
        C12419 c124110 = new C12419();
        c124110.f39933 = i;
        c124110.f39930 = false;
        c12419Arr[i] = c124110;
        return c124110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m54398(C12419 c12419, int i, KeyEvent keyEvent) {
        C9898 c9898;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c12419.f39920 || m54405(c12419, keyEvent)) && (c9898 = c12419.f39929) != null) {
            return c9898.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m54406(int i) {
        this.f78972 = (1 << i) | this.f78972;
        if (this.f78987) {
            return;
        }
        View decorView = this.f79006.getDecorView();
        int i2 = C22666.f73603;
        decorView.postOnAnimation(this.f79010);
        this.f78987 = true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m54420(int i) {
        C12419 c12419M54418 = m54418(i);
        if (c12419M54418.f39929 != null) {
            Bundle bundle = new Bundle();
            c12419M54418.f39929.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c12419M54418.f39931 = bundle;
            }
            c12419M54418.f39929.stopDispatchingItemsChanged();
            c12419M54418.f39929.clear();
        }
        c12419M54418.f39928 = true;
        c12419M54418.f39930 = true;
        if ((i == 108 || i == 0) && this.f79004 != null) {
            C12419 c12419M54419 = m54418(0);
            c12419M54419.f39920 = false;
            m54405(c12419M54419, (KeyEvent) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54411(C3977 c3977) {
        boolean z;
        boolean z2;
        int iM20558;
        int iM12824 = c3977.m12824();
        C0094 c0094 = this.f78980;
        if (c0094 == null || !(c0094.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f78980.getLayoutParams();
            boolean z3 = true;
            if (this.f78980.isShown()) {
                if (this.f78998 == null) {
                    this.f78998 = new Rect();
                    this.f78983 = new Rect();
                }
                Rect rect = this.f78998;
                Rect rect2 = this.f78983;
                rect.set(c3977.m12822(), c3977.m12824(), c3977.m12814(), c3977.m12825());
                C19374.m44818(this.f79012, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C3977 c3977M51078 = C22666.m51078(this.f79012);
                int iM12822 = c3977M51078 == null ? 0 : c3977M51078.m12822();
                int iM12814 = c3977M51078 == null ? 0 : c3977M51078.m12814();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = this.f79005;
                if (i > 0 && this.f79018 == null) {
                    View view = new View(context);
                    this.f79018 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM12822;
                    layoutParams.rightMargin = iM12814;
                    this.f79012.addView(this.f79018, -1, layoutParams);
                } else {
                    View view2 = this.f79018;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM12822 || marginLayoutParams2.rightMargin != iM12814) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM12822;
                            marginLayoutParams2.rightMargin = iM12814;
                            this.f79018.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f79018;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = this.f79018;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        iM20558 = C7508.m20558(context, bin.mt.plus.R.color.MT_Protector);
                    } else {
                        iM20558 = C7508.m20558(context, bin.mt.plus.R.color.MT_Protector);
                    }
                    view4.setBackgroundColor(iM20558);
                }
                if (!this.f78986 && z3) {
                    iM12824 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f78980.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f79018;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM12824;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m54394() {
        if (this.f79003) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m54425() {
        InterfaceC12463 interfaceC12463 = this.f79004;
        if (interfaceC12463 != null) {
            interfaceC12463.mo7865();
        }
        if (this.f78999 != null) {
            this.f79006.getDecorView().removeCallbacks(this.f78993);
            if (this.f78999.isShowing()) {
                try {
                    this.f78999.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f78999 = null;
        }
        C24158 c24158 = this.f78984;
        if (c24158 != null) {
            c24158.m54119();
        }
        C9898 c9898 = m54418(0).f39929;
        if (c9898 != null) {
            c9898.close();
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۤ */
    public final Context mo5035() {
        return this.f79005;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ۙ */
    public final void mo5028() {
        final Context context = this.f79005;
        if (AbstractC1365.m5017(context) && AbstractC1365.m5018() != null && !AbstractC1365.m5018().equals(AbstractC1365.m5015())) {
            AbstractC1365.f4859.execute(new Runnable() { // from class: l.᩶ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1365.m5023(context);
                }
            });
        }
        m54399(true, true);
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo5046() {
        return m54399(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m54399(boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        if (this.f79019) {
            return false;
        }
        int iM5012 = this.f78973;
        if (iM5012 == -100) {
            iM5012 = AbstractC1365.m5012();
        }
        Context context = this.f79005;
        int iM54410 = m54410(context, iM5012);
        int i3 = Build.VERSION.SDK_INT;
        C12266 c12266M54403 = i3 < 33 ? m54403(context) : null;
        if (!z2 && c12266M54403 != null) {
            c12266M54403 = m54404(context.getResources().getConfiguration());
        }
        Configuration configurationM54395 = m54395(context, iM54410, c12266M54403, null, false);
        boolean z4 = this.f78992;
        boolean z5 = true;
        Object obj = this.f79009;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i3 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i3 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i2);
                    if (activityInfo != null) {
                        this.f79015 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f79015 = 0;
                }
                this.f78992 = true;
                i = this.f79015;
            }
        } else {
            this.f78992 = true;
            i = this.f79015;
        }
        Configuration configuration = this.f79013;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM54395.uiMode & 48;
        C12266 c12266M54404 = m54404(configuration);
        C12266 c12266M54405 = c12266M54403 == null ? null : m54404(configurationM54395);
        int i6 = i4 != i5 ? 512 : 0;
        if (c12266M54405 != null && !c12266M54404.equals(c12266M54405)) {
            i6 |= o.a.t;
        }
        if (((~i) & i6) != 0 && z && this.f78994 && ((f78970 || this.f79007) && (obj instanceof Activity))) {
            final Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM54395.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.᩹᩶
                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity2 = activity;
                            if (activity2.isFinishing() || C19308.m44679(activity2)) {
                                return;
                            }
                            activity2.recreate();
                        }
                    });
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c12266M54405 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    C5708.m16746(configuration2, c12266M54405);
                } else {
                    configuration2.setLocale(c12266M54405.m30639(0));
                    configuration2.setLayoutDirection(c12266M54405.m30639(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26) {
                C19132.m44268(resources);
            }
            int i9 = this.f78975;
            if (i9 != 0) {
                context.setTheme(i9);
                if (i8 >= 23) {
                    context.getTheme().applyStyle(this.f78975, true);
                }
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC11217) {
                    if (((InterfaceC11217) activity2).getLifecycle().mo23076().m8762(EnumC2619.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f79007 && !this.f79019) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c12266M54405 != null) {
            C12266 c12266M54406 = m54404(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                C5708.m16747(c12266M54406);
            } else {
                Locale.setDefault(c12266M54406.m30639(0));
            }
        }
        if (iM5012 != 0) {
            C3470 c3470 = this.f78982;
            if (c3470 != null) {
                c3470.m52852();
            }
        } else {
            if (this.f78982 == null) {
                this.f78982 = new C3470(this, C22051.m49893(context));
            }
            this.f78982.m52853();
        }
        if (iM5012 != 3) {
            C17640 c17640 = this.f78997;
            if (c17640 != null) {
                c17640.m52852();
            }
        } else {
            if (this.f78997 == null) {
                this.f78997 = new C17640(this, context);
            }
            this.f78997.m52853();
        }
        return z5;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C12266 m54403(Context context) {
        C12266 c12266M5018;
        C12266 c12266M30636;
        Locale localeM30639;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c12266M5018 = AbstractC1365.m5018()) == null) {
            return null;
        }
        C12266 c12266M54404 = m54404(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            if (c12266M5018.m30640()) {
                c12266M30636 = C12266.m30638();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < c12266M54404.m30642() + c12266M5018.m30642(); i2++) {
                    if (i2 < c12266M5018.m30642()) {
                        localeM30639 = c12266M5018.m30639(i2);
                    } else {
                        localeM30639 = c12266M54404.m30639(i2 - c12266M5018.m30642());
                    }
                    if (localeM30639 != null) {
                        linkedHashSet.add(localeM30639);
                    }
                }
                c12266M30636 = C12266.m30637((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (c12266M5018.m30640()) {
            c12266M30636 = C12266.m30638();
        } else {
            c12266M30636 = C12266.m30636(C13165.m32687(c12266M5018.m30639(0)));
        }
        return c12266M30636.m30640() ? c12266M54404 : c12266M30636;
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5049(int i) {
        if (this.f78973 != i) {
            this.f78973 = i;
            if (this.f78994) {
                m54399(true, true);
            }
        }
    }

    @Override // l.AbstractC1365
    /* JADX INFO: renamed from: ᩸ */
    public final int mo5048() {
        return this.f78973;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C12266 m54404(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5708.m16744(configuration);
        }
        return C12266.m30636(C13165.m32687(configuration.locale));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Configuration m54395(Context context, int i, C12266 c12266, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c12266 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C5708.m16746(configuration2, c12266);
                return configuration2;
            }
            configuration2.setLocale(c12266.m30639(0));
            configuration2.setLayoutDirection(c12266.m30639(0));
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54410(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f78997 == null) {
                            this.f78997 = new C17640(this, context);
                        }
                        return this.f78997.m41307();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f78982 == null) {
                        this.f78982 = new C3470(this, C22051.m49893(context));
                    }
                    return this.f78982.m11426();
                }
            }
            return i;
        }
        return -1;
    }
}
