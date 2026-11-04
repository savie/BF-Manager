package l;

/* JADX INFO: renamed from: l.᩶۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC21347 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7922 f68001;

    public RunnableC21347(C7922 c7922) {
        this.f68001 = c7922;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7922 c7922 = this.f68001;
        if (c7922.f26329 && c7922.f26312) {
            long jNanoTime = System.nanoTime();
            c7922.f26337.m8867(c7922.f26333 == 0 ? 0.016666668f : (jNanoTime - c7922.f26333) * 1.0E-9f);
            c7922.f26333 = jNanoTime;
            c7922.m21471(c7922.f26337.f8582, c7922.f26337.f8581);
            if (c7922.f26337.m8869()) {
                c7922.f26331.postOnAnimation(this);
            } else {
                c7922.m21486();
            }
        }
    }
}
