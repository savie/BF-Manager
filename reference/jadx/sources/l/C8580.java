package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.۠ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8580 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC13800 f28018;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f28019;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18605 f28020;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f28021;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2614 f28022;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f28023;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f28024;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f28025;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f28026;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C24244 f28027;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f28028;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f28029;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28030;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f28031;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C7835 f28032;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public PointF f28033;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public PointF f28034;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C19022 f28035;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f28036;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public PointF f28037;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f28038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f28039;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f28040;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f28041;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public OverScroller f28042;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public PointF f28043;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f28044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f28045;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public float f28046;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PointF f28047;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f28048;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f28049;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f28050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28051;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28052;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f28053;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f28054;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f28055;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f28056;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f28057;

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public C8580(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f28025 = false;
        this.f28055 = -1;
        this.f28023 = -1;
        this.f28050 = -1;
        this.f28036 = -1;
        this.f28033 = new PointF();
        this.f28037 = new PointF();
        this.f28047 = new PointF();
        this.f28034 = new PointF();
        this.f28043 = new PointF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f28039 = displayMetrics.density * 3.0f;
        float f = displayMetrics.scaledDensity;
        this.f28041 = 6.0f * f;
        this.f28049 = f * 30.0f;
        this.f28040 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f28056 = new EdgeEffect(context);
        this.f28045 = new EdgeEffect(context);
        this.f28032 = new C7835(context, new C1123(this));
        this.f28042 = new OverScroller(context);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        this.f28051 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23061(C7089 c7089) {
        this.f28018 = c7089;
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        if (onKeyListener instanceof InterfaceC13800) {
            this.f28018 = (InterfaceC13800) onKeyListener;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23062(C24244 c24244) {
        C19022 c19022;
        C24244 c24245 = this.f28027;
        if (c24244 == c24245) {
            return;
        }
        if (c24245 != null) {
            InterfaceC12309 interfaceC12309M54252 = c24245.m54252();
            if (C1402.m5130(interfaceC12309M54252)) {
                ((C9325) interfaceC12309M54252).m24565((C8580) null);
            }
        }
        InterfaceC12309 interfaceC12309M54253 = c24244.m54252();
        if (C1402.m5130(interfaceC12309M54253)) {
            ((C9325) interfaceC12309M54253).m24565(this);
        }
        this.f28024 = 0;
        this.f28031++;
        this.f28022 = null;
        this.f28027 = c24244;
        this.f28020 = null;
        this.f28029 = 0;
        if (c24244.m54263() != 0.0f && ((c19022 = this.f28035) == null || c19022.f61625 != c24244.m54263())) {
            float fM54263 = c24244.m54263();
            C19022 c19023 = this.f28035;
            this.f28035 = new C19022(fM54263, c19023 == null ? C21576.m49083() : c19023.f61623);
        }
        m23067();
        setVerticalScrollBarEnabled(true);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.inputType = 0;
        editorInfo.imeOptions = 33554432;
        editorInfo.initialSelEnd = 0;
        editorInfo.initialSelStart = 0;
        return new C2614(this);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C18605 c18605 = this.f28020;
        if (c18605 == null) {
            return 1;
        }
        return c18605.m43268().m54879();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C18605 c18605 = this.f28020;
        if (c18605 == null) {
            return 1;
        }
        return c18605.f60484;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C18605 c18605 = this.f28020;
        if (c18605 == null) {
            return 1;
        }
        return (c18605.m43268().m54879() + this.f28024) - this.f28020.f60484;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23066() {
        boolean z;
        int i;
        C18605 c18605 = this.f28020;
        if (c18605 == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = this.f28024 != 0;
        if (this.f28025 || z3) {
            int iM54888 = c18605.m43268().m54888();
            int iM43266 = this.f28020.m43266();
            int i2 = this.f28024;
            if ((-i2) + iM43266 > iM54888) {
                if (this.f28025) {
                    m23060((MotionEvent) null);
                }
                z2 = false;
            } else {
                this.f28024 = i2 - iM43266;
                this.f28050 -= iM43266;
                this.f28036 -= iM43266;
            }
            if (z3) {
                awakenScrollBars();
            }
            z = z2;
        } else {
            z = false;
        }
        if (!z && (i = this.f28024) != 0) {
            if (i < -3) {
                awakenScrollBars();
            }
            this.f28024 = 0;
        }
        this.f28020.m43256();
        invalidate();
        C24573 c24573M43268 = this.f28020.m43268();
        int i3 = this.f28024;
        C18605 c18606 = this.f28020;
        String strM54880 = c24573M43268.m54880(0, i3, c18606.f60461, c18606.f60484 + i3);
        if (this.f28051) {
            setContentDescription(strM54880);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23058(float f) {
        float f2 = f * getContext().getResources().getDisplayMetrics().scaledDensity;
        C19022 c19022 = this.f28035;
        if (c19022 == null || c19022.f61625 != f2) {
            this.f28035 = new C19022(f2, c19022 == null ? C21576.m49083() : c19022.f61623);
            m23067();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23059(Typeface typeface) {
        C19022 c19022 = this.f28035;
        if (c19022.f61623 != typeface) {
            this.f28035 = new C19022(c19022.f61625, typeface);
            m23067();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23035(int i) {
        if (i == 0) {
            return;
        }
        boolean z = i < 0;
        int iAbs = Math.abs(i);
        for (int i2 = 0; i2 < iAbs; i2++) {
            if (this.f28020.m43265()) {
                m23064(z ? 19 : 20, 0);
            } else {
                this.f28024 = Math.min(0, Math.max(-this.f28020.m43268().m54888(), this.f28024 + (z ? -1 : 1)));
                if (!awakenScrollBars()) {
                    invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[PHI: r1
      0x00e6: PHI (r1v45 float) = (r1v42 float), (r1v43 float) binds: [B:48:0x00e4, B:51:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        boolean zIsFinished;
        EdgeEffect edgeEffect2;
        if (this.f28020 != null) {
            int action = motionEvent.getAction() & 255;
            PointF pointF = this.f28033;
            if (action == 0) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                this.f28028 = false;
                this.f28026 = false;
                this.f28048 = false;
                this.f28030 = false;
                this.f28052 = false;
            } else if (action == 1) {
                edgeEffect = this.f28056;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    zIsFinished = this.f28056.isFinished();
                } else {
                    zIsFinished = false;
                }
                edgeEffect2 = this.f28045;
                if (edgeEffect2 != null) {
                    edgeEffect2.onRelease();
                    zIsFinished |= this.f28045.isFinished();
                }
                if (zIsFinished) {
                    postInvalidateOnAnimation();
                }
            } else if (action != 2) {
                if (action == 3) {
                    edgeEffect = this.f28056;
                    if (edgeEffect != null) {
                        edgeEffect.onRelease();
                        zIsFinished = this.f28056.isFinished();
                    } else {
                        zIsFinished = false;
                    }
                    edgeEffect2 = this.f28045;
                    if (edgeEffect2 != null) {
                        edgeEffect2.onRelease();
                        zIsFinished |= this.f28045.isFinished();
                    }
                    if (zIsFinished) {
                        postInvalidateOnAnimation();
                    }
                } else if (action == 5) {
                    int i3 = this.f28021 + 1;
                    this.f28021 = i3;
                    if (i3 == 1) {
                        this.f28048 = true;
                        this.f28030 = true;
                        this.f28019 = this.f28035.f61625;
                        this.f28046 = m23053(motionEvent);
                        this.f28032.m21360(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                } else if (action == 6) {
                    int i4 = this.f28021 - 1;
                    this.f28021 = i4;
                    if (this.f28048 && i4 == 0) {
                        this.f28048 = false;
                    }
                }
            } else if (!this.f28026 && m23033(pointF, new PointF(motionEvent.getX(), motionEvent.getY())) >= this.f28040) {
                this.f28026 = true;
            }
            if (action == 2 && this.f28048 && this.f28021 == 1) {
                float fM23053 = m23053(motionEvent);
                if (!this.f28052) {
                    if (Math.abs(fM23053 - this.f28046) > this.f28040) {
                        this.f28052 = true;
                    }
                }
                float f = (this.f28019 * fM23053) / this.f28046;
                float f2 = this.f28049;
                if (f > f2) {
                    f = f2;
                } else {
                    f2 = this.f28041;
                    if (f < f2) {
                        f = f2;
                    }
                }
                this.f28035 = new C19022(f, this.f28035.f61623);
                invalidate();
                return true;
            }
            if ((action == 1 || action == 3) && this.f28030 && this.f28052) {
                m23067();
                return true;
            }
            if (!this.f28030) {
                if (!this.f28025) {
                    this.f28032.m21360(motionEvent);
                    return true;
                }
                boolean z = this.f28028;
                PointF pointF2 = this.f28047;
                if (z) {
                    if (action != 1) {
                        if (action == 2) {
                            if (this.f28026) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                PointF pointF3 = this.f28037;
                                pointF3.set(x, y);
                                pointF3.offset(pointF2.x, pointF2.y);
                                float f3 = pointF3.x;
                                C19022 c19022 = this.f28035;
                                int i5 = (int) (f3 / c19022.f61627);
                                int i6 = ((int) (pointF3.y / c19022.f61624)) + this.f28024;
                                if (this.f28038) {
                                    this.f28055 = i5;
                                    this.f28050 = i6;
                                } else {
                                    this.f28023 = i5;
                                    this.f28036 = i6;
                                }
                                C18605 c18605 = this.f28020;
                                int i7 = c18605.f60461 - 1;
                                int i8 = -c18605.m43268().m54888();
                                int i9 = this.f28020.f60484 - 1;
                                this.f28055 = Math.min(i7, Math.max(0, this.f28055));
                                this.f28023 = Math.min(i7, Math.max(0, this.f28023));
                                this.f28050 = Math.min(i9, Math.max(i8, this.f28050));
                                int iMin = Math.min(i9, Math.max(i8, this.f28036));
                                this.f28036 = iMin;
                                int i10 = this.f28050;
                                if ((i10 == iMin && this.f28055 > this.f28023) || i10 > iMin) {
                                    this.f28038 = !this.f28038;
                                    int i11 = this.f28055;
                                    this.f28055 = this.f28023;
                                    this.f28050 = iMin;
                                    this.f28023 = i11;
                                    this.f28036 = i10;
                                }
                                int i12 = this.f28038 ? this.f28050 : this.f28036;
                                int i13 = this.f28024;
                                if (i12 < i13) {
                                    m23035(i12 - i13);
                                } else {
                                    int i14 = i13 + this.f28020.f60484;
                                    if (i14 <= i12) {
                                        m23035((i12 - i14) + 1);
                                    }
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } else if (!this.f28026 && (i = this.f28050) == (i2 = this.f28036)) {
                        int i15 = this.f28023;
                        int i16 = this.f28055;
                        if (i15 - i16 < 10) {
                            this.f28027.mo23818(this.f28020.m43255(i16, i, i15, i2).trim());
                            m23060((MotionEvent) null);
                            if (C21576.f68932.getBoolean("term_copy_text_tip", true)) {
                                C21576.f68932.edit().putBoolean("term_copy_text_tip", false).apply();
                                return true;
                            }
                        } else if (C21576.f68932.getBoolean("term_copy_text_tip", true)) {
                            C22673.m51152(R.string.MT_Protector);
                        }
                    } else if (C21576.f68932.getBoolean("term_copy_text_tip", true)) {
                        C22673.m51152(R.string.MT_Protector);
                    }
                } else if (action == 0) {
                    float fM23033 = m23033(pointF, this.f28034);
                    float fM23034 = m23033(pointF, this.f28043);
                    if (fM23033 < fM23034 && fM23033 <= this.f28054) {
                        this.f28028 = true;
                        this.f28038 = true;
                        float f4 = this.f28055;
                        C19022 c19023 = this.f28035;
                        pointF2.set((f4 * c19023.f61627) - pointF.x, ((this.f28050 - this.f28024) * c19023.f61624) - pointF.y);
                        this.f28026 = false;
                        return true;
                    }
                    if (fM23034 <= this.f28054) {
                        this.f28028 = true;
                        this.f28038 = false;
                        float f5 = this.f28023;
                        C19022 c19024 = this.f28035;
                        pointF2.set((f5 * c19024.f61627) - pointF.x, ((this.f28036 - this.f28024) * c19024.f61624) - pointF.y);
                        this.f28026 = false;
                        return true;
                    }
                }
                this.f28032.m21360(motionEvent);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m23053(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f28025) {
                m23060((MotionEvent) null);
                return true;
            }
            this.f28018.getClass();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f28020 != null) {
            if (this.f28018.mo33708(i, this.f28027)) {
                invalidate();
                return true;
            }
            if (keyEvent.isSystem()) {
                this.f28018.getClass();
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getAction() == 2 && i == 0) {
                C2614 c2614 = this.f28022;
                if (c2614 != null) {
                    c2614.m8747();
                }
                this.f28027.m23822(keyEvent.getCharacters());
                return true;
            }
            int metaState = keyEvent.getMetaState();
            boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
            boolean z = (metaState & 16) != 0;
            boolean z2 = (metaState & 32) != 0;
            int i2 = zIsCtrlPressed ? 1073741824 : 0;
            if (keyEvent.isAltPressed()) {
                i2 |= Integer.MIN_VALUE;
            }
            if (keyEvent.isShiftPressed()) {
                i2 |= 536870912;
            }
            if (keyEvent.isFunctionPressed() || !m23064(i, i2)) {
                int unicodeChar = keyEvent.getUnicodeChar((~(z2 ? UMModuleRegister.SHARE_EVENT_VALUE_HIGH : 28690)) & keyEvent.getMetaState());
                if (unicodeChar == 0) {
                    return false;
                }
                int i3 = this.f28029;
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    if (i3 != 0) {
                        m23036(i3, zIsCtrlPressed, z);
                    }
                    this.f28029 = unicodeChar & Integer.MAX_VALUE;
                } else {
                    if (i3 != 0) {
                        int deadChar = KeyCharacterMap.getDeadChar(i3, unicodeChar);
                        if (deadChar > 0) {
                            unicodeChar = deadChar;
                        }
                        this.f28029 = 0;
                    }
                    m23036(unicodeChar, zIsCtrlPressed, z);
                }
                if (this.f28029 != i3) {
                    invalidate();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23036(int i, boolean z, boolean z2) {
        if (this.f28027 == null) {
            return;
        }
        if (this.f28025) {
            m23060((MotionEvent) null);
        }
        boolean z3 = true;
        boolean z4 = z || this.f28018.mo33709();
        if (!z2 && !this.f28018.mo33710()) {
            z3 = false;
        }
        boolean zMo33711 = this.f28018.mo33711(i, this.f28027);
        C2614 c2614 = this.f28022;
        if (c2614 != null && c2614.f8389 && (zMo33711 || z4 || z3)) {
            this.f28022.f8392 = true;
        }
        if (zMo33711) {
            return;
        }
        int i2 = 94;
        if (z4) {
            if (i >= 97 && i <= 122) {
                i -= 96;
            } else if (i >= 65 && i <= 90) {
                i -= 64;
            } else if (i == 32 || i == 50) {
                i = 0;
            } else if (i == 91 || i == 51) {
                i = 27;
            } else if (i == 92 || i == 52) {
                i = 28;
            } else if (i == 93 || i == 53) {
                i = 29;
            } else if (i == 94 || i == 54) {
                i = 30;
            } else if (i == 95 || i == 55 || i == 47) {
                i = 31;
            } else if (i == 56) {
                i = 127;
            }
        }
        if (i > -1) {
            if (i != 710) {
                if (i != 715) {
                    i2 = i != 732 ? i : 126;
                } else {
                    i2 = 96;
                }
            }
            C2614 c2615 = this.f28022;
            if (c2615 != null && !c2615.f8389) {
                this.f28022.m8747();
            }
            this.f28027.m54255(i2, z3);
            m23051();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23064(int i, int i2) {
        if (this.f28025) {
            m23060((MotionEvent) null);
        }
        C18605 c18605M54258 = this.f28027.m54258();
        String strM37828 = C15864.m37828(i, i2, c18605M54258.m43262(), c18605M54258.m43254());
        if (strM37828 == null) {
            return false;
        }
        this.f28027.m23822(strM37828);
        C2614 c2614 = this.f28022;
        if (c2614 != null) {
            C2614.m8741(c2614, i, i2);
        }
        m23051();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f28020 == null) {
            return true;
        }
        this.f28018.getClass();
        if (keyEvent.isSystem()) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m23051() {
        if (this.f28024 != 0) {
            this.f28024 = 0;
            this.f28020.m43256();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m23067();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23067() {
        C18605 c18605;
        int width = (int) (getWidth() - this.f28039);
        int height = getHeight();
        if (width == 0 || height == 0 || this.f28027 == null) {
            return;
        }
        float f = width;
        int iMax = Math.max(4, (int) (f / this.f28035.f61627));
        C19022 c19022 = this.f28035;
        if (f - (iMax * c19022.f61627) < this.f28039) {
            iMax--;
        }
        int iMax2 = Math.max(4, (height - c19022.f61629) / c19022.f61624);
        if (this.f28025 && (c18605 = this.f28020) != null && iMax != c18605.f60461) {
            m23060((MotionEvent) null);
        }
        C18605 c18606 = this.f28020;
        if (c18606 != null && iMax == c18606.f60461 && iMax2 == c18606.f60484) {
            return;
        }
        int iM43263 = (!this.f28025 || c18606 == null) ? -1 : c18606.m43263();
        this.f28027.m54254(iMax, this.f28035.f61625, iMax2);
        C18605 c18605M54258 = this.f28027.m54258();
        this.f28020 = c18605M54258;
        this.f28024 = 0;
        if (iM43263 != -1) {
            int iM43264 = c18605M54258.m43263() - iM43263;
            this.f28050 += iM43264;
            this.f28036 += iM43264;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.f28020 == null) {
            canvas.drawColor(-16777216);
            return;
        }
        canvas.translate(this.f28039, 0.0f);
        this.f28035.m44113(this.f28020, canvas, this.f28024, this.f28050, this.f28036, this.f28055, this.f28023);
        if (this.f28025) {
            int intrinsicWidth = this.f28053.getIntrinsicWidth();
            int i = intrinsicWidth / 4;
            int iRound = Math.round(this.f28055 * this.f28035.f61627) + i;
            int i2 = (this.f28050 + 1) - this.f28024;
            C19022 c19022 = this.f28035;
            int i3 = (i2 * c19022.f61624) + c19022.f61629;
            BitmapDrawable bitmapDrawable = this.f28053;
            bitmapDrawable.setBounds(iRound - intrinsicWidth, i3, iRound, bitmapDrawable.getIntrinsicHeight() + i3);
            this.f28053.draw(canvas);
            int iRound2 = Math.round((this.f28023 + 1) * this.f28035.f61627) - i;
            int i4 = (this.f28036 + 1) - this.f28024;
            C19022 c19023 = this.f28035;
            int i5 = (i4 * c19023.f61624) + c19023.f61629;
            BitmapDrawable bitmapDrawable2 = this.f28057;
            bitmapDrawable2.setBounds(iRound2, i5, intrinsicWidth + iRound2, bitmapDrawable2.getIntrinsicHeight() + i5);
            this.f28057.draw(canvas);
            Rect bounds = this.f28053.getBounds();
            this.f28034.set((bounds.left + bounds.right) / 2.0f, (bounds.top + bounds.bottom) / 2.0f);
            Rect bounds2 = this.f28057.getBounds();
            this.f28043.set((bounds2.left + bounds2.right) / 2.0f, (bounds2.top + bounds2.bottom) / 2.0f);
        }
        canvas.translate(-this.f28039, 0.0f);
        EdgeEffect edgeEffect = this.f28056;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            this.f28056.setColor(this.f28020.f60472.f48607[260]);
            int iSave = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            this.f28056.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect2 = this.f28056;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f28045;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            this.f28045.setColor(this.f28020.f60472.f48607[260]);
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            this.f28045.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect4 = this.f28045;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m23033(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = (f - f2) * (f - f2);
        float f4 = pointF.y;
        float f5 = pointF2.y;
        return (float) Math.sqrt(C19967.m45884(f4, f5, f4 - f5, f3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23060(MotionEvent motionEvent) {
        boolean z = this.f28025;
        this.f28025 = !z;
        if (!z) {
            if (this.f28053 == null) {
                Resources resources = getContext().getResources();
                this.f28053 = (BitmapDrawable) C9217.m24392(resources, R.drawable.MT_Protector, null).mutate();
                this.f28057 = (BitmapDrawable) C9217.m24392(resources, R.drawable.MT_Protector, null).mutate();
                this.f28053.setAlpha(210);
                this.f28057.setAlpha(210);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
                this.f28053.setColorFilter(porterDuffColorFilter);
                this.f28057.setColorFilter(porterDuffColorFilter);
                this.f28054 = this.f28053.getIntrinsicHeight() * 1.8f;
            }
            int x = (int) (motionEvent.getX() / this.f28035.f61627);
            int y = ((int) (motionEvent.getY() / this.f28035.f61624)) + this.f28024;
            int i = -this.f28020.m43268().m54888();
            C18605 c18605 = this.f28020;
            int i2 = c18605.f60484 - 1;
            if (y < i || y > i2) {
                return;
            }
            this.f28023 = x;
            this.f28055 = x;
            this.f28036 = y;
            this.f28050 = y;
            C24573 c24573M43268 = c18605.m43268();
            int i3 = this.f28055;
            int i4 = this.f28050;
            if (!" ".equals(c24573M43268.m54880(i3, i4, i3, i4))) {
                while (true) {
                    int i5 = this.f28055;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = this.f28050;
                    if (c24573M43268.m54880(i5 - 1, i6, i5 - 1, i6).isEmpty()) {
                        break;
                    } else {
                        this.f28055--;
                    }
                }
                while (true) {
                    int i7 = this.f28023;
                    if (i7 >= this.f28020.f60461 - 1) {
                        break;
                    }
                    int i8 = this.f28050;
                    if (c24573M43268.m54880(i7 + 1, i8, i7 + 1, i8).isEmpty()) {
                        break;
                    } else {
                        this.f28023++;
                    }
                }
            }
            invalidate();
            return;
        }
        this.f28036 = -1;
        this.f28023 = -1;
        this.f28050 = -1;
        this.f28055 = -1;
        invalidate();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23065() {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null) ? null : primaryClip.getItemAt(0).getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (this.f28025) {
            m23060((MotionEvent) null);
        }
        C2614 c2614 = this.f28022;
        if (c2614 != null) {
            c2614.m8747();
        }
        this.f28020.m43261(text.toString());
        m23051();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23063() {
        ClipData primaryClip;
        C24244 c24244 = this.f28027;
        if (c24244 == null || !c24244.m54260()) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            text = primaryClip.getItemAt(0).getText();
        }
        return !TextUtils.isEmpty(text);
    }
}
