package l;

import java.util.List;

/* JADX INFO: renamed from: l.ᩴۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1L9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19563 {
    LEFT(0),
    RIGHT(1);


    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ boolean f63086 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63088;

    EnumC19563(int i) {
        this.f63088 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19563 m45134(int i) {
        if (i == 0) {
            return LEFT;
        }
        if (i == 1) {
            return RIGHT;
        }
        throw new IndexOutOfBoundsException(C13645.m33382(i, "index: "));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC19563 m45138(boolean z) {
        return z ? LEFT : RIGHT;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC19563 m45136(boolean z) {
        return z ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19563 m45135(List list, Object obj) {
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf != -1) {
            return m45134(iIndexOf);
        }
        return null;
    }

    public int getIndex() {
        return this.f63088;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m45147() {
        return this.f63088 == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC19563 m45156() {
        return m45147() ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19563 m45146(boolean z) {
        return z ? m45156() : this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m45149(int i, int i2) {
        return m45147() ? i : i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m45142(Object obj, Object obj2) {
        return m45147() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object m45152(Object obj, Object obj2) {
        return m45147() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m45148(boolean[] zArr) {
        return zArr[this.f63088];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m45141(int[] iArr) {
        return iArr[this.f63088];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m45145(Object[] objArr) {
        return objArr[this.f63088];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object m45155(Object[] objArr) {
        return objArr[this.f63088];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m45143(List list) {
        return list.get(this.f63088);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object m45153(List list) {
        return list.get(this.f63088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m45144(C12850 c12850) {
        return m45147() ? c12850.f18884 : c12850.f18885;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object m45154(C12850 c12850) {
        return m45147() ? c12850.f18884 : c12850.f18885;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m45151(InterfaceC9711 interfaceC9711) {
        return m45147() ? interfaceC9711.mo9807() : interfaceC9711.mo9803();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m45140(InterfaceC9711 interfaceC9711) {
        return m45147() ? interfaceC9711.mo9796() : interfaceC9711.mo9801();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m45150(InterfaceC8966 interfaceC8966) {
        return m45147() ? interfaceC8966.mo20528() : interfaceC8966.mo20524();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m45139(InterfaceC8966 interfaceC8966) {
        return m45147() ? interfaceC8966.mo20522() : interfaceC8966.mo20518();
    }
}
