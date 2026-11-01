package l;

import java.util.Collections;

/* JADX INFO: renamed from: l.۬ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12873 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42816;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42817 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42819;

    public /* synthetic */ RunnableC12873(C11545 c11545, C4405 c4405, String str) {
        this.f42819 = c11545;
        this.f42816 = c4405;
        this.f42818 = str;
    }

    public /* synthetic */ RunnableC12873(InterfaceC16966 interfaceC16966, String str, String str2) {
        this.f42819 = interfaceC16966;
        this.f42818 = str;
        this.f42816 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42817) {
            case 0:
                C11545.m28738((C11545) this.f42819, (C4405) this.f42816, this.f42818);
                break;
            default:
                InterfaceC16966 interfaceC16966 = (InterfaceC16966) this.f42819;
                String str = (String) this.f42816;
                interfaceC16966.mo16476(new C10617("", C7997.m21055("Override: ", this.f42818, "->", str), Collections.EMPTY_LIST));
                interfaceC16966.mo16480();
                break;
        }
    }
}
