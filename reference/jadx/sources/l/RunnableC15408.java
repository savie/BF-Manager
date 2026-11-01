package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15408 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f50227;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50228;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50229;

    public /* synthetic */ RunnableC15408(Object obj, Serializable serializable, int i) {
        this.f50228 = i;
        this.f50229 = obj;
        this.f50227 = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f50228) {
            case 0:
                C8352.m21860((C8352) this.f50229, (Throwable) this.f50227);
                break;
            default:
                C4844.m13458((C4844) this.f50229, (String) this.f50227);
                break;
        }
    }
}
