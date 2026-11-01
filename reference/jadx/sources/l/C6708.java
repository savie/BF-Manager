package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۜۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6708 implements InterfaceC23206 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22609 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TreeMap f22610;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C6708 f22608 = new C6708(new TreeMap());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C3885 f22607 = new C3885();

    @Override // l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C6708(TreeMap treeMap, int i) {
        this(treeMap);
    }

    public C6708(TreeMap treeMap) {
        this.f22610 = treeMap;
    }

    @Override // l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return C22231.m49355();
    }

    @Override // l.InterfaceC23206
    public final InterfaceC6977 toBuilder() {
        C22231 c22231M49355 = C22231.m49355();
        c22231M49355.m49360(this);
        return c22231M49355;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C6708 m18141() {
        return f22608;
    }

    @Override // l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f22608;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6708) {
            return this.f22610.equals(((C6708) obj).f22610);
        }
        return false;
    }

    public final int hashCode() {
        TreeMap treeMap = this.f22610;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return treeMap.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m18142() {
        return (Map) this.f22610.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18145(int i) {
        return this.f22610.containsKey(Integer.valueOf(i));
    }

    @Override // l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        for (Map.Entry entry : this.f22610.entrySet()) {
            ((C13059) entry.getValue()).m32281(((Integer) entry.getKey()).intValue(), abstractC22044);
        }
    }

    public final String toString() {
        int i = C14430.f47308;
        C10902.f37084.getClass();
        return C10902.m27328(this);
    }

    @Override // l.InterfaceC23206
    public final AbstractC23725 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC23725 abstractC23725 = AbstractC23725.f76778;
            C12436 c12436 = new C12436(serializedSize);
            writeTo(c12436.m30910());
            return c12436.m30909();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC23206
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC22044.f71447;
            C11461 c11461 = new C11461(bArr, serializedSize);
            writeTo(c11461);
            if (c11461.mo28606() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC23206
    public final int getSerializedSize() {
        TreeMap treeMap = this.f22610;
        int iM32273 = 0;
        if (!treeMap.isEmpty()) {
            for (Map.Entry entry : treeMap.entrySet()) {
                iM32273 += ((C13059) entry.getValue()).m32273(((Integer) entry.getKey()).intValue());
            }
        }
        return iM32273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18144(AbstractC22044 abstractC22044) {
        for (Map.Entry entry : this.f22610.entrySet()) {
            ((C13059) entry.getValue()).m32276(((Integer) entry.getKey()).intValue(), abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18147(InterfaceC12976 interfaceC12976) {
        ((C0876) interfaceC12976).getClass();
        EnumC0980 enumC0980 = EnumC0980.ASCENDING;
        EnumC0980 enumC0981 = EnumC0980.DESCENDING;
        TreeMap treeMap = this.f22610;
        if (enumC0980 == enumC0981) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                ((C13059) entry.getValue()).m32275(((Integer) entry.getKey()).intValue(), interfaceC12976);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            ((C13059) entry2.getValue()).m32275(((Integer) entry2.getKey()).intValue(), interfaceC12976);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18143(InterfaceC12976 interfaceC12976) {
        ((C0876) interfaceC12976).getClass();
        EnumC0980 enumC0980 = EnumC0980.ASCENDING;
        EnumC0980 enumC0981 = EnumC0980.DESCENDING;
        TreeMap treeMap = this.f22610;
        if (enumC0980 == enumC0981) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                C13059.m32264((C13059) entry.getValue(), ((Integer) entry.getKey()).intValue(), interfaceC12976);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C13059.m32264((C13059) entry2.getValue(), ((Integer) entry2.getKey()).intValue(), interfaceC12976);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m18146() {
        int iM32279 = 0;
        for (Map.Entry entry : this.f22610.entrySet()) {
            iM32279 += ((C13059) entry.getValue()).m32279(((Integer) entry.getKey()).intValue());
        }
        return iM32279;
    }

    @Override // l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f22607;
    }
}
