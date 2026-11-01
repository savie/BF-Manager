package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TB */
/* JADX INFO: loaded from: classes5.dex */
public class C16053 extends AbstractC18168 {
    public C16053(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m13145((InterfaceC3485) new C13455(this));
    }

    public C16053(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13145((InterfaceC3485) new C13455(this));
    }

    public C16053(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C13455(this));
    }

    public C16053(Context context) {
        super(context);
        m13145((InterfaceC3485) new C13455(this));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        m38047(abstractActivityC12483, m13158(), m42292().getString(m13157(), "10MB"), new C14188(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38048(C16053 c16053, String str) {
        try {
            c16053.m42292().edit().putString(c16053.m13157(), str).apply();
            c16053.mo8453();
            C2539.m7921();
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38047(AbstractActivityC12483 abstractActivityC12483, CharSequence charSequence, String str, InterfaceC17295 interfaceC17295) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, new String[]{"MB", "KB"}));
        if (str.endsWith("KB")) {
            spinner.setSelection(1);
        }
        try {
            editText.setText(String.valueOf(Integer.parseInt(str.substring(0, str.length() - 2))));
        } catch (NumberFormatException unused) {
            editText.setText("10");
            spinner.setSelection(0);
        }
        editText.selectAll();
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21277(charSequence);
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4966(editText, spinner, interfaceC17295, 1));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
        C16737.m39290(editText);
    }
}
