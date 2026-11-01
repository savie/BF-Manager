package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4454 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinearLayout f15851;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f15852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f15853;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9160 f15854;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo12426() {
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo12431();

    public AbstractDialogInterfaceOnClickListenerC4454(AbstractActivityC12483 abstractActivityC12483, String str) {
        this(-1, abstractActivityC12483, str);
    }

    public AbstractDialogInterfaceOnClickListenerC4454(int i, AbstractActivityC12483 abstractActivityC12483, String str) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f15851 = (LinearLayout) viewM30995.findViewById(R.id.MT_Protector);
        this.f15853 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f15854 = c9160;
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, this);
        if (i != -1) {
            c8067.m21271(i, this);
        }
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f15852 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44368(new DialogInterface.OnKeyListener() { // from class: l.ۗܿۚ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                this.f12492.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC19356M21252.m44367(this);
        c9160.m23508(str, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12429(View view) {
        this.f15851.addView(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12430(View view, int i) {
        this.f15851.addView(view, i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m12434() {
        this.f15854.m23519();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            return;
        }
        mo12426();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12427() {
        this.f15852.dismiss();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m12432() {
        return this.f15854.m23513().toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m12425() {
        C9160 c9160 = this.f15854;
        c9160.m23503();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f15852;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12428(int i) {
        this.f15853.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo12431();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9160 m12433() {
        return this.f15854;
    }
}
