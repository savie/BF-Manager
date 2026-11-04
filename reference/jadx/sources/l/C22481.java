package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩸֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JY */
/* JADX INFO: loaded from: classes.dex */
public final class C22481 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final int mo3832(AbstractC4691 abstractC4691) {
        C19497 c19497 = (C19497) abstractC4691;
        if (c19497.f49059 == null) {
            m50710(c19497);
        }
        return c19497.f49059.length;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C19497 c19497 = (C19497) abstractC4691;
        if (c19497.f49059 == null) {
            m50710(c19497);
        }
        c1180.write(c19497.f49059);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50710(C19497 c19497) {
        String str = c19497.f62936;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        byteArrayOutputStream.write((Integer.parseInt(stringTokenizer.nextToken()) * 40) + Integer.parseInt(stringTokenizer.nextToken()));
        while (stringTokenizer.hasMoreTokens()) {
            BigInteger bigInteger = new BigInteger(stringTokenizer.nextToken());
            if (bigInteger.intValue() <= 0 || bigInteger.intValue() >= 127) {
                for (int iBitLength = ((bigInteger.bitLength() / 7) + (bigInteger.bitLength() % 7 > 0 ? 1 : 0)) - 1; iBitLength >= 0; iBitLength--) {
                    byte bByteValue = (byte) (bigInteger.shiftRight(iBitLength * 7).byteValue() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                    if (iBitLength > 0) {
                        bByteValue = (byte) (bByteValue | GCMSIVBlockCipher.MASK);
                    }
                    byteArrayOutputStream.write(bByteValue);
                }
            } else {
                byteArrayOutputStream.write(bigInteger.intValue());
            }
        }
        c19497.f49059 = byteArrayOutputStream.toByteArray();
    }
}
