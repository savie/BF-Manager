package l;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0297 implements InterfaceC17293, InterfaceC16464, InterfaceC0380, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1616;

    public /* synthetic */ C0297(Object obj) {
        this.f1616 = obj;
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1825(Object obj) {
        ((C22032) this.f1616).m48923((C14500) obj, true);
    }

    @Override // l.InterfaceC17293
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1826(String str) {
        ((AtomicReference) this.f1616).set(str);
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15057((InterfaceC13911) this.f1616);
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        throw new C9573((String) this.f1616);
    }
}
