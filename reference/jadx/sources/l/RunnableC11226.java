package l;

import java.io.InputStream;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۤ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8BL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11226 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35414;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35415;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35416;

    public /* synthetic */ RunnableC11226(int i, Object obj, Object obj2) {
        this.f35414 = i;
        this.f35416 = obj;
        this.f35415 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35414) {
            case 0:
                C20177.m46424((C20177) this.f35416, (InputStream) this.f35415);
                break;
            case 1:
                C22713.m51203((C22713) this.f35416, (C17074) this.f35415);
                break;
            case 2:
                C13219.m32756((C13219) this.f35416, (LinkedList) this.f35415);
                break;
            default:
                InterfaceC16793 interfaceC16793 = (InterfaceC16793) this.f35416;
                C17539 c17539 = (C17539) this.f35415;
                interfaceC16793.mo13592(c17539.f57014, c17539.f57015);
                interfaceC16793.mo13595();
                break;
        }
    }
}
