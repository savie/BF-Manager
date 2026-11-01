package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19475 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44534(ActivityC13125 activityC13125) {
        boolean[] zArr = new boolean[activityC13125.f43713.f5083.mo1519()];
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = activityC13125.f43713.f5090.mo31746().iterator();
            while (it.hasNext()) {
                zArr[((C18551) it.next()).mo10691()] = true;
            }
            for (C21373 c21373 : activityC13125.f43713.f5083.mo25271()) {
                if (c21373 != activityC13125.f43713.f5090) {
                    C8186 c8186 = null;
                    for (C18551 c18551 : c21373.mo31746()) {
                        if (!zArr[c18551.mo10691()]) {
                            if (c8186 == null) {
                                c8186 = new C8186(c21373);
                                arrayList.add(c8186);
                            }
                            c8186.f28538.add(c18551);
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                new ViewOnClickListenerC7480(activityC13125).m19981();
                return;
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((C8186) arrayList.get(i)).toString();
            }
            m44535(activityC13125, strArr, arrayList);
        } catch (Throwable th) {
            activityC13125.m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44535(final ActivityC13125 activityC13125, final String[] strArr, final ArrayList arrayList) {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC13125);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21267(strArr, new DialogInterface.OnClickListener() { // from class: l.ۘ۬ۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final ArrayList arrayList2 = arrayList;
                final C8186 c8186 = (C8186) arrayList2.get(i2);
                final boolean[] zArr = new boolean[c8186.f28538.size()];
                final ActivityC13125 activityC13126 = activityC13125;
                View viewM30995 = activityC13126.m30995(R.layout.MT_Protector);
                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
                C16754.m39314(listView);
                listView.setDivider(null);
                C18063 c18063 = new C18063(c8186, activityC13126, zArr);
                listView.setAdapter((ListAdapter) c18063);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩺۬ۖ
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                        boolean[] zArr2 = zArr;
                        boolean z = zArr2[i3];
                        zArr2[i3] = !z;
                        view.setBackgroundColor(!z ? C20368.f65992 : 0);
                    }
                });
                final String[] strArr2 = strArr;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܶ۬ۖ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C19475.m44536(activityC13126, zArr, c8186, strArr2, arrayList2, i3);
                    }
                };
                int i3 = DialogInterfaceC19356.f62401;
                C8067 c8068 = new C8067(activityC13126);
                c8068.m21258(viewM30995);
                c8068.m21271(R.string.MT_Protector, onClickListener);
                c8068.m21251(R.string.MT_Protector, onClickListener);
                c8068.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8068.m21269().m44374().setOnClickListener(new ViewOnClickListenerC21591(0, zArr, c18063));
            }
        });
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۬ۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new ViewOnClickListenerC7480(activityC13125).m19981();
            }
        });
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44536(ActivityC13125 activityC13125, boolean[] zArr, C8186 c8186, String[] strArr, ArrayList arrayList, int i) {
        if (i == -1) {
            int size = activityC13125.f43713.f5082.size();
            boolean z = false;
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (zArr[i2]) {
                    C18551 c18551 = (C18551) c8186.f28538.get(i2);
                    try {
                        C18551 c18551M47902 = activityC13125.f43713.f5090.m47902(c18551.mo10691());
                        c18551M47902.m42940((InterfaceC3609) c18551);
                        activityC13125.f43713.f5082.add(c18551M47902);
                        z = true;
                    } catch (Exception e) {
                        activityC13125.m31002(e, (DialogInterface.OnDismissListener) null);
                        z = true;
                    }
                }
            }
            if (z) {
                activityC13125.f43713.f5074 = true;
                activityC13125.f43711.notifyDataSetChanged();
                activityC13125.f43714.setSelection(size);
                return;
            }
            return;
        }
        m44535(activityC13125, strArr, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44533(int i) {
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        String string = Float.toString(fIntBitsToFloat);
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return string;
        }
        BigDecimal bigDecimal = new BigDecimal(string);
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toString();
    }
}
