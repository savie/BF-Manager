package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes3.dex */
public class C13026 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f43439;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43440;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC8793 f43441;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f43442;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f43443;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f43444;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f43445;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f43446;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10614 f43447;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f43448;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C18483 f43449;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HandlerC5264 f43450;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f43451;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C13732 f43452;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int f43453;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f43454;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16554 f43455;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11615 f43456;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10682 f43457;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2877 f43458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22198 f43459;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43460;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43461;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f43462;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m32214() {
        return this.f43440 || this.f43456 != null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32218() {
        return this.f43459 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11615 m32223(Runnable runnable, Runnable runnable2) {
        if (!this.f43440 && this.f43456 == null) {
            C11615 c11615 = new C11615(this, runnable, runnable2);
            this.f43456 = c11615;
            return c11615;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m32231(boolean z) {
        this.f43440 = z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C22198 m32236() {
        if (this.f43459 != null) {
            return null;
        }
        C22198 c22198 = new C22198(this);
        this.f43459 = c22198;
        return c22198;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32242() {
        return this.f43456 != null;
    }

    public C13026(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13026(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43443 = SystemClock.uptimeMillis();
        this.f43454 = 0L;
        this.f43445 = 0L;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f43450 = new HandlerC5264(this);
        this.f43449 = new C18483(context);
        this.f43447 = new C10614(context, new C2441(this, context));
        this.f43453 = ViewConfiguration.get(context).getScaledOverflingDistance();
        C13732 c13732 = new C13732(this);
        this.f43452 = c13732;
        this.f43457 = new C10682(this, c13732);
        this.f43455 = new C16554(this);
        C2877 c2877 = new C2877(this);
        c2877.m8673(3500);
        c2877.m8669(new C9285(this));
        this.f43458 = c2877;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32207(final C13026 c13026, MenuItem menuItem) {
        C13732 c13732 = c13026.f43452;
        try {
            int itemId = menuItem.getItemId();
            if ((itemId == R.string.MT_Protector || itemId == R.string.MT_Protector) && c13026.m32214()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c13732.m33450((byte[]) null);
            } else if (itemId == R.string.MT_Protector) {
                c13732.m33460();
            } else if (itemId == 17039361) {
                if (c13732.m33459()) {
                    C15829.m37611(R.string.MT_Protector);
                } else {
                    C22198 c22198M32236 = c13026.m32236();
                    if (c22198M32236 == null) {
                        C15829.m37611(R.string.MT_Protector);
                    } else {
                        new C13545(new C11428(), c13026, c13026.getContext(), c22198M32236).m10243();
                    }
                }
            } else if (itemId == R.string.MT_Protector) {
                int i = C6447.f21817;
                final C2213 c2213M6828 = C2213.m6828(c13026);
                if (c2213M6828 != null) {
                    Context context = c13026.getContext();
                    int i2 = DialogInterfaceC19356.f62401;
                    C8067 c8067 = new C8067(context);
                    c8067.m21255(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛܳۚ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C2213 c2213 = c2213M6828;
                            C13026 c13027 = this.f20879;
                            if (c2213.m6829(c13027)) {
                                C22198 c22198M32237 = c13027.m32236();
                                if (c22198M32237 == null) {
                                    C15829.m37611(R.string.MT_Protector);
                                    return;
                                }
                                if (!c2213.m6829(c13027)) {
                                    c22198M32237.close();
                                    return;
                                }
                                if (i3 < 5 && C6447.m17632(c2213.f7975, c2213.f7974, i3) > 524288) {
                                    c22198M32237.close();
                                    C15829.m37611(R.string.MT_Protector);
                                } else {
                                    Context context2 = c13027.getContext();
                                    new C14582(c2213, context2 instanceof AbstractActivityC12483 ? (AbstractActivityC12483) context2 : null, c22198M32237, c13027, i3, context2).m10243();
                                }
                            }
                        }
                    });
                    DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
                    dialogInterfaceC19356M21252.m44378().setDimAmount(0.0f);
                    dialogInterfaceC19356M21252.m44362();
                }
            } else if (itemId == R.string.MT_Protector) {
                C15717.m37439(c13026);
            } else if (itemId == 17039371) {
                C6488 c6488 = new C6488();
                final C22717 c22717 = new C22717(c13026);
                C11615 c11615M32223 = c13026.m32223(new RunnableC5077(c6488), new Runnable() { // from class: l.᩹ۗۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c22717.m50354();
                    }
                });
                if (c11615M32223 == null) {
                    C15829.m37611(R.string.MT_Protector);
                } else {
                    new C3665(c22717, c13026, c6488, c11615M32223).m10243();
                }
            }
            c13026.invalidate();
        } catch (IOException e) {
            c13026.m32228(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32241(int i) {
        C13732 c13732 = this.f43452;
        c13732.m33449(i, true);
        m32216();
        m32232(c13732.m33443());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32219() {
        C22198 c22198;
        synchronized (this) {
            c22198 = this.f43459;
        }
        if (c22198 != null) {
            c22198.m49254();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m32238() {
        C11615 c11615;
        synchronized (this) {
            c11615 = this.f43456;
        }
        if (c11615 == null) {
            return false;
        }
        c11615.m28949();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32233(Runnable runnable) {
        C11615 c11615;
        synchronized (this) {
            c11615 = this.f43456;
        }
        if (c11615 == null) {
            return false;
        }
        c11615.m28947(runnable);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32208(C13026 c13026, C11615 c11615) {
        synchronized (c13026) {
            if (c13026.f43456 == c11615) {
                c13026.f43456 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32209(C13026 c13026, C22198 c22198) {
        synchronized (c13026) {
            if (c13026.f43459 == c22198) {
                c13026.f43459 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32234(byte[] bArr) {
        if (m32214()) {
            return false;
        }
        try {
            this.f43452.m33450(bArr);
            invalidate();
            return true;
        } catch (IOException e) {
            m32228(e);
            return false;
        } catch (C3015 unused) {
            C15829.m37611(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2516 m32222(C2516 c2516) {
        ViewOnClickListenerC8793 viewOnClickListenerC8793;
        HandlerC5264 handlerC5264 = this.f43450;
        handlerC5264.removeMessages(2);
        handlerC5264.removeMessages(3);
        this.f43458.m8665();
        m32219();
        C18483 c18483 = this.f43449;
        if (!c18483.m42851()) {
            c18483.m42852();
        }
        boolean z = this.f43448;
        this.f43448 = false;
        this.f43461 = false;
        this.f43445 = 0L;
        handlerC5264.f18248 = false;
        C2516 c2516M33447 = this.f43452.m33447(c2516);
        this.f43444 = 0L;
        this.f43460 = false;
        if (z && (viewOnClickListenerC8793 = this.f43441) != null) {
            viewOnClickListenerC8793.m22897(false);
        }
        invalidate();
        return c2516M33447;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32225(int i, int i2) {
        C16554 c16554;
        C13732 c13732 = this.f43452;
        c13732.m33467(i, i2);
        invalidate();
        int iM33443 = c13732.m33443();
        int iM33465 = c13732.m33465();
        if (getHeight() == 0 || (c16554 = this.f43455) == null) {
            return;
        }
        long jM38966 = c16554.m38966();
        long j = this.f43444;
        int iM33464 = iM33443 / c13732.m33464();
        long jM38968 = c16554.m38968(iM33464);
        if (j <= jM38968) {
            jM38968 = c16554.m38960(iM33464);
            if (j >= jM38968) {
                jM38968 = j;
            }
        }
        if (jM38968 > jM38966) {
            jM38968 = jM38966;
        }
        int iM33466 = iM33465 / c13732.m33464();
        if (iM33464 != iM33466) {
            long jM38969 = c16554.m38968(iM33466);
            if (j <= jM38969) {
                jM38969 = c16554.m38960(iM33466);
                if (j >= jM38969) {
                    jM38969 = j;
                }
            }
            if (jM38969 <= jM38966) {
                jM38966 = jM38969;
            }
            if (j == jM38968 && j != jM38966) {
                jM38968 = jM38966;
            } else if (j == jM38968 || j != jM38966) {
                if (j == jM38968) {
                    jM38968 = j;
                } else if (j > jM38968 && j > jM38966) {
                    jM38968 = Math.min(jM38968, jM38966);
                } else if (j >= jM38968 || j >= jM38966) {
                    jM38968 = j;
                } else {
                    jM38968 = Math.max(jM38968, jM38966);
                }
            }
        }
        if (j != jM38968) {
            C18483 c18483 = this.f43449;
            if (!c18483.m42851()) {
                c18483.m42852();
            }
            c18483.m42853(j, jM38968 - j);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32237(int i) {
        if (m32214()) {
            return;
        }
        C13732 c13732 = this.f43452;
        if (c13732.m33475()) {
            return;
        }
        try {
            c13732.m33448(i);
            m32216();
            invalidate();
            m32232(c13732.m33443());
        } catch (IOException e) {
            m32228(e);
        } catch (C3015 unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m32235() {
        return this.f43444;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32227(long j) {
        this.f43444 = j;
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C16554 c16554 = this.f43455;
        boolean zM38957 = c16554.m38957();
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = this.f43462;
        int iM38959 = 0;
        C10682 c10682 = this.f43457;
        boolean z2 = (i5 == i6 || c10682.f36474 == 0) ? false : true;
        C13732 c13732 = this.f43452;
        if (z2) {
            iM38959 = c16554.m38959(0.0f, this.f43444 + ((long) c16554.m38955()), false);
            this.f43462 = i5;
            if (getResources().getConfiguration().orientation == 1) {
                c13732.m33466(8);
            } else {
                c13732.m33466(16);
            }
            c10682.m26893(i5);
        } else {
            c10682.m26894(i5);
        }
        if (zM38957) {
            if (m32232(c13732.m33443())) {
                return;
            }
            long jM38966 = c16554.m38966();
            if (this.f43444 > jM38966) {
                m32227(jM38966);
                return;
            }
            return;
        }
        if (!z2) {
            long jM38967 = c16554.m38966();
            if (this.f43444 > jM38967) {
                m32227(jM38967);
                return;
            }
            return;
        }
        long jMin = Math.min(c16554.m38968(iM38959 / c13732.m33464()), c16554.m38966());
        C18483 c18483 = this.f43449;
        if (!c18483.m42851()) {
            c18483.m42852();
        }
        long j = this.f43444;
        c18483.m42853(j, jMin - j);
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32232(int i) {
        C16554 c16554;
        if (getHeight() == 0 || (c16554 = this.f43455) == null) {
            return false;
        }
        int iM33464 = i / this.f43452.m33464();
        long jM38968 = c16554.m38968(iM33464);
        long jM38966 = c16554.m38966();
        long j = this.f43444;
        if (j <= jM38968) {
            jM38968 = c16554.m38960(iM33464);
            if (j >= jM38968) {
                jM38968 = j;
            }
        }
        if (jM38968 <= jM38966) {
            jM38966 = jM38968;
        }
        if (j == jM38966) {
            return false;
        }
        C18483 c18483 = this.f43449;
        if (!c18483.m42851()) {
            c18483.m42852();
        }
        c18483.m42853(j, jM38966 - j);
        invalidate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        ViewOnClickListenerC8793 viewOnClickListenerC8793;
        if (this.f43461) {
            z = true;
            z2 = true;
        } else {
            z = isFocused() && (SystemClock.uptimeMillis() - this.f43443) % 1000 < 500;
            z2 = isFocused() && SystemClock.uptimeMillis() - this.f43454 < 3500;
        }
        if (this.f43448) {
            f = 1.0f;
        } else {
            int iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.f43445);
            if (iUptimeMillis < 0) {
                f = 0.0f;
            } else if (iUptimeMillis <= 1500) {
                f = 1.0f;
            } else {
                int i = iUptimeMillis - 1500;
                if (i < 300) {
                    f = 1.0f - (i / 300.0f);
                } else {
                    f = 0.0f;
                }
            }
        }
        try {
            this.f43455.m38962(canvas, z, z2, f, this.f43448);
            this.f43460 = false;
        } catch (IOException e) {
            canvas.drawColor(this.f43457.f36468);
            if (this.f43460 || (viewOnClickListenerC8793 = this.f43441) == null) {
                return;
            }
            this.f43460 = true;
            viewOnClickListenerC8793.m22893(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32210(C13026 c13026, boolean z) {
        if (z) {
            HandlerC5264 handlerC5264 = c13026.f43450;
            handlerC5264.removeMessages(2);
            handlerC5264.sendEmptyMessageDelayed(2, 250L);
            return;
        }
        c13026.m32206(-1, false);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m32217(C13026 c13026) {
        c13026.m32206(-1, false);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32206(int i, boolean z) {
        int iM33465;
        boolean z2;
        boolean z3 = true;
        HandlerC5264 handlerC5264 = this.f43450;
        if (handlerC5264 != null) {
            handlerC5264.removeMessages(1);
        }
        C2877 c2877 = this.f43458;
        c2877.m8663();
        C13732 c13732 = this.f43452;
        if (c13732.m33475()) {
            c2877.m8667(R.string.MT_Protector);
            c2877.m8667(android.R.string.copy);
            c2877.m8667(R.string.MT_Protector);
            if (!m32214()) {
                c2877.m8667(R.string.MT_Protector);
                c2877.m8667(R.string.MT_Protector);
            }
        } else {
            c2877.m8667(R.string.MT_Protector);
        }
        if (!m32214() && C13732.m33430()) {
            c2877.m8667(android.R.string.paste);
        }
        C14251 c14251 = new C14251();
        C16554 c16554 = this.f43455;
        if (i != -1) {
            iM33465 = i;
            z2 = true;
        } else {
            if (c16554.m38963(c14251)) {
                c14251.f46661 = ((c14251.f46662 + c14251.f46661) / 2) + 1;
                i = -2;
            } else {
                i = c13732.m33443();
                iM33465 = c13732.m33465();
                c16554.m38961(i, c14251, false);
                long j = c14251.f46659;
                long j2 = this.f43444;
                if (j - j2 < 0 || c14251.f46660 - j2 > getHeight()) {
                    if (i != iM33465) {
                        c16554.m38961(iM33465, c14251, true);
                        long j3 = c14251.f46659;
                        long j4 = this.f43444;
                        if (j3 - j4 >= 0 && c14251.f46660 - j4 <= getHeight()) {
                            z2 = false;
                        }
                    }
                    i = -1;
                }
            }
            iM33465 = i;
            z2 = true;
        }
        if (iM33465 == -1) {
            c2877.m8668(getWidth() / 2, (c2877.m8672() + getHeight()) / 2);
            return;
        }
        if (iM33465 >= 0) {
            c16554.m38961(iM33465, c14251, z);
        }
        C10682 c10682 = this.f43457;
        if (z2) {
            if (c14251.f46659 - this.f43444 < c2877.m8672()) {
                z3 = false;
            } else {
                z3 = z2;
            }
        } else if ((c14251.f46660 - this.f43444) + ((long) c2877.m8672()) + ((long) c10682.f36459.getIntrinsicHeight()) <= getHeight()) {
            z3 = z2;
        }
        if (z3) {
            int i2 = c14251.f46661;
            long j5 = c14251.f46659 - this.f43444;
            int i3 = (int) j5;
            if (j5 != i3) {
                throw new ArithmeticException();
            }
            c2877.m8668(i2, i3);
            return;
        }
        int i4 = c14251.f46661;
        long jM8672 = (c14251.f46660 - this.f43444) + ((long) c2877.m8672()) + ((long) c10682.f36459.getIntrinsicHeight());
        int i5 = (int) jM8672;
        if (jM8672 != i5) {
            throw new ArithmeticException();
        }
        c2877.m8668(i4, i5);
    }

    @Override // android.view.View
    public final void computeScroll() {
        C18483 c18483 = this.f43449;
        if (c18483.m42856()) {
            m32215();
            m32227(c18483.m42855());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m32216() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f43443 = jUptimeMillis;
        this.f43454 = jUptimeMillis;
        this.f43450.m14547();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m32215() {
        this.f43445 = SystemClock.uptimeMillis();
        HandlerC5264 handlerC5264 = this.f43450;
        handlerC5264.removeMessages(3);
        handlerC5264.sendEmptyMessageDelayed(3, 1500L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43450.m14546();
        m32238();
        m32219();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m32216();
        } else {
            this.f43450.m14546();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[PHI: r5
      0x00a9: PHI (r5v5 double) = (r5v3 double), (r5v4 double) binds: [B:36:0x00a7, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != 6) goto L87;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13026.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m32239() {
        this.f43452.m33473();
        this.f43460 = false;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32230(ViewOnClickListenerC8793 viewOnClickListenerC8793) {
        this.f43441 = viewOnClickListenerC8793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32226(int i, int i2, boolean z) {
        this.f43443 = SystemClock.uptimeMillis();
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f43441;
        if (viewOnClickListenerC8793 != null) {
            viewOnClickListenerC8793.m22892(i, i2, this.f43452.m33442(), z);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32240() {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f43441;
        if (viewOnClickListenerC8793 != null) {
            viewOnClickListenerC8793.m22906();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32224() {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f43441;
        if (viewOnClickListenerC8793 != null) {
            C13732 c13732 = this.f43452;
            viewOnClickListenerC8793.m22898(c13732.m33468(), c13732.m33451(), c13732.m33458().m7804());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32228(IOException iOException) {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f43441;
        if (viewOnClickListenerC8793 != null) {
            viewOnClickListenerC8793.m22893(iOException);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m32243() {
        if (m32214()) {
            return;
        }
        C13732 c13732 = this.f43452;
        c13732.m33462();
        invalidate();
        m32232(c13732.m33443());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m32220() {
        if (m32214()) {
            return;
        }
        C13732 c13732 = this.f43452;
        c13732.m33461();
        invalidate();
        m32232(c13732.m33443());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1030 m32221(C16691 c16691) {
        if (c16691 != null) {
            return new C1030(c16691.m39167(), c16691.m39164(), 0, this.f43444, c16691.m39166(), c16691.m39165());
        }
        long j = this.f43444;
        C13732 c13732 = this.f43452;
        return new C1030(c13732.m33443(), c13732.m33465(), 0, j, c13732.m33469(), c13732.m33475());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32229(C1030 c1030) {
        C13638.requireNonNull(c1030, "state");
        boolean z = c1030.f4810;
        boolean z2 = c1030.f4808;
        C13732 c13732 = this.f43452;
        int iM33442 = c13732.m33442();
        int i = c1030.f4807;
        int i2 = c1030.f4809;
        if (iM33442 >= 0) {
            long j = c1030.f4811;
            if (j >= 0) {
                if (z2) {
                    if (iM33442 == 0 || i2 < 0 || i < i2 || i >= iM33442) {
                        throw new IllegalArgumentException("Invalid range selection");
                    }
                } else if (i2 < 0 || i2 != i || i2 > iM33442 || (i2 == iM33442 && !z)) {
                    throw new IllegalArgumentException("Invalid cursor selection");
                }
                this.f43444 = Math.min(j, this.f43455.m38966());
                if (z2) {
                    c13732.m33467(i2, i);
                } else {
                    c13732.m33449(i2, z);
                }
                invalidate();
                return;
            }
        }
        throw new IllegalArgumentException("Negative UI state value");
    }
}
