package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16773 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39592(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            textView.setOnClickListener(null);
            textView.setOnLongClickListener(null);
            return;
        }
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
        String strM22390 = C8311.m22390(j);
        if (j == 0) {
            textView.setText(strM22390);
        } else {
            textView.setText(strM22390 + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C17423.m40911(textView);
        textView.setOnClickListener(new ViewOnClickListenerC11552());
        textView.setOnLongClickListener(new ViewOnLongClickListenerC24979());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39593(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            return;
        }
        textView.setText(C8311.m22390(j) + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
    }
}
