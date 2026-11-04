package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC21163 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67566;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67567 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67569;

    public /* synthetic */ RunnableC21163(ActivityC15913 activityC15913, C13511 c13511, AtomicBoolean atomicBoolean, Exception exc) {
        this.f67569 = activityC15913;
        this.f67568 = c13511;
        this.f67566 = atomicBoolean;
    }

    public /* synthetic */ RunnableC21163(C18925 c18925, ArrayList arrayList, C12915 c12915) {
        this.f67569 = c18925;
        this.f67568 = arrayList;
        this.f67566 = c12915;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67567) {
            case 0:
                C18925.m43942((C18925) this.f67569, (ArrayList) this.f67568, (C12915) this.f67566);
                break;
            default:
                ActivityC15913.m37895((ActivityC15913) this.f67569, (C13511) this.f67568, (AtomicBoolean) this.f67566);
                break;
        }
    }
}
