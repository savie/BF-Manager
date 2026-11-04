package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18283 extends AbstractC14425 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f59629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f59630;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC8639 f59631;

    public C18283(int i, String str, Collection collection) {
        this.f59629 = i;
        this.f59630 = str;
        this.f59631 = C7842.m21366(collection);
    }

    @Override // l.InterfaceC7886
    public final int getVisibility() {
        return this.f59629;
    }

    @Override // l.InterfaceC7886
    public final String getType() {
        return this.f59630;
    }

    @Override // l.InterfaceC7886
    public final Set getElements() {
        return this.f59631;
    }
}
