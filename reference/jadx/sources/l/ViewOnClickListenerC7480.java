package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.i;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7480 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24917;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f24918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f24919;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EditText f24920;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC13125 f24921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EditText f24922;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EditText f24923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f24924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1129 f24925;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC7480(ActivityC13125 activityC13125) {
        this.f24921 = activityC13125;
        this.f24925 = activityC13125.f43713;
        View viewM30995 = activityC13125.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f24922 = editText;
        this.f24920 = (EditText) viewM30995.findViewById(R.id.editText2);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText3);
        this.f24923 = editText2;
        this.f24919 = (TextView) viewM30995.findViewById(R.id.textView3);
        this.f24918 = viewM30995.findViewById(R.id.MT_Protector);
        editText2.addTextChangedListener(this);
        editText.addTextChangedListener(new C10303(this));
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC13125);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f24924 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19981() {
        C0206 c0206 = this.f24925.f5083;
        this.f24917 = c0206.getTypeName().equals("style");
        this.f24922.setText(String.format("%04X", Integer.valueOf(c0206.mo1519())));
        EditText editText = this.f24920;
        editText.requestFocus();
        boolean z = this.f24917;
        View view = this.f24918;
        if (z) {
            view.setVisibility(0);
            this.f24923.setText("00000000");
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f24924;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        ViewOnClickListenerC22523.m50034(this.f24919);
        C16737.m39290(editText);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM17654;
        int iFloatToRawIntBits;
        int i;
        String str;
        C1129 c1129 = this.f24925;
        C0206 c0206 = c1129.f5083;
        ArrayList arrayList = c1129.f5082;
        C21373 c21373 = c1129.f5090;
        EditText editText = this.f24920;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        EditText editText2 = this.f24922;
        String string2 = editText2.getText().toString();
        if (!C6461.m17648(string2)) {
            editText2.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        int iM17655 = C6461.m17654(string2);
        if (this.f24917) {
            EditText editText3 = this.f24923;
            String string3 = editText3.getText().toString();
            if (!C6461.m17648(string3)) {
                editText3.requestFocus();
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            iM17654 = C6461.m17654(string3);
        } else {
            iM17654 = 0;
        }
        if (c1129.f5090.mo31756(iM17655)) {
            editText2.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        int iMo1519 = c0206.mo1519();
        ActivityC13125 activityC13125 = this.f24921;
        if (iM17655 > iMo1519) {
            editText2.requestFocus();
            C15829.m37613((CharSequence) activityC13125.getString(R.string.MT_Protector, Integer.valueOf(c0206.mo1519())));
            return;
        }
        if (iM17655 == c0206.mo1519()) {
            iM17655 = c0206.m1520(string);
        } else if (c0206.m1533(iM17655) == null) {
            try {
                c0206.m1525(iM17655, string);
            } catch (Exception unused) {
            }
        }
        try {
            C18551 c18551M47902 = c21373.m47902(iM17655);
            c1129.f5085 = c18551M47902;
            if (this.f24917) {
                c18551M47902.m42948(iM17654);
                c18551M47902.m42946(true);
            }
            arrayList.add(c18551M47902);
            String typeName = c0206.getTypeName();
            switch (typeName.hashCode()) {
                case -1724158635:
                    if (!typeName.equals("transition")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -1653751294:
                    if (!typeName.equals("fraction")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = 256;
                        i = 6;
                        c18551M47902.m42936(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case -1109722326:
                    if (!typeName.equals("layout")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -1073975672:
                    if (!typeName.equals("mipmap")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -891985903:
                    if (!typeName.equals("string")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = TextBundle.TEXT_ENTRY;
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -826507106:
                    if (!typeName.equals("drawable")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -795202841:
                    if (!typeName.equals("animator")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case -475309713:
                    if (!typeName.equals("plurals")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        c18551M47902.m42946(true);
                        c18551M47902.m42937("%d items", (C15606[]) null, 16777220);
                        c18551M47902.m42937("%d item", (C15606[]) null, 16777222);
                    }
                    break;
                case 3355:
                    if (!typeName.equals("id")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        c18551M47902.m42936(0, 18, -1);
                    }
                    break;
                case 112680:
                    if (!typeName.equals("raw")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case 118807:
                    if (!typeName.equals(DocumentReader.RESERVED)) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case 2998801:
                    if (!typeName.equals("anim")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case 3004913:
                    if (!typeName.equals("attr")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        c18551M47902.m42946(true);
                        c18551M47902.m42936(1, 16, 16777216);
                    }
                    break;
                case 3029738:
                    if (!typeName.equals("bool")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        c18551M47902.m42936(0, 18, -1);
                    }
                    break;
                case 3347807:
                    if (!typeName.equals("menu")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                case 93090393:
                    if (!typeName.equals("array")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        c18551M47902.m42946(true);
                        c18551M47902.m42937("Text", (C15606[]) null, 16777216);
                    }
                    break;
                case 94842723:
                    if (!typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = -15641191;
                        i = 28;
                        c18551M47902.m42936(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 95588145:
                    if (!typeName.equals("dimen")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = i.a;
                        i = 5;
                        c18551M47902.m42936(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 97526364:
                    if (!typeName.equals(ClassTransform.FLOAT)) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        i = 4;
                        c18551M47902.m42936(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 109780401:
                    if (!typeName.equals("style")) {
                        c18551M47902.m42936(1, 16, -1);
                    }
                    break;
                case 1958052158:
                    typeName.equals("integer");
                    c18551M47902.m42936(1, 16, -1);
                    break;
                case 2096253127:
                    if (!typeName.equals("interpolator")) {
                        c18551M47902.m42936(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18551M47902.m42937(str, (C15606[]) null, -1);
                    }
                    break;
                default:
                    c18551M47902.m42936(1, 16, -1);
                    break;
            }
            this.f24924.dismiss();
            activityC13125.f43711.notifyDataSetChanged();
            activityC13125.f43714.setSelection(arrayList.size() - 1);
            c1129.f5074 = true;
        } catch (Exception e) {
            activityC13125.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM16372;
        String string = editable.toString();
        if (C6461.m17648(string)) {
            strM16372 = this.f24925.f5097.m16372(C6461.m17654(string));
        } else {
            strM16372 = null;
        }
        TextView textView = this.f24919;
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
