package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21769 implements InterfaceC13303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70537 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18241 f70538;

    public C21769(C18241 c18241) {
        this.f70538 = c18241;
    }

    @Override // l.InterfaceC13303
    public final boolean hasNext() {
        return this.f70537 < this.f70538.f58230.size();
    }

    @Override // l.InterfaceC13303
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4129 c4129 = this.f70538.f58230;
        int i = this.f70537;
        this.f70537 = i + 1;
        return c4129.get(i);
    }
}
