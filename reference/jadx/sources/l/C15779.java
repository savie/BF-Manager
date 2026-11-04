package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ܶۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15779 implements BiConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3101 f51359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f51360;

    public /* synthetic */ C15779(C3101 c3101, HashMap map) {
        this.f51359 = c3101;
        this.f51360 = map;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        AbstractC1566 abstractC1566 = (AbstractC1566) obj;
        AbstractC1566 abstractC1567 = (AbstractC1566) obj2;
        List listMo5541 = abstractC1567.mo5541();
        if (C4123.m13229((Collection) listMo5541)) {
            return;
        }
        int size = listMo5541.size();
        List listM10103 = this.f51359.m10103(abstractC1567);
        if (size == listM10103.size()) {
            String strMo5570 = abstractC1566.mo5570();
            HashMap map = this.f51360;
            Map map2 = (Map) map.get(strMo5570);
            HashMap map3 = new HashMap(size);
            for (int i = 0; i < size; i++) {
                AbstractC1566 abstractC1568 = (AbstractC1566) listMo5541.get(i);
                AbstractC1566 abstractC1569 = map2 != null ? (AbstractC1566) map2.get(abstractC1568) : null;
                AbstractC1566 abstractC15610 = (AbstractC1566) listM10103.get(i);
                if (abstractC1569 != null) {
                    abstractC1568 = abstractC1569;
                }
                map3.put(abstractC15610, abstractC1568);
            }
            map.put(abstractC1567.mo5570(), map3);
        }
    }
}
