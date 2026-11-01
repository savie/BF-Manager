package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10238 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34923;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34924;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34925;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Cloneable f34926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34927;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34928;

    public /* synthetic */ RunnableC10238(Object obj, Object obj2, Cloneable cloneable, Object obj3, Object obj4, int i) {
        this.f34925 = i;
        this.f34928 = obj;
        this.f34923 = obj2;
        this.f34926 = cloneable;
        this.f34924 = obj3;
        this.f34927 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34925) {
            case 0:
                C6004.m16300((C6004) this.f34928, (AtomicBoolean) this.f34923, (CharSequence[]) this.f34926, (AtomicInteger) this.f34924, (AtomicReference) this.f34927);
                break;
            default:
                C17573.m40858((C17573) this.f34928, (C4603) this.f34923, (C23195) this.f34926, (AbstractC5930) this.f34924, (C18258) this.f34927);
                break;
        }
    }
}
