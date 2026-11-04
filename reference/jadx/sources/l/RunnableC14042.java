package l;

/* JADX INFO: renamed from: l.۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14042 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f44491;

    public RunnableC14042(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f44491 = layoutInflaterFactory2C24354;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f44491;
        layoutInflaterFactory2C24354.f78999.showAtLocation(layoutInflaterFactory2C24354.f78980, 55, 0, 0);
        C24158 c24158 = layoutInflaterFactory2C24354.f78984;
        if (c24158 != null) {
            c24158.m54119();
        }
        if (layoutInflaterFactory2C24354.m54422()) {
            layoutInflaterFactory2C24354.f78980.setAlpha(0.0f);
            C24158 c24158M51085 = C22666.m51085(layoutInflaterFactory2C24354.f78980);
            c24158M51085.m54120(1.0f);
            layoutInflaterFactory2C24354.f78984 = c24158M51085;
            c24158M51085.m54123(new C7331(this));
            return;
        }
        layoutInflaterFactory2C24354.f78980.setAlpha(1.0f);
        layoutInflaterFactory2C24354.f78980.setVisibility(0);
    }
}
