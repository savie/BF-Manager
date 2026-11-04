package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC17480 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f56819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f56820;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f56821;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17771 f56822;

    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo5598();

    /* JADX INFO: renamed from: ᩸ */
    public void mo5599() {
    }

    public AbstractDialogInterfaceOnClickListenerC17480(AbstractActivityC17204 abstractActivityC17204, String str) {
        this(-1, abstractActivityC17204, str);
    }

    public AbstractDialogInterfaceOnClickListenerC17480(int i, AbstractActivityC17204 abstractActivityC17204, String str) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f56821 = (LinearLayout) viewM40395.findViewById(R.id.MT_Protector);
        this.f56819 = (TextView) viewM40395.findViewById(R.id.title);
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f56822 = c17771;
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, this);
        if (i != -1) {
            c2361.m8018(i, this);
        }
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f56820 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22427(new DialogInterface.OnKeyListener() { // from class: l.ܺۡᩴ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                this.f54030.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC8327M7999.m22426(this);
        c17771.m41595(str, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40983(View view) {
        this.f56821.addView(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40984(View view, int i) {
        this.f56821.addView(view, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40987() {
        this.f56822.m41603();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            return;
        }
        mo5599();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40981() {
        this.f56820.dismiss();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m40985() {
        return this.f56822.m41599().toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m40986() {
        C17771 c17771 = this.f56822;
        c17771.m41590();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f56820;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40982(int i) {
        this.f56819.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo5598();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17771 m40988() {
        return this.f56822;
    }
}
