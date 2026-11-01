package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.ۙ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4970 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17342;

    public /* synthetic */ RunnableC4970(int i, Object obj) {
        this.f17341 = i;
        this.f17342 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17341;
        Object obj = this.f17342;
        switch (i) {
            case 0:
                TextKeyListener textKeyListener = C6111.f20699;
                C16737.m39273(new RunnableC2853((C6111) obj, 0));
                break;
            default:
                ((C19186) obj).mo44047();
                break;
        }
    }
}
