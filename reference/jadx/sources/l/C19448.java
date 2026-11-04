package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩴ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19448 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3786 f62817;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f62818 = Collections.newSetFromMap(new WeakHashMap());

    public C19448(ActivityC3786 activityC3786) {
        this.f62817 = activityC3786;
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iMax = Math.max(1, this.f62817.f12979.size());
        return (i2 >= iMax && i2 - iMax == 0) ? 1 : 2;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC3786 activityC3786 = this.f62817;
        if (i == 0 || i == 1) {
            return new ViewOnClickListenerC12735(activityC3786, LayoutInflater.from(activityC3786).inflate(R.layout.MT_Protector, viewGroup, false), i == 0);
        }
        ViewOnClickListenerC23924 viewOnClickListenerC23924 = new ViewOnClickListenerC23924(activityC3786, LayoutInflater.from(activityC3786).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f62818.add(viewOnClickListenerC23924.f77452);
        return viewOnClickListenerC23924;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        int size;
        if (abstractC11800 instanceof ViewOnClickListenerC23924) {
            ViewOnClickListenerC23924 viewOnClickListenerC23924 = (ViewOnClickListenerC23924) abstractC11800;
            int i2 = i - 1;
            ActivityC3786 activityC3786 = this.f62817;
            if (activityC3786.f12979.isEmpty()) {
                if (i2 == 0) {
                    viewOnClickListenerC23924.f77451.setImageDrawable(activityC3786.f12980);
                    viewOnClickListenerC23924.f77452.setText(R.string.MT_Protector);
                    viewOnClickListenerC23924.f77452.setTextColor(C3296.f10779);
                    viewOnClickListenerC23924.itemView.setClickable(false);
                    viewOnClickListenerC23924.itemView.setLongClickable(false);
                    return;
                }
                size = i - 3;
            } else {
                if (i2 < activityC3786.f12979.size()) {
                    AbstractC14806 abstractC14806 = (AbstractC14806) activityC3786.f12979.get(i2);
                    viewOnClickListenerC23924.f77451.setImageDrawable(activityC3786.f12980);
                    viewOnClickListenerC23924.f77452.setText(abstractC14806.mo11753());
                    if (activityC3786.f12972 != null && abstractC14806.mo18531().equals(activityC3786.f12972)) {
                        viewOnClickListenerC23924.f77452.setTextColor(C3296.f10768);
                        activityC3786.f12972 = null;
                    } else {
                        viewOnClickListenerC23924.f77452.setTextColor(C3296.f10751);
                    }
                    viewOnClickListenerC23924.itemView.setClickable(true);
                    viewOnClickListenerC23924.itemView.setLongClickable(true);
                    return;
                }
                size = i2 - (activityC3786.f12979.size() + 1);
            }
            if (activityC3786.f12975.isEmpty()) {
                if (size == 0) {
                    viewOnClickListenerC23924.f77451.setImageDrawable(activityC3786.f12969);
                    viewOnClickListenerC23924.f77452.setText(R.string.MT_Protector);
                    viewOnClickListenerC23924.f77452.setTextColor(C3296.f10779);
                    viewOnClickListenerC23924.itemView.setClickable(false);
                    viewOnClickListenerC23924.itemView.setLongClickable(false);
                    return;
                }
                return;
            }
            if (size < activityC3786.f12975.size()) {
                AbstractC22044 abstractC22044 = (AbstractC22044) activityC3786.f12975.get(size);
                viewOnClickListenerC23924.f77451.setImageDrawable(activityC3786.f12969);
                viewOnClickListenerC23924.f77452.setText(abstractC22044.getName());
                if (activityC3786.f12970 != null && abstractC22044.getName().equals(activityC3786.f12970)) {
                    viewOnClickListenerC23924.f77452.setTextColor(C3296.f10768);
                    activityC3786.f12970 = null;
                } else {
                    viewOnClickListenerC23924.f77452.setTextColor(C3296.f10751);
                }
                viewOnClickListenerC23924.itemView.setClickable(true);
                viewOnClickListenerC23924.itemView.setLongClickable(true);
            }
        }
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        ActivityC3786 activityC3786 = this.f62817;
        return Math.max(1, activityC3786.f12975.size()) + Math.max(1, activityC3786.f12979.size()) + 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44931() {
        for (TextView textView : this.f62818) {
            if (textView.getCurrentTextColor() == C3296.f10768) {
                textView.setTextColor(C3296.f10751);
            }
        }
    }
}
