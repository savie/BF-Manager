package l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0359 extends AbstractC7713 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6004 f1799;

    public C0359(C6004 c6004) {
        this.f1799 = c6004;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo2074(Main main) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText((CharSequence) null);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        viewM30995.setTag(editText);
        C16737.m39290(editText);
        return viewM30995;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2077(View view) {
        String string = ((EditText) view.getTag()).getText().toString();
        if (string.isEmpty()) {
            C15829.m37617(R.string.MT_Protector, 0).m37622();
            return false;
        }
        this.f1799.f20404.mo1826(string);
        return true;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2075(C8067 c8067) {
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2076(DialogInterfaceC19356 dialogInterfaceC19356) {
        dialogInterfaceC19356.m44361().setOnClickListener(new ViewOnClickListenerC20116());
    }
}
