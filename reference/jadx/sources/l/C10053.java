package l;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes3.dex */
public class C10053 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22316 f34345;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaController f34347;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f34346 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34343 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f34344 = new HashMap();

    public C10053(Context context, C22316 c22316) {
        this.f34345 = c22316;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) c22316.m49484());
        this.f34347 = mediaController;
        if (c22316.m49481() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC19225(this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25448() {
        C22316 c22316 = this.f34345;
        if (c22316.m49481() == null) {
            return;
        }
        ArrayList<AbstractC7936> arrayList = this.f34343;
        for (AbstractC7936 abstractC7936 : arrayList) {
            BinderC8642 binderC8642 = new BinderC8642(abstractC7936);
            this.f34344.put(abstractC7936, binderC8642);
            abstractC7936.f26096 = binderC8642;
            try {
                c22316.m49481().mo17728(binderC8642);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }
}
