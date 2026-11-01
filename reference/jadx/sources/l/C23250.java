package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes.dex */
public final class C23250 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51309(DialogInterfaceC19356 dialogInterfaceC19356) {
        ViewGroup viewGroup = (ViewGroup) dialogInterfaceC19356.m44364(R.id.MT_Protector);
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(childAt.getPaddingLeft(), 0, childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m51308(DialogInterfaceC19356 dialogInterfaceC19356) {
        TextView textView = (TextView) dialogInterfaceC19356.m44364(android.R.id.message);
        C0674.m3031(textView);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC7021(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51307(DialogInterfaceC19356 dialogInterfaceC19356) {
        ((TextView) dialogInterfaceC19356.m44364(android.R.id.message)).setLineSpacing(0.0f, 1.1f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51306(AbstractActivityC12483 abstractActivityC12483, SpannableStringBuilder spannableStringBuilder) {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21261(spannableStringBuilder);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21251(R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        dialogInterfaceC19356M21252.m44362();
        dialogInterfaceC19356M21252.m44361().setOnClickListener(new ViewOnClickListenerC7273(abstractActivityC12483));
        m51309(dialogInterfaceC19356M21252);
        ((TextView) dialogInterfaceC19356M21252.m44364(android.R.id.message)).setTextIsSelectable(true);
    }
}
