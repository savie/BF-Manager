package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩵֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19141 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16319 f61825;

    public C19141(ActivityC16319 activityC16319) {
        this.f61825 = activityC16319;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        String string;
        ViewOnClickListenerC0090 viewOnClickListenerC0090 = (ViewOnClickListenerC0090) abstractC12554;
        ActivityC16319 activityC16319 = this.f61825;
        C9969 c9969 = (C9969) activityC16319.f52553.get(i);
        viewOnClickListenerC0090.f1003.setText(c9969.f34074);
        int iM10039 = C3386.m10039(c9969.m25237());
        boolean zM10049 = C3386.m10049(c9969.m25237());
        if (iM10039 == 0) {
            string = activityC16319.getString(R.string.MT_Protector);
        } else if (iM10039 == 1) {
            string = activityC16319.getString(R.string.MT_Protector);
        } else if (iM10039 != 2) {
            string = iM10039 != 3 ? d.O : activityC16319.getString(R.string.MT_Protector);
        } else {
            string = activityC16319.getString(R.string.MT_Protector);
        }
        if (zM10049) {
            StringBuilder sbM8976 = C3012.m8976(string, " (");
            sbM8976.append(activityC16319.getString(R.string.MT_Protector));
            sbM8976.append(MotionUtils.EASING_TYPE_FORMAT_END);
            string = sbM8976.toString();
        }
        viewOnClickListenerC0090.f1004.setText(string);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC16319 activityC16319 = this.f61825;
        return new ViewOnClickListenerC0090(activityC16319, LayoutInflater.from(activityC16319).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f61825.f52553.size();
    }
}
