package l;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: renamed from: l.ۖ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC2545 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f8130;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f8131;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f8133;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f8134;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f8135;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f8138;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f8139;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f8140;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f8142;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f8143;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f8144;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f8145;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8146;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f8147;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f8148;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f8149;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f8150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f8151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8152;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f8153;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8154;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8155;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f8156;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f8157;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f8158;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8132 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ResultReceiverC19588 f8141 = new ResultReceiverC19588();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f8136 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f8137 = -1;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ViewOnTouchListenerC2545(C24132 c24132, Context context) {
        this.f8157 = c24132;
        this.f8149 = c24132.f78022.m33613();
        this.f8140 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m8468();
        C24132 c24132 = this.f8157;
        int iM53968 = c24132.m53968();
        if (iM53968 == c24132.m53882()) {
            c24132.m54089(iM53968, true);
            c24132.m53931(true);
            c24132.m53956(-1);
        }
        c24132.f78073 = SystemClock.uptimeMillis();
        c24132.m53880();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C24132 c24132 = this.f8157;
        this.f8152 = c24132.isFocused();
        if (c24132.f78119.isFinished()) {
            return false;
        }
        c24132.f78119.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f);
        C24132 c24132 = this.f8157;
        if (fAbs > fAbs2) {
            f = 0.0f;
        } else {
            if (!c24132.f78022.mo25225()) {
                return false;
            }
            f2 = 0.0f;
        }
        int iM53868 = c24132.m53868();
        int iM53965 = c24132.m53965();
        c24132.f78060 = true;
        c24132.f78119.fling(c24132.getScrollX(), c24132.m54026(), (int) (-f), (int) (-f2), 0, iM53868, 0, iM53965);
        if (f2 != 0.0f) {
            c24132.m53955();
            return true;
        }
        if (f != 0.0f) {
            c24132.m54022();
            return true;
        }
        c24132.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C24132 c24132 = this.f8157;
        C14540 c14540 = c24132.f78066;
        if (c24132.m53872()) {
            return;
        }
        m8468();
        c24132.performHapticFeedback(0);
        if (!c24132.isFocused()) {
            c24132.requestFocus();
        }
        float x = (motionEvent.getX() + c24132.getScrollX()) - c24132.getPaddingLeft();
        float y = (motionEvent.getY() + c24132.m54026()) - c24132.getPaddingTop();
        int iM53968 = c24132.m53968();
        int iM53882 = c24132.m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        if (c14540.f45769 && c24132.m53854(x)) {
            int iM33615 = c24132.f78022.m33615(y);
            C6909 c6909 = c24132.f78022.f43643;
            int i = c6909.get(c6909.m19185(iM33615)).f45295;
            C6909 c69010 = c24132.f78022.f43643;
            int i2 = c69010.get(c69010.m19179(iM33615)).f45294;
            BaseInputConnection.removeComposingSpans(c24132.f78058);
            if (iM53968 == iM53882) {
                c24132.f78058.setSelection(i, i2);
                c24132.f78092 = i;
                c24132.f78111 = i2;
            } else {
                if (c24132.f78092 == -1) {
                    c24132.f78092 = iM53968;
                    c24132.f78111 = iM53882;
                }
                if (i < c24132.f78092) {
                    iM53968 = i;
                }
                if (i2 >= c24132.f78111) {
                    iM53882 = i2;
                }
                c24132.f78058.setSelection(iM53968, iM53882);
            }
            c24132.m53969();
            c24132.invalidate();
            return;
        }
        int iM33616 = c24132.f78022.m33616(x, y);
        if (!c24132.mo40459()) {
            if (iM53968 == iM53882 || iM53968 > iM33616 || iM33616 > iM53882) {
                c24132.m54089(iM33616, false);
                c24132.m53931(true);
            }
            c24132.m53956(-1);
            c24132.f78073 = SystemClock.uptimeMillis();
            c24132.m53880();
        } else if (iM53968 != iM53882 && iM53968 <= iM33616 && iM33616 <= iM53882) {
            c24132.m53956(-1);
            c24132.f78073 = SystemClock.uptimeMillis();
            c24132.m53880();
        } else {
            int[] iArrM53986 = c24132.m53986(iM33616, false);
            c24132.f78070 = true;
            c24132.f78003 = iM33616;
            c24132.m54003(c24132.m53968(), iArrM53986[0]);
            c24132.mo52316(iArrM53986[0], iArrM53986[1]);
            c24132.f78091 = iArrM53986[0];
            c24132.f78073 = 0L;
            c24132.f78127 = Math.min(c14540.m16189() + (c24132.m53995() / 2.0f) + c24132.getPaddingTop(), motionEvent.getY());
            c24132.f78053 = Math.max((c24132.getHeight() - c24132.getPaddingBottom()) - c24132.m53995(), motionEvent.getY());
            c24132.f78015 = 0;
            c24132.invalidate();
            c24132.m53931(true);
            c24132.m53826((int) motionEvent.getX(), (int) motionEvent.getY(), c14540.f45790);
        }
        c24132.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8473(boolean z) {
        if (this.f8132 != z) {
            this.f8157.getParent().requestDisallowInterceptTouchEvent(z);
            this.f8132 = z;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C24132 c24132 = this.f8157;
        C14540 c14540 = c24132.f78066;
        if (!c24132.isFocused()) {
            c24132.requestFocus();
        }
        if (c24132.f78022.mo25225() && Math.abs(f) > Math.abs(f2)) {
            int scrollX = c24132.getScrollX() + ((int) f);
            if (scrollX < 0) {
                if (motionEvent2 != null && c14540.f45802) {
                    C19577.m45178(c24132.f78065, (-f) / c24132.getWidth(), 1.0f - (motionEvent2.getY() / c24132.getHeight()));
                    c24132.postInvalidateOnAnimation();
                    if (!c24132.f78045.isFinished()) {
                        c24132.f78045.onRelease();
                    }
                }
                scrollX = 0;
            } else {
                int iM53868 = c24132.m53868();
                if (scrollX > iM53868) {
                    if (motionEvent2 != null && c14540.f45802) {
                        C19577.m45178(c24132.f78045, f / c24132.getWidth(), motionEvent2.getY() / c24132.getHeight());
                        c24132.postInvalidateOnAnimation();
                        if (!c24132.f78065.isFinished()) {
                            c24132.f78065.onRelease();
                        }
                    }
                    scrollX = iM53868;
                }
            }
            c24132.scrollTo(scrollX, c24132.m54026());
            c24132.m54022();
        } else {
            int iM54026 = c24132.m54026() + ((int) f2);
            if (iM54026 < 0) {
                if (this.f8138) {
                    m8473(false);
                }
                if (motionEvent2 != null && c14540.f45802) {
                    C19577.m45178(c24132.f77989, (-f2) / c24132.getHeight(), motionEvent2.getX() / c24132.getWidth());
                    c24132.postInvalidateOnAnimation();
                    if (!c24132.f78027.isFinished()) {
                        c24132.f78027.onRelease();
                    }
                }
                iM54026 = 0;
            } else {
                int iM53965 = c24132.m53965();
                if (iM54026 > iM53965) {
                    if (this.f8138) {
                        m8473(false);
                    }
                    if (motionEvent2 != null && c14540.f45802) {
                        C19577.m45178(c24132.f78027, f2 / c24132.getHeight(), 1.0f - (motionEvent2.getX() / c24132.getWidth()));
                        c24132.postInvalidateOnAnimation();
                        if (!c24132.f77989.isFinished()) {
                            c24132.f77989.onRelease();
                        }
                    }
                    iM54026 = iM53965;
                }
            }
            c24132.scrollTo(c24132.getScrollX(), iM54026);
            c24132.m53955();
        }
        if (!this.f8138) {
            return true;
        }
        this.f8138 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        C24132 c24132 = this.f8157;
        int scrollX = c24132.getScrollX();
        C14540 c14540 = c24132.f78066;
        int iM33616 = c24132.f78022.m33616((x + scrollX) - c24132.getPaddingLeft(), (motionEvent.getY() + c24132.m54026()) - c24132.getPaddingTop());
        int iM53968 = c24132.m53968();
        int iM53882 = c24132.m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        boolean zMo25237 = c24132.f78022.mo25237();
        ResultReceiverC19588 resultReceiverC19588 = this.f8141;
        if (zMo25237 || c14540.f45805 || !c24132.isFocused()) {
            z = false;
        } else {
            resultReceiverC19588.m45189();
            c24132.f78047.showSoftInput(c24132, 0, resultReceiverC19588);
            z = true;
        }
        if (c24132.f78022.f43634) {
            if (z && iM53968 != iM53882 && iM53968 <= iM33616 && iM33616 <= iM53882 && resultReceiverC19588.m45188() == 2) {
                c24132.postDelayed(new RunnableC10002(0, c24132), 100L);
            } else if (iM53968 == iM53882 && iM53968 == iM33616) {
                if (!c24132.f78022.mo25237() && !c14540.f45805) {
                    if (this.f8152 && SystemClock.uptimeMillis() - this.f8131 > 4500) {
                        if (this.f8149 == c24132.f78022.m33613()) {
                            c24132.m53956(-1);
                            this.f8131 = SystemClock.uptimeMillis();
                        }
                    } else {
                        this.f8131 = 0L;
                    }
                }
            } else {
                c24132.m54003(c24132.m53968(), iM33616);
                c24132.f78058.setSelection(iM33616);
                c24132.m53845();
                this.f8131 = 0L;
            }
            if (!c24132.f78022.mo25237() && !c14540.f45805) {
                c24132.m53931(false);
            }
        } else if (iM53968 == iM53882 && iM33616 == iM53968) {
            if (this.f8152 && SystemClock.uptimeMillis() - this.f8131 > 4500) {
                if (this.f8149 == c24132.f78022.m33613()) {
                    c24132.m53956(-1);
                    this.f8131 = SystemClock.uptimeMillis();
                }
            } else {
                this.f8131 = 0L;
            }
        } else if (iM53968 > iM33616 || iM33616 > iM53882 || !c14540.f45750) {
            c24132.m54003(c24132.m53968(), iM33616);
            c24132.f78058.setSelection(iM33616);
            c24132.m53845();
            this.f8131 = 0L;
            if (!c24132.f78022.mo25237() && !c14540.f45805) {
                c24132.m53935(iM33616, false);
            }
        } else if (!z || resultReceiverC19588.m45188() != 2) {
            c24132.m53956(-1);
        } else {
            c24132.postDelayed(new RunnableC10002(0, c24132), 100L);
        }
        this.f8149 = c24132.f78022.m33613();
        c24132.f78073 = SystemClock.uptimeMillis();
        c24132.m53880();
        c24132.invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8468() {
        boolean z = this.f8145;
        this.f8142 = false;
        this.f8155 = false;
        this.f8135 = false;
        this.f8145 = false;
        this.f8137 = -1;
        this.f8133 = 0.0f;
        this.f8139 = 0.0f;
        this.f8157.f78015 = 0;
        if (z) {
            m8473(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8470(MotionEvent motionEvent) {
        m8475(motionEvent);
        float y = motionEvent.getY();
        C24132 c24132 = this.f8157;
        boolean z = c24132.f78015 == 0;
        float f = c24132.f78127;
        if (y < f) {
            c24132.f78015 = -C24132.m53860((int) (f - y));
            if (z) {
                c24132.f78133 = SystemClock.uptimeMillis();
            }
            c24132.postInvalidateOnAnimation();
        } else {
            float f2 = c24132.f78053;
            if (y > f2) {
                c24132.f78015 = C24132.m53860((int) (y - f2));
                if (z) {
                    c24132.f78133 = SystemClock.uptimeMillis();
                }
                c24132.postInvalidateOnAnimation();
            } else {
                c24132.f78015 = 0;
            }
        }
        float x = motionEvent.getX() - c24132.getPaddingLeft();
        float y2 = motionEvent.getY() - c24132.getPaddingTop();
        c24132.f78125 = x;
        c24132.f77999 = y2;
        m8469(x, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m8469(float f, float f2) {
        C24132 c24132 = this.f8157;
        int iM33616 = c24132.f78022.m33616(c24132.getScrollX() + f, c24132.m54026() + f2);
        if (c24132.m53968() == this.f8137 && c24132.m53882() == iM33616) {
            return;
        }
        c24132.f78058.setSelection(this.f8137, iM33616);
        c24132.m53687(iM33616);
        c24132.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8471(ViewOnTouchListenerC2545 viewOnTouchListenerC2545) {
        C24132 c24132 = viewOnTouchListenerC2545.f8157;
        c24132.setPressed(false);
        c24132.m53969();
        viewOnTouchListenerC2545.m8468();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m8475(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C24132 c24132 = this.f8157;
        boolean z = x >= 0.0f && x <= ((float) c24132.getWidth()) && y >= 0.0f && y <= ((float) c24132.getHeight());
        if (z != c24132.isPressed()) {
            c24132.setPressed(z);
            c24132.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:106:0x0189  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:121:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x020a  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0228  */
    /* JADX WARN: Code duplicated, block: B:131:0x0233  */
    /* JADX WARN: Code duplicated, block: B:133:0x0246  */
    /* JADX WARN: Code duplicated, block: B:135:0x024a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0276  */
    /* JADX WARN: Code duplicated, block: B:144:0x027f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295  */
    /* JADX WARN: Code duplicated, block: B:148:0x029e  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02df  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0313  */
    /* JADX WARN: Code duplicated, block: B:169:0x0317  */
    /* JADX WARN: Code duplicated, block: B:171:0x0320  */
    /* JADX WARN: Code duplicated, block: B:173:0x0331  */
    /* JADX WARN: Code duplicated, block: B:175:0x0337  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:218:0x040b  */
    /* JADX WARN: Code duplicated, block: B:220:0x041f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0431  */
    /* JADX WARN: Code duplicated, block: B:226:0x0433  */
    /* JADX WARN: Code duplicated, block: B:229:0x043a  */
    /* JADX WARN: Code duplicated, block: B:231:0x0445  */
    /* JADX WARN: Code duplicated, block: B:233:0x044f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0455  */
    /* JADX WARN: Code duplicated, block: B:237:0x045f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0469  */
    /* JADX WARN: Code duplicated, block: B:242:0x047e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0482  */
    /* JADX WARN: Code duplicated, block: B:245:0x0484  */
    /* JADX WARN: Code duplicated, block: B:247:0x0488  */
    /* JADX WARN: Code duplicated, block: B:250:0x048d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0495  */
    /* JADX WARN: Code duplicated, block: B:255:0x0499  */
    /* JADX WARN: Code duplicated, block: B:256:0x049b  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:265:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:267:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:269:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:271:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:273:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:298:0x0545  */
    /* JADX WARN: Code duplicated, block: B:299:0x054a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0550  */
    /* JADX WARN: Code duplicated, block: B:303:0x0556  */
    /* JADX WARN: Code duplicated, block: B:305:0x0560  */
    /* JADX WARN: Code duplicated, block: B:309:0x056c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0580  */
    /* JADX WARN: Code duplicated, block: B:315:0x058c  */
    /* JADX WARN: Code duplicated, block: B:318:0x0597  */
    /* JADX WARN: Code duplicated, block: B:321:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:324:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:326:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:328:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:333:0x0612  */
    /* JADX WARN: Code duplicated, block: B:335:0x061d  */
    /* JADX WARN: Code duplicated, block: B:337:0x0632  */
    /* JADX WARN: Code duplicated, block: B:341:0x0642  */
    /* JADX WARN: Code duplicated, block: B:343:0x064f  */
    /* JADX WARN: Code duplicated, block: B:345:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:347:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:349:0x0711  */
    /* JADX WARN: Code duplicated, block: B:351:0x071e  */
    /* JADX WARN: Code duplicated, block: B:355:0x077d  */
    /* JADX WARN: Code duplicated, block: B:363:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:364:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:367:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Code duplicated, block: B:91:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C18207 c18207M54110;
        int action;
        int iM53968;
        int iM53882;
        float fM33643;
        AbstractC13753 abstractC13753;
        AbstractC13753 abstractC13754;
        RectF rectF;
        RectF rectF2;
        float x;
        boolean z;
        RectF rectF3;
        C23073 c23073;
        C23073 c23074;
        int iM53969;
        int iM53883;
        final C24132 c24132;
        final InterfaceC2192 interfaceC2192;
        float x2;
        float y;
        float y2;
        boolean z2;
        float f;
        float f2;
        float fM16189;
        float paddingTop;
        float f3;
        int i;
        C24132 c24133;
        final C24132 c24134;
        final InterfaceC2192 interfaceC2193;
        C24132 c24135;
        int actionMasked;
        float x3;
        C18207 c18207;
        ViewTreeObserverOnPreDrawListenerC22000[] viewTreeObserverOnPreDrawListenerC22000Arr;
        int actionMasked2;
        C24132 c24136 = this.f8157;
        C14540 c14540 = c24136.f78066;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 0) {
            c24136.m53864();
            c24136.f78051 = null;
        }
        if (c24136.f78051 == null && c24136.m53872()) {
            c24136.f78051 = c24136.f77990;
        }
        if (c24136.f78051 == null) {
            int actionMasked4 = motionEvent.getActionMasked();
            if (actionMasked4 == 0) {
                c24136.m53742();
                if (!C24132.m53841(motionEvent) || (motionEvent.getButtonState() & 1) == 0) {
                    C24132.m53784(c24136);
                } else {
                    float x4 = (motionEvent.getX() + c24136.getScrollX()) - c24136.getPaddingLeft();
                    float fM33644 = c24136.f78022.m33643(motionEvent.getY());
                    AbstractC13753 abstractC13755 = c24136.f78022;
                    if (!abstractC13755.f43635 || !abstractC13755.f43658.m51987(x4, fM33644)) {
                        AbstractC13753 abstractC13756 = c24136.f78022;
                        if (!abstractC13756.f43672 || !abstractC13756.f43661.m51987(x4, fM33644)) {
                            C24132.m53784(c24136);
                        }
                    }
                }
            } else if (actionMasked4 == 3) {
                c24136.m53773();
            }
            if (!c24136.isFocused() && motionEvent.getActionMasked() == 1 && c24136.isPressed()) {
                c24136.requestFocus();
            }
            int i2 = 0;
            if (C24132.m53841(motionEvent)) {
                int actionMasked5 = motionEvent.getActionMasked();
                if (c24136.f78016) {
                    c24136.f78128 = true;
                    if (actionMasked5 == 0) {
                        c24136.setPressed(true);
                        return true;
                    }
                    if (actionMasked5 == 1 || actionMasked5 == 3) {
                        c24136.setPressed(false);
                        m8473(false);
                        c24136.m53969();
                        C24132.m53803(c24136);
                        return true;
                    }
                } else {
                    if (actionMasked5 == 0 && (motionEvent.getButtonState() & 2) != 0) {
                        C24132.m53857(c24136);
                        c24136.f78128 = true;
                        c24136.setPressed(true);
                        c24136.m53760(motionEvent);
                        return true;
                    }
                    if (this.f8155) {
                        actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 1) {
                            c24136.setPressed(false);
                            c24136.m53969();
                            m8468();
                            return true;
                        }
                        if (actionMasked2 != 2) {
                            m8470(motionEvent);
                            return true;
                        }
                        if (actionMasked2 == 3) {
                            c24136.setPressed(false);
                            c24136.m53969();
                            m8468();
                            return true;
                        }
                    }
                    c18207M54110 = c24136.m54110();
                    if (c18207M54110 != null) {
                        if (this.f8142) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m8468();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f8133;
                                    float y3 = motionEvent.getY() - this.f8139;
                                    if (Math.abs(x3) <= this.f8140) {
                                    }
                                    this.f8142 = false;
                                    this.f8155 = true;
                                    if (!c24136.isFocused()) {
                                        c24136.requestFocus();
                                    }
                                    if (!this.f8135) {
                                        c24136.m54003(c24136.m53968(), this.f8137);
                                        c24136.m53845();
                                        this.f8135 = true;
                                    }
                                    c24136.f78127 = Math.min(c14540.m16189() + c24136.getPaddingTop(), this.f8139);
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c14540.m16189(), this.f8139);
                                    c24136.f78015 = 0;
                                    c24136.f78073 = 0L;
                                    c18207 = c24136.f78120;
                                    if (c18207 != null) {
                                        c18207.m42355();
                                    }
                                    c24136.invalidate();
                                    m8473(true);
                                    this.f8145 = true;
                                    c24136.f78020.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m8470(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m8468();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c24136.setPressed(true);
                            c24136.m53970();
                            if (!c24136.isFocused()) {
                                c24136.invalidate();
                            }
                            this.f8138 = true;
                            if (c24136.mo52313()) {
                                m8473(true);
                            }
                            this.f8134 = false;
                            this.f8144 = 0;
                            this.f8146 = (c24136.getScrollX() + ((int) motionEvent.getX())) - c24136.getPaddingLeft();
                            this.f8154 = (c24136.m54026() + ((int) motionEvent.getY())) - c24136.getPaddingTop();
                            this.f8150 = false;
                            iM53968 = c24136.m53968();
                            iM53882 = c24136.m53882();
                            if (iM53968 > iM53882) {
                                iM53882 = iM53968;
                                iM53968 = iM53882;
                            }
                            fM33643 = c24136.f78022.m33643(motionEvent.getY());
                            abstractC13753 = c24136.f78022;
                            if (abstractC13753.f43635) {
                                c23074 = abstractC13753.f43658;
                                if (c23074.m51987(this.f8146, fM33643)) {
                                    c24136.f78056 = true;
                                    this.f8153 = c23074.f74853 - fM33643;
                                    if (!c24136.f78119.isFinished()) {
                                        c24136.f78119.abortAnimation();
                                    }
                                    m8473(true);
                                    c24136.invalidate();
                                    return true;
                                }
                            }
                            abstractC13754 = c24136.f78022;
                            if (abstractC13754.f43672) {
                                c23073 = abstractC13754.f43661;
                                if (c23073.m51987(this.f8146, fM33643)) {
                                    c24136.f78107 = true;
                                    this.f8156 = c23073.f74854 - this.f8146;
                                    if (!c24136.f78119.isFinished()) {
                                        c24136.f78119.abortAnimation();
                                    }
                                    m8473(true);
                                    c24136.invalidate();
                                    return true;
                                }
                            }
                            if (iM53968 == iM53882) {
                                rectF3 = c24136.f78022.f43633;
                                if (rectF3.contains(this.f8146, fM33643)) {
                                    c24136.f78130 = true;
                                    this.f8156 = ((rectF3.left + rectF3.right) / 2.0f) - this.f8146;
                                    this.f8153 = (rectF3.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            } else {
                                rectF = c24136.f78022.f43650;
                                if (rectF.contains(this.f8146, fM33643)) {
                                    rectF2 = c24136.f78022.f43675;
                                    if (rectF2.contains(this.f8146, fM33643)) {
                                        c24136.f78069 = true;
                                        c24136.f78091 = iM53968;
                                        float f4 = rectF2.left;
                                        this.f8156 = (((rectF2.right - f4) / 4.0f) + f4) - this.f8146;
                                        this.f8153 = (rectF2.top - fM33643) - (c14540.m16189() / 2.0f);
                                        c24136.f78110 = false;
                                        c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                        c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                        c24136.f78015 = 0;
                                        m8473(true);
                                        return true;
                                    }
                                } else {
                                    c24136.f78069 = true;
                                    c24136.f78091 = iM53882;
                                    float f5 = rectF.left;
                                    this.f8156 = ((((rectF.right - f5) * 3.0f) / 4.0f) + f5) - this.f8146;
                                    this.f8153 = (rectF.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78110 = true;
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            }
                            if (c14540.f45803) {
                                x = motionEvent.getX();
                                if (c24136.m53813(x, motionEvent.getY())) {
                                    z = !c24136.m53854((x + c24136.getScrollX()) - c24136.getPaddingLeft());
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    this.f8142 = true;
                                    this.f8155 = false;
                                    this.f8135 = false;
                                    this.f8137 = c24136.f78022.m33616(this.f8146, this.f8154);
                                    this.f8133 = motionEvent.getX();
                                    this.f8139 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c24136.setPressed(false);
                            m8473(false);
                            c24136.m53969();
                            if (this.f8134) {
                                m8476();
                                c24132 = c24136.f78012;
                                if (c24132 != null) {
                                    c24132.f78063.m8476();
                                    ((View) c24136.getParent()).invalidate();
                                    interfaceC2192 = c24136.f78041;
                                    if (interfaceC2192 != null) {
                                        C24132.m53710(c24136, new Runnable() { // from class: l.ᩳ۠᩸
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f61459;
                                                final InterfaceC2192 interfaceC2194 = interfaceC2192;
                                                C24132.m53710(c24132, new Runnable() { // from class: l.֨۠᩸
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                        int scrollX = c24137.getScrollX();
                                                        int iM54026 = c24137.m54026();
                                                        interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c24136.f78130) {
                                }
                                c24136.m53785();
                                if (c24136.f78130) {
                                    c24136.m53956(-1);
                                } else if (!c24136.f78069) {
                                    iM53969 = c24136.m53968();
                                    iM53883 = c24136.m53882();
                                    if (iM53969 > iM53883) {
                                        iM53883 = iM53969;
                                        iM53969 = iM53883;
                                    }
                                    if (!c24136.f78110) {
                                        iM53969 = iM53883;
                                    }
                                    c24136.m53956(iM53969);
                                } else {
                                    iM53969 = c24136.m53968();
                                    iM53883 = c24136.m53882();
                                    if (iM53969 > iM53883) {
                                        iM53883 = iM53969;
                                        iM53969 = iM53883;
                                    }
                                    if (!c24136.f78110) {
                                        iM53969 = iM53883;
                                    }
                                    c24136.m53956(iM53969);
                                }
                                c24136.f78070 = false;
                                c24136.f78130 = false;
                                c24136.f78069 = false;
                                c24136.f78073 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m8475(motionEvent);
                                if (this.f8144 != 1) {
                                    if (c24136.f78069) {
                                        c24136.f78063.onScroll(null, null, (this.f8151 - motionEvent.getX(1)) - c24136.getPaddingLeft(), (this.f8130 - motionEvent.getY(1)) - c24136.getPaddingTop());
                                        this.f8151 = motionEvent.getX(1);
                                        this.f8130 = motionEvent.getY(1);
                                    } else if (this.f8134) {
                                        m8477(motionEvent);
                                        c24133 = c24136.f78012;
                                        if (c24133 != null) {
                                            c24133.f78063.m8477(motionEvent);
                                            ((View) c24136.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c24136.f78130) {
                                        x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                        y = motionEvent.getY() - c24136.getPaddingTop();
                                        if (!this.f8150) {
                                            i = (int) (x2 - this.f8146);
                                            int i3 = (int) (y - this.f8154);
                                            if (Math.abs(i) <= this.f8140) {
                                            }
                                            this.f8150 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c24136.f78015 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c24136.f78127;
                                        if (y2 < f) {
                                            c24136.f78015 = -C24132.m53860((int) (f - y2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c24136.f78053;
                                            if (y2 > f2) {
                                                c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                                if (z2) {
                                                    c24136.f78133 = SystemClock.uptimeMillis();
                                                }
                                                c24136.postInvalidateOnAnimation();
                                            } else {
                                                c24136.f78015 = 0;
                                            }
                                        }
                                        fM16189 = c14540.m16189() / 2.0f;
                                        paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                        if (c24136.f78070) {
                                            if (y < fM16189) {
                                                y = fM16189;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c24136.m54072(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f8153;
                                        if (f3 >= fM16189) {
                                            if (f3 > paddingTop) {
                                                fM16189 = paddingTop;
                                            } else {
                                                fM16189 = f3;
                                            }
                                        }
                                        if (c24136.f78130) {
                                            c24136.m54087(x2 + this.f8156, fM16189);
                                            return true;
                                        }
                                        c24136.m53982(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                    y = motionEvent.getY() - c24136.getPaddingTop();
                                    if (!this.f8150) {
                                        i = (int) (x2 - this.f8146);
                                        int i4 = (int) (y - this.f8154);
                                        if (Math.abs(i) <= this.f8140) {
                                        }
                                        this.f8150 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c24136.f78015 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c24136.f78127;
                                    if (y2 < f) {
                                        c24136.f78015 = -C24132.m53860((int) (f - y2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c24136.f78053;
                                        if (y2 > f2) {
                                            c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            c24136.f78015 = 0;
                                        }
                                    }
                                    fM16189 = c14540.m16189() / 2.0f;
                                    paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                    if (c24136.f78070) {
                                        if (y < fM16189) {
                                            y = fM16189;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c24136.m54072(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f8153;
                                    if (f3 >= fM16189) {
                                        if (f3 > paddingTop) {
                                            fM16189 = paddingTop;
                                        } else {
                                            fM16189 = f3;
                                        }
                                    }
                                    if (c24136.f78130) {
                                        c24136.m54087(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    c24136.m53982(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                if (!c24136.f78130) {
                                    x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                    y = motionEvent.getY() - c24136.getPaddingTop();
                                    if (!this.f8150) {
                                        i = (int) (x2 - this.f8146);
                                        int i5 = (int) (y - this.f8154);
                                        if (Math.abs(i) <= this.f8140) {
                                        }
                                        this.f8150 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c24136.f78015 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c24136.f78127;
                                    if (y2 < f) {
                                        c24136.f78015 = -C24132.m53860((int) (f - y2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c24136.f78053;
                                        if (y2 > f2) {
                                            c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            c24136.f78015 = 0;
                                        }
                                    }
                                    fM16189 = c14540.m16189() / 2.0f;
                                    paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                    if (c24136.f78070) {
                                        if (y < fM16189) {
                                            y = fM16189;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c24136.m54072(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f8153;
                                    if (f3 >= fM16189) {
                                        if (f3 > paddingTop) {
                                            fM16189 = paddingTop;
                                        } else {
                                            fM16189 = f3;
                                        }
                                    }
                                    if (c24136.f78130) {
                                        c24136.m54087(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    c24136.m53982(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                y = motionEvent.getY() - c24136.getPaddingTop();
                                if (!this.f8150) {
                                    i = (int) (x2 - this.f8146);
                                    int i6 = (int) (y - this.f8154);
                                    if (Math.abs(i) <= this.f8140) {
                                    }
                                    this.f8150 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c24136.f78015 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c24136.f78127;
                                if (y2 < f) {
                                    c24136.f78015 = -C24132.m53860((int) (f - y2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    f2 = c24136.f78053;
                                    if (y2 > f2) {
                                        c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        c24136.f78015 = 0;
                                    }
                                }
                                fM16189 = c14540.m16189() / 2.0f;
                                paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                if (c24136.f78070) {
                                    if (y < fM16189) {
                                        y = fM16189;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c24136.m54072(x2, y);
                                    return true;
                                }
                                f3 = y + this.f8153;
                                if (f3 >= fM16189) {
                                    if (f3 > paddingTop) {
                                        fM16189 = paddingTop;
                                    } else {
                                        fM16189 = f3;
                                    }
                                }
                                if (c24136.f78130) {
                                    c24136.m54087(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                c24136.m53982(x2 + this.f8156, fM16189);
                                return true;
                            }
                            if (action != 3) {
                                c24136.setPressed(false);
                                m8473(false);
                                c24136.m53969();
                                if (this.f8134) {
                                    m8476();
                                    c24134 = c24136.f78012;
                                    if (c24134 != null) {
                                        c24134.f78063.m8476();
                                        ((View) c24136.getParent()).invalidate();
                                        interfaceC2193 = c24136.f78041;
                                        if (interfaceC2193 != null) {
                                            C24132.m53710(c24136, new Runnable() { // from class: l.۟۠᩸
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f25550;
                                                    final InterfaceC2192 interfaceC2194 = interfaceC2193;
                                                    C24132.m53710(c24134, new Runnable() { // from class: l.ۡ۠᩸
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                            int scrollX = c24137.getScrollX();
                                                            int iM54026 = c24137.m54026();
                                                            interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c24136.f78056) {
                                    }
                                    C24132.m53756(c24136);
                                    c24136.f78070 = false;
                                    c24136.f78130 = false;
                                    c24136.f78069 = false;
                                    c24136.f78107 = false;
                                    c24136.f78056 = false;
                                    c24136.m53785();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f8144++;
                                if (c24136.f78069) {
                                    this.f8136 = motionEvent.getPointerId(1);
                                    this.f8151 = motionEvent.getX(1);
                                    this.f8130 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c14540.f45761) {
                                    m8478(motionEvent);
                                    c24135 = c24136.f78012;
                                    if (c24135 != null) {
                                        c24135.f78063.m8478(motionEvent);
                                        ((View) c24136.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c24136.f78069) {
                                    c24136.f78069 = false;
                                }
                                this.f8144--;
                            }
                        }
                        return c24136.f78020.m54155(motionEvent);
                    }
                    viewTreeObserverOnPreDrawListenerC22000Arr = c18207M54110.f59453;
                    if (!viewTreeObserverOnPreDrawListenerC22000Arr[0].m49733()) {
                        if (this.f8142) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m8468();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f8133;
                                    float y4 = motionEvent.getY() - this.f8139;
                                    if (Math.abs(x3) <= this.f8140) {
                                    }
                                    this.f8142 = false;
                                    this.f8155 = true;
                                    if (!c24136.isFocused()) {
                                        c24136.requestFocus();
                                    }
                                    if (!this.f8135) {
                                        c24136.m54003(c24136.m53968(), this.f8137);
                                        c24136.m53845();
                                        this.f8135 = true;
                                    }
                                    c24136.f78127 = Math.min(c14540.m16189() + c24136.getPaddingTop(), this.f8139);
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c14540.m16189(), this.f8139);
                                    c24136.f78015 = 0;
                                    c24136.f78073 = 0L;
                                    c18207 = c24136.f78120;
                                    if (c18207 != null) {
                                        c18207.m42355();
                                    }
                                    c24136.invalidate();
                                    m8473(true);
                                    this.f8145 = true;
                                    c24136.f78020.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m8470(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m8468();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c24136.setPressed(true);
                            c24136.m53970();
                            if (!c24136.isFocused()) {
                                c24136.invalidate();
                            }
                            this.f8138 = true;
                            if (c24136.mo52313()) {
                                m8473(true);
                            }
                            this.f8134 = false;
                            this.f8144 = 0;
                            this.f8146 = (c24136.getScrollX() + ((int) motionEvent.getX())) - c24136.getPaddingLeft();
                            this.f8154 = (c24136.m54026() + ((int) motionEvent.getY())) - c24136.getPaddingTop();
                            this.f8150 = false;
                            iM53968 = c24136.m53968();
                            iM53882 = c24136.m53882();
                            if (iM53968 > iM53882) {
                                iM53882 = iM53968;
                                iM53968 = iM53882;
                            }
                            fM33643 = c24136.f78022.m33643(motionEvent.getY());
                            abstractC13753 = c24136.f78022;
                            if (abstractC13753.f43635) {
                                c23074 = abstractC13753.f43658;
                                if (c23074.m51987(this.f8146, fM33643)) {
                                    c24136.f78056 = true;
                                    this.f8153 = c23074.f74853 - fM33643;
                                    if (!c24136.f78119.isFinished()) {
                                        c24136.f78119.abortAnimation();
                                    }
                                    m8473(true);
                                    c24136.invalidate();
                                    return true;
                                }
                            }
                            abstractC13754 = c24136.f78022;
                            if (abstractC13754.f43672) {
                                c23073 = abstractC13754.f43661;
                                if (c23073.m51987(this.f8146, fM33643)) {
                                    c24136.f78107 = true;
                                    this.f8156 = c23073.f74854 - this.f8146;
                                    if (!c24136.f78119.isFinished()) {
                                        c24136.f78119.abortAnimation();
                                    }
                                    m8473(true);
                                    c24136.invalidate();
                                    return true;
                                }
                            }
                            if (iM53968 == iM53882) {
                                rectF3 = c24136.f78022.f43633;
                                if (rectF3.contains(this.f8146, fM33643)) {
                                    c24136.f78130 = true;
                                    this.f8156 = ((rectF3.left + rectF3.right) / 2.0f) - this.f8146;
                                    this.f8153 = (rectF3.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            } else {
                                rectF = c24136.f78022.f43650;
                                if (rectF.contains(this.f8146, fM33643)) {
                                    rectF2 = c24136.f78022.f43675;
                                    if (rectF2.contains(this.f8146, fM33643)) {
                                        c24136.f78069 = true;
                                        c24136.f78091 = iM53968;
                                        float f6 = rectF2.left;
                                        this.f8156 = (((rectF2.right - f6) / 4.0f) + f6) - this.f8146;
                                        this.f8153 = (rectF2.top - fM33643) - (c14540.m16189() / 2.0f);
                                        c24136.f78110 = false;
                                        c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                        c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                        c24136.f78015 = 0;
                                        m8473(true);
                                        return true;
                                    }
                                } else {
                                    c24136.f78069 = true;
                                    c24136.f78091 = iM53882;
                                    float f7 = rectF.left;
                                    this.f8156 = ((((rectF.right - f7) * 3.0f) / 4.0f) + f7) - this.f8146;
                                    this.f8153 = (rectF.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78110 = true;
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            }
                            if (c14540.f45803) {
                                x = motionEvent.getX();
                                if (c24136.m53813(x, motionEvent.getY())) {
                                    z = false;
                                } else {
                                    z = !c24136.m53854((x + c24136.getScrollX()) - c24136.getPaddingLeft());
                                }
                                if (z) {
                                    this.f8142 = true;
                                    this.f8155 = false;
                                    this.f8135 = false;
                                    this.f8137 = c24136.f78022.m33616(this.f8146, this.f8154);
                                    this.f8133 = motionEvent.getX();
                                    this.f8139 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c24136.setPressed(false);
                            m8473(false);
                            c24136.m53969();
                            if (this.f8134) {
                                m8476();
                                c24132 = c24136.f78012;
                                if (c24132 != null) {
                                    c24132.f78063.m8476();
                                    ((View) c24136.getParent()).invalidate();
                                    interfaceC2192 = c24136.f78041;
                                    if (interfaceC2192 != null) {
                                        C24132.m53710(c24136, new Runnable() { // from class: l.ᩳ۠᩸
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f61459;
                                                final InterfaceC2192 interfaceC2194 = interfaceC2192;
                                                C24132.m53710(c24132, new Runnable() { // from class: l.֨۠᩸
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                        int scrollX = c24137.getScrollX();
                                                        int iM54026 = c24137.m54026();
                                                        interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c24136.f78130) {
                                }
                                c24136.m53785();
                                if (c24136.f78130) {
                                    c24136.m53956(-1);
                                } else if (!c24136.f78069) {
                                    iM53969 = c24136.m53968();
                                    iM53883 = c24136.m53882();
                                    if (iM53969 > iM53883) {
                                        iM53883 = iM53969;
                                        iM53969 = iM53883;
                                    }
                                    if (!c24136.f78110) {
                                        iM53969 = iM53883;
                                    }
                                    c24136.m53956(iM53969);
                                } else {
                                    iM53969 = c24136.m53968();
                                    iM53883 = c24136.m53882();
                                    if (iM53969 > iM53883) {
                                        iM53883 = iM53969;
                                        iM53969 = iM53883;
                                    }
                                    if (!c24136.f78110) {
                                        iM53969 = iM53883;
                                    }
                                    c24136.m53956(iM53969);
                                }
                                c24136.f78070 = false;
                                c24136.f78130 = false;
                                c24136.f78069 = false;
                                c24136.f78073 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m8475(motionEvent);
                                if (this.f8144 != 1) {
                                    if (c24136.f78069) {
                                        c24136.f78063.onScroll(null, null, (this.f8151 - motionEvent.getX(1)) - c24136.getPaddingLeft(), (this.f8130 - motionEvent.getY(1)) - c24136.getPaddingTop());
                                        this.f8151 = motionEvent.getX(1);
                                        this.f8130 = motionEvent.getY(1);
                                    } else if (this.f8134) {
                                        m8477(motionEvent);
                                        c24133 = c24136.f78012;
                                        if (c24133 != null) {
                                            c24133.f78063.m8477(motionEvent);
                                            ((View) c24136.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c24136.f78130) {
                                        x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                        y = motionEvent.getY() - c24136.getPaddingTop();
                                        if (!this.f8150) {
                                            i = (int) (x2 - this.f8146);
                                            int i7 = (int) (y - this.f8154);
                                            if (Math.abs(i) <= this.f8140) {
                                            }
                                            this.f8150 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c24136.f78015 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c24136.f78127;
                                        if (y2 < f) {
                                            c24136.f78015 = -C24132.m53860((int) (f - y2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c24136.f78053;
                                            if (y2 > f2) {
                                                c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                                if (z2) {
                                                    c24136.f78133 = SystemClock.uptimeMillis();
                                                }
                                                c24136.postInvalidateOnAnimation();
                                            } else {
                                                c24136.f78015 = 0;
                                            }
                                        }
                                        fM16189 = c14540.m16189() / 2.0f;
                                        paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                        if (c24136.f78070) {
                                            if (y < fM16189) {
                                                y = fM16189;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c24136.m54072(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f8153;
                                        if (f3 >= fM16189) {
                                            if (f3 > paddingTop) {
                                                fM16189 = paddingTop;
                                            } else {
                                                fM16189 = f3;
                                            }
                                        }
                                        if (c24136.f78130) {
                                            c24136.m54087(x2 + this.f8156, fM16189);
                                            return true;
                                        }
                                        c24136.m53982(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                    y = motionEvent.getY() - c24136.getPaddingTop();
                                    if (!this.f8150) {
                                        i = (int) (x2 - this.f8146);
                                        int i8 = (int) (y - this.f8154);
                                        if (Math.abs(i) <= this.f8140) {
                                        }
                                        this.f8150 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c24136.f78015 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c24136.f78127;
                                    if (y2 < f) {
                                        c24136.f78015 = -C24132.m53860((int) (f - y2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c24136.f78053;
                                        if (y2 > f2) {
                                            c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            c24136.f78015 = 0;
                                        }
                                    }
                                    fM16189 = c14540.m16189() / 2.0f;
                                    paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                    if (c24136.f78070) {
                                        if (y < fM16189) {
                                            y = fM16189;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c24136.m54072(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f8153;
                                    if (f3 >= fM16189) {
                                        if (f3 > paddingTop) {
                                            fM16189 = paddingTop;
                                        } else {
                                            fM16189 = f3;
                                        }
                                    }
                                    if (c24136.f78130) {
                                        c24136.m54087(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    c24136.m53982(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                if (!c24136.f78130) {
                                    x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                    y = motionEvent.getY() - c24136.getPaddingTop();
                                    if (!this.f8150) {
                                        i = (int) (x2 - this.f8146);
                                        int i9 = (int) (y - this.f8154);
                                        if (Math.abs(i) <= this.f8140) {
                                        }
                                        this.f8150 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c24136.f78015 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c24136.f78127;
                                    if (y2 < f) {
                                        c24136.f78015 = -C24132.m53860((int) (f - y2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c24136.f78053;
                                        if (y2 > f2) {
                                            c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            c24136.f78015 = 0;
                                        }
                                    }
                                    fM16189 = c14540.m16189() / 2.0f;
                                    paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                    if (c24136.f78070) {
                                        if (y < fM16189) {
                                            y = fM16189;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c24136.m54072(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f8153;
                                    if (f3 >= fM16189) {
                                        if (f3 > paddingTop) {
                                            fM16189 = paddingTop;
                                        } else {
                                            fM16189 = f3;
                                        }
                                    }
                                    if (c24136.f78130) {
                                        c24136.m54087(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    c24136.m53982(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                y = motionEvent.getY() - c24136.getPaddingTop();
                                if (!this.f8150) {
                                    i = (int) (x2 - this.f8146);
                                    int i10 = (int) (y - this.f8154);
                                    if (Math.abs(i) <= this.f8140) {
                                    }
                                    this.f8150 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c24136.f78015 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c24136.f78127;
                                if (y2 < f) {
                                    c24136.f78015 = -C24132.m53860((int) (f - y2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    f2 = c24136.f78053;
                                    if (y2 > f2) {
                                        c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        c24136.f78015 = 0;
                                    }
                                }
                                fM16189 = c14540.m16189() / 2.0f;
                                paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                if (c24136.f78070) {
                                    if (y < fM16189) {
                                        y = fM16189;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c24136.m54072(x2, y);
                                    return true;
                                }
                                f3 = y + this.f8153;
                                if (f3 >= fM16189) {
                                    if (f3 > paddingTop) {
                                        fM16189 = paddingTop;
                                    } else {
                                        fM16189 = f3;
                                    }
                                }
                                if (c24136.f78130) {
                                    c24136.m54087(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                c24136.m53982(x2 + this.f8156, fM16189);
                                return true;
                            }
                            if (action != 3) {
                                c24136.setPressed(false);
                                m8473(false);
                                c24136.m53969();
                                if (this.f8134) {
                                    m8476();
                                    c24134 = c24136.f78012;
                                    if (c24134 != null) {
                                        c24134.f78063.m8476();
                                        ((View) c24136.getParent()).invalidate();
                                        interfaceC2193 = c24136.f78041;
                                        if (interfaceC2193 != null) {
                                            C24132.m53710(c24136, new Runnable() { // from class: l.۟۠᩸
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f25550;
                                                    final InterfaceC2192 interfaceC2194 = interfaceC2193;
                                                    C24132.m53710(c24134, new Runnable() { // from class: l.ۡ۠᩸
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                            int scrollX = c24137.getScrollX();
                                                            int iM54026 = c24137.m54026();
                                                            interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c24136.f78056) {
                                    }
                                    C24132.m53756(c24136);
                                    c24136.f78070 = false;
                                    c24136.f78130 = false;
                                    c24136.f78069 = false;
                                    c24136.f78107 = false;
                                    c24136.f78056 = false;
                                    c24136.m53785();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f8144++;
                                if (c24136.f78069) {
                                    this.f8136 = motionEvent.getPointerId(1);
                                    this.f8151 = motionEvent.getX(1);
                                    this.f8130 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c14540.f45761) {
                                    m8478(motionEvent);
                                    c24135 = c24136.f78012;
                                    if (c24135 != null) {
                                        c24135.f78063.m8478(motionEvent);
                                        ((View) c24136.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action3 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c24136.f78069) {
                                    c24136.f78069 = false;
                                }
                                this.f8144--;
                            }
                        }
                        return c24136.f78020.m54155(motionEvent);
                    }
                }
            } else {
                if (this.f8155) {
                    actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 != 1) {
                        c24136.setPressed(false);
                        c24136.m53969();
                        m8468();
                        return true;
                    }
                    if (actionMasked2 != 2) {
                        m8470(motionEvent);
                        return true;
                    }
                    if (actionMasked2 == 3) {
                        c24136.setPressed(false);
                        c24136.m53969();
                        m8468();
                        return true;
                    }
                }
                c18207M54110 = c24136.m54110();
                if (c18207M54110 != null) {
                    if (this.f8142) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m8468();
                        } else {
                            if (actionMasked != 2) {
                                x3 = motionEvent.getX() - this.f8133;
                                float y5 = motionEvent.getY() - this.f8139;
                                if (Math.abs(x3) <= this.f8140) {
                                }
                                this.f8142 = false;
                                this.f8155 = true;
                                if (!c24136.isFocused()) {
                                    c24136.requestFocus();
                                }
                                if (!this.f8135) {
                                    c24136.m54003(c24136.m53968(), this.f8137);
                                    c24136.m53845();
                                    this.f8135 = true;
                                }
                                c24136.f78127 = Math.min(c14540.m16189() + c24136.getPaddingTop(), this.f8139);
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c14540.m16189(), this.f8139);
                                c24136.f78015 = 0;
                                c24136.f78073 = 0L;
                                c18207 = c24136.f78120;
                                if (c18207 != null) {
                                    c18207.m42355();
                                }
                                c24136.invalidate();
                                m8473(true);
                                this.f8145 = true;
                                c24136.f78020.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m8470(motionEvent);
                                return true;
                            }
                            if (actionMasked == 3) {
                                m8468();
                            }
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c24136.setPressed(true);
                        c24136.m53970();
                        if (!c24136.isFocused()) {
                            c24136.invalidate();
                        }
                        this.f8138 = true;
                        if (c24136.mo52313()) {
                            m8473(true);
                        }
                        this.f8134 = false;
                        this.f8144 = 0;
                        this.f8146 = (c24136.getScrollX() + ((int) motionEvent.getX())) - c24136.getPaddingLeft();
                        this.f8154 = (c24136.m54026() + ((int) motionEvent.getY())) - c24136.getPaddingTop();
                        this.f8150 = false;
                        iM53968 = c24136.m53968();
                        iM53882 = c24136.m53882();
                        if (iM53968 > iM53882) {
                            iM53882 = iM53968;
                            iM53968 = iM53882;
                        }
                        fM33643 = c24136.f78022.m33643(motionEvent.getY());
                        abstractC13753 = c24136.f78022;
                        if (abstractC13753.f43635) {
                            c23074 = abstractC13753.f43658;
                            if (c23074.m51987(this.f8146, fM33643)) {
                                c24136.f78056 = true;
                                this.f8153 = c23074.f74853 - fM33643;
                                if (!c24136.f78119.isFinished()) {
                                    c24136.f78119.abortAnimation();
                                }
                                m8473(true);
                                c24136.invalidate();
                                return true;
                            }
                        }
                        abstractC13754 = c24136.f78022;
                        if (abstractC13754.f43672) {
                            c23073 = abstractC13754.f43661;
                            if (c23073.m51987(this.f8146, fM33643)) {
                                c24136.f78107 = true;
                                this.f8156 = c23073.f74854 - this.f8146;
                                if (!c24136.f78119.isFinished()) {
                                    c24136.f78119.abortAnimation();
                                }
                                m8473(true);
                                c24136.invalidate();
                                return true;
                            }
                        }
                        if (iM53968 == iM53882) {
                            rectF3 = c24136.f78022.f43633;
                            if (rectF3.contains(this.f8146, fM33643)) {
                                c24136.f78130 = true;
                                this.f8156 = ((rectF3.left + rectF3.right) / 2.0f) - this.f8146;
                                this.f8153 = (rectF3.top - fM33643) - (c14540.m16189() / 2.0f);
                                c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                c24136.f78015 = 0;
                                m8473(true);
                                return true;
                            }
                        } else {
                            rectF = c24136.f78022.f43650;
                            if (rectF.contains(this.f8146, fM33643)) {
                                rectF2 = c24136.f78022.f43675;
                                if (rectF2.contains(this.f8146, fM33643)) {
                                    c24136.f78069 = true;
                                    c24136.f78091 = iM53968;
                                    float f8 = rectF2.left;
                                    this.f8156 = (((rectF2.right - f8) / 4.0f) + f8) - this.f8146;
                                    this.f8153 = (rectF2.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78110 = false;
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            } else {
                                c24136.f78069 = true;
                                c24136.f78091 = iM53882;
                                float f9 = rectF.left;
                                this.f8156 = ((((rectF.right - f9) * 3.0f) / 4.0f) + f9) - this.f8146;
                                this.f8153 = (rectF.top - fM33643) - (c14540.m16189() / 2.0f);
                                c24136.f78110 = true;
                                c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                c24136.f78015 = 0;
                                m8473(true);
                                return true;
                            }
                        }
                        if (c14540.f45803) {
                            x = motionEvent.getX();
                            if (c24136.m53813(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c24136.m53854((x + c24136.getScrollX()) - c24136.getPaddingLeft());
                            }
                            if (z) {
                                this.f8142 = true;
                                this.f8155 = false;
                                this.f8135 = false;
                                this.f8137 = c24136.f78022.m33616(this.f8146, this.f8154);
                                this.f8133 = motionEvent.getX();
                                this.f8139 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c24136.setPressed(false);
                        m8473(false);
                        c24136.m53969();
                        if (this.f8134) {
                            m8476();
                            c24132 = c24136.f78012;
                            if (c24132 != null) {
                                c24132.f78063.m8476();
                                ((View) c24136.getParent()).invalidate();
                                interfaceC2192 = c24136.f78041;
                                if (interfaceC2192 != null) {
                                    C24132.m53710(c24136, new Runnable() { // from class: l.ᩳ۠᩸
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f61459;
                                            final InterfaceC2192 interfaceC2194 = interfaceC2192;
                                            C24132.m53710(c24132, new Runnable() { // from class: l.֨۠᩸
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                    int scrollX = c24137.getScrollX();
                                                    int iM54026 = c24137.m54026();
                                                    interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c24136.f78130) {
                            }
                            c24136.m53785();
                            if (c24136.f78130) {
                                c24136.m53956(-1);
                            } else if (!c24136.f78069) {
                                iM53969 = c24136.m53968();
                                iM53883 = c24136.m53882();
                                if (iM53969 > iM53883) {
                                    iM53883 = iM53969;
                                    iM53969 = iM53883;
                                }
                                if (!c24136.f78110) {
                                    iM53969 = iM53883;
                                }
                                c24136.m53956(iM53969);
                            } else {
                                iM53969 = c24136.m53968();
                                iM53883 = c24136.m53882();
                                if (iM53969 > iM53883) {
                                    iM53883 = iM53969;
                                    iM53969 = iM53883;
                                }
                                if (!c24136.f78110) {
                                    iM53969 = iM53883;
                                }
                                c24136.m53956(iM53969);
                            }
                            c24136.f78070 = false;
                            c24136.f78130 = false;
                            c24136.f78069 = false;
                            c24136.f78073 = SystemClock.uptimeMillis();
                            return true;
                        }
                    } else {
                        if (action != 2) {
                            m8475(motionEvent);
                            if (this.f8144 != 1) {
                                if (c24136.f78069) {
                                    c24136.f78063.onScroll(null, null, (this.f8151 - motionEvent.getX(1)) - c24136.getPaddingLeft(), (this.f8130 - motionEvent.getY(1)) - c24136.getPaddingTop());
                                    this.f8151 = motionEvent.getX(1);
                                    this.f8130 = motionEvent.getY(1);
                                } else if (this.f8134) {
                                    m8477(motionEvent);
                                    c24133 = c24136.f78012;
                                    if (c24133 != null) {
                                        c24133.f78063.m8477(motionEvent);
                                        ((View) c24136.getParent()).invalidate();
                                        return true;
                                    }
                                }
                                if (!c24136.f78130) {
                                    x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                    y = motionEvent.getY() - c24136.getPaddingTop();
                                    if (!this.f8150) {
                                        i = (int) (x2 - this.f8146);
                                        int i11 = (int) (y - this.f8154);
                                        if (Math.abs(i) <= this.f8140) {
                                        }
                                        this.f8150 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c24136.f78015 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c24136.f78127;
                                    if (y2 < f) {
                                        c24136.f78015 = -C24132.m53860((int) (f - y2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c24136.f78053;
                                        if (y2 > f2) {
                                            c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                            if (z2) {
                                                c24136.f78133 = SystemClock.uptimeMillis();
                                            }
                                            c24136.postInvalidateOnAnimation();
                                        } else {
                                            c24136.f78015 = 0;
                                        }
                                    }
                                    fM16189 = c14540.m16189() / 2.0f;
                                    paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                    if (c24136.f78070) {
                                        if (y < fM16189) {
                                            y = fM16189;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c24136.m54072(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f8153;
                                    if (f3 >= fM16189) {
                                        if (f3 > paddingTop) {
                                            fM16189 = paddingTop;
                                        } else {
                                            fM16189 = f3;
                                        }
                                    }
                                    if (c24136.f78130) {
                                        c24136.m54087(x2 + this.f8156, fM16189);
                                        return true;
                                    }
                                    c24136.m53982(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                y = motionEvent.getY() - c24136.getPaddingTop();
                                if (!this.f8150) {
                                    i = (int) (x2 - this.f8146);
                                    int i12 = (int) (y - this.f8154);
                                    if (Math.abs(i) <= this.f8140) {
                                    }
                                    this.f8150 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c24136.f78015 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c24136.f78127;
                                if (y2 < f) {
                                    c24136.f78015 = -C24132.m53860((int) (f - y2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    f2 = c24136.f78053;
                                    if (y2 > f2) {
                                        c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        c24136.f78015 = 0;
                                    }
                                }
                                fM16189 = c14540.m16189() / 2.0f;
                                paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                if (c24136.f78070) {
                                    if (y < fM16189) {
                                        y = fM16189;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c24136.m54072(x2, y);
                                    return true;
                                }
                                f3 = y + this.f8153;
                                if (f3 >= fM16189) {
                                    if (f3 > paddingTop) {
                                        fM16189 = paddingTop;
                                    } else {
                                        fM16189 = f3;
                                    }
                                }
                                if (c24136.f78130) {
                                    c24136.m54087(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                c24136.m53982(x2 + this.f8156, fM16189);
                                return true;
                            }
                            if (!c24136.f78130) {
                                x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                y = motionEvent.getY() - c24136.getPaddingTop();
                                if (!this.f8150) {
                                    i = (int) (x2 - this.f8146);
                                    int i13 = (int) (y - this.f8154);
                                    if (Math.abs(i) <= this.f8140) {
                                    }
                                    this.f8150 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c24136.f78015 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c24136.f78127;
                                if (y2 < f) {
                                    c24136.f78015 = -C24132.m53860((int) (f - y2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    f2 = c24136.f78053;
                                    if (y2 > f2) {
                                        c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        c24136.f78015 = 0;
                                    }
                                }
                                fM16189 = c14540.m16189() / 2.0f;
                                paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                if (c24136.f78070) {
                                    if (y < fM16189) {
                                        y = fM16189;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c24136.m54072(x2, y);
                                    return true;
                                }
                                f3 = y + this.f8153;
                                if (f3 >= fM16189) {
                                    if (f3 > paddingTop) {
                                        fM16189 = paddingTop;
                                    } else {
                                        fM16189 = f3;
                                    }
                                }
                                if (c24136.f78130) {
                                    c24136.m54087(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                c24136.m53982(x2 + this.f8156, fM16189);
                                return true;
                            }
                            x2 = motionEvent.getX() - c24136.getPaddingLeft();
                            y = motionEvent.getY() - c24136.getPaddingTop();
                            if (!this.f8150) {
                                i = (int) (x2 - this.f8146);
                                int i14 = (int) (y - this.f8154);
                                if (Math.abs(i) <= this.f8140) {
                                }
                                this.f8150 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c24136.f78015 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c24136.f78127;
                            if (y2 < f) {
                                c24136.f78015 = -C24132.m53860((int) (f - y2));
                                if (z2) {
                                    c24136.f78133 = SystemClock.uptimeMillis();
                                }
                                c24136.postInvalidateOnAnimation();
                            } else {
                                f2 = c24136.f78053;
                                if (y2 > f2) {
                                    c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    c24136.f78015 = 0;
                                }
                            }
                            fM16189 = c14540.m16189() / 2.0f;
                            paddingTop = c24136.f78053 - c24136.getPaddingTop();
                            if (c24136.f78070) {
                                if (y < fM16189) {
                                    y = fM16189;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c24136.m54072(x2, y);
                                return true;
                            }
                            f3 = y + this.f8153;
                            if (f3 >= fM16189) {
                                if (f3 > paddingTop) {
                                    fM16189 = paddingTop;
                                } else {
                                    fM16189 = f3;
                                }
                            }
                            if (c24136.f78130) {
                                c24136.m54087(x2 + this.f8156, fM16189);
                                return true;
                            }
                            c24136.m53982(x2 + this.f8156, fM16189);
                            return true;
                        }
                        if (action != 3) {
                            c24136.setPressed(false);
                            m8473(false);
                            c24136.m53969();
                            if (this.f8134) {
                                m8476();
                                c24134 = c24136.f78012;
                                if (c24134 != null) {
                                    c24134.f78063.m8476();
                                    ((View) c24136.getParent()).invalidate();
                                    interfaceC2193 = c24136.f78041;
                                    if (interfaceC2193 != null) {
                                        C24132.m53710(c24136, new Runnable() { // from class: l.۟۠᩸
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f25550;
                                                final InterfaceC2192 interfaceC2194 = interfaceC2193;
                                                C24132.m53710(c24134, new Runnable() { // from class: l.ۡ۠᩸
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                        int scrollX = c24137.getScrollX();
                                                        int iM54026 = c24137.m54026();
                                                        interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c24136.f78056) {
                                }
                                C24132.m53756(c24136);
                                c24136.f78070 = false;
                                c24136.f78130 = false;
                                c24136.f78069 = false;
                                c24136.f78107 = false;
                                c24136.f78056 = false;
                                c24136.m53785();
                                return true;
                            }
                        } else if (action != 5) {
                            this.f8144++;
                            if (c24136.f78069) {
                                this.f8136 = motionEvent.getPointerId(1);
                                this.f8151 = motionEvent.getX(1);
                                this.f8130 = motionEvent.getY(1);
                                return true;
                            }
                            if (c14540.f45761) {
                                m8478(motionEvent);
                                c24135 = c24136.f78012;
                                if (c24135 != null) {
                                    c24135.f78063.m8478(motionEvent);
                                    ((View) c24136.getParent()).invalidate();
                                }
                            }
                        } else if (action == 6) {
                            int action4 = (motionEvent.getAction() & 65280) >>> 8;
                            if (c24136.f78069) {
                                c24136.f78069 = false;
                            }
                            this.f8144--;
                        }
                    }
                    return c24136.f78020.m54155(motionEvent);
                }
                viewTreeObserverOnPreDrawListenerC22000Arr = c18207M54110.f59453;
                if (!viewTreeObserverOnPreDrawListenerC22000Arr[0].m49733() && !viewTreeObserverOnPreDrawListenerC22000Arr[1].m49733() && !viewTreeObserverOnPreDrawListenerC22000Arr[2].m49733()) {
                    if (this.f8142) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m8468();
                        } else if (actionMasked != 2) {
                            x3 = motionEvent.getX() - this.f8133;
                            float y6 = motionEvent.getY() - this.f8139;
                            if (Math.abs(x3) <= this.f8140 || Math.abs(y6) > this.f8140) {
                                this.f8142 = false;
                                this.f8155 = true;
                                if (!c24136.isFocused()) {
                                    c24136.requestFocus();
                                }
                                if (!this.f8135) {
                                    c24136.m54003(c24136.m53968(), this.f8137);
                                    c24136.m53845();
                                    this.f8135 = true;
                                }
                                c24136.f78127 = Math.min(c14540.m16189() + c24136.getPaddingTop(), this.f8139);
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c14540.m16189(), this.f8139);
                                c24136.f78015 = 0;
                                c24136.f78073 = 0L;
                                c18207 = c24136.f78120;
                                if (c18207 != null) {
                                    c18207.m42355();
                                }
                                c24136.invalidate();
                                m8473(true);
                                this.f8145 = true;
                                c24136.f78020.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m8470(motionEvent);
                                return true;
                            }
                        } else if (actionMasked == 3) {
                            m8468();
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c24136.setPressed(true);
                        c24136.m53970();
                        if (!c24136.isFocused()) {
                            c24136.invalidate();
                        }
                        this.f8138 = true;
                        if (c24136.mo52313()) {
                            m8473(true);
                        }
                        this.f8134 = false;
                        this.f8144 = 0;
                        this.f8146 = (c24136.getScrollX() + ((int) motionEvent.getX())) - c24136.getPaddingLeft();
                        this.f8154 = (c24136.m54026() + ((int) motionEvent.getY())) - c24136.getPaddingTop();
                        this.f8150 = false;
                        iM53968 = c24136.m53968();
                        iM53882 = c24136.m53882();
                        if (iM53968 > iM53882) {
                            iM53882 = iM53968;
                            iM53968 = iM53882;
                        }
                        fM33643 = c24136.f78022.m33643(motionEvent.getY());
                        abstractC13753 = c24136.f78022;
                        if (abstractC13753.f43635) {
                            c23074 = abstractC13753.f43658;
                            if (c23074.m51987(this.f8146, fM33643)) {
                                c24136.f78056 = true;
                                this.f8153 = c23074.f74853 - fM33643;
                                if (!c24136.f78119.isFinished()) {
                                    c24136.f78119.abortAnimation();
                                }
                                m8473(true);
                                c24136.invalidate();
                                return true;
                            }
                        }
                        abstractC13754 = c24136.f78022;
                        if (abstractC13754.f43672) {
                            c23073 = abstractC13754.f43661;
                            if (c23073.m51987(this.f8146, fM33643)) {
                                c24136.f78107 = true;
                                this.f8156 = c23073.f74854 - this.f8146;
                                if (!c24136.f78119.isFinished()) {
                                    c24136.f78119.abortAnimation();
                                }
                                m8473(true);
                                c24136.invalidate();
                                return true;
                            }
                        }
                        if (iM53968 == iM53882) {
                            rectF3 = c24136.f78022.f43633;
                            if (rectF3.contains(this.f8146, fM33643)) {
                                c24136.f78130 = true;
                                this.f8156 = ((rectF3.left + rectF3.right) / 2.0f) - this.f8146;
                                this.f8153 = (rectF3.top - fM33643) - (c14540.m16189() / 2.0f);
                                c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                c24136.f78015 = 0;
                                m8473(true);
                                return true;
                            }
                        } else {
                            rectF = c24136.f78022.f43650;
                            if (rectF.contains(this.f8146, fM33643)) {
                                rectF2 = c24136.f78022.f43675;
                                if (rectF2.contains(this.f8146, fM33643)) {
                                    c24136.f78069 = true;
                                    c24136.f78091 = iM53968;
                                    float f10 = rectF2.left;
                                    this.f8156 = (((rectF2.right - f10) / 4.0f) + f10) - this.f8146;
                                    this.f8153 = (rectF2.top - fM33643) - (c14540.m16189() / 2.0f);
                                    c24136.f78110 = false;
                                    c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                    c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                    c24136.f78015 = 0;
                                    m8473(true);
                                    return true;
                                }
                            } else {
                                c24136.f78069 = true;
                                c24136.f78091 = iM53882;
                                float f11 = rectF.left;
                                this.f8156 = ((((rectF.right - f11) * 3.0f) / 4.0f) + f11) - this.f8146;
                                this.f8153 = (rectF.top - fM33643) - (c14540.m16189() / 2.0f);
                                c24136.f78110 = true;
                                c24136.f78127 = Math.min(c14540.m16189() + (c24136.m53995() / 2.0f) + c24136.getPaddingTop(), motionEvent.getY());
                                c24136.f78053 = Math.max((c24136.getHeight() - c24136.getPaddingBottom()) - c24136.m53995(), motionEvent.getY());
                                c24136.f78015 = 0;
                                m8473(true);
                                return true;
                            }
                        }
                        if (c14540.f45803 && C24132.m53841(motionEvent) && (motionEvent.getButtonState() & 1) != 0 && !c24136.f78022.mo25237()) {
                            x = motionEvent.getX();
                            if (c24136.m53813(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c24136.m53854((x + c24136.getScrollX()) - c24136.getPaddingLeft());
                            }
                            if (z) {
                                this.f8142 = true;
                                this.f8155 = false;
                                this.f8135 = false;
                                this.f8137 = c24136.f78022.m33616(this.f8146, this.f8154);
                                this.f8133 = motionEvent.getX();
                                this.f8139 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c24136.setPressed(false);
                        m8473(false);
                        c24136.m53969();
                        if (this.f8134) {
                            m8476();
                            c24132 = c24136.f78012;
                            if (c24132 != null) {
                                c24132.f78063.m8476();
                                ((View) c24136.getParent()).invalidate();
                                interfaceC2192 = c24136.f78041;
                                if (interfaceC2192 != null) {
                                    C24132.m53710(c24136, new Runnable() { // from class: l.ᩳ۠᩸
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f61459;
                                            final InterfaceC2192 interfaceC2194 = interfaceC2192;
                                            C24132.m53710(c24132, new Runnable() { // from class: l.֨۠᩸
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                    int scrollX = c24137.getScrollX();
                                                    int iM54026 = c24137.m54026();
                                                    interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c24136.f78130 || c24136.f78069 || c24136.f78070) {
                                c24136.m53785();
                                if (c24136.f78130) {
                                    c24136.m53956(-1);
                                } else if (!c24136.f78069 || c24136.f78070) {
                                    iM53969 = c24136.m53968();
                                    iM53883 = c24136.m53882();
                                    if (iM53969 > iM53883) {
                                        iM53883 = iM53969;
                                        iM53969 = iM53883;
                                    }
                                    if (!c24136.f78110) {
                                        iM53969 = iM53883;
                                    }
                                    c24136.m53956(iM53969);
                                }
                                c24136.f78070 = false;
                                c24136.f78130 = false;
                                c24136.f78069 = false;
                                c24136.f78073 = SystemClock.uptimeMillis();
                                return true;
                            }
                            if (c24136.f78056) {
                                C24132.m53756(c24136);
                                c24136.m53955();
                                if (C24132.m53841(motionEvent)) {
                                    C24132.m53707(c24136, 1, motionEvent);
                                    return true;
                                }
                            } else if (c24136.f78107) {
                                c24136.f78107 = false;
                                c24136.m54022();
                                if (C24132.m53841(motionEvent)) {
                                    C24132.m53707(c24136, 2, motionEvent);
                                }
                            } else {
                                if (this.f8138 || c24136.mo52330()) {
                                    c24136.f78073 = SystemClock.uptimeMillis();
                                }
                                c24136.invalidate();
                                C24132.m53744(c24136);
                            }
                        }
                    } else if (action != 2) {
                        m8475(motionEvent);
                        if (this.f8144 != 1) {
                            if (c24136.f78069) {
                                c24136.f78063.onScroll(null, null, (this.f8151 - motionEvent.getX(1)) - c24136.getPaddingLeft(), (this.f8130 - motionEvent.getY(1)) - c24136.getPaddingTop());
                                this.f8151 = motionEvent.getX(1);
                                this.f8130 = motionEvent.getY(1);
                            } else if (this.f8134) {
                                m8477(motionEvent);
                                c24133 = c24136.f78012;
                                if (c24133 != null) {
                                    c24133.f78063.m8477(motionEvent);
                                    ((View) c24136.getParent()).invalidate();
                                    return true;
                                }
                            }
                            if (!c24136.f78130) {
                                x2 = motionEvent.getX() - c24136.getPaddingLeft();
                                y = motionEvent.getY() - c24136.getPaddingTop();
                                if (!this.f8150) {
                                    i = (int) (x2 - this.f8146);
                                    int i15 = (int) (y - this.f8154);
                                    if (Math.abs(i) <= this.f8140) {
                                    }
                                    this.f8150 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c24136.f78015 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c24136.f78127;
                                if (y2 < f) {
                                    c24136.f78015 = -C24132.m53860((int) (f - y2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    f2 = c24136.f78053;
                                    if (y2 > f2) {
                                        c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                        if (z2) {
                                            c24136.f78133 = SystemClock.uptimeMillis();
                                        }
                                        c24136.postInvalidateOnAnimation();
                                    } else {
                                        c24136.f78015 = 0;
                                    }
                                }
                                fM16189 = c14540.m16189() / 2.0f;
                                paddingTop = c24136.f78053 - c24136.getPaddingTop();
                                if (c24136.f78070) {
                                    if (y < fM16189) {
                                        y = fM16189;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c24136.m54072(x2, y);
                                    return true;
                                }
                                f3 = y + this.f8153;
                                if (f3 >= fM16189) {
                                    if (f3 > paddingTop) {
                                        fM16189 = paddingTop;
                                    } else {
                                        fM16189 = f3;
                                    }
                                }
                                if (c24136.f78130) {
                                    c24136.m54087(x2 + this.f8156, fM16189);
                                    return true;
                                }
                                c24136.m53982(x2 + this.f8156, fM16189);
                                return true;
                            }
                            x2 = motionEvent.getX() - c24136.getPaddingLeft();
                            y = motionEvent.getY() - c24136.getPaddingTop();
                            if (!this.f8150) {
                                i = (int) (x2 - this.f8146);
                                int i16 = (int) (y - this.f8154);
                                if (Math.abs(i) <= this.f8140) {
                                }
                                this.f8150 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c24136.f78015 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c24136.f78127;
                            if (y2 < f) {
                                c24136.f78015 = -C24132.m53860((int) (f - y2));
                                if (z2) {
                                    c24136.f78133 = SystemClock.uptimeMillis();
                                }
                                c24136.postInvalidateOnAnimation();
                            } else {
                                f2 = c24136.f78053;
                                if (y2 > f2) {
                                    c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    c24136.f78015 = 0;
                                }
                            }
                            fM16189 = c14540.m16189() / 2.0f;
                            paddingTop = c24136.f78053 - c24136.getPaddingTop();
                            if (c24136.f78070) {
                                if (y < fM16189) {
                                    y = fM16189;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c24136.m54072(x2, y);
                                return true;
                            }
                            f3 = y + this.f8153;
                            if (f3 >= fM16189) {
                                if (f3 > paddingTop) {
                                    fM16189 = paddingTop;
                                } else {
                                    fM16189 = f3;
                                }
                            }
                            if (c24136.f78130) {
                                c24136.m54087(x2 + this.f8156, fM16189);
                                return true;
                            }
                            c24136.m53982(x2 + this.f8156, fM16189);
                            return true;
                        }
                        if (!c24136.f78130 || c24136.f78069 || c24136.f78070) {
                            x2 = motionEvent.getX() - c24136.getPaddingLeft();
                            y = motionEvent.getY() - c24136.getPaddingTop();
                            if (!this.f8150) {
                                i = (int) (x2 - this.f8146);
                                int i17 = (int) (y - this.f8154);
                                if (Math.abs(i) <= this.f8140 || Math.abs(i17) > this.f8140) {
                                    this.f8150 = true;
                                }
                            }
                            y2 = motionEvent.getY();
                            if (c24136.f78015 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c24136.f78127;
                            if (y2 < f) {
                                c24136.f78015 = -C24132.m53860((int) (f - y2));
                                if (z2) {
                                    c24136.f78133 = SystemClock.uptimeMillis();
                                }
                                c24136.postInvalidateOnAnimation();
                            } else {
                                f2 = c24136.f78053;
                                if (y2 > f2) {
                                    c24136.f78015 = C24132.m53860((int) (y2 - f2));
                                    if (z2) {
                                        c24136.f78133 = SystemClock.uptimeMillis();
                                    }
                                    c24136.postInvalidateOnAnimation();
                                } else {
                                    c24136.f78015 = 0;
                                }
                            }
                            fM16189 = c14540.m16189() / 2.0f;
                            paddingTop = c24136.f78053 - c24136.getPaddingTop();
                            if (c24136.f78070) {
                                if (y < fM16189) {
                                    y = fM16189;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c24136.m54072(x2, y);
                                return true;
                            }
                            f3 = y + this.f8153;
                            if (f3 >= fM16189) {
                                if (f3 > paddingTop) {
                                    fM16189 = paddingTop;
                                } else {
                                    fM16189 = f3;
                                }
                            }
                            if (c24136.f78130) {
                                c24136.m54087(x2 + this.f8156, fM16189);
                                return true;
                            }
                            c24136.m53982(x2 + this.f8156, fM16189);
                            return true;
                        }
                        float f12 = 1.0f;
                        if (c24136.f78056) {
                            float y7 = ((motionEvent.getY() - c24136.getPaddingTop()) + this.f8153) / (c24136.m53993() - c14540.f45764);
                            if (y7 < 0.0f) {
                                f12 = 0.0f;
                            } else if (y7 <= 1.0f) {
                                f12 = y7;
                            }
                            int iM53965 = (int) (c24136.m53965() * f12);
                            if (iM53965 != c24136.m54026()) {
                                c24136.scrollTo(c24136.getScrollX(), iM53965);
                                c24136.f78079 = SystemClock.uptimeMillis();
                                c24136.f78037.removeMessages(6);
                                c24136.f78037.sendEmptyMessageDelayed(6, 100L);
                                return true;
                            }
                        } else if (c24136.f78107) {
                            int i18 = (c14540.f45769 && c14540.f45744) ? c24136.f78022.f43630 : 0;
                            if (i18 != 0 && c14540.f45816) {
                                i2 = i18;
                            }
                            float x5 = (((motionEvent.getX() - i2) - c24136.getPaddingLeft()) + this.f8156) / ((c24136.m54108() - i18) - c14540.f45764);
                            if (x5 < 0.0f) {
                                f12 = 0.0f;
                            } else if (x5 <= 1.0f) {
                                f12 = x5;
                            }
                            int iM53868 = (int) (c24136.m53868() * f12);
                            if (iM53868 != c24136.getScrollX()) {
                                c24136.scrollTo(iM53868, c24136.m54026());
                                return true;
                            }
                        }
                    } else if (action != 3) {
                        c24136.setPressed(false);
                        m8473(false);
                        c24136.m53969();
                        if (this.f8134) {
                            m8476();
                            c24134 = c24136.f78012;
                            if (c24134 != null) {
                                c24134.f78063.m8476();
                                ((View) c24136.getParent()).invalidate();
                                interfaceC2193 = c24136.f78041;
                                if (interfaceC2193 != null) {
                                    C24132.m53710(c24136, new Runnable() { // from class: l.۟۠᩸
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f25550;
                                            final InterfaceC2192 interfaceC2194 = interfaceC2193;
                                            C24132.m53710(c24134, new Runnable() { // from class: l.ۡ۠᩸
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C24132 c24137 = viewOnTouchListenerC2545.f8157;
                                                    int scrollX = c24137.getScrollX();
                                                    int iM54026 = c24137.m54026();
                                                    interfaceC2194.mo7499(scrollX, iM54026 - 1, scrollX, iM54026);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c24136.f78056 || c24136.f78107 || c24136.f78069 || c24136.f78130 || c24136.f78070) {
                                C24132.m53756(c24136);
                                c24136.f78070 = false;
                                c24136.f78130 = false;
                                c24136.f78069 = false;
                                c24136.f78107 = false;
                                c24136.f78056 = false;
                                c24136.m53785();
                                return true;
                            }
                            C24132.m53744(c24136);
                        }
                    } else if (action != 5) {
                        this.f8144++;
                        if (c24136.f78069) {
                            this.f8136 = motionEvent.getPointerId(1);
                            this.f8151 = motionEvent.getX(1);
                            this.f8130 = motionEvent.getY(1);
                            return true;
                        }
                        if (c14540.f45761 && !this.f8134) {
                            m8478(motionEvent);
                            c24135 = c24136.f78012;
                            if (c24135 != null) {
                                c24135.f78063.m8478(motionEvent);
                                ((View) c24136.getParent()).invalidate();
                            }
                        }
                    } else if (action == 6) {
                        int action5 = (motionEvent.getAction() & 65280) >>> 8;
                        if (c24136.f78069 && action5 != this.f8136) {
                            c24136.f78069 = false;
                        }
                        this.f8144--;
                    }
                    return c24136.f78020.m54155(motionEvent);
                }
            }
        } else {
            try {
                c24136.f78051.m45314(motionEvent);
                if (actionMasked3 == i || actionMasked3 == i) {
                    return true;
                }
            } finally {
                if (actionMasked3 == 1 || actionMasked3 == 3) {
                    c24136.f78051 = null;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m8478(MotionEvent motionEvent) {
        this.f8147 = m8474(motionEvent);
        this.f8134 = true;
        this.f8150 = false;
        C24132 c24132 = this.f8157;
        this.f8148 = c24132.f78066.f18967.getTextSize();
        this.f8143 = c24132.getScrollX();
        this.f8158 = c24132.m54026();
        if (c24132.f78056 || c24132.f78107 || c24132.f78130 || c24132.f78070) {
            c24132.m53785();
            C24132.m53756(c24132);
            c24132.f78070 = false;
            c24132.f78130 = false;
            c24132.f78107 = false;
            c24132.f78056 = false;
            return;
        }
        c24132.f78020.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m8477(MotionEvent motionEvent) {
        float f;
        C24132 c24132 = this.f8157;
        C14540 c14540 = c24132.f78066;
        float fM8474 = m8474(motionEvent);
        if (!this.f8150) {
            if (Math.abs(fM8474 - this.f8147) <= this.f8140) {
                return;
            } else {
                this.f8150 = true;
            }
        }
        float f2 = fM8474 / this.f8147;
        float textSize = c14540.f18967.getTextSize();
        if (c14540.m35090(this.f8148 * f2)) {
            float textSize2 = c14540.f18967.getTextSize() / this.f8148;
            c24132.f78022.mo25221(textSize);
            float fM53965 = 0.0f;
            if (c24132.f78022.mo25225()) {
                float x = ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f) - c24132.getPaddingLeft();
                f = ((this.f8143 + x) * textSize2) - x;
                if (f < 0.0f) {
                    f = 0.0f;
                } else {
                    float fM53868 = c24132.m53868();
                    if (f > fM53868) {
                        f = fM53868;
                    }
                }
            } else {
                f = 0.0f;
            }
            float y = ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - c24132.getPaddingTop();
            float f3 = ((this.f8158 + y) * textSize2) - y;
            if (f3 >= 0.0f) {
                fM53965 = c24132.m53965();
                if (f3 <= fM53965) {
                    fM53965 = f3;
                }
            }
            c24132.m53875((int) f, (int) fM53965);
            c24132.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m8476() {
        if (this.f8150) {
            C24132 c24132 = this.f8157;
            c24132.m54001();
            c24132.f78022.mo25235();
            c24132.m53738();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static float m8474(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }
}
