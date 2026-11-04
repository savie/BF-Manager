package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes4.dex */
public class C16843 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f54299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object[] f54300;

    public C16843(AbstractC17589 abstractC17589) {
        Object[] objArr = new Object[abstractC17589.size()];
        Object[] objArr2 = new Object[abstractC17589.size()];
        AbstractC4516 it = abstractC17589.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f54299 = objArr;
        this.f54300 = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f54299;
        boolean z = objArr instanceof AbstractC8639;
        Object[] objArr2 = this.f54300;
        if (z) {
            AbstractC8639 abstractC8639 = (AbstractC8639) objArr;
            C25049 c25049Mo9087 = mo9087(abstractC8639.size());
            AbstractC4516 it = abstractC8639.iterator();
            AbstractC4516 it2 = ((AbstractC4911) objArr2).iterator();
            while (it.hasNext()) {
                c25049Mo9087.mo14569(it.next(), it2.next());
            }
            return c25049Mo9087.mo14570();
        }
        C25049 c25049Mo9088 = mo9087(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            c25049Mo9088.mo14569(objArr[i], objArr2[i]);
        }
        return c25049Mo9088.mo14570();
    }

    /* JADX INFO: renamed from: ۙ */
    public C25049 mo9087(int i) {
        return new C25049(i);
    }
}
