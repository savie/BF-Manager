package l;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB8N */
/* JADX INFO: loaded from: classes5.dex */
public final class C19869 extends AbstractC15636 {
    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Intent mo1151(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C13465.m32966(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C13465.m32967(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ܰ */
    public final C20574 mo37314(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C13465.m32966(strArr, "input");
        if (strArr.length == 0) {
            return new C20574(C15477.f50426);
        }
        for (String str : strArr) {
            if (C10405.m26300(context, str) != 0) {
                return null;
            }
        }
        int iM44828 = C19710.m44828(strArr.length);
        if (iM44828 < 16) {
            iM44828 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM44828);
        for (String str2 : strArr) {
            C15083 c15083 = new C15083(str2, Boolean.TRUE);
            linkedHashMap.put(c15083.m36158(), c15083.m36156());
        }
        return new C20574(linkedHashMap);
    }

    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1152(Intent intent, int i) {
        if (i != -1) {
            return C15477.f50426;
        }
        if (intent == null) {
            return C15477.f50426;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C15477.f50426;
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
        ArrayList arrayList3 = new ArrayList(Math.min(C4892.m13614((Iterable) arrayList2), C4892.m13614((Iterable) arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C15083(it.next(), it2.next()));
        }
        return C19710.m44830(arrayList3);
    }
}
