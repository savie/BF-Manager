package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 67O2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18537 extends Exception {
    public C18537(String str) {
        this(AbstractC22433.of((Object) C7908.m20923(str)));
    }

    public C18537(Iterable iterable) {
        super(((C7908) iterable.iterator().next()).toString());
        AbstractC22433.m49797(iterable);
    }

    static {
        Pattern.compile("\\R");
    }
}
