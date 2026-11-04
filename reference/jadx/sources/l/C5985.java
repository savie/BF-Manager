package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f20499;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f20500;

    public C5985(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f20499 = bArr;
        this.f20500 = bArr3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] m17418() {
        return (byte[]) this.f20499;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] m17416() {
        return (byte[]) this.f20500;
    }

    public C5985(C16646 c16646, int i, int i2, int i3, int i4) {
        this.f20499 = new C2256(c16646, i, i3, i4);
        this.f20500 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m17414(AbstractC18884 abstractC18884) {
        ((C2256) this.f20499).m7679(abstractC18884);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18884 m17413(int i) {
        C2256 c2256 = (C2256) this.f20499;
        if (i >= c2256.m7682() || i < 0) {
            return null;
        }
        return c2256.m7677(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m17419() {
        return ((C2256) this.f20499).m7682();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m17415(C21122 c21122) {
        ((C2256) this.f20499).m7680(c21122);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m17417(AbstractC18884 abstractC18884) {
        ((ArrayList) this.f20500).add(abstractC18884);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2256 m17412() {
        C2256 c2256 = (C2256) this.f20499;
        ArrayList arrayList = (ArrayList) this.f20500;
        if (arrayList == null) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c2256.m7679((AbstractC18884) ((ArrayList) this.f20500).get(i));
        }
        this.f20500 = null;
        return c2256;
    }
}
