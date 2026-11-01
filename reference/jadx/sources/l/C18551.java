package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4SS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18551 extends AbstractC3650 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Comparator f59019 = C7618.comparingInt(new C17845());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Field f59020;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f59021;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59023;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59024;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f59025;

    static {
        Field declaredField = null;
        try {
            declaredField = ArrayList.class.getDeclaredField("elementData");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        f59020 = declaredField;
    }

    public C18551(C21373 c21373, int i) {
        super(c21373, i);
        this.f59023 = false;
        this.f59025 = false;
        this.f59021 = false;
        this.f59024 = false;
        this.f59022 = new ArrayList();
    }

    @Override // l.InterfaceC3609
    public final C16435 getValue() {
        return (C16435) this.f59022.get(0);
    }

    @Override // l.InterfaceC3609
    public final C16435 getValue(int i) {
        return (C16435) this.f59022.get(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m42947() {
        C16435 c16435 = new C16435(this, 0, 0, -1);
        ArrayList arrayList = this.f59022;
        if (arrayList.isEmpty()) {
            arrayList.add(c16435);
        } else {
            arrayList.set(0, c16435);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42941(C16435 c16435) {
        if (c16435.getEntry() != this) {
            throw new IllegalArgumentException("value.getEntry() != this");
        }
        this.f59022.add(c16435);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16435 m42936(int i, int i2, int i3) {
        C16435 c16435 = new C16435(this, i, i2, i3);
        this.f59022.add(c16435);
        return c16435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16435 m42937(String str, C15606[] c15606Arr, int i) {
        C16435 c16435 = new C16435(this, str, c15606Arr, i);
        this.f59022.add(c16435);
        return c16435;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m42944(int i) {
        this.f59022.remove(i);
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۨۙ */
    public final int mo7647() {
        return this.f59022.size();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo7644() {
        return this.f59023;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ᩻ۙ */
    public final boolean mo7649() {
        return this.f59025;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo7648() {
        return this.f59021;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42942(InterfaceC16662 interfaceC16662, C5851 c5851) {
        if (this.f59024 && c5851.m16058(this) > 65535) {
            this.f59024 = false;
        }
        int i = this.f59025 ? 2 : 0;
        if (this.f59021) {
            i |= 4;
        }
        boolean z = this.f59024;
        if (z) {
            i |= 8;
        }
        if (z) {
            C16435 value = getValue(0);
            interfaceC16662.mo24508(c5851.m16058(this));
            interfaceC16662.mo24508(((value.mo25192() & 255) << 8) | i);
            interfaceC16662.writeInt(value.getValue());
            return;
        }
        if (this.f59023) {
            interfaceC16662.mo24508(16);
            interfaceC16662.mo24508(i | 1);
            interfaceC16662.writeInt(c5851.m16058(this));
            interfaceC16662.writeInt(getParent());
            interfaceC16662.writeInt(this.f59022.size());
            for (C16435 c16435 : m10757()) {
                interfaceC16662.writeInt(c16435.mo25193());
                interfaceC16662.mo24505((short) 8);
                interfaceC16662.writeByte(0);
                interfaceC16662.writeByte(c16435.mo25192());
                interfaceC16662.writeInt(c16435.getValue());
            }
            return;
        }
        interfaceC16662.mo24508(8);
        interfaceC16662.mo24508(i);
        interfaceC16662.writeInt(c5851.m16058(this));
        C16435 value2 = getValue(0);
        value2.getClass();
        interfaceC16662.mo24505((short) 8);
        interfaceC16662.writeByte(0);
        interfaceC16662.writeByte(value2.mo25192());
        interfaceC16662.writeInt(value2.getValue());
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo7646() {
        return this.f59024;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42946(boolean z) {
        if (this.f59023 != z) {
            this.f59023 = z;
            ArrayList arrayList = this.f59022;
            if (z) {
                this.f59024 = false;
                if (arrayList.isEmpty()) {
                    return;
                }
                getValue().m38685(33554432);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C16435(this, 0, 16, -1));
                return;
            }
            while (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                getValue().m38685(-1);
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m42948(int i) {
        this.f13381 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42945(boolean z) {
        this.f59025 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m42935(boolean z) {
        this.f59021 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42943(boolean z) {
        this.f59024 = z && !this.f59023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42939(Comparator comparator) {
        Collections.sort(this.f59022, comparator);
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo10689() {
        return (C22785) super.mo10689();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7262 m42934() {
        return (C7262) super.mo10692();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo10692() {
        return (C7262) super.mo10692();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    public final C0206 getType() {
        return (C0206) super.getType();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    public final InterfaceC19133 getType() {
        return (C0206) super.getType();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۗۙ */
    public final String mo7645() {
        String strM1533 = ((C0206) super.getType()).m1533(mo10691());
        return strM1533 == null ? "" : strM1533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42938(String str) {
        ((C0206) super.getType()).m1525(mo10691(), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42940(InterfaceC3609 interfaceC3609) {
        C15606[] c15606ArrMo11446;
        C0206 c0206 = (C0206) super.getType();
        int iMo10691 = mo10691();
        InterfaceC19133 type = interfaceC3609.getType();
        int iMo10692 = interfaceC3609.mo10691();
        c0206.m1540(iMo10691, c0206.mo25272(iMo10691) || type.mo25272(iMo10692));
        c0206.m1539(iMo10691, type.mo25270(iMo10692) | c0206.mo25270(iMo10691));
        m42946(interfaceC3609.mo7644());
        this.f59025 = interfaceC3609.mo7649();
        this.f59021 = interfaceC3609.mo7648();
        m42943(interfaceC3609.mo7646());
        this.f13381 = interfaceC3609.getParent();
        ArrayList arrayList = this.f59022;
        if (arrayList.isEmpty()) {
            try {
                f59020.set(arrayList, new Object[interfaceC3609.mo7647()]);
            } catch (Exception unused) {
                arrayList.ensureCapacity(interfaceC3609.mo7647());
            }
        } else {
            arrayList.ensureCapacity(interfaceC3609.mo7647());
        }
        for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
            if (interfaceC9961.mo25185()) {
                InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                if (!interfaceC12078Mo25187.mo11445()) {
                    m42937(interfaceC12078Mo25187.getValue(), (C15606[]) null, interfaceC9961.mo25193());
                } else {
                    if (interfaceC12078Mo25187 instanceof C12202) {
                        c15606ArrMo11446 = interfaceC12078Mo25187.mo11444();
                    } else {
                        c15606ArrMo11446 = interfaceC12078Mo25187.mo11446();
                    }
                    m42937(interfaceC12078Mo25187.getValue(), c15606ArrMo11446, interfaceC9961.mo25193());
                }
            } else {
                m42936(interfaceC9961.getValue(), interfaceC9961.mo25192(), interfaceC9961.mo25193());
            }
        }
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo10690() {
        return (C21373) super.mo10690();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۚ */
    public final C21373 mo10690() {
        return (C21373) super.mo10690();
    }
}
