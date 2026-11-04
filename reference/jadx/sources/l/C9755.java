package l;

import com.alipay.sdk.m.y.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C9755 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f31468;

    public C9755(Map map) {
        this.f31468 = map;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9755) && C17359.equals(this.f31468, ((C9755) obj).f31468);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f31468);
    }

    public final String toString() {
        Object[] objArr = {this.f31468};
        String[] strArrSplit = "files".length() == 0 ? new String[0] : "files".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9755.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25430(AbstractC7629 abstractC7629) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f31468);
            if (abstractC7629 instanceof C17036) {
                for (C11815 c11815 : ((C17036) abstractC7629).m40140()) {
                    if (!c11815.m29661()) {
                        return false;
                    }
                    AbstractC22044 abstractC22044M29659 = c11815.m29659();
                    C11392.putIfAbsent(linkedHashMap, abstractC22044M29659.mo4294(), new C3790(abstractC22044M29659.mo4294(), c11815.length(), c11815.m29660()));
                }
            }
            LinkedHashMap linkedHashMapM22302 = C8265.m22302(abstractC7629);
            if (!linkedHashMap.keySet().equals(linkedHashMapM22302.keySet())) {
                return false;
            }
            for (AbstractC22044 abstractC22044 : linkedHashMapM22302.values()) {
                if (!((C3790) linkedHashMap.get(abstractC22044.mo4294())).equals(C8265.m22300(abstractC22044))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
