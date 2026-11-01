package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2LA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1370 extends AbstractC9445 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Pattern f5739;

    public C1370(Pattern pattern) {
        pattern.getClass();
        this.f5739 = pattern;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22538 m4816(CharSequence charSequence) {
        return new C22538(this.f5739.matcher(charSequence));
    }

    public final String toString() {
        return this.f5739.toString();
    }
}
