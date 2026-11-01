package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5675 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19354;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19355;

    public /* synthetic */ C5675(int i, Object obj) {
        this.f19354 = i;
        this.f19355 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f19354) {
            case 0:
                return C22609.m50120((C18375) this.f19355);
            default:
                return ((C8872[]) this.f19355)[0];
        }
    }
}
