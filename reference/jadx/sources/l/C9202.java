package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9202 extends C9027 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f31282;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31283;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f31284;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f31285;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19785 f31286;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17492 f31287;

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2548(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C17492 c17492 = this.f31287;
        BooleanSupplier booleanSupplier = this.f31282;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f31283) {
                        if (motionEvent.getPointerCount() != 1 || booleanSupplier.getAsBoolean()) {
                            m23663();
                            return false;
                        }
                        View viewM23664 = m23664(motionEvent);
                        EnumC8496 enumC8496M23662 = m23662(viewM23664, motionEvent);
                        if (!enumC8496M23662.m22202()) {
                            if (enumC8496M23662.m22201()) {
                                c17492.requestDisallowInterceptTouchEvent(true);
                                this.f31285 = viewM23664;
                                return true;
                            }
                        } else if (viewM23664 != null && !this.f31284) {
                            this.f31284 = true;
                            this.f31283 = true;
                            viewM23664.performLongClick();
                            this.f31285 = null;
                            this.f31286.m45000();
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f31283) {
                        m23663();
                        return false;
                    }
                }
                return false;
            }
            m23663();
            return false;
        }
        View viewM23665 = m23664(motionEvent);
        boolean z = c17492.getScrollState() == 0 && !booleanSupplier.getAsBoolean() && motionEvent.getPointerCount() == 1 && viewM23665 != null;
        this.f31285 = null;
        this.f31284 = false;
        this.f31283 = false;
        this.f31286.m45001(viewM23665, motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY(), z);
        return false;
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ۙ */
    public final void mo2546(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f31283) {
                    return;
                }
                if (motionEvent.getPointerCount() != 1 || this.f31282.getAsBoolean()) {
                    m23663();
                    return;
                }
                View viewM23664 = m23664(motionEvent);
                EnumC8496 enumC8496M23662 = m23662(viewM23664, motionEvent);
                if (!enumC8496M23662.m22202()) {
                    if (enumC8496M23662.m22201()) {
                        this.f31287.requestDisallowInterceptTouchEvent(true);
                        this.f31285 = viewM23664;
                        return;
                    }
                    return;
                }
                if (viewM23664 == null || this.f31284) {
                    return;
                }
                this.f31284 = true;
                this.f31283 = true;
                viewM23664.performLongClick();
                this.f31285 = null;
                this.f31286.m45000();
                return;
            }
            if (actionMasked != 3) {
                if ((actionMasked == 5 || actionMasked == 6) && !this.f31283) {
                    m23663();
                    return;
                }
                return;
            }
        }
        m23663();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC8496 m23662(View view, MotionEvent motionEvent) {
        int i = 0;
        int pointerId = motionEvent.getPointerId(0);
        EnumC8496 enumC8496 = EnumC8496.NONE;
        while (true) {
            int historySize = motionEvent.getHistorySize();
            C19785 c19785 = this.f31286;
            if (i < historySize) {
                EnumC8496 enumC8496M44999 = c19785.m44999(view, motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), pointerId);
                if (enumC8496M44999.m22202()) {
                    return enumC8496M44999;
                }
                if (enumC8496M44999.m22201()) {
                    enumC8496 = enumC8496M44999;
                }
                i++;
            } else {
                EnumC8496 enumC8496M449910 = c19785.m44999(view, motionEvent.getX(), motionEvent.getY(), pointerId);
                return (enumC8496M449910.m22202() || enumC8496M449910.m22201()) ? enumC8496M449910 : enumC8496;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23663() {
        this.f31285 = null;
        this.f31284 = false;
        this.f31283 = false;
        this.f31286.m45000();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private View m23664(MotionEvent motionEvent) {
        View view = this.f31285;
        C17492 c17492 = this.f31287;
        if (view != null) {
            if (view.getParent() == c17492) {
                return this.f31285;
            }
            return null;
        }
        View viewFindChildViewUnder = c17492.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || c17492.getChildAdapterPosition(viewFindChildViewUnder) == -1) {
            return null;
        }
        return viewFindChildViewUnder;
    }

    public C9202(C17492 c17492, BooleanSupplier booleanSupplier) {
        this.f31287 = c17492;
        this.f31282 = booleanSupplier;
        int scaledTouchSlop = ViewConfiguration.get(c17492.getContext()).getScaledTouchSlop();
        this.f31286 = new C19785(scaledTouchSlop, Math.max(scaledTouchSlop * 2, C13932.m33769(33.0f)));
    }
}
