package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩷ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20695 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final int mo10037(AbstractC9032 abstractC9032) {
        C15757 c15757 = (C15757) abstractC9032;
        if (c15757.f63981 == null) {
            m46546(c15757);
        }
        return c15757.f63981.length;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C15757 c15757 = (C15757) abstractC9032;
        if (c15757.f63981 == null) {
            m46546(c15757);
        }
        c15382.write(c15757.f63981);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46546(C15757 c15757) {
        String str = c15757.f51061;
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
        c15757.f63981 = byteArrayOutputStream.toByteArray();
    }
}
