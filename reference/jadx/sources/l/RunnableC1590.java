package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V68I */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1590 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5487;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5488;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5489;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5491;

    public RunnableC1590(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5491 = i;
        this.f5487 = arrayList;
        this.f5489 = arrayList2;
        this.f5488 = arrayList3;
        this.f5490 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f5491; i++) {
            C22666.m51092((View) this.f5487.get(i), (String) this.f5489.get(i));
            C22666.m51092((View) this.f5488.get(i), (String) this.f5490.get(i));
        }
    }
}
