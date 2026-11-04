package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12530;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Callable f12531;

    public C3661() {
        throw null;
    }

    public C3661(String str, Callable callable) {
        this.f12530 = str;
        this.f12531 = callable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m11907(AbstractActivityC17204 abstractActivityC17204) {
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(this.f12530);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13440(1, this, abstractActivityC17204));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        return c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11905(C3661 c3661, InterfaceC15712 interfaceC15712) {
        try {
            c3661.f12531.call();
        } catch (Exception e) {
            interfaceC15712.mo37501(e);
        }
    }
}
