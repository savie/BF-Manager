package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3330 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f10894;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20946[][] f10895;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10896;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24960 f10897;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f10898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10899;

    public RunnableC3330(C24960 c24960) {
        int iM55737 = c24960.m55737();
        this.f10899 = iM55737;
        this.f10897 = c24960;
        this.f10896 = iM55737;
        this.f10898 = 0;
        this.f10895 = new C20946[c24960.m55749().size()][];
        this.f10894 = new ArrayList();
        C20946[] c20946Arr = new C20946[iM55737];
        for (int i = 0; i < this.f10899; i++) {
            c20946Arr[i] = C20946.m47883(i, C5085.f17731);
        }
        this.f10895[c24960.m55751()] = c20946Arr;
    }

    public RunnableC3330(int i, C24960 c24960) {
        this(c24960);
        this.f10898 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16754 c16754 = new C16754(this);
        C24960 c24960 = this.f10897;
        c24960.m55750(c16754);
        c24960.m55747(this.f10896);
        c24960.m55745();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3046 m10979(RunnableC3330 runnableC3330, int i) {
        ArrayList arrayList = runnableC3330.f10894;
        if (i < arrayList.size()) {
            return (C3046) arrayList.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10976(RunnableC3330 runnableC3330, C20946 c20946) {
        int iM47903 = c20946.m47903();
        C3046 c3046M47896 = c20946.m47896();
        ArrayList arrayList = runnableC3330.f10894;
        arrayList.ensureCapacity(iM47903 + 1);
        while (arrayList.size() <= iM47903) {
            arrayList.add(null);
        }
        arrayList.set(iM47903, c3046M47896);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10977(RunnableC3330 runnableC3330, int i) {
        return i < runnableC3330.f10898;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m10982(RunnableC3330 runnableC3330, int i) {
        return i < runnableC3330.f10899;
    }
}
