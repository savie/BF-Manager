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

/* JADX INFO: renamed from: l.᩵ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes5.dex */
public final class C19164 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && !c21422.m47977() && c21422.m47968() && c21422.m47975() >= 2;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        final Main mainM47980 = c21422.m47980();
        final ArrayList arrayList = new ArrayList(c21422.m47979());
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC2557) it.next()).getSize();
        }
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۖ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextView textView3 = textView;
                ArrayList arrayList2 = arrayList;
                C12935.m32044(mainM47980, arrayList2, new RunnableC18522(2, textView3, arrayList2));
            }
        });
        final C0113 c0113 = new C0113();
        c0113.m1155();
        checkBox.setText(mainM47980.getResources().getQuantityString(R.plurals.MT_Protector, arrayList.size()));
        checkBox.setChecked(c0113.f1096);
        textView.setText(m43972(arrayList));
        textView2.setText(mainM47980.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())) + EnumC19730.f63352 + C1791.m5873(size));
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) arrayList.get(0);
        Matcher matcher = Pattern.compile("(.+)\\.\\d+").matcher(interfaceC2557.getName());
        if (matcher.matches()) {
            c10948.mo16989((CharSequence) matcher.group(1));
        } else {
            c10948.mo16989((CharSequence) ("merged_" + interfaceC2557.getName()));
        }
        C8067 c8067BuildDialog = mainM47980.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۖ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19164.m43974(c10948, c0113, checkBox, c21422, mainM47980, dialogInterfaceC19356M21269, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43974(C10948 c10948, C0113 c0113, final CheckBox checkBox, final C21422 c21422, Main main, final DialogInterfaceC19356 dialogInterfaceC19356, final ArrayList arrayList) {
        if (c10948.m16842() == 0) {
            c10948.requestFocus();
            return;
        }
        if (c0113.f1096 != checkBox.isChecked()) {
            c0113.f1096 = checkBox.isChecked();
            c0113.m1154();
        }
        String string = c10948.m17000().toString();
        final AbstractC20745 abstractC20745M15313 = C5553.m15313(c21422.m47959(), string);
        if (abstractC20745M15313.mo33975()) {
            C8067 c8067BuildDialog = main.buildDialog();
            c8067BuildDialog.m21277(string);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴۖ֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C19164.m43975(dialogInterfaceC19356, c21422, arrayList, abstractC20745M15313, checkBox);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        dialogInterfaceC19356.dismiss();
        m43976(c21422, arrayList, abstractC20745M15313, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43975(DialogInterfaceC19356 dialogInterfaceC19356, C21422 c21422, ArrayList arrayList, AbstractC20745 abstractC20745, CheckBox checkBox) {
        dialogInterfaceC19356.dismiss();
        m43976(c21422, arrayList, abstractC20745, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43976(C21422 c21422, ArrayList arrayList, AbstractC20745 abstractC20745, boolean z) {
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C7875.class);
        c10142.m25777(c21422);
        c10142.m25768("file", abstractC20745.mo33986());
        c10142.m25772(arrayList);
        c10142.m25769("removeSources", z);
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43972(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (sb.length() >= 200) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC2557.getName());
        }
        return sb.toString();
    }
}
