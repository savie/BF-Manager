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

/* JADX INFO: renamed from: l.ᩳۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18002 implements InterfaceC19851 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public MenuItem f57565;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC15618 f57566;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6111 f57567;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9160 f57568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC4471 f57569;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6111 f57570;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17667 f57571;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HandlerC10184 f57572 = new HandlerC10184(this, new C12278(4));

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f57573;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10327 f57574;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f57575;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3040 f57576;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9160 f57577;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21530 f57578;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f57579;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f57580;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f57581;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View f57582;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C10327 f57583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17667 f57584;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f57585;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17667 f57586;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC15618 f57587;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17667 f57588;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41918(C18002 c18002) {
        c18002.getClass();
        ActivityC4471 activityC4471 = c18002.f57569;
        activityC4471.startActivity(new Intent(activityC4471, (Class<?>) ActivityC1919.class));
    }

    public C18002(ActivityC4471 activityC4471, C3040 c3040, InterfaceC21530 interfaceC21530) {
        this.f57569 = activityC4471;
        this.f57576 = c3040;
        C6111 c6111M9091 = c3040.m9091();
        this.f57567 = c6111M9091;
        C6111 c6111M9117 = c3040.m9117();
        this.f57570 = c6111M9117;
        this.f57579 = TextBundle.TEXT_ENTRY;
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = new SharedPreferencesOnSharedPreferenceChangeListenerC15618(activityC4471, c6111M9091);
        this.f57587 = sharedPreferencesOnSharedPreferenceChangeListenerC15618;
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15619 = new SharedPreferencesOnSharedPreferenceChangeListenerC15618(activityC4471, c6111M9117);
        this.f57566 = sharedPreferencesOnSharedPreferenceChangeListenerC15619;
        this.f57578 = interfaceC21530;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37305();
        sharedPreferencesOnSharedPreferenceChangeListenerC15619.m37305();
        View viewMo25319 = interfaceC21530.mo25319();
        this.f57575 = viewMo25319;
        this.f57573 = viewMo25319.findViewById(R.id.MT_Protector);
        this.f57582 = viewMo25319.findViewById(R.id.MT_Protector);
        this.f57581 = viewMo25319.findViewById(R.id.MT_Protector);
        C9160 c9160 = (C9160) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57568 = c9160;
        C9160 c9161 = (C9160) viewMo25319.findViewById(R.id.edtReplaceWord);
        this.f57577 = c9161;
        this.f57586 = (C17667) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57571 = (C17667) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57584 = (C17667) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57588 = (C17667) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57580 = (TextView) viewMo25319.findViewById(R.id.MT_Protector);
        this.f57585 = (TextView) viewMo25319.findViewById(R.id.MT_Protector);
        ((ViewGroup) viewMo25319).removeView(viewMo25319.findViewById(R.id.MT_Protector));
        c9160.m23508("text_s", (String) null);
        c9161.m23508("text_r", (String) null);
        this.f57583 = new C10327(activityC4471, c6111M9091);
        this.f57574 = new C10327(activityC4471, c6111M9117);
        final C20205 c20205 = new C20205((TextView) viewMo25319.findViewById(R.id.MT_Protector));
        int i = 0;
        while (i < 2) {
            (i == 0 ? this.f57583 : this.f57574).m26199(new C6713(this, c20205));
            i++;
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۨۧۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18002.m41919(this.f39177, view);
            }
        };
        InterfaceC12729 interfaceC12729 = new InterfaceC12729() { // from class: l.ۖۧۖ
            @Override // l.InterfaceC12729
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo7609(C17667 c17667, boolean z, boolean z2) {
                C18002.m41921(this.f9842, c20205, c17667, z, z2);
            }
        };
        this.f57586.m41145(interfaceC12729);
        this.f57571.m41145(interfaceC12729);
        this.f57584.m41145(interfaceC12729);
        this.f57588.m41145(interfaceC12729);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i2 = 0; i2 < 5; i2++) {
            View viewFindViewById = viewMo25319.findViewById(iArr[i2]);
            C0674.m3027(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f57568.m23506(new C22942(this));
        c6111M9091.m16855(new RunnableC5302(0, this));
        c6111M9117.m16855(new RunnableC5302(0, this));
        c6111M9091.m16864(new InterfaceC7191() { // from class: l.᩹ۧۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i3, int i4) {
                this.f72697.m41951();
            }
        });
        c6111M9117.m16864(new InterfaceC7191() { // from class: l.֨ۧۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo4041(int i3, int i4) {
                this.f4917.m41951();
            }
        });
        this.f57567.m16881(this);
        this.f57570.m16881(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41937(InterfaceC1423 interfaceC1423, C16839 c16839, Class cls) {
        c16839.m39493(interfaceC1423, new C3890(this), this.f57568.m23516(), this.f57577.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41936(String str, String str2) {
        this.f57587.m37296(str);
        this.f57566.m37296(str2);
        C20556.m46355(this.f57565, this.f57567);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m41942() {
        return this.f57587.m37301();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m41950() {
        return this.f57566.m37301();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41934(MenuItem menuItem) {
        this.f57565 = menuItem;
        C20556.m46355(menuItem, this.f57567);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m41932() {
        MenuItem menuItem = this.f57565;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f57565.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f57587;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37300(zIsChecked);
        boolean zIsChecked2 = this.f57565.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15619 = this.f57566;
        sharedPreferencesOnSharedPreferenceChangeListenerC15619.m37300(zIsChecked2);
        C0135 c0135M37303 = sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37303();
        C0135 c0135M37304 = sharedPreferencesOnSharedPreferenceChangeListenerC15619.m37303();
        RunnableC6858 runnableC6858 = new RunnableC6858(this, new AtomicInteger(2), 1);
        this.f57567.m16860(c0135M37303, runnableC6858);
        this.f57570.m16860(c0135M37304, runnableC6858);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41924(C18002 c18002) {
        C6111 c6111 = c18002.f57567;
        c6111.scrollTo(0, c6111.m17066());
        C6111 c6112 = c18002.f57570;
        c6112.scrollTo(0, c6112.m17066());
        c6111.invalidate();
        c6112.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41920(C18002 c18002, PatternSyntaxException patternSyntaxException) {
        C8067 c8067BuildDialog = c18002.f57569.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C14690.m35217(patternSyntaxException));
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41919(C18002 c18002, View view) {
        C9160 c9160 = c18002.f57577;
        C9160 c9161 = c18002.f57568;
        C10327 c10327 = c18002.f57576.m9122() ? c18002.f57583 : c18002.f57574;
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
            if (c18002.mo41941(false)) {
                return;
            }
            c10327.m26198(c9161.m23513().toString(), c9160.m23513().toString());
        } else if (id == R.id.MT_Protector) {
            c10327.m26210(c9161.m23513().toString(), c9160.m23513().toString());
        } else if (id == R.id.MT_Protector) {
            c18002.m41944();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41921(C18002 c18002, C20205 c20205, C17667 c17667, boolean z, boolean z2) {
        String str = c18002.f57579;
        C10327 c10327 = c18002.f57574;
        C10327 c10328 = c18002.f57583;
        int id = c17667.getId();
        if (id == R.id.MT_Protector) {
            c10328.m26193(z);
            c10327.m26193(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10328.m26195(), C15489.m37076(str, "_bit")).apply();
            c18002.m41943();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10328.m26202(z);
            c10327.m26202(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10328.m26195(), C15489.m37076(str, "_bit")).apply();
            c18002.m41943();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10328.m26201(z);
            c10327.m26201(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10328.m26195(), C15489.m37076(str, "_bit")).apply();
            c18002.m41943();
            return;
        }
        if (id == R.id.MT_Protector) {
            c10328.m26211(z);
            c10327.m26211(z);
            if (z2) {
                c20205.m45661(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC0716.f2992.edit().mo4064(c10328.m26195(), C15489.m37076(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m41927() {
        C10327 c10327 = this.f57583;
        this.f57586.m41146(c10327.m26212(), false);
        this.f57571.m41146(c10327.m26206(), false);
        this.f57584.m41146(c10327.m26192(), false);
        this.f57588.m41146(c10327.m26194(), false);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m41951() {
        if (m41930()) {
            int iM23502 = this.f57568.m23502();
            TextView textView = this.f57580;
            TextView textView2 = this.f57585;
            if (iM23502 != 0) {
                C6111 c6111M9095 = this.f57576.m9095();
                C12880 c12880 = c6111M9095.f20825;
                int[] iArrM16971 = c6111M9095.m16971();
                C11469 c11469M31932 = c12880.m31932(c6111M9095.getContext(), iArrM16971[0], iArrM16971[1]);
                if (c11469M31932.m28659()) {
                    textView.setTextColor(C20368.f66009);
                    textView2.setTextColor(C20368.f66009);
                } else if (c11469M31932.m28658()) {
                    textView.setTextColor(C20368.f65998);
                    textView2.setTextColor(C20368.f65998);
                } else {
                    textView.setTextColor(C20368.f65976);
                    textView2.setTextColor(C20368.f65976);
                }
                String strM28660 = c11469M31932.m28660();
                if (TextUtils.equals(strM28660, textView2.getText())) {
                    return;
                }
                textView2.setText(strM28660);
                return;
            }
            if (!TextUtils.equals("0", textView2.getText())) {
                textView2.setText("0");
            }
            textView.setTextColor(C20368.f66009);
            textView2.setTextColor(C20368.f66009);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41947(C11018 c11018) {
        boolean z = false;
        boolean z2 = this.f57575.getVisibility() == 0;
        if (z2 && this.f57573.getVisibility() == 0) {
            z = true;
        }
        C9160 c9160 = this.f57568;
        if (z2) {
            c9160.m23519();
        }
        C9160 c9161 = this.f57577;
        if (z) {
            c9161.m23519();
        }
        c11018.m27784(z2);
        c11018.m27784(z);
        c11018.m27782((CharSequence) (z2 ? c9160.m23513().toString() : ""));
        c11018.m27782((CharSequence) (z ? c9161.m23513().toString() : ""));
        c11018.writeByte(this.f57583.m26195());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41948(C17367 c17367) {
        final boolean zM40461 = c17367.m40461();
        final boolean zM40462 = c17367.m40461();
        final String strM40442 = c17367.m40442();
        final String strM40443 = c17367.m40442();
        byte b = c17367.readByte();
        if (zM40461) {
            this.f57583.m26196(b);
            this.f57574.m26196(b);
        }
        C16737.m39273(new Runnable() { // from class: l.۬ۧۖ
            @Override // java.lang.Runnable
            public final void run() {
                C18002.m41922(this.f43554, zM40461, zM40462, strM40442, strM40443);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41922(C18002 c18002, boolean z, boolean z2, String str, String str2) {
        C6111 c6111 = c18002.f57567;
        View view = c18002.f57582;
        C9160 c9160 = c18002.f57568;
        c18002.m41927();
        int i = 8;
        c18002.f57575.setVisibility(z ? 0 : 8);
        View view2 = c18002.f57573;
        if (z && z2) {
            i = 0;
        }
        view2.setVisibility(i);
        c18002.m41928();
        c18002.f57578.mo25320();
        if (z) {
            c9160.m23507(str);
        }
        if (z2) {
            c18002.f57577.m23507(str2);
            c18002.f57588.setVisibility(0);
        }
        if (z) {
            view.setAlpha(0.26f);
            view.setEnabled(false);
            View view3 = c18002.f57581;
            if (c6111.m17004()) {
                view3.setAlpha(0.26f);
                view3.setEnabled(false);
            } else {
                view3.setAlpha(1.0f);
                view3.setEnabled(true);
            }
            if (c9160.m23502() != 0) {
                c18002.m41943();
            }
            if (!z2 || c6111.m17004()) {
                return;
            }
            view.setAlpha(1.0f);
            view.setEnabled(true);
        }
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo41941(boolean z) {
        View view = this.f57573;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f57588.setVisibility(0);
        View view2 = this.f57582;
        view2.setAlpha(1.0f);
        view2.setEnabled(true);
        C9160 c9160 = this.f57577;
        c9160.requestFocus();
        c9160.m23515();
        c9160.m23503();
        if (z) {
            C16737.m39290(c9160.m23516());
        }
        return true;
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo41933() {
        mo41940(true, false);
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo41946() {
        mo41940(false, false);
    }

    @Override // l.InterfaceC19851
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo41940(boolean z, boolean z2) {
        boolean zM41930 = m41930();
        C6111 c6111M9095 = this.f57576.m9095();
        C10327 c10327 = this.f57583;
        if (!zM41930) {
            if (this.f57567.f20764.mo14804() || this.f57570.f20764.mo14804()) {
                return;
            }
            byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, this.f57579 + "_bit");
            c10327.m26196(bMo16345);
            this.f57574.m26196(bMo16345);
            m41927();
            this.f57575.setVisibility(0);
            this.f57573.setVisibility(8);
            m41928();
            this.f57588.setVisibility(8);
            this.f57578.mo25320();
            View view = this.f57582;
            view.setAlpha(0.26f);
            view.setEnabled(false);
            boolean zM17004 = c6111M9095.m17004();
            View view2 = this.f57581;
            if (zM17004) {
                view2.setAlpha(0.26f);
                view2.setEnabled(false);
            } else {
                view2.setAlpha(1.0f);
                view2.setEnabled(true);
            }
        }
        C9160 c9160 = this.f57568;
        if (z) {
            c9160.requestFocus();
            C16737.m39290(c9160.m23516());
        }
        int[] iArrM16971 = c6111M9095.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        if (i != i2 && !z2) {
            try {
                String string = c6111M9095.m17000().subSequence(i, i2).toString();
                if (c10327.m26212()) {
                    string = C17874.m41459(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c9160.m23507(string);
                if (z) {
                    c9160.m23503();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM41930) {
            c9160.m23515();
            if (z) {
                c9160.m23503();
            }
        } else if (!z2) {
            return;
        }
        if (c9160.m23502() != 0) {
            m41943();
        } else {
            m41951();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m41930() {
        return this.f57575.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41944() {
        this.f57583.m26207();
        this.f57574.m26207();
        View view = this.f57575;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m41928();
            this.f57568.m23519();
            this.f57578.mo25320();
        }
        View view2 = this.f57573;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f57577.m23519();
        }
        this.f57588.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m41943() {
        this.f57572.removeMessages(0);
        m41926();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m41926() {
        if (m41930()) {
            C9160 c9160 = this.f57568;
            this.f57583.m26204(c9160.m23513().toString());
            this.f57574.m26204(c9160.m23513().toString());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m41928() {
        View view = this.f57575;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        ActivityC4471 activityC4471 = this.f57569;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            activityC4471.getWindow().setNavigationBarColor(C20368.f66004);
        } else {
            activityC4471.getWindow().setNavigationBarColor(this.f57576.m9091().f20794.f6403);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41938(C11018 c11018) {
        this.f57587.m37298(c11018);
        this.f57566.m37298(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41939(C17367 c17367) {
        this.f57587.m37299(c17367);
        this.f57566.m37299(c17367);
        C20556.m46355(this.f57565, this.f57567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41935(Class cls) {
        this.f57587.m37292();
        this.f57566.m37295(cls);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41931() {
        this.f57572.removeCallbacksAndMessages(null);
        this.f57583.m26207();
        this.f57574.m26207();
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618 = this.f57587;
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.getClass();
        try {
            C16737.f53615.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC15618);
        } catch (Exception unused) {
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15619 = this.f57566;
        sharedPreferencesOnSharedPreferenceChangeListenerC15619.getClass();
        try {
            C16737.f53615.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC15619);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m41945() {
        return this.f57587.m37304() | this.f57566.m37304();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41949(MenuItem menuItem) {
        final SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618;
        final SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15619;
        final C6111 c6111;
        final C6111 c6112;
        C3040 c3040 = this.f57576;
        C6111 c6111M9095 = c3040.m9095();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            c6111M9095.m17039();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111M9095.m16966();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111M9095.m16821();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c6111M9095.m16967();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo41933();
            return true;
        }
        ActivityC4471 activityC4471 = this.f57569;
        if (itemId == R.id.MT_Protector) {
            C6111 c6111M9096 = c3040.m9095();
            C15181 c15181 = new C15181(activityC4471, c6111M9096);
            c15181.m40376(R.string.MT_Protector);
            c15181.m40350(2);
            c15181.m40367("1…" + c6111M9096.m16948());
            c15181.m40340();
            c15181.m40336(2);
            c15181.m40368(true);
            return true;
        }
        C6111 c6113 = this.f57570;
        C6111 c6114 = this.f57567;
        if (itemId == R.id.MT_Protector) {
            boolean zM9122 = c3040.m9122();
            SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC156110 = this.f57566;
            SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC156111 = this.f57587;
            if (zM9122) {
                sharedPreferencesOnSharedPreferenceChangeListenerC15619 = sharedPreferencesOnSharedPreferenceChangeListenerC156110;
                sharedPreferencesOnSharedPreferenceChangeListenerC15618 = sharedPreferencesOnSharedPreferenceChangeListenerC156111;
                c6112 = c6113;
                c6111 = c6114;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC15618 = sharedPreferencesOnSharedPreferenceChangeListenerC156110;
                sharedPreferencesOnSharedPreferenceChangeListenerC15619 = sharedPreferencesOnSharedPreferenceChangeListenerC156111;
                c6111 = c6113;
                c6112 = c6114;
            }
            final boolean zEquals = sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37301().equals(sharedPreferencesOnSharedPreferenceChangeListenerC15619.m37301());
            final String[] strArr = (String[]) C12859.m31904().toArray(new String[0]);
            final int iIndexOf = C12859.m31904().indexOf(sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37301());
            C8067 c8067BuildDialog = activityC4471.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21266(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.ۙۧۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (iIndexOf != i) {
                        String str = strArr[i];
                        sharedPreferencesOnSharedPreferenceChangeListenerC15618.m37306(str);
                        boolean zM37286 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37286();
                        C6111 c6115 = c6111;
                        if (zM37286) {
                            c6115.m16857(str, true);
                        }
                        c6115.m16990(str);
                        if (zEquals) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC15619.m37306(str);
                            boolean zM37287 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37286();
                            C6111 c6116 = c6112;
                            if (zM37287) {
                                c6116.m16857(str, true);
                            }
                            c6116.m16990(str);
                        }
                    }
                    dialogInterface.dismiss();
                }
            });
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۧۖ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18002.m41918(this.f45389);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m41935(ActivityC21405.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m41932();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean zM16999 = c6114.m16999();
            boolean z = !zM16999;
            c6114.m16937(z);
            c6113.m16937(z);
            menuItem.setChecked(z);
            if (!zM16999) {
                DialogInterfaceOnClickListenerC14147.m34220(R.string.MT_Protector, activityC4471, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C20556.m46336(menuItem, c6111M9095);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C14894)) {
            return false;
        }
        ((C14894) title).m35599().mo20677(c6111M9095);
        return true;
    }
}
