package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۢۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10042 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Field f32178;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1796 f32179;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Field f32180;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f32181;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f32182;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f32183;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Class f32184;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Class f32185;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC4561 f32186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Field f32187;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11512 f32188;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f32189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f32190;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f32182 - ((C10042) obj).f32182;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25901(Field field, int i, EnumC4561 enumC4561, boolean z) {
        m25902(i);
        C23447.m52662(field, "field");
        C23447.m52662(enumC4561, "fieldType");
        if (enumC4561 == EnumC4561.f16178 || enumC4561 == EnumC4561.f16185) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C10042(field, i, enumC4561, null, null, 0, false, z, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25897(Field field, int i, EnumC4561 enumC4561, Field field2) {
        m25902(i);
        C23447.m52662(field, "field");
        C23447.m52662(enumC4561, "fieldType");
        if (enumC4561 == EnumC4561.f16178 || enumC4561 == EnumC4561.f16185) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C10042(field, i, enumC4561, null, null, 0, false, false, null, null, null, null, field2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25896(Field field, int i, EnumC4561 enumC4561, Class cls) {
        m25902(i);
        C23447.m52662(field, "field");
        C23447.m52662(enumC4561, "fieldType");
        C23447.m52662(cls, "messageClass");
        return new C10042(field, i, enumC4561, cls, null, 0, false, false, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25899(Field field, int i, EnumC4561 enumC4561, InterfaceC11512 interfaceC11512) {
        m25902(i);
        C23447.m52662(field, "field");
        return new C10042(field, i, enumC4561, null, null, 0, false, false, null, null, null, interfaceC11512, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25900(Field field, int i, EnumC4561 enumC4561, InterfaceC11512 interfaceC11512, Field field2) {
        m25902(i);
        C23447.m52662(field, "field");
        return new C10042(field, i, enumC4561, null, null, 0, false, false, null, null, null, interfaceC11512, field2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25898(Field field, int i, EnumC4561 enumC4561, Field field2, int i2, boolean z, InterfaceC11512 interfaceC11512) {
        m25902(i);
        C23447.m52662(field, "field");
        C23447.m52662(enumC4561, "fieldType");
        C23447.m52662(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C13645.m33382(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C10042(field, i, enumC4561, null, field2, i2, false, z, null, null, null, interfaceC11512, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25894(int i, EnumC4561 enumC4561, C1796 c1796, Class cls, boolean z, InterfaceC11512 interfaceC11512) {
        m25902(i);
        C23447.m52662(cls, "oneofStoredType");
        if (!enumC4561.m14334()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC4561);
        }
        return new C10042(null, i, enumC4561, null, null, 0, false, z, c1796, cls, null, interfaceC11512, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25902(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "fieldNumber must be positive: "));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10042 m25903(Field field, int i, EnumC4561 enumC4561, Field field2, int i2, boolean z, InterfaceC11512 interfaceC11512) {
        m25902(i);
        C23447.m52662(field, "field");
        C23447.m52662(enumC4561, "fieldType");
        C23447.m52662(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C13645.m33382(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C10042(field, i, enumC4561, null, field2, i2, true, z, null, null, null, interfaceC11512, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10042 m25895(Field field, int i, Object obj, InterfaceC11512 interfaceC11512) {
        C23447.m52662(obj, "mapDefaultEntry");
        m25902(i);
        C23447.m52662(field, "field");
        return new C10042(field, i, EnumC4561.f16223, null, null, 0, false, true, null, null, obj, interfaceC11512, null);
    }

    public C10042(Field field, int i, EnumC4561 enumC4561, Class cls, Field field2, int i2, boolean z, boolean z2, C1796 c1796, Class cls2, Object obj, InterfaceC11512 interfaceC11512, Field field3) {
        this.f32178 = field;
        this.f32186 = enumC4561;
        this.f32185 = cls;
        this.f32182 = i;
        this.f32180 = field2;
        this.f32183 = i2;
        this.f32181 = z;
        this.f32190 = z2;
        this.f32179 = c1796;
        this.f32184 = cls2;
        this.f32189 = obj;
        this.f32188 = interfaceC11512;
        this.f32187 = field3;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m25908() {
        return this.f32182;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Field m25910() {
        return this.f32178;
    }

    public final EnumC4561 getType() {
        return this.f32186;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1796 m25914() {
        return this.f32179;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11512 m25912() {
        return this.f32188;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Field m25909() {
        return this.f32180;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m25904() {
        return this.f32189;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m25913() {
        return this.f32183;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m25907() {
        return this.f32181;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m25911() {
        return this.f32190;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Field m25905() {
        return this.f32187;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class m25906() {
        int i = C18993.f61545[this.f32186.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f32178;
            return field != null ? field.getType() : this.f32184;
        }
        if (i == 3 || i == 4) {
            return this.f32185;
        }
        return null;
    }
}
