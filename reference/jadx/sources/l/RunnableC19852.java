package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ᩴ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC19852 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63792;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63793;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63794;

    public /* synthetic */ RunnableC19852(int i, Object obj, Object obj2) {
        this.f63792 = i;
        this.f63794 = obj;
        this.f63793 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63792) {
            case 0:
                ((C23582) this.f63794).m52776((C20334) this.f63793, new RunnableC15491(1));
                return;
            case 1:
                ((AbstractC7727) this.f63794).m21012((Typeface) this.f63793);
                return;
            case 2:
                ((InterfaceC21322) this.f63794).mo26316((C18787) this.f63793);
                return;
            case 3:
                AbstractC22044 abstractC22044 = (AbstractC22044) this.f63794;
                C1255 c1255 = (C1255) this.f63793;
                try {
                    C22941 c22941 = new C22941(abstractC22044);
                    try {
                        if (C23753.m53038(c22941) != null) {
                            c1255.setChecked(true);
                            break;
                        }
                        c22941.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c22941.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    return;
                }
            default:
                ActivityC0848.m3371((ActivityC0848) this.f63794, (C11967) this.f63793);
                return;
        }
    }
}
