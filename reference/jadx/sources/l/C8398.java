package l;

import android.content.Intent;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8398 implements InterfaceC1483, InterfaceC8395 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29144;

    public /* synthetic */ C8398(Object obj, Object obj2) {
        this.f29143 = obj;
        this.f29144 = obj2;
    }

    @Override // l.InterfaceC8395
    /* JADX INFO: renamed from: ۙ */
    public void mo1796(Intent intent, int i) {
        ActivityC11220.m28177((ActivityC11220) this.f29143, (AbstractC20745) this.f29144);
    }

    @Override // l.InterfaceC1483
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo5129(long j) throws IOException {
        AbstractC12233 abstractC12233 = (AbstractC12233) this.f29143;
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f29144;
        if (abstractC12233.mo19632()) {
            return abstractC12233.mo10262(j, interfaceC2557.getPath());
        }
        throw new IOException();
    }
}
