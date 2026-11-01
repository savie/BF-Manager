package l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8240 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m21619(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.MT_Protector);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(R.id.MT_Protector, Integer.valueOf(iHashCode));
            C19529[] c19529ArrM21617 = m21617(textView);
            if (c19529ArrM21617 == null || c19529ArrM21617.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.MT_Protector) == null) {
                ViewOnAttachStateChangeListenerC15296 viewOnAttachStateChangeListenerC15296 = new ViewOnAttachStateChangeListenerC15296(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15296);
                textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC15296);
            }
            RunnableC18823 runnableC18823 = new RunnableC18823(textView);
            for (C19529 c19529 : c19529ArrM21617) {
                C5417 c5417M44610 = c19529.m44610();
                c5417M44610.m14992(new C18117(textView, runnableC18823, c5417M44610.getBounds()));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m21618(TextView textView) {
        if (textView.getTag(R.id.MT_Protector) == null) {
            return;
        }
        textView.setTag(R.id.MT_Protector, null);
        C19529[] c19529ArrM21617 = m21617(textView);
        if (c19529ArrM21617 == null || c19529ArrM21617.length <= 0) {
            return;
        }
        for (C19529 c19529 : c19529ArrM21617) {
            c19529.m44610().m14992((Drawable.Callback) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19529[] m21617(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C19529[]) ((Spanned) text).getSpans(0, length, C19529.class);
    }
}
