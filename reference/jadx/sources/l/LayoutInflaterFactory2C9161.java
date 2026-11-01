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

/* JADX INFO: renamed from: l.ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInflaterFactory2C9161 extends AbstractC17129 implements InterfaceC0422, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31151;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C7043 f31152;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31153;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC10697 f31154;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C2893 f31155;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f31156;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public Runnable f31157;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC12067 f31158;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f31159;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C18332 f31160;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public Rect f31161;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public PopupWindow f31162;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C19744 f31163;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Object f31164;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public View f31165;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f31166;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f31167;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f31168;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C20554 f31169;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31170;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public Configuration f31171;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14100 f31172;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f31173;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f31174;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f31175;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f31176;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public C8455 f31177;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f31178;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C23272 f31179;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public Rect f31180;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C19910 f31181;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public C8455[] f31182;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f31183;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f31184;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public TextView f31185;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f31186;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Object f31187;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f31188;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f31189;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public boolean f31190;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8246 f31191;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f31192;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31193;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31194;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Context f31195;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public Window f31196;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AppCompatViewInflater f31197;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ViewGroup f31198;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31199;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public CharSequence f31200;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f31201;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public static final C12274 f31148 = new C12274();

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f31150 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public static final boolean f31149 = !"robolectric".equals(Build.FINGERPRINT);

    public LayoutInflaterFactory2C9161(ActivityC10074 activityC10074, ActivityC10074 activityC10075) {
        this(activityC10074, null, activityC10075, activityC10074);
    }

    public LayoutInflaterFactory2C9161(DialogC7749 dialogC7749, DialogC7749 dialogC77410) {
        this(dialogC7749.getContext(), dialogC7749.getWindow(), dialogC77410, dialogC7749);
    }

    public LayoutInflaterFactory2C9161(Context context, Window window, InterfaceC7251 interfaceC7251, Object obj) {
        ActivityC10074 activityC10074;
        this.f31169 = null;
        this.f31193 = true;
        this.f31201 = -100;
        this.f31166 = new RunnableC5840(this);
        this.f31195 = context;
        this.f31164 = interfaceC7251;
        this.f31187 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC10074) {
                        activityC10074 = (ActivityC10074) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                activityC10074 = null;
                break;
            }
            if (activityC10074 != null) {
                this.f31201 = activityC10074.m25488().mo23536();
            }
        }
        if (this.f31201 == -100) {
            String name = this.f31187.getClass().getName();
            C12274 c12274 = f31148;
            Integer num = (Integer) c12274.getOrDefault(name, null);
            if (num != null) {
                this.f31201 = num.intValue();
                c12274.remove(this.f31187.getClass().getName());
            }
        }
        if (window != null) {
            m23521(window);
        }
        C23521.m51802();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23571() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f31192 != null && (m23563(0).f29343 || this.f31158 != null)) {
                z = true;
            }
            if (z && this.f31167 == null) {
                this.f31167 = C4220.m11880((Object) this.f31192, this);
            } else {
                if (z || (onBackInvokedCallback = this.f31167) == null) {
                    return;
                }
                C4220.m11882(this.f31192, onBackInvokedCallback);
                this.f31167 = null;
            }
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context mo23542(Context context) {
        this.f31199 = true;
        int iM39998 = this.f31201;
        if (iM39998 == -100) {
            iM39998 = AbstractC17129.m39998();
        }
        int iM23540 = m23540(context, iM39998);
        if (AbstractC17129.m40002(context)) {
            AbstractC17129.m39995(context);
        }
        C17855 c17855M23525 = m23525(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m23520(context, iM23540, c17855M23525, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C5716) {
            try {
                ((C5716) context).m15754(m23520(context, iM23540, c17855M23525, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f31149) {
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
                    if (!C13638.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                } else {
                    C22566.m50071(configuration3, configuration4, configuration);
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
                    C1398.m4891(configuration3, configuration4, configuration);
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
        Configuration configurationM23520 = m23520(context, iM23540, c17855M23525, configuration, true);
        C5716 c5716 = new C5716(context, bin.mt.plus.R.style.MT_Protector);
        c5716.m15754(configurationM23520);
        try {
            if (context.getTheme() != null) {
                C0402.m2136(c5716.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c5716;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo23538() {
        String strM6747;
        this.f31199 = true;
        m23524(false, true);
        m23531();
        Object obj = this.f31187;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM6747 = C2166.m6747(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM6747 = null;
            }
            if (strM6747 != null) {
                AbstractC10697 abstractC10697 = this.f31154;
                if (abstractC10697 == null) {
                    this.f31174 = true;
                } else {
                    abstractC10697.mo13897(true);
                }
            }
            AbstractC17129.m39996(this);
        }
        this.f31171 = new Configuration(this.f31195.getResources().getConfiguration());
        this.f31189 = true;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo23577() {
        m23528();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23539(int i) {
        if (i == 108) {
            m23526();
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 != null) {
                abstractC10697.mo13890(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23554(int i, KeyEvent keyEvent) {
        m23526();
        AbstractC10697 abstractC10697 = this.f31154;
        if (abstractC10697 == null || !abstractC10697.mo13891(i, keyEvent)) {
            C8455 c8455 = this.f31177;
            if (c8455 != null && m23523(c8455, keyEvent.getKeyCode(), keyEvent)) {
                C8455 c8456 = this.f31177;
                if (c8456 != null) {
                    c8456.f29335 = true;
                    return true;
                }
            } else {
                if (this.f31177 == null) {
                    C8455 c8455M23563 = m23563(0);
                    m23530(c8455M23563, keyEvent);
                    boolean zM23523 = m23523(c8455M23563, keyEvent.getKeyCode(), keyEvent);
                    c8455M23563.f29337 = false;
                    if (zM23523) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23559(int i) {
        if (i == 108) {
            m23526();
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 != null) {
                abstractC10697.mo13890(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C8455 c8455M23563 = m23563(i);
            if (c8455M23563.f29343) {
                m23552(c8455M23563, false);
            }
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo23569() {
        m23526();
        AbstractC10697 abstractC10697 = this.f31154;
        if (abstractC10697 != null) {
            abstractC10697.mo13884(true);
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo23572() {
        m23526();
        AbstractC10697 abstractC10697 = this.f31154;
        if (abstractC10697 != null) {
            abstractC10697.mo13884(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context m23574() {
        m23526();
        AbstractC10697 abstractC10697 = this.f31154;
        Context contextMo13883 = abstractC10697 != null ? abstractC10697.mo13883() : null;
        return contextMo13883 == null ? this.f31195 : contextMo13883;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10697 mo23576() {
        m23526();
        return this.f31154;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo23564() {
        if (this.f31154 != null) {
            m23526();
            if (this.f31154.mo26902()) {
                return;
            }
            m23532(0);
        }
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        C8455 c8455M23565;
        Window.Callback callback = this.f31196.getCallback();
        if (callback == null || this.f31170 || (c8455M23565 = m23565(c12418.getRootMenu())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(c8455M23565.f29336, menuItem);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m23526() {
        m23528();
        if (this.f31151 && this.f31154 == null) {
            Object obj = this.f31187;
            if (obj instanceof Activity) {
                this.f31154 = new C5010((Activity) obj, this.f31173);
            } else if (obj instanceof Dialog) {
                this.f31154 = new C5010((Dialog) obj);
            }
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 != null) {
                abstractC10697.mo13897(this.f31174);
            }
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23551(C6938 c6938) {
        CharSequence title;
        Object obj = this.f31187;
        if (obj instanceof Activity) {
            m23526();
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 instanceof C5010) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f31155 = null;
            if (abstractC10697 != null) {
                abstractC10697.mo26899();
            }
            this.f31154 = null;
            if (c6938 == null) {
                this.f31152.m18895((InterfaceC4926) null);
            } else {
                if (obj instanceof Activity) {
                    title = ((Activity) obj).getTitle();
                } else {
                    title = this.f31200;
                }
                C14805 c14805 = new C14805(c6938, title, this.f31152);
                this.f31154 = c14805;
                this.f31152.m18895(c14805.f48404);
                c6938.setBackInvokedCallbackEnabled(true);
            }
            mo23564();
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final MenuInflater mo23556() {
        if (this.f31155 == null) {
            m23526();
            AbstractC10697 abstractC10697 = this.f31154;
            this.f31155 = new C2893(abstractC10697 != null ? abstractC10697.mo13883() : this.f31195);
        }
        return this.f31155;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo23543(int i) {
        m23528();
        return this.f31196.findViewById(i);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23547(Configuration configuration) {
        if (this.f31151 && this.f31153) {
            m23526();
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 != null) {
                abstractC10697.mo13899();
            }
        }
        C23521 c23521M51803 = C23521.m51803();
        Context context = this.f31195;
        c23521M51803.m51805(context);
        this.f31171 = new Configuration(context.getResources().getConfiguration());
        m23524(false, false);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo23575() {
        m23524(true, false);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23548(View view) {
        m23528();
        ViewGroup viewGroup = (ViewGroup) this.f31198.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f31152.m18893(this.f31196.getCallback());
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo23562(int i) {
        m23528();
        ViewGroup viewGroup = (ViewGroup) this.f31198.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f31195).inflate(i, viewGroup);
        this.f31152.m18893(this.f31196.getCallback());
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo23566(View view, ViewGroup.LayoutParams layoutParams) {
        m23528();
        ViewGroup viewGroup = (ViewGroup) this.f31198.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f31152.m18893(this.f31196.getCallback());
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23549(View view, ViewGroup.LayoutParams layoutParams) {
        m23528();
        ((ViewGroup) this.f31198.findViewById(R.id.content)).addView(view, layoutParams);
        this.f31152.m18893(this.f31196.getCallback());
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo23558() {
        Object obj = this.f31187;
        boolean z = obj instanceof Activity;
        if (z) {
            AbstractC17129.m40004(this);
        }
        if (this.f31188) {
            this.f31196.getDecorView().removeCallbacks(this.f31166);
        }
        this.f31170 = true;
        int i = this.f31201;
        C12274 c12274 = f31148;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            c12274.put(obj.getClass().getName(), Integer.valueOf(this.f31201));
        } else {
            c12274.remove(obj.getClass().getName());
        }
        AbstractC10697 abstractC10697 = this.f31154;
        if (abstractC10697 != null) {
            abstractC10697.mo26899();
        }
        C18332 c18332 = this.f31160;
        if (c18332 != null) {
            c18332.m48641();
        }
        C23272 c23272 = this.f31179;
        if (c23272 != null) {
            c23272.m48641();
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo23557(int i) {
        this.f31168 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m23531() {
        if (this.f31196 == null) {
            Object obj = this.f31187;
            if (obj instanceof Activity) {
                m23521(((Activity) obj).getWindow());
            }
        }
        if (this.f31196 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23521(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f31196 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C7043) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C7043 c7043 = new C7043(this, callback);
        this.f31152 = c7043;
        window.setCallback(c7043);
        C1977 c1977M6352 = C1977.m6352(this.f31195, (AttributeSet) null, f31150);
        Drawable drawableM6378 = c1977M6352.m6378(0);
        if (drawableM6378 != null) {
            window.setBackgroundDrawable(drawableM6378);
        }
        c1977M6352.m6379();
        this.f31196 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f31192) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f31167) != null) {
            C4220.m11882(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f31167 = null;
        }
        Object obj = this.f31187;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f31192 = C4220.m11881(activity);
            } else {
                this.f31192 = null;
            }
        } else {
            this.f31192 = null;
        }
        m23571();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m23528() {
        ViewGroup viewGroup;
        CharSequence title;
        if (this.f31153) {
            return;
        }
        Context context = this.f31195;
        int[] iArr = C12108.f40539;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo23568(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, false)) {
            mo23568(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo23568(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo23568(10);
        }
        this.f31175 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m23531();
        this.f31196.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (!this.f31190) {
            if (this.f31175) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                this.f31173 = false;
                this.f31151 = false;
            } else if (this.f31151) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5716(context, typedValue.resourceId) : context).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                InterfaceC8246 interfaceC8246 = (InterfaceC8246) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
                this.f31191 = interfaceC8246;
                interfaceC8246.mo21630(this.f31196.getCallback());
                if (this.f31173) {
                    this.f31191.mo21628(109);
                }
                if (this.f31186) {
                    this.f31191.mo21628(2);
                }
                if (this.f31194) {
                    this.f31191.mo21628(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.f31159 ? (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f31151 + ", windowActionBarOverlay: " + this.f31173 + ", android:windowIsFloating: " + this.f31175 + ", windowActionModeOverlay: " + this.f31159 + ", windowNoTitle: " + this.f31190 + " }");
        }
        C5031.m13989(viewGroup, new C10780(this));
        if (this.f31191 == null) {
            this.f31185 = (TextView) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
        }
        int i = C20344.f65886;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C18829 c18829 = (C18829) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
        ViewGroup viewGroup2 = (ViewGroup) this.f31196.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c18829.addView(childAt);
            }
            viewGroup2.setId(-1);
            c18829.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f31196.setContentView(viewGroup);
        c18829.m43462(new C23480(this));
        this.f31198 = viewGroup;
        Object obj = this.f31187;
        if (obj instanceof Activity) {
            title = ((Activity) obj).getTitle();
        } else {
            title = this.f31200;
        }
        if (!TextUtils.isEmpty(title)) {
            InterfaceC8246 interfaceC8247 = this.f31191;
            if (interfaceC8247 == null) {
                AbstractC10697 abstractC10697 = this.f31154;
                if (abstractC10697 != null) {
                    abstractC10697.mo13889(title);
                } else {
                    TextView textView = this.f31185;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            } else {
                interfaceC8247.mo21631(title);
            }
        }
        C18829 c188210 = (C18829) this.f31198.findViewById(R.id.content);
        View decorView = this.f31196.getDecorView();
        c188210.m43461(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, c188210.m43463());
        typedArrayObtainStyledAttributes2.getValue(q.h, c188210.m43466());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, c188210.m43464());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, c188210.m43459());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, c188210.m43460());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH, c188210.m43465());
        }
        typedArrayObtainStyledAttributes2.recycle();
        c188210.requestLayout();
        this.f31153 = true;
        C8455 c8455M23563 = m23563(0);
        if (this.f31170 || c8455M23563.f29345 != null) {
            return;
        }
        m23532(108);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo23568(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f31190 && i == 108) {
            return false;
        }
        if (this.f31151 && i == 1) {
            this.f31151 = false;
        }
        if (i == 1) {
            m23527();
            this.f31190 = true;
            return true;
        }
        if (i == 2) {
            m23527();
            this.f31186 = true;
            return true;
        }
        if (i == 5) {
            m23527();
            this.f31194 = true;
            return true;
        }
        if (i == 10) {
            m23527();
            this.f31159 = true;
            return true;
        }
        if (i == 108) {
            m23527();
            this.f31151 = true;
            return true;
        }
        if (i == 109) {
            m23527();
            this.f31173 = true;
            return true;
        }
        return this.f31196.requestFeature(i);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23550(CharSequence charSequence) {
        this.f31200 = charSequence;
        InterfaceC8246 interfaceC8246 = this.f31191;
        if (interfaceC8246 == null) {
            AbstractC10697 abstractC10697 = this.f31154;
            if (abstractC10697 != null) {
                abstractC10697.mo13889(charSequence);
                return;
            }
            TextView textView = this.f31185;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        interfaceC8246.mo21631(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.۟ۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12067 m23544(C23356 c23356) {
        AbstractC12067 abstractC12067OnWindowStartingSupportActionMode;
        AbstractC12067 abstractC12067 = this.f31158;
        if (abstractC12067 != null) {
            abstractC12067.mo6784();
        }
        C2809 c2809 = new C2809(this, c23356);
        m23526();
        AbstractC10697 abstractC10697 = this.f31154;
        ?? r1 = this.f31164;
        if (abstractC10697 != null) {
            AbstractC12067 abstractC12067Mo13886 = abstractC10697.mo13886(c2809);
            this.f31158 = abstractC12067Mo13886;
            if (abstractC12067Mo13886 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC12067Mo13886);
            }
        }
        if (this.f31158 == null) {
            C20554 c20554 = this.f31169;
            if (c20554 != null) {
                c20554.m46322();
            }
            AbstractC12067 abstractC12068 = this.f31158;
            if (abstractC12068 != null) {
                abstractC12068.mo6784();
            }
            if (r1 == 0 || this.f31170) {
                abstractC12067OnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC12067OnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c2809);
                } catch (AbstractMethodError unused) {
                    abstractC12067OnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC12067OnWindowStartingSupportActionMode != null) {
                this.f31158 = abstractC12067OnWindowStartingSupportActionMode;
            } else {
                if (this.f31181 == null) {
                    if (this.f31175) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f31195;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C5716 c5716 = new C5716(context, 0);
                            c5716.getTheme().setTo(themeNewTheme);
                            context = c5716;
                        }
                        this.f31181 = new C19910(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, bin.mt.plus.R.attr.MT_Protector);
                        this.f31162 = popupWindow;
                        C10057.m25464(popupWindow, 2);
                        this.f31162.setContentView(this.f31181);
                        this.f31162.setWidth(-1);
                        context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        this.f31181.mo25318(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f31162.setHeight(-2);
                        this.f31157 = new RunnableC1606(this);
                    } else {
                        C21049 c21049 = (C21049) this.f31198.findViewById(bin.mt.plus.R.id.MT_Protector);
                        if (c21049 != null) {
                            c21049.m47463(LayoutInflater.from(m23574()));
                            this.f31181 = (C19910) c21049.m47462();
                        }
                    }
                }
                if (this.f31181 != null) {
                    C20554 c20555 = this.f31169;
                    if (c20555 != null) {
                        c20555.m46322();
                    }
                    this.f31181.m45195();
                    C10656 c10656 = new C10656(this.f31181.getContext(), this.f31181, c2809);
                    if (c2809.m8543(c10656, c10656.mo6791())) {
                        c10656.mo6783();
                        this.f31181.m45193(c10656);
                        this.f31158 = c10656;
                        if (m23533()) {
                            this.f31181.setAlpha(0.0f);
                            C20554 c20554M13980 = C5031.m13980(this.f31181);
                            c20554M13980.m46323(1.0f);
                            this.f31169 = c20554M13980;
                            c20554M13980.m46326(new C9369(this));
                        } else {
                            this.f31181.setAlpha(1.0f);
                            this.f31181.setVisibility(0);
                            if (this.f31181.getParent() instanceof View) {
                                C5031.m14002((View) this.f31181.getParent());
                            }
                        }
                        if (this.f31162 != null) {
                            this.f31196.getDecorView().post(this.f31157);
                        }
                    } else {
                        this.f31158 = null;
                    }
                }
            }
            AbstractC12067 abstractC12069 = this.f31158;
            if (abstractC12069 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC12069);
            }
            m23571();
            this.f31158 = this.f31158;
        }
        m23571();
        return this.f31158;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m23533() {
        ViewGroup viewGroup;
        return this.f31153 && (viewGroup = this.f31198) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m23570() {
        return this.f31193;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m23573() {
        boolean z = this.f31183;
        this.f31183 = false;
        C8455 c8455M23563 = m23563(0);
        if (!c8455M23563.f29343) {
            AbstractC12067 abstractC12067 = this.f31158;
            if (abstractC12067 == null) {
                m23526();
                AbstractC10697 abstractC10697 = this.f31154;
                if (abstractC10697 == null || !abstractC10697.mo13898()) {
                    return false;
                }
            } else {
                abstractC12067.mo6784();
                return true;
            }
        } else if (!z) {
            m23552(c8455M23563, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23555(KeyEvent keyEvent) {
        View decorView;
        boolean zMo21635;
        boolean zM23530;
        AudioManager audioManager;
        Object obj = this.f31187;
        if (((!(obj instanceof InterfaceC7791) && !(obj instanceof DialogC7749)) || (decorView = this.f31196.getDecorView()) == null || !C21196.m47654(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f31152.m18896(this.f31196.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f31183 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C8455 c8455M23563 = m23563(0);
                        if (!c8455M23563.f29343) {
                            m23530(c8455M23563, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f31158 == null) {
                        C8455 c8455M23564 = m23563(0);
                        InterfaceC8246 interfaceC8246 = this.f31191;
                        Context context = this.f31195;
                        if (interfaceC8246 != null && interfaceC8246.mo21632() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            if (!this.f31191.mo21627()) {
                                if (this.f31170 || !m23530(c8455M23564, keyEvent)) {
                                    zMo21635 = false;
                                } else {
                                    zMo21635 = this.f31191.mo21634();
                                }
                            } else {
                                zMo21635 = this.f31191.mo21635();
                            }
                        } else {
                            boolean z = c8455M23564.f29343;
                            if (z || c8455M23564.f29335) {
                                m23552(c8455M23564, true);
                                zMo21635 = z;
                            } else if (c8455M23564.f29337) {
                                if (c8455M23564.f29346) {
                                    c8455M23564.f29337 = false;
                                    zM23530 = m23530(c8455M23564, keyEvent);
                                } else {
                                    zM23530 = true;
                                }
                                if (zM23530) {
                                    m23522(c8455M23564, keyEvent);
                                    zMo21635 = true;
                                } else {
                                    zMo21635 = false;
                                }
                            } else {
                                zMo21635 = false;
                            }
                        }
                        if (zMo21635 && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (!m23573()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f31197 == null) {
            int[] iArr = C12108.f40539;
            Context context2 = this.f31195;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f31197 = new AppCompatViewInflater();
            } else {
                try {
                    this.f31197 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f31197 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f31197;
        int i = C7644.f25234;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo23534() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f31195);
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

    /* JADX WARN: Code duplicated, block: B:84:0x0196  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23522(C8455 c8455, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c8455.f29343;
        int i2 = c8455.f29336;
        if (z || this.f31170) {
            return;
        }
        Context context = this.f31195;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f31196.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c8455.f29345)) {
            m23552(c8455, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m23530(c8455, keyEvent)) {
            ViewGroup viewGroup = c8455.f29342;
            if (viewGroup != null && !c8455.f29348) {
                View view = c8455.f29344;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c8455.f29335 = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
                layoutParams2.gravity = c8455.f29349;
                layoutParams2.windowAnimations = c8455.f29341;
                windowManager.addView(c8455.f29342, layoutParams2);
                c8455.f29343 = true;
                if (i2 == 0) {
                    m23571();
                }
            }
            if (viewGroup != null) {
                if (c8455.f29348 && viewGroup.getChildCount() > 0) {
                    c8455.f29342.removeAllViews();
                }
            } else {
                Context contextM23574 = m23574();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextM23574.getResources().newTheme();
                themeNewTheme.setTo(contextM23574.getTheme());
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
                C5716 c5716 = new C5716(contextM23574, 0);
                c5716.getTheme().setTo(themeNewTheme);
                c8455.f29350 = c5716;
                TypedArray typedArrayObtainStyledAttributes = c5716.obtainStyledAttributes(C12108.f40539);
                c8455.f29338 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c8455.f29341 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c8455.f29342 = new C19038(this, c8455.f29350);
                c8455.f29349 = 81;
            }
            View view2 = c8455.f29344;
            if (view2 != null) {
                c8455.f29347 = view2;
            } else {
                if (c8455.f29345 != null) {
                    if (this.f31163 == null) {
                        this.f31163 = new C19744(this);
                    }
                    C19744 c19744 = this.f31163;
                    if (c8455.f29340 == null) {
                        C15946 c15946 = new C15946(c8455.f29350);
                        c8455.f29340 = c15946;
                        c15946.setCallback(c19744);
                        c8455.f29345.addMenuPresenter(c8455.f29340);
                    }
                    View view3 = (View) c8455.f29340.m37908(c8455.f29342);
                    c8455.f29347 = view3;
                    if (view3 != null) {
                    }
                }
                c8455.f29348 = true;
                return;
            }
            if (c8455.f29347 != null && (c8455.f29344 != null || c8455.f29340.m37907().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c8455.f29347.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c8455.f29342.setBackgroundResource(c8455.f29338);
                ViewParent parent = c8455.f29347.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c8455.f29347);
                }
                c8455.f29342.addView(c8455.f29347, layoutParams3);
                if (!c8455.f29347.hasFocus()) {
                    c8455.f29347.requestFocus();
                }
            }
            c8455.f29348 = true;
            return;
            i = -2;
            c8455.f29335 = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
            layoutParams4.gravity = c8455.f29349;
            layoutParams4.windowAnimations = c8455.f29341;
            windowManager.addView(c8455.f29342, layoutParams4);
            c8455.f29343 = true;
            if (i2 == 0) {
                m23571();
            }
        }
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        InterfaceC8246 interfaceC8246 = this.f31191;
        if (interfaceC8246 != null && interfaceC8246.mo21632() && (!ViewConfiguration.get(this.f31195).hasPermanentMenuKey() || this.f31191.mo21636())) {
            Window.Callback callback = this.f31196.getCallback();
            if (!this.f31191.mo21627()) {
                if (callback == null || this.f31170) {
                    return;
                }
                if (this.f31188 && (1 & this.f31178) != 0) {
                    View decorView = this.f31196.getDecorView();
                    Runnable runnable = this.f31166;
                    decorView.removeCallbacks(runnable);
                    ((RunnableC5840) runnable).run();
                }
                C8455 c8455M23563 = m23563(0);
                C12418 c12419 = c8455M23563.f29345;
                if (c12419 == null || c8455M23563.f29346 || !callback.onPreparePanel(0, c8455M23563.f29344, c12419)) {
                    return;
                }
                callback.onMenuOpened(108, c8455M23563.f29345);
                this.f31191.mo21634();
                return;
            }
            this.f31191.mo21635();
            if (this.f31170) {
                return;
            }
            callback.onPanelClosed(108, m23563(0).f29345);
            return;
        }
        C8455 c8455M23564 = m23563(0);
        c8455M23564.f29348 = true;
        m23552(c8455M23564, false);
        m23522(c8455M23564, (KeyEvent) null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m23530(C8455 c8455, KeyEvent keyEvent) {
        C12418 c12418;
        InterfaceC8246 interfaceC8246;
        InterfaceC8246 interfaceC8247;
        Resources.Theme themeNewTheme;
        InterfaceC8246 interfaceC8248;
        InterfaceC8246 interfaceC8249;
        if (!this.f31170) {
            boolean z = c8455.f29337;
            int i = c8455.f29336;
            if (z) {
                return true;
            }
            C8455 c8456 = this.f31177;
            if (c8456 != null && c8456 != c8455) {
                m23552(c8456, false);
            }
            Window.Callback callback = this.f31196.getCallback();
            if (callback != null) {
                c8455.f29344 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC8249 = this.f31191) != null) {
                interfaceC8249.mo21633();
            }
            if (c8455.f29344 == null && (!z2 || !(this.f31154 instanceof C14805))) {
                C12418 c12419 = c8455.f29345;
                if (c12419 == null || c8455.f29346) {
                    if (c12419 == null) {
                        Context context = this.f31195;
                        if ((i == 0 || i == 108) && this.f31191 != null) {
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
                                C5716 c5716 = new C5716(context, 0);
                                c5716.getTheme().setTo(themeNewTheme);
                                context = c5716;
                            }
                        }
                        C12418 c124110 = new C12418(context);
                        c124110.setCallback(this);
                        C12418 c124111 = c8455.f29345;
                        if (c124110 != c124111) {
                            if (c124111 != null) {
                                c124111.removeMenuPresenter(c8455.f29340);
                            }
                            c8455.f29345 = c124110;
                            C15946 c15946 = c8455.f29340;
                            if (c15946 != null) {
                                c124110.addMenuPresenter(c15946);
                            }
                        }
                        if (c8455.f29345 != null) {
                            if (z2 && (interfaceC8247 = this.f31191) != null) {
                                if (this.f31172 == null) {
                                    this.f31172 = new C14100(this);
                                }
                                interfaceC8247.mo21629(c8455.f29345, this.f31172);
                            }
                            c8455.f29345.stopDispatchingItemsChanged();
                            if (!callback.onCreatePanelMenu(i, c8455.f29345)) {
                                c8455.f29346 = false;
                            } else {
                                c12418 = c8455.f29345;
                                if (c12418 != null) {
                                    if (c12418 != null) {
                                        c12418.removeMenuPresenter(c8455.f29340);
                                    }
                                    c8455.f29345 = null;
                                }
                                if (z2 && (interfaceC8246 = this.f31191) != null) {
                                    interfaceC8246.mo21629(null, this.f31172);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f31172 == null) {
                                this.f31172 = new C14100(this);
                            }
                            interfaceC8247.mo21629(c8455.f29345, this.f31172);
                        }
                        c8455.f29345.stopDispatchingItemsChanged();
                        if (!callback.onCreatePanelMenu(i, c8455.f29345)) {
                            c8455.f29346 = false;
                        } else {
                            c12418 = c8455.f29345;
                            if (c12418 != null) {
                                if (c12418 != null) {
                                    c12418.removeMenuPresenter(c8455.f29340);
                                }
                                c8455.f29345 = null;
                            }
                            if (z2) {
                                interfaceC8246.mo21629(null, this.f31172);
                            }
                        }
                    }
                }
                c8455.f29345.stopDispatchingItemsChanged();
                Bundle bundle = c8455.f29339;
                if (bundle != null) {
                    c8455.f29345.restoreActionViewStates(bundle);
                    c8455.f29339 = null;
                }
                if (!callback.onPreparePanel(0, c8455.f29344, c8455.f29345)) {
                    if (z2 && (interfaceC8248 = this.f31191) != null) {
                        interfaceC8248.mo21629(null, this.f31172);
                    }
                    c8455.f29345.startDispatchingItemsChanged();
                    return false;
                }
                c8455.f29345.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c8455.f29345.startDispatchingItemsChanged();
            }
            c8455.f29337 = true;
            c8455.f29335 = false;
            this.f31177 = c8455;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23553(C12418 c12418) {
        if (this.f31184) {
            return;
        }
        this.f31184 = true;
        this.f31191.mo21626();
        Window.Callback callback = this.f31196.getCallback();
        if (callback != null && !this.f31170) {
            callback.onPanelClosed(108, c12418);
        }
        this.f31184 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23552(C8455 c8455, boolean z) {
        ViewGroup viewGroup;
        InterfaceC8246 interfaceC8246;
        if (z && c8455.f29336 == 0 && (interfaceC8246 = this.f31191) != null && interfaceC8246.mo21627()) {
            m23553(c8455.f29345);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f31195.getSystemService("window");
        if (windowManager != null && c8455.f29343 && (viewGroup = c8455.f29342) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m23546(c8455.f29336, c8455, (C12418) null);
            }
        }
        c8455.f29337 = false;
        c8455.f29335 = false;
        c8455.f29343 = false;
        c8455.f29347 = null;
        c8455.f29348 = true;
        if (this.f31177 == c8455) {
            this.f31177 = null;
        }
        if (c8455.f29336 == 0) {
            m23571();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23546(int i, C8455 c8455, C12418 c12418) {
        if (c12418 == null) {
            if (c8455 == null && i >= 0) {
                C8455[] c8455Arr = this.f31182;
                if (i < c8455Arr.length) {
                    c8455 = c8455Arr[i];
                }
            }
            if (c8455 != null) {
                c12418 = c8455.f29345;
            }
        }
        if ((c8455 == null || c8455.f29343) && !this.f31170) {
            this.f31152.m18894(this.f31196.getCallback(), i, c12418);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8455 m23565(C12418 c12418) {
        C8455[] c8455Arr = this.f31182;
        int length = c8455Arr != null ? c8455Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C8455 c8455 = c8455Arr[i];
            if (c8455 != null && c8455.f29345 == c12418) {
                return c8455;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C8455 m23563(int i) {
        C8455[] c8455Arr = this.f31182;
        if (c8455Arr == null || c8455Arr.length <= i) {
            C8455[] c8455Arr2 = new C8455[i + 1];
            if (c8455Arr != null) {
                System.arraycopy(c8455Arr, 0, c8455Arr2, 0, c8455Arr.length);
            }
            this.f31182 = c8455Arr2;
            c8455Arr = c8455Arr2;
        }
        C8455 c8455 = c8455Arr[i];
        if (c8455 != null) {
            return c8455;
        }
        C8455 c8456 = new C8455();
        c8456.f29336 = i;
        c8456.f29348 = false;
        c8455Arr[i] = c8456;
        return c8456;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23523(C8455 c8455, int i, KeyEvent keyEvent) {
        C12418 c12418;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c8455.f29337 || m23530(c8455, keyEvent)) && (c12418 = c8455.f29345) != null) {
            return c12418.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m23532(int i) {
        this.f31178 = (1 << i) | this.f31178;
        if (this.f31188) {
            return;
        }
        View decorView = this.f31196.getDecorView();
        int i2 = C5031.f17539;
        decorView.postOnAnimation(this.f31166);
        this.f31188 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m23535(int i) {
        C8455 c8455M23563 = m23563(i);
        if (c8455M23563.f29345 != null) {
            Bundle bundle = new Bundle();
            c8455M23563.f29345.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c8455M23563.f29339 = bundle;
            }
            c8455M23563.f29345.stopDispatchingItemsChanged();
            c8455M23563.f29345.clear();
        }
        c8455M23563.f29346 = true;
        c8455M23563.f29348 = true;
        if ((i == 108 || i == 0) && this.f31191 != null) {
            C8455 c8455M23564 = m23563(0);
            c8455M23564.f29337 = false;
            m23530(c8455M23564, (KeyEvent) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23541(C15844 c15844) {
        boolean z;
        boolean z2;
        int iM26299;
        int iM37681 = c15844.m37681();
        C19910 c19910 = this.f31181;
        if (c19910 == null || !(c19910.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31181.getLayoutParams();
            boolean z3 = true;
            if (this.f31181.isShown()) {
                if (this.f31180 == null) {
                    this.f31180 = new Rect();
                    this.f31161 = new Rect();
                }
                Rect rect = this.f31180;
                Rect rect2 = this.f31161;
                rect.set(c15844.m37683(), c15844.m37681(), c15844.m37672(), c15844.m37670());
                C20344.m45908(this.f31198, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C15844 c15844M13974 = C5031.m13974(this.f31198);
                int iM37683 = c15844M13974 == null ? 0 : c15844M13974.m37683();
                int iM37672 = c15844M13974 == null ? 0 : c15844M13974.m37672();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = this.f31195;
                if (i > 0 && this.f31165 == null) {
                    View view = new View(context);
                    this.f31165 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM37683;
                    layoutParams.rightMargin = iM37672;
                    this.f31198.addView(this.f31165, -1, layoutParams);
                } else {
                    View view2 = this.f31165;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM37683 || marginLayoutParams2.rightMargin != iM37672) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM37683;
                            marginLayoutParams2.rightMargin = iM37672;
                            this.f31165.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f31165;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = this.f31165;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        iM26299 = C10405.m26299(context, bin.mt.plus.R.color.MT_Protector);
                    } else {
                        iM26299 = C10405.m26299(context, bin.mt.plus.R.color.MT_Protector);
                    }
                    view4.setBackgroundColor(iM26299);
                }
                if (!this.f31159 && z3) {
                    iM37681 = 0;
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
                this.f31181.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f31165;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM37681;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23527() {
        if (this.f31153) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m23560() {
        InterfaceC8246 interfaceC8246 = this.f31191;
        if (interfaceC8246 != null) {
            interfaceC8246.mo21626();
        }
        if (this.f31162 != null) {
            this.f31196.getDecorView().removeCallbacks(this.f31157);
            if (this.f31162.isShowing()) {
                try {
                    this.f31162.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f31162 = null;
        }
        C20554 c20554 = this.f31169;
        if (c20554 != null) {
            c20554.m46322();
        }
        C12418 c12418 = m23563(0).f29345;
        if (c12418 != null) {
            c12418.close();
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context mo23561() {
        return this.f31195;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23545() {
        final Context context = this.f31195;
        if (AbstractC17129.m40002(context) && AbstractC17129.m39999() != null && !AbstractC17129.m39999().equals(AbstractC17129.m40000())) {
            AbstractC17129.f54630.execute(new Runnable() { // from class: l.᩷ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC17129.m39995(context);
                }
            });
        }
        m23524(true, true);
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo23567() {
        return m23524(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23524(boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        if (this.f31170) {
            return false;
        }
        int iM39998 = this.f31201;
        if (iM39998 == -100) {
            iM39998 = AbstractC17129.m39998();
        }
        Context context = this.f31195;
        int iM23540 = m23540(context, iM39998);
        int i3 = Build.VERSION.SDK_INT;
        C17855 c17855M23525 = i3 < 33 ? m23525(context) : null;
        if (!z2 && c17855M23525 != null) {
            c17855M23525 = m23529(context.getResources().getConfiguration());
        }
        Configuration configurationM23520 = m23520(context, iM23540, c17855M23525, null, false);
        boolean z4 = this.f31156;
        boolean z5 = true;
        Object obj = this.f31187;
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
                        this.f31176 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f31176 = 0;
                }
                this.f31156 = true;
                i = this.f31176;
            }
        } else {
            this.f31156 = true;
            i = this.f31176;
        }
        Configuration configuration = this.f31171;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM23520.uiMode & 48;
        C17855 c17855M23529 = m23529(configuration);
        C17855 c17855M235210 = c17855M23525 == null ? null : m23529(configurationM23520);
        int i6 = i4 != i5 ? 512 : 0;
        if (c17855M235210 != null && !c17855M23529.equals(c17855M235210)) {
            i6 |= o.a.t;
        }
        if (((~i) & i6) != 0 && z && this.f31199 && ((f31149 || this.f31189) && (obj instanceof Activity))) {
            final Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM23520.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.۬᩶
                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity2 = activity;
                            if (activity2.isFinishing() || C7686.m20317(activity2)) {
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
            if (c17855M235210 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    C22566.m50072(configuration2, c17855M235210);
                } else {
                    configuration2.setLocale(c17855M235210.m41450(0));
                    configuration2.setLayoutDirection(c17855M235210.m41450(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26) {
                C16921.m39610(resources);
            }
            int i9 = this.f31168;
            if (i9 != 0) {
                context.setTheme(i9);
                if (i8 >= 23) {
                    context.getTheme().applyStyle(this.f31168, true);
                }
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC1423) {
                    if (((InterfaceC1423) activity2).getLifecycle().mo9170().m24173(EnumC9414.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f31189 && !this.f31170) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c17855M235210 != null) {
            C17855 c17855M235211 = m23529(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                C22566.m50073(c17855M235211);
            } else {
                Locale.setDefault(c17855M235211.m41450(0));
            }
        }
        if (iM39998 != 0) {
            C18332 c18332 = this.f31160;
            if (c18332 != null) {
                c18332.m48641();
            }
        } else {
            if (this.f31160 == null) {
                this.f31160 = new C18332(this, C3514.m10342(context));
            }
            this.f31160.m48640();
        }
        if (iM39998 != 3) {
            C23272 c23272 = this.f31179;
            if (c23272 != null) {
                c23272.m48641();
            }
        } else {
            if (this.f31179 == null) {
                this.f31179 = new C23272(this, context);
            }
            this.f31179.m48640();
        }
        return z5;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C17855 m23525(Context context) {
        C17855 c17855M39999;
        C17855 c17855M41446;
        Locale localeM41450;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c17855M39999 = AbstractC17129.m39999()) == null) {
            return null;
        }
        C17855 c17855M23529 = m23529(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            if (c17855M39999.m41451()) {
                c17855M41446 = C17855.m41448();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < c17855M23529.m41453() + c17855M39999.m41453(); i2++) {
                    if (i2 < c17855M39999.m41453()) {
                        localeM41450 = c17855M39999.m41450(i2);
                    } else {
                        localeM41450 = c17855M23529.m41450(i2 - c17855M39999.m41453());
                    }
                    if (localeM41450 != null) {
                        linkedHashSet.add(localeM41450);
                    }
                }
                c17855M41446 = C17855.m41447((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (c17855M39999.m41451()) {
            c17855M41446 = C17855.m41448();
        } else {
            c17855M41446 = C17855.m41446(C5632.m15526(c17855M39999.m41450(0)));
        }
        return c17855M41446.m41451() ? c17855M23529 : c17855M41446;
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo23537(int i) {
        if (this.f31201 != i) {
            this.f31201 = i;
            if (this.f31199) {
                m23524(true, true);
            }
        }
    }

    @Override // l.AbstractC17129
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo23536() {
        return this.f31201;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17855 m23529(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C22566.m50070(configuration);
        }
        return C17855.m41446(C5632.m15526(configuration.locale));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Configuration m23520(Context context, int i, C17855 c17855, Configuration configuration, boolean z) {
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
        if (c17855 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C22566.m50072(configuration2, c17855);
                return configuration2;
            }
            configuration2.setLocale(c17855.m41450(0));
            configuration2.setLayoutDirection(c17855.m41450(0));
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23540(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f31179 == null) {
                            this.f31179 = new C23272(this, context);
                        }
                        return this.f31179.m51350();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f31160 == null) {
                        this.f31160 = new C18332(this, C3514.m10342(context));
                    }
                    return this.f31160.m42564();
                }
            }
            return i;
        }
        return -1;
    }
}
