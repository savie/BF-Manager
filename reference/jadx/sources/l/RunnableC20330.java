package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IQX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20330 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65229;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65230;

    public /* synthetic */ RunnableC20330(int i, Object obj) {
        this.f65229 = i;
        this.f65230 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f65229) {
            case 0:
                try {
                    ((C19143) this.f65230).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f65230;
                if (dialogInterfaceC8327.m22434()) {
                    dialogInterfaceC8327.dismiss();
                }
                break;
            case 2:
                C0717.f2637.remove((String) this.f65230);
                break;
            case 3:
                C20165.m46388(((C23149) this.f65230).f75035);
                break;
            case 4:
                ((ActivityC20779) this.f65230).m47556();
                break;
            default:
                ((ActivityC3698) this.f65230).finish();
                break;
        }
    }
}
