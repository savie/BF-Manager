package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15052 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36041(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            textView.setOnClickListener(null);
            textView.setOnLongClickListener(null);
            return;
        }
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
        String strM5863 = C1791.m5863(j);
        if (j == 0) {
            textView.setText(strM5863);
        } else {
            textView.setText(strM5863 + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C0674.m3027(textView);
        textView.setOnClickListener(new ViewOnClickListenerC6584());
        textView.setOnLongClickListener(new ViewOnLongClickListenerC22813());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36042(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            return;
        }
        textView.setText(C1791.m5863(j) + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
    }
}
