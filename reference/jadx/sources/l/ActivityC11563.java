package l;

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

/* JADX INFO: renamed from: l.ۧۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11563 extends AbstractActivityC17204 implements InterfaceC9654 {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36350 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C1869 f36351;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC2943 f36352;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C8580 f36353;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C13511 f36354;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC6323 f36355 = new C5598(this);

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C3347 f36356;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ScriptExecutor";
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ۛ */
    public final int mo18669() {
        SharedPreferences sharedPreferences = ApplicationC17729.f58262;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC22044 abstractC22044M35193;
        this.f56044 = false;
        setTheme(C7207.m19791());
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        this.f36351 = (C1869) new C16196(this).m38422(C1869.class);
        boolean zM52629 = C23434.m52629(this);
        C4435.f15888 = zM52629;
        ViewOnLayoutChangeListenerC6673.m18653(this, zM52629);
        C24244 c24244 = this.f36351.f6297;
        if (c24244 != null && c24244.m54258() != null) {
            this.f36351.f6297.m54258().f60472.m35812();
        }
        this.f36352 = new ViewOnClickListenerC2943(this, this);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText("Im");
        try {
            abstractC22044M35193 = C14584.m35190(getIntent());
        } catch (NullPointerException unused) {
            String stringExtra = getIntent().getStringExtra(MotionUtils.EASING_TYPE_PATH);
            if (stringExtra != null) {
                abstractC22044M35193 = C14584.m35193(stringExtra, new String[0]);
            } else {
                finish();
                return;
            }
        }
        this.f36356 = C12296.m30693(this, new C2502(this, abstractC22044M35193));
        this.f36353 = (C8580) m40418(R.id.MT_Protector);
        m29093();
        this.f36353.m23061(new C19768(this));
        m29089(abstractC22044M35193);
        getOnBackPressedDispatcher().m19403(this, this.f36355);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29088(ActivityC11563 activityC11563, AbstractC22044 abstractC22044) {
        activityC11563.m29093();
        AbstractC1365 abstractC1365M13854 = activityC11563.m13854();
        SharedPreferences sharedPreferences = ApplicationC17729.f58262;
        abstractC1365M13854.mo5049((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
        if (activityC11563.f36351.f6296) {
            activityC11563.m29089(abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m29093() {
        int i;
        C8580 c8580 = this.f36353;
        try {
            i = Integer.parseInt(ApplicationC17729.f58262.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        c8580.m23058(i);
        this.f36353.m23059(C0706.m3027());
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        C1869 c1869 = this.f36351;
        if (c1869 != null) {
            c1869.f6294 = false;
            c1869.f6295++;
        }
        C13511 c13511 = this.f36354;
        if (c13511 != null) {
            c13511.m33185();
            this.f36354 = null;
        }
        super.onDestroy();
        C21576.m49062(500L, new RunnableC22951(3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29089(AbstractC22044 abstractC22044) {
        Intent intent = getIntent();
        if (this.f36351.f6297 == null && "bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
            C1869 c1869 = this.f36351;
            if (c1869.f6294) {
                return;
            }
            c1869.f6294 = true;
            int i = c1869.f6295 + 1;
            c1869.f6295 = i;
            C13511 c13511 = this.f36354;
            if (c13511 != null) {
                c13511.m33185();
            }
            C13511 c13512 = new C13511(this, R.string.MT_Protector);
            c13512.m33191(500);
            this.f36354 = c13512;
            C5261.f18540.execute(new RunnableC22506(this, getApplicationContext(), intent, i, abstractC22044));
            return;
        }
        m29090(abstractC22044, intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29086(ActivityC11563 activityC11563, int i, boolean z, AbstractC22044 abstractC22044, Intent intent) {
        C1869 c1869 = activityC11563.f36351;
        if (i != c1869.f6295) {
            return;
        }
        c1869.f6294 = false;
        C13511 c13511 = activityC11563.f36354;
        if (c13511 != null) {
            c13511.m33185();
            activityC11563.f36354 = null;
        }
        if (activityC11563.isFinishing() || activityC11563.isDestroyed()) {
            return;
        }
        if (!z) {
            C22673.m51159(R.string.MT_Protector);
            activityC11563.finish();
        } else {
            activityC11563.m29090(abstractC22044, intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29090(AbstractC22044 abstractC22044, Intent intent) {
        boolean booleanExtra;
        boolean z;
        C24244 c24244 = this.f36351.f6297;
        if (c24244 == null) {
            boolean z2 = false;
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
                booleanExtra = intent.getBooleanExtra("ewrp", false);
                z = !intent.getBooleanExtra("ewse", true);
                this.f36351.f6298 = intent.getBooleanExtra("eae", false);
            } else {
                booleanExtra = ApplicationC17729.f58258.getBoolean("ewrp", false);
                z = !ApplicationC17729.f58258.getBoolean("ewse", true);
                this.f36351.f6298 = false;
            }
            if (z && C20340.m46731() == null) {
                C2361 c2361BuildDialog = buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21760(3, this));
                c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11332(this, 2));
                c2361BuildDialog.m8012(false);
                c2361BuildDialog.m8016();
                return;
            }
            String strM49881 = abstractC22044.m49881();
            String strMo4294 = abstractC22044.mo4294();
            try {
                InputStream inputStreamMo4290 = abstractC22044.mo4290();
                try {
                    int i = inputStreamMo4290.read();
                    int i2 = inputStreamMo4290.read();
                    int i3 = inputStreamMo4290.read();
                    int i4 = inputStreamMo4290.read();
                    if ((i | i2 | i3 | i4) < 0) {
                        inputStreamMo4290.close();
                    } else {
                        boolean z3 = (i & 255) == 127 && (i2 & 255) == 69 && (i3 & 255) == 76 && (i4 & 255) == 70;
                        inputStreamMo4290.close();
                        z2 = z3;
                    }
                } catch (Throwable th) {
                    if (inputStreamMo4290 != null) {
                        try {
                            inputStreamMo4290.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
            StringBuilder sb = new StringBuilder("cd ");
            sb.append(C7756.m21098(strM49881));
            sb.append(" || exit $?; trap '' INT; (trap - INT; exec ");
            if (z2) {
                sb.append(C7756.m21098(strMo4294));
            } else {
                sb.append("sh ");
                sb.append(C7756.m21098(strMo4294));
            }
            sb.append("); _mt_status=$?; exit $_mt_status\r");
            String string = sb.toString();
            this.f36351.f6297 = C8406.m22582(null, booleanExtra, !z);
            this.f36353.m23062(this.f36351.f6297);
            C21576.m49068(new RunnableC15292(this, string));
        } else {
            this.f36353.m23062(c24244);
        }
        C1869 c1869 = this.f36351;
        if (c1869.f6298) {
            c1869.f6297.m54256().m40350(this, new C22902(this, 1));
        }
        C17930 c17930M54256 = this.f36351.f6297.m54256();
        final AbstractC6323 abstractC6323 = this.f36355;
        C17359.requireNonNull(abstractC6323);
        c17930M54256.m40350(this, new InterfaceC16438() { // from class: l.ۤۤ᩻
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                abstractC6323.m18045(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29085(ActivityC11563 activityC11563) {
        activityC11563.f36351.f6296 = true;
        Intent intent = new Intent(activityC11563, (Class<?>) ActivityC7418.class);
        intent.putExtra("scriptSettings", true);
        activityC11563.f36356.m10999(intent);
    }

    @Override // l.InterfaceC9654
    /* JADX INFO: renamed from: ۙ */
    public final void mo18668(View view) {
        boolean z = false;
        C18452 c18452 = new C18452(this, view, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        MenuItem icon = c9898M42995.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector);
        C24244 c24244 = this.f36351.f6297;
        if (c24244 != null && c24244.m54260() && this.f36353.m23063()) {
            z = true;
        }
        icon.setEnabled(z);
        c18452.m42994(new C8114(this));
        c9898M42995.setOptionalIconsVisible(true);
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29087(ActivityC11563 activityC11563, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            activityC11563.f36353.m23065();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC11563.f36351.f6296 = false;
            Intent intent = new Intent(activityC11563, (Class<?>) ActivityC7418.class);
            intent.putExtra("scriptSettings", true);
            activityC11563.f36356.m10999(intent);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC11563.f36351.f6297.m54259();
            activityC11563.finish();
        }
    }

    @Override // l.InterfaceC9654
    /* JADX INFO: renamed from: ۧ */
    public final void mo18670() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
