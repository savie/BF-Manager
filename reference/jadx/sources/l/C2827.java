package l;

import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2827 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0130 f10713;

    public C2827(C0130 c0130) {
        this.f10713 = c0130;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        AbstractC7186 abstractC7186M16440;
        Type typeM29317 = c11730.m29317();
        Class clsM29316 = c11730.m29316();
        if (!Map.class.isAssignableFrom(clsM29316)) {
            return null;
        }
        Type[] typeArrM51558 = C23415.m51558(clsM29316, typeM29317);
        Type type = typeArrM51558[0];
        Type type2 = typeArrM51558[1];
        if (type == Boolean.TYPE || type == Boolean.class) {
            abstractC7186M16440 = C15613.f50753;
        } else {
            abstractC7186M16440 = c6044.m16440(C11730.m29314(type));
        }
        return new C12001(this, new C16234(c6044, abstractC7186M16440, type), new C16234(c6044, c6044.m16440(C11730.m29314(type2)), type2), this.f10713.m1197(c11730, false));
    }
}
