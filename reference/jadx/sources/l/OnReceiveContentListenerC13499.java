package l;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: renamed from: l.ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class OnReceiveContentListenerC13499 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2580 f44599;

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C18374 c18374 = new C18374(new C23314(contentInfo));
        C18374 c18374Mo8037 = this.f44599.mo8037(view, c18374);
        if (c18374Mo8037 == null) {
            return null;
        }
        return c18374Mo8037 == c18374 ? contentInfo : c18374Mo8037.m42618();
    }

    public OnReceiveContentListenerC13499(InterfaceC2580 interfaceC2580) {
        this.f44599 = interfaceC2580;
    }
}
