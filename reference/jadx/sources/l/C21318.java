package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21318 extends AbstractViewOnClickListenerC8744 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f69361;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18496 f69362;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f69363;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Map f69364;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f69365;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f69366;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f69367;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21318(C18496 c18496, Main main, ArrayList arrayList, boolean z, boolean z2, C21422 c21422, ArrayList arrayList2, Main main2) {
        super(main, arrayList, z, z2);
        this.f69362 = c18496;
        this.f69365 = c21422;
        this.f69363 = arrayList2;
        this.f69366 = main2;
        this.f69367 = false;
        this.f69361 = false;
        this.f69364 = Collections.EMPTY_MAP;
    }

    @Override // l.AbstractViewOnClickListenerC8744
    /* JADX INFO: renamed from: ۬ */
    public final void mo22696() {
        String strM22698 = m22698();
        boolean z = !this.f69367 && (strM22698.contains("{AN}") || strM22698.contains("{AP}") || strM22698.contains("{AV}") || strM22698.contains("{AC}"));
        boolean z2 = !this.f69361 && strM22698.contains("{E}");
        if (!z && !z2) {
            m47811(strM22698);
        } else {
            new C14969(this, z, z2, strM22698).m10243();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47811(String str) {
        String strM22693 = m22693();
        String strM22690 = m22690();
        final C21422 c21422 = this.f69365;
        boolean z = false;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c21422.m47959(), new String[0]);
        List listMo33983 = abstractC20745M15313.mo33983(true);
        boolean zM15321 = C5553.m15321(abstractC20745M15313, listMo33983);
        ArrayList arrayList = this.f69363;
        C19430 c19430 = new C19430(arrayList.size(), zM15321);
        Iterator it = listMo33983.iterator();
        while (it.hasNext()) {
            c19430.m44466(((AbstractC20745) it.next()).getName());
        }
        ArrayList<C13080> arrayListM11359 = C3906.m11359(arrayList, str, strM22693, strM22690, m22689(), this.f69364);
        final ArrayList arrayListM11358 = C3906.m11358(arrayListM11359);
        C3906.m11361(c19430, arrayListM11358);
        ArrayList arrayList2 = new ArrayList(arrayListM11359.size());
        for (C13080 c13080 : arrayListM11359) {
            if (!c13080.m32292()) {
                z = true;
            }
            arrayList2.add(c13080.m32293());
        }
        Main main = this.f69366;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setAdapter((ListAdapter) new C4406(R.layout.MT_Protector, main, arrayList2));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        if (str.equals("{P}{S}") && m22693().isEmpty()) {
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else if (z) {
            m22694();
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else {
            m22694();
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۗ᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C21318.m47813(this.f74046, c21422, arrayListM11358);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC22460(4, arrayList2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47813(C21318 c21318, C21422 c21422, ArrayList arrayList) {
        c21318.m22692();
        c21318.m22691();
        C18496.m42891(c21318.f69362, c21422, arrayList);
    }
}
