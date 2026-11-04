package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۘ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes2.dex */
public final class C4454 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC1471 f15946;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8183 f15947;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f15948;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15949;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f15950;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Field f15951;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC9673 f15952;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC9673 f15953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f15954;

    public C4454(Object obj, Field field, InterfaceC8183 interfaceC8183) throws C0725 {
        int iM23840;
        this.f15950 = obj;
        this.f15951 = field;
        this.f15947 = interfaceC8183;
        EnumC9673 enumC9673Type = interfaceC8183.type();
        this.f15953 = enumC9673Type;
        this.f15952 = interfaceC8183.elementType();
        EnumC10419 enumC10419Cls = interfaceC8183.cls();
        if (enumC10419Cls == EnumC10419.AUTOMATIC) {
            if (interfaceC8183.tagNumber() != -1) {
                enumC10419Cls = EnumC10419.CONTEXT_SPECIFIC;
            } else {
                enumC10419Cls = EnumC10419.UNIVERSAL;
            }
        }
        int i = C2962.f9649[enumC10419Cls.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported tag class: " + enumC10419Cls);
                    }
                    i2 = 0;
                }
            }
        }
        this.f15949 = i2;
        if (interfaceC8183.tagNumber() != -1) {
            iM23840 = interfaceC8183.tagNumber();
        } else {
            iM23840 = (enumC9673Type == EnumC9673.CHOICE || enumC9673Type == EnumC9673.ANY) ? -1 : AbstractC8928.m23840(enumC9673Type);
        }
        this.f15954 = iM23840;
        EnumC1471 enumC1471Tagging = interfaceC8183.tagging();
        this.f15946 = enumC1471Tagging;
        if ((enumC1471Tagging == EnumC1471.EXPLICIT || enumC1471Tagging == EnumC1471.IMPLICIT) && interfaceC8183.tagNumber() == -1) {
            throw new C0725("Tag number must be specified when tagging mode is " + enumC1471Tagging);
        }
        this.f15948 = interfaceC8183.optional();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Field m14154() {
        return this.f15951;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8183 m14152() {
        return this.f15947;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m14153() {
        Object objM43329 = C18624.m43329(this.f15951, this.f15950);
        if (objM43329 == null) {
            if (this.f15948) {
                return null;
            }
            throw new C0725("Required field not set");
        }
        byte[] bArrM49136 = C21608.m49136(objM43329, this.f15953, this.f15952);
        int[] iArr = C24592.f79682;
        EnumC1471 enumC1471 = this.f15946;
        int i = iArr[enumC1471.ordinal()];
        if (i == 1) {
            return bArrM49136;
        }
        int i2 = this.f15949;
        int i3 = this.f15954;
        if (i == 2) {
            return C18624.m43330(i2, true, i3, bArrM49136);
        }
        if (i != 3) {
            throw new RuntimeException("Unknown tagging mode: " + enumC1471);
        }
        byte b = bArrM49136[0];
        if ((b & bo.j) == 31) {
            throw new C0725("High-tag-number form not supported");
        }
        if (i3 >= 31) {
            throw new C0725(C13645.m33382(i3, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & bo.k) | i3);
        bArrM49136[0] = b2;
        bArrM49136[0] = (byte) ((b2 & 63) | (i2 << 6));
        return bArrM49136;
    }
}
