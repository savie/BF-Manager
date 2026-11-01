package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֡᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0727 extends C5541 implements InterfaceC14093 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C0727 f3015 = new C0727(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0727 m3151(C16251 c16251) {
        C0727 c0727 = new C0727(1);
        c0727.m15252(0, (Object) c16251);
        return c0727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0727 m3149(C16251 c16251, C16251 c16252) {
        C0727 c0727 = new C0727(2);
        c0727.m15252(0, (Object) c16251);
        c0727.m15252(1, (Object) c16252);
        return c0727;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m3159() {
        int size = size();
        int iM9830 = 0;
        for (int i = 0; i < size; i++) {
            iM9830 += getType(i).m9830();
        }
        return iM9830;
    }

    @Override // l.InterfaceC14093
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 mo3156(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.C5541, l.InterfaceC14093
    public final C3320 getType(int i) {
        C3320 type = ((C16251) m15249(i)).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m3152(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C16251) m15249(i2)).m38400() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0727 m3154(C16251 c16251) {
        int size = size();
        C0727 c0727 = new C0727(size + 1);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            c0727.m15252(i2, m15249(i));
            i = i2;
        }
        c0727.m15252(0, (Object) c16251);
        if (m43639()) {
            c0727.mo9637();
        }
        return c0727;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0727 m3158() {
        int size = size() - 1;
        if (size != 0) {
            C0727 c0727 = new C0727(size);
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                c0727.m15252(i, m15249(i2));
                i = i2;
            }
            if (m43639()) {
                c0727.mo9637();
            }
            return c0727;
        }
        return f3015;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0727 m3160() {
        int size = size() - 1;
        if (size != 0) {
            C0727 c0727 = new C0727(size);
            for (int i = 0; i < size; i++) {
                c0727.m15252(i, m15249(i));
            }
            if (m43639()) {
                c0727.mo9637();
            }
            return c0727;
        }
        return f3015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0727 m3153(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size != 0) {
            C0727 c0727 = new C0727(size);
            int i = 0;
            for (int i2 = 0; i2 < size(); i2++) {
                if (!bitSet.get(i2)) {
                    c0727.m15252(i, m15249(i2));
                    i++;
                }
            }
            if (m43639()) {
                c0727.mo9637();
            }
            return c0727;
        }
        return f3015;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0727 m3157(int i) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C0727 c0727 = new C0727(size);
        for (int i2 = 0; i2 < size; i2++) {
            c0727.m15252(i2, (Object) ((C16251) m15249(i2)).m38389(i));
        }
        if (m43639()) {
            c0727.mo9637();
        }
        return c0727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0727 m3155(boolean z, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C20484 c20484 = new C20484(this, bitSet, z);
        for (int i = 0; i < size; i++) {
            C20484.m46287(c20484, i);
        }
        return C20484.m46286(c20484);
    }
}
