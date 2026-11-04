package l;

import android.net.Uri;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۗ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3757 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f12876 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f12877;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13057 m12196(ActivityC15913 activityC15913, AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386) {
        long jLongValue;
        C17359.requireNonNull(abstractC7629);
        C17359.requireNonNull(interfaceC2386);
        if ((abstractC7629 instanceof C11969) || (abstractC7629 instanceof C21929)) {
            AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
            String name = interfaceC2386.getName();
            C17359.requireNonNull(abstractC22044Mo8093);
            C17359.requireNonNull(name);
            if (!abstractC22044Mo8093.mo42886()) {
                return new C11960(abstractC22044Mo8093, C1402.m5125(abstractC22044Mo8093, new StringBuilder("mfile:")), name);
            }
            Uri uriMo42888 = abstractC22044Mo8093.mo42888();
            C17359.requireNonNull(uriMo42888);
            if (!"content".equals(uriMo42888.getScheme())) {
                throw new IllegalArgumentException("Expected a content URI");
            }
            return new C25387("uri:" + uriMo42888, name, new C22965(uriMo42888), uriMo42888);
        }
        if (!(abstractC7629 instanceof C24320) && !(abstractC7629 instanceof C17036) && !(abstractC7629 instanceof AbstractC18881) && !(abstractC7629 instanceof C11312) && !(abstractC7629 instanceof C9577) && !(abstractC7629 instanceof C12276)) {
            throw new IllegalArgumentException("Unsupported gallery visitor");
        }
        WeakHashMap weakHashMap = f12876;
        synchronized (weakHashMap) {
            Long lValueOf = (Long) weakHashMap.get(abstractC7629);
            if (lValueOf == null) {
                long j = f12877 + 1;
                f12877 = j;
                lValueOf = Long.valueOf(j);
                weakHashMap.put(abstractC7629, lValueOf);
            }
            jLongValue = lValueOf.longValue();
        }
        StringBuilder sbM8289 = C2458.m8289("visitor:", ":", jLongValue);
        sbM8289.append(interfaceC2386.getPath());
        return new C17927(abstractC7629, interfaceC2386, sbM8289.toString(), interfaceC2386.getName(), interfaceC2386.getPath(), new WeakReference(activityC15913));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12197(StringBuilder sb, AbstractC7629 abstractC7629) throws IOException {
        if (abstractC7629 instanceof C24320) {
            m12198(((C24320) abstractC7629).m54371(), sb);
            return;
        }
        if (abstractC7629 instanceof C17036) {
            Iterator it = ((C17036) abstractC7629).m40146().iterator();
            while (it.hasNext()) {
                m12198((AbstractC22044) it.next(), sb);
            }
        } else if (abstractC7629 instanceof C11312) {
            m12198(((C11312) abstractC7629).m28593(), sb);
        } else if (abstractC7629 instanceof C9577) {
            m12198(((C9577) abstractC7629).m25012(), sb);
        } else if (abstractC7629 instanceof C12276) {
            m12198(((C12276) abstractC7629).m30659(), sb);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12198(AbstractC22044 abstractC22044, StringBuilder sb) throws IOException {
        if (!abstractC22044.mo4304()) {
            throw new IOException("Image container is no longer a regular file");
        }
        String strMo4294 = abstractC22044.mo4294();
        sb.append('|');
        sb.append(strMo4294.length());
        sb.append(':');
        sb.append(strMo4294);
        sb.append(':');
        sb.append(abstractC22044.mo4285());
        sb.append(':');
        sb.append(abstractC22044.mo4286());
    }
}
