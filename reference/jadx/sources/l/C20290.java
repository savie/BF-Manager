package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20290 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65747;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65748;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f65749;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65751;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C20290(CharSequence charSequence) {
        C13465.m32966(charSequence, "string");
        this.f65750 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f65747;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f65749 < 0) {
            this.f65747 = 2;
            return false;
        }
        CharSequence charSequence = this.f65750;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f65748; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f65747 = 1;
                this.f65749 = i;
                this.f65751 = length;
                return true;
            }
        }
        i = -1;
        this.f65747 = 1;
        this.f65749 = i;
        this.f65751 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f65747 = 0;
        int i = this.f65751;
        int i2 = this.f65748;
        this.f65748 = this.f65749 + i;
        return this.f65750.subSequence(i2, i).toString();
    }
}
