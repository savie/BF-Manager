package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14271 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f45089;

    public C14271(ActivityC0848 activityC0848) {
        this.f45089 = activityC0848;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC9796 viewOnClickListenerC9796 = (ViewOnClickListenerC9796) abstractC11800;
        ActivityC0848 activityC0848 = this.f45089;
        AbstractC9051 abstractC9051 = (AbstractC9051) activityC0848.f3173.get(i);
        Drawable drawableM24171 = abstractC9051.m24171();
        viewOnClickListenerC9796.f31573.setText(abstractC9051.mo1440());
        if (activityC0848.f3172 == i) {
            viewOnClickListenerC9796.f31573.setTextColor(C3296.f10738);
            viewOnClickListenerC9796.f31575.setBackgroundColor(C3296.f10738 & 553648127);
            drawableM24171.setColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC9796.f31573.setTextColor(C3296.f10751);
            viewOnClickListenerC9796.f31575.setBackgroundColor(0);
            drawableM24171.setColorFilter(C3296.f10758, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC9796.f31576.setImageDrawable(drawableM24171);
        String strMo1443 = abstractC9051.mo1443();
        if (strMo1443 == null) {
            viewOnClickListenerC9796.f31573.setTextSize(17.0f);
            viewOnClickListenerC9796.f31572.setVisibility(8);
        } else {
            viewOnClickListenerC9796.f31573.setTextSize(15.0f);
            viewOnClickListenerC9796.f31572.setVisibility(0);
            viewOnClickListenerC9796.f31572.setText(strMo1443);
        }
        if (abstractC9051.m24169()) {
            viewOnClickListenerC9796.itemView.setBackgroundColor(C3296.f10753);
        } else {
            viewOnClickListenerC9796.itemView.setBackgroundColor(0);
        }
        activityC0848.f3177.m23770(viewOnClickListenerC9796.f31578, ActivityC0848.m3391(activityC0848, abstractC9051));
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC0848 activityC0848 = this.f45089;
        return new ViewOnClickListenerC9796(activityC0848, LayoutInflater.from(activityC0848).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f45089.f3173.size();
    }
}
