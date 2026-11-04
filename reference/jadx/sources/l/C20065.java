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
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes5.dex */
public final class C20065 {

    /* JADX INFO: renamed from: ۡۨ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f64480 = {6573, 9615, 9617, 9623, 9622, 9628, 9619, 9622, 9623, 9679, 9683, 9679, 9675, 9683, 9676, 9676, 9651, 9618, 9609, 9620, 9627, 9604, 9649, 9618, 9630, 9628, 9617, 9659, 9620, 9617, 9624, 9662, 9621, 9628, 9619, 9626, 9624, 9625, 9693, 9609, 9618, 9618, 9693, 9627, 9628, 9614, 9609, 9681, 9693, 9620, 9626, 9619, 9618, 9615, 9624, 9625, 9692};

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static long f64481;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static String f64482;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static long f64483;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f64485;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f64486;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19987 f64487;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f64488;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C16803 f64491;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8147 f64492;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10730 f64493;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8614 f64494;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C10730 f64496;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f64497;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7198 f64499;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19987 f64501;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7308 f64503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Main f64504;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23192 f64507;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ViewGroup f64509;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f64510;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f64511;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f64512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewGroup f64513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16468 f64514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11870 f64515;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C8614 f64517;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23192 f64518;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f64495 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f64506 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2935 f64490 = new C2935();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RunnableC19121 f64508 = new Runnable() { // from class: l.ᩳܰܳ
        @Override // java.lang.Runnable
        public final void run() {
            this.f61887.m46166();
        }
    };

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC10170 f64500 = new ViewOnClickListenerC10170(0, this);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C24720 f64489 = C24720.m55194(200);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64505 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f64502 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24720 f64484 = C24720.m55194(50);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64516 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f64498 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46119(C20065 c20065, View view) {
        C8614 c8614 = c20065.f64494;
        C8614 c8615 = c20065.f64517;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c20065.m46176(true);
            c8615.m23207();
            return;
        }
        if (id == R.id.MT_Protector) {
            c20065.m46176(false);
            c8614.m23207();
        } else if (id == R.id.MT_Protector) {
            c20065.m46176(true);
            c8615.m23189();
        } else if (id == R.id.MT_Protector) {
            c20065.m46176(false);
            c8614.m23189();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ᩳܰܳ] */
    public C20065(Main main, Bundle bundle) {
        this.f64504 = main;
        this.f64518 = (C23192) main.m40418(R.id.MT_Protector);
        this.f64507 = (C23192) main.m40418(R.id.MT_Protector);
        this.f64515 = (C11870) main.m40418(R.id.MT_Protector);
        this.f64501 = (C19987) main.m40418(R.id.MT_Protector);
        this.f64487 = (C19987) main.m40418(R.id.MT_Protector);
        C8147 c8147 = (C8147) main.m40418(R.id.MT_Protector);
        this.f64492 = c8147;
        this.f64487.m45948(c8147);
        this.f64499 = (C7198) main.m40418(R.id.MT_Protector);
        this.f64513 = (ViewGroup) main.m40418(R.id.MT_Protector);
        this.f64509 = (ViewGroup) main.m40418(R.id.MT_Protector);
        this.f64513.setOnClickListener(new View.OnClickListener() { // from class: l.ۖܰܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20065.m46132(this.f9070, view);
            }
        });
        this.f64509.setOnClickListener(new ViewOnClickListenerC8679(0, this));
        this.f64515.m29743(this.f64492);
        this.f64515.m29742(this.f64499);
        this.f64499.m19777(new C7188());
        C10730 c10730 = (C10730) main.m40418(R.id.MT_Protector);
        this.f64493 = c10730;
        c10730.m27326(true);
        c10730.m27325(new C6443(this));
        C10730 c10731 = (C10730) main.m40418(R.id.MT_Protector);
        this.f64496 = c10731;
        c10731.m27326(false);
        c10731.m27325(new C24343(this));
        this.f64510 = (TextView) main.m40418(R.id.MT_Protector);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.ۘܰܳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C20065.m46118(this.f15358, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.f64493.addOnLayoutChangeListener(onLayoutChangeListener);
        this.f64496.addOnLayoutChangeListener(onLayoutChangeListener);
        final int iM19160 = C6907.m19160(25.0f);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: l.ܰܰܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C20065.m46122(this.f47914, iM19160, view, motionEvent);
            }
        };
        this.f64501.m45947(onTouchListener);
        this.f64487.m45947(onTouchListener);
        this.f64514 = new C16468(this, main);
        this.f64515.m29741();
        this.f64515.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f64515.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f64515.m29754(R.drawable.MT_Protector, 45);
        C16803 c16803 = new C16803(this.f64515);
        this.f64491 = c16803;
        this.f64515.m29739(c16803).m37328();
        this.f64515.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f64515.setOnClickListener(new View.OnClickListener() { // from class: l.ܿܰܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20065.m46123(this.f59872);
            }
        });
        this.f64515.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡ܰܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C20065.m46117(this.f2106);
                return true;
            }
        });
        this.f64504.m124(new RunnableC16899(3, this));
        main.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.᩶ܰܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C20065.m46121(this.f68035, enumC9330);
            }
        });
        boolean z = this.f64506;
        if (bundle == null || !bundle.containsKey("WindowManagerData")) {
            boolean zEquals = C17359.equals(ApplicationC17729.f58262.getString("load_path_left", "0"), "0");
            boolean zEquals2 = C17359.equals(ApplicationC17729.f58262.getString("load_path_right", "0"), "0");
            String strMo4294 = C6382.f21566.mo4294();
            String string = ApplicationC17729.f58258.getString("home_path_left", strMo4294);
            String string2 = ApplicationC17729.f58258.getString("home_path_right", strMo4294);
            String string3 = ApplicationC17729.f58258.getString("last_path_left", string);
            String string4 = ApplicationC17729.f58258.getString("last_path_right", string2);
            string = zEquals ? string : string3;
            String str = zEquals2 ? string2 : string4;
            this.f64517 = new C8614(this, this.f64501, new C7495(string), true, null);
            this.f64494 = new C8614(this, this.f64487, new C7495(str), false, null);
        } else {
            C20348 c20348M46740 = C20348.m46740(bundle.getByteArray("WindowManagerData"));
            boolean zM46753 = c20348M46740.m46753();
            C7495.m20539(c20348M46740);
            this.f64517 = new C8614(this, this.f64501, C1398.m5107(c20348M46740), true, c20348M46740);
            this.f64494 = new C8614(this, this.f64487, C1398.m5107(c20348M46740), false, c20348M46740);
            int iM46749 = c20348M46740.m46749();
            for (int i = 0; i < iM46749; i++) {
                this.f64490.add(C1398.m5107(c20348M46740));
            }
            C3966.m12724(1000);
            z = zM46753;
        }
        this.f64517.m23183(this.f64494);
        this.f64494.m23183(this.f64517);
        this.f64517.m23187(true);
        this.f64494.m23187(false);
        m46172();
        m46176(z);
        this.f64504.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ۡܰܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C20065.m46133(this.f30582, enumC9330);
            }
        });
        C7023.f23168.m40350(main, new C1222(0, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46120(C20065 c20065, EnumC8514 enumC8514) {
        if (enumC8514.m22826()) {
            return;
        }
        C8614 c8614 = c20065.f64494;
        C8614 c8615 = c20065.f64517;
        C2935 c2935 = c20065.f64490;
        c2935.m9583();
        try {
            int size = c2935.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractC7364 abstractC7364 = (AbstractC7364) c2935.get(size);
                if ((abstractC7364 instanceof C6728) && !(((AbstractC18881) abstractC7364.mo10174()).m43788() instanceof C21799)) {
                    c2935.m9583();
                    try {
                        c20065.m46137(size);
                        c2935.m9584();
                    } catch (Throwable th) {
                        c2935.m9584();
                        throw th;
                    }
                }
            }
            if (c8615.m23228(b.k) && !(((AbstractC18881) c8615.m23213().mo10174()).m43788() instanceof C21799)) {
                c20065.m46148(c8615);
            }
            if (c8614.m23228(b.k) && !(((AbstractC18881) c8614.m23213().mo10174()).m43788() instanceof C21799)) {
                c20065.m46148(c8614);
            }
            c2935.m9584();
        } catch (Throwable th2) {
            c2935.m9584();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46133(C20065 c20065, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_PAUSE) {
            if (f64482 != null) {
                if (SystemClock.uptimeMillis() < f64481) {
                    c20065.f64486 = f64482;
                    f64483 = SystemClock.uptimeMillis() + 200;
                }
                f64482 = null;
                return;
            }
            return;
        }
        if (enumC9330 == EnumC9330.ON_RESUME) {
            String str = c20065.f64486;
            c20065.f64486 = null;
            if (str == null || SystemClock.uptimeMillis() <= f64483) {
                return;
            }
            c20065.m46155().f28159.m12743(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m46164() {
        String str = this.f64486;
        this.f64486 = null;
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46174(String str) {
        this.f64486 = str;
        if (this.f64504.getLifecycle().mo23076().m8762(EnumC2619.RESUMED)) {
            String str2 = this.f64486;
            this.f64486 = null;
            if (str2 == null || SystemClock.uptimeMillis() <= f64483) {
                return;
            }
            m46155().f28159.m12743(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46115(InterfaceC2386 interfaceC2386) {
        m46116(interfaceC2386, 2000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46116(InterfaceC2386 interfaceC2386, int i) {
        f64482 = interfaceC2386.getPath();
        f64481 = SystemClock.uptimeMillis() + ((long) i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46173() {
        this.f64490.m9583();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46157() {
        this.f64490.m9584();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46132(C20065 c20065, View view) {
        if (c20065.f64517.m23193()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46124(C20065 c20065, View view) {
        if (c20065.f64494.m23193()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46118(C20065 c20065, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c20065.m46130(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46122(C20065 c20065, int i, View view, MotionEvent motionEvent) {
        if (!c20065.f64492.m22057(8388611)) {
            if (motionEvent.getAction() == 0) {
                c20065.m46130(true);
                if (view != c20065.f64501) {
                    c20065.f64493.m28845();
                    c20065.m46176(false);
                } else if (motionEvent.getX() >= i) {
                    c20065.f64496.m28845();
                    c20065.m46176(true);
                }
            }
            if (view == c20065.f64501) {
                return c20065.f64517.f28159.f13556.onTouch(view, motionEvent);
            }
            return c20065.f64494.f28159.f13556.onTouch(view, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46121(C20065 c20065, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_PAUSE) {
            c20065.m46130(false);
            AbstractC7364 abstractC7364M23213 = c20065.f64517.m23213();
            AbstractC7364 abstractC7364M23214 = c20065.f64494.m23213();
            C2935<AbstractC7364> c2935 = c20065.f64490;
            c2935.m9583();
            try {
                if (!(abstractC7364M23213 instanceof C7495)) {
                    for (AbstractC7364 abstractC7364 : c2935) {
                        if (abstractC7364 instanceof C7495) {
                            abstractC7364M23213 = abstractC7364;
                        }
                    }
                }
                if (!(abstractC7364M23214 instanceof C7495)) {
                    for (AbstractC7364 abstractC7365 : c2935) {
                        if (abstractC7365 != abstractC7364M23213 && (abstractC7365 instanceof C7495)) {
                            abstractC7364M23214 = abstractC7365;
                        }
                    }
                }
                c2935.m9584();
                ApplicationC17729.f58258.edit().putString("last_path_left", abstractC7364M23213.m20193()).putString("last_path_right", abstractC7364M23214.m20193()).apply();
            } catch (Throwable th) {
                c2935.m9584();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m46167() {
        return this.f64514.m39055();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46131(C20065 c20065) {
        c20065.m46130(false);
        c20065.f64501.setSelector(C17423.m40909());
        c20065.f64487.setSelector(C17423.m40909());
        c20065.f64517.f28159.m12740();
        c20065.f64494.f28159.m12740();
        c20065.f64515.m29745();
        c20065.f64493.m27324(C3296.f10750);
        c20065.f64496.m27324(C3296.f10750);
        c20065.m46136(true);
        c20065.m46136(false);
        float fIntBitsToFloat = Float.intBitsToFloat(C23434.m52632(c20065.f64504.getTheme(), R.attr.MT_Protector));
        c20065.f64518.setAlpha(fIntBitsToFloat);
        c20065.f64507.setAlpha(fIntBitsToFloat);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
        ((ProgressBar) c20065.f64513.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ((ProgressBar) c20065.f64509.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        Button button = (Button) c20065.f64513.getChildAt(1);
        Button button2 = new Button(c20065.f64504);
        button.setTextColor(button2.getTextColors());
        button.setBackground(button2.getBackground());
        ((TextView) c20065.f64513.getChildAt(2)).setTextColor(C3296.f10764);
        Button button3 = (Button) c20065.f64509.getChildAt(1);
        Button button4 = new Button(c20065.f64504);
        button3.setTextColor(button4.getTextColors());
        button3.setBackground(button4.getBackground());
        ((TextView) c20065.f64509.getChildAt(2)).setTextColor(C3296.f10764);
        c20065.f64514.m39056();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46150(C8614 c8614, AbstractC7364 abstractC7364) {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            AbstractC7364 abstractC7364M23213 = c8614.m23213();
            if (abstractC7364M23213.mo20215()) {
                c2935.add(abstractC7364M23213);
                abstractC7364M23213.mo18800();
            } else {
                if (abstractC7364M23213.m20204() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC7364M23213.m20210();
            }
            c8614.m23227(abstractC7364);
            c2935.m9584();
            C8287.m22382();
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46148(C8614 c8614) {
        AbstractC7364 abstractC7364;
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            if (c2935.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC7364 abstractC7364M23213 = c8614.m23213();
            if (abstractC7364M23213.m20204() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            int iM20204 = abstractC7364M23213.m20204();
            abstractC7364M23213.m20210();
            if (iM20204 == 0) {
                abstractC7364 = null;
                break;
            }
            Iterator<E> it = c2935.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC7364 = null;
                    break;
                }
                abstractC7364 = (AbstractC7364) it.next();
                if (abstractC7364.m20191() == iM20204) {
                    it.remove();
                    break;
                }
            }
            if (abstractC7364 == null) {
                Iterator<E> it2 = c2935.iterator();
                while (it2.hasNext()) {
                    AbstractC7364 abstractC7365 = (AbstractC7364) it2.next();
                    if (abstractC7365 instanceof C7495) {
                        it2.remove();
                        abstractC7364 = abstractC7365;
                        break;
                    }
                }
            }
            if (abstractC7364 == null) {
                abstractC7364 = (AbstractC7364) c2935.remove(c2935.size() - 1);
            }
            c8614.m23227(abstractC7364);
            abstractC7364.mo10168(c8614);
            c2935.m9584();
            C8287.m22382();
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46175(C8614 c8614) {
        AbstractC7364 abstractC7364;
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            if (c2935.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC7364 abstractC7364M23213 = c8614.m23213();
            int iM20204 = abstractC7364M23213.m20204();
            if (iM20204 == 0) {
                abstractC7364 = null;
                break;
            }
            Iterator<E> it = c2935.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC7364 = null;
                    break;
                }
                abstractC7364 = (AbstractC7364) it.next();
                if (abstractC7364.m20191() == iM20204) {
                    it.remove();
                    break;
                }
            }
            if (abstractC7364 == null) {
                Iterator<E> it2 = c2935.iterator();
                while (it2.hasNext()) {
                    AbstractC7364 abstractC7365 = (AbstractC7364) it2.next();
                    if (abstractC7365 instanceof C7495) {
                        it2.remove();
                        abstractC7364 = abstractC7365;
                        break;
                    }
                }
            }
            if (abstractC7364 == null) {
                abstractC7364 = (AbstractC7364) c2935.remove(c2935.size() - 1);
            }
            c2935.add(abstractC7364M23213);
            c8614.m23227(abstractC7364);
            abstractC7364M23213.mo18800();
            abstractC7364.mo10168(c8614);
            c2935.m9584();
            C8287.m22382();
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46149(C8614 c8614, int i, boolean z) {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            boolean zM46134 = m46134(c8614, i, z);
            c2935.m9584();
            if (zM46134) {
                C8287.m22382();
            }
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m46160(int i) {
        C8614 c8614M46155 = m46155();
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            boolean zM46134 = m46134(c8614M46155, m46128(i), true);
            c2935.m9584();
            if (zM46134) {
                C8287.m22382();
            }
            return zM46134;
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46154(int i) {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            return m46137(m46128(i));
        } finally {
            c2935.m9584();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46178(int i) {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            int iM46128 = m46128(i);
            boolean z = false;
            if (iM46128 >= 0 && iM46128 < c2935.size() && ((AbstractC7364) c2935.get(iM46128)).m20204() != 0) {
                z = true;
            }
            return z;
        } finally {
            c2935.m9584();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m46128(int i) {
        C2935 c2935 = this.f64490;
        int size = c2935.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC7364) c2935.get(i2)).m20191() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m46134(C8614 c8614, int i, boolean z) {
        if (i < 0) {
            return false;
        }
        C2935 c2935 = this.f64490;
        if (i >= c2935.size()) {
            return false;
        }
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        AbstractC7364 abstractC7364 = (AbstractC7364) c2935.remove(i);
        if (abstractC7364M23213.mo20215()) {
            c2935.add(abstractC7364M23213);
            abstractC7364M23213.mo18800();
        } else {
            if (abstractC7364M23213.m20204() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            abstractC7364M23213.m20210();
        }
        if (z) {
            c8614.m23227(abstractC7364);
        } else {
            c8614.m23199(abstractC7364);
        }
        abstractC7364.mo10168(c8614);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m46137(int i) {
        if (i < 0) {
            return false;
        }
        C2935 c2935 = this.f64490;
        if (i >= c2935.size()) {
            return false;
        }
        AbstractC7364 abstractC7364 = (AbstractC7364) c2935.remove(i);
        if (abstractC7364.m20204() == 0) {
            throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
        }
        abstractC7364.m20210();
        return true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m46181() {
        C8614 c8614 = this.f64517;
        if (c8614.m23193()) {
            return;
        }
        C8614 c8615 = this.f64494;
        if (c8615.m23193()) {
            return;
        }
        m46130(false);
        C7123 c7123M23161 = c8614.m23161();
        c8614.m23181(c8615.m23161());
        c8615.m23181(c7123M23161);
        if (!c8614.m23218()) {
            m46152(true, false);
        } else {
            m46177(true, false);
        }
        if (!c8615.m23218()) {
            m46152(false, false);
        } else {
            m46177(false, false);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m46123(C20065 c20065) {
        if (c20065.f64489.m55200()) {
            return;
        }
        C8614 c8614M46155 = c20065.m46155();
        if (c20065.f64515.m29750()) {
            int iM29755 = c20065.f64515.m29755();
            if (iM29755 == 0) {
                c8614M46155.m23224();
                return;
            }
            if (iM29755 == 1) {
                c8614M46155.m23163();
                return;
            }
            if (iM29755 == 2) {
                if (c8614M46155.m23213().mo18799()) {
                    new ViewOnClickListenerC16006(c8614M46155).m38140();
                    return;
                } else {
                    if (c8614M46155.m23218()) {
                        return;
                    }
                    c8614M46155.f28158.m36468();
                    return;
                }
            }
            if (iM29755 != 3) {
                if (iM29755 != 4) {
                    return;
                }
                c20065.f64504.getOnBackPressedDispatcher().m19401();
                return;
            } else {
                if (c8614M46155.m23213().mo10178()) {
                    c8614M46155.m23213().mo10163(c8614M46155, c8614M46155.m23236());
                    return;
                }
                return;
            }
        }
        if (c20065.f64515.m29749()) {
            int iM29756 = c20065.f64515.m29755();
            if (iM29756 == 0) {
                int i = ApplicationC17729.f58258.getInt("swipe_select_count", 0);
                if (i < 3) {
                    ApplicationC17729.f58258.edit().mo3486(i + 1, "swipe_select_count").apply();
                }
                c8614M46155.m23206();
                return;
            }
            if (iM29756 == 1) {
                c8614M46155.m23164();
                return;
            }
            if (iM29756 == 2) {
                c8614M46155.m23209();
            } else if (iM29756 == 3) {
                c8614M46155.m23203();
            } else {
                if (iM29756 != 4) {
                    return;
                }
                c20065.f64504.m40396(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46117(C20065 c20065) {
        int iM29755 = c20065.f64515.m29755();
        if (!c20065.f64515.m29750()) {
            if (c20065.f64515.m29749()) {
                if (iM29755 == 3) {
                    c20065.m46155().m23191();
                    return;
                } else {
                    c20065.f64515.m29747(iM29755, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM29755]);
                    return;
                }
            }
            return;
        }
        if (iM29755 == 0) {
            c20065.f64515.m29747(0, R.string.MT_Protector);
            return;
        }
        if (iM29755 == 1) {
            c20065.f64515.m29747(1, R.string.MT_Protector);
            return;
        }
        if (iM29755 == 2) {
            c20065.f64515.m29747(2, c20065.m46155().m23213().mo18799() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        if (iM29755 == 3) {
            c20065.f64515.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            c20065.m46159(false);
        } else {
            if (iM29755 != 4) {
                return;
            }
            new C12277(c20065.m46155()).m30667();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46153() {
        if (!this.f64499.m19781()) {
            C16468 c16468 = this.f64514;
            if (c16468 != null && c16468.m39057()) {
                return true;
            }
            this.f64499.m19780();
            return true;
        }
        return m46155().m23188();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m46170() {
        this.f64499.m19780();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m46172() {
        C8614 c8614M46155 = m46155();
        if (c8614M46155.f28158.m36475()) {
            this.f64515.m29748();
            return;
        }
        AbstractC20075 abstractC20075M29740 = this.f64515.m29740(0);
        abstractC20075M29740.getClass();
        ((C15599) abstractC20075M29740).m37327(c8614M46155.m23200());
        AbstractC20075 abstractC20075M29741 = this.f64515.m29740(1);
        abstractC20075M29741.getClass();
        ((C15599) abstractC20075M29741).m37327(c8614M46155.m23231());
        AbstractC20075 abstractC20075M29742 = this.f64515.m29740(2);
        abstractC20075M29742.getClass();
        ((C5905) abstractC20075M29742).m17144(!c8614M46155.m23218() || c8614M46155.m23213().mo18799());
        AbstractC20075 abstractC20075M29743 = this.f64515.m29740(3);
        abstractC20075M29743.getClass();
        ((C15599) abstractC20075M29743).m37327(c8614M46155.m23213().mo10178());
        this.f64515.m29737();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46176(boolean z) {
        if (this.f64506 == z) {
            return;
        }
        m46130(false);
        this.f64506 = z;
        this.f64518.m52117(1.0f);
        this.f64507.m52117(1.0f);
        this.f64501.setAlpha(1.0f);
        this.f64487.setAlpha(1.0f);
        this.f64518.setVisibility(z ? 0 : 8);
        this.f64507.setVisibility(z ? 8 : 0);
        this.f64491.m39696(z);
        this.f64517.m23187(z);
        this.f64494.m23187(!z);
        m46172();
        m46169();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46151(boolean z, float f) {
        if (this.f64506 == z) {
            return;
        }
        if (f == 0.0f) {
            this.f64518.setVisibility(!z ? 0 : 8);
            this.f64507.setVisibility(z ? 0 : 8);
            this.f64518.m52117(1.0f);
            this.f64507.m52117(1.0f);
            this.f64501.setAlpha(1.0f);
            this.f64487.setAlpha(1.0f);
            return;
        }
        (z ? this.f64487 : this.f64501).setAlpha(1.0f - (0.5f * f));
        if (z) {
            this.f64518.m52117(f);
            this.f64507.m52117(1.0f - f);
        } else {
            this.f64518.m52117(1.0f - f);
            this.f64507.m52117(f);
        }
        if (this.f64518.getVisibility() != 0) {
            this.f64518.setVisibility(0);
        }
        if (this.f64507.getVisibility() != 0) {
            this.f64507.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m46140() {
        return this.f64506;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46147(C7308 c7308) {
        this.f64503 = c7308;
        c7308.m20007(new C22303(this));
        m46169();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m46180() {
        C7308 c7308 = this.f64503;
        if (c7308 != null) {
            c7308.m20014();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46169() {
        if (this.f64503 == null) {
            return;
        }
        C22612 c22612 = m46155().f28139;
        if (c22612.m50945()) {
            this.f64503.m20013(false);
            this.f64503.m20006(c22612.m50946());
        } else {
            this.f64503.m20014();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46159(boolean z) {
        if (this.f64503 == null) {
            return;
        }
        if (z) {
            C16720.m39486();
        }
        this.f64503.m20013(true);
        C22612 c22612 = m46155().f28139;
        if (c22612.m50945()) {
            return;
        }
        this.f64503.m20006((String) null);
        c22612.m50944(true);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m46138() {
        this.f64517.f28159.m12740();
        this.f64494.f28159.m12740();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8614 m46155() {
        return this.f64506 ? this.f64517 : this.f64494;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m46141() {
        m46176(!this.f64506);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8614 m46139() {
        return this.f64517;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8614 m46182() {
        return this.f64494;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46158(String str) {
        this.f64504.setTitle(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46144(CharSequence charSequence) {
        this.f64504.m40411().setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46168() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f64504.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f64504.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Main m46161() {
        return this.f64504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewGroup m46142(boolean z) {
        return z ? this.f64513 : this.f64509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46145(Runnable runnable) {
        this.f64495.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0118, code lost:
    
        if (l.C20932.m47848() != 0) goto L18;
     */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m46156() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20065.m46156():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46146(String str) {
        C8614 c8614 = this.f64494;
        C8614 c8615 = this.f64517;
        if (this.f64502) {
            return;
        }
        C2935<AbstractC7364> c2935 = this.f64490;
        if (c2935.m9585()) {
            C21576.m49068(new RunnableC24614(2, str));
            return;
        }
        this.f64502 = true;
        c2935.m9583();
        try {
            Iterator<E> it = c2935.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC7364 abstractC7364 = (AbstractC7364) it.next();
                if (!abstractC7364.mo10167()) {
                    abstractC7364.m20210();
                    it.remove();
                    z = true;
                }
            }
            if (!c8615.m23213().mo10167()) {
                m46148(c8615);
                z = false;
            }
            if (!c8614.m23213().mo10167()) {
                m46148(c8614);
                z = false;
            }
            if (this.f64506) {
                c8615.m23220(str);
                c8614.m23220(str);
            } else {
                c8614.m23220(str);
                c8615.m23220(str);
            }
            for (final AbstractC7364 abstractC7365 : c2935) {
                if (abstractC7365.mo18801(str)) {
                    C5261.f18540.execute(new Runnable() { // from class: l.۟ܰܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                abstractC7365.mo20214(false);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
            if (z) {
                C8287.m22382();
            }
            c2935.m9584();
            this.f64502 = false;
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46162() {
        boolean z = this.f64506;
        C8614 c8614 = this.f64494;
        C8614 c8615 = this.f64517;
        if (z) {
            c8615.m23213().mo10168(c8615);
            c8614.m23213().mo10168(c8614);
        } else {
            c8614.m23213().mo10168(c8614);
            c8615.m23213().mo10168(c8615);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m46171() {
        this.f64511 = true;
        m46130(false);
        this.f64517.m23219();
        this.f64494.m23219();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2935 m46163() {
        return this.f64490;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m46165() {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        for (int i = 0; i < c2935.size(); i++) {
            try {
                if (((AbstractC7364) c2935.get(i)) instanceof C7495) {
                    return i;
                }
            } finally {
                c2935.m9584();
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m46136(boolean z) {
        FloatingActionButton floatingActionButton = z ? this.f64512 : this.f64497;
        FloatingActionButton floatingActionButton2 = z ? this.f64488 : this.f64485;
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C3296.f10738));
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(C3296.f10748));
        floatingActionButton.setImageTintList(ColorStateList.valueOf(C3296.f10773));
        floatingActionButton2.setImageTintList(ColorStateList.valueOf(C3296.f10773));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46114(FloatingActionButton floatingActionButton) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
        return (floatingActionButton.getHeight() != 0 ? floatingActionButton.getHeight() : floatingActionButton.getMeasuredHeight()) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46152(boolean z, boolean z2) {
        m46130(true);
        if (z) {
            if (this.f64516) {
                return;
            } else {
                this.f64516 = true;
            }
        } else if (this.f64498) {
            return;
        } else {
            this.f64498 = true;
        }
        FloatingActionButton floatingActionButton = z ? this.f64512 : this.f64497;
        FloatingActionButton floatingActionButton2 = z ? this.f64488 : this.f64485;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z2) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 1.0f, 0.0f));
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, m46114(floatingActionButton));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, m46114(floatingActionButton2));
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        duration.addListener(new C23049(floatingActionButton, floatingActionButton2));
        duration.start();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m46166() {
        m46130(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m46130(boolean z) {
        this.f64510.removeCallbacks(this.f64508);
        this.f64510.animate().setListener(null).cancel();
        if (!z || this.f64510.getVisibility() != 0 || this.f64510.getAlpha() == 0.0f) {
            this.f64510.setVisibility(8);
            this.f64510.setAlpha(1.0f);
        } else {
            this.f64510.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new C11114(this)).start();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m46126(boolean z) {
        AccessibilityManager accessibilityManager;
        C8614 c8614 = z ? this.f64517 : this.f64494;
        if (!this.f64511 && this.f64506 == z && c8614.m23218() && this.f64504.getLifecycle().mo23076().m8762(EnumC2619.RESUMED)) {
            int iM19160 = C6907.m19160(12.0f);
            ViewGroup viewGroup = (ViewGroup) this.f64510.getParent();
            int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (iM19160 * 2);
            int iM29746 = this.f64515.m29746();
            if (!this.f64515.isShown() || width <= 0 || iM29746 <= 0) {
                return;
            }
            this.f64510.setBackgroundResource(C23434.m52631(this.f64504.getTheme(), R.attr.MT_Protector));
            this.f64510.setTextColor(C23434.m52628(this.f64504.getTheme(), R.attr.MT_Protector));
            this.f64510.setMaxWidth(width);
            this.f64510.setTextSize(2, 14.0f);
            this.f64510.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.f64510.getLineCount() > 1) {
                this.f64510.setTextSize(2, 13.0f);
            }
            TextView textView = this.f64510;
            textView.setMinHeight(C6907.m19160(24.0f) + textView.getLineHeight());
            this.f64510.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            C11651 c11651 = (C11651) this.f64510.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c11651).bottomMargin = Math.max(0, (iM29746 - this.f64510.getMeasuredHeight()) / 2) + (this.f64515.getHeight() - iM29746);
            this.f64510.setLayoutParams(c11651);
            this.f64510.animate().setListener(null).cancel();
            this.f64510.setAlpha(0.0f);
            this.f64510.setVisibility(0);
            this.f64510.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            int i = Build.VERSION.SDK_INT;
            int recommendedTimeoutMillis = OpenAuthTask.SYS_ERR;
            if (i >= 29 && (accessibilityManager = (AccessibilityManager) this.f64504.getSystemService("accessibility")) != null) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(OpenAuthTask.SYS_ERR, 2);
            }
            this.f64510.postDelayed(this.f64508, recommendedTimeoutMillis);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46177(boolean z, boolean z2) {
        if (z2) {
            m46130(false);
        }
        if (!z ? this.f64498 : this.f64516) {
            if (z2) {
                m46126(z);
                return;
            }
            return;
        }
        if ((z ? this.f64512 : this.f64497) == null) {
            int i = z ? R.id.MT_Protector : R.id.MT_Protector;
            Main main = this.f64504;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ((ViewStub) main.m40418(i)).inflate();
            ViewOnClickListenerC10170 viewOnClickListenerC10170 = this.f64500;
            floatingActionButton.setOnClickListener(viewOnClickListenerC10170);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ((ViewStub) main.m40418(z ? R.id.MT_Protector : R.id.MT_Protector)).inflate();
            floatingActionButton2.setOnClickListener(viewOnClickListenerC10170);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton2.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            if (z) {
                this.f64488 = floatingActionButton;
                this.f64512 = floatingActionButton2;
            } else {
                this.f64485 = floatingActionButton;
                this.f64497 = floatingActionButton2;
            }
            m46136(z);
        }
        if (z) {
            this.f64516 = false;
        } else {
            this.f64498 = false;
        }
        FloatingActionButton floatingActionButton3 = z ? this.f64512 : this.f64497;
        FloatingActionButton floatingActionButton4 = z ? this.f64488 : this.f64485;
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        float fM46114 = m46114(floatingActionButton3);
        floatingActionButton3.setTranslationY(fM46114);
        floatingActionButton3.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", fM46114, 0.0f);
        float fM46115 = m46114(floatingActionButton4);
        floatingActionButton4.setTranslationY(fM46115);
        floatingActionButton4.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", fM46115, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (z2) {
            m46126(z);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46143(Bundle bundle) {
        C8614 c8614 = this.f64494;
        C8614 c8615 = this.f64517;
        C6178 c6178 = new C6178();
        c6178.m17789(this.f64506);
        C7495.m20542(c6178);
        C2935<AbstractC7364> c2935 = this.f64490;
        c2935.m9583();
        try {
            AbstractC7364 abstractC7364M23213 = c8615.m23213();
            c6178.m17800(abstractC7364M23213.mo10164());
            abstractC7364M23213.mo10161(c6178);
            c8615.m23179(c6178);
            AbstractC7364 abstractC7364M23214 = c8614.m23213();
            c6178.m17800(abstractC7364M23214.mo10164());
            abstractC7364M23214.mo10161(c6178);
            c8614.m23179(c6178);
            c6178.mo17812(c2935.size());
            for (AbstractC7364 abstractC7364 : c2935) {
                c6178.m17800(abstractC7364.mo10164());
                abstractC7364.mo10161(c6178);
            }
            c2935.m9584();
            bundle.putByteArray("WindowManagerData", c6178.m17799());
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46179() {
        C2935 c2935 = this.f64490;
        c2935.m9583();
        try {
            this.f64517.m23213().m20210();
            this.f64494.m23213().m20210();
            Iterator it = new ArrayList(c2935).iterator();
            while (it.hasNext()) {
                ((AbstractC7364) it.next()).m20210();
            }
            c2935.m9584();
        } catch (Throwable th) {
            c2935.m9584();
            throw th;
        }
    }
}
