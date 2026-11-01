package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14477 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f47456;

    public C14477(ActivityC5677 activityC5677) {
        this.f47456 = activityC5677;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC2854 viewOnClickListenerC2854 = (ViewOnClickListenerC2854) abstractC12554;
        ActivityC5677 activityC5677 = this.f47456;
        AbstractC22611 abstractC22611 = (AbstractC22611) activityC5677.f19367.get(i);
        Drawable drawableM50127 = abstractC22611.m50127();
        viewOnClickListenerC2854.f10783.setText(abstractC22611.mo3615());
        if (activityC5677.f19362 == i) {
            viewOnClickListenerC2854.f10783.setTextColor(C20368.f65970);
            viewOnClickListenerC2854.f10784.setBackgroundColor(C20368.f65970 & 553648127);
            drawableM50127.setColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC2854.f10783.setTextColor(C20368.f65976);
            viewOnClickListenerC2854.f10784.setBackgroundColor(0);
            drawableM50127.setColorFilter(C20368.f66007, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC2854.f10781.setImageDrawable(drawableM50127);
        String strMo3618 = abstractC22611.mo3618();
        if (strMo3618 == null) {
            viewOnClickListenerC2854.f10783.setTextSize(17.0f);
            viewOnClickListenerC2854.f10785.setVisibility(8);
        } else {
            viewOnClickListenerC2854.f10783.setTextSize(15.0f);
            viewOnClickListenerC2854.f10785.setVisibility(0);
            viewOnClickListenerC2854.f10785.setText(strMo3618);
        }
        if (abstractC22611.m50134()) {
            viewOnClickListenerC2854.itemView.setBackgroundColor(C20368.f65962);
        } else {
            viewOnClickListenerC2854.itemView.setBackgroundColor(0);
        }
        activityC5677.f19371.m28840(viewOnClickListenerC2854.f10787, ActivityC5677.m15620(activityC5677, abstractC22611));
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC5677 activityC5677 = this.f47456;
        return new ViewOnClickListenerC2854(activityC5677, LayoutInflater.from(activityC5677).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f47456.f19367.size();
    }
}
