package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5WS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20886 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f67828;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f67829;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f67830;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EditText f67831;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC13125 f67832;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f67833 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EditText f67834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f67835;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1129 f67836;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC20886(ActivityC13125 activityC13125) {
        this.f67832 = activityC13125;
        this.f67836 = activityC13125.f43713;
        View viewM30995 = activityC13125.m30995(R.layout.MT_Protector);
        this.f67831 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.editText2);
        this.f67834 = editText;
        this.f67829 = viewM30995.findViewById(R.id.MT_Protector);
        this.f67830 = (TextView) viewM30995.findViewById(R.id.textView2);
        editText.addTextChangedListener(this);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC13125);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f67835 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46937() {
        C1129 c1129 = this.f67836;
        C18551 c18551 = c1129.f5085;
        boolean z = c18551.mo7644() && c1129.f5083.getTypeName().equals("style");
        this.f67828 = z;
        View view = this.f67829;
        EditText editText = this.f67831;
        if (z) {
            view.setVisibility(0);
            editText.setText(c18551.mo7645());
            this.f67834.setText(String.format("%08X", Integer.valueOf(c18551.getParent())));
        } else {
            view.setVisibility(8);
            editText.setText(c18551.mo7645());
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f67835;
        dialogInterfaceC19356.m44362();
        if (this.f67833) {
            this.f67833 = false;
            dialogInterfaceC19356.m44373().setOnClickListener(this);
            ViewOnClickListenerC22523.m50034(this.f67830);
        }
        C16737.m39290(editText);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f67831;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C1129 c1129 = this.f67836;
        C18551 c18551 = c1129.f5085;
        if (this.f67828) {
            EditText editText2 = this.f67834;
            String string2 = editText2.getText().toString();
            if (!C6461.m17648(string2)) {
                editText2.requestFocus();
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            c18551.m42948(C6461.m17654(string2));
        }
        if (!string.equals(c18551.mo7645())) {
            c18551.m42938(string);
        }
        this.f67835.dismiss();
        this.f67832.f43711.notifyDataSetChanged();
        c1129.f5074 = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM16372;
        String string = editable.toString();
        if (C6461.m17648(string)) {
            strM16372 = this.f67836.f5097.m16372(C6461.m17654(string));
        } else {
            strM16372 = null;
        }
        TextView textView = this.f67830;
        if (strM16372 != null) {
            textView.setText(strM16372);
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
