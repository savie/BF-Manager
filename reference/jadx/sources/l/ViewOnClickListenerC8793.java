package l;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۡۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC8793 extends AbstractActivityC12483 implements View.OnClickListener, InterfaceC7503, InterfaceC21414 {

    /* JADX INFO: renamed from: ܽ֫ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f30221;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30222 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30223;

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public boolean f30224;

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public boolean f30227;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public String f30229;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public C1736 f30230;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public boolean f30231;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public C12093 f30232;

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f30233;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C19376 f30234;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public C14956 f30235;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public C7381 f30236;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30237;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public TextView f30238;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public C13026 f30239;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f30240;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public boolean f30241;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public String f30242;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public View f30243;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f30244;

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC7955 f30246;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public boolean f30248;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public View f30249;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30251;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f30252;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public View f30253;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public C14956 f30254;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C17381 f30256;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30257;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C0325 f30258;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30260;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public View f30261;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f30262;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f30263;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30264;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30265 = true;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30245 = true;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30259 = true;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public long f30247 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public Executor f30225 = C5742.m15800();

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public Executor f30255 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final C18670 f30228 = new C18670();

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30226 = false;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public boolean f30250 = true;

    static {
        ApplicationC6132.m17119(99);
        f30221 = new short[]{2773, -9762, 10594, 14426, 11268, 13851, -11531};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public native void m22879(boolean z);

    @Override // l.InterfaceC7503
    public final void onDrawerSlide(View view, float f) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "HexEditor";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f30246 = ViewOnClickListenerC7955.m20995(this);
        this.f30258 = new C0325(this);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C15143 c15143 = new C15143(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c15143);
        this.f30253 = m31016(R.id.MT_Protector);
        this.f30243 = m31016(R.id.MT_Protector);
        this.f30261 = m31016(R.id.MT_Protector);
        this.f30239 = (C13026) m31016(R.id.MT_Protector);
        this.f30238 = (TextView) m31016(R.id.MT_Protector);
        this.f30254 = (C14956) m31016(R.id.MT_Protector);
        this.f30235 = (C14956) m31016(R.id.MT_Protector);
        C17381 c17381 = (C17381) m31016(R.id.MT_Protector);
        this.f30256 = c17381;
        c17381.m40481(this);
        m22870(R.id.MT_Protector);
        m22870(R.id.button1);
        m22870(R.id.button2);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        m22870(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        this.f30239.getClass();
        textView.setTypeface(C10682.f36444);
        TextView textView2 = (TextView) m31016(R.id.MT_Protector);
        this.f30239.getClass();
        textView2.setTypeface(C10682.f36444);
        this.f30238.setOnClickListener(this);
        this.f30239.m32230(this);
        View viewM31016 = m31016(R.id.MT_Protector);
        this.f30249 = viewM31016;
        viewM31016.setOnClickListener(this);
        if (getResources().getConfiguration().orientation != 1) {
            this.f30261.setVisibility(0);
            this.f30254.m35937(16);
            this.f30235.m35937(2);
            m22871(true);
        }
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()) || "android.intent.action.EDIT".equals(intent.getAction())) {
            if (C5553.m15320((AbstractActivityC12483) this)) {
                return;
            }
            this.f30240 = C5553.m15309(getIntent());
            this.f30248 = intent.getBooleanExtra("readOnly", false);
            this.f30242 = this.f30240.getName();
            m22869();
            C12093 c12093 = null;
            this.f30229 = bundle == null ? null : bundle.getString("hex_session_token");
            if (bundle != null && bundle.getBoolean("hex_ui_present", false)) {
                c12093 = new C12093(bundle.getBoolean("hex_ui_keyboard_showing"), bundle.getBoolean("hex_ui_keyboard_enable"), bundle.getBoolean("hex_ui_hex_mode"), C1030.m3875(bundle.getLong("hex_ui_scroll"), bundle.getInt("hex_ui_selection_start"), bundle.getInt("hex_ui_selection_end"), bundle.getBoolean("hex_ui_select_hex_first"), bundle.getBoolean("hex_ui_multi_select")));
            }
            this.f30232 = c12093;
            new C21264(this, this.f30229, false, false).m10243();
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m22891() {
        return this.f30248 || this.f30241;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22894(C2516 c2516, C1736 c1736, C7381 c7381, boolean z, boolean z2) {
        try {
            if (this.f30251 || isFinishing()) {
                try {
                    c2516.close();
                } catch (IOException unused) {
                }
                if (c1736 == null || m22900(c1736)) {
                } else {
                    c1736.m5783();
                }
            } else {
                boolean zM22891 = m22891();
                this.f30241 = z2;
                this.f30239.m32231(m22891());
                C2516 c2516M32222 = this.f30239.m32222(c2516);
                C1736 c1737 = this.f30230;
                this.f30230 = c1736;
                this.f30236 = c7381;
                this.f30260 = z;
                this.f30227 = false;
                C12093 c12093 = this.f30232;
                this.f30232 = null;
                this.f30229 = null;
                if (c12093 != null) {
                    this.f30265 = c12093.f40461;
                    this.f30245 = c12093.f40462;
                    this.f30259 = c12093.f40460;
                    try {
                        this.f30239.m32229(c12093.f40459);
                    } catch (IllegalArgumentException unused2) {
                        m22892(this.f30239.f43452.m33443(), this.f30239.f43452.m33465(), this.f30239.f43452.m33442(), this.f30239.f43452.m33475());
                    }
                    this.f30249.setAlpha(this.f30245 ? 1.0f : 0.3f);
                    if (!this.f30265) {
                        this.f30243.setVisibility(8);
                        this.f30253.setVisibility(4);
                    }
                }
                if (c1736 == null || !c1736.m5775()) {
                    this.f30247 = Long.MIN_VALUE;
                    this.f30231 = false;
                } else {
                    this.f30247 = c2516.m7808();
                    this.f30231 = c2516.m7804();
                }
                if (zM22891 && !m22891()) {
                    this.f30245 = true;
                    this.f30265 = true;
                }
                boolean zM22892 = m22891();
                this.f30239.m32231(zM22892);
                this.f30246.m21009(zM22892);
                m31016(R.id.MT_Protector).setVisibility(this.f30241 ? 0 : 8);
                m22869();
                ObjectAnimator objectAnimator = this.f30262;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.f30262 = null;
                }
                this.f30253.setTranslationY(0.0f);
                this.f30249.setEnabled(!zM22892);
                if (zM22892) {
                    this.f30245 = false;
                    this.f30249.setAlpha(0.3f);
                    this.f30265 = false;
                    this.f30243.setVisibility(8);
                    this.f30253.setVisibility(8);
                    m31017();
                } else {
                    this.f30249.setAlpha(this.f30245 ? 1.0f : 0.3f);
                    this.f30243.setVisibility(this.f30265 ? 0 : 8);
                    this.f30253.setVisibility(this.f30265 ? 0 : 4);
                    if (m25489() != null) {
                        m25489().mo13895(false);
                    }
                    this.f41645.setNavigationIcon((Drawable) null);
                }
                this.f41645.setNavigationOnClickListener(zM22892 ? new ViewOnClickListenerC22904(0, this) : null);
                this.f30258.m1976();
                invalidateOptionsMenu();
                m22895(c2516, c7381);
                if (c2516M32222 != null && c2516M32222 != c2516) {
                    try {
                        c2516M32222.close();
                    } catch (IOException unused3) {
                    }
                }
                if (c1737 == null || c1737 == c1736) {
                    return;
                }
                if (c1736 != null && c1737.m5780().equals(c1736.m5780())) {
                } else {
                    c1737.m5783();
                }
            }
        } catch (IOException unused4) {
        }
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m22869() {
        if (this.f30241) {
            setTitle(this.f30242);
            this.f41645.setSubtitle(getString(R.string.MT_Protector));
        } else if (this.f30248) {
            setTitle(this.f30242);
            this.f41645.setSubtitle((CharSequence) null);
        } else {
            setTitle(R.string.MT_Protector);
            this.f41645.setSubtitle(this.f30226 ? C22697.m50267(new StringBuilder(), this.f30242, " *") : this.f30242);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22900(C1736 c1736) {
        return this.f30237 && !(this.f30257 || isFinishing()) && c1736 != null && c1736.m5782();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22889() {
        return this.f30237;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22890() {
        return this.f30251 || isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22899(Object obj, C2516 c2516) {
        C13026 c13026;
        return (this.f30251 || isFinishing() || isDestroyed() || (c13026 = this.f30239) == null || c13026.f43452.m33458() != c2516 || !this.f30228.m43156(obj, c2516)) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22904(Object obj, C2516 c2516) {
        this.f30228.m43159(obj, c2516);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22896(C7381 c7381) {
        this.f30236 = c7381;
        C1736 c1736 = this.f30230;
        this.f30247 = Long.MIN_VALUE;
        this.f30231 = false;
        if (c1736 == null) {
            this.f30237 = false;
            this.f30264 = false;
        } else {
            try {
                if (this.f30260) {
                    this.f30237 = false;
                    this.f30264 = false;
                    this.f30230 = null;
                    c1736.m5783();
                } else {
                    this.f30247 = this.f30239.f43452.m33458().m7808();
                    this.f30231 = false;
                }
            } catch (IOException unused) {
            }
        }
        this.f30239.m32239();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22905(C7381 c7381) {
        if (c7381 != null) {
            this.f30236 = c7381;
        }
        m22882(false);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        C13026 c13026;
        C1736 c1736;
        super.onResume();
        boolean z = this.f30237;
        boolean z2 = this.f30264;
        boolean zM5775 = false;
        this.f30237 = false;
        this.f30264 = false;
        if (z && z2 && !this.f30251 && !this.f30227 && (c1736 = this.f30230) != null && this.f30236 != null) {
            if (c1736.m5784()) {
                zM5775 = true;
            } else {
                try {
                    this.f30239.f43452.m33458().m7802();
                } catch (IOException unused) {
                    zM5775 = this.f30230.m5775();
                }
            }
            if (zM5775) {
                String strM5780 = this.f30230.m5780();
                this.f30229 = strM5780;
                this.f30227 = true;
                new C21264(this, strM5780, true, true).m10243();
            }
        }
        if (this.f30227 || this.f30236 == null || (c13026 = this.f30239) == null) {
            return;
        }
        C2516 c2516M33458 = c13026.f43452.m33458();
        if (this.f30228.m43157(c2516M33458)) {
            return;
        }
        try {
            c2516M33458.m7802();
            m22895(c2516M33458, this.f30236);
        } catch (IOException e) {
            m22893(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22895(C2516 c2516, C7381 c7381) {
        if (this.f30251 || this.f30227 || this.f30234 != null || this.f30228.m43157(c2516)) {
            return;
        }
        C19376 c19376 = new C19376(this, c2516, c7381);
        this.f30234 = c19376;
        try {
            c19376.m10243();
        } catch (RuntimeException unused) {
            this.f30234 = null;
            m31018(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m22901() {
        C13026 c13026;
        C2516 c2516M33458;
        this.f30229 = null;
        this.f30227 = false;
        if (this.f30251 || (c13026 = this.f30239) == null || this.f30236 == null || (c2516M33458 = c13026.f43452.m33458()) == null) {
            return;
        }
        m22895(c2516M33458, this.f30236);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m22907() {
        C13026 c13026;
        if (this.f30251 || !this.f30227 || (c13026 = this.f30239) == null) {
            return false;
        }
        C2516 c2516M33458 = c13026.f43452.m33458();
        try {
            c2516M33458.m7802();
            return !this.f30251 && this.f30239.f43452.m33458() == c2516M33458;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22870(int i) {
        TextView textView = (TextView) m31016(i);
        textView.setOnClickListener(this);
        this.f30239.getClass();
        textView.setTypeface(C10682.f36444);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            this.f30261.setVisibility(8);
            this.f30254.m35937(8);
            this.f30235.m35937(1);
            m22871(false);
            return;
        }
        this.f30261.setVisibility(0);
        this.f30254.m35937(16);
        this.f30235.m35937(2);
        m22871(true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22871(boolean z) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (z) {
            int i = attributes.flags;
            if ((i & 1024) != 0) {
                return;
            } else {
                attributes.flags = i | 1024;
            }
        } else {
            int i2 = attributes.flags;
            if ((i2 & 1024) == 0) {
                return;
            } else {
                attributes.flags = i2 ^ 1024;
            }
        }
        getWindow().setAttributes(attributes);
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C3989 c3989M7801;
        Throwable th;
        Throwable th2;
        boolean z;
        long j;
        C1736 c1736M5770;
        boolean z2;
        boolean z3 = this.f30264;
        this.f30237 = false;
        this.f30264 = false;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f30246;
        if (viewOnClickListenerC7955 != null) {
            viewOnClickListenerC7955.m21008();
        }
        C13026 c13026 = this.f30239;
        if (c13026 != null) {
            c13026.m32219();
            this.f30239.m32238();
        }
        C13026 c13027 = this.f30239;
        C2516 c2516M33458 = c13027 == null ? null : c13027.f43452.m33458();
        C7381 c7381 = this.f30236;
        if (c7381 == null || c2516M33458 == null) {
            c3989M7801 = null;
            th = null;
        } else {
            try {
                c3989M7801 = c2516M33458.m7801();
                th = null;
            } catch (Throwable th3) {
                th = th3;
                c3989M7801 = null;
            }
            this.f30232 = new C12093(this.f30265, this.f30245, this.f30259, this.f30239.m32221(c3989M7801 == null ? null : c3989M7801.m11489()));
        }
        C12093 c12093 = this.f30232;
        if (c12093 != null) {
            bundle.putBoolean("hex_ui_present", true);
            bundle.putBoolean("hex_ui_keyboard_showing", c12093.f40461);
            bundle.putBoolean("hex_ui_keyboard_enable", c12093.f40462);
            bundle.putBoolean("hex_ui_hex_mode", c12093.f40460);
            C1030 c1030 = c12093.f40459;
            bundle.putLong("hex_ui_scroll", c1030.f4811);
            bundle.putInt("hex_ui_selection_start", c1030.f4809);
            bundle.putInt("hex_ui_selection_end", c1030.f4807);
            bundle.putBoolean("hex_ui_select_hex_first", c1030.f4810);
            bundle.putBoolean("hex_ui_multi_select", c1030.f4808);
        }
        String str = this.f30229;
        if (str != null && (this.f30236 == null || this.f30227)) {
            bundle.putString("hex_session_token", str);
            this.f30237 = true;
        } else {
            C1736 c1736 = this.f30230;
            if (!this.f30227 && c2516M33458 != null && c7381 != null && c3989M7801 != null) {
                try {
                    boolean z4 = !m22891() && c3989M7801.m11490();
                    long jM11491 = c3989M7801.m11491();
                    if (!z4 && this.f30260) {
                        this.f30247 = Long.MIN_VALUE;
                        this.f30231 = false;
                        if (c1736 != null) {
                            this.f30230 = null;
                            c1736.m5783();
                        }
                    } else if (c1736 != null && this.f30247 == jM11491 && this.f30231 == z4 && c1736.m5782()) {
                        bundle.putString("hex_session_token", c1736.m5780());
                        this.f30237 = true;
                        this.f30264 = z3;
                    } else {
                        if (c1736 == null) {
                            c1736M5770 = C1736.m5770();
                            z2 = true;
                        } else {
                            c1736M5770 = c1736;
                            z2 = false;
                        }
                        try {
                            C23610 c23610M15802 = C5742.m15802(c1736M5770, c7381, this.f30260, c2516M33458, z4, this.f30241, !this.f30228.m43157(c2516M33458), this.f30225);
                            bundle.putString("hex_session_token", c1736M5770.m5780());
                            this.f30237 = true;
                            this.f30264 = true;
                            this.f30247 = c23610M15802.m52083();
                            this.f30231 = z4;
                            if (z2) {
                                this.f30230 = c1736M5770;
                            }
                        } catch (Throwable th4) {
                            c1736 = c1736M5770;
                            j = Long.MIN_VALUE;
                            boolean z5 = z2;
                            th2 = th4;
                            z = z5;
                            this.f30247 = j;
                            this.f30231 = false;
                            if (z) {
                                try {
                                    c1736.m5783();
                                } catch (IOException e) {
                                    th2.addSuppressed(e);
                                }
                            } else if (c1736 != null) {
                                try {
                                    c1736.m5781();
                                } catch (IOException e2) {
                                    th2.addSuppressed(e2);
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    z = false;
                    j = Long.MIN_VALUE;
                }
            } else if (th != null) {
                this.f30247 = Long.MIN_VALUE;
                this.f30231 = false;
                if (c1736 != null) {
                    try {
                        c1736.m5781();
                    } catch (IOException e3) {
                        th.addSuppressed(e3);
                    }
                }
            }
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f30244 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f30263 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f30233 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        boolean zM7804 = this.f30239.f43452.m33458().m7804();
        boolean zM33468 = this.f30239.f43452.m33468();
        boolean zM33451 = this.f30239.f43452.m33451();
        this.f30233.setEnabled(zM7804);
        this.f30263.setEnabled(zM33468);
        this.f30244.setEnabled(zM33451);
        if (!m22891()) {
            return true;
        }
        this.f30233.setVisible(false);
        this.f30263.setVisible(false);
        this.f30244.setVisible(false);
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f30239.m32243();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f30239.m32220();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m22879(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m22876();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f30256.m40473(8388613)) {
                this.f30256.m40477(8388613);
            }
            this.f30256.m40484(8388611);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f30256.m40473(8388611)) {
                this.f30256.m40477(8388611);
            }
            this.f30256.m40484(8388613);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C9976.m25241(this.f30239);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        final C13026 c13026 = this.f30239;
        Context context = c13026.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            C15829.m37617(R.string.MT_Protector, 0).m37622();
            return true;
        }
        final CharSequence text = clipboardManager.getText();
        if (TextUtils.isEmpty(text)) {
            C15829.m37617(R.string.MT_Protector, 0).m37622();
            return true;
        }
        final C17072 c17072M39856 = C17072.m39856(c13026);
        if (c17072M39856 == null) {
            return true;
        }
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(context);
        c8067.m21255(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۗۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13026 c13027 = c13026;
                C13638.requireNonNull(c13027, "editView");
                CharSequence charSequence = text;
                C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
                C17072 c17072 = c17072M39856;
                if (c17072.m39857(c13027)) {
                    C19895 c19895 = new C19895();
                    final C5783 c5783 = new C5783(c13027, c17072);
                    C11615 c11615M32223 = c13027.m32223(new RunnableC19189(c19895), new Runnable() { // from class: l.ۡۗۚ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c5783.m15917();
                        }
                    });
                    if (c11615M32223 == null) {
                        C15829.m37611(R.string.MT_Protector);
                    } else if (!c17072.m39857(c13027)) {
                        c11615M32223.close();
                    } else {
                        new C15662(c13027, c19895, c17072, c11615M32223, c5783, charSequence, i2).m10243();
                    }
                }
            }
        });
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        dialogInterfaceC19356M21252.m44378().setDimAmount(0.0f);
        dialogInterfaceC19356M21252.m44362();
        return true;
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m22876();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public void m22876() {
        if (C1709.m5693() && this.f30239.f43452.m33458().m7804()) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21277(this.f30242);
            c8067.m21253(R.string.MT_Protector);
            int i2 = 0;
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3852(this, i2));
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6675(this, i2));
            c8067.m21269();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f30257 = true;
        C1736 c1736 = this.f30230;
        String str = this.f30229;
        this.f30230 = null;
        this.f30229 = null;
        if (c1736 != null) {
            try {
                c1736.m5783();
            } catch (IOException unused) {
            }
        }
        if (str != null && (c1736 == null || !str.equals(c1736.m5780()))) {
            try {
                C1736.m5768(str);
            } catch (IOException unused2) {
            }
        }
        super.finish();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        boolean z = true;
        this.f30251 = true;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f30246;
        if (viewOnClickListenerC7955 != null) {
            viewOnClickListenerC7955.m21008();
        }
        C13026 c13026 = this.f30239;
        if (c13026 != null) {
            c13026.m32219();
            boolean zM32238 = this.f30239.m32238();
            C2516 c2516M33458 = this.f30239.f43452.m33458();
            if (c2516M33458 != null) {
                RunnableC8087 runnableC8087 = new RunnableC8087(c2516M33458);
                if (!zM32238) {
                    runnableC8087.run();
                } else {
                    try {
                        this.f30255.execute(runnableC8087);
                    } catch (Error | RuntimeException unused) {
                        if (!this.f30239.m32233(runnableC8087)) {
                            runnableC8087.run();
                        }
                    }
                }
            }
        }
        C13732.m33431(getCacheDir());
        C1736 c1736 = this.f30230;
        if (c1736 != null) {
            boolean z2 = this.f30237;
            if (!this.f30257 && !isFinishing()) {
                z = false;
            }
            if (!z2 || z || !c1736.m5782()) {
                this.f30230 = null;
                try {
                    c1736.m5783();
                } catch (IOException unused2) {
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    private void m22887() {
        if (this.f30239.f43452.m33475() || m22891() || this.f30265) {
            return;
        }
        this.f30265 = true;
        ObjectAnimator objectAnimator = this.f30262;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f30262 = null;
        }
        View view = this.f30253;
        view.setTranslationY(view.getHeight());
        this.f30253.setVisibility(0);
        View view2 = this.f30253;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getHeight(), 0.0f);
        this.f30262 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f30262.setInterpolator(new DecelerateInterpolator());
        this.f30262.addListener(new C21492(this));
        this.f30262.start();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m22902() {
        if (this.f30265) {
            this.f30265 = false;
            ObjectAnimator objectAnimator = this.f30262;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f30262 = null;
            }
            this.f30243.setVisibility(8);
            View view = this.f30253;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
            this.f30262 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.f30262.setInterpolator(new AccelerateInterpolator());
            this.f30262.addListener(new C17964(this));
            this.f30262.start();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(0);
            return;
        }
        if (id == R.id.button1) {
            this.f30239.m32237(1);
            return;
        }
        if (id == R.id.button2) {
            this.f30239.m32237(2);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(3);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(4);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(5);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(6);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(7);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(8);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(9);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(10);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(11);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(12);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(13);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(14);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f30239.m32237(15);
            return;
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                this.f30259 = !this.f30259;
                m22892(this.f30239.f43452.m33443(), this.f30239.f43452.m33465(), this.f30239.f43452.m33442(), this.f30239.f43452.m33475());
                return;
            }
            return;
        }
        if (this.f30245) {
            this.f30245 = false;
            this.f30249.setAlpha(0.3f);
            m22902();
        } else {
            this.f30245 = true;
            this.f30249.setAlpha(1.0f);
            m22887();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22892(int i, int i2, int i3, boolean z) {
        if (z) {
            if (this.f30245) {
                m22902();
            }
            this.f30238.setText(String.format(Locale.ENGLISH, this.f30259 ? "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]" : "Sel: %d - %d  Len: %d  Size: %d [DEC]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((i2 - i) + 1), Integer.valueOf(i3)));
        } else {
            if (i < i3) {
                String str = this.f30259 ? "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]" : "Val: %d  Pos: %d  Size: %d [DEC]";
                try {
                    byte[] bArr = new byte[1];
                    this.f30239.f43452.m33458().m7798(i, 1, bArr);
                    this.f30238.setText(String.format(Locale.ENGLISH, str, Integer.valueOf(bArr[0] & 255), Integer.valueOf(i), Integer.valueOf(i3)));
                    return;
                } catch (IOException e) {
                    m22893(e);
                    return;
                }
            }
            this.f30238.setText(String.format(Locale.ENGLISH, this.f30259 ? "Size: %Xh [HEX]" : "Size: %d [DEC]", Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m22906() {
        if (this.f30245) {
            m22887();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22893(IOException iOException) {
        C2516 c2516M33458 = this.f30239.f43452.m33458();
        if (!(iOException instanceof C8599) && !c2516M33458.m7799()) {
            m31002(iOException, (DialogInterface.OnDismissListener) null);
        } else {
            m22882(true);
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m22903() {
        m22882(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22882(boolean z) {
        if (this.f30227 || this.f30251) {
            return;
        }
        this.f30227 = true;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f30246;
        if (viewOnClickListenerC7955 != null) {
            viewOnClickListenerC7955.m21008();
        }
        this.f30239.m32219();
        this.f30239.m32238();
        String strM5780 = null;
        this.f30232 = new C12093(this.f30265, this.f30245, this.f30259, this.f30239.m32221((C16691) null));
        C1736 c1736 = this.f30230;
        if (z && c1736 != null && c1736.m5775()) {
            strM5780 = c1736.m5780();
        }
        this.f30229 = strM5780;
        new C21264(this, strM5780, true, false).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22898(boolean z, boolean z2, boolean z3) {
        if (this.f30226 != z3) {
            this.f30226 = z3;
            this.f41645.setSubtitle(z3 ? C22697.m50267(new StringBuilder(), this.f30242, " *") : this.f30242);
        }
        InterfaceMenuItemC9720 interfaceMenuItemC9720 = this.f30233;
        if (interfaceMenuItemC9720 != null) {
            interfaceMenuItemC9720.setEnabled(z3);
        }
        InterfaceMenuItemC9720 interfaceMenuItemC9721 = this.f30263;
        if (interfaceMenuItemC9721 != null) {
            interfaceMenuItemC9721.setEnabled(z);
        }
        InterfaceMenuItemC9720 interfaceMenuItemC9722 = this.f30244;
        if (interfaceMenuItemC9722 != null) {
            interfaceMenuItemC9722.setEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22897(boolean z) {
        C17381 c17381;
        int i;
        if (z) {
            c17381 = this.f30256;
            i = 1;
        } else {
            c17381 = this.f30256;
            i = 0;
        }
        c17381.m40478(i, 3);
        c17381.m40478(i, 5);
    }

    @Override // l.InterfaceC7503
    public final void onDrawerOpened(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f30224 = true;
        } else {
            this.f30223 = true;
        }
    }

    @Override // l.InterfaceC7503
    public final void onDrawerClosed(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f30224 = false;
        } else {
            this.f30223 = false;
        }
    }

    @Override // l.InterfaceC7503
    public final void onDrawerStateChanged(int i) {
        if (i == 2 && this.f30224) {
            this.f30246.m21012();
            if (this.f30252 == null) {
                InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method");
                this.f30252 = inputMethodManager;
                if (inputMethodManager == null) {
                    return;
                }
            }
            this.f30252.hideSoftInputFromWindow(this.f30239.getWindowToken(), 0);
            return;
        }
        if (i != 0) {
            if (this.f30223 || !this.f30250) {
                return;
            }
            this.f30258.m1976();
            this.f30250 = false;
            return;
        }
        this.f30250 = true;
    }

    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        if (((C14277) c15313.m36673()).m34485()) {
            C14277 c14277 = new C14277();
            c14277.m34465(this.f30239.f43452.m33458());
            c15313.m36672(c14277);
        } else {
            C14277 c14278 = new C14277();
            c14278.m34463(this.f30239.f43452.m33442());
            c15313.m36672(c14278);
        }
    }
}
