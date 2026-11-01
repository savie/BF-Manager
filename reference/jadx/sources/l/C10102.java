package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۤۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10102 implements InterfaceC21909 {
    @Override // l.InterfaceC21909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20685 mo25709() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new C20685(C19980.m45272(mainLooper));
    }
}
