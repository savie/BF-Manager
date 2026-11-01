package l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5PU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC14664 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f47957;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f47958;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f47959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EditText f47960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo35193() {
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo35196();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo35197() {
    }

    public AbstractViewOnClickListenerC14664(AbstractActivityC12483 abstractActivityC12483, int i) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f47959 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f47957 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f47960 = editText;
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧܿۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f37787.mo35197();
            }
        });
        if (i != -1) {
            c8067.m21271(i, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f47958 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44366(new DialogInterface.OnCancelListener() { // from class: l.᩻ܿۚ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f77036.mo35197();
            }
        });
        C8875.m23019(dialogInterfaceC19356M21252);
        C23250.m51309(dialogInterfaceC19356M21252);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35194() {
        this.f47958.dismiss();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m35199() {
        return this.f47960.getText().toString();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m35198() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f47958;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        Button buttonM44361 = dialogInterfaceC19356.m44361();
        if (buttonM44361 != null) {
            buttonM44361.setOnClickListener(new View.OnClickListener() { // from class: l.ۛܿۚ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21077.mo35193();
                }
            });
        }
        C16737.m39290(this.f47960);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35200(String str) {
        this.f47960.setText(str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35201() {
        this.f47960.selectAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35195(String str) {
        TextView textView = this.f47957;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m35192() {
        this.f47959.setText(R.string.MT_Protector);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo35196();
    }
}
