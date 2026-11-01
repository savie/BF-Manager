package org.bouncycastle.pqc.crypto.mldsa;

import l.C15489;
import l.C9023;

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
        String strM37076 = "[";
        int i = 0;
        while (i < this.matrix.length) {
            StringBuilder sbM23356 = C9023.m23356(strM37076 + "Outer Matrix " + i + " [");
            sbM23356.append(this.matrix[i].toString());
            String string = sbM23356.toString();
            strM37076 = i == this.matrix.length + (-1) ? C15489.m37076(string, "]\n") : C15489.m37076(string, "],\n");
            i++;
        }
        return C15489.m37076(strM37076, "]\n");
    }
}
