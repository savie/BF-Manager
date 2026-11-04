package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H8X1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17791 implements InterfaceC17045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f58386 = new HashMap(3);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m41642(C11824 c11824) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f58386.get(c11824);
        return obj != null ? obj : bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m41640(C11824 c11824) {
        return this.f58386.get(c11824);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41641(C11824 c11824, Object obj) {
        HashMap map = this.f58386;
        if (obj == null) {
            map.remove(c11824);
        } else {
            map.put(c11824, obj);
        }
    }
}
