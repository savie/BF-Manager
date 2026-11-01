package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes3.dex */
public class C8526 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char f29515 = (char) C1238.m4435(1, 0, 1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f29516 = 1;

    public final char getLast() {
        return this.f29515;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9937(this.f29515, this.f29516);
    }
}
