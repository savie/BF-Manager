package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.֡۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5VF */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0424 implements View.OnClickListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceOnClickListenerC18046 f1929;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TextView f1930;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f1931;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1129 f1932;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f1933;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f1934;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EditText f1935;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f1936;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EditText f1937;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f1938 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC13125 f1939;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Spinner f1940;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC0424(ActivityC13125 activityC13125) {
        this.f1939 = activityC13125;
        this.f1932 = activityC13125.f43713;
        View viewM30995 = activityC13125.m30995(R.layout.MT_Protector);
        this.f1937 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.editText2);
        this.f1935 = editText;
        this.f1930 = (TextView) viewM30995.findViewById(R.id.textView2);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f1933 = textView;
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        this.f1940 = spinner;
        this.f1931 = viewM30995.findViewById(R.id.MT_Protector);
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = new DialogInterfaceOnClickListenerC18046(activityC13125, true);
        dialogInterfaceOnClickListenerC18046.m42043(new InterfaceC21574() { // from class: l.᩶۬ۖ
            @Override // l.InterfaceC21574
            /* JADX INFO: renamed from: ܰ */
            public final void mo14999(int i) {
                this.f65509.f1937.setText(String.format("%08X", Integer.valueOf(i)));
            }
        });
        this.f1929 = dialogInterfaceOnClickListenerC18046;
        C8067 c8067 = new C8067(activityC13125);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f1934 = c8067.m21252();
        spinner.setOnItemSelectedListener(this);
        editText.addTextChangedListener(this);
        ViewOnClickListenerC22523.m50034(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2215() {
        m2216(null, 0, 0, false);
        C16737.m39290(this.f1937);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2216(String str, int i, int i2, boolean z) {
        String strM16375;
        this.f1936 = z;
        C1129 c1129 = this.f1932;
        boolean zMo7644 = c1129.f5085.mo7644();
        View view = this.f1931;
        if (zMo7644) {
            view.setVisibility(0);
            EditText editText = this.f1935;
            if (z) {
                editText.setText(String.format("%08X", Integer.valueOf(i)));
            } else {
                editText.setText(String.format("%08X", Integer.valueOf(c1129.f5088.mo25193())));
            }
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f1934;
        dialogInterfaceC19356.m44362();
        if (this.f1938) {
            this.f1938 = false;
            dialogInterfaceC19356.m44373().setOnClickListener(this);
            dialogInterfaceC19356.m44361().setOnClickListener(this);
            C23250.m51309(dialogInterfaceC19356);
            ViewOnClickListenerC22523.m50034(this.f1930);
        }
        TextView textView = this.f1933;
        Spinner spinner = this.f1940;
        EditText editText2 = this.f1937;
        if (!z) {
            EnumC16653 enumC16653M4162 = c1129.m4162();
            if (enumC16653M4162 == EnumC16653.ENTRY || enumC16653M4162 == EnumC16653.SEARCH_BY_ID_IN || enumC16653M4162 == EnumC16653.SEARCH_VALUE_IN) {
                strM16375 = c1129.f5097.m16375(c1129.f5088.mo25193());
            } else {
                strM16375 = c1129.f5085.mo7645();
            }
            textView.setText(strM16375);
            C16435 c16435 = c1129.f5088;
            int iMo25192 = c16435.mo25192();
            switch (iMo25192) {
                case 1:
                    spinner.setSelection(1);
                    editText2.setText(String.format("%08X", Integer.valueOf(c16435.getValue())));
                    break;
                case 2:
                case 8:
                    spinner.setSelection(2);
                    editText2.setText(String.format("%08X", Integer.valueOf(c16435.getValue())));
                    break;
                case 3:
                    spinner.setSelection(0);
                    editText2.setText(c16435.mo25187().getValue());
                    break;
                case 4:
                    spinner.setSelection(7);
                    editText2.setText(C19475.m44533(c16435.getValue()));
                    break;
                case 5:
                    spinner.setSelection(8);
                    editText2.setText(C12479.m30979(c16435.getValue(), 1) + C12479.f41599[c16435.getValue() & 15]);
                    break;
                case 6:
                    spinner.setSelection(9);
                    int value = c16435.getValue() & 15;
                    editText2.setText(C12479.m30979(c16435.getValue(), C12479.f41601[value]) + C12479.f41600[value]);
                    break;
                case 7:
                    spinner.setSelection(10);
                    editText2.setText(String.format("%08X", Integer.valueOf(c16435.getValue())));
                    break;
                default:
                    switch (iMo25192) {
                        case 16:
                            spinner.setSelection(4);
                            editText2.setText(String.valueOf(c16435.getValue()));
                            break;
                        case 17:
                            spinner.setSelection(5);
                            editText2.setText(String.format("%X", Integer.valueOf(c16435.getValue())));
                            break;
                        case 18:
                            spinner.setSelection(6);
                            editText2.setText(c16435.getValue() != 0 ? "true" : "false");
                            break;
                        default:
                            switch (iMo25192) {
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    spinner.setSelection(3);
                                    editText2.setText(String.format("%08X", Integer.valueOf(c16435.getValue())));
                                    break;
                                default:
                                    spinner.setSelection(-1);
                                    editText2.setText("Unknown type");
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            textView.setText(R.string.MT_Protector);
            spinner.setSelection(i2);
            editText2.setText(str);
        }
        editText2.requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2214(String str) {
        if (C6461.m17648(str)) {
            return true;
        }
        this.f1937.requestFocus();
        C15829.m37611(R.string.MT_Protector);
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        EditText editText = this.f1937;
        if (id == 16908313) {
            String string = editText.getText().toString();
            EditText editText2 = this.f1935;
            String string2 = editText2.getText().toString();
            C1129 c1129 = this.f1932;
            if (c1129.f5085.mo7644() && !C6461.m17648(string2)) {
                editText2.requestFocus();
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            if (this.f1936) {
                c1129.f5088 = new C16435(c1129.f5085, 0, 0, -1);
            }
            C16435 c16435 = c1129.f5088;
            int selectedItemPosition = this.f1940.getSelectedItemPosition();
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f1934;
            switch (selectedItemPosition) {
                case 0:
                    c16435.m38687(string, null);
                    break;
                case 1:
                    if (!m2214(string)) {
                        return;
                    }
                    c16435.m38686(C6461.m17654(string));
                    c16435.m38684(1);
                    break;
                case 2:
                    if (!m2214(string)) {
                        return;
                    }
                    c16435.m38686(C6461.m17654(string));
                    c16435.m38684(2);
                    break;
                case 3:
                    if (!m2214(string)) {
                        return;
                    }
                    c16435.m38686(C6461.m17654(string));
                    c16435.m38684(28);
                    break;
                case 4:
                    try {
                        c16435.m38686(Integer.parseInt(string));
                        c16435.m38684(16);
                    } catch (NumberFormatException unused) {
                        editText.requestFocus();
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 5:
                    if (!m2214(string)) {
                        return;
                    }
                    c16435.m38686(C6461.m17654(string));
                    c16435.m38684(17);
                    break;
                case 6:
                    if (!string.equals("true") && !string.equals("false")) {
                        editText.requestFocus();
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    } else {
                        c16435.m38686(string.equals("true") ? 1 : 0);
                        c16435.m38684(18);
                    }
                    break;
                case 7:
                    try {
                        c16435.m38686(Float.floatToRawIntBits(Float.parseFloat(string)));
                        c16435.m38684(4);
                    } catch (NumberFormatException unused2) {
                        editText.requestFocus();
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 8:
                    C12812 c12812 = new C12812();
                    if (C6461.m17656(string, c12812) && c12812.f42661 == 5) {
                        c16435.m38686(c12812.f42662);
                        c16435.m38684(5);
                    } else {
                        editText.requestFocus();
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 9:
                    C12812 c12813 = new C12812();
                    if (C6461.m17656(string, c12813) && c12813.f42661 == 6) {
                        c16435.m38686(c12813.f42662);
                        c16435.m38684(6);
                    } else {
                        editText.requestFocus();
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 10:
                    if (!m2214(string)) {
                        return;
                    }
                    c16435.m38686(C6461.m17654(string));
                    c16435.m38684(7);
                    break;
                default:
                    dialogInterfaceC19356.dismiss();
                    return;
            }
            if (c1129.f5085.mo7644()) {
                c16435.m38685(C6461.m17654(string2));
            }
            if (this.f1936) {
                c1129.f5085.m42941(c16435);
            }
            dialogInterfaceC19356.dismiss();
            c1129.f5074 = true;
            this.f1939.f43711.notifyDataSetChanged();
            return;
        }
        String string3 = editText.getText().toString();
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = this.f1929;
        dialogInterfaceOnClickListenerC18046.getClass();
        dialogInterfaceOnClickListenerC18046.m42042(C6461.m17648(string3) ? C6461.m17654(string3) : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        EditText editText = this.f1937;
        switch (i) {
            case 0:
                editText.setInputType(131073);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                editText.setInputType(1);
                break;
            case 4:
                editText.setInputType(o.a.b);
                break;
            case 7:
                editText.setInputType(12290);
                break;
            default:
                editText.setEnabled(false);
                break;
        }
        this.f1934.m44361().setVisibility(i != 3 ? 8 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f1937.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        String strM16372 = null;
        try {
            if (C6461.m17648(string)) {
                strM16372 = this.f1932.f5097.m16372(C6461.m17654(string));
            }
        } catch (Exception unused) {
        }
        TextView textView = this.f1930;
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
