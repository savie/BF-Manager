package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ۚ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5573 implements InterfaceC10045, InterfaceC6599 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f19103;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19105;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2750 f19108;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f19109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19110;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19106 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f19102 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f19104 = new PriorityQueue();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f19107 = new C2460(512);

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        if (this.f19106 != 0) {
            throw new IllegalStateException();
        }
        C2750 c2750 = new C2750(interfaceC15690.mo7684(0, 1));
        this.f19108 = c2750;
        C10471 c10471 = new C10471();
        c10471.m26502("audio/midi");
        c10471.m26521("audio/midi");
        c10471.m26533("audio/x-exoplayer-midi");
        c2750.mo8116(c10471.m26497());
        interfaceC15690.mo7696();
        interfaceC15690.mo7690(this);
        this.f19106 = 1;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        C2460 c2460 = new C2460(4);
        ((C14984) interfaceC7222).mo19219(false, 0, 4, c2460.m7518());
        return c2460.m7499() == 1297377380;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        C2023.m6510(this.f19106 != 4);
        this.f19103 = j2;
        C2750 c2750 = this.f19108;
        if (c2750 != null) {
            c2750.m8385();
        }
        if (this.f19106 == 1) {
            this.f19107.m7510(0);
            this.f19105 = 0;
        } else {
            this.f19106 = 2;
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int i = this.f19106;
        ArrayList<C21801> arrayList = this.f19102;
        int i2 = -1;
        if (i == 1) {
            int iM39818 = C17039.m39818(interfaceC7222.getLength());
            C2460 c2460 = this.f19107;
            int length = c2460.m7518().length;
            if (this.f19105 == length) {
                if (iM39818 != -1) {
                    length = iM39818;
                }
                c2460.m7506((length * 3) / 2);
            }
            int i3 = interfaceC7222.read(c2460.m7518(), this.f19105, c2460.m7521() - this.f19105);
            if (i3 != -1) {
                int i4 = this.f19105 + i3;
                this.f19105 = i4;
                if (iM39818 == -1 || i4 != iM39818) {
                    return 0;
                }
            }
            c2460.m7501(this.f19105);
            if (c2460.m7503() < 14) {
                throw C22861.m50610((String) null, (Throwable) null);
            }
            if (c2460.m7499() != 1297377380) {
                throw C22861.m50610((String) null, (Throwable) null);
            }
            c2460.m7535(4);
            short sM7530 = c2460.m7530();
            short sM7531 = c2460.m7530();
            if (sM7531 <= 0) {
                throw C22861.m50610((String) null, (Throwable) null);
            }
            this.f19110 = c2460.m7530();
            for (int i5 = 0; i5 < sM7531; i5++) {
                if (c2460.m7503() < 8) {
                    throw C22861.m50610((String) null, (Throwable) null);
                }
                if (c2460.m7499() != 1297379947) {
                    throw C22861.m50610((String) null, (Throwable) null);
                }
                int iM7499 = c2460.m7499();
                if (iM7499 > 0) {
                    byte[] bArr = new byte[iM7499];
                    if (c2460.m7503() < iM7499) {
                        throw C22861.m50610((String) null, (Throwable) null);
                    }
                    c2460.m7507(0, iM7499, bArr);
                    arrayList.add(new C21801(sM7530, this.f19110, new C2460(bArr), new C23648(1, this)));
                } else {
                    throw C22861.m50610((String) null, (Throwable) null);
                }
            }
            this.f19106 = 2;
            return 0;
        }
        PriorityQueue priorityQueue = this.f19104;
        if (i != 2) {
            if (i == 3) {
                C21801 c21801 = (C21801) priorityQueue.poll();
                c21801.getClass();
                long jM48564 = c21801.m48564();
                if (jM48564 != -9223372036854775807L) {
                    long j = this.f19109 + 100000;
                    if (j < jM48564) {
                        this.f19109 = j;
                        C2750 c2750 = this.f19108;
                        C2023.m6508(c2750);
                        c2750.mo8114(this.f19109, 0, 0, 0, null);
                    } else {
                        this.f19109 = jM48564;
                        C2750 c2751 = this.f19108;
                        C2023.m6508(c2751);
                        c21801.m48565(c2751, false);
                        c21801.m48567();
                    }
                    i2 = 0;
                }
                priorityQueue.add(c21801);
                return i2;
            }
            throw new IllegalStateException();
        }
        priorityQueue.clear();
        for (C21801 c21802 : arrayList) {
            c21802.m48566();
            c21802.m48567();
        }
        priorityQueue.addAll(arrayList);
        long j2 = this.f19103;
        while (!priorityQueue.isEmpty()) {
            C21801 c21803 = (C21801) priorityQueue.poll();
            c21803.getClass();
            long jM48565 = c21803.m48564();
            if (jM48565 != -9223372036854775807L && jM48565 < j2) {
                C2750 c2752 = this.f19108;
                C2023.m6508(c2752);
                c21803.m48565(c2752, true);
                c21803.m48567();
                priorityQueue.add(c21803);
            }
        }
        priorityQueue.addAll(arrayList);
        this.f19109 = this.f19103;
        C21801 c21804 = (C21801) priorityQueue.peek();
        c21804.getClass();
        if (c21804.m48564() > this.f19109) {
            C2750 c2753 = this.f19108;
            C2023.m6508(c2753);
            c2753.mo8114(this.f19109, 0, 0, 0, null);
        }
        this.f19106 = 3;
        return 0;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
        this.f19102.clear();
        this.f19104.clear();
        byte[] bArr = C17983.f57507;
        C2460 c2460 = this.f19107;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
        this.f19106 = 4;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        int i = this.f19106;
        if (i == 2 || i == 3) {
            C22828 c22828 = new C22828(j, 14L);
            return new C12950(c22828, c22828);
        }
        C22828 c22829 = C22828.f74276;
        return new C12950(c22829, c22829);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15388(C5573 c5573, int i, long j) {
        Iterator it = c5573.f19102.iterator();
        while (it.hasNext()) {
            ((C21801) it.next()).m48568(i, j);
        }
    }
}
