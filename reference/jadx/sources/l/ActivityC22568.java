package l;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

/* JADX INFO: renamed from: l.᩸ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityC22568 extends AbstractActivityC17204 implements InterfaceC21076, InterfaceC23488 {

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72922 = 0;

    /* JADX INFO: renamed from: ᩸ۧܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f72923;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public String f72924;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public C21822 f72925;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public C1008 f72927;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72928;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C19758 f72929;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public C16028 f72930;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72933;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public Bundle f72934;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC7430 f72935;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public C23314 f72936;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public C1442 f72938;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72939;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C8147 f72940;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public C10633 f72941;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public C16028 f72943;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72944;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public boolean f72945;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C13616 f72946;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public TextView f72947;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C18092 f72948;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C13616 f72949;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public String f72950;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public C12628 f72952;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C8741 f72953;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f72954;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public C23314 f72955;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public C1442 f72956;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public C4668 f72957;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C8741 f72958;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C16774 f72959;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public TextView f72960;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C16028 f72961;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72932 = true;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public long f72931 = -1;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public long f72926 = -1;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public Executor f72942 = C11644.m29264();

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public long f72937 = -1;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC20855 f72951 = new RunnableC20855(1, this);

    static {
        ApplicationC23172.m52091(162);
        f72923 = new short[]{8037, -25624, -27641, 26201, 28587, -19609, 27948, 25137, 28649, 26065};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m50813(boolean z, boolean z2, Runnable runnable);

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ۤ */
    public final AbstractActivityC17204 mo44752() {
        return this;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "HexCompare";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f72950 = getIntent().getStringExtra("left");
        String stringExtra = getIntent().getStringExtra("right");
        this.f72924 = stringExtra;
        if (this.f72950 == null || stringExtra == null) {
            finish();
            return;
        }
        this.f72934 = bundle;
        if (bundle != null) {
            this.f72932 = bundle.getBoolean("hex", true);
            this.f72944 = bundle.getBoolean("keyboardEnabled", false);
            this.f72945 = bundle.getBoolean("undoRedo", false);
        }
        m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        m40407(c16390);
        setTitle("");
        m40415();
        C11783[] c11783ArrM56210 = C25210.m56210("M 13.928 11 C 13.460 11 8.065 11 7.842 11 L 13.4 5.4 L 12 4 L 4 12 L 12 20 L 13.4 18.6 L 7.789 13 C 8.036 13 13.424 13 13.939 13 C 14.454 13 19 13 20.011 13 L 20.009 11 C 19 11 14.368 11 13.928 11 Z");
        C11783[] c11783ArrM56211 = C25210.m56210("M 12.5 8 C 9.85 8 7.45 8.99 5.6 10.6 L 3.4 8.4 L 2 7 L 2 16 L 9 16 L 11 16 L 7.38 12.38 C 8.77 11.22 10.54 10.5 12.5 10.5 C 16.04 10.5 19.05 12.81 20.1 16 L 22.47 15.22 C 21.08 11.03 17.15 8 12.5 8 Z");
        C11783[] c11783ArrM56212 = C25210.m56211(c11783ArrM56210);
        C11783[] c11783ArrM56213 = C25210.m56211(c11783ArrM56211);
        C7250.m19893(c11783ArrM56212);
        C7250.m19893(c11783ArrM56213);
        C8741 c8741 = new C8741(c11783ArrM56210, c11783ArrM56211);
        this.f72958 = c8741;
        c8741.m23433();
        C8741 c8742 = new C8741(c11783ArrM56212, c11783ArrM56213);
        this.f72953 = c8742;
        c8742.m23433();
        c16390.setNavigationIcon(R.drawable.MT_Protector);
        c16390.setNavigationContentDescription(R.string.MT_Protector);
        c16390.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.᩻۬ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC22568.m50853(this.f81091);
            }
        });
        this.f72947 = (TextView) m40418(R.id.MT_Protector);
        m40418(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۬ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC22568.m50835(this.f52392);
            }
        });
        this.f72960 = (TextView) m40418(R.id.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) m40418(R.id.MT_Protector);
        C18092 c18092 = new C18092(this);
        this.f72948 = c18092;
        if (bundle == null) {
            z = ApplicationC17729.f58258.getBoolean("hctb", false);
        } else {
            z = bundle.getBoolean("topBottom", ApplicationC17729.f58258.getBoolean("hctb", false));
        }
        c18092.m42194(z);
        linearLayout.addView(this.f72948, 1, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f72948.m42183(this);
        m50832();
        ViewOnClickListenerC7430 viewOnClickListenerC7430M20347 = ViewOnClickListenerC7430.m20347(this);
        this.f72935 = viewOnClickListenerC7430M20347;
        viewOnClickListenerC7430M20347.m20361(false);
        int[] iArr = {R.id.MT_Protector, R.id.button1, R.id.button2, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (final int i = 0; i < 16; i++) {
            TextView textView = (TextView) m40418(iArr[i]);
            this.f72948.m42197().getClass();
            textView.setTypeface(C5171.f18018);
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۬ᩴ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC22568.m50804(this.f15313, i);
                }
            });
        }
        m40418(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC18191(5, this));
        ((C24806) m40418(R.id.MT_Protector)).m55320(new C18357(this));
        m50798();
        m50817();
        ((C15854) m40418(R.id.MT_Protector)).m37812(bundle != null && bundle.getBoolean("keyboardShowing", false), false);
        m40418(R.id.MT_Protector).setAlpha(this.f72944 ? 1.0f : 0.3f);
        if (this.f72945) {
            this.f72958.m23436(0);
            this.f72953.m23436(0);
        }
        this.f72929 = new C19758(this);
        C8147 c8147 = (C8147) m40418(R.id.MT_Protector);
        this.f72940 = c8147;
        c8147.m22048(1);
        this.f72940.m22041(new C14627(this));
        getOnBackPressedDispatcher().m19403(this, new C21341(this));
        this.f72960.setOnClickListener(new View.OnClickListener() { // from class: l.᩹۬ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC22568.m50846(this.f76545);
            }
        });
        if (this.f72957 != null) {
            return;
        }
        C4668 c4668 = new C4668(this);
        this.f72957 = c4668;
        c4668.m8197();
        invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50853(ActivityC22568 activityC22568) {
        boolean z = activityC22568.f72945;
        activityC22568.f72945 = !z;
        if (!z) {
            activityC22568.f72958.m23436(300);
            activityC22568.f72953.m23436(300);
        } else {
            activityC22568.f72958.m23428();
            activityC22568.f72953.m23428();
        }
        activityC22568.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50846(ActivityC22568 activityC22568) {
        activityC22568.f72932 = !activityC22568.f72932;
        activityC22568.m50863();
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ᩸ */
    public final C12628 mo44761() {
        return this.f72948.m42197();
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo44756() {
        return this.f72949 == null || this.f72927 != null || this.f72933 || this.f72948.m42197().m31371();
    }

    @Override // l.InterfaceC23488
    /* JADX INFO: renamed from: ֫ */
    public final void mo44746() {
        ((C15854) m40418(R.id.MT_Protector)).m37812(false, true);
        this.f72948.m42197().requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f72948.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50804(ActivityC22568 activityC22568, int i) {
        if (activityC22568.mo44756()) {
            return;
        }
        activityC22568.f72948.m42197().m31373(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50803(ActivityC22568 activityC22568) {
        activityC22568.f72944 = !activityC22568.f72944;
        activityC22568.m40418(R.id.MT_Protector).setAlpha(activityC22568.f72944 ? 1.0f : 0.3f);
        if (activityC22568.f72944) {
            activityC22568.m50861();
        } else {
            activityC22568.mo44746();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public void m50817() {
        boolean z = (mo44756() || this.f72948.m42197().f40509.m17206()) ? false : true;
        C1113 c1113 = (C1113) m40418(R.id.MT_Protector);
        for (int i = 0; i < c1113.getChildCount(); i++) {
            View childAt = c1113.getChildAt(i);
            childAt.setEnabled(z);
            childAt.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private void m50798() {
        boolean z = getResources().getConfiguration().orientation == 2;
        ((C1113) m40418(R.id.MT_Protector)).m4129(z ? 16 : 8);
        m40418(R.id.MT_Protector).setVisibility(z ? 0 : 8);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m50798();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50861() {
        m50817();
        if (this.f72944 && m50828()) {
            ((C15854) m40418(R.id.MT_Protector)).m37812(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean m50828() {
        return (this.f72949 == null || this.f72927 != null || this.f72933 || this.f72948.m42197().f40509.m17206()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50862(long j) {
        if (this.f72937 == j || this.f72948.m42193() == null) {
            return;
        }
        this.f72937 = j;
        this.f72948.m42193().m14876(j);
        C21822 c21822 = this.f72925;
        if (c21822 != null) {
            c21822.f69564.f44643 = true;
        }
        this.f72948.removeCallbacks(this.f72951);
        this.f72948.postDelayed(this.f72951, 40L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50859(C13616 c13616) {
        this.f72949 = c13616;
        C21822 c21822 = this.f72925;
        if (c21822 != null) {
            c21822.f69564.f44643 = true;
        }
        this.f72948.removeCallbacks(this.f72951);
        this.f72948.postDelayed(this.f72951, 40L);
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public void m50836() {
        C4842 c4842M42193;
        C14119 c14119M14873;
        if (this.f72925 != null || this.f72927 != null || this.f72933 || isFinishing() || isDestroyed() || (c4842M42193 = this.f72948.m42193()) == null || (c14119M14873 = c4842M42193.m14873()) == null) {
            return;
        }
        C21822 c21822 = new C21822(this, c4842M42193, c14119M14873);
        this.f72925 = c21822;
        c21822.m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50860(boolean z) {
        C8147 c8147 = this.f72940;
        if (c8147 != null) {
            c8147.m22048((z || this.f72949 == null) ? 1 : 0);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f72939 = false;
        if (this.f72949 != null && this.f72957 == null && this.f72941 == null && this.f72927 == null) {
            C10633 c10633 = new C10633(this);
            this.f72941 = c10633;
            c10633.m8197();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        boolean z2 = (this.f72949 == null || this.f72957 != null || this.f72933) ? false : true;
        menu.findItem(this.f72948.m42188() ? R.id.MT_Protector : R.id.MT_Protector).setChecked(true);
        MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.MT_Protector);
        menuItemFindItem.setTitle(this.f72945 ? R.string.MT_Protector : R.string.MT_Protector);
        menuItemFindItem2.setTitle(this.f72945 ? R.string.MT_Protector : R.string.MT_Protector);
        this.f72958.m23430(C3296.f10732.getDefaultColor());
        this.f72953.m23430(C3296.f10732.getDefaultColor());
        float f = 0.45f;
        this.f72958.m23429((z2 && this.f72948.m42197().f40509.m17217()) ? 1.0f : 0.45f);
        C8741 c8741 = this.f72953;
        if (z2 && this.f72948.m42197().f40509.m17195()) {
            f = 1.0f;
        }
        c8741.m23429(f);
        menuItemFindItem.setIcon(this.f72958);
        menuItemFindItem2.setIcon(this.f72953);
        menuItemFindItem.setEnabled(z2 && (!this.f72945 ? this.f72949.f43258.f31798 <= 0 : !(this.f72927 == null && this.f72948.m42197().f40509.m17217())));
        menuItemFindItem2.setEnabled(z2 && (!this.f72945 ? this.f72949.f43258.f31798 <= 0 : !(this.f72927 == null && this.f72948.m42197().f40509.m17195())));
        boolean z3 = z2 && this.f72948.m42190(true).m31376();
        boolean z4 = z2 && this.f72948.m42190(false).m31376();
        menu.findItem(R.id.MT_Protector).setEnabled(this.f72927 == null && (z3 || z4));
        menu.findItem(R.id.MT_Protector).setEnabled(this.f72927 == null && z3);
        menu.findItem(R.id.MT_Protector).setEnabled(this.f72927 == null && z4);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.MT_Protector);
        if (z2 && this.f72948.m42197().f40509.m17218() > 0) {
            z = true;
        }
        menuItemFindItem3.setEnabled(z);
        menu.findItem(R.id.MT_Protector).setEnabled(z2);
        menu.findItem(R.id.MT_Protector).setEnabled(z2);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            m50854();
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            m50813(itemId != R.id.MT_Protector, itemId != R.id.MT_Protector, new RunnableC3441());
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            menuItem.setChecked(true);
            this.f72948.m42194(itemId == R.id.MT_Protector);
            ApplicationC17729.f58258.edit().putBoolean("hctb", this.f72948.m42188()).apply();
            m50832();
            invalidateOptionsMenu();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C12628 c12628M42197 = this.f72948.m42197();
            IntSupplier intSupplier = new IntSupplier() { // from class: l.᩵۬ᩴ
                @Override // java.util.function.IntSupplier
                public final int getAsInt() {
                    int i = ActivityC22568.f72922;
                    return Math.max(0, c12628M42197.f40509.m17218() - 1);
                }
            };
            final C18092 c18092 = this.f72948;
            C17359.requireNonNull(c18092);
            C13685.m33474(this, intSupplier, new IntConsumer() { // from class: l.ۨ۬ᩴ
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    c18092.m42199(i);
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C4109.$default$andThen(this, intConsumer);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            int i = itemId == R.id.MT_Protector ? 8388611 : 8388613;
            this.f72940.m22037(i != 8388611 ? 8388611 : 8388613);
            this.f72940.m22049(i);
            return true;
        }
        if (this.f72949 != null && (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector)) {
            if (!this.f72945) {
                this.f72948.m42185(itemId == R.id.MT_Protector);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                this.f72948.m42197().m31372();
                return true;
            }
            this.f72948.m42197().m31352();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m50863() {
        String str;
        m50817();
        if (this.f72949 == null || this.f72933) {
            return;
        }
        if (this.f72948.m42197().f40509.m17206()) {
            mo44746();
        }
        m50832();
        if (this.f72935 != null && this.f72952 != this.f72948.m42197()) {
            this.f72935.m20360();
            this.f72952 = this.f72948.m42197();
        }
        if (this.f72929 != null && this.f72940.m22050(8388613)) {
            this.f72929.m45517();
        }
        invalidateOptionsMenu();
        int iM42189 = this.f72948.m42189();
        Locale locale = Locale.ROOT;
        C13616 c13616 = this.f72949;
        String str2 = c13616.f43258.f31798 + (c13616.f43253 ? "…" : "");
        TextView textView = this.f72947;
        if (iM42189 >= 0) {
            str2 = (iM42189 + 1) + "/" + str2;
        }
        textView.setText(str2);
        int iM17218 = this.f72948.m42197().f40509.m17218();
        try {
            C5917 c5917 = this.f72948.m42197().f40509;
            if (!c5917.m17206()) {
                C18092 c18092 = this.f72948;
                int iM17188 = (c18092.m42197().m31371() || c18092.m42203() >= c18092.m42197().f40509.m17218()) ? -1 : c18092.m42197().f40509.m17188(c18092.m42203()) & 255;
                TextView textView2 = this.f72960;
                if (iM17188 < 0) {
                    str = String.format(locale, this.f72932 ? "Size: %Xh [HEX]" : "Size: %d [DEC]", Integer.valueOf(iM17218));
                } else {
                    str = String.format(locale, this.f72932 ? "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]" : "Val: %d  Pos: %d  Size: %d [DEC]", Integer.valueOf(iM17188), Integer.valueOf(this.f72948.m42203()), Integer.valueOf(iM17218));
                }
                textView2.setText(str);
                return;
            }
            int iM17202 = c5917.m17202();
            int iM17208 = c5917.m17208();
            this.f72960.setText(String.format(locale, this.f72932 ? "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]" : "Sel: %d - %d  Len: %d  Size: %d [DEC]", Integer.valueOf(iM17202), Integer.valueOf(iM17208), Integer.valueOf((iM17208 - iM17202) + 1), Integer.valueOf(iM17218)));
        } catch (IOException e) {
            m50858(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50858(IOException iOException) {
        if (this.f72933 || isFinishing() || isDestroyed()) {
            return;
        }
        this.f72933 = true;
        this.f72948.m42190(true).m31388(true);
        this.f72948.m42190(false).m31388(true);
        m50817();
        if (iOException instanceof C12893) {
            m40398(R.string.MT_Protector, false);
        } else {
            m40401(iOException, (DialogInterface.OnDismissListener) null);
        }
        invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m50835(ActivityC22568 activityC22568) {
        String stringExtra = activityC22568.getIntent().getStringExtra("leftDisplayPath");
        String stringExtra2 = activityC22568.getIntent().getStringExtra("rightDisplayPath");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activityC22568.getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append('\n');
        if (stringExtra == null) {
            stringExtra = activityC22568.f72950;
        }
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) stringExtra).append((CharSequence) "\n⇅\n");
        if (stringExtra2 == null) {
            stringExtra2 = activityC22568.f72924;
        }
        spannableStringBuilderAppend2.append((CharSequence) stringExtra2);
        C2361 c2361BuildDialog = activityC22568.buildDialog();
        c2361BuildDialog.m8008(spannableStringBuilder);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        ((TextView) c2361BuildDialog.m8016().m22423(android.R.id.message)).setTextIsSelectable(true);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private void m50832() {
        String stringExtra = getIntent().getStringExtra("leftName");
        String stringExtra2 = getIntent().getStringExtra("rightName");
        if (this.f72949 != null) {
            if (this.f72948.m42190(true).m31376()) {
                stringExtra = C25272.m56409("*", stringExtra);
            }
            if (this.f72948.m42190(false).m31376()) {
                stringExtra2 = C25272.m56409("*", stringExtra2);
            }
        }
        boolean zM42188 = this.f72948.m42188();
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        if (zM42188) {
            stringExtra = C25272.m56409("↑ ", stringExtra);
        }
        textView.setText(stringExtra);
        TextView textView2 = (TextView) m40418(R.id.MT_Protector);
        if (zM42188) {
            stringExtra2 = C14483.m34972(stringExtra2, " ↓");
        }
        textView2.setText(stringExtra2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public void m50854() {
        if (this.f72927 != null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (this.f72949 == null || (!this.f72948.m42190(true).m31376() && !this.f72948.m42190(false).m31376())) {
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder(getString(R.string.MT_Protector));
        if (this.f72948.m42190(true).m31376()) {
            sb.append('\n');
            sb.append(getIntent().getStringExtra("leftName"));
        }
        if (this.f72948.m42190(false).m31376()) {
            sb.append('\n');
            sb.append(getIntent().getStringExtra("rightName"));
        }
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(sb.toString());
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ۬ᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC22568 activityC22568 = this.f21645;
                activityC22568.m50813(true, true, (Runnable) new RunnableC12350(3, activityC22568));
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺۬ᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC22568.f72922;
                this.f78901.finish();
            }
        });
        c2361BuildDialog.m8016();
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C16028 c16028;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f72935;
        if (viewOnClickListenerC7430 != null) {
            viewOnClickListenerC7430.m20360();
        }
        this.f72948.m42190(true).m31391();
        this.f72948.m42190(false).m31391();
        this.f72948.m42190(true).m31383();
        this.f72948.m42190(false).m31383();
        this.f72939 = false;
        if (this.f72949 == null) {
            Bundle bundle2 = this.f72934;
            if (bundle2 != null && bundle2.containsKey("checkpoint")) {
                bundle.putString("checkpoint", this.f72934.getString("checkpoint"));
                this.f72939 = true;
            }
        } else {
            try {
                C4842 c4842M42193 = this.f72948.m42193();
                synchronized (c4842M42193) {
                    synchronized (c4842M42193.f16913) {
                        synchronized (c4842M42193.f16907) {
                            try {
                                if (this.f72927 == null && (c16028 = this.f72961) != null && c16028.m38183() && this.f72946 == c4842M42193.m14875() && this.f72931 == c4842M42193.f16913.m44373() && this.f72926 == c4842M42193.f16907.m44373()) {
                                    bundle.putString("checkpoint", this.f72961.m38187());
                                    this.f72939 = true;
                                } else {
                                    if (this.f72961 == null) {
                                        this.f72961 = C16028.m38167();
                                    }
                                    C16774 c16774M38182 = this.f72961.m38182();
                                    if (this.f72927 != null) {
                                        this.f72959 = c16774M38182;
                                    } else if (!m50814(c16774M38182)) {
                                    }
                                    bundle.putString("checkpoint", this.f72961.m38187());
                                    this.f72939 = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("keyboardEnabled", this.f72944);
        bundle.putBoolean("keyboardShowing", ((C15854) m40418(R.id.MT_Protector)).m37813());
        bundle.putBoolean("undoRedo", this.f72945);
        bundle.putBoolean("hex", this.f72932);
        bundle.putBoolean("topBottom", this.f72948.m42188());
        if (this.f72949 != null) {
            bundle.putBoolean("leftFocused", this.f72948.m42192());
            bundle.putInt("selected1", this.f72948.m42196(true));
            bundle.putInt("selected2", this.f72948.m42196(false));
            bundle.putInt("end1", this.f72948.m42201(true));
            bundle.putInt("end2", this.f72948.m42201(false));
            bundle.putBoolean("multi1", this.f72948.m42200(true));
            bundle.putBoolean("multi2", this.f72948.m42200(false));
            bundle.putBoolean("nibble1", this.f72948.m42190(true).f40509.m17220());
            bundle.putBoolean("nibble2", this.f72948.m42190(false).f40509.m17220());
            bundle.putLong("cursorSlot", this.f72948.m42198());
            bundle.putBoolean("cursorNibble", this.f72948.m42187());
            bundle.putLong("top", this.f72948.m42195());
            return;
        }
        Bundle bundle3 = this.f72934;
        if (bundle3 != null) {
            bundle.putBoolean("leftFocused", bundle3.getBoolean("leftFocused", true));
            bundle.putInt("selected1", this.f72934.getInt("selected1"));
            bundle.putInt("selected2", this.f72934.getInt("selected2"));
            Bundle bundle4 = this.f72934;
            bundle.putInt("end1", bundle4.getInt("end1", bundle4.getInt("selected1")));
            Bundle bundle5 = this.f72934;
            bundle.putInt("end2", bundle5.getInt("end2", bundle5.getInt("selected2")));
            bundle.putBoolean("multi1", this.f72934.getBoolean("multi1"));
            bundle.putBoolean("multi2", this.f72934.getBoolean("multi2"));
            bundle.putBoolean("nibble1", this.f72934.getBoolean("nibble1", true));
            bundle.putBoolean("nibble2", this.f72934.getBoolean("nibble2", true));
            bundle.putLong("cursorSlot", this.f72934.getLong("cursorSlot", -1L));
            bundle.putBoolean("cursorNibble", this.f72934.getBoolean("cursorNibble", true));
            bundle.putLong("top", this.f72934.getLong("top"));
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f72935;
        if (viewOnClickListenerC7430 != null) {
            viewOnClickListenerC7430.m20360();
        }
        C4668 c4668 = this.f72957;
        if (c4668 != null) {
            c4668.f16482 = true;
        }
        C10633 c10633 = this.f72941;
        if (c10633 != null) {
            c10633.f33723 = true;
        }
        C21822 c21822 = this.f72925;
        if (c21822 != null) {
            c21822.f69564.f44643 = true;
        }
        C18092 c18092 = this.f72948;
        if (c18092 != null) {
            c18092.removeCallbacks(this.f72951);
            if (this.f72927 == null) {
                this.f72948.m42191();
                m50843();
            }
        }
        C23314 c23314 = this.f72955;
        if (c23314 != null) {
            try {
                c23314.close();
            } catch (IOException unused) {
            }
        }
        C23314 c23315 = this.f72936;
        if (c23315 != null) {
            try {
                c23315.close();
            } catch (IOException unused2) {
            }
        }
        this.f72936 = null;
        this.f72955 = null;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m50814(C16774 c16774) {
        try {
            C4842 c4842M42193 = this.f72948.m42193();
            synchronized (c4842M42193) {
                synchronized (c4842M42193.f16913) {
                    synchronized (c4842M42193.f16907) {
                        C1685.m6035(c16774, c4842M42193, this.f72956, this.f72938, this.f72928, this.f72954, this.f72943, this.f72930, this.f72942);
                        this.f72946 = c4842M42193.m14875();
                        this.f72931 = c4842M42193.f16913.m44373();
                        this.f72926 = c4842M42193.f16907.m44373();
                    }
                }
            }
            return true;
        } catch (IOException | RuntimeException e) {
            c16774.m39601(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public void m50843() {
        if (!this.f72939 || isFinishing()) {
            C16028 c16028 = this.f72943;
            if (c16028 != null) {
                try {
                    c16028.m38188();
                } catch (IOException unused) {
                }
            }
            C16028 c16029 = this.f72930;
            if (c16029 != null) {
                try {
                    c16029.m38188();
                } catch (IOException unused2) {
                }
            }
            C16028 c160210 = this.f72961;
            if (c160210 != null) {
                try {
                    c160210.m38188();
                } catch (IOException unused3) {
                }
            }
            this.f72961 = null;
            this.f72930 = null;
            this.f72943 = null;
            Bundle bundle = this.f72934;
            if (bundle == null || !bundle.containsKey("checkpoint")) {
                return;
            }
            try {
                C16028.m38172(this.f72934.getString("checkpoint"));
            } catch (IOException unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50802(C16028 c16028) {
        if (c16028 != null) {
            try {
                c16028.m38188();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50812(C23314 c23314) {
        if (c23314 != null) {
            try {
                c23314.close();
            } catch (IOException unused) {
            }
        }
    }
}
