package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩵ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2E0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20306 extends AbstractC3152 {
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo24271(int i, StringWriter stringWriter);

    @Override // l.AbstractC3152
    /* JADX INFO: renamed from: ۙ */
    public final int mo3683(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo24271(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
