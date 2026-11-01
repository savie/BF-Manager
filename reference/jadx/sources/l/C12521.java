package l;

import android.content.Context;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12521 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f41887;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f41888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f41889;

    public /* synthetic */ C12521(boolean[] zArr, View view, AbstractActivityC12483 abstractActivityC12483) {
        this.f41888 = zArr;
        this.f41889 = view;
        this.f41887 = abstractActivityC12483;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = C23810.m52472() && C17506.m40774() != null;
        boolean zBooleanValue = bool.booleanValue();
        boolean[] zArr = this.f41888;
        if (zBooleanValue || zArr[0] != z) {
            zArr[0] = z;
            this.f41889.setVisibility((z && C23810.m52473((Context) this.f41887, true)) ? 0 : 8);
        }
    }
}
