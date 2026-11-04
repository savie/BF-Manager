package l;

import android.graphics.Paint;
import com.umeng.analytics.pro.am;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۡ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[][] f30459 = {new char[]{768, 4351}, new char[]{4864, 5119}, new char[]{5888, 7679}, new char[]{8192, 8447}, new char[]{11264, 11775}, new char[]{12288, 12543}, new char[]{42496, 42751}, new char[]{43008, 44031}, new char[]{63168, 63183}, new char[]{64272, 64287}, new char[]{65024, 65069}};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static BitSet f30460;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static BitSet f30461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m24707() {
        if (f30461 != null) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setTextSize(C21576.m49055().getDisplayMetrics().scaledDensity * 15.0f);
        float fMeasureText = paint.measureText(am.av) * 1.1f;
        char[] cArr = new char[20];
        CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
        BitSet bitSet = new BitSet(64302);
        BitSet bitSet2 = new BitSet(64302);
        char[][] cArr2 = f30459;
        for (int i = 0; i < 11; i++) {
            char[] cArr3 = cArr2[i];
            char c = cArr3[1];
            for (char c2 = cArr3[0]; c2 <= c; c2 = (char) (c2 + 1)) {
                if (charsetEncoderNewEncoder.canEncode(c2)) {
                    Arrays.fill(cArr, c2);
                    cArr[0] = 'a';
                    if (paint.measureText(cArr, 0, 20) < fMeasureText) {
                        int i2 = c2 - 768;
                        bitSet.set(i2);
                        if (paint.measureText(cArr, 1, 1) > 0.0f) {
                            bitSet2.set(i2);
                        }
                    }
                }
            }
        }
        f30461 = bitSet;
        f30460 = bitSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24704() {
        BitSet bitSet = new BitSet(0);
        f30460 = bitSet;
        f30461 = bitSet;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m24706(int i) {
        if (i < 768 || i > 65069) {
            return false;
        }
        BitSet bitSet = f30461;
        if (bitSet == null) {
            m24707();
            bitSet = f30461;
        }
        return bitSet.get(i - 768);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m24708(int i) {
        if (i < 768 || i > 1023) {
            return false;
        }
        BitSet bitSet = f30461;
        if (bitSet == null) {
            m24707();
            bitSet = f30461;
        }
        return bitSet.get(i - 768);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24705(int i) {
        if (i < 768 || i > 65069) {
            return false;
        }
        return f30460.get(i - 768);
    }
}
