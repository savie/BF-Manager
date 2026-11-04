package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: CIW6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10791 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Bundle m27503(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(C14442.m34865("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
