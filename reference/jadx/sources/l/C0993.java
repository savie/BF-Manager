package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0993 extends C10873 {
    @Override // l.C10873
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22161 mo3806(AbstractC11242 abstractC11242) {
        C22161 c22161M27242 = m27242(abstractC11242, null);
        return c22161M27242.f72487 == null ? new C22161(this.f11719, null, null, null) : c22161M27242;
    }

    @Override // l.C10873, l.AbstractC3110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 mo3804(AbstractC11242 abstractC11242, Predicate predicate) {
        return m27242(abstractC11242, predicate).f72486;
    }

    @Override // l.C10873, l.AbstractC3110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo3802(Predicate predicate, EnumC10167 enumC10167) {
        return new C0288(this, enumC10167, predicate);
    }

    @Override // l.C10873, l.AbstractC3110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo3803(AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        return new C16517(this, abstractC11242, predicate, enumC10167);
    }

    public C0993(C22492 c22492) {
        super(c22492);
    }

    @Override // l.C10873, l.AbstractC9462
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9462 mo3805(AbstractC23903 abstractC23903) {
        return new C0993(this, abstractC23903, this.f36968);
    }

    @Override // l.C10873, l.AbstractC9462
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC9462 mo3801(AbstractC23903 abstractC23903) {
        return new C0993(this, abstractC23903, (C22161[]) this.f36968.clone());
    }
}
