package org.bouncycastle.pqc.crypto.mldsa;

import l.C14483;
import l.C3188;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecL {
    public final Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public PolyVecL(MLDSAEngine mLDSAEngine) {
        int dilithiumL = mLDSAEngine.getDilithiumL();
        this.vec = new Poly[dilithiumL];
        for (int i = 0; i < dilithiumL; i++) {
            this.vec[i] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).addPoly(polyVecL.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.vec.length; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void copyTo(PolyVecL polyVecL) {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].copyTo(polyVecL.vec[i]);
            i++;
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyNtt();
            i++;
        }
    }

    public void reduce() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public String toString() {
        String strM34972 = "\n[";
        for (int i = 0; i < this.vec.length; i++) {
            strM34972 = strM34972 + "Inner Matrix " + i + " " + getVectorIndex(i).toString();
            if (i != this.vec.length - 1) {
                strM34972 = C14483.m34972(strM34972, ",\n");
            }
        }
        return C14483.m34972(strM34972, "]");
    }

    public String toString(String str) {
        StringBuilder sbM10405 = C3188.m10405(str, ": ");
        sbM10405.append(toString());
        return sbM10405.toString();
    }

    public void uniformBlocks(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i2 >= polyArr.length) {
                return;
            }
            polyArr[i2].uniformBlocks(bArr, (short) (i + i2));
            i2++;
        }
    }

    public void uniformEta(byte[] bArr, short s) {
        int i = 0;
        while (i < this.vec.length) {
            getVectorIndex(i).uniformEta(bArr, s);
            i++;
            s = (short) (s + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).uniformGamma1(bArr, (short) ((this.vec.length * s) + i));
        }
    }
}
