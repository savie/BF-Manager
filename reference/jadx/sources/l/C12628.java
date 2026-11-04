package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public class C12628 extends View {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40494 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f40495;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40496;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5171 f40497;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f40498;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f40499;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f40500;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C24060 f40501;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f40502;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f40503;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f40504;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C24179 f40505;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f40506;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40507;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20003 f40508;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5917 f40509;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3176 f40510;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16357 f40511;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f40512;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f40513;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f40514;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HandlerC23817 f40515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17103 f40516;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f40517;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public long f40518;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f40519;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC2188 f40520;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C13045[] f40521;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40522;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f40523;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f40524;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f40525;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public long f40526;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int f40527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3679 f40528;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public float f40529;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C15282 f40530;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C8570 f40531;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40532;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40533;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f40534;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m31335() {
        return this.f40500 || this.f40516 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C17103 m31353(Runnable runnable, Runnable runnable2) {
        if (!this.f40500 && this.f40516 == null && !m31371()) {
            C17103 c17103 = new C17103(this, runnable, runnable2);
            this.f40516 = c17103;
            return c17103;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C3679 m31377() {
        if (this.f40528 == null && !m31371()) {
            C3679 c3679 = new C3679(this);
            this.f40528 = c3679;
            return c3679;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m31381() {
        return this.f40528 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m31388(boolean z) {
        this.f40500 = z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m31394() {
        return this.f40516 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31389(int i) {
        if (i < 0 || i > 16) {
            throw new IllegalArgumentException("Invalid byte column count");
        }
        if (this.f40506 == i) {
            return;
        }
        this.f40506 = i;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31366(boolean z) {
        if (this.f40495 == z) {
            return;
        }
        this.f40495 = z;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31351() {
        return this.f40495;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31362(C3176 c3176) {
        m31384();
        this.f40510 = c3176;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31360(Canvas canvas, Drawable drawable, Drawable drawable2) {
        boolean z;
        C13045 c13045;
        int iM32481;
        if (this.f40510 == null) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (drawable2 != null) {
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        boolean z2 = false;
        if (this.f40521 == null && ((drawable != null || drawable2 != null) && isAttachedToWindow())) {
            this.f40521 = new C13045[]{new C13045(this, 0), new C13045(this, 1), new C13045(this, 2)};
        }
        if (this.f40521 != null) {
            boolean zM17206 = this.f40509.m17206();
            C13045[] c13045Arr = this.f40521;
            C13045 c13046 = c13045Arr[1];
            C13045 c13047 = c13045Arr[2];
            if (zM17206 && this.f40525) {
                if (c13046.m32480()) {
                    c13045 = c13046;
                } else {
                    c13045 = c13047.m32480() ? c13047 : null;
                }
                if (c13045 == null) {
                    z = false;
                } else {
                    int i = this.f40503;
                    int i2 = this.f40522;
                    if (i == i2) {
                        iM32481 = c13045.m32481();
                    } else {
                        iM32481 = i < i2 ? 1 : 2;
                    }
                    if (c13045 != c13046 ? iM32481 != 1 : iM32481 != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            C13045 c13048 = this.f40521[0];
            C15282 c15282 = this.f40530;
            c13048.m32476(c15282.m36669(), (zM17206 || drawable == null) ? false : true, 0);
            c13046.m32476(z ? c15282.m36654() : c15282.m36663(), zM17206 && (!z ? drawable == null : drawable2 == null), z ? 2 : 1);
            RectF rectFM36663 = z ? c15282.m36663() : c15282.m36654();
            if (zM17206 && (!z ? drawable2 != null : drawable != null)) {
                z2 = true;
            }
            c13047.m32476(rectFM36663, z2, z ? 1 : 2);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m31393() {
        C13045[] c13045Arr = this.f40521;
        if (c13045Arr == null) {
            return;
        }
        boolean zM32479 = false;
        for (C13045 c13045 : c13045Arr) {
            c13045.m32478();
            zM32479 |= c13045.m32479();
        }
        ViewTreeObserverOnPreDrawListenerC2188 viewTreeObserverOnPreDrawListenerC2188 = this.f40520;
        if (zM32479 && isAttachedToWindow()) {
            if (this.f40534 == null) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.f40534 = viewTreeObserver;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2188);
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver2 = this.f40534;
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                this.f40534.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2188);
            }
            this.f40534 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m31375() {
        if (this.f40510 != null && !m31371() && isAttachedToWindow() && isShown() && getWindowVisibility() == 0 && isFocused() && hasWindowFocus()) {
            return this.f40525 || SystemClock.uptimeMillis() - this.f40514 < 3500;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31379() {
        C13045[] c13045Arr = this.f40521;
        if (c13045Arr != null) {
            for (C13045 c13045 : c13045Arr) {
                c13045.m32477();
            }
        }
        ViewTreeObserver viewTreeObserver = this.f40534;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40534.removeOnPreDrawListener(this.f40520);
            }
            this.f40534 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31368(MotionEvent motionEvent, int i) {
        this.f40519 = i;
        try {
            return dispatchTouchEvent(motionEvent);
        } finally {
            this.f40519 = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31365(C24060 c24060) {
        this.f40501 = c24060;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m31384() {
        this.f40531.m23015();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31382() {
        return this.f40531.m23020();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31374(long j) {
        m31384();
        long jMax = Math.max(0L, Math.min(j, this.f40530.m36675()));
        long j2 = this.f40504;
        if (jMax == j2) {
            return;
        }
        this.f40531.m23016(j2, jMax - j2);
        m31348();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31387(long j) {
        this.f40504 = Math.max(0L, Math.min(j, this.f40530.m36675()));
        m31348();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31390(long j) {
        this.f40504 = j;
        m31348();
        invalidate();
    }

    public C12628(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [l.֫᩷ܳ] */
    public C12628(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40495 = true;
        this.f40524 = true;
        this.f40533 = true;
        this.f40519 = -1;
        this.f40520 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.֫᩷ܳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int i2 = C12628.f40494;
                this.f7193.m31393();
                return true;
            }
        };
        this.f40526 = SystemClock.uptimeMillis();
        this.f40514 = 0L;
        this.f40518 = 0L;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f40515 = new HandlerC23817(this);
        this.f40531 = new C8570(context);
        this.f40505 = new C24179(context, new C17849(this));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f40527 = viewConfiguration.getScaledOverflingDistance();
        this.f40513 = viewConfiguration.getScaledTouchSlop();
        C5917 c5917 = new C5917(this);
        this.f40509 = c5917;
        this.f40497 = new C5171(this, c5917);
        this.f40530 = new C15282(this);
        C20003 c20003 = new C20003(this);
        c20003.m46011(3500);
        c20003.m46008(new C11882(this));
        this.f40508 = c20003;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31338(final C12628 c12628, MenuItem menuItem) {
        C5917 c5917 = c12628.f40509;
        if (c12628.m31371()) {
            return;
        }
        try {
            int itemId = menuItem.getItemId();
            if ((itemId == R.string.MT_Protector || itemId == R.string.MT_Protector) && c12628.m31335()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c5917.m17194((byte[]) null);
            } else if (itemId == R.string.MT_Protector) {
                c5917.m17203();
            } else if (itemId == 17039361) {
                if (c5917.m17186()) {
                    C22673.m51152(R.string.MT_Protector);
                } else {
                    C3679 c3679M31377 = c12628.m31377();
                    if (c3679M31377 == null) {
                        C22673.m51152(R.string.MT_Protector);
                    } else {
                        new C6334(new C24234(), c12628, c12628.getContext(), c3679M31377).m8197();
                    }
                }
            } else if (itemId == R.string.MT_Protector) {
                int i = C3991.f13655;
                final C23383 c23383M52546 = C23383.m52546(c12628);
                if (c23383M52546 != null) {
                    Context context = c12628.getContext();
                    int i2 = DialogInterfaceC8327.f27315;
                    C2361 c2361 = new C2361(context);
                    c2361.m8002(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴۜᩴ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C23383 c23383 = c23383M52546;
                            C12628 c12629 = this.f63303;
                            if (c23383.m52547(c12629)) {
                                C3679 c3679M31378 = c12629.m31377();
                                if (c3679M31378 == null) {
                                    C22673.m51152(R.string.MT_Protector);
                                    return;
                                }
                                if (!c23383.m52547(c12629)) {
                                    c3679M31378.close();
                                    return;
                                }
                                if (i3 < 5 && C3991.m12909(c23383.f75694, c23383.f75691, i3) > 524288) {
                                    c3679M31378.close();
                                    C22673.m51152(R.string.MT_Protector);
                                } else {
                                    Context context2 = c12629.getContext();
                                    new C5483(c23383, context2 instanceof AbstractActivityC17204 ? (AbstractActivityC17204) context2 : null, c3679M31378, c12629, i3, context2).m8197();
                                }
                            }
                        }
                    });
                    DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
                    dialogInterfaceC8327M7999.m22435().setDimAmount(0.0f);
                    dialogInterfaceC8327M7999.m22432();
                }
            } else if (itemId == R.string.MT_Protector) {
                C15545.m37229(c12628);
            } else if (itemId == 17039371) {
                C19012 c19012 = new C19012();
                final C10061 c10061 = new C10061(c12628);
                C17103 c17103M31353 = c12628.m31353(new RunnableC14536(c19012), new Runnable() { // from class: l.᩶ۤܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c10061.m26020();
                    }
                });
                if (c17103M31353 == null) {
                    C22673.m51152(R.string.MT_Protector);
                } else {
                    new C7825(c10061, c12628, c19012, c17103M31353).m8197();
                }
            }
            c12628.invalidate();
        } catch (IOException e) {
            c12628.m31361(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31383() {
        C3679 c3679;
        synchronized (this) {
            c3679 = this.f40528;
        }
        if (c3679 != null) {
            c3679.m11970();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m31391() {
        C17103 c17103;
        synchronized (this) {
            c17103 = this.f40516;
        }
        if (c17103 == null) {
            return false;
        }
        c17103.m40269();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31369(Runnable runnable) {
        C17103 c17103;
        synchronized (this) {
            c17103 = this.f40516;
        }
        if (c17103 == null) {
            return false;
        }
        c17103.m40265(runnable);
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m31371() {
        C3176 c3176 = this.f40510;
        return c3176 != null && c3176.f10298;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m31392() {
        if (m31371()) {
            this.f40515.removeMessages(2);
            this.f40508.m46003();
            m31379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31340(C12628 c12628, C17103 c17103) {
        synchronized (c12628) {
            if (c12628.f40516 == c17103) {
                c12628.f40516 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31339(C12628 c12628, C3679 c3679) {
        synchronized (c12628) {
            if (c12628.f40528 == c3679) {
                c12628.f40528 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31370(byte[] bArr) {
        if (!m31335() && !m31371()) {
            try {
                this.f40509.m17194(bArr);
                invalidate();
                return true;
            } catch (IOException e) {
                m31361(e);
                return false;
            } catch (C12562 unused) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19143 m31354(C19143 c19143) {
        InterfaceC16357 interfaceC16357;
        m31379();
        HandlerC23817 handlerC23817 = this.f40515;
        handlerC23817.removeMessages(2);
        handlerC23817.removeMessages(3);
        this.f40508.m46003();
        m31383();
        C8570 c8570 = this.f40531;
        if (!c8570.m23020()) {
            c8570.m23015();
        }
        boolean z = this.f40523;
        if (z || this.f40507) {
            m31343(false);
        }
        this.f40523 = false;
        this.f40496 = false;
        this.f40507 = false;
        this.f40525 = false;
        this.f40518 = 0L;
        handlerC23817.f77139 = false;
        C19143 c19143M17192 = this.f40509.m17192(c19143);
        this.f40504 = 0L;
        this.f40532 = false;
        if (z && (interfaceC16357 = this.f40511) != null) {
            interfaceC16357.mo34792(false);
        }
        invalidate();
        return c19143M17192;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31357(int i, int i2) {
        C15282 c15282;
        C5917 c5917 = this.f40509;
        c5917.m17216(i, i2);
        invalidate();
        int iM17202 = c5917.m17202();
        int iM17208 = c5917.m17208();
        if (getHeight() == 0 || (c15282 = this.f40530) == null) {
            return;
        }
        long jM36675 = c15282.m36675();
        long j = this.f40504;
        int iM36680 = c15282.m36680(iM17202);
        long jM36666 = c15282.m36666(iM36680);
        if (j <= jM36666) {
            jM36666 = c15282.m36679(iM36680);
            if (j >= jM36666) {
                jM36666 = j;
            }
        }
        if (jM36666 > jM36675) {
            jM36666 = jM36675;
        }
        int iM36681 = c15282.m36680(iM17208);
        if (iM36680 != iM36681) {
            long jM36667 = c15282.m36666(iM36681);
            if (j <= jM36667) {
                jM36667 = c15282.m36679(iM36681);
                if (j >= jM36667) {
                    jM36667 = j;
                }
            }
            if (jM36667 <= jM36675) {
                jM36675 = jM36667;
            }
            if (j == jM36666 && j != jM36675) {
                jM36666 = jM36675;
            } else if (j == jM36666 || j != jM36675) {
                if (j == jM36666) {
                    jM36666 = j;
                } else if (j > jM36666 && j > jM36675) {
                    jM36666 = Math.min(jM36666, jM36675);
                } else if (j >= jM36666 || j >= jM36675) {
                    jM36666 = j;
                } else {
                    jM36666 = Math.max(jM36666, jM36675);
                }
            }
        }
        if (j != jM36666) {
            C8570 c8570 = this.f40531;
            if (!c8570.m23020()) {
                c8570.m23015();
            }
            c8570.m23016(j, jM36666 - j);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31373(int i) {
        if (m31335()) {
            return;
        }
        C5917 c5917 = this.f40509;
        if (c5917.m17206() || m31371()) {
            return;
        }
        try {
            c5917.m17215(i);
            m31345();
            invalidate();
            m31367(c5917.m17202());
        } catch (IOException e) {
            m31361(e);
        } catch (C12562 unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m31378() {
        return this.f40504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31359(long j) {
        this.f40504 = j;
        invalidate();
        C24060 c24060 = this.f40501;
        if (c24060 != null) {
            C18092.m42159(c24060.f77803, this, j);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f40510 != null) {
            int i3 = this.f40506;
            if (i3 <= 0) {
                i3 = getResources().getConfiguration().orientation == 1 ? 8 : 16;
            }
            this.f40509.m17205(i3);
            this.f40497.m15590((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C15282 c15282 = this.f40530;
        boolean zM36674 = c15282.m36674();
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        int i5 = this.f40506;
        if (i5 <= 0) {
            i5 = getResources().getConfiguration().orientation == 1 ? 8 : 16;
        }
        int i6 = this.f40502;
        C5171 c5171 = this.f40497;
        C5917 c5917 = this.f40509;
        boolean z2 = ((paddingLeft == i6 && i5 == c5917.m17204()) || c5171.f18053 == 0) ? false : true;
        int iM36658 = z2 ? c15282.m36658(0.0f, this.f40504 + ((long) c15282.m36667()), false) : 0;
        c5917.m17205(i5);
        c5171.m15590(paddingLeft);
        this.f40502 = paddingLeft;
        if (this.f40510 != null) {
            m31387(this.f40504);
            return;
        }
        if (zM36674) {
            if (m31367(c5917.m17202())) {
                return;
            }
            long jM36675 = c15282.m36675();
            if (this.f40504 > jM36675) {
                m31359(jM36675);
                return;
            }
            return;
        }
        if (!z2) {
            long jM36676 = c15282.m36675();
            if (this.f40504 > jM36676) {
                m31359(jM36676);
                return;
            }
            return;
        }
        long jMin = Math.min(c15282.m36666(c15282.m36680(iM36658)), c15282.m36675());
        C8570 c8570 = this.f40531;
        if (!c8570.m23020()) {
            c8570.m23015();
        }
        long j = this.f40504;
        c8570.m23016(j, jMin - j);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31386(int i) {
        requestFocus();
        C5917 c5917 = this.f40509;
        c5917.m17193(i, true);
        m31345();
        m31367(c5917.m17202());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31367(int i) {
        C15282 c15282;
        if (getHeight() == 0 || (c15282 = this.f40530) == null) {
            return false;
        }
        int iM36680 = c15282.m36680(i);
        long jM36666 = c15282.m36666(iM36680);
        long jM36675 = c15282.m36675();
        long j = this.f40504;
        if (j <= jM36666) {
            jM36666 = c15282.m36679(iM36680);
            if (j >= jM36666) {
                jM36666 = j;
            }
        }
        if (jM36666 <= jM36675) {
            jM36675 = jM36666;
        }
        if (j == jM36675) {
            return false;
        }
        C8570 c8570 = this.f40531;
        if (!c8570.m23020()) {
            c8570.m23015();
        }
        c8570.m23016(j, jM36675 - j);
        invalidate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        InterfaceC16357 interfaceC16357;
        int iUptimeMillis;
        int i;
        try {
            if (!this.f40525) {
                z = isFocused() && (SystemClock.uptimeMillis() - this.f40526) % 1000 < 500;
                z2 = isFocused() && SystemClock.uptimeMillis() - this.f40514 < 3500;
                if (this.f40510 != null || isFocused()) {
                    z3 = z;
                    z4 = z2;
                } else {
                    z3 = true;
                    z4 = false;
                }
                if (this.f40523) {
                    f = 1.0f;
                } else {
                    iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.f40518);
                    if (iUptimeMillis < 0) {
                        f = 0.0f;
                    } else if (iUptimeMillis <= 1500) {
                        f = 1.0f;
                    } else {
                        i = iUptimeMillis - 1500;
                        if (i < 300) {
                            f = 1.0f - (i / 300.0f);
                        } else {
                            f = 0.0f;
                        }
                    }
                }
                this.f40530.m36661(canvas, z3, z4, f, this.f40523);
                this.f40532 = false;
                return;
            }
            z = true;
            this.f40530.m36661(canvas, z3, z4, f, this.f40523);
            this.f40532 = false;
            return;
        } catch (IOException e) {
            canvas.drawColor(this.f40497.f18036);
            m31379();
            if (this.f40532 || (interfaceC16357 = this.f40511) == null) {
                return;
            }
            this.f40532 = true;
            interfaceC16357.mo34791(e);
            return;
        }
        if (this.f40510 != null) {
            z3 = z;
            z4 = z2;
        } else {
            z3 = z;
            z4 = z2;
        }
        if (this.f40523) {
            iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.f40518);
            if (iUptimeMillis < 0) {
                f = 0.0f;
            } else if (iUptimeMillis <= 1500) {
                f = 1.0f;
            } else {
                i = iUptimeMillis - 1500;
                if (i < 300) {
                    f = 1.0f - (i / 300.0f);
                } else {
                    f = 0.0f;
                }
            }
        } else {
            f = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31341(C12628 c12628, boolean z) {
        if (z) {
            HandlerC23817 handlerC23817 = c12628.f40515;
            handlerC23817.removeMessages(2);
            handlerC23817.sendEmptyMessageDelayed(2, 250L);
            return;
        }
        c12628.m31337(-1, false);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m31344(C12628 c12628) {
        c12628.m31337(-1, false);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31337(int i, boolean z) {
        int iM17208;
        boolean z2;
        if (m31371()) {
            return;
        }
        boolean z3 = true;
        HandlerC23817 handlerC23817 = this.f40515;
        if (handlerC23817 != null) {
            handlerC23817.removeMessages(1);
        }
        C20003 c20003 = this.f40508;
        c20003.m46012();
        C5917 c5917 = this.f40509;
        if (c5917.m17206()) {
            c20003.m46005(R.string.MT_Protector);
            c20003.m46005(android.R.string.copy);
            c20003.m46005(R.string.MT_Protector);
            if (!m31335()) {
                c20003.m46005(R.string.MT_Protector);
                c20003.m46005(R.string.MT_Protector);
            }
        } else {
            c20003.m46005(R.string.MT_Protector);
        }
        if (!m31335() && C5917.m17184()) {
            c20003.m46005(android.R.string.paste);
        }
        C16379 c16379 = new C16379();
        C15282 c15282 = this.f40530;
        if (i != -1) {
            iM17208 = i;
            z2 = true;
        } else {
            if (c15282.m36662(c16379)) {
                c16379.f53168 = ((c16379.f53169 + c16379.f53168) / 2) + 1;
                i = -2;
            } else {
                i = c5917.m17202();
                iM17208 = c5917.m17208();
                c15282.m36660(i, c16379, false);
                long j = c16379.f53170;
                long j2 = this.f40504;
                if (j - j2 < 0 || c16379.f53167 - j2 > getHeight()) {
                    if (i != iM17208) {
                        c15282.m36660(iM17208, c16379, true);
                        long j3 = c16379.f53170;
                        long j4 = this.f40504;
                        if (j3 - j4 >= 0 && c16379.f53167 - j4 <= getHeight()) {
                            z2 = false;
                        }
                    }
                    i = -1;
                }
            }
            iM17208 = i;
            z2 = true;
        }
        if (iM17208 == -1) {
            c20003.m46006(getWidth() / 2, (c20003.m46010() + getHeight()) / 2);
            return;
        }
        if (iM17208 >= 0) {
            c15282.m36660(iM17208, c16379, z);
        }
        C5171 c5171 = this.f40497;
        if (z2) {
            if (c16379.f53170 - this.f40504 < c20003.m46010()) {
                z3 = false;
            } else {
                z3 = z2;
            }
        } else if ((c16379.f53167 - this.f40504) + ((long) c20003.m46010()) + ((long) c5171.f18020.getIntrinsicHeight()) <= getHeight()) {
            z3 = z2;
        }
        if (z3) {
            int i2 = c16379.f53168;
            long j5 = c16379.f53170 - this.f40504;
            int i3 = (int) j5;
            if (j5 != i3) {
                throw new ArithmeticException();
            }
            c20003.m46006(i2, i3);
            return;
        }
        int i4 = c16379.f53168;
        long jM46010 = (c16379.f53167 - this.f40504) + ((long) c20003.m46010()) + ((long) c5171.f18020.getIntrinsicHeight());
        int i5 = (int) jM46010;
        if (jM46010 != i5) {
            throw new ArithmeticException();
        }
        c20003.m46006(i4, i5);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f40499) {
            return;
        }
        C8570 c8570 = this.f40531;
        if (c8570.m23019()) {
            m31348();
            m31359(c8570.m23018());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m31345() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f40526 = jUptimeMillis;
        this.f40514 = jUptimeMillis;
        this.f40515.m53143();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m31348() {
        this.f40518 = SystemClock.uptimeMillis();
        HandlerC23817 handlerC23817 = this.f40515;
        handlerC23817.removeMessages(3);
        handlerC23817.sendEmptyMessageDelayed(3, 1500L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m31379();
        super.onDetachedFromWindow();
        if (this.f40507) {
            m31343(false);
            this.f40496 = false;
            this.f40507 = false;
        }
        this.f40515.m53142();
        m31391();
        m31383();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            return;
        }
        this.f40515.removeMessages(2);
        this.f40508.m46003();
        m31379();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m31345();
        } else {
            m31379();
            this.f40515.m53142();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m31343(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[PHI: r2
      0x0109: PHI (r2v7 double) = (r2v2 double), (r2v3 double) binds: [B:58:0x0107, B:61:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r0 != 6) goto L131;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12628.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m31346(C12628 c12628) {
        InterfaceC16357 interfaceC16357 = c12628.f40511;
        if (interfaceC16357 == null || !interfaceC16357.mo34794(c12628.f40530.m36673())) {
            return false;
        }
        c12628.m31367(c12628.f40509.m17202());
        return true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m31380() {
        this.f40509.m17211();
        this.f40532 = false;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31363(InterfaceC16357 interfaceC16357) {
        this.f40511 = interfaceC16357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31358(int i, int i2, boolean z) {
        this.f40526 = SystemClock.uptimeMillis();
        InterfaceC16357 interfaceC16357 = this.f40511;
        if (interfaceC16357 != null) {
            interfaceC16357.mo34790(i, i2, this.f40509.m17218(), z);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31385() {
        InterfaceC16357 interfaceC16357 = this.f40511;
        if (interfaceC16357 != null) {
            interfaceC16357.mo34795();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31356() {
        InterfaceC16357 interfaceC16357 = this.f40511;
        if (interfaceC16357 != null) {
            C5917 c5917 = this.f40509;
            interfaceC16357.mo34793(c5917.m17217(), c5917.m17195(), m31376());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31361(IOException iOException) {
        InterfaceC16357 interfaceC16357 = this.f40511;
        if (interfaceC16357 != null) {
            interfaceC16357.mo34791(iOException);
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m31372() {
        if (m31335()) {
            return;
        }
        C5917 c5917 = this.f40509;
        c5917.m17214();
        invalidate();
        m31367(c5917.m17202());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m31352() {
        if (m31335()) {
            return;
        }
        C5917 c5917 = this.f40509;
        c5917.m17219();
        invalidate();
        m31367(c5917.m17202());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31376() {
        return this.f40509.m17213().m44379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20833 m31355(C16159 c16159) {
        if (c16159 != null) {
            return new C20833(c16159.m38337(), c16159.m38336(), 0, this.f40504, c16159.m38338(), c16159.m38335());
        }
        long j = this.f40504;
        C5917 c5917 = this.f40509;
        return new C20833(c5917.m17202(), c5917.m17208(), 0, j, c5917.m17220(), c5917.m17206());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31364(C20833 c20833) {
        C17359.requireNonNull(c20833, "state");
        boolean z = c20833.f66708;
        boolean z2 = c20833.f66707;
        C5917 c5917 = this.f40509;
        int iM17218 = c5917.m17218();
        int i = c20833.f66711;
        int i2 = c20833.f66709;
        if (iM17218 >= 0) {
            long j = c20833.f66710;
            if (j >= 0) {
                if (z2) {
                    if (iM17218 == 0 || i2 < 0 || i < i2 || i >= iM17218) {
                        throw new IllegalArgumentException("Invalid range selection");
                    }
                } else if (i2 < 0 || i2 != i || i2 > iM17218 || (i2 == iM17218 && !z)) {
                    throw new IllegalArgumentException("Invalid cursor selection");
                }
                this.f40504 = Math.min(j, this.f40530.m36675());
                if (z2) {
                    c5917.m17216(i2, i);
                } else {
                    c5917.m17193(i2, z);
                }
                invalidate();
                return;
            }
        }
        throw new IllegalArgumentException("Negative UI state value");
    }
}
