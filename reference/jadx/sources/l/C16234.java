package l;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.ܺ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K84H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16234 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6044 f52372;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Type f52373;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f52374;

    public C16234(C6044 c6044, AbstractC7186 abstractC7186, Type type) {
        this.f52372 = c6044;
        this.f52374 = abstractC7186;
        this.f52373 = type;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        return this.f52374.mo1571(c5379);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        AbstractC7186 abstractC7186Mo26765;
        Type type = this.f52373;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        AbstractC7186 abstractC7186 = this.f52374;
        if (type2 != type) {
            AbstractC7186 abstractC7186M16440 = this.f52372.m16440(C11730.m29314(type2));
            if (abstractC7186M16440 instanceof AbstractC21878) {
                AbstractC7186 abstractC7187 = abstractC7186;
                while ((abstractC7187 instanceof AbstractC10590) && (abstractC7186Mo26765 = ((AbstractC10590) abstractC7187).mo26765()) != abstractC7187) {
                    abstractC7187 = abstractC7186Mo26765;
                }
                if (abstractC7187 instanceof AbstractC21878) {
                    abstractC7186 = abstractC7186M16440;
                }
            } else {
                abstractC7186 = abstractC7186M16440;
            }
        }
        abstractC7186.mo1572(c1145, obj);
    }
}
