package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.ܿ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17206 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5917 f54845;

    public RunnableC17206(C5917 c5917) {
        this.f54845 = c5917;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f54845.f20174;
        if (aVar.f880 != null) {
            aVar.f880.loadUrl(aVar.f879);
        }
    }
}
