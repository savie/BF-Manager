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

/* JADX INFO: renamed from: l.ܽۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17375 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40816(ActivityC22597 activityC22597) {
        boolean[] zArr = new boolean[activityC22597.f73046.f33816.mo4328()];
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = activityC22597.f73046.f33818.mo9078().iterator();
            while (it.hasNext()) {
                zArr[((C13304) it.next()).mo23383()] = true;
            }
            for (C20017 c20017 : activityC22597.f73046.f33816.mo33925()) {
                if (c20017 != activityC22597.f73046.f33818) {
                    C16629 c16629 = null;
                    for (C13304 c13304 : c20017.mo9078()) {
                        if (!zArr[c13304.mo23383()]) {
                            if (c16629 == null) {
                                c16629 = new C16629(c20017);
                                arrayList.add(c16629);
                            }
                            c16629.f53766.add(c13304);
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                new ViewOnClickListenerC3205(activityC22597).m10547();
                return;
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((C16629) arrayList.get(i)).toString();
            }
            m40817(activityC22597, strArr, arrayList);
        } catch (Throwable th) {
            activityC22597.m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40817(final ActivityC22597 activityC22597, final String[] strArr, final ArrayList arrayList) {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC22597);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8014(strArr, new DialogInterface.OnClickListener() { // from class: l.ᩴۚ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final ArrayList arrayList2 = arrayList;
                final C16629 c16629 = (C16629) arrayList2.get(i2);
                final boolean[] zArr = new boolean[c16629.f53766.size()];
                final ActivityC22597 activityC22598 = activityC22597;
                View viewM40395 = activityC22598.m40395(R.layout.MT_Protector);
                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
                C18597.m43179(listView);
                listView.setDivider(null);
                final C11408 c11408 = new C11408(c16629, activityC22598, zArr);
                listView.setAdapter((ListAdapter) c11408);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۫ۚ᩸
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                        boolean[] zArr2 = zArr;
                        boolean z = zArr2[i3];
                        zArr2[i3] = !z;
                        view.setBackgroundColor(!z ? C3296.f10761 : 0);
                    }
                });
                final String[] strArr2 = strArr;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۚۚ᩸
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C17375.m40818(activityC22598, zArr, c16629, strArr2, arrayList2, i3);
                    }
                };
                int i3 = DialogInterfaceC8327.f27315;
                C2361 c2362 = new C2361(activityC22598);
                c2362.m8005(viewM40395);
                c2362.m8018(R.string.MT_Protector, onClickListener);
                c2362.m8026(R.string.MT_Protector, onClickListener);
                c2362.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2362.m8016().m22433().setOnClickListener(new View.OnClickListener() { // from class: l.֫ۚ᩸
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = 0;
                        while (true) {
                            boolean[] zArr2 = zArr;
                            if (i4 < zArr2.length) {
                                zArr2[i4] = !zArr2[i4];
                                i4++;
                            } else {
                                c11408.notifyDataSetChanged();
                                return;
                            }
                        }
                    }
                });
            }
        });
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۚ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new ViewOnClickListenerC3205(activityC22597).m10547();
            }
        });
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40818(ActivityC22597 activityC22597, boolean[] zArr, C16629 c16629, String[] strArr, ArrayList arrayList, int i) {
        if (i == -1) {
            int size = activityC22597.f73046.f33800.size();
            boolean z = false;
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (zArr[i2]) {
                    C13304 c13304 = (C13304) c16629.f53766.get(i2);
                    try {
                        C13304 c13304M46050 = activityC22597.f73046.f33818.m46050(c13304.mo23383());
                        c13304M46050.m32853((InterfaceC8697) c13304);
                        activityC22597.f73046.f33800.add(c13304M46050);
                        z = true;
                    } catch (Exception e) {
                        activityC22597.m40401(e, (DialogInterface.OnDismissListener) null);
                        z = true;
                    }
                }
            }
            if (z) {
                activityC22597.f73046.f33806 = true;
                activityC22597.f73050.notifyDataSetChanged();
                activityC22597.f73048.setSelection(size);
                return;
            }
            return;
        }
        m40817(activityC22597, strArr, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40815(int i) {
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        String string = Float.toString(fIntBitsToFloat);
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return string;
        }
        BigDecimal bigDecimal = new BigDecimal(string);
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toString();
    }
}
