package l;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۜ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K84H */
/* JADX INFO: loaded from: classes4.dex */
public final class C7477 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24522 f24746;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Type f24747;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f24748;

    public C7477(C24522 c24522, AbstractC17567 abstractC17567, Type type) {
        this.f24746 = c24522;
        this.f24748 = abstractC17567;
        this.f24747 = type;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        return this.f24748.mo3722(c4208);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        Type type;
        AbstractC17567 abstractC17567Mo18558;
        Type type2 = this.f24747;
        if (obj != null) {
            Type type3 = type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds()[0] : type2;
            if ((type3 instanceof Class) || (type3 instanceof TypeVariable)) {
                type = obj.getClass();
            } else {
                type = type2;
            }
        } else {
            type = type2;
        }
        AbstractC17567 abstractC17567 = this.f24748;
        if (type != type2) {
            AbstractC17567 abstractC17567M54785 = this.f24746.m54785(C6446.m18230(type));
            if (abstractC17567M54785 instanceof AbstractC18664) {
                AbstractC17567 abstractC17568 = abstractC17567;
                while ((abstractC17568 instanceof AbstractC9713) && (abstractC17567Mo18558 = ((AbstractC9713) abstractC17568).mo18558()) != abstractC17568) {
                    abstractC17568 = abstractC17567Mo18558;
                }
                if (abstractC17568 instanceof AbstractC18664) {
                    abstractC17567 = abstractC17567M54785;
                }
            } else {
                abstractC17567 = abstractC17567M54785;
            }
        }
        abstractC17567.mo3723(c21362, obj);
    }
}
