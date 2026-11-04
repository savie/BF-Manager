package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14692 implements Iterator {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f48014;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48013 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48015 = 0;

    public C14692(String str) {
        this.f48014 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48013 != -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f48013;
        if (i == -1) {
            throw new NoSuchElementException();
        }
        while (true) {
            int i2 = this.f48015;
            String str = this.f48014;
            if (i2 < str.length()) {
                char cCharAt = str.charAt(this.f48015);
                if (cCharAt != '\n') {
                    if (cCharAt != '\r') {
                        this.f48015++;
                    } else if (this.f48015 + 1 < str.length() && str.charAt(this.f48015 + 1) == '\n') {
                        this.f48015++;
                    }
                }
                int i3 = this.f48015 + 1;
                this.f48015 = i3;
                this.f48013 = i3;
                break;
            }
            this.f48013 = -1;
            break;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
