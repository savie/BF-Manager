package org.bouncycastle.pqc.crypto.mldsa;

import l.C10732;
import l.C14483;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecMatrix {
    public final PolyVecL[] matrix;

    public PolyVecMatrix(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.matrix = new PolyVecL[dilithiumK];
        for (int i = 0; i < dilithiumK; i++) {
            this.matrix[i] = new PolyVecL(mLDSAEngine);
        }
    }

    public void expandMatrix(byte[] bArr) {
        int i = 0;
        while (true) {
            PolyVecL[] polyVecLArr = this.matrix;
            if (i >= polyVecLArr.length) {
                return;
            }
            polyVecLArr[i].uniformBlocks(bArr, i << 8);
            i++;
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i = 0; i < this.matrix.length; i++) {
            polyVecK.getVectorIndex(i).pointwiseAccountMontgomery(this.matrix[i], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }

    private String addString() {
        String strM34972 = "[";
        int i = 0;
        while (i < this.matrix.length) {
            StringBuilder sbM27333 = C10732.m27333(strM34972 + "Outer Matrix " + i + " [");
            sbM27333.append(this.matrix[i].toString());
            String string = sbM27333.toString();
            strM34972 = i == this.matrix.length + (-1) ? C14483.m34972(string, "]\n") : C14483.m34972(string, "],\n");
            i++;
        }
        return C14483.m34972(strM34972, "]\n");
    }
}
