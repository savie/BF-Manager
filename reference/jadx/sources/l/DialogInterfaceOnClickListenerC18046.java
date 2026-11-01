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
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC18046 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10758 f57695;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21574 f57696;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EditText f57697;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EditText f57698;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f57699;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EditText f57700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f57701;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f57702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EditText f57703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f57704 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EditText f57705;

    public DialogInterfaceOnClickListenerC18046(Context context, boolean z) {
        this.f57701 = z;
        View viewM30995 = context instanceof AbstractActivityC12483 ? ((AbstractActivityC12483) context).m30995(R.layout.MT_Protector) : LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(context);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, this);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f57702 = dialogInterfaceC19356M21252;
        C8875.m23019(dialogInterfaceC19356M21252);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        C10758 c10758 = (C10758) viewM30995.findViewById(R.id.MT_Protector);
        this.f57695 = c10758;
        c10758.m27064(new C16069(this));
        c10758.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3934(0, inputMethodManager));
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f57703 = editText;
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        this.f57700 = editText2;
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.editText3);
        this.f57698 = editText3;
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.editText4);
        this.f57697 = editText4;
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f57705 = editText5;
        if (!z) {
            c10758.m27065();
            viewM30995.findViewById(R.id.text1).setVisibility(8);
            editText.setVisibility(8);
        }
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(z ? 8 : 6), DigitsKeyListener.getInstance("0123456789abcdefABCDEF"), C16794.f53781});
        ViewOnFocusChangeListenerC6757 viewOnFocusChangeListenerC6757 = new ViewOnFocusChangeListenerC6757();
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC6757);
        editText2.setOnFocusChangeListener(viewOnFocusChangeListenerC6757);
        editText3.setOnFocusChangeListener(viewOnFocusChangeListenerC6757);
        editText4.setOnFocusChangeListener(viewOnFocusChangeListenerC6757);
        editText5.setOnFocusChangeListener(viewOnFocusChangeListenerC6757);
        C22986 c22986 = new C22986(this);
        editText.addTextChangedListener(c22986);
        editText2.addTextChangedListener(c22986);
        editText3.addTextChangedListener(c22986);
        editText4.addTextChangedListener(c22986);
        editText5.addTextChangedListener(new C15225(this));
        if (context instanceof Activity) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            dialogInterfaceC19356M21252.m44378().setType(2038);
        } else {
            dialogInterfaceC19356M21252.m44378().setType(2003);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42034(DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046, int i) {
        dialogInterfaceOnClickListenerC18046.m42033(i, true);
        if (dialogInterfaceOnClickListenerC18046.f57704) {
            DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceOnClickListenerC18046.f57702;
            dialogInterfaceOnClickListenerC18046.f57704 = false;
            dialogInterfaceC19356.m44372(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42033(int i, boolean z) {
        EditText editText = this.f57703;
        if (z || !editText.isFocused()) {
            String strValueOf = String.valueOf(Math.round((Color.alpha(i) * 100.0f) / 255.0f));
            if (!TextUtils.equals(strValueOf, editText.getText())) {
                this.f57699 = true;
                editText.setText(strValueOf);
                this.f57699 = false;
            }
        }
        EditText editText2 = this.f57700;
        if (z || !editText2.isFocused()) {
            String strValueOf2 = String.valueOf(Color.red(i));
            if (!TextUtils.equals(strValueOf2, editText2.getText())) {
                this.f57699 = true;
                editText2.setText(strValueOf2);
                this.f57699 = false;
            }
        }
        EditText editText3 = this.f57698;
        if (z || !editText3.isFocused()) {
            String strValueOf3 = String.valueOf(Color.green(i));
            if (!TextUtils.equals(strValueOf3, editText3.getText())) {
                this.f57699 = true;
                editText3.setText(strValueOf3);
                this.f57699 = false;
            }
        }
        EditText editText4 = this.f57697;
        if (z || !editText4.isFocused()) {
            String strValueOf4 = String.valueOf(Color.blue(i));
            if (!TextUtils.equals(strValueOf4, editText4.getText())) {
                this.f57699 = true;
                editText4.setText(strValueOf4);
                this.f57699 = false;
            }
        }
        EditText editText5 = this.f57705;
        if (z || !editText5.isFocused()) {
            String strSubstring = String.format("%08X", Integer.valueOf(i));
            if (!this.f57701) {
                strSubstring = strSubstring.substring(2);
            }
            if (TextUtils.equals(strSubstring, editText5.getText())) {
                return;
            }
            this.f57699 = true;
            editText5.setText(strSubstring);
            this.f57699 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42043(InterfaceC21574 interfaceC21574) {
        this.f57696 = interfaceC21574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42042(int i) {
        if (!this.f57701) {
            i |= -16777216;
        }
        this.f57695.m27063(i);
        m42033(i, true);
        this.f57702.m44362();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC21574 interfaceC21574 = this.f57696;
        if (interfaceC21574 != null) {
            interfaceC21574.mo14999(this.f57695.m27062());
        }
    }
}
