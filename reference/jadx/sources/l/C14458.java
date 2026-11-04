package l;

import java.util.EnumMap;

/* JADX INFO: renamed from: l.ܰ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14458 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14458 f45498 = new C14458();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumMap f45499;

    public C14458() {
        this.f45499 = new EnumMap(EnumC24156.class);
    }

    public C14458(C6256 c6256) {
        this();
        this.f45499.put(EnumC24156.ANNOTATIONS, c6256);
    }

    public C14458(C14458 c14458) {
        this.f45499 = c14458.f45499.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14458 m34924(C6256 c6256) {
        C14458 c14458 = new C14458(this);
        EnumC24156 enumC24156 = EnumC24156.ANNOTATIONS;
        EnumMap enumMap = this.f45499;
        boolean zContainsKey = enumMap.containsKey(enumC24156);
        EnumMap enumMap2 = c14458.f45499;
        if (zContainsKey) {
            enumMap2.put(enumC24156, ((InterfaceC4018) enumMap.get(enumC24156)).mo12989(c6256));
            return c14458;
        }
        enumMap2.put(enumC24156, c6256);
        return c14458;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14458 m34925(EnumC24156 enumC24156) {
        C14458 c14458 = f45498;
        if (this == c14458 || this.f45499.get(enumC24156) == null) {
            return this;
        }
        C14458 c14459 = new C14458(this);
        EnumMap enumMap = c14459.f45499;
        enumMap.remove(enumC24156);
        return enumMap.isEmpty() ? c14458 : c14459;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4018 m34923(EnumC24156 enumC24156) {
        return (InterfaceC4018) this.f45499.get(enumC24156);
    }
}
