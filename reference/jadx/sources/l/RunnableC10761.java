package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10761 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f36705;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC1587 f36706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12172 f36707;

    public RunnableC10761(AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587, C12172 c12172, String str) {
        this.f36706 = abstractDialogInterfaceOnClickListenerC1587;
        this.f36707 = c12172;
        this.f36705 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587 = this.f36706;
        if (abstractDialogInterfaceOnClickListenerC1587.f6363 == null) {
            AbstractDialogInterfaceOnClickListenerC1587.m5409(abstractDialogInterfaceOnClickListenerC1587);
        }
        TextView textView = abstractDialogInterfaceOnClickListenerC1587.f6352;
        C12172 c12172 = this.f36707;
        textView.setText(c12172.f40738);
        TextView textView2 = abstractDialogInterfaceOnClickListenerC1587.f6356;
        String str = c12172.f40737;
        String strConcat = str.contains("\n") ? str.concat("\n->") : str.concat(" ->");
        String str2 = this.f36705;
        textView2.setText(C15489.m37076(strConcat, str2.contains("\n") ? "\n" : " ") + str2);
        abstractDialogInterfaceOnClickListenerC1587.f6363.m44362();
    }
}
