package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A52J */
/* JADX INFO: loaded from: classes3.dex */
public class C13366 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13366 m32865(String str) {
        return new C13366(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13366 m32864() {
        return new C13366(String.valueOf(','));
    }

    public C13366(String str) {
        str.getClass();
        this.f44291 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32868(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m32866(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f44291);
                    sb.append(m32866(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32867(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        m32868(sb, it);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence m32866(Object obj) {
        C13638.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
