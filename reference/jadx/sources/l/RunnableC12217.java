package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12217 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40837;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40838;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40839;

    public /* synthetic */ RunnableC12217(int i, Object obj, Object obj2) {
        this.f40838 = i;
        this.f40839 = obj;
        this.f40837 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ܺ᩻ۙ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40838) {
            case 0:
                DialogInterfaceOnClickListenerC8128.m21402((DialogInterfaceOnClickListenerC8128) this.f40839, (TextView) this.f40837);
                break;
            case 1:
                C21200 c21200 = (C21200) this.f40839;
                this.f40837.mo2581(c21200.f69000, c21200.f69001);
                break;
            case 2:
                ((InterfaceC1008) this.f40839).accept(this.f40837);
                break;
            default:
                C23186.m51188((C13308) this.f40839, (ArrayList) this.f40837);
                break;
        }
    }
}
