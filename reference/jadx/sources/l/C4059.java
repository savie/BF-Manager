package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۘۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4059 implements InterfaceC20598 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17771 f13825;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f13826;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f13827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC2350 f13828;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17771 f13829;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f13830;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24943 f13831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6038 f13832;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11908 f13833;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC3444 f13834;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f13835;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC3444 f13836;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f13837;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f13838;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6038 f13839;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public MenuItem f13840;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24132 f13841;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C11908 f13842;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6038 f13843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24197 f13844;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24132 f13845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f13846;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HandlerC13547 f13847 = new HandlerC13547(this, new C24921());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6038 f13848;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13057(C4059 c4059) {
        c4059.getClass();
        ActivityC2350 activityC2350 = c4059.f13828;
        activityC2350.startActivity(new Intent(activityC2350, (Class<?>) ActivityC9641.class));
    }

    public C4059(ActivityC2350 activityC2350, C24943 c24943, InterfaceC24197 interfaceC24197) {
        this.f13828 = activityC2350;
        this.f13831 = c24943;
        C24132 c24132M55686 = c24943.m55686();
        this.f13845 = c24132M55686;
        C24132 c24132M55680 = c24943.m55680();
        this.f13841 = c24132M55680;
        this.f13838 = TextBundle.TEXT_ENTRY;
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = new SharedPreferencesOnSharedPreferenceChangeListenerC3444(activityC2350, c24132M55686);
        this.f13836 = sharedPreferencesOnSharedPreferenceChangeListenerC3444;
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3445 = new SharedPreferencesOnSharedPreferenceChangeListenerC3444(activityC2350, c24132M55680);
        this.f13834 = sharedPreferencesOnSharedPreferenceChangeListenerC3445;
        this.f13844 = interfaceC24197;
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11235();
        sharedPreferencesOnSharedPreferenceChangeListenerC3445.m11235();
        View viewMo37711 = interfaceC24197.mo37711();
        this.f13830 = viewMo37711;
        this.f13826 = viewMo37711.findViewById(R.id.MT_Protector);
        this.f13846 = viewMo37711.findViewById(R.id.MT_Protector);
        this.f13837 = viewMo37711.findViewById(R.id.MT_Protector);
        C17771 c17771 = (C17771) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13825 = c17771;
        C17771 c17772 = (C17771) viewMo37711.findViewById(R.id.edtReplaceWord);
        this.f13829 = c17772;
        C4846.m14885(c17771.m41605());
        C4846.m14885(c17772.m41605());
        this.f13839 = (C6038) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13832 = (C6038) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13843 = (C6038) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13848 = (C6038) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13835 = (TextView) viewMo37711.findViewById(R.id.MT_Protector);
        this.f13827 = (TextView) viewMo37711.findViewById(R.id.MT_Protector);
        ((ViewGroup) viewMo37711).removeView(viewMo37711.findViewById(R.id.MT_Protector));
        c17771.m41595("text_s", (String) null);
        c17772.m41595("text_r", (String) null);
        this.f13842 = new C11908(activityC2350, c24132M55686);
        this.f13833 = new C11908(activityC2350, c24132M55680);
        C16383 c16383 = new C16383((TextView) viewMo37711.findViewById(R.id.MT_Protector));
        int i = 0;
        while (i < 2) {
            (i == 0 ? this.f13842 : this.f13833).m29832(new C20467(this, c16383));
            i++;
        }
        ViewOnClickListenerC12790 viewOnClickListenerC12790 = new ViewOnClickListenerC12790(1, this);
        C0646 c0646 = new C0646(this, c16383);
        this.f13839.m17515(c0646);
        this.f13832.m17515(c0646);
        this.f13843.m17515(c0646);
        this.f13848.m17515(c0646);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i2 = 0; i2 < 5; i2++) {
            View viewFindViewById = viewMo37711.findViewById(iArr[i2]);
            C17423.m40911(viewFindViewById);
            viewFindViewById.setOnClickListener(viewOnClickListenerC12790);
        }
        this.f13825.m41593(new C12262(this));
        int i3 = 1;
        c24132M55686.m53901(new RunnableC22358(i3, this));
        c24132M55680.m53901(new RunnableC22358(i3, this));
        c24132M55686.m53913(new InterfaceC11886() { // from class: l.ܽۡ᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i4, int i5) {
                this.f56829.m13092();
            }
        });
        c24132M55680.m53913(new C15991(0, this));
        this.f13845.m53928(this);
        this.f13841.m53928(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13077(InterfaceC11217 interfaceC11217, C5639 c5639, Class cls) {
        c5639.m16626(interfaceC11217, new C3313(this), this.f13825.m41605(), this.f13829.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13075(String str, String str2) {
        this.f13836.m11224(str);
        this.f13834.m11224(str2);
        C23582.m52799(this.f13840, this.f13845);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m13086() {
        return this.f13836.m11234();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m13085() {
        return this.f13834.m11234();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13073(MenuItem menuItem) {
        this.f13840 = menuItem;
        C23582.m52799(menuItem, this.f13845);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13071() {
        MenuItem menuItem = this.f13840;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f13840.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f13836;
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11228(zIsChecked);
        boolean zIsChecked2 = this.f13840.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3445 = this.f13834;
        sharedPreferencesOnSharedPreferenceChangeListenerC3445.m11228(zIsChecked2);
        C16361 c16361M11230 = sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11230();
        C16361 c16361M11231 = sharedPreferencesOnSharedPreferenceChangeListenerC3445.m11230();
        RunnableC9530 runnableC9530 = new RunnableC9530(1, this, new AtomicInteger(2));
        this.f13845.m53921(c16361M11230, runnableC9530);
        this.f13841.m53921(c16361M11231, runnableC9530);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13062(C4059 c4059) {
        C24132 c24132 = c4059.f13845;
        c24132.scrollTo(0, c24132.m54026());
        C24132 c24133 = c4059.f13841;
        c24133.scrollTo(0, c24133.m54026());
        c24132.invalidate();
        c24133.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13059(C4059 c4059, PatternSyntaxException patternSyntaxException) {
        C2361 c2361BuildDialog = c4059.f13828.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C18415.m42923(patternSyntaxException));
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13058(C4059 c4059, View view) {
        C17771 c17771 = c4059.f13829;
        C17771 c17772 = c4059.f13825;
        C11908 c11908 = c4059.f13831.m55700() ? c4059.f13842 : c4059.f13833;
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
            if (c4059.mo13080(false)) {
                return;
            }
            c11908.m29831(c17772.m41599().toString(), c17771.m41599().toString());
        } else if (id == R.id.MT_Protector) {
            c11908.m29845(c17772.m41599().toString(), c17771.m41599().toString());
        } else if (id == R.id.MT_Protector) {
            c4059.m13082();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13060(C4059 c4059, C16383 c16383, C6038 c6038, boolean z, boolean z2) {
        String str = c4059.f13838;
        C11908 c11908 = c4059.f13833;
        C11908 c11909 = c4059.f13842;
        int id = c6038.getId();
        if (id == R.id.MT_Protector) {
            c11909.m29847(z);
            c11908.m29847(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11909.m29828(), C14483.m34972(str, "_bit")).apply();
            c4059.m13083();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11909.m29841(z);
            c11908.m29841(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11909.m29828(), C14483.m34972(str, "_bit")).apply();
            c4059.m13083();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11909.m29834(z);
            c11908.m29834(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11909.m29828(), C14483.m34972(str, "_bit")).apply();
            c4059.m13083();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11909.m29846(z);
            c11908.m29846(z);
            if (z2) {
                c16383.m38881(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC17729.f58258.edit().mo3485(c11909.m29828(), C14483.m34972(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m13065() {
        C11908 c11908 = this.f13842;
        this.f13839.m17516(c11908.m29840(), false);
        this.f13832.m17516(c11908.m29838(), false);
        this.f13843.m17516(c11908.m29839(), false);
        this.f13848.m17516(c11908.m29848(), false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m13092() {
        if (m13084()) {
            int iM41607 = this.f13825.m41607();
            TextView textView = this.f13835;
            TextView textView2 = this.f13827;
            if (iM41607 != 0) {
                C24132 c24132M55666 = this.f13831.m55666();
                C2937 c2937 = c24132M55666.f78018;
                int[] iArrM53971 = c24132M55666.m53971();
                C8158 c8158M9602 = c2937.m9602(c24132M55666.getContext(), iArrM53971[0], iArrM53971[1]);
                if (c8158M9602.m22061()) {
                    textView.setTextColor(C3296.f10779);
                    textView2.setTextColor(C3296.f10779);
                } else if (c8158M9602.m22062()) {
                    textView.setTextColor(C3296.f10760);
                    textView2.setTextColor(C3296.f10760);
                } else {
                    textView.setTextColor(C3296.f10751);
                    textView2.setTextColor(C3296.f10751);
                }
                String strM22063 = c8158M9602.m22063();
                if (TextUtils.equals(strM22063, textView2.getText())) {
                    return;
                }
                textView2.setText(strM22063);
                return;
            }
            if (!TextUtils.equals("0", textView2.getText())) {
                textView2.setText("0");
            }
            textView.setTextColor(C3296.f10779);
            textView2.setTextColor(C3296.f10779);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13088(C6178 c6178) {
        boolean z = false;
        boolean z2 = this.f13830.getVisibility() == 0;
        if (z2 && this.f13826.getVisibility() == 0) {
            z = true;
        }
        c6178.m17789(z2);
        c6178.m17789(z);
        c6178.m17786((CharSequence) (z2 ? this.f13825.m41599().toString() : ""));
        c6178.m17786((CharSequence) (z ? this.f13829.m41599().toString() : ""));
        c6178.writeByte(this.f13842.m29828());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13089(C20348 c20348) {
        final boolean zM46753 = c20348.m46753();
        final boolean zM46754 = c20348.m46753();
        final String strM46722 = C20334.m46722(c20348);
        final String strM46723 = C20334.m46722(c20348);
        byte b = c20348.readByte();
        if (zM46753) {
            this.f13842.m29829(b);
            this.f13833.m29829(b);
        }
        C21576.m49068(new Runnable() { // from class: l.᩹ۡ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C4059.m13061(this.f75900, zM46753, zM46754, strM46722, strM46723);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13061(C4059 c4059, boolean z, boolean z2, String str, String str2) {
        C24132 c24132 = c4059.f13845;
        View view = c4059.f13846;
        C17771 c17771 = c4059.f13825;
        c4059.m13065();
        int i = 8;
        c4059.f13830.setVisibility(z ? 0 : 8);
        View view2 = c4059.f13826;
        if (z && z2) {
            i = 0;
        }
        view2.setVisibility(i);
        c4059.m13067();
        c4059.f13844.mo37712();
        if (z) {
            c17771.m41594(str);
        }
        if (z2) {
            c4059.f13829.m41594(str2);
            c4059.f13848.setVisibility(0);
        }
        if (z) {
            view.setAlpha(0.26f);
            view.setEnabled(false);
            View view3 = c4059.f13837;
            if (c24132.m54083()) {
                view3.setAlpha(0.26f);
                view3.setEnabled(false);
            } else {
                view3.setAlpha(1.0f);
                view3.setEnabled(true);
            }
            if (c17771.m41607() != 0) {
                c4059.m13083();
            }
            if (!z2 || c24132.m54083()) {
                return;
            }
            view.setAlpha(1.0f);
            view.setEnabled(true);
        }
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13080(boolean z) {
        View view = this.f13826;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f13848.setVisibility(0);
        View view2 = this.f13846;
        view2.setAlpha(1.0f);
        view2.setEnabled(true);
        C17771 c17771 = this.f13829;
        c17771.requestFocus();
        c17771.m41598();
        c17771.m41590();
        if (z) {
            C21576.m49090(c17771.m41605());
        }
        return true;
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13072() {
        mo13079(true, false);
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13087() {
        mo13079(false, false);
    }

    @Override // l.InterfaceC20598
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13079(boolean z, boolean z2) {
        boolean zM13084 = m13084();
        C24132 c24132M55666 = this.f13831.m55666();
        C11908 c11908 = this.f13842;
        if (!zM13084) {
            if (this.f13845.f78022.mo25237() || this.f13841.f78022.mo25237()) {
                return;
            }
            byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, this.f13838 + "_bit");
            c11908.m29829(bMo7901);
            this.f13833.m29829(bMo7901);
            m13065();
            this.f13830.setVisibility(0);
            this.f13826.setVisibility(8);
            m13067();
            this.f13848.setVisibility(8);
            this.f13844.mo37712();
            View view = this.f13846;
            view.setAlpha(0.26f);
            view.setEnabled(false);
            boolean zM54083 = c24132M55666.m54083();
            View view2 = this.f13837;
            if (zM54083) {
                view2.setAlpha(0.26f);
                view2.setEnabled(false);
            } else {
                view2.setAlpha(1.0f);
                view2.setEnabled(true);
            }
        }
        C17771 c17771 = this.f13825;
        if (z) {
            c17771.requestFocus();
            C21576.m49090(c17771.m41605());
        }
        int[] iArrM53971 = c24132M55666.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        if (i != i2 && i2 - i <= 50000 && !z2) {
            try {
                String string = c24132M55666.m54021().subSequence(i, i2).toString();
                if (c11908.m29840()) {
                    string = C17370.m40798(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c17771.m41594(string);
                if (z) {
                    c17771.m41590();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM13084) {
            c17771.m41598();
            if (z) {
                c17771.m41590();
            }
        } else if (!z2) {
            return;
        }
        if (c17771.m41607() != 0) {
            m13083();
        } else {
            m13092();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m13084() {
        return this.f13830.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13082() {
        this.f13842.m29835();
        this.f13833.m29835();
        View view = this.f13830;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m13067();
            this.f13825.m41603();
            this.f13844.mo37712();
        }
        View view2 = this.f13826;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f13829.m41603();
        }
        this.f13848.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13083() {
        this.f13847.removeMessages(0);
        m13066();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m13066() {
        if (m13084()) {
            C17771 c17771 = this.f13825;
            this.f13842.m29836(c17771.m41599().toString());
            this.f13833.m29836(c17771.m41599().toString());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13067() {
        View view = this.f13830;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        ActivityC2350 activityC2350 = this.f13828;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            activityC2350.getWindow().setNavigationBarColor(C3296.f10763);
        } else {
            activityC2350.getWindow().setNavigationBarColor(this.f13831.m55686().f78066.f45799);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13076(C6178 c6178) {
        this.f13836.m11226(c6178);
        this.f13834.m11226(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13078(C20348 c20348) {
        this.f13836.m11227(c20348);
        this.f13834.m11227(c20348);
        C23582.m52799(this.f13840, this.f13845);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13074(Class cls) {
        this.f13836.m11220();
        this.f13834.m11223(cls);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m13091() {
        this.f13847.removeCallbacksAndMessages(null);
        this.f13842.m29835();
        this.f13833.m29835();
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = this.f13836;
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.getClass();
        try {
            C21576.f68932.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3444);
        } catch (Exception unused) {
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3445 = this.f13834;
        sharedPreferencesOnSharedPreferenceChangeListenerC3445.getClass();
        try {
            C21576.f68932.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3445);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m13081() {
        return this.f13836.m11229() | this.f13834.m11229();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13090(MenuItem menuItem) {
        final SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444;
        final SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3445;
        final C24132 c24132;
        final C24132 c24133;
        C24943 c24943 = this.f13831;
        C24132 c24132M55666 = c24943.m55666();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            c24132M55666.mo52287();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132M55666.mo52325();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132M55666.m54086();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c24132M55666.m54019();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo13072();
            return true;
        }
        ActivityC2350 activityC2350 = this.f13828;
        if (itemId == R.id.MT_Protector) {
            C24132 c24132M55667 = c24943.m55666();
            C6297 c6297 = new C6297(activityC2350, c24132M55667);
            c6297.m22945(R.string.MT_Protector);
            c6297.m22948(2);
            c6297.m22933("1…" + c24132M55667.m54064());
            c6297.m22918();
            c6297.m22957(2);
            c6297.m22955(true);
            return true;
        }
        C24132 c24134 = this.f13841;
        C24132 c24135 = this.f13845;
        if (itemId == R.id.MT_Protector) {
            boolean zM55700 = c24943.m55700();
            SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3446 = this.f13834;
            SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3447 = this.f13836;
            if (zM55700) {
                sharedPreferencesOnSharedPreferenceChangeListenerC3445 = sharedPreferencesOnSharedPreferenceChangeListenerC3446;
                sharedPreferencesOnSharedPreferenceChangeListenerC3444 = sharedPreferencesOnSharedPreferenceChangeListenerC3447;
                c24133 = c24134;
                c24132 = c24135;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC3444 = sharedPreferencesOnSharedPreferenceChangeListenerC3446;
                sharedPreferencesOnSharedPreferenceChangeListenerC3445 = sharedPreferencesOnSharedPreferenceChangeListenerC3447;
                c24132 = c24134;
                c24133 = c24135;
            }
            final boolean zEquals = sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11234().equals(sharedPreferencesOnSharedPreferenceChangeListenerC3445.m11234());
            final String[] strArr = (String[]) C9341.m24617().toArray(new String[0]);
            final int iIndexOf = C9341.m24617().indexOf(sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11234());
            C2361 c2361BuildDialog = activityC2350.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8013(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.ܺۡ᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (iIndexOf != i) {
                        String str = strArr[i];
                        sharedPreferencesOnSharedPreferenceChangeListenerC3444.m11236(str);
                        boolean zM11215 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11215();
                        C24132 c24136 = c24132;
                        if (zM11215) {
                            c24136.m53903(str, true);
                        }
                        c24136.m54075(str);
                        if (zEquals) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC3445.m11236(str);
                            boolean zM11216 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11215();
                            C24132 c24137 = c24133;
                            if (zM11216) {
                                c24137.m53903(str, true);
                            }
                            c24137.m54075(str);
                        }
                    }
                    dialogInterface.dismiss();
                }
            });
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC7633(1, this));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m13074(ActivityC11582.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m13071();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean zM53953 = c24135.m53953();
            boolean z = !zM53953;
            c24135.m53998(z);
            c24134.m53998(z);
            menuItem.setChecked(z);
            if (!zM53953) {
                DialogInterfaceOnClickListenerC12983.m32394(R.string.MT_Protector, activityC2350, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C23582.m52775(menuItem, c24132M55666);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C10549)) {
            return false;
        }
        ((C10549) title).m26996().mo31675(c24132M55666);
        return true;
    }
}
