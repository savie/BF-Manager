package l;

import android.content.Context;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8156 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f26910;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f26911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26912;

    public /* synthetic */ C8156(boolean[] zArr, View view, AbstractActivityC17204 abstractActivityC17204) {
        this.f26910 = zArr;
        this.f26912 = view;
        this.f26911 = abstractActivityC17204;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = C9646.m25159() && C24955.m55712() != null;
        boolean zBooleanValue = bool.booleanValue();
        boolean[] zArr = this.f26910;
        if (zBooleanValue || zArr[0] != z) {
            zArr[0] = z;
            this.f26912.setVisibility((z && C9646.m25160((Context) this.f26911, true)) ? 0 : 8);
        }
    }
}
