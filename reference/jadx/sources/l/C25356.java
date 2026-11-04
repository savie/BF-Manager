package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C25356 extends Exception {
    public C25356(String str) {
        this(AbstractC1928.of((Object) C16930.m39909(str)));
    }

    public C25356(Iterable iterable) {
        super(((C16930) iterable.iterator().next()).toString());
        AbstractC1928.m6612(iterable);
    }

    static {
        Pattern.compile("\\R");
    }
}
