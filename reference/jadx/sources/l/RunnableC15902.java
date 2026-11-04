package l;

import android.graphics.drawable.BitmapDrawable;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15902 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51673;

    public /* synthetic */ RunnableC15902(int i, Object obj, Object obj2) {
        this.f51671 = i;
        this.f51673 = obj;
        this.f51672 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51671) {
            case 0:
                C8224.m22124((AbstractActivityC17204) this.f51673, (AbstractC22044) this.f51672, (List) null);
                break;
            default:
                ((RunnableC22855) this.f51673).m51573((BitmapDrawable) this.f51672);
                break;
        }
    }
}
