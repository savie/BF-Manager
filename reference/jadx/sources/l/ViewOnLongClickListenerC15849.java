package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLongClickListenerC15849 implements View.OnLongClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0325 f51303;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f51304;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51305;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f51306;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ViewGroup f51307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51308;

    public ViewOnLongClickListenerC15849(C0325 c0325, int i, int i2) {
        this.f51303 = c0325;
        this.f51308 = i;
        this.f51305 = i2;
        ViewGroup viewGroup = (ViewGroup) c0325.f1719.m31016(i2);
        this.f51307 = viewGroup;
        viewGroup.setOnClickListener(this);
        viewGroup.setOnLongClickListener(this);
        this.f51304 = (TextView) viewGroup.getChildAt(1);
        this.f51306 = (TextView) viewGroup.getChildAt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37738(int i) {
        int i2 = this.f51308;
        ViewGroup viewGroup = this.f51307;
        TextView textView = this.f51306;
        TextView textView2 = this.f51304;
        if (i >= i2) {
            textView2.setEnabled(true);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            viewGroup.setEnabled(true);
            return true;
        }
        textView2.setText("----");
        textView2.setEnabled(false);
        textView2.setAlpha(0.3f);
        textView.setAlpha(0.3f);
        viewGroup.setEnabled(false);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37737(String str) {
        this.f51304.setText(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m37736(byte[] bArr) {
        boolean zIsChecked = this.f51303.f1720.isChecked();
        int i = this.f51308;
        long j = 0;
        if (zIsChecked) {
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
            return j;
        }
        while (true) {
            i--;
            if (i < 0) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C0325 c0325 = this.f51303;
        if (c0325.f1719.m22891()) {
            return false;
        }
        final C13026 c13026 = c0325.f1719.f30239;
        final C2516 c2516M33458 = c13026.f43452.m33458();
        final long jM7808 = c2516M33458.m7808();
        final int iM33443 = c13026.f43452.m33443();
        final String string = this.f51304.getText().toString();
        onClick(null);
        View viewInflate = View.inflate(view.getContext(), R.layout.MT_Protector, null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.textView1);
        textView.setText(this.f51306.getText());
        editText.setText(string);
        editText.setSelection(0, editText.length());
        int i = this.f51305;
        if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(true, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(false, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-.eE"));
        }
        final C20082 c20082 = new C20082(editText, textView2, i, c0325.f1720.isChecked());
        Context context = view.getContext();
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(context);
        c8067.m21258(viewInflate);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۢۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                ViewOnLongClickListenerC15849 viewOnLongClickListenerC15849 = this.f67605;
                C0325 c0326 = viewOnLongClickListenerC15849.f51303;
                C20082 c20083 = c20082;
                if (!c20083.f65243 && !c20083.f65247) {
                    C13026 c13027 = c13026;
                    C13732 c13732 = c13027.f43452;
                    C2516 c2516M33459 = c13732.m33458();
                    C2516 c2516 = c2516M33458;
                    DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                    if (c2516M33459 == c2516 && c2516.m7808() == jM7808) {
                        int iM33444 = c13732.m33443();
                        int i3 = iM33443;
                        if (iM33444 == i3) {
                            if (c13027.m32242()) {
                                C15829.m37611(R.string.MT_Protector);
                                return;
                            }
                            if (c20083.f65246.getText().toString().equals(string)) {
                                dialogInterfaceC19356.dismiss();
                                return;
                            }
                            byte[] bArr = c20083.f65249;
                            try {
                                c2516.m7809(i3, bArr.length + i3, bArr);
                                c13732.m33473();
                                c0326.f1719.f30239.invalidate();
                                dialogInterfaceC19356.dismiss();
                                c0326.m1976();
                                viewOnLongClickListenerC15849.onClick(null);
                                return;
                            } catch (IOException e) {
                                c0326.f1719.m22893(e);
                                return;
                            }
                        }
                    }
                    dialogInterfaceC19356.dismiss();
                    return;
                }
                C15829.m37612(0, c20083.f65244.getText()).m37622();
            }
        });
        C16737.m39290(editText);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0325 c0325 = this.f51303;
        SpannableString spannableString = new SpannableString(c0325.f1721.getText().toString());
        spannableString.setSpan(c0325.f1718, 0, (this.f51308 * 3) - 1, 33);
        c0325.f1721.setText(spannableString);
    }
}
