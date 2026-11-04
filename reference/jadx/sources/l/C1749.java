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

/* JADX INFO: renamed from: l.֫ۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1749 extends AbstractViewOnClickListenerC23950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f5959;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f5960;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f5961;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5962;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f5963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5964;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f5965;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749(C17410 c17410, Main main, ArrayList arrayList, C12915 c12915, ArrayList arrayList2, Main main2, C15102 c15102, boolean z, String str, AbstractC22044 abstractC22044) {
        super(main, arrayList, false, false);
        this.f5960 = c12915;
        this.f5962 = arrayList2;
        this.f5961 = main2;
        this.f5963 = c15102;
        this.f5959 = z;
        this.f5964 = str;
        this.f5965 = abstractC22044;
    }

    @Override // l.AbstractViewOnClickListenerC23950
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo6150() {
        String strM53486 = m53486();
        String strM53487 = m53487();
        String strM53489 = m53489();
        final C12915 c12915 = this.f5960;
        List<InterfaceC2386> listM31985 = c12915.m31985();
        C3700 c3700 = new C3700(listM31985.size(), true);
        for (InterfaceC2386 interfaceC2386 : listM31985) {
            if (!interfaceC2386.mo8106()) {
                c3700.m12021(interfaceC2386.getName());
            }
        }
        boolean zM53485 = m53485();
        Map map = Collections.EMPTY_MAP;
        final ArrayList arrayList = this.f5962;
        ArrayList<C13395> arrayListM17253 = C5938.m17253(arrayList, strM53486, strM53487, strM53489, zM53485, map);
        final ArrayList arrayListM17252 = C5938.m17252(arrayListM17253);
        C5938.m17254(c3700, arrayListM17252);
        ArrayList arrayList2 = new ArrayList(arrayListM17253.size());
        boolean z = false;
        for (C13395 c13395 : arrayListM17253) {
            if (!c13395.m33028()) {
                z = true;
            }
            arrayList2.add(c13395.m33023());
        }
        Main main = this.f5961;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setAdapter((ListAdapter) new C19131(R.layout.MT_Protector, main, arrayList2));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        if (strM53486.equals("{P}{S}") && m53487().isEmpty()) {
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else if (z) {
            m53484();
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else {
            m53484();
            final C15102 c15102 = this.f5963;
            final boolean z2 = this.f5959;
            final String str = this.f5964;
            final AbstractC22044 abstractC22044 = this.f5965;
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ۜ۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f41433.m6148(arrayList, arrayListM17252, c15102, z2, c12915, str, abstractC22044);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8679(2, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void m6148(ArrayList arrayList, ArrayList arrayList2, C15102 c15102, boolean z, final C12915 c12915, String str, final AbstractC22044 abstractC22044) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            map.put(interfaceC2386.getName(), Boolean.valueOf(interfaceC2386.isDirectory()));
        }
        final ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C13395 c13395 = (C13395) it2.next();
            arrayList3.add(new C11443(c13395.m33026(), c13395.m33027(), map.get(c13395.m33026()) == Boolean.TRUE, true));
        }
        m53481();
        final String strSubstring = c15102.m20218().substring(1);
        if (z) {
            C0938.m3749(new InterfaceC18837() { // from class: l.ۚۜ۫
                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo1268() {
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo1270(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final void mo1269(C9651 c9651, boolean z2) {
                    this.f19079.m53482();
                    List list = Collections.EMPTY_LIST;
                    C17410.m40882(c12915, abstractC22044, strSubstring, arrayList3, Collections.EMPTY_LIST, c9651, z2);
                }
            }, c12915.m31979(), str);
            return;
        }
        m53482();
        List list = Collections.EMPTY_LIST;
        C17410.m40882(c12915, abstractC22044, strSubstring, arrayList3, Collections.EMPTY_LIST, null, false);
    }
}
