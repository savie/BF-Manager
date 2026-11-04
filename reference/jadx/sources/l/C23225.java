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

/* JADX INFO: renamed from: l.᩹֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes.dex */
public final class C23225 extends AbstractViewOnClickListenerC23950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f75234;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f75235;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Map f75236;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f75237;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f75238;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20241 f75239;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f75240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23225(C20241 c20241, Main main, ArrayList arrayList, boolean z, boolean z2, C12915 c12915, ArrayList arrayList2, Main main2) {
        super(main, arrayList, z, z2);
        this.f75239 = c20241;
        this.f75238 = c12915;
        this.f75235 = arrayList2;
        this.f75240 = main2;
        this.f75234 = false;
        this.f75237 = false;
        this.f75236 = Collections.EMPTY_MAP;
    }

    @Override // l.AbstractViewOnClickListenerC23950
    /* JADX INFO: renamed from: ۚ */
    public final void mo6150() {
        String strM53486 = m53486();
        boolean z = !this.f75234 && C16602.m39285(strM53486);
        boolean z2 = !this.f75237 && strM53486.contains("{E}");
        if (!z && !z2) {
            m52139(strM53486);
        } else {
            new C15765(this, z, z2, strM53486).m8197();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52139(String str) {
        String strM53487 = m53487();
        String strM53489 = m53489();
        final C12915 c12915 = this.f75238;
        boolean z = false;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c12915.m31978(), new String[0]);
        List listMo4299 = abstractC22044M35193.mo4299(true);
        boolean zM35200 = C14584.m35200(abstractC22044M35193, listMo4299);
        ArrayList arrayList = this.f75235;
        C3700 c3700 = new C3700(arrayList.size(), zM35200);
        Iterator it = listMo4299.iterator();
        while (it.hasNext()) {
            c3700.m12021(((AbstractC22044) it.next()).getName());
        }
        ArrayList<C13395> arrayListM17253 = C5938.m17253(arrayList, str, strM53487, strM53489, m53485(), this.f75236);
        final ArrayList arrayListM17252 = C5938.m17252(arrayListM17253);
        C5938.m17254(c3700, arrayListM17252);
        ArrayList arrayList2 = new ArrayList(arrayListM17253.size());
        for (C13395 c13395 : arrayListM17253) {
            if (!c13395.m33028()) {
                z = true;
            }
            arrayList2.add(c13395.m33023());
        }
        Main main = this.f75240;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setAdapter((ListAdapter) new C19131(R.layout.MT_Protector, main, arrayList2));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        if (str.equals("{P}{S}") && m53487().isEmpty()) {
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else if (z) {
            m53484();
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else {
            m53484();
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ֫۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C23225.m52141(this.f56217, c12915, arrayListM17252);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC7876(5, arrayList2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52141(C23225 c23225, C12915 c12915, ArrayList arrayList) {
        c23225.m53482();
        c23225.m53481();
        C20241.m46511(c23225.f75239, c12915, arrayList);
    }
}
