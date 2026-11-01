package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12555 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f42023;

    public C12555(AbstractC22433 abstractC22433) {
        this.f42023 = abstractC22433;
    }

    public Object readResolve() {
        AbstractC22433 abstractC22433 = this.f42023;
        if (abstractC22433.isEmpty()) {
            return C17493.m40758();
        }
        if (abstractC22433.equals(AbstractC22433.of((Object) C9548.m24392()))) {
            return C17493.m40759();
        }
        return new C17493(abstractC22433);
    }
}
