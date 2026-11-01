package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12142 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f40646;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40647 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40648 = 0;

    public C12142(String str) {
        this.f40646 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40647 != -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f40647;
        if (i == -1) {
            throw new NoSuchElementException();
        }
        while (true) {
            int i2 = this.f40648;
            String str = this.f40646;
            if (i2 < str.length()) {
                char cCharAt = str.charAt(this.f40648);
                if (cCharAt != '\n') {
                    if (cCharAt != '\r') {
                        this.f40648++;
                    } else if (this.f40648 + 1 < str.length() && str.charAt(this.f40648 + 1) == '\n') {
                        this.f40648++;
                    }
                }
                int i3 = this.f40648 + 1;
                this.f40648 = i3;
                this.f40647 = i3;
                break;
            }
            this.f40647 = -1;
            break;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
