package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8VR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC15220 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f49680;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f49681;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EditText f49682;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo16630();

    public AbstractDialogInterfaceOnClickListenerC15220(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f49681 = (TextView) viewM40395.findViewById(R.id.title);
        EditText editText = (EditText) viewM40395.findViewById(R.id.MT_Protector);
        this.f49682 = editText;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, this);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f49680 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22427(new DialogInterface.OnKeyListener() { // from class: l.᩸۠ᩴ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                this.f73646.getClass();
                if (keyEvent.getAction() != 0 || i2 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC8327M7999.m22426(this);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: l.ᩴ۠ᩴ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC15220.m36563(this.f63421, i2, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36563(AbstractDialogInterfaceOnClickListenerC15220 abstractDialogInterfaceOnClickListenerC15220, int i, KeyEvent keyEvent) {
        EditText editText = abstractDialogInterfaceOnClickListenerC15220.f49682;
        int inputType = editText.getInputType();
        int i2 = C23255.f75338;
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
            abstractDialogInterfaceOnClickListenerC15220.mo16630();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36568() {
        this.f49682.setInputType(2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36569() {
        this.f49682.setImeOptions(6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36564() {
        this.f49680.dismiss();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m36570() {
        return this.f49682.getText().toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36567() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f49680;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        C21576.m49090(this.f49682);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36571(String str) {
        this.f49682.setText(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36566(String str) {
        this.f49682.setHint(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36572() {
        this.f49682.selectAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36565(int i) {
        this.f49681.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo16630();
    }
}
