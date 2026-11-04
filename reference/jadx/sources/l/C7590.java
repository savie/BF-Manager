package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7590 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f25067;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f25068;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f25069;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25070;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25071;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C7590(CharSequence charSequence) {
        C15243.m36590(charSequence, "string");
        this.f25067 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f25070;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f25069 < 0) {
            this.f25070 = 2;
            return false;
        }
        CharSequence charSequence = this.f25067;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f25068; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f25070 = 1;
                this.f25069 = i;
                this.f25071 = length;
                return true;
            }
        }
        i = -1;
        this.f25070 = 1;
        this.f25069 = i;
        this.f25071 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25070 = 0;
        int i = this.f25071;
        int i2 = this.f25068;
        this.f25068 = this.f25069 + i;
        return this.f25067.subSequence(i2, i).toString();
    }
}
