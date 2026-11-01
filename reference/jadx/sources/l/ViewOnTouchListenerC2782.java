package l;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ۖ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC2782 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f10613;

    public ViewOnTouchListenerC2782(AssistActivity assistActivity) {
        this.f10613 = assistActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AssistActivity assistActivity = this.f10613;
        C23099.m51112(assistActivity.f887, "-->finish by touch");
        assistActivity.finish();
        return false;
    }
}
