package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V68I */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22736 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f74067;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f74068;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f74069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f74070;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74071;

    public RunnableC22736(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f74071 = i;
        this.f74070 = arrayList;
        this.f74069 = arrayList2;
        this.f74068 = arrayList3;
        this.f74067 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f74071; i++) {
            C5031.m13987((View) this.f74070.get(i), (String) this.f74069.get(i));
            C5031.m13987((View) this.f74068.get(i), (String) this.f74067.get(i));
        }
    }
}
