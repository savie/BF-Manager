package l;

import android.annotation.TargetApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14883 implements InterfaceC15344 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f48626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16375 f48627;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public BitSet f48628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15399 f48629;

    public AbstractC14883(AbstractC16375 abstractC16375, int i) {
        this.f48627 = abstractC16375;
        this.f48626 = i;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ܳ */
    public boolean mo33926(int i) {
        BitSet bitSet = this.f48628;
        return bitSet != null && bitSet.get(i);
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ֫ */
    public int mo33924(int i) {
        C15399 c15399 = this.f48629;
        if (c15399 == null) {
            return 0;
        }
        return c15399.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35831(int i, boolean z) {
        if (z) {
            if (this.f48628 == null) {
                this.f48628 = new BitSet();
            }
            this.f48628.set(i);
        } else {
            BitSet bitSet = this.f48628;
            if (bitSet != null) {
                bitSet.clear(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35830(int i, int i2) {
        if (((mo4332().mo27606().m42407() | 1610874879) & i2) != 0) {
            throw new IllegalArgumentException("Extra typeSpec flags contain supported bits");
        }
        if (i2 != 0) {
            if (this.f48629 == null) {
                this.f48629 = new C15399();
            }
            this.f48629.mo20978(i, i2);
        } else {
            C15399 c15399 = this.f48629;
            if (c15399 != null) {
                c15399.remove(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35828(C16618 c16618, C9311 c9311) throws IOException {
        int i = c9311.f30251;
        int i2 = c9311.f30250;
        long j = ((long) i) + ((long) i2);
        long jM39314 = ((long) c16618.m39314()) + ((long) c16618.m39305());
        int i3 = c9311.f30252;
        if (i3 < 16 || i2 < i3 || j > jM39314) {
            throw new IOException("Invalid typeSpec header");
        }
        c16618.m39310(i + 8);
        this.f48626 = c16618.m39312();
        c16618.m39317(3);
        int iM39316 = c16618.m39316();
        long j2 = (((long) iM39316) * 4) + ((long) i) + ((long) i3);
        if (iM39316 >= 0 && iM39316 <= 65536 && j2 <= j) {
            c16618.m39310(i + i3);
            for (int i4 = 0; i4 < iM39316; i4++) {
                int iM39317 = c16618.m39316();
                m35831(i4, (536870912 & iM39317) != 0);
                m35830(i4, iM39317 & (~(mo4332().mo27606().m42407() | 1610874879)));
            }
            return iM39316;
        }
        throw new IOException("Invalid typeSpec entry count");
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7206 mo4329() {
        return this.f48627.mo21425();
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ */
    public InterfaceC10869 mo4332() {
        return this.f48627;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int mo35833() {
        return this.f48626;
    }

    @Override // l.InterfaceC15344
    public final String getTypeName() {
        try {
            return (String) mo4332().mo19818().get(this.f48626 - 1);
        } catch (IndexOutOfBoundsException unused) {
            return "ERROR-ID" + this.f48626;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m35834() {
        return new C18613(mo4331(), new InterfaceC23057() { // from class: l.ۛ᩸ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // l.InterfaceC21433, java.util.Map
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C11122.m28073(this, obj);
            }

            @Override // l.InterfaceC23057
            public final Object get(int i) {
                return this.f22265.mo4334(i);
            }

            @Override // l.InterfaceC21433, java.util.Map
            public final /* synthetic */ Object get(Object obj) {
                return C11122.m28075(this, obj);
            }

            @Override // l.InterfaceC21433, java.util.Map
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // l.InterfaceC23057, l.InterfaceC11868
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ boolean mo13467(int i) {
                return true;
            }

            @Override // l.InterfaceC23057
            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Object mo18702() {
                return null;
            }

            @Override // l.InterfaceC23057, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC23057
            /* JADX INFO: renamed from: ۙ */
            public final Object mo13466(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC23057
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList mo35832() {
        ArrayList arrayList = new ArrayList(mo4331());
        C18613 c18613 = (C18613) m35834();
        c18613.iterator();
        while (c18613.hasNext()) {
            arrayList.add((InterfaceC2731) c18613.next());
        }
        Collections.sort(arrayList, new C12646(0));
        return arrayList;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo35829(C6330 c6330) {
        int iMo4328 = mo4328();
        int iMo4331 = mo4331();
        InterfaceC2731[] interfaceC2731Arr = new InterfaceC2731[iMo4331];
        for (int i = 0; i < iMo4331; i++) {
            interfaceC2731Arr[i] = mo4334(i);
        }
        for (int i2 = 0; i2 < iMo4328; i2++) {
            for (int i3 = 0; i3 < iMo4331; i3++) {
                InterfaceC2731 interfaceC2731 = interfaceC2731Arr[i3];
                if (interfaceC2731.mo9075(i2)) {
                    String strMo9070 = interfaceC2731.mo9070(i2);
                    if (!c6330.mo13186(strMo9070)) {
                        break;
                    }
                    return strMo9070;
                }
            }
        }
        return null;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo35827(InterfaceC11615 interfaceC11615) {
        int iMo4328 = mo4328();
        int iMo4331 = mo4331();
        InterfaceC2731[] interfaceC2731Arr = new InterfaceC2731[iMo4331];
        for (int i = 0; i < iMo4331; i++) {
            interfaceC2731Arr[i] = mo4334(i);
        }
        for (int i2 = 0; i2 < iMo4328; i2++) {
            for (int i3 = 0; i3 < iMo4331; i3++) {
                InterfaceC2731 interfaceC2731 = interfaceC2731Arr[i3];
                if (interfaceC2731.mo9075(i2)) {
                    if (!interfaceC11615.mo13186(interfaceC2731.mo9070(i2))) {
                        break;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // l.InterfaceC15344
    public final String getPath() {
        return mo4332().getPath() + "/" + getTypeName();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC1921
    @TargetApi(24)
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC15344 interfaceC15344 = (InterfaceC15344) interfaceC1921;
        if (this.f48626 != interfaceC15344.mo35833()) {
            throw new RuntimeException(getPath());
        }
        if (mo4331() != interfaceC15344.mo4331()) {
            throw new RuntimeException(getPath());
        }
        if (!C17359.equals(getTypeName(), interfaceC15344.getTypeName())) {
            throw new RuntimeException(getPath());
        }
        List list = (List) C12465.stream(C4937.spliterator(mo33925()), false).sorted(new C24581()).collect(C2025.toList());
        List list2 = (List) C12465.stream(C4937.spliterator(interfaceC15344.mo33925()), false).sorted(new C0187(1)).collect(C2025.toList());
        for (int i = 0; i < mo4331(); i++) {
            ((InterfaceC2731) list.get(i)).mo6599((InterfaceC1921) list2.get(i));
            System.out.println("check ok " + ((InterfaceC2731) list.get(i)).getPath());
        }
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۧ */
    public Iterable mo33925() {
        return m35834();
    }
}
