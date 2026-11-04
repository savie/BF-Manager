package l;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܶ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7BU */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16093 implements InterfaceC16839, InterfaceC21100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52138;

    public /* synthetic */ C16093(Object obj, Object obj2) {
        this.f52137 = obj;
        this.f52138 = obj2;
    }

    @Override // l.InterfaceC16839
    /* JADX INFO: renamed from: ۙ */
    public void mo29188(String str) {
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f52137;
        C8614 c8614 = (C8614) this.f52138;
        C3415.m11166(Collections.singletonList(interfaceC2386), c8614, interfaceC2386.getName(), interfaceC2386.isDirectory() ? str : null, c8614.m23166(), str).m22714();
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        AbstractC22044 abstractC22044 = (AbstractC22044) this.f52137;
        AtomicReference atomicReference = (AtomicReference) this.f52138;
        C3431 c3431M22346 = C8275.m22346(abstractC22044);
        atomicReference.set(c3431M22346);
        return c3431M22346.m11193();
    }
}
