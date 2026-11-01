package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H52M */
/* JADX INFO: loaded from: classes2.dex */
public final class C23662 extends AbstractC13639 implements InterfaceC15208 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC10297 f76588 = EnumC10297.f35081;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f76589;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326;
    }

    public C23662(ArrayList arrayList) {
        super(f76588);
        if (arrayList == null) {
            this.f76589 = AbstractC22433.of();
        } else {
            this.f76589 = C3051.m9144(arrayList, new C10962(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC5391
    /* JADX INFO: renamed from: ܽ */
    public final List mo14955() {
        return this.f76589;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC3384, l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public final int mo5436() {
        return (this.f76589.size() * 4) + 2;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f76588.f35328;
    }
}
