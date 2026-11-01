package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21748 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11871 f70488;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16251[] f70491;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC18220 f70492;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f70489 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f70490 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15399 f70487 = new C15399(this);

    public C21748(RunnableC18220 runnableC18220, C11871 c11871) {
        this.f70492 = runnableC18220;
        this.f70488 = c11871;
        this.f70491 = runnableC18220.f58190[c11871.m29617()];
        runnableC18220.f58190[c11871.m29617()] = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48515() {
        RunnableC18220 runnableC18220;
        C11871 c11871 = this.f70488;
        c11871.m29604(this);
        C23160 c23160 = new C23160(this);
        BitSet bitSetM29622 = c11871.m29622();
        int iNextSetBit = bitSetM29622.nextSetBit(0);
        while (true) {
            runnableC18220 = this.f70492;
            if (iNextSetBit < 0) {
                break;
            }
            ((C11871) runnableC18220.f58189.m11687().get(iNextSetBit)).m29603(c23160);
            iNextSetBit = bitSetM29622.nextSetBit(iNextSetBit + 1);
        }
        ArrayList arrayListM29613 = c11871.m29613();
        boolean z = true;
        for (int size = arrayListM29613.size() - 1; size >= 0; size--) {
            AbstractC22454 abstractC22454 = (AbstractC22454) arrayListM29613.get(size);
            AbstractC22454 abstractC22455 = (AbstractC22454) this.f70490.get(abstractC22454);
            if (abstractC22455 != null) {
                arrayListM29613.set(size, abstractC22455);
            } else if (abstractC22454.mo17423() && !this.f70489.contains(abstractC22454)) {
                arrayListM29613.remove(size);
            }
        }
        for (C11871 c11872 : c11871.m29600()) {
            if (c11872 != c11871) {
                C16251[] c16251Arr = this.f70491;
                if (!z) {
                    C16251[] c16251Arr2 = new C16251[c16251Arr.length];
                    System.arraycopy(c16251Arr, 0, c16251Arr2, 0, c16251Arr.length);
                    c16251Arr = c16251Arr2;
                }
                runnableC18220.f58190[c11872.m29617()] = c16251Arr;
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48513(int i, C16251 c16251) {
        int iM38400 = c16251.m38400();
        C19073 c19073M38386 = c16251.m38386();
        C16251[] c16251Arr = this.f70491;
        c16251Arr[i] = c16251;
        int length = c16251Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (iM38400 == c16251Arr[length].m38400()) {
                c16251Arr[length] = c16251;
            }
        }
        if (c19073M38386 == null) {
            return;
        }
        RunnableC18220.m42346(this.f70492, c16251);
        int length2 = c16251Arr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            C16251 c16252 = c16251Arr[length2];
            if (iM38400 != c16252.m38400() && c19073M38386.equals(c16252.m38386())) {
                c16251Arr[length2] = c16252.m38391((C19073) null);
            }
        }
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
        m48516((AbstractC22454) c9859);
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
        C16251 c16251M49955 = c6330.m49955();
        int iM38400 = c16251M49955.m38400();
        int iM38401 = c6330.mo17429().m15275get(0).m38400();
        c6330.mo17427(this.f70487);
        int iM38402 = c6330.mo17429().m15275get(0).m38400();
        C19073 c19073M38386 = this.f70491[iM38401].m38386();
        C19073 c19073M38387 = c16251M49955.m38386();
        if (c19073M38387 == null) {
            c19073M38387 = c19073M38386;
        }
        RunnableC18220 runnableC18220 = this.f70492;
        C19073 c19073M42350 = RunnableC18220.m42350(runnableC18220, iM38402);
        boolean z = c19073M42350 == null || c19073M38387 == null || c19073M38387.equals(c19073M42350);
        C16251 c16251M38384 = C16251.m38384(iM38402, c16251M49955.getType(), c19073M38387);
        if (!C23970.m52817() || (z && ((c19073M38387 == c19073M38386 || (c19073M38387 != null && c19073M38387.equals(c19073M38386))) && runnableC18220.f58193 == 0))) {
            m48513(iM38400, c16251M38384);
            return;
        }
        if (z && c19073M38386 == null && runnableC18220.f58193 == 0) {
            this.f70490.put(c6330, new C6330(new C10607(C6372.m17486(c16251M38384), C11312.f38175, (C16251) null, C0727.m3151(C16251.m38380(c16251M38384.m38400(), c16251M38384.getType(), c19073M38387))), this.f70488));
            m48513(iM38400, c16251M38384);
        } else {
            m48516((AbstractC22454) c6330);
            this.f70489.add(c6330);
        }
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        c6330.mo17427(this.f70487);
        m48516((AbstractC22454) c6330);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48516(AbstractC22454 abstractC22454) {
        C16251 c16251M49955 = abstractC22454.m49955();
        if (c16251M49955 == null) {
            return;
        }
        int iM38400 = c16251M49955.m38400();
        RunnableC18220 runnableC18220 = this.f70492;
        if (RunnableC18220.m42347(runnableC18220, iM38400)) {
            return;
        }
        abstractC22454.m49950(runnableC18220.f58191);
        m48513(iM38400, abstractC22454.m49955());
        runnableC18220.f58191++;
    }
}
