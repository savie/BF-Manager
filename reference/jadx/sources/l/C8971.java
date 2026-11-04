package l;

import android.content.Context;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 522K */
/* JADX INFO: loaded from: classes4.dex */
public final class C8971 extends C3906 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public long f29263;

    public C8971(Context context, ArrayList arrayList, long j) {
        super(context);
        m12577();
        m12580();
        m12604();
        m12606(EnumC5810.f19979);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            C3906 c3906 = (C3906) it.next();
            CharSequence charSequenceM12578 = c3906.m12578();
            boolean z = c3906 instanceof AbstractC16889;
            if (z && !TextUtils.isEmpty(charSequenceM12578)) {
                arrayList2.add((AbstractC16889) c3906);
            }
            if (arrayList2.contains(c3906.getParent())) {
                if (z) {
                    arrayList2.add((AbstractC16889) c3906);
                }
            } else if (!TextUtils.isEmpty(charSequenceM12578)) {
                string = string == null ? charSequenceM12578 : m12560().getString(R.string.MT_Protector, string, charSequenceM12578);
            }
        }
        mo12567(string);
        this.f29263 = j + 1000000;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        c1228.m4460(false);
    }

    @Override // l.C3906
    public final long getId() {
        return this.f29263;
    }
}
