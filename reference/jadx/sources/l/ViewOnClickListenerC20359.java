package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P5WS */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20359 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65297 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f65298;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23255 f65299;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10662 f65300;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f65301;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC22597 f65302;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65303;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23255 f65304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f65305;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC20359(ActivityC22597 activityC22597) {
        this.f65302 = activityC22597;
        this.f65300 = activityC22597.f73046;
        View viewM40395 = activityC22597.m40395(R.layout.MT_Protector);
        this.f65299 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f65304 = c23255;
        this.f65301 = viewM40395.findViewById(R.id.MT_Protector);
        this.f65298 = (TextView) viewM40395.findViewById(R.id.textView2);
        c23255.m53899(this);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC22597);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f65305 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46779() {
        C10662 c10662 = this.f65300;
        C13304 c13304 = c10662.f33815;
        boolean z = c13304.mo18155() && c10662.f33816.getTypeName().equals("style");
        this.f65303 = z;
        View view = this.f65301;
        C23255 c23255 = this.f65299;
        if (z) {
            view.setVisibility(0);
            c23255.mo52335((CharSequence) c13304.mo18156());
            this.f65304.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c13304.getParent())));
        } else {
            view.setVisibility(8);
            c23255.mo52335((CharSequence) c13304.mo18156());
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f65305;
        dialogInterfaceC8327.m22432();
        if (this.f65297) {
            this.f65297 = false;
            dialogInterfaceC8327.m22436().setOnClickListener(this);
            ViewOnClickListenerC15284.m36686(this.f65298);
        }
        C21576.m49090(c23255);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23255 c23255 = this.f65299;
        String string = c23255.m54021().toString();
        if (string.isEmpty()) {
            c23255.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C10662 c10662 = this.f65300;
        C13304 c13304 = c10662.f33815;
        if (this.f65303) {
            C23255 c23256 = this.f65304;
            String string2 = c23256.m54021().toString();
            if (!C11730.m29453(string2)) {
                c23256.requestFocus();
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            c13304.m32859(C11730.m29456(string2));
        }
        if (!string.equals(c13304.mo18156())) {
            c13304.m32850(string);
        }
        this.f65305.dismiss();
        this.f65302.f73050.notifyDataSetChanged();
        c10662.f33806 = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM48426;
        String string = editable.toString();
        if (C11730.m29453(string)) {
            strM48426 = this.f65300.f33807.m48426(C11730.m29456(string));
        } else {
            strM48426 = null;
        }
        TextView textView = this.f65298;
        if (strM48426 != null) {
            textView.setText(strM48426);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }
}
