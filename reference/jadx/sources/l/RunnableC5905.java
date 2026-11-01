package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۛ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5905 implements Runnable, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܺܳۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f20143;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f20144;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f20145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20146;

    static {
        ApplicationC6132.m17119(82);
        f20143 = new short[]{8187, 4655, 4670, 4668, 4660, 4670, 4664, 4666, -26311, 17941, -26200, 16544, 18902, -25958, -31487, 31036, 24599, 25819, 4626, 4619, 27134, 26201, 17463, -4770, -31916, -27535, 26379, 4704, 4704, 4704, 4670, 4657, 4667, 4653, 4656, 4662, 4667, 4721, 4662, 4657, 4651, 4666, 4657, 4651, 4721, 4670, 4668, 4651, 4662, 4656, 4657, 4721, 4617, 4630, 4634, 4616, 4721, 4651, 4647, 4651, 4651, 4666, 4647, 4651, 4720, 4655, 4659, 4670, 4662, 4657, 18695, 17783, 31036, 17783, 28728, -26093, 23716, 16638, 25819, 18854, -26238, 31257, -4781, 23634, -25212, -26093, 30680, 23721, 16488, 30703, 4669, 4662, 4657, 4721, 4658, 4651, 4721, 4655, 4659, 4650, 4652, 4669, 4662, 4657, 4721, 4658, 4651, 4721, 4655, 4659, 4650, 4652, 4721, 4668, 4670, 4657, 4670, 4653, 4646, 4670, 4657, 4667, 4653, 4656, 4662, 4667, 4721, 4662, 4657, 4651, 4666, 4657, 4651, 4721, 4670, 4668, 4651, 4662, 4656, 4657, 4721, 4635, 4634, 4627, 4634, 4619, 4634};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m16175(Object obj);

    @Override // android.content.DialogInterface.OnDismissListener
    public native void onDismiss(DialogInterface dialogInterface);

    public RunnableC5905(Main main) {
        this.f20144 = main;
    }

    @Override // java.lang.Runnable
    public final void run() {
        onDismiss(null);
    }
}
