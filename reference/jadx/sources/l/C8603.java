package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۡۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8603 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22380(Bundle bundle, String str) {
        return bundle.containsKey(str) || bundle.containsKey(str.concat("Path"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m22381(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return byteArray;
        }
        String string = bundle.getString(str.concat("Path"));
        if (string == null) {
            throw new IllegalArgumentException("Missing memory view state");
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(string, new String[0]);
        try {
            return abstractC20745M15313.m46727();
        } catch (IOException e) {
            if (abstractC20745M15313.mo33975()) {
                throw new UncheckedIOException(e);
            }
            return null;
        }
    }
}
