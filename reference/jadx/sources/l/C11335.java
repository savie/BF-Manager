package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۧۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11335 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12081 f35709;

    public C11335(ActivityC12081 activityC12081) {
        this.f35709 = activityC12081;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        String string;
        ViewOnClickListenerC20286 viewOnClickListenerC20286 = (ViewOnClickListenerC20286) abstractC11800;
        ActivityC12081 activityC12081 = this.f35709;
        C16556 c16556 = (C16556) activityC12081.f38897.get(i);
        viewOnClickListenerC20286.f65135.setText(c16556.f53575);
        int iM34280 = C14118.m34280(c16556.m39199());
        boolean zM34290 = C14118.m34290(c16556.m39199());
        if (iM34280 == 0) {
            string = activityC12081.getString(R.string.MT_Protector);
        } else if (iM34280 == 1) {
            string = activityC12081.getString(R.string.MT_Protector);
        } else if (iM34280 != 2) {
            string = iM34280 != 3 ? d.O : activityC12081.getString(R.string.MT_Protector);
        } else {
            string = activityC12081.getString(R.string.MT_Protector);
        }
        if (zM34290) {
            StringBuilder sbM10405 = C3188.m10405(string, " (");
            sbM10405.append(activityC12081.getString(R.string.MT_Protector));
            sbM10405.append(MotionUtils.EASING_TYPE_FORMAT_END);
            string = sbM10405.toString();
        }
        viewOnClickListenerC20286.f65134.setText(string);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC12081 activityC12081 = this.f35709;
        return new ViewOnClickListenerC20286(activityC12081, LayoutInflater.from(activityC12081).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f35709.f38897.size();
    }
}
