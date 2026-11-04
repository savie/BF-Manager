package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۟ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C7719 implements InterfaceC18775 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C7719 f25441 = new C7719(new TreeMap());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C0261 f25442 = new C0261();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25443 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TreeMap f25444;

    @Override // l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C7719(TreeMap treeMap, int i) {
        this(treeMap);
    }

    public C7719(TreeMap treeMap) {
        this.f25444 = treeMap;
    }

    @Override // l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return C14430.m34853();
    }

    @Override // l.InterfaceC18775
    public final InterfaceC7588 toBuilder() {
        C14430 c14430M34853 = C14430.m34853();
        c14430M34853.m34859(this);
        return c14430M34853;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C7719 m21003() {
        return f25441;
    }

    @Override // l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f25441;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7719) {
            return this.f25444.equals(((C7719) obj).f25444);
        }
        return false;
    }

    public final int hashCode() {
        TreeMap treeMap = this.f25444;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return treeMap.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m21004() {
        return (Map) this.f25444.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21007(int i) {
        return this.f25444.containsKey(Integer.valueOf(i));
    }

    @Override // l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        for (Map.Entry entry : this.f25444.entrySet()) {
            ((C18160) entry.getValue()).m42334(((Integer) entry.getKey()).intValue(), abstractC14846);
        }
    }

    public final String toString() {
        int i = C17414.f56613;
        C24874.f80500.getClass();
        return C24874.m55399(this);
    }

    @Override // l.InterfaceC18775
    public final AbstractC17084 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC17084 abstractC17084 = AbstractC17084.f55772;
            C5898 c5898 = new C5898(serializedSize);
            writeTo(c5898.m17120());
            return c5898.m17119();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC18775
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC14846.f48541;
            C6644 c6644 = new C6644(bArr, serializedSize);
            writeTo(c6644);
            if (c6644.mo18582() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC18775
    public final int getSerializedSize() {
        TreeMap treeMap = this.f25444;
        int iM42326 = 0;
        if (!treeMap.isEmpty()) {
            for (Map.Entry entry : treeMap.entrySet()) {
                iM42326 += ((C18160) entry.getValue()).m42326(((Integer) entry.getKey()).intValue());
            }
        }
        return iM42326;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21005(AbstractC14846 abstractC14846) {
        for (Map.Entry entry : this.f25444.entrySet()) {
            ((C18160) entry.getValue()).m42328(((Integer) entry.getKey()).intValue(), abstractC14846);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21009(InterfaceC18356 interfaceC18356) {
        ((C21560) interfaceC18356).getClass();
        EnumC21340 enumC21340 = EnumC21340.ASCENDING;
        EnumC21340 enumC21341 = EnumC21340.DESCENDING;
        TreeMap treeMap = this.f25444;
        if (enumC21340 == enumC21341) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                ((C18160) entry.getValue()).m42329(((Integer) entry.getKey()).intValue(), interfaceC18356);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            ((C18160) entry2.getValue()).m42329(((Integer) entry2.getKey()).intValue(), interfaceC18356);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21006(InterfaceC18356 interfaceC18356) {
        ((C21560) interfaceC18356).getClass();
        EnumC21340 enumC21340 = EnumC21340.ASCENDING;
        EnumC21340 enumC21341 = EnumC21340.DESCENDING;
        TreeMap treeMap = this.f25444;
        if (enumC21340 == enumC21341) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                C18160.m42316((C18160) entry.getValue(), ((Integer) entry.getKey()).intValue(), interfaceC18356);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C18160.m42316((C18160) entry2.getValue(), ((Integer) entry2.getKey()).intValue(), interfaceC18356);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21008() {
        int iM42332 = 0;
        for (Map.Entry entry : this.f25444.entrySet()) {
            iM42332 += ((C18160) entry.getValue()).m42332(((Integer) entry.getKey()).intValue());
        }
        return iM42332;
    }

    @Override // l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f25442;
    }
}
