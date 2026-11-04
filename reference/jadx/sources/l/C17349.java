package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A52J */
/* JADX INFO: loaded from: classes4.dex */
public class C17349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56460;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17349 m40726(String str) {
        return new C17349(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17349 m40725() {
        return new C17349(String.valueOf(','));
    }

    public C17349(String str) {
        str.getClass();
        this.f56460 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40729(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m40727(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f56460);
                    sb.append(m40727(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40728(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        m40729(sb, it);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence m40727(Object obj) {
        C17359.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
