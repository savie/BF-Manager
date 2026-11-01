package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩴۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18550 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14504 f59018;

    public /* synthetic */ C18550(AbstractC14504 abstractC14504, int i) {
        this.f59017 = i;
        this.f59018 = abstractC14504;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f59017;
        AbstractC14504 abstractC14504 = this.f59018;
        switch (i) {
            case 0:
                C17139 c17139 = (C17139) abstractC14504;
                return String.format(" stack_map_entry:pc=%d numloc=%s  numstack=%s", Integer.valueOf(c17139.f54657), C18755.m43308(c17139.f54664), C18755.m43308(c17139.f54661));
            default:
                C10063 c10063 = (C10063) abstractC14504;
                return c10063.f47512.m27823(c10063.f34387).mo2278();
        }
    }
}
