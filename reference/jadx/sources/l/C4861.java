package l;

import com.alipay.sdk.m.y.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C4861 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f17113;

    public C4861(Map map) {
        this.f17113 = map;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4861) && C13638.equals(this.f17113, ((C4861) obj).f17113);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f17113);
    }

    public final String toString() {
        Object[] objArr = {this.f17113};
        String[] strArrSplit = "files".length() == 0 ? new String[0] : "files".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4861.class, sb, "[");
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
    public final boolean m13560(AbstractC9677 abstractC9677) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f17113);
            if (abstractC9677 instanceof C21920) {
                for (C23332 c23332 : ((C21920) abstractC9677).m48742()) {
                    if (!c23332.m51413()) {
                        return false;
                    }
                    AbstractC20745 abstractC20745M51411 = c23332.m51411();
                    C9735.putIfAbsent(linkedHashMap, abstractC20745M51411.mo33986(), new C5942(abstractC20745M51411.mo33986(), c23332.length(), c23332.m51412()));
                }
            }
            LinkedHashMap linkedHashMapM15358 = C5567.m15358(abstractC9677);
            if (!linkedHashMap.keySet().equals(linkedHashMapM15358.keySet())) {
                return false;
            }
            for (AbstractC20745 abstractC20745 : linkedHashMapM15358.values()) {
                if (!((C5942) linkedHashMap.get(abstractC20745.mo33986())).equals(C5567.m15377(abstractC20745))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
