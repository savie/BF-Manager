package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩺ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24122 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77964;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77966;

    public /* synthetic */ RunnableC24122(int i, Object obj, Object obj2) {
        this.f77964 = i;
        this.f77966 = obj;
        this.f77965 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77964) {
            case 0:
                AbstractC18900.m43827((AbstractC18900) this.f77966, (AbstractActivityC17204) this.f77965);
                break;
            case 1:
                ((InterfaceC8103) this.f77966).accept(this.f77965);
                break;
            case 2:
                C24306.m54323((C24306) this.f77966, (C18787) this.f77965);
                break;
            default:
                C5243.m15760((C5243) this.f77966, (Bitmap) this.f77965);
                break;
        }
    }
}
