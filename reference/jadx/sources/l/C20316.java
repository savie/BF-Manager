package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20316 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f65800;

    public C20316(AbstractC6910 abstractC6910) {
        this.f65800 = abstractC6910;
    }

    public Object readResolve() {
        AbstractC6910 abstractC6910 = this.f65800;
        if (abstractC6910.isEmpty()) {
            return C0559.m2652();
        }
        C16083 c16083 = new C16083();
        AbstractC0477 it = abstractC6910.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c16083.m38111((C9548) entry.getKey(), entry.getValue());
        }
        return c16083.m38110();
    }
}
