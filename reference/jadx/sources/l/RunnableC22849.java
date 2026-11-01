package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩺۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22849 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74318;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74320;

    public /* synthetic */ RunnableC22849(int i, Object obj, Object obj2) {
        this.f74319 = i;
        this.f74320 = obj;
        this.f74318 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74319) {
            case 0:
                C18615.m43023((C18615) this.f74320, (Bitmap) this.f74318);
                break;
            default:
                C22489 c22489 = (C22489) this.f74320;
                C11200 c11200 = (C11200) this.f74318;
                C21452 c21452 = (C21452) c22489.f73408;
                c21452.f69737 = C21825.m48585(c11200, c21452.f69737);
                break;
        }
    }
}
