package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes2.dex */
public class C4087 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f15003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object[] f15004;

    public C4087(AbstractC6910 abstractC6910) {
        Object[] objArr = new Object[abstractC6910.size()];
        Object[] objArr2 = new Object[abstractC6910.size()];
        AbstractC0477 it = abstractC6910.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f15003 = objArr;
        this.f15004 = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f15003;
        boolean z = objArr instanceof AbstractC23844;
        Object[] objArr2 = this.f15004;
        if (z) {
            AbstractC23844 abstractC23844 = (AbstractC23844) objArr;
            C13261 c13261Mo11628 = mo11628(abstractC23844.size());
            AbstractC0477 it = abstractC23844.iterator();
            AbstractC0477 it2 = ((AbstractC1826) objArr2).iterator();
            while (it.hasNext()) {
                c13261Mo11628.mo32741(it.next(), it2.next());
            }
            return c13261Mo11628.mo32742();
        }
        C13261 c13261Mo11629 = mo11628(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            c13261Mo11629.mo32741(objArr[i], objArr2[i]);
        }
        return c13261Mo11629.mo32742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13261 mo11628(int i) {
        return new C13261(i);
    }
}
