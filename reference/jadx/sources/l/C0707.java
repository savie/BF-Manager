package l;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: OB8N */
/* JADX INFO: loaded from: classes3.dex */
public final class C0707 extends AbstractC18606 {
    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent mo3028(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C15243.m36590(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C15243.m36591(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21590 mo3030(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C15243.m36590(strArr, "input");
        if (strArr.length == 0) {
            return new C21590(C11053.f34872);
        }
        for (String str : strArr) {
            if (C7508.m20559(context, str) != 0) {
                return null;
            }
        }
        int iM17020 = C5834.m17020(strArr.length);
        if (iM17020 < 16) {
            iM17020 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM17020);
        for (String str2 : strArr) {
            C21914 c21914 = new C21914(str2, Boolean.TRUE);
            linkedHashMap.put(c21914.m49601(), c21914.m49603());
        }
        return new C21590(linkedHashMap);
    }

    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo3029(Intent intent, int i) {
        if (i != -1) {
            return C11053.f34872;
        }
        if (intent == null) {
            return C11053.f34872;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C11053.f34872;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(C7743.m21084((Iterable) arrayList2), C7743.m21084((Iterable) arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C21914(it.next(), it2.next()));
        }
        return C5834.m17022(arrayList3);
    }
}
