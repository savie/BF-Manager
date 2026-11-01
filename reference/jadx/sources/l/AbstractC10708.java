package l;

import android.annotation.TargetApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10708 implements InterfaceC19133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public BitSet f36521;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC7179 f36522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10672 f36524;

    public AbstractC10708(AbstractC7179 abstractC7179, int i) {
        this.f36522 = abstractC7179;
        this.f36523 = i;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ᩹ */
    public boolean mo25272(int i) {
        BitSet bitSet = this.f36521;
        return bitSet != null && bitSet.get(i);
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ */
    public int mo25270(int i) {
        C10672 c10672 = this.f36524;
        if (c10672 == null) {
            return 0;
        }
        return c10672.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26939(int i, boolean z) {
        if (z) {
            if (this.f36521 == null) {
                this.f36521 = new BitSet();
            }
            this.f36521.set(i);
        } else {
            BitSet bitSet = this.f36521;
            if (bitSet != null) {
                bitSet.clear(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26938(int i, int i2) {
        if (((mo1537().mo19107().m27728() | 1610874879) & i2) != 0) {
            throw new IllegalArgumentException("Extra typeSpec flags contain supported bits");
        }
        if (i2 != 0) {
            if (this.f36524 == null) {
                this.f36524 = new C10672();
            }
            this.f36524.mo26878(i, i2);
        } else {
            C10672 c10672 = this.f36524;
            if (c10672 != null) {
                c10672.remove(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26936(C23718 c23718, C4356 c4356) throws IOException {
        int i = c4356.f15586;
        int i2 = c4356.f15585;
        long j = ((long) i) + ((long) i2);
        long jM52234 = ((long) c23718.m52234()) + ((long) c23718.m52227());
        int i3 = c4356.f15587;
        if (i3 < 16 || i2 < i3 || j > jM52234) {
            throw new IOException("Invalid typeSpec header");
        }
        c23718.m52232(i + 8);
        this.f36523 = c23718.m52236();
        c23718.m52226(3);
        int iM52225 = c23718.m52225();
        long j2 = (((long) iM52225) * 4) + ((long) i) + ((long) i3);
        if (iM52225 >= 0 && iM52225 <= 65536 && j2 <= j) {
            c23718.m52232(i + i3);
            for (int i4 = 0; i4 < iM52225; i4++) {
                int iM52226 = c23718.m52225();
                m26939(i4, (536870912 & iM52226) != 0);
                m26938(i4, iM52226 & (~(mo1537().mo19107().m27728() | 1610874879)));
            }
            return iM52225;
        }
        throw new IOException("Invalid typeSpec entry count");
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC6432 mo1522() {
        return this.f36522.mo7938();
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC17721 mo1537() {
        return this.f36522;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int mo26942() {
        return this.f36523;
    }

    @Override // l.InterfaceC19133
    public final String getTypeName() {
        try {
            return (String) mo1537().mo7944().get(this.f36523 - 1);
        } catch (IndexOutOfBoundsException unused) {
            return "ERROR-ID" + this.f36523;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m26940() {
        return new C14236(mo1536(), new InterfaceC17372() { // from class: l.ܽۖۨ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C12434.m30906(this, obj);
            }

            @Override // l.InterfaceC17372
            public final Object get(int i) {
                return this.f52646.mo1530(i);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ Object get(Object obj) {
                return C12434.m30908(this, obj);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // l.InterfaceC17372, l.InterfaceC9612
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ boolean mo8945(int i) {
                return true;
            }

            @Override // l.InterfaceC17372
            /* JADX INFO: renamed from: ۨ */
            public final /* synthetic */ Object mo10756() {
                return null;
            }

            @Override // l.InterfaceC17372, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC17372
            /* JADX INFO: renamed from: ۙ */
            public final Object mo8944(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC17372
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public ArrayList mo26941() {
        ArrayList arrayList = new ArrayList(mo1536());
        C14236 c14236 = (C14236) m26940();
        c14236.iterator();
        while (c14236.hasNext()) {
            arrayList.add((InterfaceC12783) c14236.next());
        }
        Collections.sort(arrayList, new C0123());
        return arrayList;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo26937(C0392 c0392) {
        int iMo1519 = mo1519();
        int iMo1536 = mo1536();
        InterfaceC12783[] interfaceC12783Arr = new InterfaceC12783[iMo1536];
        for (int i = 0; i < iMo1536; i++) {
            interfaceC12783Arr[i] = mo1530(i);
        }
        for (int i2 = 0; i2 < iMo1519; i2++) {
            for (int i3 = 0; i3 < iMo1536; i3++) {
                InterfaceC12783 interfaceC12783 = interfaceC12783Arr[i3];
                if (interfaceC12783.mo31756(i2)) {
                    String strMo31752 = interfaceC12783.mo31752(i2);
                    if (!c0392.mo2120(strMo31752)) {
                        break;
                    }
                    return strMo31752;
                }
            }
        }
        return null;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ */
    public int mo1521(InterfaceC20544 interfaceC20544) {
        int iMo1519 = mo1519();
        int iMo1536 = mo1536();
        InterfaceC12783[] interfaceC12783Arr = new InterfaceC12783[iMo1536];
        for (int i = 0; i < iMo1536; i++) {
            interfaceC12783Arr[i] = mo1530(i);
        }
        for (int i2 = 0; i2 < iMo1519; i2++) {
            for (int i3 = 0; i3 < iMo1536; i3++) {
                InterfaceC12783 interfaceC12783 = interfaceC12783Arr[i3];
                if (interfaceC12783.mo31756(i2)) {
                    if (!interfaceC20544.mo2120(interfaceC12783.mo31752(i2))) {
                        break;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // l.InterfaceC19133
    public final String getPath() {
        return mo1537().getPath() + "/" + getTypeName();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC7138
    @TargetApi(24)
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC19133 interfaceC19133 = (InterfaceC19133) interfaceC7138;
        if (this.f36523 != interfaceC19133.mo26942()) {
            throw new RuntimeException(getPath());
        }
        if (mo1536() != interfaceC19133.mo1536()) {
            throw new RuntimeException(getPath());
        }
        if (!C13638.equals(getTypeName(), interfaceC19133.getTypeName())) {
            throw new RuntimeException(getPath());
        }
        List list = (List) C21980.stream(C0356.spliterator(mo25271()), false).sorted(new C12119(0)).collect(C1890.toList());
        List list2 = (List) C21980.stream(C0356.spliterator(interfaceC19133.mo25271()), false).sorted(new C17057(0)).collect(C1890.toList());
        for (int i = 0; i < mo1536(); i++) {
            ((InterfaceC12783) list.get(i)).mo10755((InterfaceC7138) list2.get(i));
            System.out.println("check ok " + ((InterfaceC12783) list.get(i)).getPath());
        }
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۜ */
    public Iterable mo25271() {
        return m26940();
    }
}
