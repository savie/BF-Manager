package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18220 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4108 f58189;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16251[][] f58190;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58192;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f58193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f58194;

    public RunnableC18220(C4108 c4108) {
        int iM11685 = c4108.m11685();
        this.f58194 = iM11685;
        this.f58189 = c4108;
        this.f58191 = iM11685;
        this.f58193 = 0;
        this.f58190 = new C16251[c4108.m11687().size()][];
        this.f58192 = new ArrayList();
        C16251[] c16251Arr = new C16251[iM11685];
        for (int i = 0; i < this.f58194; i++) {
            c16251Arr[i] = C16251.m38381(i, C3320.f12280);
        }
        this.f58190[c4108.m11666()] = c16251Arr;
    }

    public RunnableC18220(int i, C4108 c4108) {
        this(c4108);
        this.f58193 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6931 c6931 = new C6931(this);
        C4108 c4108 = this.f58189;
        c4108.m11688(c6931);
        c4108.m11681(this.f58191);
        c4108.m11692();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19073 m42350(RunnableC18220 runnableC18220, int i) {
        ArrayList arrayList = runnableC18220.f58192;
        if (i < arrayList.size()) {
            return (C19073) arrayList.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42346(RunnableC18220 runnableC18220, C16251 c16251) {
        int iM38400 = c16251.m38400();
        C19073 c19073M38386 = c16251.m38386();
        ArrayList arrayList = runnableC18220.f58192;
        arrayList.ensureCapacity(iM38400 + 1);
        while (arrayList.size() <= iM38400) {
            arrayList.add(null);
        }
        arrayList.set(iM38400, c19073M38386);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m42347(RunnableC18220 runnableC18220, int i) {
        return i < runnableC18220.f58193;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m42343(RunnableC18220 runnableC18220, int i) {
        return i < runnableC18220.f58194;
    }
}
