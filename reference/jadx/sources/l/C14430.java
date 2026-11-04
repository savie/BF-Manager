package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܰۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14430 implements InterfaceC7588 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TreeMap f45436 = new TreeMap();

    @Override // l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC7588
    public final InterfaceC7588 mergeFrom(byte[] bArr) throws C20463 {
        try {
            AbstractC3660 abstractC3660M11872 = AbstractC3660.m11872(false, 0, bArr.length, bArr);
            m34858(abstractC3660M11872);
            abstractC3660M11872.mo11879(0);
            return this;
        } catch (C20463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14430 m34853() {
        return new C14430();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21144 m34854(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f45436;
        C21144 c21144 = (C21144) treeMap.get(numValueOf);
        if (c21144 != null) {
            return c21144;
        }
        int i2 = C18160.f59362;
        C21144 c21144M48247 = C21144.m48247();
        treeMap.put(Integer.valueOf(i), c21144M48247);
        return c21144M48247;
    }

    @Override // l.InterfaceC7588
    public final C7719 build() {
        TreeMap treeMap = this.f45436;
        if (treeMap.isEmpty()) {
            return C7719.m21003();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C21144) entry.getValue()).m48248());
        }
        return new C7719(treeMap2, 0);
    }

    @Override // l.InterfaceC7588
    public final InterfaceC18775 buildPartial() {
        return build();
    }

    public final Object clone() {
        int i = C7719.f25443;
        C14430 c14430M34853 = m34853();
        for (Map.Entry entry : this.f45436.entrySet()) {
            c14430M34853.f45436.put((Integer) entry.getKey(), ((C21144) entry.getValue()).clone());
        }
        return c14430M34853;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34859(C7719 c7719) {
        if (c7719 != C7719.m21003()) {
            for (Map.Entry entry : c7719.f25444.entrySet()) {
                m34857(((Integer) entry.getKey()).intValue(), (C18160) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34855(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m34854(i).m48254(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34856(int i, AbstractC17084 abstractC17084) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m34854(i).m48252(abstractC17084);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34857(int i, C18160 c18160) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f45436;
        if (treeMap.containsKey(numValueOf)) {
            m34854(i).m48253(c18160);
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = C18160.f59362;
        C21144 c21144M48247 = C21144.m48247();
        c21144M48247.m48253(c18160);
        treeMap.put(numValueOf2, c21144M48247);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34858(AbstractC3660 abstractC3660) {
        int iMo11876;
        do {
            iMo11876 = abstractC3660.mo11876();
            if (iMo11876 == 0) {
                return;
            }
        } while (m34860(iMo11876, abstractC3660));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34860(int i, AbstractC3660 abstractC3660) throws C3309 {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m34854(i2).m48254(abstractC3660.mo11893());
            return true;
        }
        if (i3 == 1) {
            m34854(i2).m48250(abstractC3660.mo11886());
            return true;
        }
        if (i3 == 2) {
            m34854(i2).m48252(abstractC3660.mo11890());
            return true;
        }
        if (i3 == 3) {
            int i4 = C7719.f25443;
            C14430 c14430 = new C14430();
            abstractC3660.mo11880(i2, c14430, C20485.f65620);
            m34854(i2).m48251(c14430.build());
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            m34854(i2).m48249(abstractC3660.mo11874());
            return true;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC7588
    public final InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m34858(abstractC3660);
        return this;
    }

    @Override // l.InterfaceC7588
    public final InterfaceC7588 mergeFrom(InterfaceC18775 interfaceC18775) {
        if (interfaceC18775 instanceof C7719) {
            m34859((C7719) interfaceC18775);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
