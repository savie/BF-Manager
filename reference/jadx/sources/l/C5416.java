package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5416 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16144(DialogInterfaceC8327 dialogInterfaceC8327) {
        ViewGroup viewGroup = (ViewGroup) dialogInterfaceC8327.m22423(R.id.MT_Protector);
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(childAt.getPaddingLeft(), 0, childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m16143(DialogInterfaceC8327 dialogInterfaceC8327) {
        TextView textView = (TextView) dialogInterfaceC8327.m22423(android.R.id.message);
        C17423.m40915(textView);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC12873());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16141(DialogInterfaceC8327 dialogInterfaceC8327) {
        ((TextView) dialogInterfaceC8327.m22423(android.R.id.message)).setLineSpacing(0.0f, 1.1f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16142(AbstractActivityC17204 abstractActivityC17204, SpannableStringBuilder spannableStringBuilder) {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8008(spannableStringBuilder);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        dialogInterfaceC8327M7999.m22432();
        dialogInterfaceC8327M7999.m22440().setOnClickListener(new ViewOnClickListenerC19586());
        m16144(dialogInterfaceC8327M7999);
        ((TextView) dialogInterfaceC8327M7999.m22423(android.R.id.message)).setTextIsSelectable(true);
    }
}
