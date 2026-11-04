package l;

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
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC19341 extends AbstractActivityC17204 implements View.OnClickListener, InterfaceC16357, InterfaceC6656, InterfaceC22760, InterfaceC23488 {

    /* JADX INFO: renamed from: ۜܰ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f62461;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62462 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f62466;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public String f62467;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f62468;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public InputMethodManager f62469;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public boolean f62470;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f62471;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62472;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public TextView f62473;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62474;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public C1113 f62475;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public C5679 f62476;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62477;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public View f62478;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public View f62479;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62480;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public String f62481;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public C1442 f62482;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f62484;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public C19758 f62485;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public C16028 f62486;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C8147 f62488;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62489;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C15854 f62491;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC7430 f62493;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C8154 f62494;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f62495;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public boolean f62496;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f62497;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public boolean f62498;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C12628 f62500;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f62502;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62492 = true;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public boolean f62463 = true;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public boolean f62501 = true;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public long f62483 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public Executor f62487 = C11644.m29264();

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public Executor f62490 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final C18595 f62499 = new C18595();

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public boolean f62464 = false;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public boolean f62465 = true;

    static {
        ApplicationC23172.m52091(140);
        f62461 = new short[]{9038, 27552, -31030, 26453, 25000, -18547, 25791};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public native void m44734(boolean z);

    @Override // l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo34794(long j) {
        return false;
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 mo44752() {
        return this;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "HexEditor";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        this.f62493 = ViewOnClickListenerC7430.m20347(this);
        this.f62485 = new C19758(this);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C21579 c21579 = new C21579(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c21579);
        this.f62491 = (C15854) m40418(R.id.MT_Protector);
        this.f62479 = m40418(R.id.MT_Protector);
        this.f62500 = (C12628) m40418(R.id.MT_Protector);
        this.f62473 = (TextView) m40418(R.id.MT_Protector);
        this.f62475 = (C1113) m40418(R.id.MT_Protector);
        C8147 c8147 = (C8147) m40418(R.id.MT_Protector);
        this.f62488 = c8147;
        c8147.m22041(this);
        m44733(R.id.MT_Protector);
        m44733(R.id.button1);
        m44733(R.id.button2);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        m44733(R.id.MT_Protector);
        this.f62473.setOnClickListener(this);
        this.f62500.m31363(this);
        View viewM40418 = m40418(R.id.MT_Protector);
        this.f62478 = viewM40418;
        viewM40418.setOnClickListener(this);
        ((C24806) m40418(R.id.MT_Protector)).m55320(new C14865(this));
        if (getResources().getConfiguration().orientation != 1) {
            this.f62479.setVisibility(0);
            this.f62475.m4129(16);
            m44743(true);
        }
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()) || "android.intent.action.EDIT".equals(intent.getAction())) {
            if (C14584.m35199(this)) {
                return;
            }
            this.f62495 = C14584.m35190(getIntent());
            this.f62474 = intent.getBooleanExtra("readOnly", false);
            this.f62481 = this.f62495.getName();
            m44727();
            C5679 c5679 = null;
            this.f62467 = bundle == null ? null : bundle.getString("hex_session_token");
            if (bundle != null && bundle.getBoolean("hex_ui_present", false)) {
                c5679 = new C5679(bundle.getBoolean("hex_ui_keyboard_showing"), bundle.getBoolean("hex_ui_keyboard_enable"), bundle.getBoolean("hex_ui_hex_mode"), C20833.m47639(bundle.getLong("hex_ui_scroll"), bundle.getInt("hex_ui_selection_start"), bundle.getInt("hex_ui_selection_end"), bundle.getBoolean("hex_ui_select_hex_first"), bundle.getBoolean("hex_ui_multi_select")));
            }
            this.f62476 = c5679;
            new C18161(this, this.f62467, false, false).m8197();
            return;
        }
        finish();
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo44756() {
        return this.f62474 || this.f62477;
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12628 mo44761() {
        return this.f62500;
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo44746() {
        m44762();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44749(C19143 c19143, C16028 c16028, C1442 c1442, boolean z, boolean z2) {
        try {
            if (this.f62502 || isFinishing()) {
                try {
                    c19143.close();
                } catch (IOException unused) {
                }
                if (c16028 == null || m44751(c16028)) {
                } else {
                    c16028.m38188();
                }
            } else {
                boolean zMo44756 = mo44756();
                this.f62477 = z2;
                this.f62500.m31388(mo44756());
                C19143 c19143M31354 = this.f62500.m31354(c19143);
                C16028 c16029 = this.f62486;
                this.f62486 = c16028;
                this.f62482 = c1442;
                this.f62489 = z;
                this.f62470 = false;
                C5679 c5679 = this.f62476;
                this.f62476 = null;
                this.f62467 = null;
                if (c5679 != null) {
                    this.f62492 = c5679.f19632;
                    this.f62463 = c5679.f19633;
                    this.f62501 = c5679.f19631;
                    try {
                        this.f62500.m31364(c5679.f19634);
                    } catch (IllegalArgumentException unused2) {
                        mo34790(this.f62500.f40509.m17202(), this.f62500.f40509.m17208(), this.f62500.f40509.m17218(), this.f62500.f40509.m17206());
                    }
                    this.f62478.setAlpha(this.f62463 ? 1.0f : 0.3f);
                    this.f62491.m37812(this.f62492, false);
                }
                if (c16028 == null || !c16028.m38185()) {
                    this.f62483 = Long.MIN_VALUE;
                    this.f62472 = false;
                } else {
                    this.f62483 = c19143.m44373();
                    this.f62472 = c19143.m44379();
                }
                if (zMo44756 && !mo44756()) {
                    this.f62463 = true;
                    this.f62492 = true;
                }
                boolean zMo44757 = mo44756();
                this.f62500.m31388(zMo44757);
                this.f62493.m20361(zMo44757);
                m40418(R.id.MT_Protector).setVisibility(this.f62477 ? 0 : 8);
                m44727();
                this.f62478.setEnabled(!zMo44757);
                if (zMo44757) {
                    this.f62463 = false;
                    this.f62478.setAlpha(0.3f);
                    this.f62492 = false;
                    m40393();
                } else {
                    this.f62478.setAlpha(this.f62463 ? 1.0f : 0.3f);
                    if (m13853() != null) {
                        m13853().mo9633(false);
                    }
                    this.f56046.setNavigationIcon((Drawable) null);
                }
                this.f62491.m37812(this.f62492, false);
                this.f56046.setNavigationOnClickListener(zMo44757 ? new ViewOnClickListenerC4425(0, this) : null);
                this.f62485.m45517();
                invalidateOptionsMenu();
                m44748(c19143, c1442);
                if (c19143M31354 != null && c19143M31354 != c19143) {
                    try {
                        c19143M31354.close();
                    } catch (IOException unused3) {
                    }
                }
                if (c16029 == null || c16029 == c16028) {
                    return;
                }
                if (c16028 != null && c16029.m38187().equals(c16028.m38187())) {
                } else {
                    c16029.m38188();
                }
            }
        } catch (IOException unused4) {
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private void m44727() {
        if (this.f62477) {
            setTitle(this.f62481);
            this.f56046.setSubtitle(getString(R.string.MT_Protector));
        } else if (this.f62474) {
            setTitle(this.f62481);
            this.f56046.setSubtitle((CharSequence) null);
        } else {
            setTitle(R.string.MT_Protector);
            this.f56046.setSubtitle(this.f62464 ? C8947.m23910(new StringBuilder(), this.f62481, " *") : this.f62481);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44751(C16028 c16028) {
        return this.f62466 && !(this.f62468 || isFinishing()) && c16028 != null && c16028.m38183();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44753() {
        return this.f62466;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44754() {
        return this.f62502 || isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44750(Object obj, C19143 c19143) {
        C12628 c12628;
        return (this.f62502 || isFinishing() || isDestroyed() || (c12628 = this.f62500) == null || c12628.f40509.m17213() != c19143 || !this.f62499.m43173(obj, c19143)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44758(Object obj, C19143 c19143) {
        this.f62499.m43176(obj, c19143);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44747(C1442 c1442) {
        this.f62482 = c1442;
        C16028 c16028 = this.f62486;
        this.f62483 = Long.MIN_VALUE;
        this.f62472 = false;
        if (c16028 == null) {
            this.f62466 = false;
            this.f62480 = false;
        } else {
            try {
                if (this.f62489) {
                    this.f62466 = false;
                    this.f62480 = false;
                    this.f62486 = null;
                    c16028.m38188();
                } else {
                    this.f62483 = this.f62500.f40509.m17213().m44373();
                    this.f62472 = false;
                }
            } catch (IOException unused) {
            }
        }
        this.f62500.m31380();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44759(C1442 c1442) {
        if (c1442 != null) {
            this.f62482 = c1442;
        }
        m44742(false);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        C12628 c12628;
        C16028 c16028;
        super.onResume();
        boolean z = this.f62466;
        boolean z2 = this.f62480;
        boolean zM38185 = false;
        this.f62466 = false;
        this.f62480 = false;
        if (z && z2 && !this.f62502 && !this.f62470 && (c16028 = this.f62486) != null && this.f62482 != null) {
            if (c16028.m38186()) {
                zM38185 = true;
            } else {
                try {
                    this.f62500.f40509.m17213().m44377();
                } catch (IOException unused) {
                    zM38185 = this.f62486.m38185();
                }
            }
            if (zM38185) {
                String strM38187 = this.f62486.m38187();
                this.f62467 = strM38187;
                this.f62470 = true;
                new C18161(this, strM38187, true, true).m8197();
            }
        }
        if (this.f62470 || this.f62482 == null || (c12628 = this.f62500) == null) {
            return;
        }
        C19143 c19143M17213 = c12628.f40509.m17213();
        if (this.f62499.m43174(c19143M17213)) {
            return;
        }
        try {
            c19143M17213.m44377();
            m44748(c19143M17213, this.f62482);
        } catch (IOException e) {
            mo34791(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44748(C19143 c19143, C1442 c1442) {
        if (this.f62502 || this.f62470 || this.f62494 != null || this.f62499.m43174(c19143)) {
            return;
        }
        C8154 c8154 = new C8154(this, c19143, c1442);
        this.f62494 = c8154;
        try {
            c8154.m8197();
        } catch (RuntimeException unused) {
            this.f62494 = null;
            m40398(R.string.MT_Protector, false);
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m44757() {
        C12628 c12628;
        C19143 c19143M17213;
        this.f62467 = null;
        this.f62470 = false;
        if (this.f62502 || (c12628 = this.f62500) == null || this.f62482 == null || (c19143M17213 = c12628.f40509.m17213()) == null) {
            return;
        }
        m44748(c19143M17213, this.f62482);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44760() {
        C12628 c12628;
        if (this.f62502 || !this.f62470 || (c12628 = this.f62500) == null) {
            return false;
        }
        C19143 c19143M17213 = c12628.f40509.m17213();
        try {
            c19143M17213.m44377();
            return !this.f62502 && this.f62500.f40509.m17213() == c19143M17213;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44733(int i) {
        TextView textView = (TextView) m40418(i);
        textView.setOnClickListener(this);
        this.f62500.getClass();
        textView.setTypeface(C5171.f18018);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            this.f62479.setVisibility(8);
            this.f62475.m4129(8);
            m44743(false);
        } else {
            this.f62479.setVisibility(0);
            this.f62475.m4129(16);
            m44743(true);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44743(boolean z) {
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

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C8833 c8833M44367;
        Throwable th;
        Throwable th2;
        boolean z;
        long j;
        C16028 c16028M38166;
        boolean z2;
        boolean z3 = this.f62480;
        this.f62466 = false;
        this.f62480 = false;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f62493;
        if (viewOnClickListenerC7430 != null) {
            viewOnClickListenerC7430.m20360();
        }
        C12628 c12628 = this.f62500;
        if (c12628 != null) {
            c12628.m31383();
            this.f62500.m31391();
        }
        C12628 c12629 = this.f62500;
        C19143 c19143M17213 = c12629 == null ? null : c12629.f40509.m17213();
        C1442 c1442 = this.f62482;
        if (c1442 == null || c19143M17213 == null) {
            c8833M44367 = null;
            th = null;
        } else {
            try {
                c8833M44367 = c19143M17213.m44367();
                th = null;
            } catch (Throwable th3) {
                th = th3;
                c8833M44367 = null;
            }
            this.f62476 = new C5679(this.f62492, this.f62463, this.f62501, this.f62500.m31355(c8833M44367 == null ? null : c8833M44367.m23699()));
        }
        C5679 c5679 = this.f62476;
        if (c5679 != null) {
            bundle.putBoolean("hex_ui_present", true);
            bundle.putBoolean("hex_ui_keyboard_showing", c5679.f19632);
            bundle.putBoolean("hex_ui_keyboard_enable", c5679.f19633);
            bundle.putBoolean("hex_ui_hex_mode", c5679.f19631);
            C20833 c20833 = c5679.f19634;
            bundle.putLong("hex_ui_scroll", c20833.f66710);
            bundle.putInt("hex_ui_selection_start", c20833.f66709);
            bundle.putInt("hex_ui_selection_end", c20833.f66711);
            bundle.putBoolean("hex_ui_select_hex_first", c20833.f66708);
            bundle.putBoolean("hex_ui_multi_select", c20833.f66707);
        }
        String str = this.f62467;
        if (str != null && (this.f62482 == null || this.f62470)) {
            bundle.putString("hex_session_token", str);
            this.f62466 = true;
        } else {
            C16028 c16028 = this.f62486;
            if (!this.f62470 && c19143M17213 != null && c1442 != null && c8833M44367 != null) {
                try {
                    boolean z4 = !mo44756() && c8833M44367.m23698();
                    long jM23700 = c8833M44367.m23700();
                    if (!z4 && this.f62489) {
                        this.f62483 = Long.MIN_VALUE;
                        this.f62472 = false;
                        if (c16028 != null) {
                            this.f62486 = null;
                            c16028.m38188();
                        }
                    } else if (c16028 != null && this.f62483 == jM23700 && this.f62472 == z4 && c16028.m38183()) {
                        bundle.putString("hex_session_token", c16028.m38187());
                        this.f62466 = true;
                        this.f62480 = z3;
                    } else {
                        if (c16028 == null) {
                            c16028M38166 = C16028.m38166();
                            z2 = true;
                        } else {
                            c16028M38166 = c16028;
                            z2 = false;
                        }
                        try {
                            C16774 c16774M29266 = C11644.m29266(c16028M38166, c1442, this.f62489, c19143M17213, z4, this.f62477, !this.f62499.m43174(c19143M17213), this.f62487);
                            bundle.putString("hex_session_token", c16028M38166.m38187());
                            this.f62466 = true;
                            this.f62480 = true;
                            this.f62483 = c16774M29266.m39607();
                            this.f62472 = z4;
                            if (z2) {
                                this.f62486 = c16028M38166;
                            }
                        } catch (Throwable th4) {
                            c16028 = c16028M38166;
                            j = Long.MIN_VALUE;
                            boolean z5 = z2;
                            th2 = th4;
                            z = z5;
                            this.f62483 = j;
                            this.f62472 = false;
                            if (z) {
                                try {
                                    c16028.m38188();
                                } catch (IOException e) {
                                    th2.addSuppressed(e);
                                }
                            } else if (c16028 != null) {
                                try {
                                    c16028.m38184();
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
                this.f62483 = Long.MIN_VALUE;
                this.f62472 = false;
                if (c16028 != null) {
                    try {
                        c16028.m38184();
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
        this.f62484 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f62471 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f62497 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        boolean zM31376 = this.f62500.m31376();
        boolean zM17217 = this.f62500.f40509.m17217();
        boolean zM17195 = this.f62500.f40509.m17195();
        this.f62497.setEnabled(zM31376);
        this.f62471.setEnabled(zM17217);
        this.f62484.setEnabled(zM17195);
        if (!mo44756()) {
            return true;
        }
        this.f62497.setVisible(false);
        this.f62471.setVisible(false);
        this.f62484.setVisible(false);
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f62500.m31372();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f62500.m31352();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m44734(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m44731();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f62488.m22057(8388613)) {
                this.f62488.m22037(8388613);
            }
            this.f62488.m22049(8388611);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f62488.m22057(8388611)) {
                this.f62488.m22037(8388611);
            }
            this.f62488.m22049(8388613);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C12628 c12628 = this.f62500;
            C13685.m33474(c12628.getContext(), new IntSupplier() { // from class: l.ۡۜᩴ
                @Override // java.util.function.IntSupplier
                public final int getAsInt() {
                    return c12628.f40509.m17218();
                }
            }, new IntConsumer() { // from class: l.ۖۜᩴ
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    c12628.m31386(i);
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C4109.$default$andThen(this, intConsumer);
                }
            });
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        final C12628 c12629 = this.f62500;
        Context context = c12629.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            C22673.m51158(R.string.MT_Protector, 0).m51163();
            return true;
        }
        final CharSequence text = clipboardManager.getText();
        if (TextUtils.isEmpty(text)) {
            C22673.m51158(R.string.MT_Protector, 0).m51163();
            return true;
        }
        final C11904 c11904M29784 = C11904.m29784(c12629);
        if (c11904M29784 == null) {
            return true;
        }
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(context);
        c2361.m8002(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۤܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C12628 c126210 = c12629;
                C17359.requireNonNull(c126210, "editView");
                CharSequence charSequence = text;
                C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
                C11904 c11904 = c11904M29784;
                if (c11904.m29785(c126210)) {
                    C15633 c15633 = new C15633();
                    final C25331 c25331 = new C25331(c126210, c11904);
                    C17103 c17103M31353 = c126210.m31353(new RunnableC13790(c15633), new Runnable() { // from class: l.ۙ᩸ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c25331.m56609();
                        }
                    });
                    if (c17103M31353 == null) {
                        C22673.m51152(R.string.MT_Protector);
                    } else if (!c11904.m29785(c126210)) {
                        c17103M31353.close();
                    } else {
                        new C20109(c126210, c15633, c11904, c17103M31353, c25331, charSequence, i2).m8197();
                    }
                }
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        dialogInterfaceC8327M7999.m22435().setDimAmount(0.0f);
        dialogInterfaceC8327M7999.m22432();
        return true;
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m44731();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public void m44731() {
        if (C18978.m44078() && this.f62500.m31376()) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8024(this.f62481);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6663(0, this));
            c2361.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺᩷ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ViewOnClickListenerC19341.f62462;
                    this.f79616.finish();
                }
            });
            c2361.m8016();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f62468 = true;
        C16028 c16028 = this.f62486;
        String str = this.f62467;
        this.f62486 = null;
        this.f62467 = null;
        if (c16028 != null) {
            try {
                c16028.m38188();
            } catch (IOException unused) {
            }
        }
        if (str != null && (c16028 == null || !str.equals(c16028.m38187()))) {
            try {
                C16028.m38162(str);
            } catch (IOException unused2) {
            }
        }
        super.finish();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        boolean z = true;
        this.f62502 = true;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f62493;
        if (viewOnClickListenerC7430 != null) {
            viewOnClickListenerC7430.m20360();
        }
        C12628 c12628 = this.f62500;
        if (c12628 != null) {
            c12628.m31383();
            boolean zM31391 = this.f62500.m31391();
            C19143 c19143M17213 = this.f62500.f40509.m17213();
            if (c19143M17213 != null) {
                RunnableC0696 runnableC0696 = new RunnableC0696(c19143M17213);
                if (!zM31391) {
                    runnableC0696.run();
                } else {
                    try {
                        this.f62490.execute(runnableC0696);
                    } catch (Error | RuntimeException unused) {
                        if (!this.f62500.m31369(runnableC0696)) {
                            runnableC0696.run();
                        }
                    }
                }
            }
        }
        C5917.m17177(getCacheDir());
        C16028 c16028 = this.f62486;
        if (c16028 != null) {
            boolean z2 = this.f62466;
            if (!this.f62468 && !isFinishing()) {
                z = false;
            }
            if (!z2 || z || !c16028.m38183()) {
                this.f62486 = null;
                try {
                    c16028.m38188();
                } catch (IOException unused2) {
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m44762() {
        this.f62492 = false;
        this.f62491.m37812(false, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(0);
            return;
        }
        if (id == R.id.button1) {
            this.f62500.m31373(1);
            return;
        }
        if (id == R.id.button2) {
            this.f62500.m31373(2);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(3);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(4);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(5);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(6);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(7);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(8);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(9);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(10);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(11);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(12);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(13);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(14);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62500.m31373(15);
            return;
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                this.f62501 = !this.f62501;
                mo34790(this.f62500.f40509.m17202(), this.f62500.f40509.m17208(), this.f62500.f40509.m17218(), this.f62500.f40509.m17206());
                return;
            }
            return;
        }
        if (this.f62463) {
            this.f62463 = false;
            this.f62478.setAlpha(0.3f);
            m44762();
            return;
        }
        this.f62463 = true;
        this.f62478.setAlpha(1.0f);
        if (this.f62500.f40509.m17206() || mo44756()) {
            return;
        }
        this.f62492 = true;
        this.f62491.m37812(true, true);
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo34790(int i, int i2, int i3, boolean z) {
        if (z) {
            if (this.f62463) {
                m44762();
            }
            this.f62473.setText(String.format(Locale.ENGLISH, this.f62501 ? "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]" : "Sel: %d - %d  Len: %d  Size: %d [DEC]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((i2 - i) + 1), Integer.valueOf(i3)));
        } else {
            if (i < i3) {
                String str = this.f62501 ? "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]" : "Val: %d  Pos: %d  Size: %d [DEC]";
                try {
                    byte[] bArr = new byte[1];
                    this.f62500.f40509.m17213().m44363(i, bArr, 0, 1);
                    this.f62473.setText(String.format(Locale.ENGLISH, str, Integer.valueOf(bArr[0] & 255), Integer.valueOf(i), Integer.valueOf(i3)));
                    return;
                } catch (IOException e) {
                    mo34791(e);
                    return;
                }
            }
            this.f62473.setText(String.format(Locale.ENGLISH, this.f62501 ? "Size: %Xh [HEX]" : "Size: %d [DEC]", Integer.valueOf(i3)));
        }
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܳ */
    public final void mo34795() {
        if (!this.f62463 || this.f62500.f40509.m17206() || mo44756()) {
            return;
        }
        this.f62492 = true;
        this.f62491.m37812(true, true);
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo34791(IOException iOException) {
        C19143 c19143M17213 = this.f62500.f40509.m17213();
        if (!(iOException instanceof C12893) && !c19143M17213.m44357()) {
            m40401(iOException, (DialogInterface.OnDismissListener) null);
        } else {
            m44742(true);
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m44755() {
        m44742(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44742(boolean z) {
        if (this.f62470 || this.f62502) {
            return;
        }
        this.f62470 = true;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f62493;
        if (viewOnClickListenerC7430 != null) {
            viewOnClickListenerC7430.m20360();
        }
        this.f62500.m31383();
        this.f62500.m31391();
        String strM38187 = null;
        this.f62476 = new C5679(this.f62492, this.f62463, this.f62501, this.f62500.m31355((C16159) null));
        C16028 c16028 = this.f62486;
        if (z && c16028 != null && c16028.m38185()) {
            strM38187 = c16028.m38187();
        }
        this.f62467 = strM38187;
        new C18161(this, strM38187, true, false).m8197();
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo34793(boolean z, boolean z2, boolean z3) {
        if (this.f62464 != z3) {
            this.f62464 = z3;
            this.f56046.setSubtitle(z3 ? C8947.m23910(new StringBuilder(), this.f62481, " *") : this.f62481);
        }
        InterfaceMenuItemC22709 interfaceMenuItemC22709 = this.f62497;
        if (interfaceMenuItemC22709 != null) {
            interfaceMenuItemC22709.setEnabled(z3);
        }
        InterfaceMenuItemC22709 interfaceMenuItemC227010 = this.f62471;
        if (interfaceMenuItemC227010 != null) {
            interfaceMenuItemC227010.setEnabled(z);
        }
        InterfaceMenuItemC22709 interfaceMenuItemC227011 = this.f62484;
        if (interfaceMenuItemC227011 != null) {
            interfaceMenuItemC227011.setEnabled(z2);
        }
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo34792(boolean z) {
        if (z) {
            this.f62488.m22048(1);
        } else {
            this.f62488.m22048(0);
        }
    }

    @Override // l.InterfaceC6656
    public final void onDrawerOpened(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f62498 = true;
        } else {
            this.f62496 = true;
        }
    }

    @Override // l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f62498 = false;
        } else {
            this.f62496 = false;
        }
    }

    @Override // l.InterfaceC6656
    public final void onDrawerStateChanged(int i) {
        if (i == 2 && this.f62498) {
            this.f62493.m20364();
            if (this.f62469 == null) {
                InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method");
                this.f62469 = inputMethodManager;
                if (inputMethodManager == null) {
                    return;
                }
            }
            this.f62469.hideSoftInputFromWindow(this.f62500.getWindowToken(), 0);
            return;
        }
        if (i != 0) {
            if (this.f62496 || !this.f62465) {
                return;
            }
            this.f62485.m45517();
            this.f62465 = false;
            return;
        }
        this.f62465 = true;
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        if (((C14270) c19929.m45858()).m34633()) {
            C14270 c14270 = new C14270();
            c14270.m34620(this.f62500.f40509.m17213());
            c19929.m45857(c14270);
        } else {
            C14270 c14271 = new C14270();
            c14271.m34618(this.f62500.f40509.m17218());
            c19929.m45857(c14271);
        }
    }
}
