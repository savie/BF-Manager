package l;

import android.content.DialogInterface;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14884 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f48630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48633;

    public /* synthetic */ DialogInterfaceOnClickListenerC14884(Object obj, Object obj2, Serializable serializable, int i) {
        this.f48631 = i;
        this.f48633 = obj;
        this.f48632 = obj2;
        this.f48630 = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f48631) {
            case 0:
                ((C18614) this.f48633).m43303((AbstractActivityC17204) this.f48632, (String) this.f48630, dialogInterface, i);
                break;
            default:
                ActivityC5440.m16244((ActivityC5440) this.f48633, (AbstractC22044) this.f48632, (int[]) this.f48630);
                break;
        }
    }
}
