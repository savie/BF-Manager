package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3213 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12005;

    public /* synthetic */ C3213(int i, int i2) {
        this.f12004 = i2;
        this.f12005 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f12004;
        int i2 = this.f12005;
        switch (i) {
            case 0:
                return String.format("MethodParametersAttr[%d]", Integer.valueOf(i2));
            default:
                return C8479.m22141(i2, "wr.pool:size=");
        }
    }
}
