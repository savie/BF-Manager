package l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1538 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5453(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.MT_Protector);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(R.id.MT_Protector, Integer.valueOf(iHashCode));
            C9740[] c9740ArrM5451 = m5451(textView);
            if (c9740ArrM5451 == null || c9740ArrM5451.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.MT_Protector) == null) {
                ViewOnAttachStateChangeListenerC0792 viewOnAttachStateChangeListenerC0792 = new ViewOnAttachStateChangeListenerC0792(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0792);
                textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC0792);
            }
            RunnableC10486 runnableC10486 = new RunnableC10486(textView);
            for (C9740 c9740 : c9740ArrM5451) {
                C12724 c12724M25369 = c9740.m25369();
                c12724M25369.m31536(new C19437(textView, runnableC10486, c12724M25369.getBounds()));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m5452(TextView textView) {
        if (textView.getTag(R.id.MT_Protector) == null) {
            return;
        }
        textView.setTag(R.id.MT_Protector, null);
        C9740[] c9740ArrM5451 = m5451(textView);
        if (c9740ArrM5451 == null || c9740ArrM5451.length <= 0) {
            return;
        }
        for (C9740 c9740 : c9740ArrM5451) {
            c9740.m25369().m31536((Drawable.Callback) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9740[] m5451(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C9740[]) ((Spanned) text).getSpans(0, length, C9740.class);
    }
}
