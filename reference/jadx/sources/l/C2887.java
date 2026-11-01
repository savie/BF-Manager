package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8X1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2887 implements InterfaceC9239 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f10889 = new HashMap(3);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m8691(C14178 c14178) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f10889.get(c14178);
        return obj != null ? obj : bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m8689(C14178 c14178) {
        return this.f10889.get(c14178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8690(C14178 c14178, Object obj) {
        HashMap map = this.f10889;
        if (obj == null) {
            map.remove(c14178);
        } else {
            map.put(c14178, obj);
        }
    }
}
