package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۡۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8582 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC2936 f29669;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC4430 f29670;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14227 f29671;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Field f29672;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f29673;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f29674;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f29675;

    public C8582(Field field, InterfaceC14227 interfaceC14227) throws C19871 {
        int iM31969;
        this.f29672 = field;
        this.f29671 = interfaceC14227;
        EnumC4430 enumC4430Type = interfaceC14227.type();
        this.f29670 = enumC4430Type;
        EnumC9288 enumC9288Cls = interfaceC14227.cls();
        if (enumC9288Cls == EnumC9288.AUTOMATIC) {
            if (interfaceC14227.tagNumber() != -1) {
                enumC9288Cls = EnumC9288.CONTEXT_SPECIFIC;
            } else {
                enumC9288Cls = EnumC9288.UNIVERSAL;
            }
        }
        this.f29674 = AbstractC12898.m31970(enumC9288Cls);
        if (interfaceC14227.tagNumber() != -1) {
            iM31969 = interfaceC14227.tagNumber();
        } else {
            iM31969 = (enumC4430Type == EnumC4430.CHOICE || enumC4430Type == EnumC4430.ANY) ? -1 : AbstractC12898.m31969(enumC4430Type);
        }
        this.f29673 = iM31969;
        EnumC2936 enumC2936Tagging = interfaceC14227.tagging();
        this.f29669 = enumC2936Tagging;
        if ((enumC2936Tagging == EnumC2936.EXPLICIT || enumC2936Tagging == EnumC2936.IMPLICIT) && interfaceC14227.tagNumber() == -1) {
            throw new C19871("Tag number must be specified when tagging mode is " + enumC2936Tagging);
        }
        this.f29675 = interfaceC14227.optional();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Field m22354() {
        return this.f29672;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14227 m22355() {
        return this.f29671;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m22357() {
        return this.f29675;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22359() {
        return this.f29674;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22358() {
        return this.f29673;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22356(C5136 c5136, Object obj) {
        int iM14294 = c5136.m14294();
        int i = this.f29674;
        int i2 = this.f29673;
        if (i2 != -1) {
            int iM14296 = c5136.m14296();
            if (iM14294 != i || iM14296 != i2) {
                throw new C9993("Tag mismatch. Expected: " + AbstractC12898.m31972(i, i2) + ", but found " + AbstractC12898.m31972(iM14294, iM14296));
            }
        } else if (iM14294 != i) {
            throw new C9993("Tag mismatch. Expected class: " + AbstractC12898.m31971(i) + ", but found " + AbstractC12898.m31971(iM14294));
        }
        if (this.f29669 == EnumC2936.EXPLICIT) {
            try {
                c5136 = c5136.m14295().m10906();
            } catch (C22070 e) {
                throw new C19871("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.f29672;
        InterfaceC14227 interfaceC14227 = this.f29671;
        EnumC4430 enumC4430 = this.f29670;
        try {
            int i3 = C19165.f61895[enumC4430.ordinal()];
            if (i3 == 4 || i3 == 5) {
                if (C1525.class.equals(field.getType())) {
                    field.set(obj, C7170.m19101(enumC4430, c5136, field.getType()));
                    return;
                } else {
                    if (interfaceC14227.listElementType() == Object.class) {
                        throw new RuntimeException(field.toString());
                    }
                    field.set(obj, C20576.m46438(c5136, interfaceC14227.listElementType()));
                    return;
                }
            }
            field.set(obj, C7170.m19101(enumC4430, c5136, field.getType()));
        } catch (Exception e2) {
            throw new C19871("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
