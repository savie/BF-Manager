package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۚ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5666 implements Runnable, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩶ܿᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f19549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f19550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f19551;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f19552;

    static {
        ApplicationC23172.m52091(65);
        f19549 = new short[]{731, -11688, -11703, -11701, -11709, -11703, -11697, -11699, 22862, -31134, 23007, -32553, -30303, 23277, 17782, -18101, -24480, -23380, -11675, -11652, -22135, -22994, -31680, 11561, -32159, 23886, -31628, -11753, -11753, -11753, -11703, -11706, -11700, -11686, -11705, -11711, -11700, -11770, -11711, -11706, -11684, -11699, -11706, -11684, -11770, -11703, -11701, -11684, -11711, -11705, -11706, -11770, -11650, -11679, -11667, -11649, -11770, -11684, -11696, -11684, -11684, -11699, -11696, -11684, -11769, -11688, -11708, -11703, -11711, -11706, -30352, -31488, -18101, -31488, -20401, 23140, -25389, -32631, -23380, -30255, 23029, -17810, 11556, -25563, 24051, 23140, -18513, -25378, -32737, -18536, -11702, -11711, -11706, -11770, -11707, -11684, -11770, -11688, -11708, -11683, -11685, -11702, -11711, -11706, -11770, -11707, -11684, -11770, -11688, -11708, -11683, -11685, -11770, -11701, -11703, -11706, -11703, -11686, -11695, -11703, -11706, -11700, -11686, -11705, -11711, -11700, -11770, -11711, -11706, -11684, -11699, -11706, -11684, -11770, -11703, -11701, -11684, -11711, -11705, -11706, -11770, -11668, -11667, -11676, -11667, -11652, -11667};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m16655(Object obj);

    @Override // android.content.DialogInterface.OnDismissListener
    public native void onDismiss(DialogInterface dialogInterface);

    public RunnableC5666(Main main) {
        this.f19551 = main;
    }

    @Override // java.lang.Runnable
    public final void run() {
        onDismiss(null);
    }
}
