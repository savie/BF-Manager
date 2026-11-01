package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10359 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f35505;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f35506 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35507;

    public C10359(C9654 c9654) {
        this.f35505 = c9654;
        this.f35507 = c9654.f32458.m45743();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35506 < this.f35505.f32458.m45741();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35507;
        C9654 c9654 = this.f35505;
        int iMo9809 = c9654.mo9809(i);
        int i2 = this.f35507 + 4;
        this.f35507 = i2;
        c9654.m5856(i2, iMo9809, Charset.forName("US-ASCII"));
        int i3 = this.f35507 + iMo9809 + 4;
        this.f35507 = i3;
        int iMo98010 = c9654.mo9809(i3);
        this.f35507 += 4;
        c9654.m24553();
        byte[] bArrM5857 = c9654.m5857();
        int i4 = iMo98010 + c9654.f32458.f65662;
        if (c9654.m24553() >= 75) {
            this.f35507 += 4;
        }
        if (c9654.m24553() >= 73) {
            this.f35507 += 4;
        }
        if (c9654.m24553() >= 131) {
            this.f35507 += 4;
        }
        if (c9654.m24553() >= 127) {
            this.f35507 += 4;
        }
        if (c9654.m24553() >= 135) {
            this.f35507 += 8;
        }
        if (c9654.m24553() < 75) {
            this.f35507 = (c9654.mo9809(i4 + 96) * 4) + this.f35507;
        }
        this.f35506++;
        return new C16004(bArrM5857, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
