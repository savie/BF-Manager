package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۧ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11257 extends C22243 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35539;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public View f35540;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25227 f35541;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f35542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1563 f35543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f35544;

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9319(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C25227 c25227 = this.f35541;
        BooleanSupplier booleanSupplier = this.f35544;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f35539) {
                        if (motionEvent.getPointerCount() != 1 || booleanSupplier.getAsBoolean()) {
                            m28496();
                            return false;
                        }
                        View viewM28497 = m28497(motionEvent);
                        EnumC5292 enumC5292M28495 = m28495(viewM28497, motionEvent);
                        if (!enumC5292M28495.m15886()) {
                            if (enumC5292M28495.m15885()) {
                                c25227.requestDisallowInterceptTouchEvent(true);
                                this.f35540 = viewM28497;
                                return true;
                            }
                        } else if (viewM28497 != null && !this.f35542) {
                            this.f35542 = true;
                            this.f35539 = true;
                            viewM28497.performLongClick();
                            this.f35540 = null;
                            this.f35543.m5504();
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f35539) {
                        m28496();
                        return false;
                    }
                }
                return false;
            }
            m28496();
            return false;
        }
        View viewM28498 = m28497(motionEvent);
        boolean z = c25227.getScrollState() == 0 && !booleanSupplier.getAsBoolean() && motionEvent.getPointerCount() == 1 && viewM28498 != null;
        this.f35540 = null;
        this.f35542 = false;
        this.f35539 = false;
        this.f35543.m5505(viewM28498, motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY(), z);
        return false;
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ۙ */
    public final void mo9314(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f35539) {
                    return;
                }
                if (motionEvent.getPointerCount() != 1 || this.f35544.getAsBoolean()) {
                    m28496();
                    return;
                }
                View viewM28497 = m28497(motionEvent);
                EnumC5292 enumC5292M28495 = m28495(viewM28497, motionEvent);
                if (!enumC5292M28495.m15886()) {
                    if (enumC5292M28495.m15885()) {
                        this.f35541.requestDisallowInterceptTouchEvent(true);
                        this.f35540 = viewM28497;
                        return;
                    }
                    return;
                }
                if (viewM28497 == null || this.f35542) {
                    return;
                }
                this.f35542 = true;
                this.f35539 = true;
                viewM28497.performLongClick();
                this.f35540 = null;
                this.f35543.m5504();
                return;
            }
            if (actionMasked != 3) {
                if ((actionMasked == 5 || actionMasked == 6) && !this.f35539) {
                    m28496();
                    return;
                }
                return;
            }
        }
        m28496();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC5292 m28495(View view, MotionEvent motionEvent) {
        int i = 0;
        int pointerId = motionEvent.getPointerId(0);
        EnumC5292 enumC5292 = EnumC5292.NONE;
        while (true) {
            int historySize = motionEvent.getHistorySize();
            C1563 c1563 = this.f35543;
            if (i < historySize) {
                EnumC5292 enumC5292M5503 = c1563.m5503(view, motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), pointerId);
                if (enumC5292M5503.m15886()) {
                    return enumC5292M5503;
                }
                if (enumC5292M5503.m15885()) {
                    enumC5292 = enumC5292M5503;
                }
                i++;
            } else {
                EnumC5292 enumC5292M5504 = c1563.m5503(view, motionEvent.getX(), motionEvent.getY(), pointerId);
                return (enumC5292M5504.m15886() || enumC5292M5504.m15885()) ? enumC5292M5504 : enumC5292;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28496() {
        this.f35540 = null;
        this.f35542 = false;
        this.f35539 = false;
        this.f35543.m5504();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private View m28497(MotionEvent motionEvent) {
        View view = this.f35540;
        C25227 c25227 = this.f35541;
        if (view != null) {
            if (view.getParent() == c25227) {
                return this.f35540;
            }
            return null;
        }
        View viewFindChildViewUnder = c25227.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || c25227.getChildAdapterPosition(viewFindChildViewUnder) == -1) {
            return null;
        }
        return viewFindChildViewUnder;
    }

    public C11257(C25227 c25227, BooleanSupplier booleanSupplier) {
        this.f35541 = c25227;
        this.f35544 = booleanSupplier;
        int scaledTouchSlop = ViewConfiguration.get(c25227.getContext()).getScaledTouchSlop();
        this.f35543 = new C1563(scaledTouchSlop, Math.max(scaledTouchSlop * 2, C6907.m19160(33.0f)));
    }
}
