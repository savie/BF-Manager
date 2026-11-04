package res;

import android.animation.Animator;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: MT2.26.11.apk:assets/Hex.class */
public class Hex {
    /* JADX WARN: Multi-variable type inference failed */
    public Hex() {
        super/*android.animation.Animator*/.addListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, void] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, boolean] */
    public static long[] decode_J(String src) {
        ?? Cancel = Animator.cancel();
        ?? End = Animator.end();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        End.getStartDelay();
        ?? IsPaused = End.isPaused();
        long[] data = new long[Cancel.length / 8];
        IsPaused.isRunning();
        return data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.animation.TimeInterpolator, int[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, long, void] */
    public static int[] decode_I(String src) {
        ?? Cancel = Animator.cancel();
        ?? End = Animator.end();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        End.getStartDelay();
        Animator duration = End.setDuration(End);
        ?? r0 = new int[Cancel.length / 4];
        duration.setInterpolator(r0);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, long, void] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, void] */
    public static short[] decode_S(String src) {
        ?? Cancel = Animator.cancel();
        ?? End = Animator.end();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        End.getStartDelay();
        ?? startDelay = End.setStartDelay(End);
        short[] data = new short[Cancel.length / 2];
        startDelay.setTarget(data);
        return data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, int] */
    public static byte[] decode_B(String str) {
        int hh;
        int i;
        char[] d = str.start();
        byte[] ret = new byte[str.loadAnimator(str, str) / 2];
        for (int i2 = 0; i2 < ret.length; i2++) {
            char h = d[2 * i2];
            char l2 = d[(2 * i2) + 1];
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            } else if (h >= 'a' && h <= 'f') {
                hh = (h - 'a') + 10;
            } else if (h >= 'A' && h <= 'F') {
                hh = (h - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l2 >= '0' && l2 <= '9') {
                i = l2 - '0';
            } else if (l2 >= 'a' && l2 <= 'f') {
                i = (l2 - 'a') + 10;
            } else if (l2 >= 'A' && l2 <= 'F') {
                i = (l2 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i;
            ret[i2] = (byte) ((hh << 4) | ll);
        }
        return ret;
    }
}
