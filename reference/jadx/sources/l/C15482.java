package l;

import android.content.Context;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 522K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15482 extends C4751 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f50458;

    public C15482(Context context, ArrayList arrayList, long j) {
        super(context);
        m13171();
        m13160();
        m13163();
        m13129(EnumC12167.f40728);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            C4751 c4751 = (C4751) it.next();
            CharSequence charSequenceM13158 = c4751.m13158();
            boolean z = c4751 instanceof AbstractC12514;
            if (z && !TextUtils.isEmpty(charSequenceM13158)) {
                arrayList2.add((AbstractC12514) c4751);
            }
            if (arrayList2.contains(c4751.getParent())) {
                if (z) {
                    arrayList2.add((AbstractC12514) c4751);
                }
            } else if (!TextUtils.isEmpty(charSequenceM13158)) {
                string = string == null ? charSequenceM13158 : m13133().getString(R.string.MT_Protector, string, charSequenceM13158);
            }
        }
        mo13141(string);
        this.f50458 = j + 1000000;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        c4170.m11810(false);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֨ */
    public final long mo13126() {
        return this.f50458;
    }
}
