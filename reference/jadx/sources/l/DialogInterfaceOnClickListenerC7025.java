package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7025 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23170;

    public /* synthetic */ DialogInterfaceOnClickListenerC7025(int i, Object obj) {
        this.f23169 = i;
        this.f23170 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f23169;
        Object obj = this.f23170;
        switch (i2) {
            case 0:
                C3100 c3100 = ActivityC3846.f13105;
                ((C16524) obj).m39150(null, true, true);
                break;
            default:
                int i3 = C1322.f4752;
                ((C1322) obj).cancel();
                break;
        }
    }
}
