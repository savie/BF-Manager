package l;

import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15311 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50051;

    public /* synthetic */ C15311(int i, Object obj) {
        this.f50050 = i;
        this.f50051 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f50050) {
            case 0:
                ((TextView) this.f50051).setTextColor(((Integer) obj).intValue());
                break;
            default:
                C19206.m44511((C19206) this.f50051, (List) obj);
                break;
        }
    }
}
