package l;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11220 extends AbstractActivityC12483 implements InterfaceC23215 {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37969 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C19107 f37970;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C9101 f37971;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C6280 f37972;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC19432 f37973 = new C17569(this);

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC15454 f37974;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C17485 f37975;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ScriptExecutor";
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9927() {
        SharedPreferences sharedPreferences = ApplicationC0716.f2988;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC20745 abstractC20745M15313;
        this.f41637 = false;
        setTheme(C2666.m8210());
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f37972 = (C6280) new C16717(this).m39205(C6280.class);
        boolean zM38190 = C16135.m38190(this);
        C14043.f46170 = zM38190;
        ViewOnLayoutChangeListenerC3333.m9913(this, zM38190);
        C4995 c4995 = this.f37972.f21274;
        if (c4995 != null && c4995.m13834() != null) {
            this.f37972.f21274.m13834().f19121.m29725();
        }
        this.f37974 = new ViewOnClickListenerC15454(this, this);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText("Im");
        try {
            abstractC20745M15313 = C5553.m15309(getIntent());
        } catch (NullPointerException unused) {
            String stringExtra = getIntent().getStringExtra(MotionUtils.EASING_TYPE_PATH);
            if (stringExtra != null) {
                abstractC20745M15313 = C5553.m15313(stringExtra, new String[0]);
            } else {
                finish();
                return;
            }
        }
        this.f37971 = C7689.m20320(this, new C8398(this, abstractC20745M15313));
        this.f37970 = (C19107) m31016(R.id.MT_Protector);
        m28182();
        this.f37970.m43904(new C0635(this));
        m28178(abstractC20745M15313);
        getOnBackPressedDispatcher().m34908(this, this.f37973);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28177(ActivityC11220 activityC11220, AbstractC20745 abstractC20745) {
        activityC11220.m28182();
        AbstractC17129 abstractC17129M25488 = activityC11220.m25488();
        SharedPreferences sharedPreferences = ApplicationC0716.f2988;
        abstractC17129M25488.mo23537((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
        if (activityC11220.f37972.f21275) {
            activityC11220.m28178(abstractC20745);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28182() {
        int i;
        C19107 c19107 = this.f37970;
        try {
            i = Integer.parseInt(ApplicationC0716.f2988.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        c19107.m43900(i);
        this.f37970.m43901(C22509.m50031());
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        C6280 c6280 = this.f37972;
        if (c6280 != null) {
            c6280.f21277 = false;
            c6280.f21273++;
        }
        C17485 c17485 = this.f37975;
        if (c17485 != null) {
            c17485.m40694();
            this.f37975 = null;
        }
        super.onDestroy();
        C16737.m39267(500L, new RunnableC10515());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28178(final AbstractC20745 abstractC20745) {
        final Intent intent = getIntent();
        if (this.f37972.f21274 == null && "bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
            C6280 c6280 = this.f37972;
            if (c6280.f21277) {
                return;
            }
            c6280.f21277 = true;
            final int i = c6280.f21273 + 1;
            c6280.f21273 = i;
            C17485 c17485 = this.f37975;
            if (c17485 != null) {
                c17485.m40694();
            }
            C17485 c17486 = new C17485(this, R.string.MT_Protector);
            c17486.m40701(500);
            this.f37975 = c17486;
            final Context applicationContext = getApplicationContext();
            C4716.f16636.execute(new Runnable() { // from class: l.᩷᩶ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean zM24938;
                    Context context = applicationContext;
                    final Intent intent2 = intent;
                    int i2 = ActivityC11220.f37969;
                    try {
                        zM24938 = ActivityC9830.m24938(context, intent2);
                    } catch (Exception unused) {
                        zM24938 = false;
                    }
                    final ActivityC11220 activityC11220 = this.f68729;
                    final int i3 = i;
                    final AbstractC20745 abstractC20746 = abstractC20745;
                    C16737.m39273(new Runnable() { // from class: l.ܺ᩶ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC11220.m28175(activityC11220, i3, zM24938, abstractC20746, intent2);
                        }
                    });
                }
            });
            return;
        }
        m28179(abstractC20745, intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28175(ActivityC11220 activityC11220, int i, boolean z, AbstractC20745 abstractC20745, Intent intent) {
        C6280 c6280 = activityC11220.f37972;
        if (i != c6280.f21273) {
            return;
        }
        c6280.f21277 = false;
        C17485 c17485 = activityC11220.f37975;
        if (c17485 != null) {
            c17485.m40694();
            activityC11220.f37975 = null;
        }
        if (activityC11220.isFinishing() || activityC11220.isDestroyed()) {
            return;
        }
        if (!z) {
            C15829.m37618(R.string.MT_Protector);
            activityC11220.finish();
        } else {
            activityC11220.m28179(abstractC20745, intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28179(AbstractC20745 abstractC20745, Intent intent) {
        boolean booleanExtra;
        boolean z;
        C4995 c4995 = this.f37972.f21274;
        if (c4995 == null) {
            boolean z2 = false;
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
                booleanExtra = intent.getBooleanExtra("ewrp", false);
                z = !intent.getBooleanExtra("ewse", true);
                this.f37972.f21276 = intent.getBooleanExtra("eae", false);
            } else {
                booleanExtra = ApplicationC0716.f2992.getBoolean("ewrp", false);
                z = !ApplicationC0716.f2992.getBoolean("ewse", true);
                this.f37972.f21276 = false;
            }
            if (z && C4744.m13121() == null) {
                C8067 c8067BuildDialog = buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13249(2, this));
                c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2148(3, this));
                c8067BuildDialog.m21265(false);
                c8067BuildDialog.m21269();
                return;
            }
            String strM46737 = abstractC20745.m46737();
            String strMo33986 = abstractC20745.mo33986();
            try {
                InputStream inputStreamMo33970 = abstractC20745.mo33970();
                try {
                    int i = inputStreamMo33970.read();
                    int i2 = inputStreamMo33970.read();
                    int i3 = inputStreamMo33970.read();
                    int i4 = inputStreamMo33970.read();
                    if ((i | i2 | i3 | i4) < 0) {
                        inputStreamMo33970.close();
                    } else {
                        boolean z3 = (i & 255) == 127 && (i2 & 255) == 69 && (i3 & 255) == 76 && (i4 & 255) == 70;
                        inputStreamMo33970.close();
                        z2 = z3;
                    }
                } catch (Throwable th) {
                    if (inputStreamMo33970 != null) {
                        try {
                            inputStreamMo33970.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
            StringBuilder sb = new StringBuilder("cd ");
            sb.append(C6696.m18085(strM46737));
            sb.append(" || exit $?; trap '' INT; (trap - INT; exec ");
            if (z2) {
                sb.append(C6696.m18085(strMo33986));
            } else {
                sb.append("sh ");
                sb.append(C6696.m18085(strMo33986));
            }
            sb.append("); _mt_status=$?; exit $_mt_status\r");
            String string = sb.toString();
            this.f37972.f21274 = C19562.m44662(null, booleanExtra, !z);
            this.f37970.m43903(this.f37972.f21274);
            C16737.m39273(new RunnableC16864(this, string));
        } else {
            this.f37970.m43903(c4995);
        }
        C6280 c6280 = this.f37972;
        if (c6280.f21276) {
            c6280.f21274.m13845().m44959(this, new InterfaceC10597() { // from class: l.۟᩶ۜ
                @Override // l.InterfaceC10597
                /* JADX INFO: renamed from: ۙ */
                public final void mo1473(Object obj) {
                    int i5 = ActivityC11220.f37969;
                    if (((Boolean) obj).booleanValue()) {
                        return;
                    }
                    this.f25476.finish();
                }
            });
        }
        C9186 c9186M13845 = this.f37972.f21274.m13845();
        AbstractC19432 abstractC19432 = this.f37973;
        C13638.requireNonNull(abstractC19432);
        c9186M13845.m44959(this, new C15305(2, abstractC19432));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28174(ActivityC11220 activityC11220) {
        activityC11220.f37972.f21275 = true;
        Intent intent = new Intent(activityC11220, (Class<?>) ActivityC18275.class);
        intent.putExtra("scriptSettings", true);
        activityC11220.f37971.m23450(intent);
    }

    @Override // l.InterfaceC23215
    /* JADX INFO: renamed from: ۙ */
    public final void mo9926(View view) {
        boolean z = false;
        C16195 c16195 = new C16195(this, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        MenuItem icon = c12418M38298.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector);
        C4995 c4995 = this.f37972.f21274;
        if (c4995 != null && c4995.m13847() && this.f37970.m43905()) {
            z = true;
        }
        icon.setEnabled(z);
        c16195.m38296(new C18280(10, this));
        c12418M38298.setOptionalIconsVisible(true);
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28176(ActivityC11220 activityC11220, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            activityC11220.f37970.m43907();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC11220.f37972.f21275 = false;
            Intent intent = new Intent(activityC11220, (Class<?>) ActivityC18275.class);
            intent.putExtra("scriptSettings", true);
            activityC11220.f37971.m23450(intent);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC11220.f37972.f21274.m13849();
            activityC11220.finish();
        }
    }

    @Override // l.InterfaceC23215
    /* JADX INFO: renamed from: ᩹ */
    public final void mo9928() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
