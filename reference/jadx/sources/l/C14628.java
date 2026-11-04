package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܰ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public final class C14628 implements InterfaceC21577 {
    @Override // l.InterfaceC21577
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18358 mo35266() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new C18358(C7917.m21457(mainLooper));
    }
}
