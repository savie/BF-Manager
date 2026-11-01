package l;

import android.net.Uri;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۖۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f9761 = new WeakHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long f9762;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1886 m7432(ActivityC15481 activityC15481, AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557) {
        long jLongValue;
        C13638.requireNonNull(abstractC9677);
        C13638.requireNonNull(interfaceC2557);
        if ((abstractC9677 instanceof C21611) || (abstractC9677 instanceof C14619)) {
            AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
            String name = interfaceC2557.getName();
            C13638.requireNonNull(abstractC20745Mo7989);
            C13638.requireNonNull(name);
            if (!abstractC20745Mo7989.mo40126()) {
                return new C1514(abstractC20745Mo7989, C17922.m41615(abstractC20745Mo7989, new StringBuilder("mfile:")), name);
            }
            Uri uriMo40127 = abstractC20745Mo7989.mo40127();
            C13638.requireNonNull(uriMo40127);
            if (!"content".equals(uriMo40127.getScheme())) {
                throw new IllegalArgumentException("Expected a content URI");
            }
            return new C9277("uri:" + uriMo40127, name, new C22383(uriMo40127), uriMo40127);
        }
        if (!(abstractC9677 instanceof C8289) && !(abstractC9677 instanceof C21920) && !(abstractC9677 instanceof AbstractC12233) && !(abstractC9677 instanceof C5445) && !(abstractC9677 instanceof C14865) && !(abstractC9677 instanceof C8809)) {
            throw new IllegalArgumentException("Unsupported gallery visitor");
        }
        WeakHashMap weakHashMap = f9761;
        synchronized (weakHashMap) {
            Long lValueOf = (Long) weakHashMap.get(abstractC9677);
            if (lValueOf == null) {
                long j = f9762 + 1;
                f9762 = j;
                lValueOf = Long.valueOf(j);
                weakHashMap.put(abstractC9677, lValueOf);
            }
            jLongValue = lValueOf.longValue();
        }
        StringBuilder sbM39970 = C17114.m39970("visitor:", ":", jLongValue);
        sbM39970.append(interfaceC2557.getPath());
        return new C4564(abstractC9677, interfaceC2557, sbM39970.toString(), interfaceC2557.getName(), interfaceC2557.getPath(), new WeakReference(activityC15481));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7433(StringBuilder sb, AbstractC9677 abstractC9677) throws IOException {
        if (abstractC9677 instanceof C8289) {
            m7434(((C8289) abstractC9677).m21723(), sb);
            return;
        }
        if (abstractC9677 instanceof C21920) {
            Iterator it = ((C21920) abstractC9677).m48743().iterator();
            while (it.hasNext()) {
                m7434((AbstractC20745) it.next(), sb);
            }
        } else if (abstractC9677 instanceof C5445) {
            m7434(((C5445) abstractC9677).m15083(), sb);
        } else if (abstractC9677 instanceof C14865) {
            m7434(((C14865) abstractC9677).m35542(), sb);
        } else if (abstractC9677 instanceof C8809) {
            m7434(((C8809) abstractC9677).m22931(), sb);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7434(AbstractC20745 abstractC20745, StringBuilder sb) throws IOException {
        if (!abstractC20745.mo33971()) {
            throw new IOException("Image container is no longer a regular file");
        }
        String strMo33986 = abstractC20745.mo33986();
        sb.append('|');
        sb.append(strMo33986.length());
        sb.append(':');
        sb.append(strMo33986);
        sb.append(':');
        sb.append(abstractC20745.mo33964());
        sb.append(':');
        sb.append(abstractC20745.mo33991());
    }
}
