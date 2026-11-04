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

/* JADX INFO: renamed from: l.ۧ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11925 extends AbstractViewOnClickListenerC23950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17146 f38417;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f38418;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f38419;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f38420;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11925(C17146 c17146, Main main, ArrayList arrayList, C12915 c12915, ArrayList arrayList2, Main main2) {
        super(main, arrayList, false, false);
        this.f38417 = c17146;
        this.f38420 = c12915;
        this.f38419 = arrayList2;
        this.f38418 = main2;
    }

    @Override // l.AbstractViewOnClickListenerC23950
    /* JADX INFO: renamed from: ۚ */
    public final void mo6150() {
        String strM53486 = m53486();
        String strM53487 = m53487();
        String strM53489 = m53489();
        final C12915 c12915 = this.f38420;
        boolean zMo20839 = c12915.m31987().mo10174().mo20839();
        ArrayList arrayList = this.f38419;
        C3700 c3700 = new C3700(arrayList.size(), zMo20839);
        Iterator it = c12915.m31985().iterator();
        while (it.hasNext()) {
            c3700.m12021(((InterfaceC2386) it.next()).getName());
        }
        ArrayList<C13395> arrayListM17253 = C5938.m17253(arrayList, strM53486, strM53487, strM53489, m53485(), Collections.EMPTY_MAP);
        final ArrayList arrayListM17252 = C5938.m17252(arrayListM17253);
        C5938.m17254(c3700, arrayListM17252);
        final ArrayList arrayList2 = new ArrayList(arrayListM17253.size());
        boolean z = false;
        for (C13395 c13395 : arrayListM17253) {
            if (!c13395.m33028()) {
                z = true;
            }
            arrayList2.add(c13395.m33023());
        }
        Main main = this.f38418;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setAdapter((ListAdapter) new C19131(R.layout.MT_Protector, main, arrayList2));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        if (strM53486.equals("{P}{S}") && m53487().length() == 0) {
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else if (z) {
            m53484();
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
        } else {
            m53484();
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ᩹۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C11925.m29883(this.f20406, c12915, arrayListM17252);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.֫᩹۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append(((Spanned) it2.next()).toString());
                    sb.append("\n");
                }
                C21576.m49067((CharSequence) sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29883(C11925 c11925, C12915 c12915, ArrayList arrayList) {
        c11925.m53482();
        c11925.m53481();
        C17146.m40287(c11925.f38417, c12915, arrayList);
    }
}
