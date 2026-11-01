package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9565 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14504 f32267;

    public /* synthetic */ C9565(AbstractC14504 abstractC14504, int i) {
        this.f32266 = i;
        this.f32267 = abstractC14504;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f32266;
        AbstractC14504 abstractC14504 = this.f32267;
        switch (i) {
            case 0:
                C5061 c5061 = (C5061) abstractC14504;
                Integer numValueOf = Integer.valueOf(c5061.f47516);
                int i2 = c5061.f47516;
                EnumC0554 enumC0554 = EnumC0554.METHOD;
                int i3 = 8;
                return String.format("MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s", numValueOf, EnumC23839.m52538(i2, enumC0554).isEmpty() ? "<none>" : Boolean.valueOf(EnumC23839.m52538(c5061.f47516, enumC0554).isEmpty()), Integer.valueOf(c5061.f17658), ((C3980) c5061.f47511).f47512.m27826(c5061.f17658, new C21745(i3)), Integer.valueOf(c5061.f17652), ((C3980) c5061.f47511).f47512.m27826(c5061.f17652, new C21745(i3)));
            default:
                C17139 c17139 = (C17139) abstractC14504;
                return String.format(" chop_frame=%d offset=%d", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671));
        }
    }
}
