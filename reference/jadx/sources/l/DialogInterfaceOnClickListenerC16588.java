package l;

import android.content.DialogInterface;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC16588 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f53235;

    public /* synthetic */ DialogInterfaceOnClickListenerC16588(int i, Serializable serializable) {
        this.f53234 = i;
        this.f53235 = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f53234;
        Object obj = this.f53235;
        switch (i2) {
            case 0:
                ((AtomicInteger) obj).set(i);
                break;
            default:
                int i3 = ActivityC19749.f63457;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
