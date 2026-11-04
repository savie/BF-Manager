package l;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩴᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BGD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20001 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f64263;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public C20001(HashMap map) {
        this.f64263 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC13487 abstractC13487 = (AbstractC13487) obj;
        AbstractC13487 abstractC13488 = (AbstractC13487) obj2;
        HashMap map = this.f64263;
        int iIntValue = ((Integer) map.get(abstractC13488)).intValue() - ((Integer) map.get(abstractC13487)).intValue();
        return iIntValue == 0 ? abstractC13487.compareTo(abstractC13488) : iIntValue;
    }
}
