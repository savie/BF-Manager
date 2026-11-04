package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2672 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8492 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f8493 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8494 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m8835(char c) {
        return c == ' ' || c == '\t';
    }

    public C2672(String str) {
        this.f8491 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f8494) {
            this.f8494 = true;
            int i = this.f8492;
            String str = this.f8491;
            if (i > str.length()) {
                this.f8493 = null;
            } else if (this.f8492 == str.length()) {
                int i2 = this.f8492;
                if (i2 > 0 && m8835(str.charAt(i2 - 1))) {
                    this.f8493 = "";
                    this.f8492++;
                } else {
                    this.f8493 = null;
                }
            } else if (this.f8492 == 0 && m8835(str.charAt(0))) {
                this.f8493 = "";
                while (this.f8492 < str.length() && m8835(str.charAt(this.f8492))) {
                    this.f8492++;
                }
            } else {
                int i3 = this.f8492;
                while (this.f8492 < str.length() && !m8835(str.charAt(this.f8492))) {
                    this.f8492++;
                }
                this.f8493 = str.substring(i3, this.f8492);
                while (this.f8492 < str.length() && m8835(str.charAt(this.f8492))) {
                    this.f8492++;
                }
            }
        }
        return this.f8493 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f8493;
        this.f8494 = false;
        this.f8493 = null;
        return str;
    }
}
