package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23206 implements InterfaceC11271 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75187 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3068 f75188;

    public C23206(C3068 c3068) {
        this.f75188 = c3068;
    }

    @Override // l.InterfaceC11271
    public final boolean hasNext() {
        return this.f75187 < this.f75188.f9946.size();
    }

    @Override // l.InterfaceC11271
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C24698 c24698 = this.f75188.f9946;
        int i = this.f75187;
        this.f75187 = i + 1;
        return c24698.get(i);
    }
}
