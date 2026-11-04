package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C22342 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f72318 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f72319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72320;

    public C22342(C3696 c3696) {
        this.f72319 = c3696;
        this.f72320 = c3696.f12704.m37379();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72318 < this.f72319.f12704.m37377();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f72320;
        C3696 c3696 = this.f72319;
        int iMo8719 = c3696.mo8719(i);
        int i2 = this.f72320 + 4;
        this.f72320 = i2;
        c3696.m11964(i2, iMo8719, Charset.forName("US-ASCII"));
        int i3 = this.f72320 + iMo8719 + 4;
        this.f72320 = i3;
        int iMo87110 = c3696.mo8719(i3);
        this.f72320 += 4;
        c3696.m12012();
        byte[] bArrM11965 = c3696.m11965();
        int i4 = iMo87110 + c3696.f12704.f50759;
        if (c3696.m12012() >= 75) {
            this.f72320 += 4;
        }
        if (c3696.m12012() >= 73) {
            this.f72320 += 4;
        }
        if (c3696.m12012() >= 131) {
            this.f72320 += 4;
        }
        if (c3696.m12012() >= 127) {
            this.f72320 += 4;
        }
        if (c3696.m12012() >= 135) {
            this.f72320 += 8;
        }
        if (c3696.m12012() < 75) {
            this.f72320 = (c3696.mo8719(i4 + 96) * 4) + this.f72320;
        }
        this.f72318++;
        return new C20104(bArrM11965, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
