package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8VV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4088 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11629(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
