package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H52M */
/* JADX INFO: loaded from: classes5.dex */
public final class C16352 extends AbstractC24319 implements InterfaceC0846 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC22631 f53091 = EnumC22631.f73383;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f53092;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509;
    }

    public C16352(ArrayList arrayList) {
        super(f53091);
        if (arrayList == null) {
            this.f53092 = AbstractC1928.of();
        } else {
            this.f53092 = C4583.m14373(arrayList, new C17844(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC14379
    /* JADX INFO: renamed from: ֡ */
    public final List mo20143() {
        return this.f53092;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC12384, l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public final int mo3033() {
        return (this.f53092.size() * 4) + 2;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f53091.f73508;
    }
}
