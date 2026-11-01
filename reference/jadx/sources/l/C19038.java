package l;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C19038 extends C18829 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f61578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19038(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161, C5716 c5716) {
        super(c5716, null);
        this.f61578 = layoutInflaterFactory2C9161;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f61578.m23555(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f61578;
                layoutInflaterFactory2C9161.m23552(layoutInflaterFactory2C9161.m23563(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C15945.m37904(getContext(), i));
    }
}
