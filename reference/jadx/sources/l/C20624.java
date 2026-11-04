package l;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20624 extends C20668 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f66147;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20624(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354, C9370 c9370) {
        super(c9370, null);
        this.f66147 = layoutInflaterFactory2C24354;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f66147.m54417(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f66147;
                layoutInflaterFactory2C24354.m54415(layoutInflaterFactory2C24354.m54418(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0385.m2186(getContext(), i));
    }
}
