package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3387 implements Iterator {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12512;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12511 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f12510 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12513 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10050(char c) {
        return c == ' ' || c == '\t';
    }

    public C3387(String str) {
        this.f12512 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12513) {
            this.f12513 = true;
            int i = this.f12511;
            String str = this.f12512;
            if (i > str.length()) {
                this.f12510 = null;
            } else if (this.f12511 == str.length()) {
                int i2 = this.f12511;
                if (i2 > 0 && m10050(str.charAt(i2 - 1))) {
                    this.f12510 = "";
                    this.f12511++;
                } else {
                    this.f12510 = null;
                }
            } else if (this.f12511 == 0 && m10050(str.charAt(0))) {
                this.f12510 = "";
                while (this.f12511 < str.length() && m10050(str.charAt(this.f12511))) {
                    this.f12511++;
                }
            } else {
                int i3 = this.f12511;
                while (this.f12511 < str.length() && !m10050(str.charAt(this.f12511))) {
                    this.f12511++;
                }
                this.f12510 = str.substring(i3, this.f12511);
                while (this.f12511 < str.length() && m10050(str.charAt(this.f12511))) {
                    this.f12511++;
                }
            }
        }
        return this.f12510 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f12510;
        this.f12513 = false;
        this.f12510 = null;
        return str;
    }
}
