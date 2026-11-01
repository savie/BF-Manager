package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC13968 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f45944;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC13968(TextView textView) {
        this.f45944 = textView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = this.f45944;
        AbstractC5500.m15197(textView);
        textView.removeOnAttachStateChangeListener(this);
        textView.setTag(R.id.MT_Protector, null);
    }
}
