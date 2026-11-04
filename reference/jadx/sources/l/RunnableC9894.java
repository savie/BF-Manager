package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9894 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC2437 f31815;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f31816;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7658 f31817;

    public RunnableC9894(AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437, C7658 c7658, String str) {
        this.f31815 = abstractDialogInterfaceOnClickListenerC2437;
        this.f31817 = c7658;
        this.f31816 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437 = this.f31815;
        if (abstractDialogInterfaceOnClickListenerC2437.f7808 == null) {
            AbstractDialogInterfaceOnClickListenerC2437.m8215(abstractDialogInterfaceOnClickListenerC2437);
        }
        TextView textView = abstractDialogInterfaceOnClickListenerC2437.f7810;
        C7658 c7658 = this.f31817;
        textView.setText(c7658.f25231);
        TextView textView2 = abstractDialogInterfaceOnClickListenerC2437.f7802;
        String str = c7658.f25230;
        String strConcat = str.contains("\n") ? str.concat("\n->") : str.concat(" ->");
        String str2 = this.f31816;
        textView2.setText(C14483.m34972(strConcat, str2.contains("\n") ? "\n" : " ") + str2);
        abstractDialogInterfaceOnClickListenerC2437.f7808.m22432();
    }
}
