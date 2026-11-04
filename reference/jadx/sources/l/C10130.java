package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10130 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f32418;

    public C10130(AbstractC1928 abstractC1928) {
        this.f32418 = abstractC1928;
    }

    public Object readResolve() {
        AbstractC1928 abstractC1928 = this.f32418;
        if (abstractC1928.isEmpty()) {
            return C1182.m4355();
        }
        if (abstractC1928.equals(AbstractC1928.of((Object) C2346.m7915()))) {
            return C1182.m4356();
        }
        return new C1182(abstractC1928);
    }
}
