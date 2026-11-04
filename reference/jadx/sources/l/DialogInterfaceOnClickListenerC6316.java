package l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC6316 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f21403;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23255 f21404;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23255 f21405;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f21406;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC12281 f21407;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23255 f21408;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23255 f21409;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f21410;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21567 f21411;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23255 f21412;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21413 = true;

    public DialogInterfaceOnClickListenerC6316(Context context, boolean z) {
        this.f21410 = z;
        View viewM40395 = context instanceof AbstractActivityC17204 ? ((AbstractActivityC17204) context).m40395(R.layout.MT_Protector) : LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(context);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, this);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f21403 = dialogInterfaceC8327M7999;
        C21232.m48398(dialogInterfaceC8327M7999);
        final InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        C21567 c21567 = (C21567) viewM40395.findViewById(R.id.MT_Protector);
        this.f21411 = c21567;
        c21567.m49048(new C25360(this));
        c21567.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ܶۢᩴ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                if (z2) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f21412 = c23255;
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f21405 = c23256;
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.editText3);
        this.f21404 = c23257;
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.editText4);
        this.f21409 = c23258;
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f21408 = c23259;
        if (!z) {
            c21567.m49049();
            viewM40395.findViewById(R.id.text1).setVisibility(8);
            c23255.setVisibility(8);
        }
        c23259.m52304(new InputFilter[]{new InputFilter.LengthFilter(z ? 8 : 6), DigitsKeyListener.getInstance("0123456789abcdefABCDEF"), C14604.f46007});
        ViewOnFocusChangeListenerC23470 viewOnFocusChangeListenerC23470 = new ViewOnFocusChangeListenerC23470();
        c23255.setOnFocusChangeListener(viewOnFocusChangeListenerC23470);
        c23256.setOnFocusChangeListener(viewOnFocusChangeListenerC23470);
        c23257.setOnFocusChangeListener(viewOnFocusChangeListenerC23470);
        c23258.setOnFocusChangeListener(viewOnFocusChangeListenerC23470);
        c23259.setOnFocusChangeListener(viewOnFocusChangeListenerC23470);
        C3332 c3332 = new C3332(this);
        c23255.m53899(c3332);
        c23256.m53899(c3332);
        c23257.m53899(c3332);
        c23258.m53899(c3332);
        c23259.m53899(new C20486(this));
        if (context instanceof Activity) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            dialogInterfaceC8327M7999.m22435().setType(2038);
        } else {
            dialogInterfaceC8327M7999.m22435().setType(2003);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18020(DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316, int i) {
        dialogInterfaceOnClickListenerC6316.m18019(i, true);
        if (dialogInterfaceOnClickListenerC6316.f21413) {
            DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceOnClickListenerC6316.f21403;
            dialogInterfaceOnClickListenerC6316.f21413 = false;
            dialogInterfaceC8327.m22431(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m18019(int i, boolean z) {
        C23255 c23255 = this.f21412;
        if (z || !c23255.isFocused()) {
            String strValueOf = String.valueOf(Math.round((Color.alpha(i) * 100.0f) / 255.0f));
            if (!TextUtils.equals(strValueOf, c23255.m54021())) {
                this.f21406 = true;
                c23255.mo52335((CharSequence) strValueOf);
                this.f21406 = false;
            }
        }
        C23255 c23256 = this.f21405;
        if (z || !c23256.isFocused()) {
            String strValueOf2 = String.valueOf(Color.red(i));
            if (!TextUtils.equals(strValueOf2, c23256.m54021())) {
                this.f21406 = true;
                c23256.mo52335((CharSequence) strValueOf2);
                this.f21406 = false;
            }
        }
        C23255 c23257 = this.f21404;
        if (z || !c23257.isFocused()) {
            String strValueOf3 = String.valueOf(Color.green(i));
            if (!TextUtils.equals(strValueOf3, c23257.m54021())) {
                this.f21406 = true;
                c23257.mo52335((CharSequence) strValueOf3);
                this.f21406 = false;
            }
        }
        C23255 c23258 = this.f21409;
        if (z || !c23258.isFocused()) {
            String strValueOf4 = String.valueOf(Color.blue(i));
            if (!TextUtils.equals(strValueOf4, c23258.m54021())) {
                this.f21406 = true;
                c23258.mo52335((CharSequence) strValueOf4);
                this.f21406 = false;
            }
        }
        C23255 c23259 = this.f21408;
        if (z || !c23259.isFocused()) {
            String strSubstring = String.format("%08X", Integer.valueOf(i));
            if (!this.f21410) {
                strSubstring = strSubstring.substring(2);
            }
            if (TextUtils.equals(strSubstring, c23259.m54021())) {
                return;
            }
            this.f21406 = true;
            c23259.mo52335((CharSequence) strSubstring);
            this.f21406 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18031(InterfaceC12281 interfaceC12281) {
        this.f21407 = interfaceC12281;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18030(int i) {
        if (!this.f21410) {
            i |= -16777216;
        }
        this.f21411.m49047(i);
        m18019(i, true);
        this.f21403.m22432();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC12281 interfaceC12281 = this.f21407;
        if (interfaceC12281 != null) {
            interfaceC12281.mo17031(this.f21411.m49046());
        }
    }
}
