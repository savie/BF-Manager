package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.i;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3205 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23255 f10450;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f10451;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23255 f10452;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10662 f10453;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f10454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC22597 f10455;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10456;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23255 f10457;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f10458;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC3205(ActivityC22597 activityC22597) {
        this.f10455 = activityC22597;
        this.f10453 = activityC22597.f73046;
        View viewM40395 = activityC22597.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f10450 = c23255;
        this.f10452 = (C23255) viewM40395.findViewById(R.id.editText2);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText3);
        this.f10457 = c23256;
        this.f10451 = (TextView) viewM40395.findViewById(R.id.textView3);
        this.f10454 = viewM40395.findViewById(R.id.MT_Protector);
        c23256.m53899(this);
        c23255.m53899(new C23343(this));
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC22597);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f10458 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10547() {
        C23747 c23747 = this.f10453.f33816;
        this.f10456 = c23747.getTypeName().equals("style");
        this.f10450.mo52335((CharSequence) String.format("%04X", Integer.valueOf(c23747.mo4328())));
        C23255 c23255 = this.f10452;
        c23255.requestFocus();
        boolean z = this.f10456;
        View view = this.f10454;
        if (z) {
            view.setVisibility(0);
            this.f10457.mo52335((CharSequence) "00000000");
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f10458;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        ViewOnClickListenerC15284.m36686(this.f10451);
        C21576.m49090(c23255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM29456;
        int iFloatToRawIntBits;
        int i;
        String str;
        C10662 c10662 = this.f10453;
        C23747 c23747 = c10662.f33816;
        ArrayList arrayList = c10662.f33800;
        C20017 c20017 = c10662.f33818;
        C23255 c23255 = this.f10452;
        String string = c23255.m54021().toString();
        if (string.isEmpty()) {
            c23255.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C23255 c23256 = this.f10450;
        String string2 = c23256.m54021().toString();
        if (!C11730.m29453(string2)) {
            c23256.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        int iM29457 = C11730.m29456(string2);
        if (this.f10456) {
            C23255 c23257 = this.f10457;
            String string3 = c23257.m54021().toString();
            if (!C11730.m29453(string3)) {
                c23257.requestFocus();
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            iM29456 = C11730.m29456(string3);
        } else {
            iM29456 = 0;
        }
        if (c10662.f33818.mo9075(iM29457)) {
            c23256.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        int iMo4328 = c23747.mo4328();
        ActivityC22597 activityC22597 = this.f10455;
        if (iM29457 > iMo4328) {
            c23256.requestFocus();
            C22673.m51154((CharSequence) activityC22597.getString(R.string.MT_Protector, Integer.valueOf(c23747.mo4328())));
            return;
        }
        if (iM29457 == c23747.mo4328()) {
            iM29457 = c23747.m53012(string);
        } else if (c23747.m53021(iM29457) == null) {
            try {
                c23747.m53015(iM29457, string);
            } catch (Exception unused) {
            }
        }
        try {
            C13304 c13304M46050 = c20017.m46050(iM29457);
            c10662.f33815 = c13304M46050;
            if (this.f10456) {
                c13304M46050.m32859(iM29456);
                c13304M46050.m32860(true);
            }
            arrayList.add(c13304M46050);
            String typeName = c23747.getTypeName();
            switch (typeName.hashCode()) {
                case -1724158635:
                    if (!typeName.equals("transition")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -1653751294:
                    if (!typeName.equals("fraction")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = 256;
                        i = 6;
                        c13304M46050.m32848(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case -1109722326:
                    if (!typeName.equals("layout")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -1073975672:
                    if (!typeName.equals("mipmap")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -891985903:
                    if (!typeName.equals("string")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = TextBundle.TEXT_ENTRY;
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -826507106:
                    if (!typeName.equals("drawable")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -795202841:
                    if (!typeName.equals("animator")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case -475309713:
                    if (!typeName.equals("plurals")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        c13304M46050.m32860(true);
                        c13304M46050.m32849("%d items", (C25042[]) null, 16777220);
                        c13304M46050.m32849("%d item", (C25042[]) null, 16777222);
                    }
                    break;
                case 3355:
                    if (!typeName.equals("id")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        c13304M46050.m32848(0, 18, -1);
                    }
                    break;
                case 112680:
                    if (!typeName.equals("raw")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case 118807:
                    if (!typeName.equals(DocumentReader.RESERVED)) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case 2998801:
                    if (!typeName.equals("anim")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case 3004913:
                    if (!typeName.equals("attr")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        c13304M46050.m32860(true);
                        c13304M46050.m32848(1, 16, 16777216);
                    }
                    break;
                case 3029738:
                    if (!typeName.equals("bool")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        c13304M46050.m32848(0, 18, -1);
                    }
                    break;
                case 3347807:
                    if (!typeName.equals("menu")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                case 93090393:
                    if (!typeName.equals("array")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        c13304M46050.m32860(true);
                        c13304M46050.m32849("Text", (C25042[]) null, 16777216);
                    }
                    break;
                case 94842723:
                    if (!typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = -15641191;
                        i = 28;
                        c13304M46050.m32848(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 95588145:
                    if (!typeName.equals("dimen")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = i.a;
                        i = 5;
                        c13304M46050.m32848(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 97526364:
                    if (!typeName.equals(ClassTransform.FLOAT)) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        i = 4;
                        c13304M46050.m32848(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 109780401:
                    if (!typeName.equals("style")) {
                        c13304M46050.m32848(1, 16, -1);
                    }
                    break;
                case 1958052158:
                    typeName.equals("integer");
                    c13304M46050.m32848(1, 16, -1);
                    break;
                case 2096253127:
                    if (!typeName.equals("interpolator")) {
                        c13304M46050.m32848(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c13304M46050.m32849(str, (C25042[]) null, -1);
                    }
                    break;
                default:
                    c13304M46050.m32848(1, 16, -1);
                    break;
            }
            this.f10458.dismiss();
            activityC22597.f73050.notifyDataSetChanged();
            activityC22597.f73048.setSelection(arrayList.size() - 1);
            c10662.f33806 = true;
        } catch (Exception e) {
            activityC22597.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM48426;
        String string = editable.toString();
        if (C11730.m29453(string)) {
            strM48426 = this.f10453.f33807.m48426(C11730.m29456(string));
        } else {
            strM48426 = null;
        }
        TextView textView = this.f10451;
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
