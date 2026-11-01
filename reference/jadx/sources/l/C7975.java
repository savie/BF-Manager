package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.۠ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7975 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1810 m21041(C5379 c5379) {
        boolean z;
        try {
            try {
                c5379.m14916();
                z = false;
                try {
                    return (AbstractC1810) C15613.f50774.mo1571(c5379);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C3221.f12023;
                    }
                    throw new C22003(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C13141 e3) {
            throw new C22003(e3);
        } catch (IOException e4) {
            throw new C9573(e4);
        } catch (NumberFormatException e5) {
            throw new C22003(e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Writer m21040(StringBuilder sb) {
        return new C18558(sb);
    }
}
