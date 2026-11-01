package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۨۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: LAZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11420 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1810 m28526(String str) {
        try {
            C5379 c5379 = new C5379(new StringReader(str));
            AbstractC1810 abstractC1810M28527 = m28527(c5379);
            abstractC1810M28527.getClass();
            if (!(abstractC1810M28527 instanceof C3221) && c5379.m14916() != EnumC22313.END_DOCUMENT) {
                throw new C22003("Did not consume the entire document.");
            }
            return abstractC1810M28527;
        } catch (C13141 e) {
            e = e;
            throw new C22003(e);
        } catch (IOException e2) {
            throw new C9573(e2);
        } catch (NumberFormatException e3) {
            e = e3;
            throw new C22003(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1810 m28527(C5379 c5379) {
        EnumC14948 enumC14948M14923 = c5379.m14923();
        if (enumC14948M14923 == EnumC14948.LEGACY_STRICT) {
            c5379.m14914(EnumC14948.LENIENT);
        }
        try {
            try {
                AbstractC1810 abstractC1810M21041 = C7975.m21041(c5379);
                c5379.m14914(enumC14948M14923);
                return abstractC1810M21041;
            } catch (Throwable th) {
                c5379.m14914(enumC14948M14923);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new C13537("Failed parsing JSON source: " + c5379 + " to Json", e);
        }
    }
}
