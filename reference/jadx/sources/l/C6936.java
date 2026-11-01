package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.m.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes2.dex */
public final class C6936 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static long f23312;

    /* JADX INFO: renamed from: ۢ᩻۠, reason: not valid java name and contains not printable characters */
    private static final short[] f23313 = {2002, -30522, -30504, -30498, -30497, -30507, -30502, -30497, -30498, -30586, -30566, -30586, -30590, -30566, -30587, -30588, -30470, -30501, -30528, -30499, -30510, -30515, -30472, -30501, -30505, -30507, -30504, -30478, -30499, -30504, -30511, -30473, -30500, -30507, -30502, -30509, -30511, -30512, -30572, -30528, -30501, -30501, -30572, -30510, -30507, -30521, -30528, -30568, -30572, -30499, -30509, -30502, -30501, -30522, -30511, -30512, -30571};

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static long f23314;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static String f23315;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ViewGroup f23316;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6854 f23318;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7935 f23319;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1439 f23320;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f23321;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C18583 f23323;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f23324;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11545 f23327;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23328;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6606 f23329;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11545 f23330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6854 f23331;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23332;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22046 f23333;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C17381 f23335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8765 f23336;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6606 f23337;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20490 f23338;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Main f23339;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f23341;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewGroup f23345;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20490 f23349;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23350;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f23334 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f23342 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14638 f23322 = new C14638();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC3512 f23347 = new Runnable() { // from class: l.ۗ᩸᩹
        @Override // java.lang.Runnable
        public final void run() {
            this.f12866.m18655();
        }
    };

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC4819 f23326 = new View.OnClickListener() { // from class: l.ۙᩳ᩹
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C6936.m18605(this.f16959, view);
        }
    };

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22959 f23346 = C22959.m50799(200);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23348 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f23317 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22959 f23340 = C22959.m50799(50);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f23343 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f23325 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18605(C6936 c6936, View view) {
        C11545 c11545 = c6936.f23330;
        C11545 c11546 = c6936.f23327;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c6936.m18650(true);
            c11546.m28766();
            return;
        }
        if (id == R.id.MT_Protector) {
            c6936.m18650(false);
            c11545.m28766();
        } else if (id == R.id.MT_Protector) {
            c6936.m18650(true);
            c11546.m28790();
        } else if (id == R.id.MT_Protector) {
            c6936.m18650(false);
            c11545.m28790();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۗ᩸᩹] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ۙᩳ᩹] */
    public C6936(Main main, Bundle bundle) {
        this.f23339 = main;
        this.f23349 = (C20490) main.m31016(R.id.MT_Protector);
        this.f23338 = (C20490) main.m31016(R.id.MT_Protector);
        this.f23319 = (C7935) main.m31016(R.id.MT_Protector);
        this.f23329 = (C6606) main.m31016(R.id.MT_Protector);
        this.f23337 = (C6606) main.m31016(R.id.MT_Protector);
        C17381 c17381 = (C17381) main.m31016(R.id.MT_Protector);
        this.f23335 = c17381;
        this.f23337.m17933(c17381);
        this.f23333 = (C22046) main.m31016(R.id.MT_Protector);
        this.f23345 = (ViewGroup) main.m31016(R.id.MT_Protector);
        this.f23316 = (ViewGroup) main.m31016(R.id.MT_Protector);
        this.f23345.setOnClickListener(new ViewOnClickListenerC23346(2, this));
        int i = 0;
        this.f23316.setOnClickListener(new ViewOnClickListenerC2702(i, this));
        this.f23319.m20961(this.f23335);
        this.f23319.m20962(this.f23333);
        this.f23333.m48984(new C5525());
        C6854 c6854 = (C6854) main.m31016(R.id.MT_Protector);
        this.f23331 = c6854;
        c6854.m18479(true);
        c6854.m18478(new C16041(this));
        C6854 c6855 = (C6854) main.m31016(R.id.MT_Protector);
        this.f23318 = c6855;
        c6855.m18479(false);
        c6855.m18478(new C12686(i, this));
        this.f23341 = (TextView) main.m31016(R.id.MT_Protector);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.ܿ᩸᩹
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C6936.m18604(this.f56032, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f23331.addOnLayoutChangeListener(onLayoutChangeListener);
        this.f23318.addOnLayoutChangeListener(onLayoutChangeListener);
        final int iM33769 = C13932.m33769(25.0f);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: l.ۛ᩸᩹
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C6936.m18608(this.f21384, iM33769, view, motionEvent);
            }
        };
        this.f23329.m17932(onTouchListener);
        this.f23337.m17932(onTouchListener);
        this.f23336 = new C8765(this, main);
        this.f23319.m20960();
        this.f23319.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f23319.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f23319.m20971(R.drawable.MT_Protector, 45);
        C18583 c18583 = new C18583(this.f23319);
        this.f23323 = c18583;
        this.f23319.m20958(c18583).m35973();
        this.f23319.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f23319.setOnClickListener(new ViewOnClickListenerC14803(0, this));
        this.f23319.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֫᩸᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C6936.m18603(this.f7743);
                return true;
            }
        });
        this.f23339.m131(new Runnable() { // from class: l.᩻᩸᩹
            @Override // java.lang.Runnable
            public final void run() {
                C6936.m18614(this.f77725);
            }
        });
        main.getLifecycle().mo9171(new C11275(0, this));
        boolean z = this.f23342;
        if (bundle == null || !bundle.containsKey("WindowManagerData")) {
            boolean zEquals = C13638.equals(ApplicationC0716.f2988.getString("load_path_left", "0"), "0");
            boolean zEquals2 = C13638.equals(ApplicationC0716.f2988.getString("load_path_right", "0"), "0");
            String strMo33986 = C11904.f39934.mo33986();
            String string = ApplicationC0716.f2992.getString("home_path_left", strMo33986);
            String string2 = ApplicationC0716.f2992.getString("home_path_right", strMo33986);
            String string3 = ApplicationC0716.f2992.getString("last_path_left", string);
            String string4 = ApplicationC0716.f2992.getString("last_path_right", string2);
            string = zEquals ? string : string3;
            String str = zEquals2 ? string2 : string4;
            this.f23327 = new C11545(this, this.f23329, new C11672(string), true, null);
            this.f23330 = new C11545(this, this.f23337, new C11672(str), false, null);
        } else {
            C17367 c17367M40441 = C17367.m40441(bundle.getByteArray("WindowManagerData"));
            boolean zM40461 = c17367M40441.m40461();
            C11672.m29122(c17367M40441);
            this.f23327 = new C11545(this, this.f23329, C9615.m24521(c17367M40441), true, c17367M40441);
            this.f23330 = new C11545(this, this.f23337, C9615.m24521(c17367M40441), false, c17367M40441);
            int iM40462 = c17367M40441.m40462();
            for (int i2 = 0; i2 < iM40462; i2++) {
                this.f23322.add(C9615.m24521(c17367M40441));
            }
            C5900.m16151(1000);
            z = zM40461;
        }
        this.f23327.m28786(this.f23330);
        this.f23330.m28786(this.f23327);
        this.f23327.m28788(true);
        this.f23330.m28788(false);
        m18654();
        m18650(z);
        this.f23339.getLifecycle().mo9171(new InterfaceC5657() { // from class: l.ۨᩳ᩹
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                C6936.m18616(this.f39842, enumC1651);
            }
        });
        C3141.f11846.m44959(main, new InterfaceC10597() { // from class: l.ܰᩳ᩹
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C6936.m18607(this.f45996, (EnumC9493) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18607(C6936 c6936, EnumC9493 enumC9493) {
        if (enumC9493.m24319()) {
            return;
        }
        C11545 c11545 = c6936.f23330;
        C11545 c11546 = c6936.f23327;
        C14638 c14638 = c6936.f23322;
        c14638.m35141();
        try {
            int size = c14638.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractC11462 abstractC11462 = (AbstractC11462) c14638.get(size);
                if ((abstractC11462 instanceof C9183) && !(((AbstractC12233) abstractC11462.mo13029()).m30345() instanceof C4718)) {
                    c14638.m35141();
                    try {
                        c6936.m18600(size);
                        c14638.m35142();
                    } catch (Throwable th) {
                        c14638.m35142();
                        throw th;
                    }
                }
            }
            if (c11546.m28814(b.k) && !(((AbstractC12233) c11546.m28817().mo13029()).m30345() instanceof C4718)) {
                c6936.m18630(c11546);
            }
            if (c11545.m28814(b.k) && !(((AbstractC12233) c11545.m28817().mo13029()).m30345() instanceof C4718)) {
                c6936.m18630(c11545);
            }
            c14638.m35142();
        } catch (Throwable th2) {
            c14638.m35142();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18616(C6936 c6936, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_PAUSE) {
            if (f23315 != null) {
                if (SystemClock.uptimeMillis() < f23314) {
                    c6936.f23321 = f23315;
                    f23312 = SystemClock.uptimeMillis() + 200;
                }
                f23315 = null;
                return;
            }
            return;
        }
        if (enumC1651 != EnumC1651.ON_RESUME || c6936.f23321 == null) {
            return;
        }
        if (SystemClock.uptimeMillis() > f23312) {
            c6936.m18646().f38826.m16168(c6936.f23321);
        }
        c6936.f23321 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18602(InterfaceC2557 interfaceC2557, int i) {
        f23315 = interfaceC2557.getPath();
        f23314 = SystemClock.uptimeMillis() + ((long) i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18647() {
        this.f23322.m35141();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18643() {
        this.f23322.m35142();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18615(C6936 c6936, View view) {
        if (c6936.f23327.m28800()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18613(C6936 c6936, View view) {
        if (c6936.f23330.m28800()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18604(C6936 c6936, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c6936.m18611(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18608(C6936 c6936, int i, View view, MotionEvent motionEvent) {
        if (!c6936.f23335.m40473(8388611)) {
            if (motionEvent.getAction() == 0) {
                c6936.m18611(true);
                if (view != c6936.f23329) {
                    c6936.f23331.m44655();
                    c6936.m18650(false);
                } else if (motionEvent.getX() >= i) {
                    c6936.f23318.m44655();
                    c6936.m18650(true);
                }
            }
            if (view == c6936.f23329) {
                return c6936.f23327.f38826.f20129.onTouch(view, motionEvent);
            }
            return c6936.f23330.f38826.f20129.onTouch(view, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18606(C6936 c6936, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_PAUSE) {
            c6936.m18611(false);
            AbstractC11462 abstractC11462M28817 = c6936.f23327.m28817();
            AbstractC11462 abstractC11462M28818 = c6936.f23330.m28817();
            C14638<AbstractC11462> c14638 = c6936.f23322;
            c14638.m35141();
            try {
                if (!(abstractC11462M28817 instanceof C11672)) {
                    for (AbstractC11462 abstractC11462 : c14638) {
                        if (abstractC11462 instanceof C11672) {
                            abstractC11462M28817 = abstractC11462;
                        }
                    }
                }
                if (!(abstractC11462M28818 instanceof C11672)) {
                    for (AbstractC11462 abstractC11463 : c14638) {
                        if (abstractC11463 != abstractC11462M28817 && (abstractC11463 instanceof C11672)) {
                            abstractC11462M28818 = abstractC11463;
                        }
                    }
                }
                c14638.m35142();
                ApplicationC0716.f2992.edit().putString("last_path_left", abstractC11462M28817.m28640()).putString("last_path_right", abstractC11462M28818.m28640()).apply();
            } catch (Throwable th) {
                c14638.m35142();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m18653() {
        return this.f23336.m22813();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m18614(C6936 c6936) {
        c6936.m18611(false);
        c6936.f23329.setSelector(C0674.m3025());
        c6936.f23337.setSelector(C0674.m3025());
        c6936.f23327.f38826.m16164();
        c6936.f23330.f38826.m16164();
        c6936.f23319.m20968();
        c6936.f23331.m18477(C20368.f65975);
        c6936.f23318.m18477(C20368.f65975);
        c6936.m18599(true);
        c6936.m18599(false);
        float fIntBitsToFloat = Float.intBitsToFloat(C16135.m38193(c6936.f23339.getTheme(), R.attr.MT_Protector));
        c6936.f23349.setAlpha(fIntBitsToFloat);
        c6936.f23338.setAlpha(fIntBitsToFloat);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
        ((ProgressBar) c6936.f23345.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ((ProgressBar) c6936.f23316.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        Button button = (Button) c6936.f23345.getChildAt(1);
        Button button2 = new Button(c6936.f23339);
        button.setTextColor(button2.getTextColors());
        button.setBackground(button2.getBackground());
        ((TextView) c6936.f23345.getChildAt(2)).setTextColor(C20368.f66005);
        Button button3 = (Button) c6936.f23316.getChildAt(1);
        Button button4 = new Button(c6936.f23339);
        button3.setTextColor(button4.getTextColors());
        button3.setBackground(button4.getBackground());
        ((TextView) c6936.f23316.getChildAt(2)).setTextColor(C20368.f66005);
        c6936.f23336.m22814();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18632(C11545 c11545, AbstractC11462 abstractC11462) {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            AbstractC11462 abstractC11462M28817 = c11545.m28817();
            if (abstractC11462M28817.mo28636()) {
                c14638.add(abstractC11462M28817);
                abstractC11462M28817.mo23632();
            } else {
                if (abstractC11462M28817.m28632() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC11462M28817.m28627();
            }
            c11545.m28813(abstractC11462);
            c14638.m35142();
            C23561.m51925();
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18630(C11545 c11545) {
        AbstractC11462 abstractC11462;
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            if (c14638.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC11462 abstractC11462M28817 = c11545.m28817();
            if (abstractC11462M28817.m28632() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            int iM28632 = abstractC11462M28817.m28632();
            abstractC11462M28817.m28627();
            if (iM28632 == 0) {
                abstractC11462 = null;
                break;
            }
            Iterator<E> it = c14638.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC11462 = null;
                    break;
                }
                abstractC11462 = (AbstractC11462) it.next();
                if (abstractC11462.m28617() == iM28632) {
                    it.remove();
                    break;
                }
            }
            if (abstractC11462 == null) {
                Iterator<E> it2 = c14638.iterator();
                while (it2.hasNext()) {
                    AbstractC11462 abstractC11463 = (AbstractC11462) it2.next();
                    if (abstractC11463 instanceof C11672) {
                        it2.remove();
                        abstractC11462 = abstractC11463;
                        break;
                    }
                }
            }
            if (abstractC11462 == null) {
                abstractC11462 = (AbstractC11462) c14638.remove(c14638.size() - 1);
            }
            c11545.m28813(abstractC11462);
            abstractC11462.mo13038(c11545);
            c14638.m35142();
            C23561.m51925();
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18649(C11545 c11545) {
        AbstractC11462 abstractC11462;
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            if (c14638.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC11462 abstractC11462M28817 = c11545.m28817();
            int iM28632 = abstractC11462M28817.m28632();
            if (iM28632 == 0) {
                abstractC11462 = null;
                break;
            }
            Iterator<E> it = c14638.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC11462 = null;
                    break;
                }
                abstractC11462 = (AbstractC11462) it.next();
                if (abstractC11462.m28617() == iM28632) {
                    it.remove();
                    break;
                }
            }
            if (abstractC11462 == null) {
                Iterator<E> it2 = c14638.iterator();
                while (it2.hasNext()) {
                    AbstractC11462 abstractC11463 = (AbstractC11462) it2.next();
                    if (abstractC11463 instanceof C11672) {
                        it2.remove();
                        abstractC11462 = abstractC11463;
                        break;
                    }
                }
            }
            if (abstractC11462 == null) {
                abstractC11462 = (AbstractC11462) c14638.remove(c14638.size() - 1);
            }
            c14638.add(abstractC11462M28817);
            c11545.m28813(abstractC11462);
            abstractC11462M28817.mo23632();
            abstractC11462.mo13038(c11545);
            c14638.m35142();
            C23561.m51925();
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18631(C11545 c11545, int i, boolean z) {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            boolean zM18617 = m18617(c11545, i, z);
            c14638.m35142();
            if (zM18617) {
                C23561.m51925();
            }
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m18645(int i) {
        C11545 c11545M18646 = m18646();
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            boolean zM18617 = m18617(c11545M18646, m18609(i), true);
            c14638.m35142();
            if (zM18617) {
                C23561.m51925();
            }
            return zM18617;
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18636(int i) {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            return m18600(m18609(i));
        } finally {
            c14638.m35142();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m18652(int i) {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            int iM18609 = m18609(i);
            boolean z = false;
            if (iM18609 >= 0 && iM18609 < c14638.size() && ((AbstractC11462) c14638.get(iM18609)).m28632() != 0) {
                z = true;
            }
            return z;
        } finally {
            c14638.m35142();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m18609(int i) {
        C14638 c14638 = this.f23322;
        int size = c14638.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC11462) c14638.get(i2)).m28617() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m18617(C11545 c11545, int i, boolean z) {
        if (i < 0) {
            return false;
        }
        C14638 c14638 = this.f23322;
        if (i >= c14638.size()) {
            return false;
        }
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        AbstractC11462 abstractC11462 = (AbstractC11462) c14638.remove(i);
        if (abstractC11462M28817.mo28636()) {
            c14638.add(abstractC11462M28817);
            abstractC11462M28817.mo23632();
        } else {
            if (abstractC11462M28817.m28632() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            abstractC11462M28817.m28627();
        }
        if (z) {
            c11545.m28813(abstractC11462);
        } else {
            c11545.m28804(abstractC11462);
        }
        abstractC11462.mo13038(c11545);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m18600(int i) {
        if (i < 0) {
            return false;
        }
        C14638 c14638 = this.f23322;
        if (i >= c14638.size()) {
            return false;
        }
        AbstractC11462 abstractC11462 = (AbstractC11462) c14638.remove(i);
        if (abstractC11462.m28632() == 0) {
            throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
        }
        abstractC11462.m28627();
        return true;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m18639() {
        C11545 c11545 = this.f23327;
        if (c11545.m28800()) {
            return;
        }
        C11545 c11546 = this.f23330;
        if (c11546.m28800()) {
            return;
        }
        m18611(false);
        C2371 c2371M28820 = c11545.m28820();
        c11545.m28782(c11546.m28820());
        c11546.m28782(c2371M28820);
        if (!c11545.m28821()) {
            m18634(true, false);
        } else {
            m18651(true, false);
        }
        if (!c11546.m28821()) {
            m18634(false, false);
        } else {
            m18651(false, false);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m18612(C6936 c6936) {
        if (c6936.f23346.m50803()) {
            return;
        }
        C11545 c11545M18646 = c6936.m18646();
        if (c6936.f23319.m20972()) {
            int iM20955 = c6936.f23319.m20955();
            if (iM20955 == 0) {
                c11545M18646.m28810();
                return;
            }
            if (iM20955 == 1) {
                c11545M18646.m28767();
                return;
            }
            if (iM20955 == 2) {
                if (c11545M18646.m28817().mo23629()) {
                    new ViewOnClickListenerC22938(c11545M18646).m50779();
                    return;
                } else {
                    if (c11545M18646.m28821()) {
                        return;
                    }
                    c11545M18646.f38808.m36142();
                    return;
                }
            }
            if (iM20955 != 3) {
                if (iM20955 != 4) {
                    return;
                }
                c6936.f23339.getOnBackPressedDispatcher().m34906();
                return;
            } else {
                if (c11545M18646.m28817().mo13042()) {
                    c11545M18646.m28817().mo13034(c11545M18646, c11545M18646.m28833());
                    return;
                }
                return;
            }
        }
        if (c6936.f23319.m20954()) {
            int iM20956 = c6936.f23319.m20955();
            if (iM20956 == 0) {
                int i = ApplicationC0716.f2992.getInt("swipe_select_count", 0);
                if (i < 3) {
                    ApplicationC0716.f2992.edit().mo4065(i + 1, "swipe_select_count").apply();
                }
                c11545M18646.m28761();
                return;
            }
            if (iM20956 == 1) {
                c11545M18646.m28768();
                return;
            }
            if (iM20956 == 2) {
                c11545M18646.m28831();
            } else if (iM20956 == 3) {
                c11545M18646.m28796();
            } else {
                if (iM20956 != 4) {
                    return;
                }
                c6936.f23339.m30996(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18603(C6936 c6936) {
        int iM20955 = c6936.f23319.m20955();
        if (!c6936.f23319.m20972()) {
            if (c6936.f23319.m20954()) {
                if (iM20955 == 3) {
                    c6936.m18646().m28809();
                    return;
                } else {
                    c6936.f23319.m20967(iM20955, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM20955]);
                    return;
                }
            }
            return;
        }
        if (iM20955 == 0) {
            c6936.f23319.m20967(0, R.string.MT_Protector);
            return;
        }
        if (iM20955 == 1) {
            c6936.f23319.m20967(1, R.string.MT_Protector);
            return;
        }
        if (iM20955 == 2) {
            c6936.f23319.m20967(2, c6936.m18646().m28817().mo23629() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        if (iM20955 == 3) {
            c6936.f23319.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            c6936.m18644(false);
        } else {
            if (iM20955 != 4) {
                return;
            }
            new C19410(c6936.m18646()).m44461();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m18642() throws Throwable {
        String str;
        int i;
        short s;
        short[] sArr;
        AbstractC11462 abstractC11462;
        InterfaceC6025 interfaceC6025;
        boolean z;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        String str2;
        short[] sArr2;
        InterfaceC6025 interfaceC6026;
        boolean z2;
        int i7;
        String strM10790;
        int i8;
        int i9;
        AbstractC11462 abstractC11463;
        InterfaceC6025 interfaceC6027;
        short[] sArr3;
        boolean z3;
        int i10;
        int iM450211;
        int i11;
        int i12;
        boolean z4;
        String str3;
        int i13;
        AbstractC11462 abstractC11464;
        InterfaceC6025 interfaceC6028;
        int iM11306;
        int i14;
        int i15;
        int iM450212;
        int i16;
        int i17;
        int iM11307;
        int i18;
        int i19;
        C6936 c6936 = this;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 250878318;
        int i25 = RunnableC0195.f1321;
        int i26 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i25;
        int i27 = ((iM11308 ^ i26) * (-6513)) ^ 723312577;
        int i28 = iM11308 ^ 1326235404;
        String str4 = null;
        ArrayList arrayList = null;
        Throwable th = null;
        AbstractC11462 abstractC11465 = null;
        Object it = null;
        final AbstractC11462 abstractC11466 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        boolean zM5348 = false;
        boolean zMo13036 = false;
        boolean zMo13037 = false;
        boolean zMo13038 = false;
        boolean z5 = false;
        boolean zM3748 = false;
        InterfaceC6025 interfaceC6029 = null;
        boolean zMo13031 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        char c = 0;
        int i29 = 0;
        int i30 = 0;
        short s2 = 0;
        int i31 = 0;
        PrintStream printStream = null;
        Iterator it2 = null;
        int i32 = 0;
        C14638 c14638 = null;
        C11545 c11545 = null;
        C11545 c11546 = null;
        while (true) {
            boolean z9 = false;
            while (true) {
                i24 = i28 ^ (i27 & (((i24 ^ i26) * 26711) >> 31));
                switch (i24) {
                    case -2094020061:
                    case -659363731:
                        if (z5) {
                            iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") + i26) * (-7);
                            i3 = ((iM45029 ^ i25) * (-21033)) ^ 970047885;
                            i4 = -1807387333;
                        } else {
                            iM45029 = (C19806.m45029("۬ۧ") + i25) * 21;
                            i3 = ((iM45029 ^ i26) * 7301) ^ (-1415200681);
                            i4 = -1303040706;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -2089427934:
                    case -1955321165:
                        AbstractC11462 abstractC11467 = (AbstractC11462) C0216.m1584(it);
                        try {
                            zMo13031 = abstractC11467.mo13031();
                            int iM450213 = (C19806.m45029("ۚ֡") ^ i25) * (-103);
                            i28 = iM450213 ^ (-1942820522);
                            i27 = ((iM450213 ^ i26) * (-11739)) ^ 290524491;
                            abstractC11466 = abstractC11467;
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC11466 = abstractC11467;
                            iM45029 = C19806.m45029("ۡ۟") ^ i25;
                            i3 = ((iM45029 ^ i26) * (-19235)) ^ 615866902;
                            i4 = -52937738;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        }
                        break;
                    case -1987067979:
                    case -1251617364:
                        C1461.m5074(c14638);
                        c6936.f23348 = z9;
                        return;
                    case -1952607231:
                    case 1792232620:
                        if (zM3748) {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۨۨ")) * (-19);
                            i3 = ((iM45029 ^ i25) * 21627) ^ 12896061;
                            i4 = 213580085;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۜۘ") ^ i25) * (-75);
                            i3 = ((iM45029 ^ i26) * (-24341)) ^ (-1474682427);
                            i4 = -1833195509;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1945673340:
                    case -1527319209:
                        C2871.m8646();
                        if (C1977.f7413 > 0) {
                            i = i29;
                            abstractC11462 = abstractC11466;
                            iM11307 = (ThreadFactoryC3888.m11306("۬ܰ") + i25) * 27;
                            i5 = ((iM11307 ^ i26) * (-26761)) ^ 2042232151;
                            i18 = 1702151145;
                            i28 = iM11307 ^ i18;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        }
                        i = i29;
                        iM11307 = (C19806.m45029("ۢᩳ") + i25) * (-111);
                        abstractC11462 = abstractC11466;
                        i5 = ((iM11307 ^ i26) * 13899) ^ (-1863515568);
                        i18 = -2024812066;
                        i28 = iM11307 ^ i18;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -1939385275:
                    case -40136651:
                        str = str4;
                        i = i29;
                        s = s2;
                        sArr = sArr5;
                        abstractC11462 = abstractC11466;
                        interfaceC6025 = interfaceC6029;
                        z = z9;
                        i2 = i31;
                        c = 0;
                        if (RunnableC0195.m1431()) {
                            iM450210 = C19806.m45029("۬ۢ") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-15041)) ^ 707375937;
                            i6 = 2049818788;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۚۜ") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-30865)) ^ (-1324195155);
                            i6 = 1137151834;
                        }
                        s2 = s;
                        i31 = i2;
                        z9 = z;
                        interfaceC6029 = interfaceC6025;
                        sArr5 = sArr;
                        str4 = str;
                        c6936 = this;
                        i28 = iM450210 ^ i6;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -1913540215:
                    case 2135640850:
                        z7 = false;
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܺ") + i26) * (-3);
                        i3 = ((iM45029 ^ i25) * 4731) ^ (-1857548955);
                        i4 = -1633024170;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1870036895:
                    case -1264067129:
                        C2704.m8255();
                        if (C1937.f7317 >= 0) {
                            iM45029 = (C19806.m45029("ܺۡ") ^ i25) * 25;
                            i3 = ((iM45029 ^ i26) * (-20873)) ^ (-1522878613);
                            i4 = -1997450660;
                        } else {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۤ᩶")) * (-63);
                            i3 = ((iM45029 ^ i25) * (-12477)) ^ 1622611189;
                            i4 = -1751708215;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1866788754:
                    case 708726946:
                        if (zM5348) {
                            iM45029 = ThreadFactoryC3888.m11306("۬֨") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-3631)) ^ (-1699782795);
                            i4 = 345164093;
                        } else {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("᩻ۡ")) * 85;
                            i3 = ((iM45029 ^ i25) * 26797) ^ (-1708753590);
                            i4 = 2070424720;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1842443472:
                    case 1983495885:
                        if (z6) {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۚ᩵")) * 7;
                            i3 = ((iM45029 ^ i25) * (-28219)) ^ (-416219393);
                            i4 = -1451347474;
                        } else {
                            iM45029 = (C19806.m45029("ۗۚ") ^ i25) * 63;
                            i3 = ((iM45029 ^ i26) * 12753) ^ (-1254027734);
                            i4 = -468989188;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1823362282:
                    case -1007918297:
                        i = i29;
                        abstractC11462 = abstractC11466;
                        C1066.m4028(c11545, "");
                        C1066.m4028(c11546, "");
                        if (C0797.m3359()) {
                            iM11307 = ThreadFactoryC3888.m11306("ۙᩴ") ^ i25;
                            i5 = ((iM11307 ^ i26) * 5993) ^ (-1883628510);
                            i18 = 954756928;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("۬ܰ") + i25) * 27;
                            i5 = ((iM11307 ^ i26) * (-26761)) ^ 2042232151;
                            i18 = 1702151145;
                        }
                        i28 = iM11307 ^ i18;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -1794486601:
                    case 1924122554:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                            interfaceC6028 = interfaceC6029;
                            str3 = str4;
                            i13 = i29;
                            abstractC11464 = abstractC11466;
                            z4 = z9;
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i26;
                            i14 = ((iM11306 ^ i25) * (-30085)) ^ 136464535;
                            i15 = -35496233;
                            int i33 = iM11306 ^ i15;
                            str4 = str3;
                            i28 = i33;
                            abstractC11466 = abstractC11464;
                            i29 = i13;
                            boolean z10 = z4;
                            interfaceC6029 = interfaceC6028;
                            i27 = i14;
                            z9 = z10;
                        } else {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۤ᩶")) * (-63);
                            i3 = ((iM45029 ^ i25) * (-12477)) ^ 1622611189;
                            i4 = -1751708215;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        }
                        break;
                    case -1791297543:
                    case -1690478680:
                        C11605 c11605 = C2431.f9738;
                        c11545.m28779((List) c11605);
                        c11546.m28779((List) c11605);
                        return;
                    case -1724456612:
                    case -808816584:
                        zM3748 = C0962.m3748(it);
                        iM45029 = (C19806.m45029("᩷᩸") ^ i26) * (-9);
                        i3 = ((iM45029 ^ i25) * (-2879)) ^ (-421903168);
                        i4 = 106769490;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1719999646:
                    case 778647306:
                        if (zMo13031) {
                            iM45029 = ThreadFactoryC3888.m11306("ۡܺ") ^ i26;
                            i3 = ((iM45029 ^ i25) * 5865) ^ (-667780224);
                            i4 = -1086844664;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۬᩵") ^ i25) * (-55);
                            i3 = ((iM45029 ^ i26) * 15511) ^ (-1323280645);
                            i4 = 50264978;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1712240343:
                    case 1103674298:
                        C1025.m3864(new RunnableC15163(0));
                        return;
                    case -1704062906:
                    case -1026977064:
                        c11546.m28815();
                        c11545.m28815();
                        iM45029 = C19806.m45029("ۜۗ") ^ i25;
                        i3 = ((iM45029 ^ i26) * (-21533)) ^ (-1560156859);
                        i4 = -1365710815;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1652042456:
                    case 2139020484:
                        zM5348 = RunnableC1564.m5348(it2);
                        iM45029 = C19806.m45029("۠۠") ^ i25;
                        i3 = ((iM45029 ^ i26) * (-26475)) ^ (-1000865268);
                        i4 = -1981064463;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1634848306:
                    case 531505207:
                        z4 = z9;
                        str3 = str4;
                        i13 = i29;
                        abstractC11464 = abstractC11466;
                        interfaceC6028 = ApplicationC0716.f2992;
                        sArr5 = f23313;
                        i31 = 1;
                        if (C1461.f5957 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i26;
                            i14 = ((iM11306 ^ i25) * (-30085)) ^ 136464535;
                            i15 = -35496233;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩶ۘ") + i26) * (-83);
                            i14 = ((iM11306 ^ i25) * 6347) ^ (-338608578);
                            i15 = 879091544;
                        }
                        int i34 = iM11306 ^ i15;
                        str4 = str3;
                        i28 = i34;
                        abstractC11466 = abstractC11464;
                        i29 = i13;
                        boolean z11 = z4;
                        interfaceC6029 = interfaceC6028;
                        i27 = i14;
                        z9 = z11;
                        break;
                    case -1620834072:
                    case -1172785942:
                        str2 = str4;
                        i = i29;
                        abstractC11463 = abstractC11466;
                        interfaceC6027 = interfaceC6029;
                        sArr3 = sArr5;
                        z3 = z9;
                        i10 = i31;
                        int i35 = i22 + i23;
                        if ((i35 + i35) - i21 < 0) {
                            iM450211 = (ThreadFactoryC3888.m11306("ܺ᩷") ^ i26) * 65;
                            i8 = ((iM450211 ^ i25) * (-5439)) ^ (-1450539154);
                            i11 = 1094433674;
                        } else {
                            iM450211 = (C19806.m45029("ۧ᩸") ^ i26) * (-37);
                            i8 = ((iM450211 ^ i25) * (-209)) ^ 2119488616;
                            i11 = 1258220932;
                        }
                        i9 = iM450211 ^ i11;
                        sArr5 = sArr3;
                        i31 = i10;
                        z9 = z3;
                        interfaceC6029 = interfaceC6027;
                        abstractC11466 = abstractC11463;
                        str4 = str2;
                        i28 = i9;
                        i27 = i8;
                        i29 = i;
                        c6936 = this;
                        break;
                    case -1617914488:
                    case 604863539:
                        i = i29;
                        abstractC11462 = abstractC11466;
                        if (c6936.f23340.m50803()) {
                            iM11307 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i25;
                            i5 = ((iM11307 ^ i26) * 18619) ^ 861413081;
                            i18 = -1416910373;
                        } else {
                            iM11307 = C19806.m45029("ۜܳ") ^ i26;
                            i5 = ((iM11307 ^ i25) * 5547) ^ (-103931814);
                            i18 = 1504418728;
                        }
                        i28 = iM11307 ^ i18;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -1562403977:
                    case -605058844:
                        i12 = 14086;
                        int iM450214 = (i25 - C19806.m45029("ۛۘ")) * 99;
                        sArr5 = sArr5;
                        i31 = i31;
                        z9 = z9;
                        interfaceC6029 = interfaceC6029;
                        abstractC11466 = abstractC11466;
                        str4 = str4;
                        i29 = i12;
                        i28 = iM450214 ^ (-1577036918);
                        i27 = ((iM450214 ^ i26) * (-2391)) ^ (-2143753913);
                        c6936 = this;
                        break;
                    case -1517982482:
                    case 1957053385:
                        it2 = c14638.iterator();
                        iM45029 = C19806.m45029("ۚ۟") ^ i25;
                        i3 = ((iM45029 ^ i26) * (-12469)) ^ 241488744;
                        i4 = 325194312;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1481704138:
                    case -111321432:
                        str2 = str4;
                        i = i29;
                        abstractC11463 = abstractC11466;
                        interfaceC6027 = interfaceC6029;
                        sArr3 = sArr5;
                        z3 = z9;
                        i10 = i31;
                        if (c6936.f23348) {
                            iM450211 = C19806.m45029("۫᩷") ^ i26;
                            i8 = ((iM450211 ^ i25) * (-5467)) ^ 636600296;
                            i11 = 2092951361;
                        } else {
                            iM450211 = (ThreadFactoryC3888.m11306("᩷᩵") + i25) * (-91);
                            i8 = ((iM450211 ^ i26) * (-547)) ^ (-1039170345);
                            i11 = 1598158427;
                        }
                        i9 = iM450211 ^ i11;
                        sArr5 = sArr3;
                        i31 = i10;
                        z9 = z3;
                        interfaceC6029 = interfaceC6027;
                        abstractC11466 = abstractC11463;
                        str4 = str2;
                        i28 = i9;
                        i27 = i8;
                        i29 = i;
                        c6936 = this;
                        break;
                    case -1449711898:
                    case 189632030:
                        C23561.m51925();
                        iM45029 = (C19806.m45029("ۗۚ") ^ i25) * 63;
                        i3 = ((iM45029 ^ i26) * 12753) ^ (-1254027734);
                        i4 = -468989188;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1404666398:
                    case 1998623688:
                        C3286.m9798();
                        C2871.m8646();
                        return;
                    case -1353171522:
                    case 448918883:
                        if (zMo13037) {
                            iM45029 = ThreadFactoryC3888.m11306("ۘۨ") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-4893)) ^ (-1760906852);
                            i4 = 909691463;
                        } else {
                            iM45029 = C19806.m45029("ۨۡ") ^ i26;
                            i3 = ((iM45029 ^ i25) * 23799) ^ 533353895;
                            i4 = 1211298097;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1334893819:
                    case 191738642:
                        c6936.m18630(c11545);
                        iM45029 = ThreadFactoryC3888.m11306("ۘܽ") ^ i25;
                        i3 = ((iM45029 ^ i26) * 25383) ^ 314102456;
                        i4 = -593607132;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1332644089:
                    case -767375127:
                        if (zMo13036) {
                            z7 = z8;
                            iM45029 = (ThreadFactoryC3888.m11306("ۜܺ") + i26) * (-3);
                            i3 = ((iM45029 ^ i25) * 4731) ^ (-1857548955);
                            i4 = -1633024170;
                        } else {
                            iM45029 = (i25 - C19806.m45029("۫ᩴ")) * (-31);
                            i3 = ((iM45029 ^ i26) * 28781) ^ 445456338;
                            i4 = -1722344657;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1330176162:
                    case -809747007:
                        z8 = false;
                        iM45029 = ThreadFactoryC3888.m11306("ۘۨ") ^ i26;
                        i3 = ((iM45029 ^ i25) * (-4893)) ^ (-1760906852);
                        i4 = 909691463;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1294755894:
                    case 862703681:
                        str2 = str4;
                        i = i29;
                        sArr2 = sArr5;
                        abstractC11462 = abstractC11466;
                        interfaceC6026 = interfaceC6029;
                        z2 = z9;
                        i7 = i31;
                        s2 = sArr4[c];
                        if (C2642.f10294 > 0) {
                            int iM11309 = (ThreadFactoryC3888.m11306("۠ۤ") ^ i26) * 19;
                            i8 = ((iM11309 ^ i25) * (-20779)) ^ (-1449141870);
                            i9 = iM11309 ^ (-810880228);
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            abstractC11466 = abstractC11462;
                            sArr5 = sArr2;
                            str4 = str2;
                            i28 = i9;
                            i27 = i8;
                            i29 = i;
                            c6936 = this;
                        } else {
                            strM10790 = str2;
                            int iM113010 = (i25 - ThreadFactoryC3888.m11306("۟ۜ")) * 115;
                            i5 = ((iM113010 ^ i26) * (-7893)) ^ (-903465080);
                            i28 = iM113010 ^ 1012561493;
                            c6936 = this;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            sArr5 = sArr2;
                            str4 = strM10790;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        }
                        break;
                    case -1247039412:
                    case -185044425:
                        z8 = true;
                        iM45029 = ThreadFactoryC3888.m11306("ۘۨ") ^ i26;
                        i3 = ((iM45029 ^ i25) * (-4893)) ^ (-1760906852);
                        i4 = 909691463;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1215573474:
                    case 806971419:
                        arrayList = c6936.f23334;
                        if (i32 < C1377.m4837(arrayList)) {
                            iM45029 = C19806.m45029("ۗ᩵") ^ i25;
                            i3 = ((iM45029 ^ i26) * (-22731)) ^ (-2141478283);
                            i4 = -661512148;
                        } else {
                            iM45029 = C19806.m45029("᩻ۛ") ^ i26;
                            i3 = ((iM45029 ^ i25) * 27723) ^ (-1750888055);
                            i4 = 468776284;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1215219765:
                    case 1616474248:
                        C0050.m946();
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        iM45029 = (C19806.m45029("ܺۡ") ^ i25) * 25;
                        i3 = ((iM45029 ^ i26) * (-20873)) ^ (-1522878613);
                        i4 = -1997450660;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1165818629:
                    case 911058068:
                        zMo13038 = C1937.m6289(c11546).mo13036();
                        iM45029 = (C19806.m45029("ۨ᩹") + i25) * (-53);
                        i3 = ((iM45029 ^ i26) * 28815) ^ (-2090832586);
                        i4 = 803302119;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -1145501746:
                    case 1878538593:
                        if (!C2332.f8260) {
                            strM10790 = str4;
                            i = i29;
                            sArr2 = sArr5;
                            abstractC11462 = abstractC11466;
                            interfaceC6026 = interfaceC6029;
                            z2 = z9;
                            i7 = i31;
                            int iM113011 = (i25 - ThreadFactoryC3888.m11306("۟ۜ")) * 115;
                            i5 = ((iM113011 ^ i26) * (-7893)) ^ (-903465080);
                            i28 = iM113011 ^ 1012561493;
                            c6936 = this;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            sArr5 = sArr2;
                            str4 = strM10790;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        } else {
                            interfaceC6028 = interfaceC6029;
                            str3 = str4;
                            i13 = i29;
                            abstractC11464 = abstractC11466;
                            z4 = z9;
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i26;
                            i14 = ((iM11306 ^ i25) * (-30085)) ^ 136464535;
                            i15 = -35496233;
                            int i36 = iM11306 ^ i15;
                            str4 = str3;
                            i28 = i36;
                            abstractC11466 = abstractC11464;
                            i29 = i13;
                            boolean z12 = z4;
                            interfaceC6029 = interfaceC6028;
                            i27 = i14;
                            z9 = z12;
                        }
                        break;
                    case -1080443607:
                    case 1678394469:
                        str = str4;
                        i = i29;
                        s = s2;
                        sArr = sArr5;
                        abstractC11462 = abstractC11466;
                        interfaceC6025 = interfaceC6029;
                        z = z9;
                        i2 = i31;
                        int i37 = s + 14162;
                        if (C3286.f12186) {
                            i20 = i37;
                            iM450210 = ThreadFactoryC3888.m11306("ۚۜ") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-30865)) ^ (-1324195155);
                            i6 = 1137151834;
                            s2 = s;
                            i31 = i2;
                            z9 = z;
                            interfaceC6029 = interfaceC6025;
                            sArr5 = sArr;
                            str4 = str;
                            c6936 = this;
                            i28 = iM450210 ^ i6;
                            i27 = i5;
                        } else {
                            int iM450215 = (i25 - C19806.m45029("۫֡")) * 41;
                            i20 = i37;
                            i27 = ((iM450215 ^ i26) * (-31129)) ^ (-1361984921);
                            s2 = s;
                            i31 = i2;
                            z9 = z;
                            interfaceC6029 = interfaceC6025;
                            sArr5 = sArr;
                            str4 = str;
                            c6936 = this;
                            i28 = iM450215 ^ 1839478834;
                        }
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -1060722096:
                    case -321277262:
                        str = str4;
                        i = i29;
                        s = s2;
                        sArr = sArr5;
                        abstractC11462 = abstractC11466;
                        interfaceC6025 = interfaceC6029;
                        z = z9;
                        i2 = i31;
                        sArr4 = f23313;
                        if (C1189.m4368() <= 0) {
                            iM450210 = C19806.m45029("֫᩻") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-10871)) ^ (-646183298);
                            i6 = 300673456;
                        } else {
                            iM450210 = C19806.m45029("۟۟") ^ i25;
                            i5 = ((iM450210 ^ i26) * 14731) ^ 905753872;
                            i6 = 800217590;
                        }
                        s2 = s;
                        i31 = i2;
                        z9 = z;
                        interfaceC6029 = interfaceC6025;
                        sArr5 = sArr;
                        str4 = str;
                        c6936 = this;
                        i28 = iM450210 ^ i6;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -973663404:
                    case 1191473216:
                        c6936.m18630(c11546);
                        iM45029 = (C19806.m45029("ܽᩳ") ^ i26) * 101;
                        i3 = ((iM45029 ^ i25) * (-6225)) ^ (-2135244287);
                        i4 = -1989659364;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -733823703:
                    case 1800348710:
                        c11545.m28815();
                        c11546.m28815();
                        iM45029 = C19806.m45029("ۜۗ") ^ i25;
                        i3 = ((iM45029 ^ i26) * (-21533)) ^ (-1560156859);
                        i4 = -1365710815;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -670598546:
                    case 1833388438:
                        i19 = i32 + 1;
                        int iM450216 = (i25 - C19806.m45029("ᩳ֡")) * 87;
                        int i38 = i19;
                        i27 = ((iM450216 ^ i26) * (-31535)) ^ (-1270418587);
                        i28 = iM450216 ^ 454595821;
                        abstractC11466 = abstractC11466;
                        i29 = i29;
                        i30 = i30;
                        i32 = i38;
                        break;
                    case -667963562:
                    case 180403810:
                        i = i29;
                        abstractC11462 = abstractC11466;
                        c14638 = c6936.f23322;
                        if (c14638.m35143()) {
                            iM11307 = (i25 - C19806.m45029("᩺ܰ")) * (-13);
                            i5 = ((iM11307 ^ i26) * (-21195)) ^ 715084151;
                            i18 = 935288942;
                        } else {
                            iM11307 = (i26 - ThreadFactoryC3888.m11306("ۗۜ")) * (-43);
                            i5 = ((iM11307 ^ i25) * (-24671)) ^ 1509686030;
                            i18 = -1790099211;
                        }
                        i28 = iM11307 ^ i18;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -645533429:
                    case 1594700219:
                        C1461.m5074(c14638);
                        throw th;
                    case -617715678:
                    case 2068256769:
                        C1977.m6365((Runnable) C1419.m4967(arrayList, i32));
                        if (C0629.m2907()) {
                            iM45029 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-673)) ^ (-464818346);
                            i4 = 604072919;
                        } else {
                            iM45029 = C19806.m45029("֡ۖ") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-27141)) ^ (-1869423688);
                            i4 = -218136824;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -610727469:
                    case 140330339:
                        i = i29;
                        printStream = System.out;
                        sArr6 = f23313;
                        i30 = 16;
                        if (C1066.f4915 <= 0) {
                            iM11307 = (C19806.m45029("ۢᩳ") + i25) * (-111);
                            abstractC11462 = abstractC11466;
                            i5 = ((iM11307 ^ i26) * 13899) ^ (-1863515568);
                            i18 = -2024812066;
                        } else {
                            abstractC11462 = abstractC11466;
                            iM11307 = (C19806.m45029("᩷ۡ") + i26) * 53;
                            i5 = ((iM11307 ^ i25) * 3017) ^ (-1290644259);
                            i18 = 328586227;
                        }
                        i28 = iM11307 ^ i18;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    case -573114719:
                    case 144372233:
                        interfaceC6026 = interfaceC6029;
                        i = i29;
                        abstractC11462 = abstractC11466;
                        z2 = z9;
                        short[] sArr7 = sArr5;
                        i7 = i31;
                        strM10790 = C3660.m10790(sArr7, i7, 15, i);
                        if (CallableC1627.f6528) {
                            int iM113012 = ThreadFactoryC3888.m11306("ܶۖ") ^ i25;
                            i27 = ((iM113012 ^ i26) * 19331) ^ (-832699657);
                            sArr5 = sArr7;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            abstractC11466 = abstractC11462;
                            str4 = strM10790;
                            i29 = i;
                            i28 = iM113012 ^ 1265054307;
                        } else {
                            sArr2 = sArr7;
                            int iM113013 = (i25 - ThreadFactoryC3888.m11306("۟ۜ")) * 115;
                            i5 = ((iM113013 ^ i26) * (-7893)) ^ (-903465080);
                            i28 = iM113013 ^ 1012561493;
                            c6936 = this;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            sArr5 = sArr2;
                            str4 = strM10790;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        }
                        break;
                    case -390987184:
                    case 1139058759:
                        break;
                    case -159514398:
                    case 501667331:
                        try {
                            C19806.m45014(C4716.f16636, new Runnable() { // from class: l.ܽ᩸᩹
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        abstractC11466.mo23741(false);
                                    } catch (IOException unused) {
                                    }
                                }
                            });
                            iM45029 = (ThreadFactoryC3888.m11306("۬᩵") ^ i25) * (-55);
                            i3 = ((iM45029 ^ i26) * 15511) ^ (-1323280645);
                            i4 = 50264978;
                        } catch (Throwable th3) {
                            th = th3;
                            iM45029 = C19806.m45029("ۡ۟") ^ i25;
                            i3 = ((iM45029 ^ i26) * (-19235)) ^ 615866902;
                            i4 = -52937738;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case -21741235:
                    case 1069942322:
                        printStream.println(C10634.m26821(sArr6, i30, 41, i29));
                        return;
                    case 24436827:
                    case 1855129091:
                        abstractC11465.m28627();
                        it2.remove();
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i26;
                        i3 = ((iM45029 ^ i25) * 9753) ^ (-1702268150);
                        i4 = -51542266;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case 176265611:
                    case 1535180152:
                        C0817.m3399();
                        if (C2642.f10294 <= 0) {
                            iM45029 = (C19806.m45029("ۤ᩻") ^ i25) * (-35);
                            i3 = ((iM45029 ^ i26) * (-25249)) ^ (-1129845792);
                            i4 = -1304823305;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        } else {
                            strM10790 = str4;
                            i = i29;
                            sArr2 = sArr5;
                            abstractC11462 = abstractC11466;
                            interfaceC6026 = interfaceC6029;
                            z2 = z9;
                            i7 = i31;
                            int iM113014 = (i25 - ThreadFactoryC3888.m11306("۟ۜ")) * 115;
                            i5 = ((iM113014 ^ i26) * (-7893)) ^ (-903465080);
                            i28 = iM113014 ^ 1012561493;
                            c6936 = this;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            sArr5 = sArr2;
                            str4 = strM10790;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        }
                        break;
                    case 223208713:
                    case 1548340893:
                        it = c14638.iterator();
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩵") ^ i25) * (-55);
                        i3 = ((iM45029 ^ i26) * 15511) ^ (-1323280645);
                        i4 = 50264978;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case 284003820:
                    case 642818027:
                        c6936.f23348 = true;
                        i19 = 0;
                        int iM450217 = (i25 - C19806.m45029("ᩳ֡")) * 87;
                        int i39 = i19;
                        i27 = ((iM450217 ^ i26) * (-31535)) ^ (-1270418587);
                        i28 = iM450217 ^ 454595821;
                        abstractC11466 = abstractC11466;
                        i29 = i29;
                        i30 = i30;
                        i32 = i39;
                        break;
                    case 513083227:
                    case 1574230162:
                        AbstractC11462 abstractC11468 = (AbstractC11462) C0216.m1584(it2);
                        try {
                            zMo13037 = abstractC11468.mo13036();
                            int iM450218 = C19806.m45029("ܺ۟") ^ i26;
                            i28 = iM450218 ^ (-434235704);
                            i27 = ((iM450218 ^ i25) * (-16095)) ^ 1683901976;
                            abstractC11465 = abstractC11468;
                        } catch (Throwable th4) {
                            th = th4;
                            abstractC11465 = abstractC11468;
                            iM45029 = C19806.m45029("ۡ۟") ^ i25;
                            i3 = ((iM45029 ^ i26) * (-19235)) ^ 615866902;
                            i4 = -52937738;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        }
                        break;
                    case 573039570:
                    case 1727042641:
                        i12 = 34996;
                        int iM450219 = (i25 - C19806.m45029("ۛۘ")) * 99;
                        sArr5 = sArr5;
                        i31 = i31;
                        z9 = z9;
                        interfaceC6029 = interfaceC6029;
                        abstractC11466 = abstractC11466;
                        str4 = str4;
                        i29 = i12;
                        i28 = iM450219 ^ (-1577036918);
                        i27 = ((iM450219 ^ i26) * (-2391)) ^ (-2143753913);
                        c6936 = this;
                        break;
                    case 584072580:
                    case 2025536961:
                        if (C1875.m6086() == 0) {
                            str = str4;
                            i = i29;
                            s = s2;
                            sArr = sArr5;
                            abstractC11462 = abstractC11466;
                            interfaceC6025 = interfaceC6029;
                            z = z9;
                            i2 = i31;
                            iM450210 = C19806.m45029("֫᩻") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-10871)) ^ (-646183298);
                            i6 = 300673456;
                            s2 = s;
                            i31 = i2;
                            z9 = z;
                            interfaceC6029 = interfaceC6025;
                            sArr5 = sArr;
                            str4 = str;
                            c6936 = this;
                            i28 = iM450210 ^ i6;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        } else {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۤ᩶")) * (-63);
                            i3 = ((iM45029 ^ i25) * (-12477)) ^ 1622611189;
                            i4 = -1751708215;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        }
                        break;
                    case 671565185:
                    case 969357137:
                        zMo13036 = C7105.m18981(c11545).mo13036();
                        iM45029 = ThreadFactoryC3888.m11306("ۖۜ") ^ i25;
                        i3 = ((iM45029 ^ i26) * 6427) ^ 1237143116;
                        i4 = 1905771644;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case 735363852:
                    case 996784171:
                        if (zMo13038) {
                            z6 = z7;
                            iM45029 = (C19806.m45029("ܺ֨") ^ i25) * (-29);
                            i3 = ((iM45029 ^ i26) * 15823) ^ (-111345377);
                            i4 = 284782691;
                        } else {
                            iM45029 = C19806.m45029("֫ۢ") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-21489)) ^ (-885653747);
                            i4 = -1934530480;
                        }
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case 736247107:
                    case 955877082:
                        if (!C0526.f2219) {
                            iM45029 = C19806.m45029("֡ۖ") ^ i26;
                            i3 = ((iM45029 ^ i25) * (-27141)) ^ (-1869423688);
                            i4 = -218136824;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        } else {
                            strM10790 = str4;
                            i = i29;
                            sArr2 = sArr5;
                            abstractC11462 = abstractC11466;
                            interfaceC6026 = interfaceC6029;
                            z2 = z9;
                            i7 = i31;
                            int iM113015 = (i25 - ThreadFactoryC3888.m11306("۟ۜ")) * 115;
                            i5 = ((iM113015 ^ i26) * (-7893)) ^ (-903465080);
                            i28 = iM113015 ^ 1012561493;
                            c6936 = this;
                            i31 = i7;
                            z9 = z2;
                            interfaceC6029 = interfaceC6026;
                            sArr5 = sArr2;
                            str4 = strM10790;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        }
                        break;
                    case 877345879:
                    case 1612737588:
                        boolean z13 = c6936.f23342;
                        int iM113016 = (ThreadFactoryC3888.m11306("ܽۘ") + i25) * 127;
                        z5 = z13;
                        i27 = ((iM113016 ^ i26) * 28243) ^ (-29384515);
                        i28 = iM113016 ^ (-1623531233);
                        break;
                    case 889839901:
                    case 1487793683:
                        if (C1460.f5948 >= 0) {
                            i = i29;
                            iM11307 = (C19806.m45029("ۢᩳ") + i25) * (-111);
                            abstractC11462 = abstractC11466;
                            i5 = ((iM11307 ^ i26) * 13899) ^ (-1863515568);
                            i18 = -2024812066;
                            i28 = iM11307 ^ i18;
                            i27 = i5;
                            abstractC11466 = abstractC11462;
                            i29 = i;
                        } else {
                            iM45029 = (i26 - ThreadFactoryC3888.m11306("ۤ᩶")) * (-63);
                            i3 = ((iM45029 ^ i25) * (-12477)) ^ 1622611189;
                            i4 = -1751708215;
                            i28 = iM45029 ^ i4;
                            i27 = i3;
                        }
                        break;
                    case 905566782:
                    case 1797828234:
                        return;
                    case 1085272710:
                    case 1387594511:
                        c14638.m35141();
                        iM45029 = (i26 - ThreadFactoryC3888.m11306("᩹ܰ")) * 31;
                        i3 = ((iM45029 ^ i25) * 25831) ^ (-785422746);
                        i4 = 2058078506;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                    case 1354247159:
                    case 2096337162:
                        str = str4;
                        i = i29;
                        abstractC11462 = abstractC11466;
                        interfaceC6025 = interfaceC6029;
                        short[] sArr8 = sArr5;
                        z = z9;
                        i2 = i31;
                        i21 = i20 * i20;
                        s = s2;
                        i22 = s * s;
                        i23 = 200562244;
                        if (RunnableC0195.m1431()) {
                            iM450210 = C19806.m45029("ܰ᩻") ^ i25;
                            sArr = sArr8;
                            i5 = ((iM450210 ^ i26) * (-10819)) ^ 2103204765;
                            i6 = 1018243056;
                        } else {
                            sArr = sArr8;
                            iM450210 = ThreadFactoryC3888.m11306("ۚۜ") ^ i26;
                            i5 = ((iM450210 ^ i25) * (-30865)) ^ (-1324195155);
                            i6 = 1137151834;
                        }
                        s2 = s;
                        i31 = i2;
                        z9 = z;
                        interfaceC6029 = interfaceC6025;
                        sArr5 = sArr;
                        str4 = str;
                        c6936 = this;
                        i28 = iM450210 ^ i6;
                        i27 = i5;
                        abstractC11466 = abstractC11462;
                        i29 = i;
                        break;
                    default:
                        z6 = false;
                        iM45029 = (C19806.m45029("ܺ֨") ^ i25) * (-29);
                        i3 = ((iM45029 ^ i26) * 15823) ^ (-111345377);
                        i4 = 284782691;
                        i28 = iM45029 ^ i4;
                        i27 = i3;
                        break;
                }
            }
            int i40 = i29;
            AbstractC11462 abstractC11469 = abstractC11466;
            InterfaceC6025 interfaceC60210 = interfaceC6029;
            String str5 = str4;
            boolean zM5579 = C1668.m5579(interfaceC60210, str5, false);
            C11545 c11547 = c6936.f23330;
            C11545 c11548 = c6936.f23327;
            if (zM5579) {
                iM450212 = C19806.m45029("ۤۗ") ^ i26;
                i16 = ((iM450212 ^ i25) * (-20171)) ^ (-1522152642);
                i17 = -1968540985;
            } else {
                iM450212 = (C19806.m45029("ۢܽ") ^ i25) * 115;
                i16 = ((iM450212 ^ i26) * (-13823)) ^ (-863610497);
                i17 = 1083996302;
            }
            i28 = iM450212 ^ i17;
            i27 = i16;
            interfaceC6029 = interfaceC60210;
            abstractC11466 = abstractC11469;
            i29 = i40;
            str4 = str5;
            c11546 = c11547;
            c11545 = c11548;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18635() {
        if (!this.f23333.m48979()) {
            C8765 c8765 = this.f23336;
            if (c8765 != null && c8765.m22815()) {
                return true;
            }
            this.f23333.m48988();
            return true;
        }
        return m18646().m28789();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18637() {
        this.f23333.m48988();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m18654() {
        C11545 c11545M18646 = m18646();
        if (c11545M18646.f38808.m36132()) {
            this.f23319.m20965();
            return;
        }
        AbstractC22752 abstractC22752M20959 = this.f23319.m20959(0);
        abstractC22752M20959.getClass();
        ((C14991) abstractC22752M20959).m35969(c11545M18646.m28805());
        AbstractC22752 abstractC22752M209510 = this.f23319.m20959(1);
        abstractC22752M209510.getClass();
        ((C14991) abstractC22752M209510).m35969(c11545M18646.m28764());
        AbstractC22752 abstractC22752M209511 = this.f23319.m20959(2);
        abstractC22752M209511.getClass();
        ((C17812) abstractC22752M209511).m41398(!c11545M18646.m28821() || c11545M18646.m28817().mo23629());
        AbstractC22752 abstractC22752M209512 = this.f23319.m20959(3);
        abstractC22752M209512.getClass();
        ((C14991) abstractC22752M209512).m35969(c11545M18646.m28817().mo13042());
        this.f23319.m20956();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18650(boolean z) {
        if (this.f23342 == z) {
            return;
        }
        m18611(false);
        this.f23342 = z;
        this.f23349.m46295(1.0f);
        this.f23338.m46295(1.0f);
        this.f23329.setAlpha(1.0f);
        this.f23337.setAlpha(1.0f);
        this.f23349.setVisibility(z ? 0 : 8);
        this.f23338.setVisibility(z ? 8 : 0);
        this.f23323.m42983(z);
        this.f23327.m28788(z);
        this.f23330.m28788(!z);
        m18654();
        m18658();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18633(boolean z, float f) {
        if (this.f23342 == z) {
            return;
        }
        if (f == 0.0f) {
            this.f23349.setVisibility(!z ? 0 : 8);
            this.f23338.setVisibility(z ? 0 : 8);
            this.f23349.m46295(1.0f);
            this.f23338.m46295(1.0f);
            this.f23329.setAlpha(1.0f);
            this.f23337.setAlpha(1.0f);
            return;
        }
        (z ? this.f23337 : this.f23329).setAlpha(1.0f - (0.5f * f));
        if (z) {
            this.f23349.m46295(f);
            this.f23338.m46295(1.0f - f);
        } else {
            this.f23349.m46295(1.0f - f);
            this.f23338.m46295(f);
        }
        if (this.f23349.getVisibility() != 0) {
            this.f23349.setVisibility(0);
        }
        if (this.f23338.getVisibility() != 0) {
            this.f23338.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m18640() {
        return this.f23342;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18629(C1439 c1439) {
        this.f23320 = c1439;
        c1439.m5029(new C1291(this));
        m18658();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18656() {
        C1439 c1439 = this.f23320;
        if (c1439 != null) {
            c1439.m5026();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m18658() {
        if (this.f23320 == null) {
            return;
        }
        C6605 c6605 = m18646().f38811;
        if (c6605.m17913()) {
            this.f23320.m5034(false);
            this.f23320.m5028(c6605.m17914());
        } else {
            this.f23320.m5026();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18644(boolean z) {
        if (this.f23320 == null) {
            return;
        }
        if (z) {
            C9080.m23413();
        }
        this.f23320.m5034(true);
        C6605 c6605 = m18646().f38811;
        if (c6605.m17913()) {
            return;
        }
        this.f23320.m5028((String) null);
        c6605.m17912(true);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m18620() {
        this.f23327.f38826.m16164();
        this.f23330.f38826.m16164();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11545 m18646() {
        return this.f23342 ? this.f23327 : this.f23330;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18659() {
        m18650(!this.f23342);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11545 m18623() {
        return this.f23327;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11545 m18662() {
        return this.f23330;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18648(String str) {
        this.f23339.setTitle(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18626(CharSequence charSequence) {
        this.f23339.m31025().setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18660() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f23339.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f23339.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Main m18638() {
        return this.f23339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewGroup m18624(boolean z) {
        return z ? this.f23345 : this.f23316;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18627(Runnable runnable) {
        this.f23334.add(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18628(String str) {
        C11545 c11545 = this.f23330;
        C11545 c11546 = this.f23327;
        if (this.f23317) {
            return;
        }
        C14638<AbstractC11462> c14638 = this.f23322;
        if (c14638.m35143()) {
            C16737.m39273(new RunnableC19991(2, str));
            return;
        }
        this.f23317 = true;
        c14638.m35141();
        try {
            Iterator<E> it = c14638.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC11462 abstractC11462 = (AbstractC11462) it.next();
                if (!abstractC11462.mo13036()) {
                    abstractC11462.m28627();
                    it.remove();
                    z = true;
                }
            }
            if (!c11546.m28817().mo13036()) {
                m18630(c11546);
                z = false;
            }
            if (!c11545.m28817().mo13036()) {
                m18630(c11545);
                z = false;
            }
            if (this.f23342) {
                c11546.m28792(str);
                c11545.m28792(str);
            } else {
                c11545.m28792(str);
                c11546.m28792(str);
            }
            for (final AbstractC11462 abstractC11463 : c14638) {
                if (abstractC11463.mo23633(str)) {
                    C4716.f16636.execute(new Runnable() { // from class: l.ۢ᩸᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                abstractC11463.mo23741(false);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
            if (z) {
                C23561.m51925();
            }
            c14638.m35142();
            this.f23317 = false;
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18641() {
        boolean z = this.f23342;
        C11545 c11545 = this.f23330;
        C11545 c11546 = this.f23327;
        if (z) {
            c11546.m28817().mo13038(c11546);
            c11545.m28817().mo13038(c11545);
        } else {
            c11545.m28817().mo13038(c11545);
            c11546.m28817().mo13038(c11546);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m18657() {
        this.f23324 = true;
        m18611(false);
        this.f23327.m28791();
        this.f23330.m28791();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14638 m18621() {
        return this.f23322;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m18661() {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        for (int i = 0; i < c14638.size(); i++) {
            try {
                if (((AbstractC11462) c14638.get(i)) instanceof C11672) {
                    return i;
                }
            } finally {
                c14638.m35142();
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18599(boolean z) {
        FloatingActionButton floatingActionButton = z ? this.f23344 : this.f23350;
        FloatingActionButton floatingActionButton2 = z ? this.f23328 : this.f23332;
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C20368.f65970));
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(C20368.f65983));
        floatingActionButton.setImageTintList(ColorStateList.valueOf(C20368.f65965));
        floatingActionButton2.setImageTintList(ColorStateList.valueOf(C20368.f65965));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18601(FloatingActionButton floatingActionButton) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
        return (floatingActionButton.getHeight() != 0 ? floatingActionButton.getHeight() : floatingActionButton.getMeasuredHeight()) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18634(boolean z, boolean z2) {
        m18611(true);
        if (z) {
            if (this.f23343) {
                return;
            } else {
                this.f23343 = true;
            }
        } else if (this.f23325) {
            return;
        } else {
            this.f23325 = true;
        }
        FloatingActionButton floatingActionButton = z ? this.f23344 : this.f23350;
        FloatingActionButton floatingActionButton2 = z ? this.f23328 : this.f23332;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z2) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 1.0f, 0.0f));
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, m18601(floatingActionButton));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, m18601(floatingActionButton2));
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        duration.addListener(new C4113(floatingActionButton, floatingActionButton2));
        duration.start();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18655() {
        m18611(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m18611(boolean z) {
        this.f23341.removeCallbacks(this.f23347);
        this.f23341.animate().setListener(null).cancel();
        if (!z || this.f23341.getVisibility() != 0 || this.f23341.getAlpha() == 0.0f) {
            this.f23341.setVisibility(8);
            this.f23341.setAlpha(1.0f);
        } else {
            this.f23341.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new C13287(this)).start();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m18618(boolean z) {
        AccessibilityManager accessibilityManager;
        C11545 c11545 = z ? this.f23327 : this.f23330;
        if (!this.f23324 && this.f23342 == z && c11545.m28821() && this.f23339.getLifecycle().mo9170().m24173(EnumC9414.RESUMED)) {
            int iM33769 = C13932.m33769(12.0f);
            ViewGroup viewGroup = (ViewGroup) this.f23341.getParent();
            int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (iM33769 * 2);
            int iM20966 = this.f23319.m20966();
            if (!this.f23319.isShown() || width <= 0 || iM20966 <= 0) {
                return;
            }
            this.f23341.setBackgroundResource(C16135.m38192(this.f23339.getTheme(), R.attr.MT_Protector));
            this.f23341.setTextColor(C16135.m38189(this.f23339.getTheme(), R.attr.MT_Protector));
            this.f23341.setMaxWidth(width);
            this.f23341.setTextSize(2, 14.0f);
            this.f23341.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.f23341.getLineCount() > 1) {
                this.f23341.setTextSize(2, 13.0f);
            }
            TextView textView = this.f23341;
            textView.setMinHeight(C13932.m33769(24.0f) + textView.getLineHeight());
            this.f23341.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            C11795 c11795 = (C11795) this.f23341.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c11795).bottomMargin = Math.max(0, (iM20966 - this.f23341.getMeasuredHeight()) / 2) + (this.f23319.getHeight() - iM20966);
            this.f23341.setLayoutParams(c11795);
            this.f23341.animate().setListener(null).cancel();
            this.f23341.setAlpha(0.0f);
            this.f23341.setVisibility(0);
            this.f23341.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            int i = Build.VERSION.SDK_INT;
            int recommendedTimeoutMillis = OpenAuthTask.SYS_ERR;
            if (i >= 29 && (accessibilityManager = (AccessibilityManager) this.f23339.getSystemService("accessibility")) != null) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(OpenAuthTask.SYS_ERR, 2);
            }
            this.f23341.postDelayed(this.f23347, recommendedTimeoutMillis);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18651(boolean z, boolean z2) {
        if (z2) {
            m18611(false);
        }
        if (!z ? this.f23325 : this.f23343) {
            if (z2) {
                m18618(z);
                return;
            }
            return;
        }
        if ((z ? this.f23344 : this.f23350) == null) {
            int i = z ? R.id.MT_Protector : R.id.MT_Protector;
            Main main = this.f23339;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ((ViewStub) main.m31016(i)).inflate();
            ViewOnClickListenerC4819 viewOnClickListenerC4819 = this.f23326;
            floatingActionButton.setOnClickListener(viewOnClickListenerC4819);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ((ViewStub) main.m31016(z ? R.id.MT_Protector : R.id.MT_Protector)).inflate();
            floatingActionButton2.setOnClickListener(viewOnClickListenerC4819);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton2.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            if (z) {
                this.f23328 = floatingActionButton;
                this.f23344 = floatingActionButton2;
            } else {
                this.f23332 = floatingActionButton;
                this.f23350 = floatingActionButton2;
            }
            m18599(z);
        }
        if (z) {
            this.f23343 = false;
        } else {
            this.f23325 = false;
        }
        FloatingActionButton floatingActionButton3 = z ? this.f23344 : this.f23350;
        FloatingActionButton floatingActionButton4 = z ? this.f23328 : this.f23332;
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        float fM18601 = m18601(floatingActionButton3);
        floatingActionButton3.setTranslationY(fM18601);
        floatingActionButton3.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", fM18601, 0.0f);
        float fM18602 = m18601(floatingActionButton4);
        floatingActionButton4.setTranslationY(fM18602);
        floatingActionButton4.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", fM18602, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (z2) {
            m18618(z);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18625(Bundle bundle) {
        C11545 c11545 = this.f23330;
        C11545 c11546 = this.f23327;
        C11018 c11018 = new C11018();
        c11018.m27784(this.f23342);
        C11672.m29125(c11018);
        C14638<AbstractC11462> c14638 = this.f23322;
        c14638.m35141();
        try {
            AbstractC11462 abstractC11462M28817 = c11546.m28817();
            c11018.m27786(abstractC11462M28817.mo13039());
            abstractC11462M28817.mo13032(c11018);
            c11546.m28784(c11018);
            AbstractC11462 abstractC11462M28818 = c11545.m28817();
            c11018.m27786(abstractC11462M28818.mo13039());
            abstractC11462M28818.mo13032(c11018);
            c11545.m28784(c11018);
            c11018.mo24508(c14638.size());
            for (AbstractC11462 abstractC11462 : c14638) {
                c11018.m27786(abstractC11462.mo13039());
                abstractC11462.mo13032(c11018);
            }
            c14638.m35142();
            bundle.putByteArray("WindowManagerData", c11018.m27798());
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18622() {
        C14638 c14638 = this.f23322;
        c14638.m35141();
        try {
            this.f23327.m28817().m28627();
            this.f23330.m28817().m28627();
            Iterator it = new ArrayList(c14638).iterator();
            while (it.hasNext()) {
                ((AbstractC11462) it.next()).m28627();
            }
            c14638.m35142();
        } catch (Throwable th) {
            c14638.m35142();
            throw th;
        }
    }
}
