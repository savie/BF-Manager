package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes3.dex */
public final class C12110 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f40542;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f40543;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC2936 f40544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14227 f40545;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC4430 f40546;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f40547;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f40548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC4430 f40549;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Field f40550;

    public C12110(Object obj, Field field, InterfaceC14227 interfaceC14227) throws C23399 {
        int iM28674;
        this.f40542 = obj;
        this.f40550 = field;
        this.f40545 = interfaceC14227;
        EnumC4430 enumC4430Type = interfaceC14227.type();
        this.f40549 = enumC4430Type;
        this.f40546 = interfaceC14227.elementType();
        EnumC9288 enumC9288Cls = interfaceC14227.cls();
        if (enumC9288Cls == EnumC9288.AUTOMATIC) {
            if (interfaceC14227.tagNumber() != -1) {
                enumC9288Cls = EnumC9288.CONTEXT_SPECIFIC;
            } else {
                enumC9288Cls = EnumC9288.UNIVERSAL;
            }
        }
        int i = C13604.f44879[enumC9288Cls.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported tag class: " + enumC9288Cls);
                    }
                    i2 = 0;
                }
            }
        }
        this.f40547 = i2;
        if (interfaceC14227.tagNumber() != -1) {
            iM28674 = interfaceC14227.tagNumber();
        } else {
            iM28674 = (enumC4430Type == EnumC4430.CHOICE || enumC4430Type == EnumC4430.ANY) ? -1 : AbstractC11487.m28674(enumC4430Type);
        }
        this.f40543 = iM28674;
        EnumC2936 enumC2936Tagging = interfaceC14227.tagging();
        this.f40544 = enumC2936Tagging;
        if ((enumC2936Tagging == EnumC2936.EXPLICIT || enumC2936Tagging == EnumC2936.IMPLICIT) && interfaceC14227.tagNumber() == -1) {
            throw new C23399("Tag number must be specified when tagging mode is " + enumC2936Tagging);
        }
        this.f40548 = interfaceC14227.optional();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Field m30145() {
        return this.f40550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14227 m30143() {
        return this.f40545;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m30144() {
        Object objM26920 = C10699.m26920(this.f40550, this.f40542);
        if (objM26920 == null) {
            if (this.f40548) {
                return null;
            }
            throw new C23399("Required field not set");
        }
        byte[] bArrM15852 = C5759.m15852(objM26920, this.f40549, this.f40546);
        int[] iArr = C16343.f52627;
        EnumC2936 enumC2936 = this.f40544;
        int i = iArr[enumC2936.ordinal()];
        if (i == 1) {
            return bArrM15852;
        }
        int i2 = this.f40547;
        int i3 = this.f40543;
        if (i == 2) {
            return C10699.m26921(i2, true, i3, bArrM15852);
        }
        if (i != 3) {
            throw new RuntimeException("Unknown tagging mode: " + enumC2936);
        }
        byte b = bArrM15852[0];
        if ((b & bo.j) == 31) {
            throw new C23399("High-tag-number form not supported");
        }
        if (i3 >= 31) {
            throw new C23399(C8479.m22141(i3, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & bo.k) | i3);
        bArrM15852[0] = b2;
        bArrM15852[0] = (byte) ((b2 & 63) | (i2 << 6));
        return bArrM15852;
    }
}
