package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes3.dex */
public final class C3537 implements InterfaceC1603 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13644 f12137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC9480 f12138;

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5614() {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5615(C3509 c3509) {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5616(boolean z) {
        return this;
    }

    public C3537(C13644 c13644, InterfaceC9480 interfaceC9480) {
        this.f12137 = c13644;
        this.f12138 = interfaceC9480;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22486[] mo5617(Uri uri, Map map) {
        InterfaceC22486[] interfaceC22486ArrMo5617 = this.f12137.mo5617(uri, map);
        InterfaceC22486[] interfaceC22486Arr = new InterfaceC22486[interfaceC22486ArrMo5617.length];
        for (int i = 0; i < interfaceC22486ArrMo5617.length; i++) {
            InterfaceC22486 c23675 = interfaceC22486ArrMo5617[i];
            if (c23675.mo2296() instanceof C16231) {
                c23675 = new C23675(c23675, this.f12138, uri);
            }
            interfaceC22486Arr[i] = c23675;
        }
        return interfaceC22486Arr;
    }
}
