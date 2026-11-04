package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩹۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes.dex */
public final class C23582 implements InterfaceC20598 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean f76547 = ApplicationC17729.f58258.getBoolean("sesrt", true);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76548 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6038 f76549;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17771 f76550;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f76551;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f76552;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f76553;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17771 f76554;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f76555;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public MenuItem f76556;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f76557;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6038 f76558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f76559;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC3444 f76560;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HandlerC13547 f76561;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7919 f76562;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f76563;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6038 f76564;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6038 f76565;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f76566;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17837 f76567;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f76568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f76569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC17614 f76570;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24132 f76571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6038 f76572;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11908 f76573;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6038 f76574;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52777(C23582 c23582) {
        c23582.getClass();
        AbstractActivityC17204 abstractActivityC17204 = c23582.f76553;
        abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC9641.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52778(C23582 c23582, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        c23582.getClass();
        if (i != i2) {
            String str = strArr[i2];
            c23582.m52822(str);
            c23582.f76571.m54075(str);
        }
        dialogInterface.dismiss();
    }

    public C23582(ActivityC0848 activityC0848, C24132 c24132, View view) {
        this(activityC0848, c24132, "code", new C0292(view));
    }

    public C23582(AbstractActivityC17204 abstractActivityC17204, C24132 c24132, String str, InterfaceC17614 interfaceC17614) {
        this.f76561 = new HandlerC13547(this, new C12669(7));
        this.f76553 = abstractActivityC17204;
        this.f76571 = c24132;
        this.f76563 = str;
        this.f76560 = new SharedPreferencesOnSharedPreferenceChangeListenerC3444(abstractActivityC17204, c24132);
        this.f76570 = interfaceC17614;
        View viewMo1858 = interfaceC17614.mo1858();
        this.f76552 = viewMo1858;
        this.f76559 = viewMo1858.findViewById(R.id.MT_Protector);
        this.f76568 = viewMo1858.findViewById(R.id.MT_Protector);
        this.f76551 = viewMo1858.findViewById(R.id.MT_Protector);
        C17771 c17771 = (C17771) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76550 = c17771;
        C17771 c17772 = (C17771) viewMo1858.findViewById(R.id.edtReplaceWord);
        this.f76554 = c17772;
        C4846.m14885(c17771.m41605());
        C4846.m14885(c17772.m41605());
        C6038 c6038 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76572 = c6038;
        C6038 c6039 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76558 = c6039;
        C6038 c60310 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76549 = c60310;
        C6038 c60311 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76574 = c60311;
        C6038 c60312 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76565 = c60312;
        C6038 c60313 = (C6038) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76564 = c60313;
        TextView textView = (TextView) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76566 = textView;
        this.f76569 = (TextView) viewMo1858.findViewById(R.id.MT_Protector);
        C17837 c17837 = (C17837) viewMo1858.findViewById(R.id.MT_Protector);
        this.f76567 = c17837;
        if (!f76547) {
            ((ViewGroup) viewMo1858).removeView(c17837);
        }
        textView.setOnClickListener(new ViewOnClickListenerC22090(0, this, abstractActivityC17204));
        c17771.m41595(str.concat("_s"), (String) null);
        c17772.m41595(str.concat("_r"), (String) null);
        C11908 c11908 = new C11908(abstractActivityC17204, c24132);
        this.f76573 = c11908;
        C16383 c16383 = new C16383((TextView) viewMo1858.findViewById(R.id.MT_Protector));
        c11908.m29832(new C13139(this, c16383));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֨ۜ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23582.m52780(this.f3676, view);
            }
        };
        c24132.m53911(new C9213(this));
        c60312.m17515(new C2502(this, c16383));
        C8468 c8468 = new C8468(this, c16383);
        c6038.m17515(c8468);
        c6039.m17515(c8468);
        c60310.m17515(c8468);
        c60311.m17515(c8468);
        c60313.m17515(c8468);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i = 0; i < 5; i++) {
            View viewFindViewById = viewMo1858.findViewById(iArr[i]);
            C17423.m40911(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f76550.m41593(new C5682(this));
        c24132.m53901(new RunnableC6057(1, this));
        c24132.m53913(new InterfaceC11886() { // from class: l.ۜۜ᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i2, int i3) {
                this.f23029.m52798();
            }
        });
        m52820();
        c24132.m53928(this);
        m52773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52784(C23582 c23582, AbstractActivityC17204 abstractActivityC17204, View view) {
        TextView textView = c23582.f76566;
        if (f76547) {
            f76547 = false;
            C6421.m18184(ApplicationC17729.f58258, "sesrt", false);
            c23582.f76567.setVisibility(8);
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        boolean z = !c23582.f76569.getText().toString().equals("0");
        C18452 c18452 = new C18452(abstractActivityC17204, view, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.setOptionalIconsVisible(true);
        c9898M42995.setGroupDividerEnabled(true);
        C0950.m3783(c9898M42995, R.string.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c9898M42995.add(R.string.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new C13688(c23582));
        C19198.m44467(c18452).m36149();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52779(C23582 c23582, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            String string = ApplicationC17729.f58258.getString("srep", "$0\\n");
            new C25074(c23582, c23582.f76553, string.trim().isEmpty() ? "$0\\n" : string);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c23582.m52774(1);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c23582.m52774(2);
        } else if (itemId == R.string.MT_Protector) {
            c23582.m52774(3);
        } else if (itemId == R.string.MT_Protector) {
            c23582.m52774(4);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52820() {
        InterfaceC23097 interfaceC23097Mo1861 = this.f76570.mo1861();
        this.f76564.setVisibility(interfaceC23097Mo1861 == null ? 8 : 0);
        this.f76573.m29833(interfaceC23097Mo1861);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52810(InterfaceC11217 interfaceC11217, C5639 c5639, Class cls) {
        c5639.m16626(interfaceC11217, new C15376(this, cls), this.f76550.m41605(), this.f76554.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52807(String str) {
        this.f76560.m11224(str);
        m52799(this.f76556, this.f76571);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52805(MenuItem menuItem) {
        this.f76556 = menuItem;
        m52799(menuItem, this.f76571);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52799(MenuItem menuItem, C24132 c24132) {
        if (menuItem == null) {
            return;
        }
        RunnableC14461 runnableC14461 = new RunnableC14461(2, menuItem, c24132);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableC14461.run();
        } else {
            C21576.m49068(runnableC14461);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52816() {
        MenuItem menuItem = this.f76556;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f76556.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f76560;
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11228(zIsChecked);
        this.f76571.m53921(sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11230(), new RunnableC0836(1, this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52800(C23582 c23582) {
        C24132 c24132 = c23582.f76571;
        c24132.scrollTo(0, c24132.m54026());
        c24132.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52781(C23582 c23582, PatternSyntaxException patternSyntaxException) {
        C2361 c2361BuildDialog = c23582.f76553.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C18415.m42923(patternSyntaxException));
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52780(C23582 c23582, View view) {
        C17771 c17771 = c23582.f76554;
        C17771 c17772 = c23582.f76550;
        C11908 c11908 = c23582.f76573;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c11908.m29844(c17772.m41599().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            c11908.m29830(c17772.m41599().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            if (c23582.mo13080(false)) {
                return;
            }
            c11908.m29831(c17772.m41599().toString(), c17771.m41599().toString());
        } else if (id == R.id.MT_Protector) {
            c11908.m29845(c17772.m41599().toString(), c17771.m41599().toString());
        } else if (id == R.id.MT_Protector) {
            c23582.m52826();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52787(C23582 c23582, boolean z) {
        c23582.m52795();
        C6038 c6038 = c23582.f76565;
        c6038.setVisibility(z ? 0 : 8);
        c6038.m17516(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52783(C23582 c23582, C16383 c16383, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        c23582.f76571.m53871();
        c23582.m52827();
        c16383.m38882(R.string.MT_Protector, 2000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52782(C23582 c23582, C16383 c16383, C6038 c6038, boolean z, boolean z2) {
        String str = c23582.f76563;
        C11908 c11908 = c23582.f76573;
        int id = c6038.getId();
        if (id == R.id.MT_Protector) {
            c11908.m29847(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11908.m29828(), C14483.m34972(str, "_bit")).apply();
            c23582.m52827();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11908.m29841(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11908.m29828(), C14483.m34972(str, "_bit")).apply();
            c23582.m52827();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11908.m29834(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11908.m29828(), C14483.m34972(str, "_bit")).apply();
            c23582.m52827();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11908.m29837(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
                if (z) {
                    DialogInterfaceOnClickListenerC12983.m32396(R.string.MT_Protector, c23582.f76553, "page_search");
                }
            }
            ApplicationC17729.f58258.edit().mo3485(c11908.m29828(), C14483.m34972(str, "_bit")).apply();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11908.m29846(z);
            if (z2) {
                c16383.m38882(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
            }
            ApplicationC17729.f58258.edit().mo3485(c11908.m29828(), C14483.m34972(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m52792() {
        C11908 c11908 = this.f76573;
        this.f76572.m17516(c11908.m29840(), false);
        this.f76558.m17516(c11908.m29838(), false);
        this.f76549.m17516(c11908.m29839(), false);
        this.f76574.m17516(c11908.m29848(), false);
        this.f76564.m17516(c11908.m29842(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m52795() {
        C7919 c7919 = this.f76562;
        if (c7919 != null) {
            c7919.m21463();
            this.f76562 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52774(int i) {
        m52795();
        if (this.f76557 || this.f76555) {
            return;
        }
        C24132 c24132 = this.f76571;
        if (i == 3 && c24132.m54083()) {
            return;
        }
        final String string = this.f76550.m41599().toString();
        String string2 = ApplicationC17729.f58258.getString("srep", "$0\\n");
        String str = string2.trim().isEmpty() ? "$0\\n" : string2;
        final int iM29843 = this.f76573.m29843();
        final C20837 c20837M53974 = c24132.m53974();
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int iMo15344 = interfaceC19106M54021.mo15344();
        final String str2 = str;
        C7919 c7919 = new C7919(c24132, this.f76553, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ۙ۬᩸
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C23582.m52788(this.f17212, string, iM29843, c20837M53974, str2);
            }
        });
        this.f76562 = c7919;
        new C11647(this, c7919, interfaceC19106M54021, iMo15344, string, iM29843, str, c20837M53974, i).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52788(C23582 c23582, String str, int i, C20837 c20837, String str2) {
        if (c23582.f76557 || c23582.f76555 || !str.contentEquals(c23582.f76550.m41599()) || i != c23582.f76573.m29843() || !C17359.equals(c20837, c23582.f76571.m53974())) {
            return false;
        }
        String string = ApplicationC17729.f58258.getString("srep", "$0\\n");
        return str2.equals(string.trim().isEmpty() ? "$0\\n" : string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m52798() {
        if (m52817()) {
            int iM41607 = this.f76550.m41607();
            TextView textView = this.f76569;
            TextView textView2 = this.f76566;
            if (iM41607 != 0) {
                C24132 c24132 = this.f76571;
                C2937 c2937 = c24132.f78018;
                int[] iArrM53971 = c24132.m53971();
                C8158 c8158M9602 = c2937.m9602(c24132.getContext(), iArrM53971[0], iArrM53971[1]);
                if (f76547 && c8158M9602.size() >= 10) {
                    textView2.getPaint().setUnderlineText(true);
                    textView2.invalidate();
                    C17837 c17837 = this.f76567;
                    if (c17837.getVisibility() == 8) {
                        c17837.measure(0, 0);
                        c17837.m41690().m40256((textView2.getWidth() / 2.0f) / c17837.getMeasuredWidth());
                        c17837.setVisibility(0);
                        c17837.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(c17837, "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    }
                }
                if (c8158M9602.m22061()) {
                    textView2.setTextColor(C3296.f10779);
                    textView.setTextColor(C3296.f10779);
                } else if (c8158M9602.m22062()) {
                    textView2.setTextColor(C3296.f10760);
                    textView.setTextColor(C3296.f10760);
                } else {
                    textView2.setTextColor(C3296.f10751);
                    textView.setTextColor(C3296.f10751);
                }
                String strM22063 = c8158M9602.m22063();
                if (TextUtils.equals(strM22063, textView.getText())) {
                    return;
                }
                textView.setText(strM22063);
                return;
            }
            if (!TextUtils.equals("0", textView.getText())) {
                textView.setText("0");
            }
            textView2.setTextColor(C3296.f10779);
            textView.setTextColor(C3296.f10779);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52823(C6178 c6178) {
        boolean z = false;
        boolean z2 = this.f76552.getVisibility() == 0;
        if (z2 && this.f76559.getVisibility() == 0) {
            z = true;
        }
        c6178.m17789(z2);
        c6178.m17789(z);
        c6178.m17786((CharSequence) (z2 ? this.f76550.m41599().toString() : ""));
        c6178.m17786((CharSequence) (z ? this.f76554.m41599().toString() : ""));
        c6178.mo17812(29298);
        c6178.writeByte(this.f76573.m29828());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16122 m52815() {
        boolean z = false;
        boolean z2 = this.f76552.getVisibility() == 0;
        if (z2 && this.f76559.getVisibility() == 0) {
            z = true;
        }
        return new C16122(z2 ? this.f76550.m41605().m54021() : null, z ? this.f76554.m41605().m54021() : null, this.f76573.m29828(), this.f76560.m11230());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52824(C20348 c20348) {
        byte bByteValue;
        C20334 c20334M46719 = C20334.m46719(c20348);
        if (c20334M46719.f65239) {
            Byte b = c20334M46719.f65237;
            if (b == null) {
                bByteValue = ApplicationC17729.f58258.mo7901((byte) 0, this.f76563 + "_bit");
            } else {
                bByteValue = b.byteValue();
            }
            this.f76573.m29829(bByteValue);
        }
        C21576.m49068(new RunnableC19852(0, this, c20334M46719));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52776(C20334 c20334, Runnable runnable) {
        boolean z = c20334.f65239;
        boolean z2 = c20334.f65241;
        runnable.run();
        m52792();
        int i = 8;
        this.f76552.setVisibility(z ? 0 : 8);
        if (z && z2) {
            i = 0;
        }
        this.f76559.setVisibility(i);
        m52773();
        C17771 c17771 = this.f76550;
        if (z) {
            c17771.m41594(c20334.f65238);
            runnable.run();
        }
        if (z2) {
            this.f76554.m41594(c20334.f65240);
            runnable.run();
            this.f76574.setVisibility(0);
        }
        C24132 c24132 = this.f76571;
        if (z) {
            View view = this.f76568;
            view.setEnabled(false);
            this.f76551.setEnabled(!c24132.m54083());
            if (c17771.m41607() != 0) {
                m52827();
            }
            if (z2 && !c24132.m54083()) {
                view.setEnabled(true);
            }
        } else {
            c24132.m53871();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52811(C12303 c12303, C3180 c3180, C3354 c3354, C15926 c15926) {
        if (this.f76557 || this.f76555) {
            throw new IllegalStateException("Editor helper cannot prepare session state");
        }
        this.f76571.m53915(c12303, this.f76560.m11221(c3180), c3354, c15926);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52812(C12303 c12303, C3180 c3180, C20334 c20334) {
        byte bByteValue;
        C24132 c24132 = this.f76571;
        c24132.m54046();
        if (this.f76557 || this.f76555) {
            throw new IllegalStateException("Editor helper cannot restore session state");
        }
        RunnableC10571 runnableC10571 = new RunnableC10571(2, this, c24132.m54021());
        this.f76555 = true;
        HandlerC13547 handlerC13547 = this.f76561;
        handlerC13547.removeCallbacksAndMessages(null);
        try {
            boolean zM53940 = c24132.m53940(c12303);
            SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f76560;
            if (!zM53940) {
                c24132.m53914(c12303, sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11221(c3180));
            }
            runnableC10571.run();
            sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11222();
            m52799(this.f76556, c24132);
            if (c20334.f65239) {
                C11908 c11908 = this.f76573;
                Byte b = c20334.f65237;
                if (b == null) {
                    bByteValue = ApplicationC17729.f58258.mo7901((byte) 0, this.f76563 + "_bit");
                } else {
                    bByteValue = b.byteValue();
                }
                c11908.m29829(bByteValue);
            }
            m52776(c20334, runnableC10571);
            handlerC13547.removeCallbacksAndMessages(null);
            this.f76555 = false;
            m52827();
        } catch (Throwable th) {
            handlerC13547.removeCallbacksAndMessages(null);
            this.f76555 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52785(C23582 c23582, InterfaceC19106 interfaceC19106) {
        if (c23582.f76557 || c23582.f76571.m54021() != interfaceC19106) {
            throw new CancellationException("Editor owner changed during restoration");
        }
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13080(boolean z) {
        View view = this.f76559;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f76574.setVisibility(0);
        this.f76568.setEnabled(true);
        C17771 c17771 = this.f76554;
        c17771.requestFocus();
        c17771.m41598();
        c17771.m41590();
        if (z) {
            C21576.m49090(c17771.m41605());
        }
        return true;
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ */
    public final void mo13072() {
        mo13079(true, false);
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13087() {
        mo13079(false, false);
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ */
    public final void mo13079(boolean z, boolean z2) {
        boolean zM52817 = m52817();
        C11908 c11908 = this.f76573;
        C24132 c24132 = this.f76571;
        if (!zM52817) {
            if (c24132.f78022.mo25237()) {
                return;
            }
            c11908.m29829(ApplicationC17729.f58258.mo7901((byte) 0, this.f76563 + "_bit"));
            m52792();
            this.f76552.setVisibility(0);
            this.f76559.setVisibility(8);
            m52773();
            this.f76574.setVisibility(8);
            this.f76568.setEnabled(false);
            this.f76551.setEnabled(!c24132.m54083());
        }
        C17771 c17771 = this.f76550;
        if (z) {
            c17771.requestFocus();
            C21576.m49090(c17771.m41605());
        }
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        if (i != i2 && i2 - i <= 50000 && !z2) {
            try {
                String string = c24132.m54021().subSequence(i, i2).toString();
                if (c11908.m29840()) {
                    string = C17370.m40798(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c17771.m41594(string);
                if (z) {
                    c17771.m41590();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM52817) {
            c17771.m41598();
            if (z) {
                c17771.m41590();
            }
        } else if (!z2) {
            return;
        }
        if (c17771.m41607() != 0) {
            m52827();
        } else {
            m52798();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m52817() {
        return this.f76552.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52826() {
        m52795();
        C24132 c24132 = this.f76571;
        c24132.m53871();
        this.f76573.m29835();
        View view = this.f76552;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m52773();
            this.f76550.m41603();
        }
        View view2 = this.f76559;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f76554.m41603();
        }
        if (f76547) {
            this.f76567.setVisibility(8);
            TextView textView = this.f76566;
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        this.f76574.setVisibility(8);
        c24132.requestFocus();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m52827() {
        m52795();
        this.f76561.removeMessages(0);
        m52802();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m52802() {
        if (this.f76557 || this.f76555 || !m52817()) {
            return;
        }
        this.f76573.m29836(this.f76550.m41599().toString());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m52773() {
        View view = this.f76552;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        AbstractActivityC17204 abstractActivityC17204 = this.f76553;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            abstractActivityC17204.getWindow().setNavigationBarColor(C3296.f10763);
        } else {
            abstractActivityC17204.getWindow().setNavigationBarColor(this.f76571.f78066.f45799);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52809(C6178 c6178) {
        this.f76560.m11226(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52813(C20348 c20348) {
        this.f76560.m11227(c20348);
        m52799(this.f76556, this.f76571);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52808(String str, boolean z) {
        this.f76560.m11225(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52806(Class cls) {
        this.f76560.m11223(cls);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m52821() {
        this.f76557 = true;
        m52795();
        this.f76573.m29835();
        this.f76561.removeCallbacksAndMessages(null);
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f76560;
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.getClass();
        try {
            C21576.f68932.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3444);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52804() {
        return this.f76560.m11229();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52822(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f76560;
        boolean zEquals = str.equals(sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11234());
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11236(str);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11232() || SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11215()) {
            this.f76571.m53903(str, true);
        }
        if (zEquals) {
            return;
        }
        this.f76570.mo1859();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m52819() {
        this.f76560.m11231();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m52818() {
        return this.f76560.m11234();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52814() {
        C16868 c16868 = new C16868(this, this.f76553);
        c16868.m22945(R.string.MT_Protector);
        c16868.m22948(2);
        c16868.m22933("1…" + this.f76571.m54064());
        c16868.m22918();
        c16868.m22957(2);
        c16868.m22955(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52825(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C24132 c24132 = this.f76571;
        if (itemId == R.id.MT_Protector) {
            c24132.mo52287();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132.mo52325();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132.m54086();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132.m54019();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo13072();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m52814();
            return true;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f76553;
        if (itemId == R.id.MT_Protector) {
            final String[] strArr = (String[]) C9341.m24617().toArray(new String[0]);
            final int iIndexOf = C9341.m24617().indexOf(this.f76560.m11234());
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8013(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.ۤ۬᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C23582.m52778(this.f34510, iIndexOf, strArr, dialogInterface, i);
                }
            });
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC3673(1, this));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m52806(ActivityC7261.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m52816();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132.m53998(!c24132.m53953());
            menuItem.setChecked(c24132.m53953());
            if (c24132.m53953()) {
                DialogInterfaceOnClickListenerC12983.m32394(R.string.MT_Protector, abstractActivityC17204, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m52775(menuItem, c24132);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C10549)) {
            return false;
        }
        ((C10549) title).m26996().mo31675(c24132);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52775(MenuItem menuItem, C24132 c24132) {
        int i;
        int i2;
        MenuItem menuItemAdd;
        boolean z = (c24132.m53884() || c24132.m54083()) ? false : true;
        boolean z2 = c24132.m54099() == 0;
        int iM53968 = c24132.m53968();
        int iM53882 = c24132.m53882();
        if (iM53968 > iM53882) {
            i2 = iM53968;
            i = iM53882;
        } else {
            i = iM53968;
            i2 = iM53882;
        }
        SubMenu subMenu = menuItem.getSubMenu();
        subMenu.clear();
        List<AbstractC22484> listM15980 = C5330.m15980();
        Map mapM15983 = C5330.m15983();
        SubMenu subMenu2 = null;
        for (AbstractC22484 abstractC22484 : listM15980) {
            Integer num = (Integer) mapM15983.get(abstractC22484.mo31674());
            if (num != null && abstractC22484.mo30572(c24132, z, z2, i, i2)) {
                if (num.intValue() >= 300) {
                    if (subMenu2 == null) {
                        SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, 0, 65535, R.string.MT_Protector);
                        subMenuAddSubMenu.setIcon(R.drawable.MT_Protector);
                        subMenu2 = subMenuAddSubMenu;
                    }
                    menuItemAdd = subMenu2.add(0, 0, num.intValue(), abstractC22484.mo31676());
                } else {
                    menuItemAdd = subMenu.add(0, 0, num.intValue(), abstractC22484.mo31676());
                }
                menuItemAdd.setIcon(abstractC22484.mo31673(c24132.getContext()));
            }
        }
    }
}
