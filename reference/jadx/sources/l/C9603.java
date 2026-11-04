package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۡ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9603 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m25077(String str) {
        try {
            C4208 c4208 = new C4208(new StringReader(str));
            AbstractC0655 abstractC0655M25078 = m25078(c4208);
            abstractC0655M25078.getClass();
            if (!(abstractC0655M25078 instanceof C19300) && c4208.m13438() != EnumC14648.END_DOCUMENT) {
                throw new C7367("Did not consume the entire document.");
            }
            return abstractC0655M25078;
        } catch (C18378 e) {
            e = e;
            throw new C7367(e);
        } catch (IOException e2) {
            throw new C8113(e2);
        } catch (NumberFormatException e3) {
            e = e3;
            throw new C7367(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m25078(C4208 c4208) {
        EnumC19805 enumC19805M13450 = c4208.m13450();
        if (enumC19805M13450 == EnumC19805.LEGACY_STRICT) {
            c4208.m13442(EnumC19805.LENIENT);
        }
        try {
            try {
                AbstractC0655 abstractC0655M55382 = C24853.m55382(c4208);
                c4208.m13442(enumC19805M13450);
                return abstractC0655M55382;
            } catch (Throwable th) {
                c4208.m13442(enumC19805M13450);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new C1401("Failed parsing JSON source: " + c4208 + " to Json", e);
        }
    }
}
