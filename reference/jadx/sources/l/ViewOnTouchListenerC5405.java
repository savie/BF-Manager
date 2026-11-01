package l;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: renamed from: l.ۚܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC5405 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f18640;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f18641;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f18642;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f18643;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f18644;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f18646;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f18647;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f18649;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18650;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f18652;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f18653;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f18654;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f18656;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f18657;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f18658;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f18659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f18660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f18661;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f18662;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f18663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18664;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18665;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f18666;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f18667;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18668;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f18645 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ResultReceiverC17961 f18648 = new ResultReceiverC17961();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f18655 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f18651 = -1;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ViewOnTouchListenerC5405(C6111 c6111, Context context) {
        this.f18663 = c6111;
        this.f18658 = c6111.f20764.m30747();
        this.f18668 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m14966();
        C6111 c6111 = this.f18663;
        int iM16916 = c6111.m16916();
        if (iM16916 == c6111.m17020()) {
            c6111.m16824(iM16916, true);
            c6111.m16886(true);
            c6111.m16946(-1);
        }
        c6111.f20844 = SystemClock.uptimeMillis();
        c6111.m16835();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C6111 c6111 = this.f18663;
        this.f18661 = c6111.isFocused();
        if (c6111.f20718.isFinished()) {
            return false;
        }
        c6111.f20718.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f);
        C6111 c6111 = this.f18663;
        if (fAbs > fAbs2) {
            f = 0.0f;
        } else {
            if (!c6111.f20764.mo14788()) {
                return false;
            }
            f2 = 0.0f;
        }
        int iM17046 = c6111.m17046();
        int iM17012 = c6111.m17012();
        c6111.f20709 = true;
        c6111.f20718.fling(c6111.getScrollX(), c6111.m17066(), (int) (-f), (int) (-f2), 0, iM17046, 0, iM17012);
        if (f2 != 0.0f) {
            c6111.m16944();
            return true;
        }
        if (f != 0.0f) {
            c6111.m17003();
            return true;
        }
        c6111.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C6111 c6111 = this.f18663;
        C1590 c1590 = c6111.f20794;
        if (c6111.m16809()) {
            return;
        }
        m14966();
        c6111.performHapticFeedback(0);
        if (!c6111.isFocused()) {
            c6111.requestFocus();
        }
        float x = (motionEvent.getX() + c6111.getScrollX()) - c6111.getPaddingLeft();
        float y = (motionEvent.getY() + c6111.m17066()) - c6111.getPaddingTop();
        int iM16916 = c6111.m16916();
        int iM17020 = c6111.m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        if (c1590.f6388 && c6111.m16640(x)) {
            int iM30729 = c6111.f20764.m30729(y);
            C3662 c3662 = c6111.f20764.f41308;
            int i = c3662.get(c3662.m10801(iM30729)).f47316;
            C3662 c3663 = c6111.f20764.f41308;
            int i2 = c3663.get(c3663.m10812(iM30729)).f47317;
            BaseInputConnection.removeComposingSpans(c6111.f20708);
            if (iM16916 == iM17020) {
                c6111.f20708.setSelection(i, i2);
                c6111.f20705 = i;
                c6111.f20833 = i2;
            } else {
                if (c6111.f20705 == -1) {
                    c6111.f20705 = iM16916;
                    c6111.f20833 = iM17020;
                }
                if (i < c6111.f20705) {
                    iM16916 = i;
                }
                if (i2 >= c6111.f20833) {
                    iM17020 = i2;
                }
                c6111.f20708.setSelection(iM16916, iM17020);
            }
            c6111.m16808();
            c6111.invalidate();
            return;
        }
        int iM30730 = c6111.f20764.m30730(x, y);
        if (!c6111.mo17022()) {
            if (iM16916 == iM17020 || iM16916 > iM30730 || iM30730 > iM17020) {
                c6111.m16824(iM30730, false);
                c6111.m16886(true);
            }
            c6111.m16946(-1);
            c6111.f20844 = SystemClock.uptimeMillis();
            c6111.m16835();
        } else if (iM16916 != iM17020 && iM16916 <= iM30730 && iM30730 <= iM17020) {
            c6111.m16946(-1);
            c6111.f20844 = SystemClock.uptimeMillis();
            c6111.m16835();
        } else {
            int[] iArrM16965 = c6111.m16965(iM30730, false);
            c6111.f20806 = true;
            c6111.f20837 = iM30730;
            c6111.m17056(c6111.m16916(), iArrM16965[0]);
            c6111.mo16839(iArrM16965[0], iArrM16965[1]);
            c6111.f20832 = iArrM16965[0];
            c6111.f20844 = 0L;
            c6111.f20749 = Math.min(c1590.m17870() + (c6111.m17062() / 2.0f) + c6111.getPaddingTop(), motionEvent.getY());
            c6111.f20757 = Math.max((c6111.getHeight() - c6111.getPaddingBottom()) - c6111.m17062(), motionEvent.getY());
            c6111.f20766 = 0;
            c6111.invalidate();
            c6111.m16886(true);
            c6111.m16736((int) motionEvent.getX(), (int) motionEvent.getY(), c1590.f6417);
        }
        c6111.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14971(boolean z) {
        if (this.f18645 != z) {
            this.f18663.getParent().requestDisallowInterceptTouchEvent(z);
            this.f18645 = z;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6111 c6111 = this.f18663;
        C1590 c1590 = c6111.f20794;
        if (!c6111.isFocused()) {
            c6111.requestFocus();
        }
        if (c6111.f20764.mo14788() && Math.abs(f) > Math.abs(f2)) {
            int scrollX = c6111.getScrollX() + ((int) f);
            if (scrollX < 0) {
                if (motionEvent2 != null && c1590.f6426) {
                    C0883.m3557(c6111.f20724, (-f) / c6111.getWidth(), 1.0f - (motionEvent2.getY() / c6111.getHeight()));
                    c6111.postInvalidateOnAnimation();
                    if (!c6111.f20777.isFinished()) {
                        c6111.f20777.onRelease();
                    }
                }
                scrollX = 0;
            } else {
                int iM17046 = c6111.m17046();
                if (scrollX > iM17046) {
                    if (motionEvent2 != null && c1590.f6426) {
                        C0883.m3557(c6111.f20777, f / c6111.getWidth(), motionEvent2.getY() / c6111.getHeight());
                        c6111.postInvalidateOnAnimation();
                        if (!c6111.f20724.isFinished()) {
                            c6111.f20724.onRelease();
                        }
                    }
                    scrollX = iM17046;
                }
            }
            c6111.scrollTo(scrollX, c6111.m17066());
            c6111.m17003();
        } else {
            int iM17066 = c6111.m17066() + ((int) f2);
            if (iM17066 < 0) {
                if (this.f18654) {
                    m14971(false);
                }
                if (motionEvent2 != null && c1590.f6426) {
                    C0883.m3557(c6111.f20727, (-f2) / c6111.getHeight(), motionEvent2.getX() / c6111.getWidth());
                    c6111.postInvalidateOnAnimation();
                    if (!c6111.f20783.isFinished()) {
                        c6111.f20783.onRelease();
                    }
                }
                iM17066 = 0;
            } else {
                int iM17012 = c6111.m17012();
                if (iM17066 > iM17012) {
                    if (this.f18654) {
                        m14971(false);
                    }
                    if (motionEvent2 != null && c1590.f6426) {
                        C0883.m3557(c6111.f20783, f2 / c6111.getHeight(), 1.0f - (motionEvent2.getX() / c6111.getWidth()));
                        c6111.postInvalidateOnAnimation();
                        if (!c6111.f20727.isFinished()) {
                            c6111.f20727.onRelease();
                        }
                    }
                    iM17066 = iM17012;
                }
            }
            c6111.scrollTo(c6111.getScrollX(), iM17066);
            c6111.m16944();
        }
        if (!this.f18654) {
            return true;
        }
        this.f18654 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        final C6111 c6111 = this.f18663;
        int scrollX = c6111.getScrollX();
        C1590 c1590 = c6111.f20794;
        int iM30730 = c6111.f20764.m30730((x + scrollX) - c6111.getPaddingLeft(), (motionEvent.getY() + c6111.m17066()) - c6111.getPaddingTop());
        int iM16916 = c6111.m16916();
        int iM17020 = c6111.m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        boolean zMo14804 = c6111.f20764.mo14804();
        ResultReceiverC17961 resultReceiverC17961 = this.f18648;
        if (zMo14804 || c1590.f6433 || !c6111.isFocused()) {
            z = false;
        } else {
            resultReceiverC17961.m41793();
            c6111.f20778.showSoftInput(c6111, 0, resultReceiverC17961);
            z = true;
        }
        if (c6111.f20764.f41328) {
            if (z && iM16916 != iM17020 && iM16916 <= iM30730 && iM30730 <= iM17020 && resultReceiverC17961.m41792() == 2) {
                c6111.postDelayed(new Runnable() { // from class: l.ܰܳۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c6111.m16946(-1);
                    }
                }, 100L);
            } else if (iM16916 == iM17020 && iM16916 == iM30730) {
                if (!c6111.f20764.mo14804() && !c1590.f6433) {
                    if (this.f18661 && SystemClock.uptimeMillis() - this.f18652 > 4500) {
                        if (this.f18658 == c6111.f20764.m30747()) {
                            c6111.m16946(-1);
                            this.f18652 = SystemClock.uptimeMillis();
                        }
                    } else {
                        this.f18652 = 0L;
                    }
                }
            } else {
                c6111.m17056(c6111.m16916(), iM30730);
                c6111.f20708.setSelection(iM30730);
                c6111.m16770();
                this.f18652 = 0L;
            }
            if (!c6111.f20764.mo14804() && !c1590.f6433) {
                c6111.m16886(false);
            }
        } else if (iM16916 == iM17020 && iM30730 == iM16916) {
            if (this.f18661 && SystemClock.uptimeMillis() - this.f18652 > 4500) {
                if (this.f18658 == c6111.f20764.m30747()) {
                    c6111.m16946(-1);
                    this.f18652 = SystemClock.uptimeMillis();
                }
            } else {
                this.f18652 = 0L;
            }
        } else if (iM16916 > iM30730 || iM30730 > iM17020 || !c1590.f6402) {
            c6111.m17056(c6111.m16916(), iM30730);
            c6111.f20708.setSelection(iM30730);
            c6111.m16770();
            this.f18652 = 0L;
            if (!c6111.f20764.mo14804() && !c1590.f6433) {
                c6111.m16890(iM30730, false);
            }
        } else if (!z || resultReceiverC17961.m41792() != 2) {
            c6111.m16946(-1);
        } else {
            c6111.postDelayed(new Runnable() { // from class: l.ܰܳۖ
                @Override // java.lang.Runnable
                public final void run() {
                    c6111.m16946(-1);
                }
            }, 100L);
        }
        this.f18658 = c6111.f20764.m30747();
        c6111.f20844 = SystemClock.uptimeMillis();
        c6111.m16835();
        c6111.invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14966() {
        boolean z = this.f18644;
        this.f18653 = false;
        this.f18656 = false;
        this.f18646 = false;
        this.f18644 = false;
        this.f18651 = -1;
        this.f18657 = 0.0f;
        this.f18642 = 0.0f;
        this.f18663.f20766 = 0;
        if (z) {
            m14971(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14968(MotionEvent motionEvent) {
        m14972(motionEvent);
        float y = motionEvent.getY();
        C6111 c6111 = this.f18663;
        boolean z = c6111.f20766 == 0;
        float f = c6111.f20749;
        if (y < f) {
            c6111.f20766 = -C6111.m16701((int) (f - y));
            if (z) {
                c6111.f20849 = SystemClock.uptimeMillis();
            }
            c6111.postInvalidateOnAnimation();
        } else {
            float f2 = c6111.f20757;
            if (y > f2) {
                c6111.f20766 = C6111.m16701((int) (y - f2));
                if (z) {
                    c6111.f20849 = SystemClock.uptimeMillis();
                }
                c6111.postInvalidateOnAnimation();
            } else {
                c6111.f20766 = 0;
            }
        }
        float x = motionEvent.getX() - c6111.getPaddingLeft();
        float y2 = motionEvent.getY() - c6111.getPaddingTop();
        c6111.f20824 = x;
        c6111.f20755 = y2;
        m14967(x, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14967(float f, float f2) {
        C6111 c6111 = this.f18663;
        int iM30730 = c6111.f20764.m30730(c6111.getScrollX() + f, c6111.m17066() + f2);
        if (c6111.m16916() == this.f18651 && c6111.m17020() == iM30730) {
            return;
        }
        c6111.f20708.setSelection(this.f18651, iM30730);
        c6111.m16786(iM30730);
        c6111.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14969(ViewOnTouchListenerC5405 viewOnTouchListenerC5405) {
        C6111 c6111 = viewOnTouchListenerC5405.f18663;
        c6111.setPressed(false);
        c6111.m16808();
        viewOnTouchListenerC5405.m14966();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m14972(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C6111 c6111 = this.f18663;
        boolean z = x >= 0.0f && x <= ((float) c6111.getWidth()) && y >= 0.0f && y <= ((float) c6111.getHeight());
        if (z != c6111.isPressed()) {
            c6111.setPressed(z);
            c6111.invalidate();
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
    /* JADX WARN: Code duplicated, block: B:293:0x053b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0540  */
    /* JADX WARN: Code duplicated, block: B:296:0x0546  */
    /* JADX WARN: Code duplicated, block: B:298:0x054c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0556  */
    /* JADX WARN: Code duplicated, block: B:304:0x0562  */
    /* JADX WARN: Code duplicated, block: B:308:0x0576  */
    /* JADX WARN: Code duplicated, block: B:310:0x0582  */
    /* JADX WARN: Code duplicated, block: B:313:0x058d  */
    /* JADX WARN: Code duplicated, block: B:316:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:319:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:321:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:323:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0608  */
    /* JADX WARN: Code duplicated, block: B:330:0x0613  */
    /* JADX WARN: Code duplicated, block: B:332:0x0628  */
    /* JADX WARN: Code duplicated, block: B:336:0x0638  */
    /* JADX WARN: Code duplicated, block: B:338:0x0645  */
    /* JADX WARN: Code duplicated, block: B:340:0x0699  */
    /* JADX WARN: Code duplicated, block: B:342:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:344:0x0707  */
    /* JADX WARN: Code duplicated, block: B:346:0x0714  */
    /* JADX WARN: Code duplicated, block: B:350:0x0773  */
    /* JADX WARN: Code duplicated, block: B:358:0x0796  */
    /* JADX WARN: Code duplicated, block: B:359:0x0798  */
    /* JADX WARN: Code duplicated, block: B:362:0x07ac  */
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
        C2147 c2147M16816;
        int action;
        int iM16916;
        int iM17020;
        float fM30752;
        AbstractC12359 abstractC12359;
        AbstractC12359 abstractC123510;
        RectF rectF;
        RectF rectF2;
        float x;
        boolean z;
        RectF rectF3;
        C22398 c22398;
        C22398 c22399;
        int iM16917;
        int iM17021;
        final C6111 c6111;
        final InterfaceC10014 interfaceC10014;
        float x2;
        float y;
        float y2;
        boolean z2;
        float f;
        float f2;
        float fM17870;
        float paddingTop;
        float f3;
        int i;
        C6111 c6112;
        final C6111 c6113;
        final InterfaceC10014 interfaceC10015;
        C6111 c6114;
        int actionMasked;
        float x3;
        C2147 c2147;
        ViewTreeObserverOnPreDrawListenerC22758[] viewTreeObserverOnPreDrawListenerC22758Arr;
        int actionMasked2;
        C6111 c6115 = this.f18663;
        C1590 c1590 = c6115.f20794;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 0) {
            c6115.m16801();
            c6115.f20747 = null;
        }
        if (c6115.f20747 == null && c6115.m16809()) {
            c6115.f20747 = c6115.f20728;
        }
        if (c6115.f20747 == null) {
            int actionMasked4 = motionEvent.getActionMasked();
            if (actionMasked4 == 0) {
                c6115.m16699();
                if (!C6111.m16750(motionEvent) || (motionEvent.getButtonState() & 1) == 0) {
                    C6111.m16788(c6115);
                } else {
                    float x4 = (motionEvent.getX() + c6115.getScrollX()) - c6115.getPaddingLeft();
                    float fM30753 = c6115.f20764.m30752(motionEvent.getY());
                    AbstractC12359 abstractC123511 = c6115.f20764;
                    if (!abstractC123511.f41301 || !abstractC123511.f41318.m49671(x4, fM30753)) {
                        AbstractC12359 abstractC123512 = c6115.f20764;
                        if (!abstractC123512.f41319 || !abstractC123512.f41323.m49671(x4, fM30753)) {
                            C6111.m16788(c6115);
                        }
                    }
                }
            } else if (actionMasked4 == 3) {
                c6115.m16646();
            }
            if (!c6115.isFocused() && motionEvent.getActionMasked() == 1 && c6115.isPressed()) {
                c6115.requestFocus();
            }
            int i2 = 0;
            if (C6111.m16750(motionEvent)) {
                int actionMasked5 = motionEvent.getActionMasked();
                if (c6115.f20758) {
                    c6115.f20767 = true;
                    if (actionMasked5 == 0) {
                        c6115.setPressed(true);
                        return true;
                    }
                    if (actionMasked5 == 1 || actionMasked5 == 3) {
                        c6115.setPressed(false);
                        m14971(false);
                        c6115.m16808();
                        C6111.m16784(c6115);
                        return true;
                    }
                } else {
                    if (actionMasked5 == 0 && (motionEvent.getButtonState() & 2) != 0) {
                        C6111.m16726(c6115);
                        c6115.f20767 = true;
                        c6115.setPressed(true);
                        c6115.m16721(motionEvent);
                        return true;
                    }
                    if (this.f18656) {
                        actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 1) {
                            c6115.setPressed(false);
                            c6115.m16808();
                            m14966();
                            return true;
                        }
                        if (actionMasked2 != 2) {
                            m14968(motionEvent);
                            return true;
                        }
                        if (actionMasked2 == 3) {
                            c6115.setPressed(false);
                            c6115.m16808();
                            m14966();
                            return true;
                        }
                    }
                    c2147M16816 = c6115.m16816();
                    if (c2147M16816 != null) {
                        if (this.f18653) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m14966();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f18657;
                                    float y3 = motionEvent.getY() - this.f18642;
                                    if (Math.abs(x3) <= this.f18668) {
                                    }
                                    this.f18653 = false;
                                    this.f18656 = true;
                                    if (!c6115.isFocused()) {
                                        c6115.requestFocus();
                                    }
                                    if (!this.f18646) {
                                        c6115.m17056(c6115.m16916(), this.f18651);
                                        c6115.m16770();
                                        this.f18646 = true;
                                    }
                                    c6115.f20749 = Math.min(c1590.m17870() + c6115.getPaddingTop(), this.f18642);
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c1590.m17870(), this.f18642);
                                    c6115.f20766 = 0;
                                    c6115.f20844 = 0L;
                                    c2147 = c6115.f20731;
                                    if (c2147 != null) {
                                        c2147.m6701();
                                    }
                                    c6115.invalidate();
                                    m14971(true);
                                    this.f18644 = true;
                                    c6115.f20762.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m14968(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m14966();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c6115.setPressed(true);
                            c6115.m16915();
                            if (!c6115.isFocused()) {
                                c6115.invalidate();
                            }
                            this.f18654 = true;
                            if (c6115.mo17013()) {
                                m14971(true);
                            }
                            this.f18650 = false;
                            this.f18641 = 0;
                            this.f18659 = (c6115.getScrollX() + ((int) motionEvent.getX())) - c6115.getPaddingLeft();
                            this.f18664 = (c6115.m17066() + ((int) motionEvent.getY())) - c6115.getPaddingTop();
                            this.f18665 = false;
                            iM16916 = c6115.m16916();
                            iM17020 = c6115.m17020();
                            if (iM16916 > iM17020) {
                                iM17020 = iM16916;
                                iM16916 = iM17020;
                            }
                            fM30752 = c6115.f20764.m30752(motionEvent.getY());
                            abstractC12359 = c6115.f20764;
                            if (abstractC12359.f41301) {
                                c22399 = abstractC12359.f41318;
                                if (c22399.m49671(this.f18659, fM30752)) {
                                    c6115.f20752 = true;
                                    this.f18647 = c22399.f73107 - fM30752;
                                    if (!c6115.f20718.isFinished()) {
                                        c6115.f20718.abortAnimation();
                                    }
                                    m14971(true);
                                    c6115.invalidate();
                                    return true;
                                }
                            }
                            abstractC123510 = c6115.f20764;
                            if (abstractC123510.f41319) {
                                c22398 = abstractC123510.f41323;
                                if (c22398.m49671(this.f18659, fM30752)) {
                                    c6115.f20821 = true;
                                    this.f18643 = c22398.f73109 - this.f18659;
                                    if (!c6115.f20718.isFinished()) {
                                        c6115.f20718.abortAnimation();
                                    }
                                    m14971(true);
                                    c6115.invalidate();
                                    return true;
                                }
                            }
                            if (iM16916 == iM17020) {
                                rectF3 = c6115.f20764.f41310;
                                if (rectF3.contains(this.f18659, fM30752)) {
                                    c6115.f20756 = true;
                                    this.f18643 = ((rectF3.left + rectF3.right) / 2.0f) - this.f18659;
                                    this.f18647 = (rectF3.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            } else {
                                rectF = c6115.f20764.f41292;
                                if (rectF.contains(this.f18659, fM30752)) {
                                    rectF2 = c6115.f20764.f41299;
                                    if (rectF2.contains(this.f18659, fM30752)) {
                                        c6115.f20836 = true;
                                        c6115.f20832 = iM16916;
                                        float f4 = rectF2.left;
                                        this.f18643 = (((rectF2.right - f4) / 4.0f) + f4) - this.f18659;
                                        this.f18647 = (rectF2.top - fM30752) - (c1590.m17870() / 2.0f);
                                        c6115.f20805 = false;
                                        c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                        c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                        c6115.f20766 = 0;
                                        m14971(true);
                                        return true;
                                    }
                                } else {
                                    c6115.f20836 = true;
                                    c6115.f20832 = iM17020;
                                    float f5 = rectF.left;
                                    this.f18643 = ((((rectF.right - f5) * 3.0f) / 4.0f) + f5) - this.f18659;
                                    this.f18647 = (rectF.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20805 = true;
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            }
                            if (c1590.f6427) {
                                x = motionEvent.getX();
                                if (c6115.m16693(x, motionEvent.getY())) {
                                    z = !c6115.m16640((x + c6115.getScrollX()) - c6115.getPaddingLeft());
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    this.f18653 = true;
                                    this.f18656 = false;
                                    this.f18646 = false;
                                    this.f18651 = c6115.f20764.m30730(this.f18659, this.f18664);
                                    this.f18657 = motionEvent.getX();
                                    this.f18642 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c6115.setPressed(false);
                            m14971(false);
                            c6115.m16808();
                            if (this.f18650) {
                                m14974();
                                c6111 = c6115.f20736;
                                if (c6111 != null) {
                                    c6111.f20722.m14974();
                                    ((View) c6115.getParent()).invalidate();
                                    interfaceC10014 = c6115.f20815;
                                    if (interfaceC10014 != null) {
                                        C6111.m16661(c6115, new Runnable() { // from class: l.ۙܳۖ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f16592;
                                                final InterfaceC10014 interfaceC10016 = interfaceC10014;
                                                C6111.m16661(c6111, new Runnable() { // from class: l.ۨܳۖ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                        int scrollX = c6116.getScrollX();
                                                        int iM17066 = c6116.m17066();
                                                        interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c6115.f20756) {
                                }
                                c6115.m16790();
                                if (c6115.f20756) {
                                    c6115.m16946(-1);
                                } else if (!c6115.f20836) {
                                    iM16917 = c6115.m16916();
                                    iM17021 = c6115.m17020();
                                    if (iM16917 > iM17021) {
                                        iM17021 = iM16917;
                                        iM16917 = iM17021;
                                    }
                                    if (!c6115.f20805) {
                                        iM16917 = iM17021;
                                    }
                                    c6115.m16946(iM16917);
                                } else {
                                    iM16917 = c6115.m16916();
                                    iM17021 = c6115.m17020();
                                    if (iM16917 > iM17021) {
                                        iM17021 = iM16917;
                                        iM16917 = iM17021;
                                    }
                                    if (!c6115.f20805) {
                                        iM16917 = iM17021;
                                    }
                                    c6115.m16946(iM16917);
                                }
                                c6115.f20806 = false;
                                c6115.f20756 = false;
                                c6115.f20836 = false;
                                c6115.f20844 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m14972(motionEvent);
                                if (this.f18641 != 1) {
                                    if (c6115.f20836) {
                                        c6115.f20722.onScroll(null, null, (this.f18640 - motionEvent.getX(1)) - c6115.getPaddingLeft(), (this.f18660 - motionEvent.getY(1)) - c6115.getPaddingTop());
                                        this.f18640 = motionEvent.getX(1);
                                        this.f18660 = motionEvent.getY(1);
                                    } else if (this.f18650) {
                                        m14975(motionEvent);
                                        c6112 = c6115.f20736;
                                        if (c6112 != null) {
                                            c6112.f20722.m14975(motionEvent);
                                            ((View) c6115.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c6115.f20756) {
                                        x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                        y = motionEvent.getY() - c6115.getPaddingTop();
                                        if (!this.f18665) {
                                            i = (int) (x2 - this.f18659);
                                            int i3 = (int) (y - this.f18664);
                                            if (Math.abs(i) <= this.f18668) {
                                            }
                                            this.f18665 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c6115.f20766 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c6115.f20749;
                                        if (y2 < f) {
                                            c6115.f20766 = -C6111.m16701((int) (f - y2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c6115.f20757;
                                            if (y2 > f2) {
                                                c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                                if (z2) {
                                                    c6115.f20849 = SystemClock.uptimeMillis();
                                                }
                                                c6115.postInvalidateOnAnimation();
                                            } else {
                                                c6115.f20766 = 0;
                                            }
                                        }
                                        fM17870 = c1590.m17870() / 2.0f;
                                        paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                        if (c6115.f20806) {
                                            if (y < fM17870) {
                                                y = fM17870;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c6115.m16986(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f18647;
                                        if (f3 >= fM17870) {
                                            if (f3 > paddingTop) {
                                                fM17870 = paddingTop;
                                            } else {
                                                fM17870 = f3;
                                            }
                                        }
                                        if (c6115.f20756) {
                                            c6115.m16822(x2 + this.f18643, fM17870);
                                            return true;
                                        }
                                        c6115.m16961(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                    y = motionEvent.getY() - c6115.getPaddingTop();
                                    if (!this.f18665) {
                                        i = (int) (x2 - this.f18659);
                                        int i4 = (int) (y - this.f18664);
                                        if (Math.abs(i) <= this.f18668) {
                                        }
                                        this.f18665 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c6115.f20766 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c6115.f20749;
                                    if (y2 < f) {
                                        c6115.f20766 = -C6111.m16701((int) (f - y2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c6115.f20757;
                                        if (y2 > f2) {
                                            c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            c6115.f20766 = 0;
                                        }
                                    }
                                    fM17870 = c1590.m17870() / 2.0f;
                                    paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                    if (c6115.f20806) {
                                        if (y < fM17870) {
                                            y = fM17870;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c6115.m16986(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f18647;
                                    if (f3 >= fM17870) {
                                        if (f3 > paddingTop) {
                                            fM17870 = paddingTop;
                                        } else {
                                            fM17870 = f3;
                                        }
                                    }
                                    if (c6115.f20756) {
                                        c6115.m16822(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    c6115.m16961(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                if (!c6115.f20756) {
                                    x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                    y = motionEvent.getY() - c6115.getPaddingTop();
                                    if (!this.f18665) {
                                        i = (int) (x2 - this.f18659);
                                        int i5 = (int) (y - this.f18664);
                                        if (Math.abs(i) <= this.f18668) {
                                        }
                                        this.f18665 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c6115.f20766 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c6115.f20749;
                                    if (y2 < f) {
                                        c6115.f20766 = -C6111.m16701((int) (f - y2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c6115.f20757;
                                        if (y2 > f2) {
                                            c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            c6115.f20766 = 0;
                                        }
                                    }
                                    fM17870 = c1590.m17870() / 2.0f;
                                    paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                    if (c6115.f20806) {
                                        if (y < fM17870) {
                                            y = fM17870;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c6115.m16986(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f18647;
                                    if (f3 >= fM17870) {
                                        if (f3 > paddingTop) {
                                            fM17870 = paddingTop;
                                        } else {
                                            fM17870 = f3;
                                        }
                                    }
                                    if (c6115.f20756) {
                                        c6115.m16822(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    c6115.m16961(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                y = motionEvent.getY() - c6115.getPaddingTop();
                                if (!this.f18665) {
                                    i = (int) (x2 - this.f18659);
                                    int i6 = (int) (y - this.f18664);
                                    if (Math.abs(i) <= this.f18668) {
                                    }
                                    this.f18665 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c6115.f20766 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c6115.f20749;
                                if (y2 < f) {
                                    c6115.f20766 = -C6111.m16701((int) (f - y2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    f2 = c6115.f20757;
                                    if (y2 > f2) {
                                        c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        c6115.f20766 = 0;
                                    }
                                }
                                fM17870 = c1590.m17870() / 2.0f;
                                paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                if (c6115.f20806) {
                                    if (y < fM17870) {
                                        y = fM17870;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c6115.m16986(x2, y);
                                    return true;
                                }
                                f3 = y + this.f18647;
                                if (f3 >= fM17870) {
                                    if (f3 > paddingTop) {
                                        fM17870 = paddingTop;
                                    } else {
                                        fM17870 = f3;
                                    }
                                }
                                if (c6115.f20756) {
                                    c6115.m16822(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                c6115.m16961(x2 + this.f18643, fM17870);
                                return true;
                            }
                            if (action != 3) {
                                c6115.setPressed(false);
                                m14971(false);
                                c6115.m16808();
                                if (this.f18650) {
                                    m14974();
                                    c6113 = c6115.f20736;
                                    if (c6113 != null) {
                                        c6113.f20722.m14974();
                                        ((View) c6115.getParent()).invalidate();
                                        interfaceC10015 = c6115.f20815;
                                        if (interfaceC10015 != null) {
                                            C6111.m16661(c6115, new Runnable() { // from class: l.ۗ᩻ۖ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f13106;
                                                    final InterfaceC10014 interfaceC10016 = interfaceC10015;
                                                    C6111.m16661(c6113, new Runnable() { // from class: l.ۖܳۖ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                            int scrollX = c6116.getScrollX();
                                                            int iM17066 = c6116.m17066();
                                                            interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c6115.f20752) {
                                    }
                                    C6111.m16771(c6115);
                                    c6115.f20806 = false;
                                    c6115.f20756 = false;
                                    c6115.f20836 = false;
                                    c6115.f20821 = false;
                                    c6115.f20752 = false;
                                    c6115.m16790();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f18641++;
                                if (c6115.f20836) {
                                    this.f18655 = motionEvent.getPointerId(1);
                                    this.f18640 = motionEvent.getX(1);
                                    this.f18660 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c1590.f6429) {
                                    m14965(motionEvent);
                                    c6114 = c6115.f20736;
                                    if (c6114 != null) {
                                        c6114.f20722.m14965(motionEvent);
                                        ((View) c6115.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c6115.f20836) {
                                    c6115.f20836 = false;
                                }
                                this.f18641--;
                            }
                        }
                        return c6115.f20762.m26793(motionEvent);
                    }
                    viewTreeObserverOnPreDrawListenerC22758Arr = c2147M16816.f7815;
                    if (!viewTreeObserverOnPreDrawListenerC22758Arr[0].m50423()) {
                        if (this.f18653) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m14966();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f18657;
                                    float y4 = motionEvent.getY() - this.f18642;
                                    if (Math.abs(x3) <= this.f18668) {
                                    }
                                    this.f18653 = false;
                                    this.f18656 = true;
                                    if (!c6115.isFocused()) {
                                        c6115.requestFocus();
                                    }
                                    if (!this.f18646) {
                                        c6115.m17056(c6115.m16916(), this.f18651);
                                        c6115.m16770();
                                        this.f18646 = true;
                                    }
                                    c6115.f20749 = Math.min(c1590.m17870() + c6115.getPaddingTop(), this.f18642);
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c1590.m17870(), this.f18642);
                                    c6115.f20766 = 0;
                                    c6115.f20844 = 0L;
                                    c2147 = c6115.f20731;
                                    if (c2147 != null) {
                                        c2147.m6701();
                                    }
                                    c6115.invalidate();
                                    m14971(true);
                                    this.f18644 = true;
                                    c6115.f20762.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m14968(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m14966();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c6115.setPressed(true);
                            c6115.m16915();
                            if (!c6115.isFocused()) {
                                c6115.invalidate();
                            }
                            this.f18654 = true;
                            if (c6115.mo17013()) {
                                m14971(true);
                            }
                            this.f18650 = false;
                            this.f18641 = 0;
                            this.f18659 = (c6115.getScrollX() + ((int) motionEvent.getX())) - c6115.getPaddingLeft();
                            this.f18664 = (c6115.m17066() + ((int) motionEvent.getY())) - c6115.getPaddingTop();
                            this.f18665 = false;
                            iM16916 = c6115.m16916();
                            iM17020 = c6115.m17020();
                            if (iM16916 > iM17020) {
                                iM17020 = iM16916;
                                iM16916 = iM17020;
                            }
                            fM30752 = c6115.f20764.m30752(motionEvent.getY());
                            abstractC12359 = c6115.f20764;
                            if (abstractC12359.f41301) {
                                c22399 = abstractC12359.f41318;
                                if (c22399.m49671(this.f18659, fM30752)) {
                                    c6115.f20752 = true;
                                    this.f18647 = c22399.f73107 - fM30752;
                                    if (!c6115.f20718.isFinished()) {
                                        c6115.f20718.abortAnimation();
                                    }
                                    m14971(true);
                                    c6115.invalidate();
                                    return true;
                                }
                            }
                            abstractC123510 = c6115.f20764;
                            if (abstractC123510.f41319) {
                                c22398 = abstractC123510.f41323;
                                if (c22398.m49671(this.f18659, fM30752)) {
                                    c6115.f20821 = true;
                                    this.f18643 = c22398.f73109 - this.f18659;
                                    if (!c6115.f20718.isFinished()) {
                                        c6115.f20718.abortAnimation();
                                    }
                                    m14971(true);
                                    c6115.invalidate();
                                    return true;
                                }
                            }
                            if (iM16916 == iM17020) {
                                rectF3 = c6115.f20764.f41310;
                                if (rectF3.contains(this.f18659, fM30752)) {
                                    c6115.f20756 = true;
                                    this.f18643 = ((rectF3.left + rectF3.right) / 2.0f) - this.f18659;
                                    this.f18647 = (rectF3.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            } else {
                                rectF = c6115.f20764.f41292;
                                if (rectF.contains(this.f18659, fM30752)) {
                                    rectF2 = c6115.f20764.f41299;
                                    if (rectF2.contains(this.f18659, fM30752)) {
                                        c6115.f20836 = true;
                                        c6115.f20832 = iM16916;
                                        float f6 = rectF2.left;
                                        this.f18643 = (((rectF2.right - f6) / 4.0f) + f6) - this.f18659;
                                        this.f18647 = (rectF2.top - fM30752) - (c1590.m17870() / 2.0f);
                                        c6115.f20805 = false;
                                        c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                        c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                        c6115.f20766 = 0;
                                        m14971(true);
                                        return true;
                                    }
                                } else {
                                    c6115.f20836 = true;
                                    c6115.f20832 = iM17020;
                                    float f7 = rectF.left;
                                    this.f18643 = ((((rectF.right - f7) * 3.0f) / 4.0f) + f7) - this.f18659;
                                    this.f18647 = (rectF.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20805 = true;
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            }
                            if (c1590.f6427) {
                                x = motionEvent.getX();
                                if (c6115.m16693(x, motionEvent.getY())) {
                                    z = false;
                                } else {
                                    z = !c6115.m16640((x + c6115.getScrollX()) - c6115.getPaddingLeft());
                                }
                                if (z) {
                                    this.f18653 = true;
                                    this.f18656 = false;
                                    this.f18646 = false;
                                    this.f18651 = c6115.f20764.m30730(this.f18659, this.f18664);
                                    this.f18657 = motionEvent.getX();
                                    this.f18642 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c6115.setPressed(false);
                            m14971(false);
                            c6115.m16808();
                            if (this.f18650) {
                                m14974();
                                c6111 = c6115.f20736;
                                if (c6111 != null) {
                                    c6111.f20722.m14974();
                                    ((View) c6115.getParent()).invalidate();
                                    interfaceC10014 = c6115.f20815;
                                    if (interfaceC10014 != null) {
                                        C6111.m16661(c6115, new Runnable() { // from class: l.ۙܳۖ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f16592;
                                                final InterfaceC10014 interfaceC10016 = interfaceC10014;
                                                C6111.m16661(c6111, new Runnable() { // from class: l.ۨܳۖ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                        int scrollX = c6116.getScrollX();
                                                        int iM17066 = c6116.m17066();
                                                        interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c6115.f20756) {
                                }
                                c6115.m16790();
                                if (c6115.f20756) {
                                    c6115.m16946(-1);
                                } else if (!c6115.f20836) {
                                    iM16917 = c6115.m16916();
                                    iM17021 = c6115.m17020();
                                    if (iM16917 > iM17021) {
                                        iM17021 = iM16917;
                                        iM16917 = iM17021;
                                    }
                                    if (!c6115.f20805) {
                                        iM16917 = iM17021;
                                    }
                                    c6115.m16946(iM16917);
                                } else {
                                    iM16917 = c6115.m16916();
                                    iM17021 = c6115.m17020();
                                    if (iM16917 > iM17021) {
                                        iM17021 = iM16917;
                                        iM16917 = iM17021;
                                    }
                                    if (!c6115.f20805) {
                                        iM16917 = iM17021;
                                    }
                                    c6115.m16946(iM16917);
                                }
                                c6115.f20806 = false;
                                c6115.f20756 = false;
                                c6115.f20836 = false;
                                c6115.f20844 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m14972(motionEvent);
                                if (this.f18641 != 1) {
                                    if (c6115.f20836) {
                                        c6115.f20722.onScroll(null, null, (this.f18640 - motionEvent.getX(1)) - c6115.getPaddingLeft(), (this.f18660 - motionEvent.getY(1)) - c6115.getPaddingTop());
                                        this.f18640 = motionEvent.getX(1);
                                        this.f18660 = motionEvent.getY(1);
                                    } else if (this.f18650) {
                                        m14975(motionEvent);
                                        c6112 = c6115.f20736;
                                        if (c6112 != null) {
                                            c6112.f20722.m14975(motionEvent);
                                            ((View) c6115.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c6115.f20756) {
                                        x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                        y = motionEvent.getY() - c6115.getPaddingTop();
                                        if (!this.f18665) {
                                            i = (int) (x2 - this.f18659);
                                            int i7 = (int) (y - this.f18664);
                                            if (Math.abs(i) <= this.f18668) {
                                            }
                                            this.f18665 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c6115.f20766 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c6115.f20749;
                                        if (y2 < f) {
                                            c6115.f20766 = -C6111.m16701((int) (f - y2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c6115.f20757;
                                            if (y2 > f2) {
                                                c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                                if (z2) {
                                                    c6115.f20849 = SystemClock.uptimeMillis();
                                                }
                                                c6115.postInvalidateOnAnimation();
                                            } else {
                                                c6115.f20766 = 0;
                                            }
                                        }
                                        fM17870 = c1590.m17870() / 2.0f;
                                        paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                        if (c6115.f20806) {
                                            if (y < fM17870) {
                                                y = fM17870;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c6115.m16986(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f18647;
                                        if (f3 >= fM17870) {
                                            if (f3 > paddingTop) {
                                                fM17870 = paddingTop;
                                            } else {
                                                fM17870 = f3;
                                            }
                                        }
                                        if (c6115.f20756) {
                                            c6115.m16822(x2 + this.f18643, fM17870);
                                            return true;
                                        }
                                        c6115.m16961(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                    y = motionEvent.getY() - c6115.getPaddingTop();
                                    if (!this.f18665) {
                                        i = (int) (x2 - this.f18659);
                                        int i8 = (int) (y - this.f18664);
                                        if (Math.abs(i) <= this.f18668) {
                                        }
                                        this.f18665 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c6115.f20766 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c6115.f20749;
                                    if (y2 < f) {
                                        c6115.f20766 = -C6111.m16701((int) (f - y2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c6115.f20757;
                                        if (y2 > f2) {
                                            c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            c6115.f20766 = 0;
                                        }
                                    }
                                    fM17870 = c1590.m17870() / 2.0f;
                                    paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                    if (c6115.f20806) {
                                        if (y < fM17870) {
                                            y = fM17870;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c6115.m16986(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f18647;
                                    if (f3 >= fM17870) {
                                        if (f3 > paddingTop) {
                                            fM17870 = paddingTop;
                                        } else {
                                            fM17870 = f3;
                                        }
                                    }
                                    if (c6115.f20756) {
                                        c6115.m16822(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    c6115.m16961(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                if (!c6115.f20756) {
                                    x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                    y = motionEvent.getY() - c6115.getPaddingTop();
                                    if (!this.f18665) {
                                        i = (int) (x2 - this.f18659);
                                        int i9 = (int) (y - this.f18664);
                                        if (Math.abs(i) <= this.f18668) {
                                        }
                                        this.f18665 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c6115.f20766 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c6115.f20749;
                                    if (y2 < f) {
                                        c6115.f20766 = -C6111.m16701((int) (f - y2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c6115.f20757;
                                        if (y2 > f2) {
                                            c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            c6115.f20766 = 0;
                                        }
                                    }
                                    fM17870 = c1590.m17870() / 2.0f;
                                    paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                    if (c6115.f20806) {
                                        if (y < fM17870) {
                                            y = fM17870;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c6115.m16986(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f18647;
                                    if (f3 >= fM17870) {
                                        if (f3 > paddingTop) {
                                            fM17870 = paddingTop;
                                        } else {
                                            fM17870 = f3;
                                        }
                                    }
                                    if (c6115.f20756) {
                                        c6115.m16822(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    c6115.m16961(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                y = motionEvent.getY() - c6115.getPaddingTop();
                                if (!this.f18665) {
                                    i = (int) (x2 - this.f18659);
                                    int i10 = (int) (y - this.f18664);
                                    if (Math.abs(i) <= this.f18668) {
                                    }
                                    this.f18665 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c6115.f20766 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c6115.f20749;
                                if (y2 < f) {
                                    c6115.f20766 = -C6111.m16701((int) (f - y2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    f2 = c6115.f20757;
                                    if (y2 > f2) {
                                        c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        c6115.f20766 = 0;
                                    }
                                }
                                fM17870 = c1590.m17870() / 2.0f;
                                paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                if (c6115.f20806) {
                                    if (y < fM17870) {
                                        y = fM17870;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c6115.m16986(x2, y);
                                    return true;
                                }
                                f3 = y + this.f18647;
                                if (f3 >= fM17870) {
                                    if (f3 > paddingTop) {
                                        fM17870 = paddingTop;
                                    } else {
                                        fM17870 = f3;
                                    }
                                }
                                if (c6115.f20756) {
                                    c6115.m16822(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                c6115.m16961(x2 + this.f18643, fM17870);
                                return true;
                            }
                            if (action != 3) {
                                c6115.setPressed(false);
                                m14971(false);
                                c6115.m16808();
                                if (this.f18650) {
                                    m14974();
                                    c6113 = c6115.f20736;
                                    if (c6113 != null) {
                                        c6113.f20722.m14974();
                                        ((View) c6115.getParent()).invalidate();
                                        interfaceC10015 = c6115.f20815;
                                        if (interfaceC10015 != null) {
                                            C6111.m16661(c6115, new Runnable() { // from class: l.ۗ᩻ۖ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f13106;
                                                    final InterfaceC10014 interfaceC10016 = interfaceC10015;
                                                    C6111.m16661(c6113, new Runnable() { // from class: l.ۖܳۖ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                            int scrollX = c6116.getScrollX();
                                                            int iM17066 = c6116.m17066();
                                                            interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c6115.f20752) {
                                    }
                                    C6111.m16771(c6115);
                                    c6115.f20806 = false;
                                    c6115.f20756 = false;
                                    c6115.f20836 = false;
                                    c6115.f20821 = false;
                                    c6115.f20752 = false;
                                    c6115.m16790();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f18641++;
                                if (c6115.f20836) {
                                    this.f18655 = motionEvent.getPointerId(1);
                                    this.f18640 = motionEvent.getX(1);
                                    this.f18660 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c1590.f6429) {
                                    m14965(motionEvent);
                                    c6114 = c6115.f20736;
                                    if (c6114 != null) {
                                        c6114.f20722.m14965(motionEvent);
                                        ((View) c6115.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action3 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c6115.f20836) {
                                    c6115.f20836 = false;
                                }
                                this.f18641--;
                            }
                        }
                        return c6115.f20762.m26793(motionEvent);
                    }
                }
            } else {
                if (this.f18656) {
                    actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 != 1) {
                        c6115.setPressed(false);
                        c6115.m16808();
                        m14966();
                        return true;
                    }
                    if (actionMasked2 != 2) {
                        m14968(motionEvent);
                        return true;
                    }
                    if (actionMasked2 == 3) {
                        c6115.setPressed(false);
                        c6115.m16808();
                        m14966();
                        return true;
                    }
                }
                c2147M16816 = c6115.m16816();
                if (c2147M16816 != null) {
                    if (this.f18653) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m14966();
                        } else {
                            if (actionMasked != 2) {
                                x3 = motionEvent.getX() - this.f18657;
                                float y5 = motionEvent.getY() - this.f18642;
                                if (Math.abs(x3) <= this.f18668) {
                                }
                                this.f18653 = false;
                                this.f18656 = true;
                                if (!c6115.isFocused()) {
                                    c6115.requestFocus();
                                }
                                if (!this.f18646) {
                                    c6115.m17056(c6115.m16916(), this.f18651);
                                    c6115.m16770();
                                    this.f18646 = true;
                                }
                                c6115.f20749 = Math.min(c1590.m17870() + c6115.getPaddingTop(), this.f18642);
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c1590.m17870(), this.f18642);
                                c6115.f20766 = 0;
                                c6115.f20844 = 0L;
                                c2147 = c6115.f20731;
                                if (c2147 != null) {
                                    c2147.m6701();
                                }
                                c6115.invalidate();
                                m14971(true);
                                this.f18644 = true;
                                c6115.f20762.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m14968(motionEvent);
                                return true;
                            }
                            if (actionMasked == 3) {
                                m14966();
                            }
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c6115.setPressed(true);
                        c6115.m16915();
                        if (!c6115.isFocused()) {
                            c6115.invalidate();
                        }
                        this.f18654 = true;
                        if (c6115.mo17013()) {
                            m14971(true);
                        }
                        this.f18650 = false;
                        this.f18641 = 0;
                        this.f18659 = (c6115.getScrollX() + ((int) motionEvent.getX())) - c6115.getPaddingLeft();
                        this.f18664 = (c6115.m17066() + ((int) motionEvent.getY())) - c6115.getPaddingTop();
                        this.f18665 = false;
                        iM16916 = c6115.m16916();
                        iM17020 = c6115.m17020();
                        if (iM16916 > iM17020) {
                            iM17020 = iM16916;
                            iM16916 = iM17020;
                        }
                        fM30752 = c6115.f20764.m30752(motionEvent.getY());
                        abstractC12359 = c6115.f20764;
                        if (abstractC12359.f41301) {
                            c22399 = abstractC12359.f41318;
                            if (c22399.m49671(this.f18659, fM30752)) {
                                c6115.f20752 = true;
                                this.f18647 = c22399.f73107 - fM30752;
                                if (!c6115.f20718.isFinished()) {
                                    c6115.f20718.abortAnimation();
                                }
                                m14971(true);
                                c6115.invalidate();
                                return true;
                            }
                        }
                        abstractC123510 = c6115.f20764;
                        if (abstractC123510.f41319) {
                            c22398 = abstractC123510.f41323;
                            if (c22398.m49671(this.f18659, fM30752)) {
                                c6115.f20821 = true;
                                this.f18643 = c22398.f73109 - this.f18659;
                                if (!c6115.f20718.isFinished()) {
                                    c6115.f20718.abortAnimation();
                                }
                                m14971(true);
                                c6115.invalidate();
                                return true;
                            }
                        }
                        if (iM16916 == iM17020) {
                            rectF3 = c6115.f20764.f41310;
                            if (rectF3.contains(this.f18659, fM30752)) {
                                c6115.f20756 = true;
                                this.f18643 = ((rectF3.left + rectF3.right) / 2.0f) - this.f18659;
                                this.f18647 = (rectF3.top - fM30752) - (c1590.m17870() / 2.0f);
                                c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                c6115.f20766 = 0;
                                m14971(true);
                                return true;
                            }
                        } else {
                            rectF = c6115.f20764.f41292;
                            if (rectF.contains(this.f18659, fM30752)) {
                                rectF2 = c6115.f20764.f41299;
                                if (rectF2.contains(this.f18659, fM30752)) {
                                    c6115.f20836 = true;
                                    c6115.f20832 = iM16916;
                                    float f8 = rectF2.left;
                                    this.f18643 = (((rectF2.right - f8) / 4.0f) + f8) - this.f18659;
                                    this.f18647 = (rectF2.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20805 = false;
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            } else {
                                c6115.f20836 = true;
                                c6115.f20832 = iM17020;
                                float f9 = rectF.left;
                                this.f18643 = ((((rectF.right - f9) * 3.0f) / 4.0f) + f9) - this.f18659;
                                this.f18647 = (rectF.top - fM30752) - (c1590.m17870() / 2.0f);
                                c6115.f20805 = true;
                                c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                c6115.f20766 = 0;
                                m14971(true);
                                return true;
                            }
                        }
                        if (c1590.f6427) {
                            x = motionEvent.getX();
                            if (c6115.m16693(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c6115.m16640((x + c6115.getScrollX()) - c6115.getPaddingLeft());
                            }
                            if (z) {
                                this.f18653 = true;
                                this.f18656 = false;
                                this.f18646 = false;
                                this.f18651 = c6115.f20764.m30730(this.f18659, this.f18664);
                                this.f18657 = motionEvent.getX();
                                this.f18642 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c6115.setPressed(false);
                        m14971(false);
                        c6115.m16808();
                        if (this.f18650) {
                            m14974();
                            c6111 = c6115.f20736;
                            if (c6111 != null) {
                                c6111.f20722.m14974();
                                ((View) c6115.getParent()).invalidate();
                                interfaceC10014 = c6115.f20815;
                                if (interfaceC10014 != null) {
                                    C6111.m16661(c6115, new Runnable() { // from class: l.ۙܳۖ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f16592;
                                            final InterfaceC10014 interfaceC10016 = interfaceC10014;
                                            C6111.m16661(c6111, new Runnable() { // from class: l.ۨܳۖ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                    int scrollX = c6116.getScrollX();
                                                    int iM17066 = c6116.m17066();
                                                    interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c6115.f20756) {
                            }
                            c6115.m16790();
                            if (c6115.f20756) {
                                c6115.m16946(-1);
                            } else if (!c6115.f20836) {
                                iM16917 = c6115.m16916();
                                iM17021 = c6115.m17020();
                                if (iM16917 > iM17021) {
                                    iM17021 = iM16917;
                                    iM16917 = iM17021;
                                }
                                if (!c6115.f20805) {
                                    iM16917 = iM17021;
                                }
                                c6115.m16946(iM16917);
                            } else {
                                iM16917 = c6115.m16916();
                                iM17021 = c6115.m17020();
                                if (iM16917 > iM17021) {
                                    iM17021 = iM16917;
                                    iM16917 = iM17021;
                                }
                                if (!c6115.f20805) {
                                    iM16917 = iM17021;
                                }
                                c6115.m16946(iM16917);
                            }
                            c6115.f20806 = false;
                            c6115.f20756 = false;
                            c6115.f20836 = false;
                            c6115.f20844 = SystemClock.uptimeMillis();
                            return true;
                        }
                    } else {
                        if (action != 2) {
                            m14972(motionEvent);
                            if (this.f18641 != 1) {
                                if (c6115.f20836) {
                                    c6115.f20722.onScroll(null, null, (this.f18640 - motionEvent.getX(1)) - c6115.getPaddingLeft(), (this.f18660 - motionEvent.getY(1)) - c6115.getPaddingTop());
                                    this.f18640 = motionEvent.getX(1);
                                    this.f18660 = motionEvent.getY(1);
                                } else if (this.f18650) {
                                    m14975(motionEvent);
                                    c6112 = c6115.f20736;
                                    if (c6112 != null) {
                                        c6112.f20722.m14975(motionEvent);
                                        ((View) c6115.getParent()).invalidate();
                                        return true;
                                    }
                                }
                                if (!c6115.f20756) {
                                    x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                    y = motionEvent.getY() - c6115.getPaddingTop();
                                    if (!this.f18665) {
                                        i = (int) (x2 - this.f18659);
                                        int i11 = (int) (y - this.f18664);
                                        if (Math.abs(i) <= this.f18668) {
                                        }
                                        this.f18665 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c6115.f20766 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c6115.f20749;
                                    if (y2 < f) {
                                        c6115.f20766 = -C6111.m16701((int) (f - y2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c6115.f20757;
                                        if (y2 > f2) {
                                            c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                            if (z2) {
                                                c6115.f20849 = SystemClock.uptimeMillis();
                                            }
                                            c6115.postInvalidateOnAnimation();
                                        } else {
                                            c6115.f20766 = 0;
                                        }
                                    }
                                    fM17870 = c1590.m17870() / 2.0f;
                                    paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                    if (c6115.f20806) {
                                        if (y < fM17870) {
                                            y = fM17870;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c6115.m16986(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f18647;
                                    if (f3 >= fM17870) {
                                        if (f3 > paddingTop) {
                                            fM17870 = paddingTop;
                                        } else {
                                            fM17870 = f3;
                                        }
                                    }
                                    if (c6115.f20756) {
                                        c6115.m16822(x2 + this.f18643, fM17870);
                                        return true;
                                    }
                                    c6115.m16961(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                y = motionEvent.getY() - c6115.getPaddingTop();
                                if (!this.f18665) {
                                    i = (int) (x2 - this.f18659);
                                    int i12 = (int) (y - this.f18664);
                                    if (Math.abs(i) <= this.f18668) {
                                    }
                                    this.f18665 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c6115.f20766 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c6115.f20749;
                                if (y2 < f) {
                                    c6115.f20766 = -C6111.m16701((int) (f - y2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    f2 = c6115.f20757;
                                    if (y2 > f2) {
                                        c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        c6115.f20766 = 0;
                                    }
                                }
                                fM17870 = c1590.m17870() / 2.0f;
                                paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                if (c6115.f20806) {
                                    if (y < fM17870) {
                                        y = fM17870;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c6115.m16986(x2, y);
                                    return true;
                                }
                                f3 = y + this.f18647;
                                if (f3 >= fM17870) {
                                    if (f3 > paddingTop) {
                                        fM17870 = paddingTop;
                                    } else {
                                        fM17870 = f3;
                                    }
                                }
                                if (c6115.f20756) {
                                    c6115.m16822(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                c6115.m16961(x2 + this.f18643, fM17870);
                                return true;
                            }
                            if (!c6115.f20756) {
                                x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                y = motionEvent.getY() - c6115.getPaddingTop();
                                if (!this.f18665) {
                                    i = (int) (x2 - this.f18659);
                                    int i13 = (int) (y - this.f18664);
                                    if (Math.abs(i) <= this.f18668) {
                                    }
                                    this.f18665 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c6115.f20766 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c6115.f20749;
                                if (y2 < f) {
                                    c6115.f20766 = -C6111.m16701((int) (f - y2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    f2 = c6115.f20757;
                                    if (y2 > f2) {
                                        c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        c6115.f20766 = 0;
                                    }
                                }
                                fM17870 = c1590.m17870() / 2.0f;
                                paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                if (c6115.f20806) {
                                    if (y < fM17870) {
                                        y = fM17870;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c6115.m16986(x2, y);
                                    return true;
                                }
                                f3 = y + this.f18647;
                                if (f3 >= fM17870) {
                                    if (f3 > paddingTop) {
                                        fM17870 = paddingTop;
                                    } else {
                                        fM17870 = f3;
                                    }
                                }
                                if (c6115.f20756) {
                                    c6115.m16822(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                c6115.m16961(x2 + this.f18643, fM17870);
                                return true;
                            }
                            x2 = motionEvent.getX() - c6115.getPaddingLeft();
                            y = motionEvent.getY() - c6115.getPaddingTop();
                            if (!this.f18665) {
                                i = (int) (x2 - this.f18659);
                                int i14 = (int) (y - this.f18664);
                                if (Math.abs(i) <= this.f18668) {
                                }
                                this.f18665 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c6115.f20766 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c6115.f20749;
                            if (y2 < f) {
                                c6115.f20766 = -C6111.m16701((int) (f - y2));
                                if (z2) {
                                    c6115.f20849 = SystemClock.uptimeMillis();
                                }
                                c6115.postInvalidateOnAnimation();
                            } else {
                                f2 = c6115.f20757;
                                if (y2 > f2) {
                                    c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    c6115.f20766 = 0;
                                }
                            }
                            fM17870 = c1590.m17870() / 2.0f;
                            paddingTop = c6115.f20757 - c6115.getPaddingTop();
                            if (c6115.f20806) {
                                if (y < fM17870) {
                                    y = fM17870;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c6115.m16986(x2, y);
                                return true;
                            }
                            f3 = y + this.f18647;
                            if (f3 >= fM17870) {
                                if (f3 > paddingTop) {
                                    fM17870 = paddingTop;
                                } else {
                                    fM17870 = f3;
                                }
                            }
                            if (c6115.f20756) {
                                c6115.m16822(x2 + this.f18643, fM17870);
                                return true;
                            }
                            c6115.m16961(x2 + this.f18643, fM17870);
                            return true;
                        }
                        if (action != 3) {
                            c6115.setPressed(false);
                            m14971(false);
                            c6115.m16808();
                            if (this.f18650) {
                                m14974();
                                c6113 = c6115.f20736;
                                if (c6113 != null) {
                                    c6113.f20722.m14974();
                                    ((View) c6115.getParent()).invalidate();
                                    interfaceC10015 = c6115.f20815;
                                    if (interfaceC10015 != null) {
                                        C6111.m16661(c6115, new Runnable() { // from class: l.ۗ᩻ۖ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f13106;
                                                final InterfaceC10014 interfaceC10016 = interfaceC10015;
                                                C6111.m16661(c6113, new Runnable() { // from class: l.ۖܳۖ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                        int scrollX = c6116.getScrollX();
                                                        int iM17066 = c6116.m17066();
                                                        interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c6115.f20752) {
                                }
                                C6111.m16771(c6115);
                                c6115.f20806 = false;
                                c6115.f20756 = false;
                                c6115.f20836 = false;
                                c6115.f20821 = false;
                                c6115.f20752 = false;
                                c6115.m16790();
                                return true;
                            }
                        } else if (action != 5) {
                            this.f18641++;
                            if (c6115.f20836) {
                                this.f18655 = motionEvent.getPointerId(1);
                                this.f18640 = motionEvent.getX(1);
                                this.f18660 = motionEvent.getY(1);
                                return true;
                            }
                            if (c1590.f6429) {
                                m14965(motionEvent);
                                c6114 = c6115.f20736;
                                if (c6114 != null) {
                                    c6114.f20722.m14965(motionEvent);
                                    ((View) c6115.getParent()).invalidate();
                                }
                            }
                        } else if (action == 6) {
                            int action4 = (motionEvent.getAction() & 65280) >>> 8;
                            if (c6115.f20836) {
                                c6115.f20836 = false;
                            }
                            this.f18641--;
                        }
                    }
                    return c6115.f20762.m26793(motionEvent);
                }
                viewTreeObserverOnPreDrawListenerC22758Arr = c2147M16816.f7815;
                if (!viewTreeObserverOnPreDrawListenerC22758Arr[0].m50423() && !viewTreeObserverOnPreDrawListenerC22758Arr[1].m50423() && !viewTreeObserverOnPreDrawListenerC22758Arr[2].m50423()) {
                    if (this.f18653) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m14966();
                        } else if (actionMasked != 2) {
                            x3 = motionEvent.getX() - this.f18657;
                            float y6 = motionEvent.getY() - this.f18642;
                            if (Math.abs(x3) <= this.f18668 || Math.abs(y6) > this.f18668) {
                                this.f18653 = false;
                                this.f18656 = true;
                                if (!c6115.isFocused()) {
                                    c6115.requestFocus();
                                }
                                if (!this.f18646) {
                                    c6115.m17056(c6115.m16916(), this.f18651);
                                    c6115.m16770();
                                    this.f18646 = true;
                                }
                                c6115.f20749 = Math.min(c1590.m17870() + c6115.getPaddingTop(), this.f18642);
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c1590.m17870(), this.f18642);
                                c6115.f20766 = 0;
                                c6115.f20844 = 0L;
                                c2147 = c6115.f20731;
                                if (c2147 != null) {
                                    c2147.m6701();
                                }
                                c6115.invalidate();
                                m14971(true);
                                this.f18644 = true;
                                c6115.f20762.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m14968(motionEvent);
                                return true;
                            }
                        } else if (actionMasked == 3) {
                            m14966();
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c6115.setPressed(true);
                        c6115.m16915();
                        if (!c6115.isFocused()) {
                            c6115.invalidate();
                        }
                        this.f18654 = true;
                        if (c6115.mo17013()) {
                            m14971(true);
                        }
                        this.f18650 = false;
                        this.f18641 = 0;
                        this.f18659 = (c6115.getScrollX() + ((int) motionEvent.getX())) - c6115.getPaddingLeft();
                        this.f18664 = (c6115.m17066() + ((int) motionEvent.getY())) - c6115.getPaddingTop();
                        this.f18665 = false;
                        iM16916 = c6115.m16916();
                        iM17020 = c6115.m17020();
                        if (iM16916 > iM17020) {
                            iM17020 = iM16916;
                            iM16916 = iM17020;
                        }
                        fM30752 = c6115.f20764.m30752(motionEvent.getY());
                        abstractC12359 = c6115.f20764;
                        if (abstractC12359.f41301) {
                            c22399 = abstractC12359.f41318;
                            if (c22399.m49671(this.f18659, fM30752)) {
                                c6115.f20752 = true;
                                this.f18647 = c22399.f73107 - fM30752;
                                if (!c6115.f20718.isFinished()) {
                                    c6115.f20718.abortAnimation();
                                }
                                m14971(true);
                                c6115.invalidate();
                                return true;
                            }
                        }
                        abstractC123510 = c6115.f20764;
                        if (abstractC123510.f41319) {
                            c22398 = abstractC123510.f41323;
                            if (c22398.m49671(this.f18659, fM30752)) {
                                c6115.f20821 = true;
                                this.f18643 = c22398.f73109 - this.f18659;
                                if (!c6115.f20718.isFinished()) {
                                    c6115.f20718.abortAnimation();
                                }
                                m14971(true);
                                c6115.invalidate();
                                return true;
                            }
                        }
                        if (iM16916 == iM17020) {
                            rectF3 = c6115.f20764.f41310;
                            if (rectF3.contains(this.f18659, fM30752)) {
                                c6115.f20756 = true;
                                this.f18643 = ((rectF3.left + rectF3.right) / 2.0f) - this.f18659;
                                this.f18647 = (rectF3.top - fM30752) - (c1590.m17870() / 2.0f);
                                c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                c6115.f20766 = 0;
                                m14971(true);
                                return true;
                            }
                        } else {
                            rectF = c6115.f20764.f41292;
                            if (rectF.contains(this.f18659, fM30752)) {
                                rectF2 = c6115.f20764.f41299;
                                if (rectF2.contains(this.f18659, fM30752)) {
                                    c6115.f20836 = true;
                                    c6115.f20832 = iM16916;
                                    float f10 = rectF2.left;
                                    this.f18643 = (((rectF2.right - f10) / 4.0f) + f10) - this.f18659;
                                    this.f18647 = (rectF2.top - fM30752) - (c1590.m17870() / 2.0f);
                                    c6115.f20805 = false;
                                    c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                    c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                    c6115.f20766 = 0;
                                    m14971(true);
                                    return true;
                                }
                            } else {
                                c6115.f20836 = true;
                                c6115.f20832 = iM17020;
                                float f11 = rectF.left;
                                this.f18643 = ((((rectF.right - f11) * 3.0f) / 4.0f) + f11) - this.f18659;
                                this.f18647 = (rectF.top - fM30752) - (c1590.m17870() / 2.0f);
                                c6115.f20805 = true;
                                c6115.f20749 = Math.min(c1590.m17870() + (c6115.m17062() / 2.0f) + c6115.getPaddingTop(), motionEvent.getY());
                                c6115.f20757 = Math.max((c6115.getHeight() - c6115.getPaddingBottom()) - c6115.m17062(), motionEvent.getY());
                                c6115.f20766 = 0;
                                m14971(true);
                                return true;
                            }
                        }
                        if (c1590.f6427 && C6111.m16750(motionEvent) && (motionEvent.getButtonState() & 1) != 0 && !c6115.f20764.mo14804()) {
                            x = motionEvent.getX();
                            if (c6115.m16693(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c6115.m16640((x + c6115.getScrollX()) - c6115.getPaddingLeft());
                            }
                            if (z) {
                                this.f18653 = true;
                                this.f18656 = false;
                                this.f18646 = false;
                                this.f18651 = c6115.f20764.m30730(this.f18659, this.f18664);
                                this.f18657 = motionEvent.getX();
                                this.f18642 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c6115.setPressed(false);
                        m14971(false);
                        c6115.m16808();
                        if (this.f18650) {
                            m14974();
                            c6111 = c6115.f20736;
                            if (c6111 != null) {
                                c6111.f20722.m14974();
                                ((View) c6115.getParent()).invalidate();
                                interfaceC10014 = c6115.f20815;
                                if (interfaceC10014 != null) {
                                    C6111.m16661(c6115, new Runnable() { // from class: l.ۙܳۖ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f16592;
                                            final InterfaceC10014 interfaceC10016 = interfaceC10014;
                                            C6111.m16661(c6111, new Runnable() { // from class: l.ۨܳۖ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                    int scrollX = c6116.getScrollX();
                                                    int iM17066 = c6116.m17066();
                                                    interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c6115.f20756 || c6115.f20836 || c6115.f20806) {
                                c6115.m16790();
                                if (c6115.f20756) {
                                    c6115.m16946(-1);
                                } else if (!c6115.f20836 || c6115.f20806) {
                                    iM16917 = c6115.m16916();
                                    iM17021 = c6115.m17020();
                                    if (iM16917 > iM17021) {
                                        iM17021 = iM16917;
                                        iM16917 = iM17021;
                                    }
                                    if (!c6115.f20805) {
                                        iM16917 = iM17021;
                                    }
                                    c6115.m16946(iM16917);
                                }
                                c6115.f20806 = false;
                                c6115.f20756 = false;
                                c6115.f20836 = false;
                                c6115.f20844 = SystemClock.uptimeMillis();
                                return true;
                            }
                            if (c6115.f20752) {
                                C6111.m16771(c6115);
                                c6115.m16944();
                                if (C6111.m16750(motionEvent)) {
                                    C6111.m16658(c6115, 1, motionEvent);
                                    return true;
                                }
                            } else if (c6115.f20821) {
                                c6115.f20821 = false;
                                c6115.m17003();
                                if (C6111.m16750(motionEvent)) {
                                    C6111.m16658(c6115, 2, motionEvent);
                                }
                            } else {
                                c6115.f20844 = SystemClock.uptimeMillis();
                                c6115.invalidate();
                                C6111.m16634(c6115);
                            }
                        }
                    } else if (action != 2) {
                        m14972(motionEvent);
                        if (this.f18641 != 1) {
                            if (c6115.f20836) {
                                c6115.f20722.onScroll(null, null, (this.f18640 - motionEvent.getX(1)) - c6115.getPaddingLeft(), (this.f18660 - motionEvent.getY(1)) - c6115.getPaddingTop());
                                this.f18640 = motionEvent.getX(1);
                                this.f18660 = motionEvent.getY(1);
                            } else if (this.f18650) {
                                m14975(motionEvent);
                                c6112 = c6115.f20736;
                                if (c6112 != null) {
                                    c6112.f20722.m14975(motionEvent);
                                    ((View) c6115.getParent()).invalidate();
                                    return true;
                                }
                            }
                            if (!c6115.f20756) {
                                x2 = motionEvent.getX() - c6115.getPaddingLeft();
                                y = motionEvent.getY() - c6115.getPaddingTop();
                                if (!this.f18665) {
                                    i = (int) (x2 - this.f18659);
                                    int i15 = (int) (y - this.f18664);
                                    if (Math.abs(i) <= this.f18668) {
                                    }
                                    this.f18665 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c6115.f20766 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c6115.f20749;
                                if (y2 < f) {
                                    c6115.f20766 = -C6111.m16701((int) (f - y2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    f2 = c6115.f20757;
                                    if (y2 > f2) {
                                        c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                        if (z2) {
                                            c6115.f20849 = SystemClock.uptimeMillis();
                                        }
                                        c6115.postInvalidateOnAnimation();
                                    } else {
                                        c6115.f20766 = 0;
                                    }
                                }
                                fM17870 = c1590.m17870() / 2.0f;
                                paddingTop = c6115.f20757 - c6115.getPaddingTop();
                                if (c6115.f20806) {
                                    if (y < fM17870) {
                                        y = fM17870;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c6115.m16986(x2, y);
                                    return true;
                                }
                                f3 = y + this.f18647;
                                if (f3 >= fM17870) {
                                    if (f3 > paddingTop) {
                                        fM17870 = paddingTop;
                                    } else {
                                        fM17870 = f3;
                                    }
                                }
                                if (c6115.f20756) {
                                    c6115.m16822(x2 + this.f18643, fM17870);
                                    return true;
                                }
                                c6115.m16961(x2 + this.f18643, fM17870);
                                return true;
                            }
                            x2 = motionEvent.getX() - c6115.getPaddingLeft();
                            y = motionEvent.getY() - c6115.getPaddingTop();
                            if (!this.f18665) {
                                i = (int) (x2 - this.f18659);
                                int i16 = (int) (y - this.f18664);
                                if (Math.abs(i) <= this.f18668) {
                                }
                                this.f18665 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c6115.f20766 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c6115.f20749;
                            if (y2 < f) {
                                c6115.f20766 = -C6111.m16701((int) (f - y2));
                                if (z2) {
                                    c6115.f20849 = SystemClock.uptimeMillis();
                                }
                                c6115.postInvalidateOnAnimation();
                            } else {
                                f2 = c6115.f20757;
                                if (y2 > f2) {
                                    c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    c6115.f20766 = 0;
                                }
                            }
                            fM17870 = c1590.m17870() / 2.0f;
                            paddingTop = c6115.f20757 - c6115.getPaddingTop();
                            if (c6115.f20806) {
                                if (y < fM17870) {
                                    y = fM17870;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c6115.m16986(x2, y);
                                return true;
                            }
                            f3 = y + this.f18647;
                            if (f3 >= fM17870) {
                                if (f3 > paddingTop) {
                                    fM17870 = paddingTop;
                                } else {
                                    fM17870 = f3;
                                }
                            }
                            if (c6115.f20756) {
                                c6115.m16822(x2 + this.f18643, fM17870);
                                return true;
                            }
                            c6115.m16961(x2 + this.f18643, fM17870);
                            return true;
                        }
                        if (!c6115.f20756 || c6115.f20836 || c6115.f20806) {
                            x2 = motionEvent.getX() - c6115.getPaddingLeft();
                            y = motionEvent.getY() - c6115.getPaddingTop();
                            if (!this.f18665) {
                                i = (int) (x2 - this.f18659);
                                int i17 = (int) (y - this.f18664);
                                if (Math.abs(i) <= this.f18668 || Math.abs(i17) > this.f18668) {
                                    this.f18665 = true;
                                }
                            }
                            y2 = motionEvent.getY();
                            if (c6115.f20766 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c6115.f20749;
                            if (y2 < f) {
                                c6115.f20766 = -C6111.m16701((int) (f - y2));
                                if (z2) {
                                    c6115.f20849 = SystemClock.uptimeMillis();
                                }
                                c6115.postInvalidateOnAnimation();
                            } else {
                                f2 = c6115.f20757;
                                if (y2 > f2) {
                                    c6115.f20766 = C6111.m16701((int) (y2 - f2));
                                    if (z2) {
                                        c6115.f20849 = SystemClock.uptimeMillis();
                                    }
                                    c6115.postInvalidateOnAnimation();
                                } else {
                                    c6115.f20766 = 0;
                                }
                            }
                            fM17870 = c1590.m17870() / 2.0f;
                            paddingTop = c6115.f20757 - c6115.getPaddingTop();
                            if (c6115.f20806) {
                                if (y < fM17870) {
                                    y = fM17870;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c6115.m16986(x2, y);
                                return true;
                            }
                            f3 = y + this.f18647;
                            if (f3 >= fM17870) {
                                if (f3 > paddingTop) {
                                    fM17870 = paddingTop;
                                } else {
                                    fM17870 = f3;
                                }
                            }
                            if (c6115.f20756) {
                                c6115.m16822(x2 + this.f18643, fM17870);
                                return true;
                            }
                            c6115.m16961(x2 + this.f18643, fM17870);
                            return true;
                        }
                        float f12 = 1.0f;
                        if (c6115.f20752) {
                            float y7 = ((motionEvent.getY() - c6115.getPaddingTop()) + this.f18647) / (c6115.m16814() - c1590.f6368);
                            if (y7 < 0.0f) {
                                f12 = 0.0f;
                            } else if (y7 <= 1.0f) {
                                f12 = y7;
                            }
                            int iM17012 = (int) (c6115.m17012() * f12);
                            if (iM17012 != c6115.m17066()) {
                                c6115.scrollTo(c6115.getScrollX(), iM17012);
                                c6115.f20820 = SystemClock.uptimeMillis();
                                c6115.f20854.removeMessages(6);
                                c6115.f20854.sendEmptyMessageDelayed(6, 100L);
                                return true;
                            }
                        } else if (c6115.f20821) {
                            int i18 = (c1590.f6388 && c1590.f6422) ? c6115.f20764.f41316 : 0;
                            if (i18 != 0 && c1590.f6381) {
                                i2 = i18;
                            }
                            float x5 = (((motionEvent.getX() - i2) - c6115.getPaddingLeft()) + this.f18643) / ((c6115.m16978() - i18) - c1590.f6368);
                            if (x5 < 0.0f) {
                                f12 = 0.0f;
                            } else if (x5 <= 1.0f) {
                                f12 = x5;
                            }
                            int iM17046 = (int) (c6115.m17046() * f12);
                            if (iM17046 != c6115.getScrollX()) {
                                c6115.scrollTo(iM17046, c6115.m17066());
                                return true;
                            }
                        }
                    } else if (action != 3) {
                        c6115.setPressed(false);
                        m14971(false);
                        c6115.m16808();
                        if (this.f18650) {
                            m14974();
                            c6113 = c6115.f20736;
                            if (c6113 != null) {
                                c6113.f20722.m14974();
                                ((View) c6115.getParent()).invalidate();
                                interfaceC10015 = c6115.f20815;
                                if (interfaceC10015 != null) {
                                    C6111.m16661(c6115, new Runnable() { // from class: l.ۗ᩻ۖ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f13106;
                                            final InterfaceC10014 interfaceC10016 = interfaceC10015;
                                            C6111.m16661(c6113, new Runnable() { // from class: l.ۖܳۖ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C6111 c6116 = viewOnTouchListenerC5405.f18663;
                                                    int scrollX = c6116.getScrollX();
                                                    int iM17066 = c6116.m17066();
                                                    interfaceC10016.mo13621(scrollX, iM17066 - 1, scrollX, iM17066);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c6115.f20752 || c6115.f20821 || c6115.f20836 || c6115.f20756 || c6115.f20806) {
                                C6111.m16771(c6115);
                                c6115.f20806 = false;
                                c6115.f20756 = false;
                                c6115.f20836 = false;
                                c6115.f20821 = false;
                                c6115.f20752 = false;
                                c6115.m16790();
                                return true;
                            }
                            C6111.m16634(c6115);
                        }
                    } else if (action != 5) {
                        this.f18641++;
                        if (c6115.f20836) {
                            this.f18655 = motionEvent.getPointerId(1);
                            this.f18640 = motionEvent.getX(1);
                            this.f18660 = motionEvent.getY(1);
                            return true;
                        }
                        if (c1590.f6429 && !this.f18650) {
                            m14965(motionEvent);
                            c6114 = c6115.f20736;
                            if (c6114 != null) {
                                c6114.f20722.m14965(motionEvent);
                                ((View) c6115.getParent()).invalidate();
                            }
                        }
                    } else if (action == 6) {
                        int action5 = (motionEvent.getAction() & 65280) >>> 8;
                        if (c6115.f20836 && action5 != this.f18655) {
                            c6115.f20836 = false;
                        }
                        this.f18641--;
                    }
                    return c6115.f20762.m26793(motionEvent);
                }
            }
        } else {
            try {
                c6115.f20747.m42166(motionEvent);
                if (actionMasked3 == i || actionMasked3 == i) {
                    return true;
                }
            } finally {
                if (actionMasked3 == 1 || actionMasked3 == 3) {
                    c6115.f20747 = null;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14965(MotionEvent motionEvent) {
        this.f18666 = m14973(motionEvent);
        this.f18650 = true;
        this.f18665 = false;
        C6111 c6111 = this.f18663;
        this.f18662 = c6111.f20794.f22196.getTextSize();
        this.f18649 = c6111.getScrollX();
        this.f18667 = c6111.m17066();
        if (c6111.f20752 || c6111.f20821 || c6111.f20756 || c6111.f20806) {
            c6111.m16790();
            C6111.m16771(c6111);
            c6111.f20806 = false;
            c6111.f20756 = false;
            c6111.f20821 = false;
            c6111.f20752 = false;
            return;
        }
        c6111.f20762.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14975(MotionEvent motionEvent) {
        float f;
        C6111 c6111 = this.f18663;
        C1590 c1590 = c6111.f20794;
        float fM14973 = m14973(motionEvent);
        if (!this.f18665) {
            if (Math.abs(fM14973 - this.f18666) <= this.f18668) {
                return;
            } else {
                this.f18665 = true;
            }
        }
        float f2 = fM14973 / this.f18666;
        float textSize = c1590.f22196.getTextSize();
        if (c1590.m5431(this.f18662 * f2)) {
            float textSize2 = c1590.f22196.getTextSize() / this.f18662;
            c6111.f20764.mo14783(textSize);
            float fM17012 = 0.0f;
            if (c6111.f20764.mo14788()) {
                float x = ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f) - c6111.getPaddingLeft();
                f = ((this.f18649 + x) * textSize2) - x;
                if (f < 0.0f) {
                    f = 0.0f;
                } else {
                    float fM17046 = c6111.m17046();
                    if (f > fM17046) {
                        f = fM17046;
                    }
                }
            } else {
                f = 0.0f;
            }
            float y = ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - c6111.getPaddingTop();
            float f3 = ((this.f18667 + y) * textSize2) - y;
            if (f3 >= 0.0f) {
                fM17012 = c6111.m17012();
                if (f3 <= fM17012) {
                    fM17012 = f3;
                }
            }
            c6111.m16976((int) f, (int) fM17012);
            c6111.invalidate();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14974() {
        if (this.f18665) {
            C6111 c6111 = this.f18663;
            c6111.m17028();
            c6111.f20764.mo14802();
            c6111.m16633();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static float m14973(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }
}
