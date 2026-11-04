package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩷۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22076 implements InterfaceC5668 {
    @Override // l.InterfaceC5668
    /* JADX INFO: renamed from: ۙ */
    public final int mo16657(Object obj) {
        String str = ((C0251) obj).f1533;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
