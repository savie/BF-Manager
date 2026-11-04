package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֡֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0063 extends C12763 implements InterfaceC11050 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C0063 f947 = new C0063(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0063 m1033(C20946 c20946) {
        C0063 c0063 = new C0063(1);
        c0063.m31596(0, (Object) c20946);
        return c0063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0063 m1031(C20946 c20946, C20946 c20947) {
        C0063 c0063 = new C0063(2);
        c0063.m31596(0, (Object) c20946);
        c0063.m31596(1, (Object) c20947);
        return c0063;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m1039() {
        int size = size();
        int iM15371 = 0;
        for (int i = 0; i < size; i++) {
            iM15371 += getType(i).m15371();
        }
        return iM15371;
    }

    @Override // l.InterfaceC11050
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 mo1038(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.C12763, l.InterfaceC11050
    public final C5085 getType(int i) {
        C5085 type = ((C20946) m31593(i)).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m1041(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C20946) m31593(i2)).m47903() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0063 m1036(C20946 c20946) {
        int size = size();
        C0063 c0063 = new C0063(size + 1);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            c0063.m31596(i2, m31593(i));
            i = i2;
        }
        c0063.m31596(0, (Object) c20946);
        if (m46487()) {
            c0063.mo15005();
        }
        return c0063;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C0063 m1042() {
        int size = size() - 1;
        if (size != 0) {
            C0063 c0063 = new C0063(size);
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                c0063.m31596(i, m31593(i2));
                i = i2;
            }
            if (m46487()) {
                c0063.mo15005();
            }
            return c0063;
        }
        return f947;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0063 m1034() {
        int size = size() - 1;
        if (size != 0) {
            C0063 c0063 = new C0063(size);
            for (int i = 0; i < size; i++) {
                c0063.m31596(i, m31593(i));
            }
            if (m46487()) {
                c0063.mo15005();
            }
            return c0063;
        }
        return f947;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0063 m1035(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size != 0) {
            C0063 c0063 = new C0063(size);
            int i = 0;
            for (int i2 = 0; i2 < size(); i2++) {
                if (!bitSet.get(i2)) {
                    c0063.m31596(i, m31593(i2));
                    i++;
                }
            }
            if (m46487()) {
                c0063.mo15005();
            }
            return c0063;
        }
        return f947;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0063 m1040(int i) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C0063 c0063 = new C0063(size);
        for (int i2 = 0; i2 < size; i2++) {
            c0063.m31596(i2, (Object) ((C20946) m31593(i2)).m47890(i));
        }
        if (m46487()) {
            c0063.mo15005();
        }
        return c0063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0063 m1037(boolean z, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C17962 c17962 = new C17962(this, bitSet, z);
        for (int i = 0; i < size; i++) {
            C17962.m41915(c17962, i);
        }
        return C17962.m41914(c17962);
    }
}
