package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 359P */
/* JADX INFO: loaded from: classes3.dex */
public final class C3762 extends AbstractC10892 implements InterfaceC14948 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC8639 f12884;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f12885;

    public C3762(String str, Collection collection) {
        this.f12885 = str;
        this.f12884 = C7842.m21366(collection);
    }

    @Override // l.InterfaceC15299
    public final String getType() {
        return this.f12885;
    }

    @Override // l.InterfaceC15299
    public final Set getElements() {
        return this.f12884;
    }
}
