package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.֨ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1242 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20293 f5415;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f5416 = Collections.newSetFromMap(new WeakHashMap());

    public C1242(ActivityC20293 activityC20293) {
        this.f5415 = activityC20293;
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iMax = Math.max(1, this.f5415.f65762.size());
        return (i2 >= iMax && i2 - iMax == 0) ? 1 : 2;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC20293 activityC20293 = this.f5415;
        if (i == 0 || i == 1) {
            return new ViewOnClickListenerC4064(activityC20293, LayoutInflater.from(activityC20293).inflate(R.layout.MT_Protector, viewGroup, false), i == 0);
        }
        ViewOnClickListenerC16060 viewOnClickListenerC16060 = new ViewOnClickListenerC16060(activityC20293, LayoutInflater.from(activityC20293).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f5416.add(viewOnClickListenerC16060.f51953);
        return viewOnClickListenerC16060;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int size;
        if (abstractC12554 instanceof ViewOnClickListenerC16060) {
            ViewOnClickListenerC16060 viewOnClickListenerC16060 = (ViewOnClickListenerC16060) abstractC12554;
            int i2 = i - 1;
            ActivityC20293 activityC20293 = this.f5415;
            if (activityC20293.f65762.isEmpty()) {
                if (i2 == 0) {
                    viewOnClickListenerC16060.f51954.setImageDrawable(activityC20293.f65765);
                    viewOnClickListenerC16060.f51953.setText(R.string.MT_Protector);
                    viewOnClickListenerC16060.f51953.setTextColor(C20368.f66009);
                    viewOnClickListenerC16060.itemView.setClickable(false);
                    viewOnClickListenerC16060.itemView.setLongClickable(false);
                    return;
                }
                size = i - 3;
            } else {
                if (i2 < activityC20293.f65762.size()) {
                    AbstractC17131 abstractC17131 = (AbstractC17131) activityC20293.f65762.get(i2);
                    viewOnClickListenerC16060.f51954.setImageDrawable(activityC20293.f65765);
                    viewOnClickListenerC16060.f51953.setText(abstractC17131.mo1456());
                    if (activityC20293.f65754 != null && abstractC17131.mo1453().equals(activityC20293.f65754)) {
                        viewOnClickListenerC16060.f51953.setTextColor(C20368.f65973);
                        activityC20293.f65754 = null;
                    } else {
                        viewOnClickListenerC16060.f51953.setTextColor(C20368.f65976);
                    }
                    viewOnClickListenerC16060.itemView.setClickable(true);
                    viewOnClickListenerC16060.itemView.setLongClickable(true);
                    return;
                }
                size = i2 - (activityC20293.f65762.size() + 1);
            }
            if (activityC20293.f65760.isEmpty()) {
                if (size == 0) {
                    viewOnClickListenerC16060.f51954.setImageDrawable(activityC20293.f65756);
                    viewOnClickListenerC16060.f51953.setText(R.string.MT_Protector);
                    viewOnClickListenerC16060.f51953.setTextColor(C20368.f66009);
                    viewOnClickListenerC16060.itemView.setClickable(false);
                    viewOnClickListenerC16060.itemView.setLongClickable(false);
                    return;
                }
                return;
            }
            if (size < activityC20293.f65760.size()) {
                AbstractC20745 abstractC20745 = (AbstractC20745) activityC20293.f65760.get(size);
                viewOnClickListenerC16060.f51954.setImageDrawable(activityC20293.f65756);
                viewOnClickListenerC16060.f51953.setText(abstractC20745.getName());
                if (activityC20293.f65759 != null && abstractC20745.getName().equals(activityC20293.f65759)) {
                    viewOnClickListenerC16060.f51953.setTextColor(C20368.f65973);
                    activityC20293.f65759 = null;
                } else {
                    viewOnClickListenerC16060.f51953.setTextColor(C20368.f65976);
                }
                viewOnClickListenerC16060.itemView.setClickable(true);
                viewOnClickListenerC16060.itemView.setLongClickable(true);
            }
        }
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        ActivityC20293 activityC20293 = this.f5415;
        return Math.max(1, activityC20293.f65760.size()) + Math.max(1, activityC20293.f65762.size()) + 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4459() {
        for (TextView textView : this.f5416) {
            if (textView.getCurrentTextColor() == C20368.f65973) {
                textView.setTextColor(C20368.f65976);
            }
        }
    }
}
