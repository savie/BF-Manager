package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.֡۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0436 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f2002;

    public C0436(AbstractC17589 abstractC17589) {
        this.f2002 = abstractC17589;
    }

    public Object readResolve() {
        AbstractC17589 abstractC17589 = this.f2002;
        if (abstractC17589.isEmpty()) {
            return C7894.m21435();
        }
        C18335 c18335 = new C18335();
        AbstractC4516 it = abstractC17589.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c18335.m42789((C2346) entry.getKey(), entry.getValue());
        }
        return c18335.m42788();
    }
}
