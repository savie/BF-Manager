package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8VR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4973 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f17347;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f17348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EditText f17349;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo7624();

    public AbstractDialogInterfaceOnClickListenerC4973(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f17347 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f17349 = editText;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, this);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f17348 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44368(new DialogInterface.OnKeyListener() { // from class: l.ۢۧۚ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                this.f32234.getClass();
                if (keyEvent.getAction() != 0 || i2 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC19356M21252.m44367(this);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۗۧۚ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC4973.m13793(this.f11973, i2, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13793(AbstractDialogInterfaceOnClickListenerC4973 abstractDialogInterfaceOnClickListenerC4973, int i, KeyEvent keyEvent) {
        EditText editText = abstractDialogInterfaceOnClickListenerC4973.f17349;
        int inputType = editText.getInputType();
        int i2 = C10948.f37220;
        if ((inputType & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int imeOptions = editText.getImeOptions();
        if (imeOptions != 2 && imeOptions != 3 && imeOptions != 4 && imeOptions != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC4973.mo7624();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13802() {
        this.f17349.setInputType(2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13799() {
        this.f17349.setImeOptions(6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13796() {
        this.f17348.dismiss();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m13800() {
        return this.f17349.getText().toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m13794() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f17348;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        C16737.m39290(this.f17349);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13801(String str) {
        this.f17349.setText(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13798(String str) {
        this.f17349.setHint(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13795() {
        this.f17349.selectAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13797(int i) {
        this.f17347.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo7624();
    }
}
