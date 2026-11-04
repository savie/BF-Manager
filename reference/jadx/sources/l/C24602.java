package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IS */
/* JADX INFO: loaded from: classes.dex */
public final class C24602 extends AbstractC14425 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21530 f79698;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f79699;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f79700 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f79701;

    public C24602(int i, C21530 c21530, AbstractC8639 abstractC8639) {
        this.f79699 = i;
        this.f79698 = c21530;
        this.f79701 = abstractC8639;
    }

    @Override // l.InterfaceC7886
    public final int getVisibility() {
        return this.f79699;
    }

    @Override // l.InterfaceC7886
    public final String getType() {
        return this.f79698.f68791.f12443;
    }

    @Override // l.InterfaceC7886
    public final Set getElements() {
        return this.f79701;
    }
}
