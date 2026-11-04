package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.᩺ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5VF */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC24089 implements View.OnClickListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23255 f77881;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f77882;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23255 f77883;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10662 f77884;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f77885;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public TextView f77886;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Spinner f77887;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f77888;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f77889;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceOnClickListenerC6316 f77890;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f77891 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC22597 f77892;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC24089(ActivityC22597 activityC22597) {
        this.f77892 = activityC22597;
        this.f77884 = activityC22597.f73046;
        View viewM40395 = activityC22597.m40395(R.layout.MT_Protector);
        this.f77881 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f77883 = c23255;
        this.f77886 = (TextView) viewM40395.findViewById(R.id.textView2);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        this.f77882 = textView;
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        this.f77887 = spinner;
        this.f77888 = viewM40395.findViewById(R.id.MT_Protector);
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = new DialogInterfaceOnClickListenerC6316(activityC22597, true);
        dialogInterfaceOnClickListenerC6316.m18031(new InterfaceC12281() { // from class: l.ۛۚ᩸
            @Override // l.InterfaceC12281
            /* JADX INFO: renamed from: ۙ */
            public final void mo17031(int i) {
                this.f21082.f77881.mo52335((CharSequence) String.format("%08X", Integer.valueOf(i)));
            }
        });
        this.f77890 = dialogInterfaceOnClickListenerC6316;
        C2361 c2361 = new C2361(activityC22597);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f77885 = c2361.m7999();
        spinner.setOnItemSelectedListener(this);
        c23255.m53899(this);
        ViewOnClickListenerC15284.m36686(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53649() {
        m53650(null, 0, 0, false);
        C21576.m49090(this.f77881);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53650(String str, int i, int i2, boolean z) {
        String strM48430;
        this.f77889 = z;
        C10662 c10662 = this.f77884;
        boolean zMo18155 = c10662.f33815.mo18155();
        View view = this.f77888;
        if (zMo18155) {
            view.setVisibility(0);
            C23255 c23255 = this.f77883;
            if (z) {
                c23255.mo52335((CharSequence) String.format("%08X", Integer.valueOf(i)));
            } else {
                c23255.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c10662.f33798.mo16637())));
            }
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f77885;
        dialogInterfaceC8327.m22432();
        if (this.f77891) {
            this.f77891 = false;
            dialogInterfaceC8327.m22436().setOnClickListener(this);
            dialogInterfaceC8327.m22440().setOnClickListener(this);
            C5416.m16144(dialogInterfaceC8327);
            ViewOnClickListenerC15284.m36686(this.f77886);
        }
        TextView textView = this.f77882;
        C23255 c23256 = this.f77881;
        if (!z) {
            EnumC3951 enumC3951M27171 = c10662.m27171();
            if (enumC3951M27171 == EnumC3951.ENTRY || enumC3951M27171 == EnumC3951.SEARCH_BY_ID_IN || enumC3951M27171 == EnumC3951.SEARCH_VALUE_IN) {
                strM48430 = c10662.f33807.m48430(c10662.f33798.mo16637());
            } else {
                strM48430 = c10662.f33815.mo18156();
            }
            textView.setText(strM48430);
            C3609 c3609 = c10662.f33798;
            int iMo16635 = c3609.mo16635();
            switch (iMo16635) {
                case 1:
                    m53645(1);
                    c23256.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c3609.getValue())));
                    break;
                case 2:
                case 8:
                    m53645(2);
                    c23256.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c3609.getValue())));
                    break;
                case 3:
                    m53645(0);
                    c23256.mo52335((CharSequence) c3609.mo11710().getValue());
                    break;
                case 4:
                    m53645(7);
                    String strM40815 = C17375.m40815(c3609.getValue());
                    InterfaceC19106 interfaceC19106M54021 = c23256.m54021();
                    InputFilter[] filters = interfaceC19106M54021.getFilters();
                    interfaceC19106M54021.setFilters(new InputFilter[0]);
                    try {
                        c23256.mo52335((CharSequence) strM40815);
                        interfaceC19106M54021.setFilters(filters);
                    } catch (Throwable th) {
                        interfaceC19106M54021.setFilters(filters);
                        throw th;
                    }
                    break;
                case 5:
                    m53645(8);
                    c23256.mo52335((CharSequence) (C19431.m44924(c3609.getValue(), 1) + C19431.f62791[c3609.getValue() & 15]));
                    break;
                case 6:
                    m53645(9);
                    int value = c3609.getValue() & 15;
                    c23256.mo52335((CharSequence) (C19431.m44924(c3609.getValue(), C19431.f62793[value]) + C19431.f62792[value]));
                    break;
                case 7:
                    m53645(10);
                    c23256.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c3609.getValue())));
                    break;
                default:
                    switch (iMo16635) {
                        case 16:
                            m53645(4);
                            c23256.mo52335((CharSequence) String.valueOf(c3609.getValue()));
                            break;
                        case 17:
                            m53645(5);
                            c23256.mo52335((CharSequence) String.format("%X", Integer.valueOf(c3609.getValue())));
                            break;
                        case 18:
                            m53645(6);
                            c23256.mo52335((CharSequence) (c3609.getValue() != 0 ? "true" : "false"));
                            break;
                        default:
                            switch (iMo16635) {
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    m53645(3);
                                    c23256.mo52335((CharSequence) String.format("%08X", Integer.valueOf(c3609.getValue())));
                                    break;
                                default:
                                    m53645(-1);
                                    c23256.mo52335((CharSequence) "Unknown type");
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            textView.setText(R.string.MT_Protector);
            m53645(i2);
            if (i2 != 7) {
                c23256.mo52335((CharSequence) str);
            } else {
                InterfaceC19106 interfaceC19106M54022 = c23256.m54021();
                InputFilter[] filters2 = interfaceC19106M54022.getFilters();
                interfaceC19106M54022.setFilters(new InputFilter[0]);
                try {
                    c23256.mo52335((CharSequence) str);
                    interfaceC19106M54022.setFilters(filters2);
                } catch (Throwable th2) {
                    interfaceC19106M54022.setFilters(filters2);
                    throw th2;
                }
            }
        }
        c23256.requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53647(String str) {
        if (C11730.m29453(str)) {
            return true;
        }
        this.f77881.requestFocus();
        C22673.m51152(R.string.MT_Protector);
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
        C23255 c23255 = this.f77881;
        if (id == 16908313) {
            String string = c23255.m54021().toString();
            C23255 c23256 = this.f77883;
            String string2 = c23256.m54021().toString();
            C10662 c10662 = this.f77884;
            if (c10662.f33815.mo18155() && !C11730.m29453(string2)) {
                c23256.requestFocus();
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            if (this.f77889) {
                c10662.f33798 = new C3609(c10662.f33815, 0, 0, -1);
            }
            C3609 c3609 = c10662.f33798;
            int selectedItemPosition = this.f77887.getSelectedItemPosition();
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f77885;
            switch (selectedItemPosition) {
                case 0:
                    c3609.m11707(string, null);
                    break;
                case 1:
                    if (!m53647(string)) {
                        return;
                    }
                    c3609.m11706(C11730.m29456(string));
                    c3609.m11709(1);
                    break;
                case 2:
                    if (!m53647(string)) {
                        return;
                    }
                    c3609.m11706(C11730.m29456(string));
                    c3609.m11709(2);
                    break;
                case 3:
                    if (!m53647(string)) {
                        return;
                    }
                    c3609.m11706(C11730.m29456(string));
                    c3609.m11709(28);
                    break;
                case 4:
                    try {
                        c3609.m11706(Integer.parseInt(string));
                        c3609.m11709(16);
                    } catch (NumberFormatException unused) {
                        c23255.requestFocus();
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 5:
                    if (!m53647(string)) {
                        return;
                    }
                    c3609.m11706(C11730.m29456(string));
                    c3609.m11709(17);
                    break;
                case 6:
                    if (!string.equals("true") && !string.equals("false")) {
                        c23255.requestFocus();
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    } else {
                        c3609.m11706(string.equals("true") ? 1 : 0);
                        c3609.m11709(18);
                    }
                    break;
                case 7:
                    try {
                        c3609.m11706(Float.floatToRawIntBits(Float.parseFloat(string)));
                        c3609.m11709(4);
                    } catch (NumberFormatException unused2) {
                        c23255.requestFocus();
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 8:
                    C5765 c5765 = new C5765();
                    if (C11730.m29463(string, c5765) && c5765.f19814 == 5) {
                        c3609.m11706(c5765.f19813);
                        c3609.m11709(5);
                    } else {
                        c23255.requestFocus();
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 9:
                    C5765 c5766 = new C5765();
                    if (C11730.m29463(string, c5766) && c5766.f19814 == 6) {
                        c3609.m11706(c5766.f19813);
                        c3609.m11709(6);
                    } else {
                        c23255.requestFocus();
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 10:
                    if (!m53647(string)) {
                        return;
                    }
                    c3609.m11706(C11730.m29456(string));
                    c3609.m11709(7);
                    break;
                default:
                    dialogInterfaceC8327.dismiss();
                    return;
            }
            if (c10662.f33815.mo18155()) {
                c3609.m11711(C11730.m29456(string2));
            }
            if (this.f77889) {
                c10662.f33815.m32852(c3609);
            }
            dialogInterfaceC8327.dismiss();
            c10662.f33806 = true;
            this.f77892.f73050.notifyDataSetChanged();
            return;
        }
        String string3 = c23255.m54021().toString();
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = this.f77890;
        dialogInterfaceOnClickListenerC6316.getClass();
        dialogInterfaceOnClickListenerC6316.m18030(C11730.m29453(string3) ? C11730.m29456(string3) : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53645(int i) {
        this.f77887.setSelection(i);
        m53648(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        m53648(i);
        this.f77885.m22440().setVisibility(i == 3 ? 0 : 8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53648(int i) {
        C23255 c23255 = this.f77881;
        switch (i) {
            case 0:
                c23255.m52326(131073);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                c23255.m52326(1);
                break;
            case 4:
                c23255.m52326(o.a.b);
                break;
            case 7:
                c23255.m52326(12290);
                break;
            default:
                c23255.setEnabled(false);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f77881.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        String strM48426 = null;
        try {
            if (C11730.m29453(string)) {
                strM48426 = this.f77884.f33807.m48426(C11730.m29456(string));
            }
        } catch (Exception unused) {
        }
        TextView textView = this.f77886;
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
