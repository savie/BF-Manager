package l;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ۗۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC3184 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f10332;

    public ViewOnTouchListenerC3184(AssistActivity assistActivity) {
        this.f10332 = assistActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AssistActivity assistActivity = this.f10332;
        C21587.m49114(assistActivity.f882, "-->finish by touch");
        assistActivity.finish();
        return false;
    }
}
