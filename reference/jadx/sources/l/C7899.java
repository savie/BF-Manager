package l;

import android.os.Build;

/* JADX INFO: renamed from: l.۠ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7899 implements InterfaceC15661 {
    @Override // l.InterfaceC15661
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo20907(Object obj) {
        String str = ((C5076) obj).f17691;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
