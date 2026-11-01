package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܶᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15403 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC6250 f50195;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50196;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC10464 f50197;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Class f50198;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f50199;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17560 f50200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f50201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Field f50202;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Field f50203;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Field f50204;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f50205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f50206;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Class f50207;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f50201 - ((C15403) obj).f50201;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36859(Field field, int i, EnumC10464 enumC10464, boolean z) {
        m36860(i);
        C9779.m24889(field, "field");
        C9779.m24889(enumC10464, "fieldType");
        if (enumC10464 == EnumC10464.f35744 || enumC10464 == EnumC10464.f35725) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C15403(field, i, enumC10464, null, null, 0, false, z, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36855(Field field, int i, EnumC10464 enumC10464, Field field2) {
        m36860(i);
        C9779.m24889(field, "field");
        C9779.m24889(enumC10464, "fieldType");
        if (enumC10464 == EnumC10464.f35744 || enumC10464 == EnumC10464.f35725) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C15403(field, i, enumC10464, null, null, 0, false, false, null, null, null, null, field2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36854(Field field, int i, EnumC10464 enumC10464, Class cls) {
        m36860(i);
        C9779.m24889(field, "field");
        C9779.m24889(enumC10464, "fieldType");
        C9779.m24889(cls, "messageClass");
        return new C15403(field, i, enumC10464, cls, null, 0, false, false, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36857(Field field, int i, EnumC10464 enumC10464, InterfaceC6250 interfaceC6250) {
        m36860(i);
        C9779.m24889(field, "field");
        return new C15403(field, i, enumC10464, null, null, 0, false, false, null, null, null, interfaceC6250, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36858(Field field, int i, EnumC10464 enumC10464, InterfaceC6250 interfaceC6250, Field field2) {
        m36860(i);
        C9779.m24889(field, "field");
        return new C15403(field, i, enumC10464, null, null, 0, false, false, null, null, null, interfaceC6250, field2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36856(Field field, int i, EnumC10464 enumC10464, Field field2, int i2, boolean z, InterfaceC6250 interfaceC6250) {
        m36860(i);
        C9779.m24889(field, "field");
        C9779.m24889(enumC10464, "fieldType");
        C9779.m24889(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C8479.m22141(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C15403(field, i, enumC10464, null, field2, i2, false, z, null, null, null, interfaceC6250, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36852(int i, EnumC10464 enumC10464, C17560 c17560, Class cls, boolean z, InterfaceC6250 interfaceC6250) {
        m36860(i);
        C9779.m24889(cls, "oneofStoredType");
        if (!enumC10464.m26436()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC10464);
        }
        return new C15403(null, i, enumC10464, null, null, 0, false, z, c17560, cls, null, interfaceC6250, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36860(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "fieldNumber must be positive: "));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15403 m36861(Field field, int i, EnumC10464 enumC10464, Field field2, int i2, boolean z, InterfaceC6250 interfaceC6250) {
        m36860(i);
        C9779.m24889(field, "field");
        C9779.m24889(enumC10464, "fieldType");
        C9779.m24889(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C8479.m22141(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C15403(field, i, enumC10464, null, field2, i2, true, z, null, null, null, interfaceC6250, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15403 m36853(Field field, int i, Object obj, InterfaceC6250 interfaceC6250) {
        C9779.m24889(obj, "mapDefaultEntry");
        m36860(i);
        C9779.m24889(field, "field");
        return new C15403(field, i, EnumC10464.f35750, null, null, 0, false, true, null, null, obj, interfaceC6250, null);
    }

    public C15403(Field field, int i, EnumC10464 enumC10464, Class cls, Field field2, int i2, boolean z, boolean z2, C17560 c17560, Class cls2, Object obj, InterfaceC6250 interfaceC6250, Field field3) {
        this.f50204 = field;
        this.f50197 = enumC10464;
        this.f50198 = cls;
        this.f50201 = i;
        this.f50202 = field2;
        this.f50196 = i2;
        this.f50199 = z;
        this.f50206 = z2;
        this.f50200 = c17560;
        this.f50207 = cls2;
        this.f50205 = obj;
        this.f50195 = interfaceC6250;
        this.f50203 = field3;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m36862() {
        return this.f50201;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Field m36865() {
        return this.f50204;
    }

    public final EnumC10464 getType() {
        return this.f50197;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17560 m36872() {
        return this.f50200;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6250 m36868() {
        return this.f50195;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Field m36869() {
        return this.f50202;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object m36863() {
        return this.f50205;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m36870() {
        return this.f50196;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m36867() {
        return this.f50199;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m36871() {
        return this.f50206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Field m36864() {
        return this.f50203;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Class m36866() {
        int i = C23164.f75193[this.f50197.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f50204;
            return field != null ? field.getType() : this.f50207;
        }
        if (i == 3 || i == 4) {
            return this.f50198;
        }
        return null;
    }
}
