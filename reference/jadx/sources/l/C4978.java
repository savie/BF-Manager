package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VIWW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4978 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f17304 = C16980.m40037(C4978.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BitSet[] f17305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public BitSet[] f17306;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public BitSet[] f17307;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public BitSet[] f17308;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2551 f17309;

    public C4978(C2551 c2551) {
        this.f17309 = c2551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15182() {
        C2551 c2551 = this.f17309;
        int size = c2551.m8508().size();
        int iM8518 = c2551.m8518();
        this.f17307 = m15180(size, iM8518);
        this.f17308 = m15180(size, iM8518);
        this.f17305 = m15180(iM8518, size);
        for (C21943 c21943 : c2551.m8508()) {
            int id = c21943.getId();
            BitSet bitSet = this.f17307[id];
            BitSet bitSet2 = this.f17308[id];
            for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                    abstractC16481.getClass();
                    if (abstractC16481 instanceof C6041) {
                        int iM17532 = ((C6041) abstractC16481).m17532();
                        if (!bitSet2.get(iM17532)) {
                            bitSet.set(iM17532);
                        }
                    }
                }
                C6041 c6041M44027 = c18959.m44027();
                if (c6041M44027 != null) {
                    int iM17533 = c6041M44027.m17532();
                    bitSet2.set(iM17533);
                    this.f17305[iM17533].set(id);
                }
            }
        }
        int size2 = c2551.m8508().size();
        int iM8519 = c2551.m8518();
        BitSet[] bitSetArrM15180 = m15180(size2, iM8519);
        List<C21943> listM8508 = c2551.m8508();
        int size3 = listM8508.size();
        int i = size3 * 10;
        int i2 = 0;
        while (true) {
            boolean z = false;
            for (C21943 c21944 : listM8508) {
                int id2 = c21944.getId();
                BitSet bitSet3 = bitSetArrM15180[id2];
                BitSet bitSet4 = new BitSet(iM8519);
                Iterator it = c21944.m49646().iterator();
                while (it.hasNext()) {
                    bitSet4.or(bitSetArrM15180[((C21943) it.next()).getId()]);
                }
                bitSet4.andNot(this.f17308[id2]);
                bitSet4.or(this.f17307[id2]);
                if (!bitSet3.equals(bitSet4)) {
                    bitSetArrM15180[id2] = bitSet4;
                    z = true;
                }
            }
            int i3 = i2 + 1;
            if (i2 > i) {
                throw new C8597(C13645.m33382(size3, "Live variable analysis reach iterations limit, blocks count: "));
            }
            if (!z) {
                this.f17306 = bitSetArrM15180;
                return;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m15181(int i) {
        return this.f17305[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15183(int i, int i2) {
        BitSet[] bitSetArr = this.f17306;
        if (i >= bitSetArr.length) {
            f17304.mo13710("LiveVarAnalysis: out of bounds block: {}, max: {}", Integer.valueOf(i), Integer.valueOf(this.f17306.length));
            return false;
        }
        return bitSetArr[i].get(i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static BitSet[] m15180(int i, int i2) {
        BitSet[] bitSetArr = new BitSet[i];
        for (int i3 = 0; i3 < i; i3++) {
            bitSetArr[i3] = new BitSet(i2);
        }
        return bitSetArr;
    }
}
