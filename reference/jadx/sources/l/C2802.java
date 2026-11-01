package l;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BGD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2802 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f10660;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public C2802(HashMap map) {
        this.f10660 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC9901 abstractC9901 = (AbstractC9901) obj;
        AbstractC9901 abstractC9902 = (AbstractC9901) obj2;
        HashMap map = this.f10660;
        int iIntValue = ((Integer) map.get(abstractC9902)).intValue() - ((Integer) map.get(abstractC9901)).intValue();
        return iIntValue == 0 ? abstractC9901.compareTo(abstractC9902) : iIntValue;
    }
}
