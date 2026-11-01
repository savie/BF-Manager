package l;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19745 extends AbstractViewOnClickListenerC8744 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f63446;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f63447;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f63448;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10573 f63449;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19745(C10573 c10573, Main main, ArrayList arrayList, C21422 c21422, ArrayList arrayList2, Main main2) {
        super(main, arrayList, false, false);
        this.f63449 = c10573;
        this.f63447 = c21422;
        this.f63446 = arrayList2;
        this.f63448 = main2;
    }

    @Override // l.AbstractViewOnClickListenerC8744
    /* JADX INFO: renamed from: ۬ */
    public final void mo22696() {
        String strM22698 = m22698();
        String strM22693 = m22693();
        String strM22690 = m22690();
        final C21422 c21422 = this.f63447;
        boolean zMo24615 = c21422.m47960().mo13029().mo24615();
        ArrayList arrayList = this.f63446;
        C19430 c19430 = new C19430(arrayList.size(), zMo24615);
        Iterator it = c21422.m47973().iterator();
        while (it.hasNext()) {
            c19430.m44466(((InterfaceC2557) it.next()).getName());
        }
        ArrayList<C13080> arrayListM11359 = C3906.m11359(arrayList, strM22698, strM22693, strM22690, m22689(), Collections.EMPTY_MAP);
        final ArrayList arrayListM11358 = C3906.m11358(arrayListM11359);
        C3906.m11361(c19430, arrayListM11358);
        final ArrayList arrayList2 = new ArrayList(arrayListM11359.size());
        boolean z = false;
        for (C13080 c13080 : arrayListM11359) {
            if (!c13080.m32292()) {
                z = true;
            }
            arrayList2.add(c13080.m32293());
        }
        Main main = this.f63448;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setAdapter((ListAdapter) new C4406(R.layout.MT_Protector, main, arrayList2));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        if (strM22698.equals("{P}{S}") && m22693().length() == 0) {
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else if (z) {
            m22694();
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else {
            m22694();
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩹֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C19745.m44915(this.f61580, c21422, arrayListM11358);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩹֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append(((Spanned) it2.next()).toString());
                    sb.append("\n");
                }
                C16737.m39272((CharSequence) sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44915(C19745 c19745, C21422 c21422, ArrayList arrayList) {
        c19745.m22692();
        c19745.m22691();
        C10573.m26742(c19745.f63449, c21422, arrayList);
    }
}
