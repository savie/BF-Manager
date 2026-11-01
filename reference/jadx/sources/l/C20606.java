package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes5.dex */
public final class C20606 implements InterfaceC0166 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18511 f67140;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4377 f67141;

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1320() {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1321(C11164 c11164) {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1322(boolean z) {
        return this;
    }

    public C20606(C18511 c18511, InterfaceC4377 interfaceC4377) {
        this.f67140 = c18511;
        this.f67141 = interfaceC4377;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10045[] mo1323(Uri uri, Map map) {
        InterfaceC10045[] interfaceC10045ArrMo1323 = this.f67140.mo1323(uri, map);
        InterfaceC10045[] interfaceC10045Arr = new InterfaceC10045[interfaceC10045ArrMo1323.length];
        for (int i = 0; i < interfaceC10045ArrMo1323.length; i++) {
            InterfaceC10045 c7200 = interfaceC10045ArrMo1323[i];
            if (c7200.mo2755() instanceof C17618) {
                c7200 = new C7200(c7200, this.f67141, uri);
            }
            interfaceC10045Arr[i] = c7200;
        }
        return interfaceC10045Arr;
    }
}
