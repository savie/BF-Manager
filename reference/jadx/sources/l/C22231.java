package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes.dex */
public final class C22231 implements InterfaceC6977 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TreeMap f72690 = new TreeMap();

    @Override // l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC6977
    public final InterfaceC6977 mergeFrom(byte[] bArr) throws C4529 {
        try {
            AbstractC3262 abstractC3262M9743 = AbstractC3262.m9743(false, 0, bArr.length, bArr);
            m49359(abstractC3262M9743);
            abstractC3262M9743.mo6025(0);
            return this;
        } catch (C4529 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22231 m49355() {
        return new C22231();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1063 m49354(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f72690;
        C1063 c1063 = (C1063) treeMap.get(numValueOf);
        if (c1063 != null) {
            return c1063;
        }
        int i2 = C13059.f43521;
        C1063 c1063M4014 = C1063.m4014();
        treeMap.put(Integer.valueOf(i), c1063M4014);
        return c1063M4014;
    }

    @Override // l.InterfaceC6977, l.InterfaceC22500
    public final C6708 build() {
        TreeMap treeMap = this.f72690;
        if (treeMap.isEmpty()) {
            return C6708.m18141();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C1063) entry.getValue()).m4015());
        }
        return new C6708(treeMap2, 0);
    }

    @Override // l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 buildPartial() {
        return build();
    }

    public final Object clone() {
        int i = C6708.f22609;
        C22231 c22231M49355 = m49355();
        for (Map.Entry entry : this.f72690.entrySet()) {
            c22231M49355.f72690.put((Integer) entry.getKey(), ((C1063) entry.getValue()).clone());
        }
        return c22231M49355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49360(C6708 c6708) {
        if (c6708 != C6708.m18141()) {
            for (Map.Entry entry : c6708.f22610.entrySet()) {
                m49357(((Integer) entry.getKey()).intValue(), (C13059) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49356(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m49354(i).m4021(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49358(int i, AbstractC23725 abstractC23725) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m49354(i).m4020(abstractC23725);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49357(int i, C13059 c13059) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f72690;
        if (treeMap.containsKey(numValueOf)) {
            m49354(i).m4019(c13059);
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = C13059.f43521;
        C1063 c1063M4014 = C1063.m4014();
        c1063M4014.m4019(c13059);
        treeMap.put(numValueOf2, c1063M4014);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49359(AbstractC3262 abstractC3262) {
        int iMo6048;
        do {
            iMo6048 = abstractC3262.mo6048();
            if (iMo6048 == 0) {
                return;
            }
        } while (m49361(iMo6048, abstractC3262));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49361(int i, AbstractC3262 abstractC3262) throws C3427 {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m49354(i2).m4021(abstractC3262.mo6049());
            return true;
        }
        if (i3 == 1) {
            m49354(i2).m4017(abstractC3262.mo6029());
            return true;
        }
        if (i3 == 2) {
            m49354(i2).m4020(abstractC3262.mo6050());
            return true;
        }
        if (i3 == 3) {
            int i4 = C6708.f22609;
            C22231 c22231 = new C22231();
            abstractC3262.mo6026(i2, c22231, C4818.f16954);
            m49354(i2).m4018(c22231.build());
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            m49354(i2).m4016(abstractC3262.mo6023());
            return true;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC6977
    public final InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m49359(abstractC3262);
        return this;
    }

    @Override // l.InterfaceC6977
    public final InterfaceC6977 mergeFrom(InterfaceC23206 interfaceC23206) {
        if (interfaceC23206 instanceof C6708) {
            m49360((C6708) interfaceC23206);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
