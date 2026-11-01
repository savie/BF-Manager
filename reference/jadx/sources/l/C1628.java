package l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.֫ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1628 implements InterfaceC1692 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC12918 f6533;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f6534;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f6535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f6536;

    public C1628(RunnableC12918 runnableC12918, DialogInterfaceC19356 dialogInterfaceC19356, AbstractActivityC12483 abstractActivityC12483, EditText editText) {
        this.f6533 = runnableC12918;
        this.f6536 = dialogInterfaceC19356;
        this.f6534 = abstractActivityC12483;
        this.f6535 = editText;
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public final void mo3908(String str) {
        this.f6533.run();
        if (this.f6536.m44375()) {
            AbstractActivityC12483 abstractActivityC12483 = this.f6534;
            if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
                return;
            }
            if (str.length() > 1 && str.endsWith("/")) {
                str = C20630.m46498(1, 0, str);
            }
            EditText editText = this.f6535;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }

    @Override // l.InterfaceC1692
    public final void onCanceled() {
        this.f6533.run();
    }
}
