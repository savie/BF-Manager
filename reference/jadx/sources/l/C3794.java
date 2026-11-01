package l;

import java.util.EnumMap;

/* JADX INFO: renamed from: l.ۘ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3794 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C3794 f13674 = new C3794();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumMap f13675;

    public C3794() {
        this.f13675 = new EnumMap(EnumC0972.class);
    }

    public C3794(C22140 c22140) {
        this();
        this.f13675.put(EnumC0972.ANNOTATIONS, c22140);
    }

    public C3794(C3794 c3794) {
        this.f13675 = c3794.f13675.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3794 m11036(C22140 c22140) {
        C3794 c3794 = new C3794(this);
        EnumC0972 enumC0972 = EnumC0972.ANNOTATIONS;
        EnumMap enumMap = this.f13675;
        boolean zContainsKey = enumMap.containsKey(enumC0972);
        EnumMap enumMap2 = c3794.f13675;
        if (zContainsKey) {
            enumMap2.put(enumC0972, ((InterfaceC12968) enumMap.get(enumC0972)).mo32097(c22140));
            return c3794;
        }
        enumMap2.put(enumC0972, c22140);
        return c3794;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3794 m11038(EnumC0972 enumC0972) {
        C3794 c3794 = f13674;
        if (this == c3794 || this.f13675.get(enumC0972) == null) {
            return this;
        }
        C3794 c3795 = new C3794(this);
        EnumMap enumMap = c3795.f13675;
        enumMap.remove(enumC0972);
        return enumMap.isEmpty() ? c3794 : c3795;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12968 m11037(EnumC0972 enumC0972) {
        return (InterfaceC12968) this.f13675.get(enumC0972);
    }
}
