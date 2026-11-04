package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܽ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes4.dex */
public final class C17878 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8183 f58600;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f58601;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC1471 f58602;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f58603;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Field f58604;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f58605;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC9673 f58606;

    public C17878(Field field, InterfaceC8183 interfaceC8183) throws C12657 {
        int iM27993;
        this.f58604 = field;
        this.f58600 = interfaceC8183;
        EnumC9673 enumC9673Type = interfaceC8183.type();
        this.f58606 = enumC9673Type;
        EnumC10419 enumC10419Cls = interfaceC8183.cls();
        if (enumC10419Cls == EnumC10419.AUTOMATIC) {
            if (interfaceC8183.tagNumber() != -1) {
                enumC10419Cls = EnumC10419.CONTEXT_SPECIFIC;
            } else {
                enumC10419Cls = EnumC10419.UNIVERSAL;
            }
        }
        this.f58605 = AbstractC11077.m27994(enumC10419Cls);
        if (interfaceC8183.tagNumber() != -1) {
            iM27993 = interfaceC8183.tagNumber();
        } else {
            iM27993 = (enumC9673Type == EnumC9673.CHOICE || enumC9673Type == EnumC9673.ANY) ? -1 : AbstractC11077.m27993(enumC9673Type);
        }
        this.f58601 = iM27993;
        EnumC1471 enumC1471Tagging = interfaceC8183.tagging();
        this.f58602 = enumC1471Tagging;
        if ((enumC1471Tagging == EnumC1471.EXPLICIT || enumC1471Tagging == EnumC1471.IMPLICIT) && interfaceC8183.tagNumber() == -1) {
            throw new C12657("Tag number must be specified when tagging mode is " + enumC1471Tagging);
        }
        this.f58603 = interfaceC8183.optional();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Field m41734() {
        return this.f58604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8183 m41729() {
        return this.f58600;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m41732() {
        return this.f58603;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41733() {
        return this.f58605;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m41731() {
        return this.f58601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41730(C14148 c14148, Object obj) {
        int iM34368 = c14148.m34368();
        int i = this.f58605;
        int i2 = this.f58601;
        if (i2 != -1) {
            int iM34366 = c14148.m34366();
            if (iM34368 != i || iM34366 != i2) {
                throw new C16386("Tag mismatch. Expected: " + AbstractC11077.m27996(i, i2) + ", but found " + AbstractC11077.m27996(iM34368, iM34366));
            }
        } else if (iM34368 != i) {
            throw new C16386("Tag mismatch. Expected class: " + AbstractC11077.m27995(i) + ", but found " + AbstractC11077.m27995(iM34368));
        }
        if (this.f58602 == EnumC1471.EXPLICIT) {
            try {
                c14148 = c14148.m34364().m51905();
            } catch (C5112 e) {
                throw new C12657("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.f58604;
        InterfaceC8183 interfaceC8183 = this.f58600;
        EnumC9673 enumC9673 = this.f58606;
        try {
            int i3 = C17132.f55887[enumC9673.ordinal()];
            if (i3 == 4 || i3 == 5) {
                if (C19370.class.equals(field.getType())) {
                    field.set(obj, C23846.m53193(enumC9673, c14148, field.getType()));
                    return;
                } else {
                    if (interfaceC8183.listElementType() == Object.class) {
                        throw new RuntimeException(field.toString());
                    }
                    field.set(obj, C3708.m12061(c14148, interfaceC8183.listElementType()));
                    return;
                }
            }
            field.set(obj, C23846.m53193(enumC9673, c14148, field.getType()));
        } catch (Exception e2) {
            throw new C12657("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
