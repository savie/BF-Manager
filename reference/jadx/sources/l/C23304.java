package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23304 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75470;

    public /* synthetic */ C23304(int i, Object obj) {
        this.f75469 = i;
        this.f75470 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f75469) {
            case 0:
                ((TextView) this.f75470).setText(C3669.m11953(((Integer) obj).intValue()));
                break;
            case 1:
                ((RunnableC15442) this.f75470).run();
                break;
            case 2:
                ((C9271) this.f75470).m24487();
                break;
            case 3:
                C13831.m33760((C13831) this.f75470);
                break;
            default:
                C18372.m42855((C18372) this.f75470, (C20283) obj);
                break;
        }
    }
}
