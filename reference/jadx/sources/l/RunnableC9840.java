package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9840 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31676;

    public /* synthetic */ RunnableC9840(int i, Object obj, Object obj2) {
        this.f31674 = i;
        this.f31676 = obj;
        this.f31675 = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۚۡۙ] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31674;
        ?? r1 = this.f31675;
        Object obj = this.f31676;
        switch (i) {
            case 0:
                InterfaceC16793 interfaceC16793 = (InterfaceC16793) obj;
                C17539 c17539 = (C17539) r1;
                interfaceC16793.mo13592(c17539.f57014, c17539.f57015);
                interfaceC16793.mo13595();
                break;
            case 1:
                C12994 c12994 = (C12994) obj;
                r1.mo7204(c12994.f41644, c12994.f41645);
                break;
            case 2:
                int i2 = C5653.f19521;
                ((AbstractC22044) obj).mo2942(((AbstractC6662) r1).m18627());
                break;
            case 3:
                ((TextView) obj).setText(C25176.m56095((ArrayList) r1));
                break;
            default:
                ActivityC9458.m24836((ActivityC9458) obj, (Runnable) r1);
                break;
        }
    }
}
