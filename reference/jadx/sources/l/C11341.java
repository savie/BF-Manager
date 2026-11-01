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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11341 extends AbstractViewOnClickListenerC8744 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f38265;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38266;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f38267;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f38268;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f38269;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f38270;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f38271;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11341(C0756 c0756, Main main, ArrayList arrayList, C21422 c21422, ArrayList arrayList2, Main main2, C13810 c13810, boolean z, String str, AbstractC20745 abstractC20745) {
        super(main, arrayList, false, false);
        this.f38267 = c21422;
        this.f38265 = arrayList2;
        this.f38268 = main2;
        this.f38269 = c13810;
        this.f38271 = z;
        this.f38266 = str;
        this.f38270 = abstractC20745;
    }

    @Override // l.AbstractViewOnClickListenerC8744
    /* JADX INFO: renamed from: ۬ */
    public final void mo22696() {
        String strM22698 = m22698();
        String strM22693 = m22693();
        String strM22690 = m22690();
        final C21422 c21422 = this.f38267;
        List<InterfaceC2557> listM47973 = c21422.m47973();
        C19430 c19430 = new C19430(listM47973.size(), true);
        for (InterfaceC2557 interfaceC2557 : listM47973) {
            if (!interfaceC2557.mo7980()) {
                c19430.m44466(interfaceC2557.getName());
            }
        }
        boolean zM22689 = m22689();
        Map map = Collections.EMPTY_MAP;
        final ArrayList arrayList = this.f38265;
        ArrayList<C13080> arrayListM11359 = C3906.m11359(arrayList, strM22698, strM22693, strM22690, zM22689, map);
        final ArrayList arrayListM11358 = C3906.m11358(arrayListM11359);
        C3906.m11361(c19430, arrayListM11358);
        ArrayList arrayList2 = new ArrayList(arrayListM11359.size());
        boolean z = false;
        for (C13080 c13080 : arrayListM11359) {
            if (!c13080.m32292()) {
                z = true;
            }
            arrayList2.add(c13080.m32293());
        }
        Main main = this.f38268;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setAdapter((ListAdapter) new C4406(R.layout.MT_Protector, main, arrayList2));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        if (strM22698.equals("{P}{S}") && m22693().isEmpty()) {
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else if (z) {
            m22694();
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
        } else {
            m22694();
            final C13810 c13810 = this.f38269;
            final boolean z2 = this.f38271;
            final String str = this.f38266;
            final AbstractC20745 abstractC20745 = this.f38270;
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ֡֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f15439.m28422(arrayList, arrayListM11358, c13810, z2, c21422, str, abstractC20745);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC13773(2, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void m28422(ArrayList arrayList, ArrayList arrayList2, C13810 c13810, boolean z, final C21422 c21422, String str, final AbstractC20745 abstractC20745) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            map.put(interfaceC2557.getName(), Boolean.valueOf(interfaceC2557.isDirectory()));
        }
        final ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C13080 c13080 = (C13080) it2.next();
            arrayList3.add(new C2167(c13080.m32296(), c13080.m32297(), map.get(c13080.m32296()) == Boolean.TRUE, true));
        }
        m22691();
        final String strSubstring = c13810.m28629().substring(1);
        if (z) {
            C11005.m27761(new InterfaceC17354() { // from class: l.ܰ֡֨
                @Override // l.InterfaceC17354
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo6537(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final void mo6536(C14558 c14558, boolean z2) {
                    this.f44517.m22692();
                    List list = Collections.EMPTY_LIST;
                    C0756.m3255(c21422, abstractC20745, strSubstring, arrayList3, Collections.EMPTY_LIST, c14558, z2);
                }
            }, c21422.m47980(), str);
            return;
        }
        m22692();
        List list = Collections.EMPTY_LIST;
        C0756.m3255(c21422, abstractC20745, strSubstring, arrayList3, Collections.EMPTY_LIST, null, false);
    }
}
