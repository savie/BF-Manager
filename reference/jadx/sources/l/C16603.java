package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16603 extends AbstractC22571 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Pattern f53705;

    public C16603(Pattern pattern) {
        pattern.getClass();
        this.f53705 = pattern;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24809 m39287(CharSequence charSequence) {
        return new C24809(this.f53705.matcher(charSequence));
    }

    public final String toString() {
        return this.f53705.toString();
    }
}
