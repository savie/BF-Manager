package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O60D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC9777 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f31514;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1255 f31515;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23255 f31516;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Spinner f31517;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f31518;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f31519;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Spinner f31520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f31521;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public AbstractDialogInterfaceOnClickListenerC9777(C8614 c8614, String str, boolean z, String str2) {
        Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c23255.mo52335((CharSequence) str);
        c23255.m54107(true);
        this.f31521 = viewM40395.findViewById(R.id.header3);
        this.f31516 = (C23255) viewM40395.findViewById(R.id.editTextView);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f31520 = spinner;
        Spinner spinner2 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        this.f31517 = spinner2;
        this.f31514 = viewM40395.findViewById(R.id.MT_Protector);
        this.f31519 = viewM40395.findViewById(R.id.MT_Protector);
        String[] stringArray = mainM23233.getResources().getStringArray(R.array.MT_Protector);
        String[] stringArray2 = mainM23233.getResources().getStringArray(R.array.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C3054(mainM23233, stringArray));
        spinner2.setAdapter((SpinnerAdapter) new C3054(mainM23233, stringArray2));
        String str3 = z ? "zacl" : "zcl";
        spinner.setSelection(Math.max(0, Math.min(ApplicationC17729.f58258.getInt(str3, z ? 6 : 3), stringArray.length - 1)));
        this.f31515 = (C1255) viewM40395.findViewById(R.id.switch1);
        C2361 c2361BuildDialog = mainM23233.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8026(R.string.MT_Protector, this);
        c2361BuildDialog.m8022(R.string.MT_Protector, this);
        if (z) {
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        this.f31518 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22426(new DialogInterfaceOnDismissListenerC7541(0, this, str3));
        dialogInterfaceC8327M8016.m22427(new DialogInterface.OnKeyListener() { // from class: l.ᩳ֨ܳ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC9777 abstractDialogInterfaceOnClickListenerC9777 = this.f60886;
                abstractDialogInterfaceOnClickListenerC9777.getClass();
                if (keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                abstractDialogInterfaceOnClickListenerC9777.f31518.dismiss();
                return true;
            }
        });
        if (z) {
            C0938.m3745(c8614, dialogInterfaceC8327M8016, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25492(String str) {
        this.f31514.setVisibility(0);
        this.f31516.mo52335((CharSequence) str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m25495() {
        return this.f31516.m54021().toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25491(int i) {
        String quantityString = C21576.m49055().getQuantityString(R.plurals.MT_Protector, i);
        C1255 c1255 = this.f31515;
        c1255.setText(quantityString);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("dzds", false));
        c1255.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25496() {
        this.f31519.setVisibility(8);
        this.f31517.setTranslationY(0.0f);
        this.f31521.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25490() {
        return this.f31520.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25493() {
        return this.f31517.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m25494() {
        return this.f31515.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25489(int i, C25179 c25179) {
        switch (i) {
            case 0:
                c25179.m56135(0);
                return false;
            case 1:
                c25179.m56121(1);
                return false;
            case 2:
                c25179.m56121(3);
                return false;
            case 3:
                c25179.m56121(-1);
                return false;
            case 4:
                c25179.m56121(9);
                return false;
            case 5:
                c25179.m56121(10);
                return false;
            case 6:
                c25179.m56121(-1);
                c25179.m56130();
                return true;
            default:
                return false;
        }
    }
}
