package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6612 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22841 f22266;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22267 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f22268;

    public RunnableC6612(C22841 c22841) {
        this.f22266 = c22841;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22841 c22841 = this.f22266;
        C12341 c12341 = c22841.f74301;
        c22841.f74303 = c12341.m30650(c22841.f74302);
        String strM30649 = c12341.m30649();
        synchronized (C17901.f56679) {
            C17901.f56679.m25801(strM30649, this.f22266.f74303);
        }
        C16737.m39273(new Runnable() { // from class: l.ۘ۟ۚ
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6612 runnableC6612 = this.f13666;
                C22841 c22842 = runnableC6612.f22266;
                C12341 c12342 = c22842.f74301;
                ImageView imageView = runnableC6612.f22268;
                if (imageView.getTag() == c12342) {
                    imageView.setImageDrawable(c22842.f74303);
                }
            }
        });
    }
}
