package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5PU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC22702 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f73692;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f73693;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f73694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23255 f73695;

    /* JADX INFO: renamed from: ۤ */
    public void mo8571() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo8572();

    /* JADX INFO: renamed from: ᩸ */
    public void mo48383() {
    }

    public AbstractViewOnClickListenerC22702(AbstractActivityC17204 abstractActivityC17204, int i) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f73692 = (TextView) viewM40395.findViewById(R.id.title);
        this.f73694 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f73695 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۡᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f70874.mo8571();
            }
        });
        if (i != -1) {
            c2361.m8018(i, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f73693 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22425(new DialogInterface.OnCancelListener() { // from class: l.ۤۡᩴ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f34181.mo8571();
            }
        });
        C21232.m48398(dialogInterfaceC8327M7999);
        C5416.m16144(dialogInterfaceC8327M7999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51180() {
        this.f73693.dismiss();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m51185() {
        return this.f73695.m54021().toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m51182() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f73693;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        Button buttonM22440 = dialogInterfaceC8327.m22440();
        if (buttonM22440 != null) {
            buttonM22440.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۡᩴ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16819.mo48383();
                }
            });
        }
        C21576.m49090(this.f73695);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51186(String str) {
        this.f73695.mo52335((CharSequence) str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m51184() {
        this.f73695.m52289();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51181(String str) {
        TextView textView = this.f73694;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m51183() {
        this.f73692.setText(R.string.MT_Protector);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo8572();
    }
}
