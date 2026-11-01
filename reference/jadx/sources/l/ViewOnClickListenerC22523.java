package l;

import android.text.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34TE */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22523 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ViewOnClickListenerC22523 f73491 = new ViewOnClickListenerC22523();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC22523 m50033() {
        return f73491;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50034(TextView textView) {
        C0674.m3027(textView);
        textView.setOnClickListener(f73491);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50036(TextView textView) {
        C0674.m3027(textView);
        textView.setOnLongClickListener(f73491);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50035(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        C0674.m3027(textView);
        textView.setOnClickListener(f73491);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setText(((TextView) view).getText().toString());
                C15829.m37611(R.string.MT_Protector);
            } catch (Throwable unused) {
                C15829.m37611(R.string.MT_Protector);
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
            C15829.m37611(R.string.MT_Protector);
            return true;
        } catch (Throwable unused) {
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
    }
}
