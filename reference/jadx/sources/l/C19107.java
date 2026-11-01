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

/* JADX INFO: renamed from: l.᩵֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19107 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EdgeEffect f61698;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f61699;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public PointF f61700;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f61701;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f61702;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f61703;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f61704;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f61705;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f61706;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public PointF f61707;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C14874 f61708;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f61709;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f61710;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f61711;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f61712;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C4995 f61713;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5575 f61714;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public PointF f61715;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61716;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61717;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61718;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f61719;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7818 f61720;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public PointF f61721;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f61722;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f61723;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC9935 f61724;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f61725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PointF f61726;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f61727;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public OverScroller f61728;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f61729;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f61730;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61731;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61732;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f61733;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f61734;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f61735;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f61736;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22635 f61737;

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public C19107(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f61705 = false;
        this.f61729 = -1;
        this.f61710 = -1;
        this.f61730 = -1;
        this.f61711 = -1;
        this.f61707 = new PointF();
        this.f61700 = new PointF();
        this.f61726 = new PointF();
        this.f61715 = new PointF();
        this.f61721 = new PointF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f61722 = displayMetrics.density * 3.0f;
        float f = displayMetrics.scaledDensity;
        this.f61735 = 6.0f * f;
        this.f61706 = f * 30.0f;
        this.f61723 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f61709 = new EdgeEffect(context);
        this.f61698 = new EdgeEffect(context);
        this.f61737 = new C22635(context, new C17695(this));
        this.f61728 = new OverScroller(context);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        this.f61731 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43904(C8524 c8524) {
        this.f61724 = c8524;
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        if (onKeyListener instanceof InterfaceC9935) {
            this.f61724 = (InterfaceC9935) onKeyListener;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43903(C4995 c4995) {
        C14874 c14874;
        C4995 c4996 = this.f61713;
        if (c4995 == c4996) {
            return;
        }
        if (c4996 != null) {
            InterfaceC11346 interfaceC11346M13836 = c4996.m13836();
            if (C6009.m16315(interfaceC11346M13836)) {
                ((C18401) interfaceC11346M13836).m42685((C19107) null);
            }
        }
        InterfaceC11346 interfaceC11346M13837 = c4995.m13836();
        if (C6009.m16315(interfaceC11346M13837)) {
            ((C18401) interfaceC11346M13837).m42685(this);
        }
        this.f61733 = 0;
        this.f61701++;
        this.f61720 = null;
        this.f61713 = c4995;
        this.f61714 = null;
        this.f61716 = 0;
        if (c4995.m13850() != 0.0f && ((c14874 = this.f61708) == null || c14874.f48621 != c4995.m13850())) {
            float fM13850 = c4995.m13850();
            C14874 c14875 = this.f61708;
            this.f61708 = new C14874(fM13850, c14875 == null ? C16737.m39295() : c14875.f48626);
        }
        m43899();
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
        return new C7818(this);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C5575 c5575 = this.f61714;
        if (c5575 == null) {
            return 1;
        }
        return c5575.m15433().m13563();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C5575 c5575 = this.f61714;
        if (c5575 == null) {
            return 1;
        }
        return c5575.f19153;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C5575 c5575 = this.f61714;
        if (c5575 == null) {
            return 1;
        }
        return (c5575.m15433().m13563() + this.f61733) - this.f61714.f19153;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43908() {
        boolean z;
        int i;
        C5575 c5575 = this.f61714;
        if (c5575 == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = this.f61733 != 0;
        if (this.f61705 || z3) {
            int iM13572 = c5575.m15433().m13572();
            int iM15439 = this.f61714.m15439();
            int i2 = this.f61733;
            if ((-i2) + iM15439 > iM13572) {
                if (this.f61705) {
                    m43902((MotionEvent) null);
                }
                z2 = false;
            } else {
                this.f61733 = i2 - iM15439;
                this.f61730 -= iM15439;
                this.f61711 -= iM15439;
            }
            if (z3) {
                awakenScrollBars();
            }
            z = z2;
        } else {
            z = false;
        }
        if (!z && (i = this.f61733) != 0) {
            if (i < -3) {
                awakenScrollBars();
            }
            this.f61733 = 0;
        }
        this.f61714.m15427();
        invalidate();
        C4869 c4869M15433 = this.f61714.m15433();
        int i3 = this.f61733;
        C5575 c5576 = this.f61714;
        String strM13564 = c4869M15433.m13564(0, i3, c5576.f19142, c5576.f19153 + i3);
        if (this.f61731) {
            setContentDescription(strM13564);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43900(float f) {
        float f2 = f * getContext().getResources().getDisplayMetrics().scaledDensity;
        C14874 c14874 = this.f61708;
        if (c14874 == null || c14874.f48621 != f2) {
            this.f61708 = new C14874(f2, c14874 == null ? C16737.m39295() : c14874.f48626);
            m43899();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43901(Typeface typeface) {
        C14874 c14874 = this.f61708;
        if (c14874.f48626 != typeface) {
            this.f61708 = new C14874(c14874.f48621, typeface);
            m43899();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43877(int i) {
        if (i == 0) {
            return;
        }
        boolean z = i < 0;
        int iAbs = Math.abs(i);
        for (int i2 = 0; i2 < iAbs; i2++) {
            if (this.f61714.m15423()) {
                m43906(z ? 19 : 20, 0);
            } else {
                this.f61733 = Math.min(0, Math.max(-this.f61714.m15433().m13572(), this.f61733 + (z ? -1 : 1)));
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
        if (this.f61714 != null) {
            int action = motionEvent.getAction() & 255;
            PointF pointF = this.f61707;
            if (action == 0) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                this.f61712 = false;
                this.f61718 = false;
                this.f61727 = false;
                this.f61717 = false;
                this.f61732 = false;
            } else if (action == 1) {
                edgeEffect = this.f61709;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    zIsFinished = this.f61709.isFinished();
                } else {
                    zIsFinished = false;
                }
                edgeEffect2 = this.f61698;
                if (edgeEffect2 != null) {
                    edgeEffect2.onRelease();
                    zIsFinished |= this.f61698.isFinished();
                }
                if (zIsFinished) {
                    postInvalidateOnAnimation();
                }
            } else if (action != 2) {
                if (action == 3) {
                    edgeEffect = this.f61709;
                    if (edgeEffect != null) {
                        edgeEffect.onRelease();
                        zIsFinished = this.f61709.isFinished();
                    } else {
                        zIsFinished = false;
                    }
                    edgeEffect2 = this.f61698;
                    if (edgeEffect2 != null) {
                        edgeEffect2.onRelease();
                        zIsFinished |= this.f61698.isFinished();
                    }
                    if (zIsFinished) {
                        postInvalidateOnAnimation();
                    }
                } else if (action == 5) {
                    int i3 = this.f61704 + 1;
                    this.f61704 = i3;
                    if (i3 == 1) {
                        this.f61727 = true;
                        this.f61717 = true;
                        this.f61725 = this.f61708.f48621;
                        this.f61699 = m43890(motionEvent);
                        this.f61737.m50176(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                } else if (action == 6) {
                    int i4 = this.f61704 - 1;
                    this.f61704 = i4;
                    if (this.f61727 && i4 == 0) {
                        this.f61727 = false;
                    }
                }
            } else if (!this.f61718 && m43875(pointF, new PointF(motionEvent.getX(), motionEvent.getY())) >= this.f61723) {
                this.f61718 = true;
            }
            if (action == 2 && this.f61727 && this.f61704 == 1) {
                float fM43890 = m43890(motionEvent);
                if (!this.f61732) {
                    if (Math.abs(fM43890 - this.f61699) > this.f61723) {
                        this.f61732 = true;
                    }
                }
                float f = (this.f61725 * fM43890) / this.f61699;
                float f2 = this.f61706;
                if (f > f2) {
                    f = f2;
                } else {
                    f2 = this.f61735;
                    if (f < f2) {
                        f = f2;
                    }
                }
                this.f61708 = new C14874(f, this.f61708.f48626);
                invalidate();
                return true;
            }
            if ((action == 1 || action == 3) && this.f61717 && this.f61732) {
                m43899();
                return true;
            }
            if (!this.f61717) {
                if (!this.f61705) {
                    this.f61737.m50176(motionEvent);
                    return true;
                }
                boolean z = this.f61712;
                PointF pointF2 = this.f61726;
                if (z) {
                    if (action != 1) {
                        if (action == 2) {
                            if (this.f61718) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                PointF pointF3 = this.f61700;
                                pointF3.set(x, y);
                                pointF3.offset(pointF2.x, pointF2.y);
                                float f3 = pointF3.x;
                                C14874 c14874 = this.f61708;
                                int i5 = (int) (f3 / c14874.f48624);
                                int i6 = ((int) (pointF3.y / c14874.f48625)) + this.f61733;
                                if (this.f61703) {
                                    this.f61729 = i5;
                                    this.f61730 = i6;
                                } else {
                                    this.f61710 = i5;
                                    this.f61711 = i6;
                                }
                                C5575 c5575 = this.f61714;
                                int i7 = c5575.f19142 - 1;
                                int i8 = -c5575.m15433().m13572();
                                int i9 = this.f61714.f19153 - 1;
                                this.f61729 = Math.min(i7, Math.max(0, this.f61729));
                                this.f61710 = Math.min(i7, Math.max(0, this.f61710));
                                this.f61730 = Math.min(i9, Math.max(i8, this.f61730));
                                int iMin = Math.min(i9, Math.max(i8, this.f61711));
                                this.f61711 = iMin;
                                int i10 = this.f61730;
                                if ((i10 == iMin && this.f61729 > this.f61710) || i10 > iMin) {
                                    this.f61703 = !this.f61703;
                                    int i11 = this.f61729;
                                    this.f61729 = this.f61710;
                                    this.f61730 = iMin;
                                    this.f61710 = i11;
                                    this.f61711 = i10;
                                }
                                int i12 = this.f61703 ? this.f61730 : this.f61711;
                                int i13 = this.f61733;
                                if (i12 < i13) {
                                    m43877(i12 - i13);
                                } else {
                                    int i14 = i13 + this.f61714.f19153;
                                    if (i14 <= i12) {
                                        m43877((i12 - i14) + 1);
                                    }
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } else if (!this.f61718 && (i = this.f61730) == (i2 = this.f61711)) {
                        int i15 = this.f61710;
                        int i16 = this.f61729;
                        if (i15 - i16 < 10) {
                            this.f61713.mo13841(this.f61714.m15426(i16, i, i15, i2).trim());
                            m43902((MotionEvent) null);
                            if (C16737.f53615.getBoolean("term_copy_text_tip", true)) {
                                C16737.f53615.edit().putBoolean("term_copy_text_tip", false).apply();
                                return true;
                            }
                        } else if (C16737.f53615.getBoolean("term_copy_text_tip", true)) {
                            C15829.m37611(R.string.MT_Protector);
                        }
                    } else if (C16737.f53615.getBoolean("term_copy_text_tip", true)) {
                        C15829.m37611(R.string.MT_Protector);
                    }
                } else if (action == 0) {
                    float fM43875 = m43875(pointF, this.f61715);
                    float fM43876 = m43875(pointF, this.f61721);
                    if (fM43875 < fM43876 && fM43875 <= this.f61702) {
                        this.f61712 = true;
                        this.f61703 = true;
                        float f4 = this.f61729;
                        C14874 c14875 = this.f61708;
                        pointF2.set((f4 * c14875.f48624) - pointF.x, ((this.f61730 - this.f61733) * c14875.f48625) - pointF.y);
                        this.f61718 = false;
                        return true;
                    }
                    if (fM43876 <= this.f61702) {
                        this.f61712 = true;
                        this.f61703 = false;
                        float f5 = this.f61710;
                        C14874 c14876 = this.f61708;
                        pointF2.set((f5 * c14876.f48624) - pointF.x, ((this.f61711 - this.f61733) * c14876.f48625) - pointF.y);
                        this.f61718 = false;
                        return true;
                    }
                }
                this.f61737.m50176(motionEvent);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static float m43890(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f61705) {
                m43902((MotionEvent) null);
                return true;
            }
            this.f61724.getClass();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f61714 != null) {
            if (this.f61724.mo2927(i, this.f61713)) {
                invalidate();
                return true;
            }
            if (keyEvent.isSystem()) {
                this.f61724.getClass();
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getAction() == 2 && i == 0) {
                C7818 c7818 = this.f61720;
                if (c7818 != null) {
                    c7818.m20620();
                }
                this.f61713.m48569(keyEvent.getCharacters());
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
            if (keyEvent.isFunctionPressed() || !m43906(i, i2)) {
                int unicodeChar = keyEvent.getUnicodeChar((~(z2 ? UMModuleRegister.SHARE_EVENT_VALUE_HIGH : 28690)) & keyEvent.getMetaState());
                if (unicodeChar == 0) {
                    return false;
                }
                int i3 = this.f61716;
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    if (i3 != 0) {
                        m43878(i3, zIsCtrlPressed, z);
                    }
                    this.f61716 = unicodeChar & Integer.MAX_VALUE;
                } else {
                    if (i3 != 0) {
                        int deadChar = KeyCharacterMap.getDeadChar(i3, unicodeChar);
                        if (deadChar > 0) {
                            unicodeChar = deadChar;
                        }
                        this.f61716 = 0;
                    }
                    m43878(unicodeChar, zIsCtrlPressed, z);
                }
                if (this.f61716 != i3) {
                    invalidate();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43878(int i, boolean z, boolean z2) {
        if (this.f61713 == null) {
            return;
        }
        if (this.f61705) {
            m43902((MotionEvent) null);
        }
        boolean z3 = true;
        boolean z4 = z || this.f61724.mo2928();
        if (!z2 && !this.f61724.mo2929()) {
            z3 = false;
        }
        boolean zMo2930 = this.f61724.mo2930(i, this.f61713);
        C7818 c7818 = this.f61720;
        if (c7818 != null && c7818.f25737 && (zMo2930 || z4 || z3)) {
            this.f61720.f25739 = true;
        }
        if (zMo2930) {
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
            C7818 c7819 = this.f61720;
            if (c7819 != null && !c7819.f25737) {
                this.f61720.m20620();
            }
            this.f61713.m13839(i2, z3);
            m43884();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43906(int i, int i2) {
        if (this.f61705) {
            m43902((MotionEvent) null);
        }
        C5575 c5575M13834 = this.f61713.m13834();
        String strM6574 = C2067.m6574(i, i2, c5575M13834.m15436(), c5575M13834.m15425());
        if (strM6574 == null) {
            return false;
        }
        this.f61713.m48569(strM6574);
        C7818 c7818 = this.f61720;
        if (c7818 != null) {
            C7818.m20614(c7818, i, i2);
        }
        m43884();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f61714 == null) {
            return true;
        }
        this.f61724.getClass();
        if (keyEvent.isSystem()) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m43884() {
        if (this.f61733 != 0) {
            this.f61733 = 0;
            this.f61714.m15427();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m43899();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43899() {
        C5575 c5575;
        int width = (int) (getWidth() - this.f61722);
        int height = getHeight();
        if (width == 0 || height == 0 || this.f61713 == null) {
            return;
        }
        float f = width;
        int iMax = Math.max(4, (int) (f / this.f61708.f48624));
        C14874 c14874 = this.f61708;
        if (f - (iMax * c14874.f48624) < this.f61722) {
            iMax--;
        }
        int iMax2 = Math.max(4, (height - c14874.f48622) / c14874.f48625);
        if (this.f61705 && (c5575 = this.f61714) != null && iMax != c5575.f19142) {
            m43902((MotionEvent) null);
        }
        C5575 c5576 = this.f61714;
        if (c5576 != null && iMax == c5576.f19142 && iMax2 == c5576.f19153) {
            return;
        }
        int iM15435 = (!this.f61705 || c5576 == null) ? -1 : c5576.m15435();
        this.f61713.m13838(iMax, this.f61708.f48621, iMax2);
        C5575 c5575M13834 = this.f61713.m13834();
        this.f61714 = c5575M13834;
        this.f61733 = 0;
        if (iM15435 != -1) {
            int iM15436 = c5575M13834.m15435() - iM15435;
            this.f61730 += iM15436;
            this.f61711 += iM15436;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.f61714 == null) {
            canvas.drawColor(-16777216);
            return;
        }
        canvas.translate(this.f61722, 0.0f);
        this.f61708.m35570(this.f61714, canvas, this.f61733, this.f61730, this.f61711, this.f61729, this.f61710);
        if (this.f61705) {
            int intrinsicWidth = this.f61719.getIntrinsicWidth();
            int i = intrinsicWidth / 4;
            int iRound = Math.round(this.f61729 * this.f61708.f48624) + i;
            int i2 = (this.f61730 + 1) - this.f61733;
            C14874 c14874 = this.f61708;
            int i3 = (i2 * c14874.f48625) + c14874.f48622;
            BitmapDrawable bitmapDrawable = this.f61719;
            bitmapDrawable.setBounds(iRound - intrinsicWidth, i3, iRound, bitmapDrawable.getIntrinsicHeight() + i3);
            this.f61719.draw(canvas);
            int iRound2 = Math.round((this.f61710 + 1) * this.f61708.f48624) - i;
            int i4 = (this.f61711 + 1) - this.f61733;
            C14874 c14875 = this.f61708;
            int i5 = (i4 * c14875.f48625) + c14875.f48622;
            BitmapDrawable bitmapDrawable2 = this.f61736;
            bitmapDrawable2.setBounds(iRound2, i5, intrinsicWidth + iRound2, bitmapDrawable2.getIntrinsicHeight() + i5);
            this.f61736.draw(canvas);
            Rect bounds = this.f61719.getBounds();
            this.f61715.set((bounds.left + bounds.right) / 2.0f, (bounds.top + bounds.bottom) / 2.0f);
            Rect bounds2 = this.f61736.getBounds();
            this.f61721.set((bounds2.left + bounds2.right) / 2.0f, (bounds2.top + bounds2.bottom) / 2.0f);
        }
        canvas.translate(-this.f61722, 0.0f);
        EdgeEffect edgeEffect = this.f61709;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            this.f61709.setColor(this.f61714.f19121.f40021[260]);
            int iSave = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            this.f61709.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect2 = this.f61709;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f61698;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            this.f61698.setColor(this.f61714.f19121.f40021[260]);
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            this.f61698.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect4 = this.f61698;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m43875(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = (f - f2) * (f - f2);
        float f4 = pointF.y;
        float f5 = pointF2.y;
        return (float) Math.sqrt(C0280.m1792(f4, f5, f4 - f5, f3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43902(MotionEvent motionEvent) {
        boolean z = this.f61705;
        this.f61705 = !z;
        if (!z) {
            if (this.f61719 == null) {
                Resources resources = getContext().getResources();
                this.f61719 = (BitmapDrawable) C16631.m39101(resources, R.drawable.MT_Protector, null).mutate();
                this.f61736 = (BitmapDrawable) C16631.m39101(resources, R.drawable.MT_Protector, null).mutate();
                this.f61719.setAlpha(210);
                this.f61736.setAlpha(210);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
                this.f61719.setColorFilter(porterDuffColorFilter);
                this.f61736.setColorFilter(porterDuffColorFilter);
                this.f61702 = this.f61719.getIntrinsicHeight() * 1.8f;
            }
            int x = (int) (motionEvent.getX() / this.f61708.f48624);
            int y = ((int) (motionEvent.getY() / this.f61708.f48625)) + this.f61733;
            int i = -this.f61714.m15433().m13572();
            C5575 c5575 = this.f61714;
            int i2 = c5575.f19153 - 1;
            if (y < i || y > i2) {
                return;
            }
            this.f61710 = x;
            this.f61729 = x;
            this.f61711 = y;
            this.f61730 = y;
            C4869 c4869M15433 = c5575.m15433();
            int i3 = this.f61729;
            int i4 = this.f61730;
            if (!" ".equals(c4869M15433.m13564(i3, i4, i3, i4))) {
                while (true) {
                    int i5 = this.f61729;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = this.f61730;
                    if (c4869M15433.m13564(i5 - 1, i6, i5 - 1, i6).isEmpty()) {
                        break;
                    } else {
                        this.f61729--;
                    }
                }
                while (true) {
                    int i7 = this.f61710;
                    if (i7 >= this.f61714.f19142 - 1) {
                        break;
                    }
                    int i8 = this.f61730;
                    if (c4869M15433.m13564(i7 + 1, i8, i7 + 1, i8).isEmpty()) {
                        break;
                    } else {
                        this.f61710++;
                    }
                }
            }
            invalidate();
            return;
        }
        this.f61711 = -1;
        this.f61710 = -1;
        this.f61730 = -1;
        this.f61729 = -1;
        invalidate();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43907() {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null) ? null : primaryClip.getItemAt(0).getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (this.f61705) {
            m43902((MotionEvent) null);
        }
        C7818 c7818 = this.f61720;
        if (c7818 != null) {
            c7818.m20620();
        }
        this.f61714.m15432(text.toString());
        m43884();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43905() {
        ClipData primaryClip;
        C4995 c4995 = this.f61713;
        if (c4995 == null || !c4995.m13847()) {
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
