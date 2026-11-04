package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۚ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5921 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17233(Bundle bundle, String str) {
        return bundle.containsKey(str) || bundle.containsKey(str.concat("Path"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m17234(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return byteArray;
        }
        String string = bundle.getString(str.concat("Path"));
        if (string == null) {
            throw new IllegalArgumentException("Missing memory view state");
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(string, new String[0]);
        try {
            return abstractC22044M35193.m49865();
        } catch (IOException e) {
            if (abstractC22044M35193.mo2934()) {
                throw new UncheckedIOException(e);
            }
            return null;
        }
    }
}
