package l;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes3.dex */
public class C6149 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15600 f20981;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaController f20982;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f20980 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f20983 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f20979 = new HashMap();

    public C6149(Context context, C15600 c15600) {
        this.f20981 = c15600;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) c15600.m37333());
        this.f20982 = mediaController;
        if (c15600.m37330() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC20319(this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17750() {
        C15600 c15600 = this.f20981;
        if (c15600.m37330() == null) {
            return;
        }
        ArrayList<AbstractC3165> arrayList = this.f20983;
        for (AbstractC3165 abstractC3165 : arrayList) {
            BinderC12114 binderC12114 = new BinderC12114(abstractC3165);
            this.f20979.put(abstractC3165, binderC12114);
            abstractC3165.f10270 = binderC12114;
            try {
                c15600.m37330().mo28672(binderC12114);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }
}
