package l;

import android.text.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34TE */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15284 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ViewOnClickListenerC15284 f49970 = new ViewOnClickListenerC15284();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC15284 m36685() {
        return f49970;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36686(TextView textView) {
        C17423.m40911(textView);
        textView.setOnClickListener(f49970);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m36688(TextView textView) {
        C17423.m40911(textView);
        textView.setOnLongClickListener(f49970);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36687(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        C17423.m40911(textView);
        textView.setOnClickListener(f49970);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setText(((TextView) view).getText().toString());
                C22673.m51152(R.string.MT_Protector);
            } catch (Throwable unused) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        try {
            clipboardManager.setText(((TextView) view).getText().toString());
            C22673.m51152(R.string.MT_Protector);
            return true;
        } catch (Throwable unused) {
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
    }
}
