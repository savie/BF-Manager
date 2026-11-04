package l;

/* JADX INFO: renamed from: l.᩹᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 945B */
/* JADX INFO: loaded from: classes2.dex */
public final class C23765 extends AbstractC22445 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f77001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C23765 m53046(AbstractC22664 abstractC22664) {
        return new C23765(EnumC21172.UNINITIALIZED_THIS, abstractC22664, -1, abstractC22664.m51069());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23765 m53045(int i, AbstractC22664 abstractC22664) {
        return new C23765(EnumC21172.UNINITIALIZED_OBJECT, abstractC22664, i, abstractC22664.m51069());
    }

    public C23765(EnumC21172 enumC21172, AbstractC22664 abstractC22664, int i, C14458 c14458) {
        super(enumC21172, abstractC22664, c14458);
        this.f77001 = i;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        return new C23765(this.f72658, this.f72657, this.f77001, c14458);
    }
}
