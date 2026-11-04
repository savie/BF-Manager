package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4SS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13304 extends AbstractC11154 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Comparator f42461 = C2661.comparingInt(new C15541());

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Field f42462;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f42463;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f42464;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f42465;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42467;

    static {
        Field declaredField = null;
        try {
            declaredField = ArrayList.class.getDeclaredField("elementData");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        f42462 = declaredField;
    }

    public C13304(C20017 c20017, int i) {
        super(c20017, i);
        this.f42465 = false;
        this.f42467 = false;
        this.f42466 = false;
        this.f42463 = false;
        this.f42464 = new ArrayList();
    }

    @Override // l.InterfaceC8697
    public final C3609 getValue() {
        return (C3609) this.f42464.get(0);
    }

    @Override // l.InterfaceC8697
    public final C3609 getValue(int i) {
        return (C3609) this.f42464.get(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32858() {
        C3609 c3609 = new C3609(this, 0, 0, -1);
        ArrayList arrayList = this.f42464;
        if (arrayList.isEmpty()) {
            arrayList.add(c3609);
        } else {
            arrayList.set(0, c3609);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32852(C3609 c3609) {
        if (c3609.getEntry() != this) {
            throw new IllegalArgumentException("value.getEntry() != this");
        }
        this.f42464.add(c3609);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3609 m32848(int i, int i2, int i3) {
        C3609 c3609 = new C3609(this, i, i2, i3);
        this.f42464.add(c3609);
        return c3609;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3609 m32849(String str, C25042[] c25042Arr, int i) {
        C3609 c3609 = new C3609(this, str, c25042Arr, i);
        this.f42464.add(c3609);
        return c3609;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m32847(int i) {
        this.f42464.remove(i);
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۤۙ */
    public final int mo18154() {
        return this.f42464.size();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo18155() {
        return this.f42465;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo18152() {
        return this.f42467;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo18157() {
        return this.f42466;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32854(InterfaceC23332 interfaceC23332, C6593 c6593) {
        if (this.f42463 && c6593.m18518(this) > 65535) {
            this.f42463 = false;
        }
        int i = this.f42467 ? 2 : 0;
        if (this.f42466) {
            i |= 4;
        }
        boolean z = this.f42463;
        if (z) {
            i |= 8;
        }
        if (z) {
            C3609 value = getValue(0);
            interfaceC23332.mo17812(c6593.m18518(this));
            interfaceC23332.mo17812(((value.mo16635() & 255) << 8) | i);
            interfaceC23332.writeInt(value.getValue());
            return;
        }
        if (this.f42465) {
            interfaceC23332.mo17812(16);
            interfaceC23332.mo17812(i | 1);
            interfaceC23332.writeInt(c6593.m18518(this));
            interfaceC23332.writeInt(getParent());
            interfaceC23332.writeInt(this.f42464.size());
            for (C3609 c3609 : m28102()) {
                interfaceC23332.writeInt(c3609.mo16637());
                interfaceC23332.mo17788((short) 8);
                interfaceC23332.writeByte(0);
                interfaceC23332.writeByte(c3609.mo16635());
                interfaceC23332.writeInt(c3609.getValue());
            }
            return;
        }
        interfaceC23332.mo17812(8);
        interfaceC23332.mo17812(i);
        interfaceC23332.writeInt(c6593.m18518(this));
        C3609 value2 = getValue(0);
        value2.getClass();
        interfaceC23332.mo17788((short) 8);
        interfaceC23332.writeByte(0);
        interfaceC23332.writeByte(value2.mo16635());
        interfaceC23332.writeInt(value2.getValue());
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo18151() {
        return this.f42463;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32860(boolean z) {
        if (this.f42465 != z) {
            this.f42465 = z;
            ArrayList arrayList = this.f42464;
            if (z) {
                this.f42463 = false;
                if (arrayList.isEmpty()) {
                    return;
                }
                getValue().m11711(33554432);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C3609(this, 0, 16, -1));
                return;
            }
            while (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                getValue().m11711(-1);
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m32859(int i) {
        this.f35130 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32856(boolean z) {
        this.f42467 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32861(boolean z) {
        this.f42466 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32855(boolean z) {
        this.f42463 = z && !this.f42465;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32851(Comparator comparator) {
        Collections.sort(this.f42464, comparator);
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo18150() {
        return (C23001) super.mo18150();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo18153() {
        return (C25239) super.mo18153();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C25239 m32857() {
        return (C25239) super.mo18153();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    public final InterfaceC15344 getType() {
        return (C23747) super.getType();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    public final C23747 getType() {
        return (C23747) super.getType();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32850(String str) {
        ((C23747) super.getType()).m53015(mo23383(), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32853(InterfaceC8697 interfaceC8697) {
        C25042[] c25042ArrMo8824;
        C23747 c23747 = (C23747) super.getType();
        int iMo23383 = mo23383();
        InterfaceC15344 type = interfaceC8697.getType();
        int iMo23384 = interfaceC8697.mo23383();
        c23747.m53027(iMo23383, c23747.mo33926(iMo23383) || type.mo33926(iMo23384));
        c23747.m53026(iMo23383, type.mo33924(iMo23384) | c23747.mo33924(iMo23383));
        m32860(interfaceC8697.mo18155());
        this.f42467 = interfaceC8697.mo18152();
        this.f42466 = interfaceC8697.mo18157();
        m32855(interfaceC8697.mo18151());
        this.f35130 = interfaceC8697.getParent();
        ArrayList arrayList = this.f42464;
        if (arrayList.isEmpty()) {
            try {
                f42462.set(arrayList, new Object[interfaceC8697.mo18154()]);
            } catch (Exception unused) {
                arrayList.ensureCapacity(interfaceC8697.mo18154());
            }
        } else {
            arrayList.ensureCapacity(interfaceC8697.mo18154());
        }
        for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
            if (interfaceC5650.mo16636()) {
                InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                if (!interfaceC16090Mo11710.mo8825()) {
                    m32849(interfaceC16090Mo11710.getValue(), (C25042[]) null, interfaceC5650.mo16637());
                } else {
                    if (interfaceC16090Mo11710 instanceof C20763) {
                        c25042ArrMo8824 = interfaceC16090Mo11710.mo8826();
                    } else {
                        c25042ArrMo8824 = interfaceC16090Mo11710.mo8824();
                    }
                    m32849(interfaceC16090Mo11710.getValue(), c25042ArrMo8824, interfaceC5650.mo16637());
                }
            } else {
                m32848(interfaceC5650.getValue(), interfaceC5650.mo16635(), interfaceC5650.mo16637());
            }
        }
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۬ۙ */
    public final String mo18156() {
        String strM53021 = ((C23747) super.getType()).m53021(mo23383());
        return strM53021 == null ? "" : strM53021;
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC2731 mo18158() {
        return (C20017) super.mo18158();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ᩴ */
    public final C20017 mo18158() {
        return (C20017) super.mo18158();
    }
}
