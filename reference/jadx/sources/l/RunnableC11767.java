package l;

import com.google.android.material.timepicker.MaterialTimePicker;

/* JADX INFO: renamed from: l.ۨܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11767 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39501;

    public /* synthetic */ RunnableC11767(int i, Object obj) {
        this.f39500 = i;
        this.f39501 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f39500) {
            case 0:
                Exception exc = null;
                for (InterfaceC5046 interfaceC5046 : (InterfaceC5046[]) this.f39501) {
                    try {
                        interfaceC5046.close();
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        } else {
                            exc.addSuppressed(e);
                        }
                    }
                }
                if (exc != null) {
                    throw exc;
                }
                return;
            case 1:
                ((C8355) this.f39501).m31324();
                return;
            case 2:
                ((C18295) this.f39501).m42505();
                return;
            case 3:
                ((ActivityC9932) this.f39501).finish();
                return;
            default:
                ((MaterialTimePicker) this.f39501).lambda$onViewCreated$0();
                return;
        }
    }
}
