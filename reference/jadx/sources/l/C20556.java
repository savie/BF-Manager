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

/* JADX INFO: renamed from: l.᩷֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes5.dex */
public final class C20556 implements InterfaceC19851 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static boolean f66558 = ApplicationC0716.f2992.getBoolean("sesrt", true);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66559 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f66560;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC15618 f66561;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6111 f66562;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9160 f66563;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f66564;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10052 f66565;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17667 f66566;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10327 f66567;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f66568;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final View f66569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f66570;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f66571;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public MenuItem f66572;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9160 f66573;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7150 f66574;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17667 f66575;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HandlerC10184 f66576;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17667 f66577;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f66578;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17667 f66579;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f66580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f66581;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f66582;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17667 f66583;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9268 f66584;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17667 f66585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46338(C20556 c20556) {
        c20556.getClass();
        AbstractActivityC12483 abstractActivityC12483 = c20556.f66564;
        abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC1919.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46339(C20556 c20556, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        c20556.getClass();
        if (i != i2) {
            String str = strArr[i2];
            c20556.m46380(str);
            c20556.f66562.m16990(str);
        }
        dialogInterface.dismiss();
    }

    public C20556(ActivityC5677 activityC5677, C6111 c6111, View view) {
        this(activityC5677, c6111, "code", new C18280(4, view));
    }

    public C20556(AbstractActivityC12483 abstractActivityC12483, C6111 c6111, String str, InterfaceC7150 interfaceC7150) {
        this.f66576 = new HandlerC10184(this, new C7309());
        this.f66564 = abstractActivityC12483;
        this.f66562 = c6111;
        this.f66578 = str;
        this.f66561 = new SharedPreferencesOnSharedPreferenceChangeListenerC15618(abstractActivityC12483, c6111);
        this.f66574 = interfaceC7150;
        View viewMo8441 = interfaceC7150.mo8441();
        this.f66582 = viewMo8441;
        this.f66569 = viewMo8441.findViewById(R.id.MT_Protector);
        this.f66580 = viewMo8441.findViewById(R.id.MT_Protector);
        this.f66568 = viewMo8441.findViewById(R.id.MT_Protector);
        C9160 c9160 = (C9160) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66563 = c9160;
        C9160 c9161 = (C9160) viewMo8441.findViewById(R.id.edtReplaceWord);
        this.f66573 = c9161;
        C17667 c17667 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66579 = c17667;
        C17667 c17668 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66566 = c17668;
        C17667 c17669 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66577 = c17669;
        C17667 c176610 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66585 = c176610;
        C17667 c176611 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66583 = c176611;
        C17667 c176612 = (C17667) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66575 = c176612;
        TextView textView = (TextView) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66560 = textView;
        this.f66581 = (TextView) viewMo8441.findViewById(R.id.MT_Protector);
        C10052 c10052 = (C10052) viewMo8441.findViewById(R.id.MT_Protector);
        this.f66565 = c10052;
        if (!f66558) {
            ((ViewGroup) viewMo8441).removeView(c10052);
        }
        textView.setOnClickListener(new ViewOnClickListenerC12795(0, abstractActivityC12483, this));
        c9160.m23508(str.concat("_s"), (String) null);
        c9161.m23508(str.concat("_r"), (String) null);
        C10327 c10327 = new C10327(abstractActivityC12483, c6111);
        this.f66567 = c10327;
        final C20205 c20205 = new C20205((TextView) viewMo8441.findViewById(R.id.MT_Protector));
        c10327.m26199(new C17733(this, c20205));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۗܳۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20556.m46341(this.f12191, view);
            }
        };
        c6111.m16863(new C4327(this));
        c176611.m41145(new InterfaceC12729() { // from class: l.ܰ֫ۖ
            @Override // l.InterfaceC12729
            /* JADX INFO: renamed from: ۙ */
            public final void mo7609(C17667 c176613, boolean z, boolean z2) {
                C20556.m46347(this.f44602, c20205, z, z2);
            }
        });
        C13330 c13330 = new C13330(this, c20205);
        c17667.m41145(c13330);
        c17668.m41145(c13330);
        c17669.m41145(c13330);
        c176610.m41145(c13330);
        c176612.m41145(c13330);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i = 0; i < 5; i++) {
            View viewFindViewById = viewMo8441.findViewById(iArr[i]);
            C0674.m3027(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f66563.m23506(new C18439(this));
        c6111.m16855(new Runnable() { // from class: l.ۨ֫ۖ
            @Override // java.lang.Runnable
            public final void run() {
                this.f38376.m46352();
            }
        });
        c6111.m16864(new InterfaceC7191() { // from class: l.ۖ֫ۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i2, int i3) {
                this.f7960.m46352();
            }
        });
        m46384();
        c6111.m16881(this);
        m46359();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46345(final C20556 c20556, AbstractActivityC12483 abstractActivityC12483, View view) {
        TextView textView = c20556.f66560;
        if (f66558) {
            f66558 = false;
            C1679.m5597(ApplicationC0716.f2992, "sesrt", false);
            c20556.f66565.setVisibility(8);
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        boolean z = !c20556.f66581.getText().toString().equals("0");
        C16195 c16195 = new C16195(abstractActivityC12483, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.setOptionalIconsVisible(true);
        c12418M38298.setGroupDividerEnabled(true);
        C17356.m40381(c12418M38298, R.string.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c12418M38298.add(R.string.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ۚ֫ۖ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C20556.m46340(this.f17549, menuItem);
                return true;
            }
        });
        C0671.m3000(c16195).m6964();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46340(C20556 c20556, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            String string = ApplicationC0716.f2992.getString("srep", "$0\\n");
            new C8562(c20556, c20556.f66564, string.trim().isEmpty() ? "$0\\n" : string);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c20556.m46335(1);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c20556.m46335(2);
        } else if (itemId == R.string.MT_Protector) {
            c20556.m46335(3);
        } else if (itemId == R.string.MT_Protector) {
            c20556.m46335(4);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m46384() {
        InterfaceC21615 interfaceC21615Mo8442 = this.f66574.mo8442();
        this.f66575.setVisibility(interfaceC21615Mo8442 == null ? 8 : 0);
        this.f66567.m26200(interfaceC21615Mo8442);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46371(InterfaceC1423 interfaceC1423, C16839 c16839, Class cls) {
        c16839.m39493(interfaceC1423, new C21261(this, cls), this.f66563.m23516(), this.f66573.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46369(String str) {
        this.f66561.m37296(str);
        m46355(this.f66572, this.f66562);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46367(MenuItem menuItem) {
        this.f66572 = menuItem;
        m46355(menuItem, this.f66562);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m46355(MenuItem menuItem, C6111 c6111) {
        if (menuItem == null) {
            return;
        }
        RunnableC13438 runnableC13438 = new RunnableC13438(menuItem, c6111);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableC13438.run();
        } else {
            C16737.m39273(runnableC13438);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m46366() {
        MenuItem menuItem = this.f66572;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f66572.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f66561;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37300(zIsChecked);
        this.f66562.m16860(sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37303(), new RunnableC21385(1, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46356(C20556 c20556) {
        C6111 c6111 = c20556.f66562;
        c6111.scrollTo(0, c6111.m17066());
        c6111.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46342(C20556 c20556, PatternSyntaxException patternSyntaxException) {
        C8067 c8067BuildDialog = c20556.f66564.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C14690.m35217(patternSyntaxException));
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46341(C20556 c20556, View view) {
        C9160 c9160 = c20556.f66573;
        C9160 c9161 = c20556.f66563;
        C10327 c10327 = c20556.f66567;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c10327.m26209(c9161.m23513().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            c10327.m26197(c9161.m23513().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            if (c20556.mo41941(false)) {
                return;
            }
            c10327.m26198(c9161.m23513().toString(), c9160.m23513().toString());
        } else if (id == R.id.MT_Protector) {
            c10327.m26210(c9161.m23513().toString(), c9160.m23513().toString());
        } else if (id == R.id.MT_Protector) {
            c20556.m46378();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46348(C20556 c20556, boolean z) {
        c20556.m46361();
        C17667 c17667 = c20556.f66583;
        c17667.setVisibility(z ? 0 : 8);
        c17667.m41146(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46347(C20556 c20556, C20205 c20205, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        c20556.f66562.m17047();
        c20556.m46377();
        c20205.m45662(R.string.MT_Protector, 2000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46346(C20556 c20556, C20205 c20205, C17667 c17667, boolean z, boolean z2) {
        String str = c20556.f66578;
        C10327 c10327 = c20556.f66567;
        int id = c17667.getId();
        if (id == R.id.MT_Protector) {
            c10327.m26193(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10327.m26195(), C15489.m37076(str, "_bit")).apply();
            c20556.m46377();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10327.m26202(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10327.m26195(), C15489.m37076(str, "_bit")).apply();
            c20556.m46377();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10327.m26201(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10327.m26195(), C15489.m37076(str, "_bit")).apply();
            c20556.m46377();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10327.m26205(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
                if (z) {
                    DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, c20556.f66564, "page_search");
                }
            }
            ApplicationC0716.f2992.edit().mo4064(c10327.m26195(), C15489.m37076(str, "_bit")).apply();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10327.m26211(z);
            if (z2) {
                c20205.m45662(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
            }
            ApplicationC0716.f2992.edit().mo4064(c10327.m26195(), C15489.m37076(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m46360() {
        C10327 c10327 = this.f66567;
        this.f66579.m41146(c10327.m26212(), false);
        this.f66566.m41146(c10327.m26206(), false);
        this.f66577.m41146(c10327.m26192(), false);
        this.f66585.m41146(c10327.m26194(), false);
        this.f66575.m41146(c10327.m26203(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m46361() {
        C9268 c9268 = this.f66584;
        if (c9268 != null) {
            c9268.m23810();
            this.f66584 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46335(int i) {
        m46361();
        if (this.f66571 || this.f66570) {
            return;
        }
        C6111 c6111 = this.f66562;
        if (i == 3 && c6111.m17004()) {
            return;
        }
        final String string = this.f66563.m23513().toString();
        String string2 = ApplicationC0716.f2992.getString("srep", "$0\\n");
        String str = string2.trim().isEmpty() ? "$0\\n" : string2;
        final int iM26208 = this.f66567.m26208();
        final C17069 c17069M16807 = c6111.m16807();
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int iMo2395 = interfaceC2916M17000.mo2395();
        final String str2 = str;
        C9268 c9268 = new C9268(c6111, this.f66564, R.string.MT_Protector, new BooleanSupplier() { // from class: l.᩹֫ۖ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C20556.m46349(this.f71268, string, iM26208, c17069M16807, str2);
            }
        });
        this.f66584 = c9268;
        new C19145(this, c9268, interfaceC2916M17000, iMo2395, string, iM26208, str, c17069M16807, i).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46349(C20556 c20556, String str, int i, C17069 c17069, String str2) {
        if (c20556.f66571 || c20556.f66570 || !str.contentEquals(c20556.f66563.m23513()) || i != c20556.f66567.m26208() || !C13638.equals(c17069, c20556.f66562.m16807())) {
            return false;
        }
        String string = ApplicationC0716.f2992.getString("srep", "$0\\n");
        return str2.equals(string.trim().isEmpty() ? "$0\\n" : string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m46352() {
        if (m46385()) {
            int iM23502 = this.f66563.m23502();
            TextView textView = this.f66581;
            TextView textView2 = this.f66560;
            if (iM23502 != 0) {
                C6111 c6111 = this.f66562;
                C12880 c12880 = c6111.f20825;
                int[] iArrM16971 = c6111.m16971();
                C11469 c11469M31932 = c12880.m31932(c6111.getContext(), iArrM16971[0], iArrM16971[1]);
                if (f66558 && c11469M31932.size() >= 10) {
                    textView2.getPaint().setUnderlineText(true);
                    textView2.invalidate();
                    C10052 c10052 = this.f66565;
                    if (c10052.getVisibility() == 8) {
                        c10052.measure(0, 0);
                        c10052.m25447().m22444((textView2.getWidth() / 2.0f) / c10052.getMeasuredWidth());
                        c10052.setVisibility(0);
                        c10052.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(c10052, "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    }
                }
                if (c11469M31932.m28659()) {
                    textView2.setTextColor(C20368.f66009);
                    textView.setTextColor(C20368.f66009);
                } else if (c11469M31932.m28658()) {
                    textView2.setTextColor(C20368.f65998);
                    textView.setTextColor(C20368.f65998);
                } else {
                    textView2.setTextColor(C20368.f65976);
                    textView.setTextColor(C20368.f65976);
                }
                String strM28660 = c11469M31932.m28660();
                if (TextUtils.equals(strM28660, textView.getText())) {
                    return;
                }
                textView.setText(strM28660);
                return;
            }
            if (!TextUtils.equals("0", textView.getText())) {
                textView.setText("0");
            }
            textView2.setTextColor(C20368.f66009);
            textView.setTextColor(C20368.f66009);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46381(C11018 c11018) {
        boolean z = false;
        boolean z2 = this.f66582.getVisibility() == 0;
        if (z2 && this.f66569.getVisibility() == 0) {
            z = true;
        }
        C9160 c9160 = this.f66563;
        if (z2) {
            c9160.m23519();
        }
        C9160 c9161 = this.f66573;
        if (z) {
            c9161.m23519();
        }
        c11018.m27784(z2);
        c11018.m27784(z);
        c11018.m27782((CharSequence) (z2 ? c9160.m23513().toString() : ""));
        c11018.m27782((CharSequence) (z ? c9161.m23513().toString() : ""));
        c11018.mo24508(29298);
        c11018.writeByte(this.f66567.m26195());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46382(C17367 c17367) {
        byte bByteValue;
        C12318 c12318M30579 = C12318.m30579(c17367);
        if (c12318M30579.f41152) {
            Byte b = c12318M30579.f41151;
            if (b == null) {
                bByteValue = ApplicationC0716.f2992.mo16345((byte) 0, this.f66578 + "_bit");
            } else {
                bByteValue = b.byteValue();
            }
            this.f66567.m26196(bByteValue);
        }
        C16737.m39273(new RunnableC15178(2, this, c12318M30579));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46337(C12318 c12318, Runnable runnable) {
        boolean z = c12318.f41152;
        boolean z2 = c12318.f41150;
        runnable.run();
        m46360();
        int i = 8;
        this.f66582.setVisibility(z ? 0 : 8);
        if (z && z2) {
            i = 0;
        }
        this.f66569.setVisibility(i);
        m46359();
        C9160 c9160 = this.f66563;
        if (z) {
            c9160.m23507(c12318.f41153);
            runnable.run();
        }
        if (z2) {
            this.f66573.m23507(c12318.f41154);
            runnable.run();
            this.f66585.setVisibility(0);
        }
        C6111 c6111 = this.f66562;
        if (z) {
            View view = this.f66580;
            view.setEnabled(false);
            this.f66568.setEnabled(!c6111.m17004());
            if (c9160.m23502() != 0) {
                m46377();
            }
            if (z2 && !c6111.m17004()) {
                view.setEnabled(true);
            }
        } else {
            c6111.m17047();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46374(C12175 c12175, C16551 c16551, C16408 c16408, C15990 c15990) {
        if (this.f66571 || this.f66570) {
            throw new IllegalStateException("Editor helper cannot prepare session state");
        }
        this.f66562.m16872(c12175, this.f66561.m37293(c16551), c16408, c15990);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46373(C12175 c12175, C16551 c16551, C12318 c12318) {
        byte bByteValue;
        C6111 c6111 = this.f66562;
        c6111.m17015();
        if (this.f66571 || this.f66570) {
            throw new IllegalStateException("Editor helper cannot restore session state");
        }
        final InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        Runnable runnable = new Runnable() { // from class: l.֨֫ۖ
            @Override // java.lang.Runnable
            public final void run() {
                C20556.m46343(this.f3394, interfaceC2916M17000);
            }
        };
        this.f66570 = true;
        HandlerC10184 handlerC10184 = this.f66576;
        handlerC10184.removeCallbacksAndMessages(null);
        try {
            boolean zM16896 = c6111.m16896(c12175);
            SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f66561;
            if (!zM16896) {
                c6111.m16871(c12175, sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37293(c16551));
            }
            runnable.run();
            sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37294();
            m46355(this.f66572, c6111);
            if (c12318.f41152) {
                C10327 c10327 = this.f66567;
                Byte b = c12318.f41151;
                if (b == null) {
                    bByteValue = ApplicationC0716.f2992.mo16345((byte) 0, this.f66578 + "_bit");
                } else {
                    bByteValue = b.byteValue();
                }
                c10327.m26196(bByteValue);
            }
            m46337(c12318, runnable);
            handlerC10184.removeCallbacksAndMessages(null);
            this.f66570 = false;
            m46377();
        } catch (Throwable th) {
            handlerC10184.removeCallbacksAndMessages(null);
            this.f66570 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46343(C20556 c20556, InterfaceC2916 interfaceC2916) {
        if (c20556.f66571 || c20556.f66562.m17000() != interfaceC2916) {
            throw new CancellationException("Editor owner changed during restoration");
        }
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo41941(boolean z) {
        View view = this.f66569;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f66585.setVisibility(0);
        this.f66580.setEnabled(true);
        C9160 c9160 = this.f66573;
        c9160.requestFocus();
        c9160.m23515();
        c9160.m23503();
        if (z) {
            C16737.m39290(c9160.m23516());
        }
        return true;
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ */
    public final void mo41933() {
        mo41940(true, false);
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ܰ */
    public final void mo41946() {
        mo41940(false, false);
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ */
    public final void mo41940(boolean z, boolean z2) {
        boolean zM46385 = m46385();
        C10327 c10327 = this.f66567;
        C6111 c6111 = this.f66562;
        if (!zM46385) {
            if (c6111.f20764.mo14804()) {
                return;
            }
            c10327.m26196(ApplicationC0716.f2992.mo16345((byte) 0, this.f66578 + "_bit"));
            m46360();
            this.f66582.setVisibility(0);
            this.f66569.setVisibility(8);
            m46359();
            this.f66585.setVisibility(8);
            this.f66580.setEnabled(false);
            this.f66568.setEnabled(!c6111.m17004());
        }
        C9160 c9160 = this.f66563;
        if (z) {
            c9160.requestFocus();
            C16737.m39290(c9160.m23516());
        }
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        if (i != i2 && !z2) {
            try {
                String string = c6111.m17000().subSequence(i, i2).toString();
                if (c10327.m26212()) {
                    string = C17874.m41459(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c9160.m23507(string);
                if (z) {
                    c9160.m23503();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM46385) {
            c9160.m23515();
            if (z) {
                c9160.m23503();
            }
        } else if (!z2) {
            return;
        }
        if (c9160.m23502() != 0) {
            m46377();
        } else {
            m46352();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m46385() {
        return this.f66582.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46378() {
        m46361();
        C6111 c6111 = this.f66562;
        c6111.m17047();
        this.f66567.m26207();
        View view = this.f66582;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m46359();
            this.f66563.m23519();
        }
        View view2 = this.f66569;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f66573.m23519();
        }
        if (f66558) {
            this.f66565.setVisibility(8);
            TextView textView = this.f66560;
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        this.f66585.setVisibility(8);
        c6111.requestFocus();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46377() {
        m46361();
        this.f66576.removeMessages(0);
        m46358();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m46358() {
        if (this.f66571 || this.f66570 || !m46385()) {
            return;
        }
        this.f66567.m26204(this.f66563.m23513().toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m46359() {
        View view = this.f66582;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        AbstractActivityC12483 abstractActivityC12483 = this.f66564;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            abstractActivityC12483.getWindow().setNavigationBarColor(C20368.f66004);
        } else {
            abstractActivityC12483.getWindow().setNavigationBarColor(this.f66562.f20794.f6403);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46372(C11018 c11018) {
        this.f66561.m37298(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46375(C17367 c17367) {
        this.f66561.m37299(c17367);
        m46355(this.f66572, this.f66562);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46370(String str, boolean z) {
        this.f66561.m37297(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46368(Class cls) {
        this.f66561.m37295(cls);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46365() {
        this.f66571 = true;
        m46361();
        this.f66567.m26207();
        this.f66576.removeCallbacksAndMessages(null);
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f66561;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.getClass();
        try {
            C16737.f53615.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC15618);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m46379() {
        return this.f66561.m37304();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46380(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f66561;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37306(str);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37290() || SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37286()) {
            this.f66562.m16857(str, true);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m46386() {
        this.f66561.m37302();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m46376() {
        return this.f66561.m37301();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m46364() {
        C9973 c9973 = new C9973(this, this.f66564);
        c9973.m40376(R.string.MT_Protector);
        c9973.m40350(2);
        c9973.m40367("1…" + this.f66562.m16948());
        c9973.m40340();
        c9973.m40336(2);
        c9973.m40368(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m46383(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C6111 c6111 = this.f66562;
        if (itemId == R.id.MT_Protector) {
            c6111.m17039();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111.m16966();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111.m16821();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111.m16967();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo41933();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m46364();
            return true;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f66564;
        if (itemId == R.id.MT_Protector) {
            final String[] strArr = (String[]) C12859.m31904().toArray(new String[0]);
            final int iIndexOf = C12859.m31904().indexOf(this.f66561.m37301());
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21266(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.ۘ֫ۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C20556.m46339(this.f13302, iIndexOf, strArr, dialogInterface, i);
                }
            });
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ֫ۖ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20556.m46338(this.f21796);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m46368(ActivityC14081.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m46366();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111.m16937(!c6111.m16999());
            menuItem.setChecked(c6111.m16999());
            if (c6111.m16999()) {
                DialogInterfaceOnClickListenerC14147.m34220(R.string.MT_Protector, abstractActivityC12483, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m46336(menuItem, c6111);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C14894)) {
            return false;
        }
        ((C14894) title).m35599().mo20677(c6111);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46336(MenuItem menuItem, C6111 c6111) {
        int i;
        int i2;
        MenuItem menuItemAdd;
        boolean z = (c6111.m16973() || c6111.m17004()) ? false : true;
        boolean z2 = c6111.m16842() == 0;
        int iM16916 = c6111.m16916();
        int iM17020 = c6111.m17020();
        if (iM16916 > iM17020) {
            i2 = iM16916;
            i = iM17020;
        } else {
            i = iM16916;
            i2 = iM17020;
        }
        SubMenu subMenu = menuItem.getSubMenu();
        subMenu.clear();
        List<AbstractC21243> listM43950 = C19127.m43950();
        Map mapM43945 = C19127.m43945();
        SubMenu subMenu2 = null;
        for (AbstractC21243 abstractC21243 : listM43950) {
            Integer num = (Integer) mapM43945.get(abstractC21243.mo20676());
            if (num != null && abstractC21243.mo20678(c6111, z, z2, i, i2)) {
                if (num.intValue() >= 300) {
                    if (subMenu2 == null) {
                        SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, 0, 65535, R.string.MT_Protector);
                        subMenuAddSubMenu.setIcon(R.drawable.MT_Protector);
                        subMenu2 = subMenuAddSubMenu;
                    }
                    menuItemAdd = subMenu2.add(0, 0, num.intValue(), abstractC21243.mo20679());
                } else {
                    menuItemAdd = subMenu.add(0, 0, num.intValue(), abstractC21243.mo20679());
                }
                menuItemAdd.setIcon(abstractC21243.mo20675(c6111.getContext()));
            }
        }
    }
}
