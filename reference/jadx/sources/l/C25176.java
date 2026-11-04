package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes.dex */
public final class C25176 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && !c12915.m31988() && c12915.m31977() && c12915.m31981() >= 2;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        final Main mainM31979 = c12915.m31979();
        final ArrayList arrayList = new ArrayList(c12915.m31982());
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC2386) it.next()).getSize();
        }
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC6134(mainM31979, arrayList, textView, 1));
        final C12495 c12495 = new C12495();
        c12495.m31035();
        checkBox.setText(mainM31979.getResources().getQuantityString(R.plurals.MT_Protector, arrayList.size()));
        checkBox.setChecked(c12495.f40127);
        textView.setText(m56095(arrayList));
        textView2.setText(mainM31979.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())) + EnumC7687.f25319 + C8311.m22393(size));
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) arrayList.get(0);
        Matcher matcher = Pattern.compile("(.+)\\.\\d+").matcher(interfaceC2386.getName());
        if (matcher.matches()) {
            c23255.mo52335((CharSequence) matcher.group(1));
        } else {
            c23255.mo52335((CharSequence) ("merged_" + interfaceC2386.getName()));
        }
        C2361 c2361BuildDialog = mainM31979.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۚܽ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25176.m56099(c23255, c12495, checkBox, c12915, mainM31979, dialogInterfaceC8327M8016, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56099(C23255 c23255, C12495 c12495, final CheckBox checkBox, final C12915 c12915, Main main, final DialogInterfaceC8327 dialogInterfaceC8327, final ArrayList arrayList) {
        if (c23255.m54099() == 0) {
            c23255.requestFocus();
            return;
        }
        if (c12495.f40127 != checkBox.isChecked()) {
            c12495.f40127 = checkBox.isChecked();
            c12495.m31036();
        }
        String string = c23255.m54021().toString();
        final AbstractC22044 abstractC22044M35193 = C14584.m35193(c12915.m31978(), string);
        if (abstractC22044M35193.mo2934()) {
            C2361 c2361BuildDialog = main.buildDialog();
            c2361BuildDialog.m8024(string);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ܽ۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C25176.m56097(dialogInterfaceC8327, c12915, arrayList, abstractC22044M35193, checkBox);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        dialogInterfaceC8327.dismiss();
        m56098(c12915, arrayList, abstractC22044M35193, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56097(DialogInterfaceC8327 dialogInterfaceC8327, C12915 c12915, ArrayList arrayList, AbstractC22044 abstractC22044, CheckBox checkBox) {
        dialogInterfaceC8327.dismiss();
        m56098(c12915, arrayList, abstractC22044, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56098(C12915 c12915, ArrayList arrayList, AbstractC22044 abstractC22044, boolean z) {
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C11749.class);
        c8458.m22728(c12915);
        c8458.m22719("file", abstractC22044.mo4294());
        c8458.m22723(arrayList);
        c8458.m22720("removeSources", z);
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56095(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (sb.length() >= 200) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC2386.getName());
        }
        return sb.toString();
    }
}
