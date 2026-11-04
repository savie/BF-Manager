package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩻ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes.dex */
public final class C24853 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m55382(C4208 c4208) {
        boolean z;
        try {
            try {
                c4208.m13438();
                z = false;
                try {
                    C25378.f81932.getClass();
                    return C25378.m56738(c4208);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C19300.f62377;
                    }
                    throw new C7367(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C18378 e3) {
            throw new C7367(e3);
        } catch (IOException e4) {
            throw new C8113(e4);
        } catch (NumberFormatException e5) {
            throw new C7367(e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Writer m55381(StringBuilder sb) {
        return new C11426(sb);
    }
}
