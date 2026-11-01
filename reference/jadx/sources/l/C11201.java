package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f37917;

    public C11201(C3543 c3543) {
        int iM25062 = c3543.m25062();
        int iM25057 = c3543.m25057();
        this.f37916 = 0;
        this.f37917 = new Object[iM25062];
        this.f37915 = iM25057;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m28137() {
        synchronized (this.f37917) {
            if (this.f37916 > 0) {
                int i = 0;
                while (true) {
                    Object[] objArr = this.f37917;
                    if (i >= objArr.length) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (obj != null) {
                        byte[] bArr = (byte[]) obj;
                        objArr[i] = null;
                        this.f37916--;
                        return bArr;
                    }
                    i++;
                }
            }
            return new byte[this.f37915];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28136(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = 0;
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.f37917) {
            if (this.f37916 < this.f37917.length) {
                while (true) {
                    Object[] objArr = this.f37917;
                    if (i >= objArr.length) {
                        break;
                    }
                    if (objArr[i] == null) {
                        objArr[i] = bArr;
                        this.f37916++;
                        return;
                    }
                    i++;
                }
            }
        }
    }
}
